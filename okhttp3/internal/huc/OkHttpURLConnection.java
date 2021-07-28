package okhttp3.internal.huc;

import j.c;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketPermission;
import java.net.URL;
import java.net.UnknownHostException;
import java.security.Permission;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.Dispatcher;
import okhttp3.Handshake;
import okhttp3.Headers;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.internal.Internal;
import okhttp3.internal.JavaNetHeaders;
import okhttp3.internal.URLFilter;
import okhttp3.internal.Version;
import okhttp3.internal.http.HttpDate;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.HttpMethod;
import okhttp3.internal.http.StatusLine;
import okhttp3.internal.platform.Platform;

public final class OkHttpURLConnection extends HttpURLConnection implements Callback {
  private static final Set<String> METHODS;
  
  public static final String RESPONSE_SOURCE;
  
  public static final String SELECTED_PROTOCOL;
  
  Call call;
  
  private Throwable callFailure;
  
  OkHttpClient client;
  
  boolean connectPending = true;
  
  private boolean executed;
  
  private long fixedContentLength = -1L;
  
  Handshake handshake;
  
  private final Object lock = new Object();
  
  private final NetworkInterceptor networkInterceptor = new NetworkInterceptor();
  
  Response networkResponse;
  
  Proxy proxy;
  
  private Headers.Builder requestHeaders = new Headers.Builder();
  
  private Response response;
  
  private Headers responseHeaders;
  
  URLFilter urlFilter;
  
  static {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(Platform.get().getPrefix());
    stringBuilder.append("-Selected-Protocol");
    SELECTED_PROTOCOL = stringBuilder.toString();
    stringBuilder = new StringBuilder();
    stringBuilder.append(Platform.get().getPrefix());
    stringBuilder.append("-Response-Source");
    RESPONSE_SOURCE = stringBuilder.toString();
    METHODS = new LinkedHashSet<String>(Arrays.asList(new String[] { "OPTIONS", "GET", "HEAD", "POST", "PUT", "DELETE", "TRACE", "PATCH" }));
  }
  
  public OkHttpURLConnection(URL paramURL, OkHttpClient paramOkHttpClient) {
    super(paramURL);
    this.client = paramOkHttpClient;
  }
  
  public OkHttpURLConnection(URL paramURL, OkHttpClient paramOkHttpClient, URLFilter paramURLFilter) {
    this(paramURL, paramOkHttpClient);
    this.urlFilter = paramURLFilter;
  }
  
  private Call buildCall() {
    Call call = this.call;
    if (call != null)
      return call; 
    boolean bool = true;
    this.connected = true;
    if (this.doOutput)
      if (this.method.equals("GET")) {
        this.method = "POST";
      } else if (!HttpMethod.permitsRequestBody(this.method)) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(this.method);
        stringBuilder.append(" does not support writing");
        throw new ProtocolException(stringBuilder.toString());
      }  
    if (this.requestHeaders.get("User-Agent") == null)
      this.requestHeaders.add("User-Agent", defaultUserAgent()); 
    if (HttpMethod.permitsRequestBody(this.method)) {
      BufferedRequestBody bufferedRequestBody;
      if (this.requestHeaders.get("Content-Type") == null)
        this.requestHeaders.add("Content-Type", "application/x-www-form-urlencoded"); 
      long l2 = this.fixedContentLength;
      long l1 = -1L;
      boolean bool1 = bool;
      if (l2 == -1L)
        if (this.chunkLength > 0) {
          bool1 = bool;
        } else {
          bool1 = false;
        }  
      String str = this.requestHeaders.get("Content-Length");
      l2 = this.fixedContentLength;
      if (l2 != -1L) {
        l1 = l2;
      } else if (str != null) {
        l1 = Long.parseLong(str);
      } 
      if (bool1) {
        StreamedRequestBody streamedRequestBody = new StreamedRequestBody(l1);
      } else {
        bufferedRequestBody = new BufferedRequestBody(l1);
      } 
      bufferedRequestBody.timeout().timeout(this.client.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
    } else {
      call = null;
    } 
    try {
      HttpUrl httpUrl = HttpUrl.get(getURL().toString());
      Request request = (new Request.Builder()).url(httpUrl).headers(this.requestHeaders.build()).method(this.method, (RequestBody)call).build();
      URLFilter uRLFilter = this.urlFilter;
      if (uRLFilter != null)
        uRLFilter.checkURLPermitted(request.url().url()); 
      OkHttpClient.Builder builder = this.client.newBuilder();
      builder.interceptors().clear();
      builder.interceptors().add(UnexpectedException.INTERCEPTOR);
      builder.networkInterceptors().clear();
      builder.networkInterceptors().add(this.networkInterceptor);
      builder.dispatcher(new Dispatcher(this.client.dispatcher().executorService()));
      if (!getUseCaches())
        builder.cache(null); 
      Call call1 = builder.build().newCall(request);
      this.call = call1;
      return call1;
    } catch (IllegalArgumentException illegalArgumentException) {
      if (Internal.instance.isInvalidHttpUrlHost(illegalArgumentException)) {
        UnknownHostException unknownHostException = new UnknownHostException();
        unknownHostException.initCause(illegalArgumentException);
        throw unknownHostException;
      } 
      MalformedURLException malformedURLException = new MalformedURLException();
      malformedURLException.initCause(illegalArgumentException);
      throw malformedURLException;
    } 
  }
  
  private String defaultUserAgent() {
    String str = System.getProperty("http.agent");
    return (str != null) ? toHumanReadableAscii(str) : Version.userAgent();
  }
  
  private Headers getHeaders() {
    if (this.responseHeaders == null) {
      Response response = getResponse(true);
      this.responseHeaders = response.headers().newBuilder().add(SELECTED_PROTOCOL, response.protocol().toString()).add(RESPONSE_SOURCE, responseSourceHeader(response)).build();
    } 
    return this.responseHeaders;
  }
  
  private Response getResponse(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield lock : Ljava/lang/Object;
    //   4: astore_2
    //   5: aload_2
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield response : Lokhttp3/Response;
    //   11: ifnull -> 23
    //   14: aload_0
    //   15: getfield response : Lokhttp3/Response;
    //   18: astore_3
    //   19: aload_2
    //   20: monitorexit
    //   21: aload_3
    //   22: areturn
    //   23: aload_0
    //   24: getfield callFailure : Ljava/lang/Throwable;
    //   27: ifnull -> 58
    //   30: iload_1
    //   31: ifeq -> 50
    //   34: aload_0
    //   35: getfield networkResponse : Lokhttp3/Response;
    //   38: ifnull -> 50
    //   41: aload_0
    //   42: getfield networkResponse : Lokhttp3/Response;
    //   45: astore_3
    //   46: aload_2
    //   47: monitorexit
    //   48: aload_3
    //   49: areturn
    //   50: aload_0
    //   51: getfield callFailure : Ljava/lang/Throwable;
    //   54: invokestatic propagate : (Ljava/lang/Throwable;)Ljava/io/IOException;
    //   57: athrow
    //   58: aload_2
    //   59: monitorexit
    //   60: aload_0
    //   61: invokespecial buildCall : ()Lokhttp3/Call;
    //   64: astore_2
    //   65: aload_0
    //   66: getfield networkInterceptor : Lokhttp3/internal/huc/OkHttpURLConnection$NetworkInterceptor;
    //   69: invokevirtual proceed : ()V
    //   72: aload_2
    //   73: invokeinterface request : ()Lokhttp3/Request;
    //   78: invokevirtual body : ()Lokhttp3/RequestBody;
    //   81: checkcast okhttp3/internal/huc/OutputStreamRequestBody
    //   84: astore_3
    //   85: aload_3
    //   86: ifnull -> 96
    //   89: aload_3
    //   90: invokevirtual outputStream : ()Ljava/io/OutputStream;
    //   93: invokevirtual close : ()V
    //   96: aload_0
    //   97: getfield executed : Z
    //   100: ifeq -> 157
    //   103: aload_0
    //   104: getfield lock : Ljava/lang/Object;
    //   107: astore_2
    //   108: aload_2
    //   109: monitorenter
    //   110: aload_0
    //   111: getfield response : Lokhttp3/Response;
    //   114: ifnonnull -> 134
    //   117: aload_0
    //   118: getfield callFailure : Ljava/lang/Throwable;
    //   121: ifnonnull -> 134
    //   124: aload_0
    //   125: getfield lock : Ljava/lang/Object;
    //   128: invokevirtual wait : ()V
    //   131: goto -> 110
    //   134: aload_2
    //   135: monitorexit
    //   136: goto -> 183
    //   139: invokestatic currentThread : ()Ljava/lang/Thread;
    //   142: invokevirtual interrupt : ()V
    //   145: new java/io/InterruptedIOException
    //   148: dup
    //   149: invokespecial <init> : ()V
    //   152: athrow
    //   153: aload_2
    //   154: monitorexit
    //   155: aload_3
    //   156: athrow
    //   157: aload_0
    //   158: iconst_1
    //   159: putfield executed : Z
    //   162: aload_0
    //   163: aload_2
    //   164: aload_2
    //   165: invokeinterface execute : ()Lokhttp3/Response;
    //   170: invokevirtual onResponse : (Lokhttp3/Call;Lokhttp3/Response;)V
    //   173: goto -> 183
    //   176: astore_3
    //   177: aload_0
    //   178: aload_2
    //   179: aload_3
    //   180: invokevirtual onFailure : (Lokhttp3/Call;Ljava/io/IOException;)V
    //   183: aload_0
    //   184: getfield lock : Ljava/lang/Object;
    //   187: astore_2
    //   188: aload_2
    //   189: monitorenter
    //   190: aload_0
    //   191: getfield callFailure : Ljava/lang/Throwable;
    //   194: ifnonnull -> 223
    //   197: aload_0
    //   198: getfield response : Lokhttp3/Response;
    //   201: ifnull -> 213
    //   204: aload_0
    //   205: getfield response : Lokhttp3/Response;
    //   208: astore_3
    //   209: aload_2
    //   210: monitorexit
    //   211: aload_3
    //   212: areturn
    //   213: aload_2
    //   214: monitorexit
    //   215: new java/lang/AssertionError
    //   218: dup
    //   219: invokespecial <init> : ()V
    //   222: athrow
    //   223: aload_0
    //   224: getfield callFailure : Ljava/lang/Throwable;
    //   227: invokestatic propagate : (Ljava/lang/Throwable;)Ljava/io/IOException;
    //   230: athrow
    //   231: astore_3
    //   232: aload_2
    //   233: monitorexit
    //   234: aload_3
    //   235: athrow
    //   236: astore_3
    //   237: aload_2
    //   238: monitorexit
    //   239: goto -> 244
    //   242: aload_3
    //   243: athrow
    //   244: goto -> 242
    //   247: astore_3
    //   248: goto -> 139
    //   251: astore_3
    //   252: goto -> 153
    // Exception table:
    //   from	to	target	type
    //   7	21	236	finally
    //   23	30	236	finally
    //   34	48	236	finally
    //   50	58	236	finally
    //   58	60	236	finally
    //   110	131	247	java/lang/InterruptedException
    //   110	131	251	finally
    //   134	136	251	finally
    //   139	153	251	finally
    //   153	155	251	finally
    //   162	173	176	java/io/IOException
    //   190	211	231	finally
    //   213	215	231	finally
    //   223	231	231	finally
    //   232	234	231	finally
    //   237	239	236	finally
  }
  
  private static IOException propagate(Throwable paramThrowable) {
    if (!(paramThrowable instanceof IOException)) {
      if (!(paramThrowable instanceof Error)) {
        if (paramThrowable instanceof RuntimeException)
          throw (RuntimeException)paramThrowable; 
        throw new AssertionError();
      } 
      throw (Error)paramThrowable;
    } 
    throw (IOException)paramThrowable;
  }
  
  private static String responseSourceHeader(Response paramResponse) {
    StringBuilder stringBuilder;
    String str;
    if (paramResponse.networkResponse() == null) {
      if (paramResponse.cacheResponse() == null)
        return "NONE"; 
      stringBuilder = new StringBuilder();
      str = "CACHE ";
    } else if (paramResponse.cacheResponse() == null) {
      stringBuilder = new StringBuilder();
      str = "NETWORK ";
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("CONDITIONAL_CACHE ");
      paramResponse = paramResponse.networkResponse();
      stringBuilder.append(paramResponse.code());
      return stringBuilder.toString();
    } 
    stringBuilder.append(str);
    stringBuilder.append(paramResponse.code());
    return stringBuilder.toString();
  }
  
  private static String toHumanReadableAscii(String paramString) {
    String str;
    int j = paramString.length();
    int i = 0;
    while (true) {
      str = paramString;
      if (i < j) {
        int m = paramString.codePointAt(i);
        if (m > 31 && m < 127) {
          i += Character.charCount(m);
          continue;
        } 
        c c = new c();
        c.a(paramString, 0, i);
        c.c(63);
        int k = i;
        while (true) {
          m = k + Character.charCount(m);
          if (m < j) {
            i = paramString.codePointAt(m);
            if (i > 31 && i < 127) {
              k = i;
            } else {
              k = 63;
            } 
            c.c(k);
            k = m;
            m = i;
            continue;
          } 
          str = c.d();
          break;
        } 
      } 
      break;
    } 
    return str;
  }
  
  public void addRequestProperty(String paramString1, String paramString2) {
    if (!this.connected) {
      if (paramString1 != null) {
        Platform platform;
        if (paramString2 == null) {
          platform = Platform.get();
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Ignoring header ");
          stringBuilder.append(paramString1);
          stringBuilder.append(" because its value was null.");
          platform.log(5, stringBuilder.toString(), null);
          return;
        } 
        this.requestHeaders.add(paramString1, (String)platform);
        return;
      } 
      throw new NullPointerException("field == null");
    } 
    throw new IllegalStateException("Cannot add request property after connection is made");
  }
  
  public void connect() {
    if (this.executed)
      return; 
    Call call = buildCall();
    this.executed = true;
    call.enqueue(this);
    synchronized (this.lock) {
      while (this.connectPending && this.response == null && this.callFailure == null)
        this.lock.wait(); 
      Throwable throwable = this.callFailure;
      if (throwable == null)
        return; 
      throw propagate(this.callFailure);
    } 
  }
  
  public void disconnect() {
    if (this.call == null)
      return; 
    this.networkInterceptor.proceed();
    this.call.cancel();
  }
  
  public int getConnectTimeout() {
    return this.client.connectTimeoutMillis();
  }
  
  public InputStream getErrorStream() {
    try {
      Response response = getResponse(true);
      return (HttpHeaders.hasBody(response) && response.code() >= 400) ? response.body().byteStream() : null;
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public String getHeaderField(int paramInt) {
    try {
      Headers headers = getHeaders();
      return (paramInt >= 0) ? ((paramInt >= headers.size()) ? null : headers.value(paramInt)) : null;
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public String getHeaderField(String paramString) {
    if (paramString == null)
      try {
        return StatusLine.get(getResponse(true)).toString();
      } catch (IOException iOException) {
        return null;
      }  
    return getHeaders().get((String)iOException);
  }
  
  public String getHeaderFieldKey(int paramInt) {
    try {
      Headers headers = getHeaders();
      return (paramInt >= 0) ? ((paramInt >= headers.size()) ? null : headers.name(paramInt)) : null;
    } catch (IOException iOException) {
      return null;
    } 
  }
  
  public Map<String, List<String>> getHeaderFields() {
    try {
      return JavaNetHeaders.toMultimap(getHeaders(), StatusLine.get(getResponse(true)).toString());
    } catch (IOException iOException) {
      return Collections.emptyMap();
    } 
  }
  
  public InputStream getInputStream() {
    if (this.doInput) {
      Response response = getResponse(false);
      if (response.code() < 400)
        return response.body().byteStream(); 
      throw new FileNotFoundException(this.url.toString());
    } 
    throw new ProtocolException("This protocol does not support input");
  }
  
  public boolean getInstanceFollowRedirects() {
    return this.client.followRedirects();
  }
  
  public OutputStream getOutputStream() {
    OutputStreamRequestBody outputStreamRequestBody = (OutputStreamRequestBody)buildCall().request().body();
    if (outputStreamRequestBody != null) {
      if (outputStreamRequestBody instanceof StreamedRequestBody) {
        connect();
        this.networkInterceptor.proceed();
      } 
      if (!outputStreamRequestBody.isClosed())
        return outputStreamRequestBody.outputStream(); 
      throw new ProtocolException("cannot write request body after response has been read");
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("method does not support a request body: ");
    stringBuilder.append(this.method);
    throw new ProtocolException(stringBuilder.toString());
  }
  
  public Permission getPermission() {
    int i;
    URL uRL = getURL();
    String str = uRL.getHost();
    if (uRL.getPort() != -1) {
      i = uRL.getPort();
    } else {
      i = HttpUrl.defaultPort(uRL.getProtocol());
    } 
    if (usingProxy()) {
      InetSocketAddress inetSocketAddress = (InetSocketAddress)this.client.proxy().address();
      str = inetSocketAddress.getHostName();
      i = inetSocketAddress.getPort();
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(str);
    stringBuilder.append(":");
    stringBuilder.append(i);
    return new SocketPermission(stringBuilder.toString(), "connect, resolve");
  }
  
  public int getReadTimeout() {
    return this.client.readTimeoutMillis();
  }
  
  public Map<String, List<String>> getRequestProperties() {
    if (!this.connected)
      return JavaNetHeaders.toMultimap(this.requestHeaders.build(), null); 
    throw new IllegalStateException("Cannot access request header fields after connection is set");
  }
  
  public String getRequestProperty(String paramString) {
    return (paramString == null) ? null : this.requestHeaders.get(paramString);
  }
  
  public int getResponseCode() {
    return getResponse(true).code();
  }
  
  public String getResponseMessage() {
    return getResponse(true).message();
  }
  
  public void onFailure(Call paramCall, IOException paramIOException) {
    // Byte code:
    //   0: aload_0
    //   1: getfield lock : Ljava/lang/Object;
    //   4: astore_3
    //   5: aload_3
    //   6: monitorenter
    //   7: aload_2
    //   8: astore_1
    //   9: aload_2
    //   10: instanceof okhttp3/internal/huc/OkHttpURLConnection$UnexpectedException
    //   13: ifeq -> 21
    //   16: aload_2
    //   17: invokevirtual getCause : ()Ljava/lang/Throwable;
    //   20: astore_1
    //   21: aload_0
    //   22: aload_1
    //   23: putfield callFailure : Ljava/lang/Throwable;
    //   26: aload_0
    //   27: getfield lock : Ljava/lang/Object;
    //   30: invokevirtual notifyAll : ()V
    //   33: aload_3
    //   34: monitorexit
    //   35: return
    //   36: astore_1
    //   37: aload_3
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Exception table:
    //   from	to	target	type
    //   9	21	36	finally
    //   21	35	36	finally
    //   37	39	36	finally
  }
  
  public void onResponse(Call paramCall, Response paramResponse) {
    synchronized (this.lock) {
      this.response = paramResponse;
      this.handshake = paramResponse.handshake();
      this.url = paramResponse.request().url().url();
      this.lock.notifyAll();
      return;
    } 
  }
  
  public void setConnectTimeout(int paramInt) {
    this.client = this.client.newBuilder().connectTimeout(paramInt, TimeUnit.MILLISECONDS).build();
  }
  
  public void setFixedLengthStreamingMode(int paramInt) {
    setFixedLengthStreamingMode(paramInt);
  }
  
  public void setFixedLengthStreamingMode(long paramLong) {
    if (!this.connected) {
      if (this.chunkLength <= 0) {
        if (paramLong >= 0L) {
          this.fixedContentLength = paramLong;
          super.fixedContentLength = (int)Math.min(paramLong, 2147483647L);
          return;
        } 
        throw new IllegalArgumentException("contentLength < 0");
      } 
      throw new IllegalStateException("Already in chunked mode");
    } 
    throw new IllegalStateException("Already connected");
  }
  
  public void setIfModifiedSince(long paramLong) {
    super.setIfModifiedSince(paramLong);
    paramLong = this.ifModifiedSince;
    Headers.Builder builder = this.requestHeaders;
    if (paramLong != 0L) {
      builder.set("If-Modified-Since", HttpDate.format(new Date(this.ifModifiedSince)));
      return;
    } 
    builder.removeAll("If-Modified-Since");
  }
  
  public void setInstanceFollowRedirects(boolean paramBoolean) {
    this.client = this.client.newBuilder().followRedirects(paramBoolean).build();
  }
  
  public void setReadTimeout(int paramInt) {
    this.client = this.client.newBuilder().readTimeout(paramInt, TimeUnit.MILLISECONDS).build();
  }
  
  public void setRequestMethod(String paramString) {
    if (METHODS.contains(paramString)) {
      this.method = paramString;
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Expected one of ");
    stringBuilder.append(METHODS);
    stringBuilder.append(" but was ");
    stringBuilder.append(paramString);
    throw new ProtocolException(stringBuilder.toString());
  }
  
  public void setRequestProperty(String paramString1, String paramString2) {
    if (!this.connected) {
      if (paramString1 != null) {
        Platform platform;
        if (paramString2 == null) {
          platform = Platform.get();
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Ignoring header ");
          stringBuilder.append(paramString1);
          stringBuilder.append(" because its value was null.");
          platform.log(5, stringBuilder.toString(), null);
          return;
        } 
        this.requestHeaders.set(paramString1, (String)platform);
        return;
      } 
      throw new NullPointerException("field == null");
    } 
    throw new IllegalStateException("Cannot set request property after connection is made");
  }
  
  public boolean usingProxy() {
    if (this.proxy != null)
      return true; 
    Proxy proxy = this.client.proxy();
    return (proxy != null && proxy.type() != Proxy.Type.DIRECT);
  }
  
  final class NetworkInterceptor implements Interceptor {
    private boolean proceed;
    
    public Response intercept(Interceptor.Chain param1Chain) {
      Request request = param1Chain.request();
      URLFilter uRLFilter = OkHttpURLConnection.this.urlFilter;
      if (uRLFilter != null)
        uRLFilter.checkURLPermitted(request.url().url()); 
      synchronized (OkHttpURLConnection.this.lock) {
        OkHttpURLConnection.this.connectPending = false;
        OkHttpURLConnection.this.proxy = param1Chain.connection().route().proxy();
        OkHttpURLConnection.this.handshake = param1Chain.connection().handshake();
        OkHttpURLConnection.this.lock.notifyAll();
        try {
          while (!this.proceed)
            OkHttpURLConnection.this.lock.wait(); 
          null = request;
          if (request.body() instanceof OutputStreamRequestBody)
            null = ((OutputStreamRequestBody)request.body()).prepareToSendRequest(request); 
          null = param1Chain.proceed((Request)null);
          synchronized (OkHttpURLConnection.this.lock) {
            OkHttpURLConnection.this.networkResponse = (Response)null;
            OkHttpURLConnection.access$102(OkHttpURLConnection.this, null.request().url().url());
            return (Response)null;
          } 
        } catch (InterruptedException interruptedException) {}
        Thread.currentThread().interrupt();
        throw new InterruptedIOException();
      } 
    }
    
    public void proceed() {
      synchronized (OkHttpURLConnection.this.lock) {
        this.proceed = true;
        OkHttpURLConnection.this.lock.notifyAll();
        return;
      } 
    }
  }
  
  static final class UnexpectedException extends IOException {
    static final Interceptor INTERCEPTOR = new Interceptor() {
        public Response intercept(Interceptor.Chain param2Chain) {
          try {
            return param2Chain.proceed(param2Chain.request());
          } catch (Error error) {
          
          } catch (RuntimeException runtimeException) {}
          throw new OkHttpURLConnection.UnexpectedException(runtimeException);
        }
      };
    
    UnexpectedException(Throwable param1Throwable) {
      super(param1Throwable);
    }
  }
  
  class null implements Interceptor {
    public Response intercept(Interceptor.Chain param1Chain) {
      try {
        return param1Chain.proceed(param1Chain.request());
      } catch (Error error) {
      
      } catch (RuntimeException runtimeException) {}
      throw new OkHttpURLConnection.UnexpectedException(runtimeException);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/huc/OkHttpURLConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */