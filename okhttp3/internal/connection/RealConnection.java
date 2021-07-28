package okhttp3.internal.connection;

import j.d;
import j.e;
import j.l;
import j.t;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CipherSuite;
import okhttp3.Connection;
import okhttp3.ConnectionPool;
import okhttp3.ConnectionSpec;
import okhttp3.EventListener;
import okhttp3.Handshake;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http1.Http1Codec;
import okhttp3.internal.http2.ErrorCode;
import okhttp3.internal.http2.Http2Codec;
import okhttp3.internal.http2.Http2Connection;
import okhttp3.internal.http2.Http2Stream;
import okhttp3.internal.platform.Platform;
import okhttp3.internal.tls.OkHostnameVerifier;
import okhttp3.internal.ws.RealWebSocket;

public final class RealConnection extends Http2Connection.Listener implements Connection {
  private static final int MAX_TUNNEL_ATTEMPTS = 21;
  
  private static final String NPE_THROW_WITH_NULL = "throw with null exception";
  
  public int allocationLimit = 1;
  
  public final List<Reference<StreamAllocation>> allocations = new ArrayList<Reference<StreamAllocation>>();
  
  private final ConnectionPool connectionPool;
  
  private Handshake handshake;
  
  private Http2Connection http2Connection;
  
  public long idleAtNanos = Long.MAX_VALUE;
  
  public boolean noNewStreams;
  
  private Protocol protocol;
  
  private Socket rawSocket;
  
  private final Route route;
  
  private d sink;
  
  private Socket socket;
  
  private e source;
  
  public int successCount;
  
  public RealConnection(ConnectionPool paramConnectionPool, Route paramRoute) {
    this.connectionPool = paramConnectionPool;
    this.route = paramRoute;
  }
  
  private void connectSocket(int paramInt1, int paramInt2, Call paramCall, EventListener paramEventListener) {
    Socket socket;
    Proxy proxy = this.route.proxy();
    Address address = this.route.address();
    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.HTTP) {
      socket = address.socketFactory().createSocket();
    } else {
      socket = new Socket(proxy);
    } 
    this.rawSocket = socket;
    paramEventListener.connectStart(paramCall, this.route.socketAddress(), proxy);
    this.rawSocket.setSoTimeout(paramInt2);
    try {
      Platform.get().connectSocket(this.rawSocket, this.route.socketAddress(), paramInt1);
      try {
        this.source = l.a(l.b(this.rawSocket));
        this.sink = l.a(l.a(this.rawSocket));
        return;
      } catch (NullPointerException nullPointerException) {
        if (!"throw with null exception".equals(nullPointerException.getMessage()))
          return; 
        throw new IOException(nullPointerException);
      } 
    } catch (ConnectException connectException1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Failed to connect to ");
      stringBuilder.append(this.route.socketAddress());
      ConnectException connectException2 = new ConnectException(stringBuilder.toString());
      connectException2.initCause(connectException1);
      throw connectException2;
    } 
  }
  
  private void connectTls(ConnectionSpecSelector paramConnectionSpecSelector) {
    AssertionError assertionError2;
    Address address = this.route.address();
    SSLSocketFactory sSLSocketFactory = address.sslSocketFactory();
    Handshake handshake = null;
    ConnectionSpec connectionSpec = null;
    SSLSession sSLSession = null;
    try {
      SSLSocket sSLSocket = (SSLSocket)sSLSocketFactory.createSocket(this.rawSocket, address.url().host(), address.url().port(), true);
    } catch (AssertionError null) {
    
    } finally {
      paramConnectionSpecSelector = null;
    } 
    ConnectionSpecSelector connectionSpecSelector = paramConnectionSpecSelector;
    if (Util.isAndroidGetsocknameError(assertionError2)) {
      connectionSpecSelector = paramConnectionSpecSelector;
      throw new IOException(assertionError2);
    } 
    connectionSpecSelector = paramConnectionSpecSelector;
    throw assertionError2;
  }
  
  private void connectTunnel(int paramInt1, int paramInt2, int paramInt3, Call paramCall, EventListener paramEventListener) {
    Request request = createTunnelRequest();
    HttpUrl httpUrl = request.url();
    int i;
    for (i = 0; i < 21; i++) {
      connectSocket(paramInt1, paramInt2, paramCall, paramEventListener);
      request = createTunnel(paramInt2, paramInt3, request, httpUrl);
      if (request == null)
        return; 
      Util.closeQuietly(this.rawSocket);
      this.rawSocket = null;
      this.sink = null;
      this.source = null;
      paramEventListener.connectEnd(paramCall, this.route.socketAddress(), this.route.proxy(), null);
    } 
  }
  
  private Request createTunnel(int paramInt1, int paramInt2, Request paramRequest, HttpUrl paramHttpUrl) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CONNECT ");
    stringBuilder.append(Util.hostHeader(paramHttpUrl, true));
    stringBuilder.append(" HTTP/1.1");
    String str = stringBuilder.toString();
    while (true) {
      Http1Codec http1Codec = new Http1Codec(null, null, this.source, this.sink);
      this.source.timeout().timeout(paramInt1, TimeUnit.MILLISECONDS);
      this.sink.timeout().timeout(paramInt2, TimeUnit.MILLISECONDS);
      http1Codec.writeRequest(paramRequest.headers(), str);
      http1Codec.finishRequest();
      Response response = http1Codec.readResponseHeaders(false).request(paramRequest).build();
      long l2 = HttpHeaders.contentLength(response);
      long l1 = l2;
      if (l2 == -1L)
        l1 = 0L; 
      t t = http1Codec.newFixedLengthSource(l1);
      Util.skipAll(t, 2147483647, TimeUnit.MILLISECONDS);
      t.close();
      int i = response.code();
      if (i != 200) {
        if (i == 407) {
          Request request = this.route.address().proxyAuthenticator().authenticate(this.route, response);
          if (request != null) {
            if ("close".equalsIgnoreCase(response.header("Connection")))
              return request; 
            continue;
          } 
          throw new IOException("Failed to authenticate with proxy");
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Unexpected response code for CONNECT: ");
        stringBuilder1.append(response.code());
        throw new IOException(stringBuilder1.toString());
      } 
      if (this.source.f().j() && this.sink.f().j())
        return null; 
      IOException iOException = new IOException("TLS tunnel buffered too many bytes!");
      throw iOException;
    } 
  }
  
  private Request createTunnelRequest() {
    Request request1 = (new Request.Builder()).url(this.route.address().url()).method("CONNECT", null).header("Host", Util.hostHeader(this.route.address().url(), true)).header("Proxy-Connection", "Keep-Alive").header("User-Agent", Version.userAgent()).build();
    Response response = (new Response.Builder()).request(request1).protocol(Protocol.HTTP_1_1).code(407).message("Preemptive Authenticate").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(-1L).header("Proxy-Authenticate", "OkHttp-Preemptive").build();
    Request request2 = this.route.address().proxyAuthenticator().authenticate(this.route, response);
    if (request2 != null)
      request1 = request2; 
    return request1;
  }
  
  private void establishProtocol(ConnectionSpecSelector paramConnectionSpecSelector, int paramInt, Call paramCall, EventListener paramEventListener) {
    if (this.route.address().sslSocketFactory() == null) {
      if (this.route.address().protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
        this.socket = this.rawSocket;
        this.protocol = Protocol.H2_PRIOR_KNOWLEDGE;
        startHttp2(paramInt);
        return;
      } 
      this.socket = this.rawSocket;
      this.protocol = Protocol.HTTP_1_1;
      return;
    } 
    paramEventListener.secureConnectStart(paramCall);
    connectTls(paramConnectionSpecSelector);
    paramEventListener.secureConnectEnd(paramCall, this.handshake);
    if (this.protocol == Protocol.HTTP_2)
      startHttp2(paramInt); 
  }
  
  private void startHttp2(int paramInt) {
    this.socket.setSoTimeout(0);
    this.http2Connection = (new Http2Connection.Builder(true)).socket(this.socket, this.route.address().url().host(), this.source, this.sink).listener(this).pingIntervalMillis(paramInt).build();
    this.http2Connection.start();
  }
  
  public static RealConnection testConnection(ConnectionPool paramConnectionPool, Route paramRoute, Socket paramSocket, long paramLong) {
    RealConnection realConnection = new RealConnection(paramConnectionPool, paramRoute);
    realConnection.socket = paramSocket;
    realConnection.idleAtNanos = paramLong;
    return realConnection;
  }
  
  public void cancel() {
    Util.closeQuietly(this.rawSocket);
  }
  
  public void connect(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean, Call paramCall, EventListener paramEventListener) {
    // Byte code:
    //   0: aload_0
    //   1: getfield protocol : Lokhttp3/Protocol;
    //   4: ifnonnull -> 495
    //   7: aload_0
    //   8: getfield route : Lokhttp3/Route;
    //   11: invokevirtual address : ()Lokhttp3/Address;
    //   14: invokevirtual connectionSpecs : ()Ljava/util/List;
    //   17: astore #8
    //   19: new okhttp3/internal/connection/ConnectionSpecSelector
    //   22: dup
    //   23: aload #8
    //   25: invokespecial <init> : (Ljava/util/List;)V
    //   28: astore #10
    //   30: aload_0
    //   31: getfield route : Lokhttp3/Route;
    //   34: invokevirtual address : ()Lokhttp3/Address;
    //   37: invokevirtual sslSocketFactory : ()Ljavax/net/ssl/SSLSocketFactory;
    //   40: ifnonnull -> 158
    //   43: aload #8
    //   45: getstatic okhttp3/ConnectionSpec.CLEARTEXT : Lokhttp3/ConnectionSpec;
    //   48: invokeinterface contains : (Ljava/lang/Object;)Z
    //   53: ifeq -> 140
    //   56: aload_0
    //   57: getfield route : Lokhttp3/Route;
    //   60: invokevirtual address : ()Lokhttp3/Address;
    //   63: invokevirtual url : ()Lokhttp3/HttpUrl;
    //   66: invokevirtual host : ()Ljava/lang/String;
    //   69: astore #8
    //   71: invokestatic get : ()Lokhttp3/internal/platform/Platform;
    //   74: aload #8
    //   76: invokevirtual isCleartextTrafficPermitted : (Ljava/lang/String;)Z
    //   79: ifeq -> 85
    //   82: goto -> 179
    //   85: new java/lang/StringBuilder
    //   88: dup
    //   89: invokespecial <init> : ()V
    //   92: astore #6
    //   94: aload #6
    //   96: ldc_w 'CLEARTEXT communication to '
    //   99: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   102: pop
    //   103: aload #6
    //   105: aload #8
    //   107: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   110: pop
    //   111: aload #6
    //   113: ldc_w ' not permitted by network security policy'
    //   116: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   119: pop
    //   120: new okhttp3/internal/connection/RouteException
    //   123: dup
    //   124: new java/net/UnknownServiceException
    //   127: dup
    //   128: aload #6
    //   130: invokevirtual toString : ()Ljava/lang/String;
    //   133: invokespecial <init> : (Ljava/lang/String;)V
    //   136: invokespecial <init> : (Ljava/io/IOException;)V
    //   139: athrow
    //   140: new okhttp3/internal/connection/RouteException
    //   143: dup
    //   144: new java/net/UnknownServiceException
    //   147: dup
    //   148: ldc_w 'CLEARTEXT communication not enabled for client'
    //   151: invokespecial <init> : (Ljava/lang/String;)V
    //   154: invokespecial <init> : (Ljava/io/IOException;)V
    //   157: athrow
    //   158: aload_0
    //   159: getfield route : Lokhttp3/Route;
    //   162: invokevirtual address : ()Lokhttp3/Address;
    //   165: invokevirtual protocols : ()Ljava/util/List;
    //   168: getstatic okhttp3/Protocol.H2_PRIOR_KNOWLEDGE : Lokhttp3/Protocol;
    //   171: invokeinterface contains : (Ljava/lang/Object;)Z
    //   176: ifne -> 477
    //   179: aconst_null
    //   180: astore #9
    //   182: aload_0
    //   183: getfield route : Lokhttp3/Route;
    //   186: invokevirtual requiresTunnel : ()Z
    //   189: ifeq -> 220
    //   192: aload_0
    //   193: iload_1
    //   194: iload_2
    //   195: iload_3
    //   196: aload #6
    //   198: aload #7
    //   200: invokespecial connectTunnel : (IIILokhttp3/Call;Lokhttp3/EventListener;)V
    //   203: aload_0
    //   204: getfield rawSocket : Ljava/net/Socket;
    //   207: astore #8
    //   209: aload #8
    //   211: ifnonnull -> 217
    //   214: goto -> 267
    //   217: goto -> 230
    //   220: aload_0
    //   221: iload_1
    //   222: iload_2
    //   223: aload #6
    //   225: aload #7
    //   227: invokespecial connectSocket : (IILokhttp3/Call;Lokhttp3/EventListener;)V
    //   230: aload_0
    //   231: aload #10
    //   233: iload #4
    //   235: aload #6
    //   237: aload #7
    //   239: invokespecial establishProtocol : (Lokhttp3/internal/connection/ConnectionSpecSelector;ILokhttp3/Call;Lokhttp3/EventListener;)V
    //   242: aload #7
    //   244: aload #6
    //   246: aload_0
    //   247: getfield route : Lokhttp3/Route;
    //   250: invokevirtual socketAddress : ()Ljava/net/InetSocketAddress;
    //   253: aload_0
    //   254: getfield route : Lokhttp3/Route;
    //   257: invokevirtual proxy : ()Ljava/net/Proxy;
    //   260: aload_0
    //   261: getfield protocol : Lokhttp3/Protocol;
    //   264: invokevirtual connectEnd : (Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V
    //   267: aload_0
    //   268: getfield route : Lokhttp3/Route;
    //   271: invokevirtual requiresTunnel : ()Z
    //   274: ifeq -> 305
    //   277: aload_0
    //   278: getfield rawSocket : Ljava/net/Socket;
    //   281: ifnull -> 287
    //   284: goto -> 305
    //   287: new okhttp3/internal/connection/RouteException
    //   290: dup
    //   291: new java/net/ProtocolException
    //   294: dup
    //   295: ldc_w 'Too many tunnel connections attempted: 21'
    //   298: invokespecial <init> : (Ljava/lang/String;)V
    //   301: invokespecial <init> : (Ljava/io/IOException;)V
    //   304: athrow
    //   305: aload_0
    //   306: getfield http2Connection : Lokhttp3/internal/http2/Http2Connection;
    //   309: ifnull -> 344
    //   312: aload_0
    //   313: getfield connectionPool : Lokhttp3/ConnectionPool;
    //   316: astore #6
    //   318: aload #6
    //   320: monitorenter
    //   321: aload_0
    //   322: aload_0
    //   323: getfield http2Connection : Lokhttp3/internal/http2/Http2Connection;
    //   326: invokevirtual maxConcurrentStreams : ()I
    //   329: putfield allocationLimit : I
    //   332: aload #6
    //   334: monitorexit
    //   335: return
    //   336: astore #7
    //   338: aload #6
    //   340: monitorexit
    //   341: aload #7
    //   343: athrow
    //   344: return
    //   345: astore #8
    //   347: goto -> 357
    //   350: astore #8
    //   352: goto -> 357
    //   355: astore #8
    //   357: aload_0
    //   358: getfield socket : Ljava/net/Socket;
    //   361: invokestatic closeQuietly : (Ljava/net/Socket;)V
    //   364: aload_0
    //   365: getfield rawSocket : Ljava/net/Socket;
    //   368: invokestatic closeQuietly : (Ljava/net/Socket;)V
    //   371: aload_0
    //   372: aconst_null
    //   373: putfield socket : Ljava/net/Socket;
    //   376: aload_0
    //   377: aconst_null
    //   378: putfield rawSocket : Ljava/net/Socket;
    //   381: aload_0
    //   382: aconst_null
    //   383: putfield source : Lj/e;
    //   386: aload_0
    //   387: aconst_null
    //   388: putfield sink : Lj/d;
    //   391: aload_0
    //   392: aconst_null
    //   393: putfield handshake : Lokhttp3/Handshake;
    //   396: aload_0
    //   397: aconst_null
    //   398: putfield protocol : Lokhttp3/Protocol;
    //   401: aload_0
    //   402: aconst_null
    //   403: putfield http2Connection : Lokhttp3/internal/http2/Http2Connection;
    //   406: aload #7
    //   408: aload #6
    //   410: aload_0
    //   411: getfield route : Lokhttp3/Route;
    //   414: invokevirtual socketAddress : ()Ljava/net/InetSocketAddress;
    //   417: aload_0
    //   418: getfield route : Lokhttp3/Route;
    //   421: invokevirtual proxy : ()Ljava/net/Proxy;
    //   424: aconst_null
    //   425: aload #8
    //   427: invokevirtual connectFailed : (Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V
    //   430: aload #9
    //   432: ifnonnull -> 449
    //   435: new okhttp3/internal/connection/RouteException
    //   438: dup
    //   439: aload #8
    //   441: invokespecial <init> : (Ljava/io/IOException;)V
    //   444: astore #9
    //   446: goto -> 456
    //   449: aload #9
    //   451: aload #8
    //   453: invokevirtual addConnectException : (Ljava/io/IOException;)V
    //   456: iload #5
    //   458: ifeq -> 474
    //   461: aload #10
    //   463: aload #8
    //   465: invokevirtual connectionFailed : (Ljava/io/IOException;)Z
    //   468: ifeq -> 474
    //   471: goto -> 182
    //   474: aload #9
    //   476: athrow
    //   477: new okhttp3/internal/connection/RouteException
    //   480: dup
    //   481: new java/net/UnknownServiceException
    //   484: dup
    //   485: ldc_w 'H2_PRIOR_KNOWLEDGE cannot be used with HTTPS'
    //   488: invokespecial <init> : (Ljava/lang/String;)V
    //   491: invokespecial <init> : (Ljava/io/IOException;)V
    //   494: athrow
    //   495: new java/lang/IllegalStateException
    //   498: dup
    //   499: ldc_w 'already connected'
    //   502: invokespecial <init> : (Ljava/lang/String;)V
    //   505: astore #6
    //   507: goto -> 513
    //   510: aload #6
    //   512: athrow
    //   513: goto -> 510
    // Exception table:
    //   from	to	target	type
    //   182	209	355	java/io/IOException
    //   220	230	350	java/io/IOException
    //   230	267	345	java/io/IOException
    //   321	335	336	finally
    //   338	341	336	finally
  }
  
  public Handshake handshake() {
    return this.handshake;
  }
  
  public boolean isEligible(Address paramAddress, Route paramRoute) {
    if (this.allocations.size() < this.allocationLimit) {
      if (this.noNewStreams)
        return false; 
      if (!Internal.instance.equalsNonHost(this.route.address(), paramAddress))
        return false; 
      if (paramAddress.url().host().equals(route().address().url().host()))
        return true; 
      if (this.http2Connection == null)
        return false; 
      if (paramRoute == null)
        return false; 
      if (paramRoute.proxy().type() != Proxy.Type.DIRECT)
        return false; 
      if (this.route.proxy().type() != Proxy.Type.DIRECT)
        return false; 
      if (!this.route.socketAddress().equals(paramRoute.socketAddress()))
        return false; 
      if (paramRoute.address().hostnameVerifier() != OkHostnameVerifier.INSTANCE)
        return false; 
      if (!supportsUrl(paramAddress.url()))
        return false; 
      try {
        paramAddress.certificatePinner().check(paramAddress.url().host(), handshake().peerCertificates());
        return true;
      } catch (SSLPeerUnverifiedException sSLPeerUnverifiedException) {
        return false;
      } 
    } 
    return false;
  }
  
  public boolean isHealthy(boolean paramBoolean) {
    if (!this.socket.isClosed() && !this.socket.isInputShutdown()) {
      if (this.socket.isOutputShutdown())
        return false; 
      Http2Connection http2Connection = this.http2Connection;
      if (http2Connection != null)
        return http2Connection.isShutdown() ^ true; 
      if (paramBoolean)
        try {
          int i = this.socket.getSoTimeout();
          try {
            this.socket.setSoTimeout(1);
            paramBoolean = this.source.j();
            if (paramBoolean)
              return false; 
            return true;
          } finally {
            this.socket.setSoTimeout(i);
          } 
        } catch (SocketTimeoutException socketTimeoutException) {
          return true;
        } catch (IOException iOException) {
          return false;
        }  
      return true;
    } 
    return false;
  }
  
  public boolean isMultiplexed() {
    return (this.http2Connection != null);
  }
  
  public HttpCodec newCodec(OkHttpClient paramOkHttpClient, Interceptor.Chain paramChain, StreamAllocation paramStreamAllocation) {
    Http2Connection http2Connection = this.http2Connection;
    if (http2Connection != null)
      return (HttpCodec)new Http2Codec(paramOkHttpClient, paramChain, paramStreamAllocation, http2Connection); 
    this.socket.setSoTimeout(paramChain.readTimeoutMillis());
    this.source.timeout().timeout(paramChain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
    this.sink.timeout().timeout(paramChain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
    return (HttpCodec)new Http1Codec(paramOkHttpClient, paramStreamAllocation, this.source, this.sink);
  }
  
  public RealWebSocket.Streams newWebSocketStreams(final StreamAllocation streamAllocation) {
    return new RealWebSocket.Streams(true, this.source, this.sink) {
        public void close() {
          StreamAllocation streamAllocation = streamAllocation;
          streamAllocation.streamFinished(true, streamAllocation.codec(), -1L, null);
        }
      };
  }
  
  public void onSettings(Http2Connection paramHttp2Connection) {
    synchronized (this.connectionPool) {
      this.allocationLimit = paramHttp2Connection.maxConcurrentStreams();
      return;
    } 
  }
  
  public void onStream(Http2Stream paramHttp2Stream) {
    paramHttp2Stream.close(ErrorCode.REFUSED_STREAM);
  }
  
  public Protocol protocol() {
    return this.protocol;
  }
  
  public Route route() {
    return this.route;
  }
  
  public Socket socket() {
    return this.socket;
  }
  
  public boolean supportsUrl(HttpUrl paramHttpUrl) {
    if (paramHttpUrl.port() != this.route.address().url().port())
      return false; 
    boolean bool1 = paramHttpUrl.host().equals(this.route.address().url().host());
    boolean bool = true;
    if (!bool1) {
      if (this.handshake != null && OkHostnameVerifier.INSTANCE.verify(paramHttpUrl.host(), this.handshake.peerCertificates().get(0)))
        return true; 
      bool = false;
    } 
    return bool;
  }
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Connection{");
    stringBuilder.append(this.route.address().url().host());
    stringBuilder.append(":");
    stringBuilder.append(this.route.address().url().port());
    stringBuilder.append(", proxy=");
    stringBuilder.append(this.route.proxy());
    stringBuilder.append(" hostAddress=");
    stringBuilder.append(this.route.socketAddress());
    stringBuilder.append(" cipherSuite=");
    Handshake handshake = this.handshake;
    if (handshake != null) {
      CipherSuite cipherSuite = handshake.cipherSuite();
    } else {
      str = "none";
    } 
    stringBuilder.append(str);
    stringBuilder.append(" protocol=");
    stringBuilder.append(this.protocol);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/connection/RealConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */