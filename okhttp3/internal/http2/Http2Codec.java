package okhttp3.internal.http2;

import j.c;
import j.f;
import j.h;
import j.l;
import j.s;
import j.t;
import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.connection.StreamAllocation;
import okhttp3.internal.http.HttpCodec;
import okhttp3.internal.http.HttpHeaders;
import okhttp3.internal.http.RealResponseBody;
import okhttp3.internal.http.RequestLine;
import okhttp3.internal.http.StatusLine;

public final class Http2Codec implements HttpCodec {
  private static final String CONNECTION = "connection";
  
  private static final String ENCODING = "encoding";
  
  private static final String HOST = "host";
  
  private static final List<String> HTTP_2_SKIPPED_REQUEST_HEADERS = Util.immutableList((Object[])new String[] { 
        "connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", 
        ":scheme", ":authority" });
  
  private static final List<String> HTTP_2_SKIPPED_RESPONSE_HEADERS = Util.immutableList((Object[])new String[] { "connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade" });
  
  private static final String KEEP_ALIVE = "keep-alive";
  
  private static final String PROXY_CONNECTION = "proxy-connection";
  
  private static final String TE = "te";
  
  private static final String TRANSFER_ENCODING = "transfer-encoding";
  
  private static final String UPGRADE = "upgrade";
  
  private final Interceptor.Chain chain;
  
  private final Http2Connection connection;
  
  private final Protocol protocol;
  
  private Http2Stream stream;
  
  final StreamAllocation streamAllocation;
  
  public Http2Codec(OkHttpClient paramOkHttpClient, Interceptor.Chain paramChain, StreamAllocation paramStreamAllocation, Http2Connection paramHttp2Connection) {
    Protocol protocol;
    this.chain = paramChain;
    this.streamAllocation = paramStreamAllocation;
    this.connection = paramHttp2Connection;
    if (paramOkHttpClient.protocols().contains(Protocol.H2_PRIOR_KNOWLEDGE)) {
      protocol = Protocol.H2_PRIOR_KNOWLEDGE;
    } else {
      protocol = Protocol.HTTP_2;
    } 
    this.protocol = protocol;
  }
  
  public static List<Header> http2HeadersList(Request paramRequest) {
    Headers headers = paramRequest.headers();
    ArrayList<Header> arrayList = new ArrayList(headers.size() + 4);
    arrayList.add(new Header(Header.TARGET_METHOD, paramRequest.method()));
    arrayList.add(new Header(Header.TARGET_PATH, RequestLine.requestPath(paramRequest.url())));
    String str = paramRequest.header("Host");
    if (str != null)
      arrayList.add(new Header(Header.TARGET_AUTHORITY, str)); 
    arrayList.add(new Header(Header.TARGET_SCHEME, paramRequest.url().scheme()));
    int i = 0;
    int j = headers.size();
    while (i < j) {
      f f = f.d(headers.name(i).toLowerCase(Locale.US));
      if (!HTTP_2_SKIPPED_REQUEST_HEADERS.contains(f.v()))
        arrayList.add(new Header(f, headers.value(i))); 
      i++;
    } 
    return arrayList;
  }
  
  public static Response.Builder readHttp2HeadersList(Headers paramHeaders, Protocol paramProtocol) {
    Headers.Builder builder = new Headers.Builder();
    int j = paramHeaders.size();
    StringBuilder stringBuilder = null;
    int i = 0;
    while (i < j) {
      StringBuilder stringBuilder1;
      String str2 = paramHeaders.name(i);
      String str1 = paramHeaders.value(i);
      if (str2.equals(":status")) {
        stringBuilder = new StringBuilder();
        stringBuilder.append("HTTP/1.1 ");
        stringBuilder.append(str1);
        StatusLine statusLine = StatusLine.parse(stringBuilder.toString());
      } else {
        stringBuilder1 = stringBuilder;
        if (!HTTP_2_SKIPPED_RESPONSE_HEADERS.contains(str2)) {
          Internal.instance.addLenient(builder, str2, str1);
          stringBuilder1 = stringBuilder;
        } 
      } 
      i++;
      stringBuilder = stringBuilder1;
    } 
    if (stringBuilder != null)
      return (new Response.Builder()).protocol(paramProtocol).code(((StatusLine)stringBuilder).code).message(((StatusLine)stringBuilder).message).headers(builder.build()); 
    ProtocolException protocolException = new ProtocolException("Expected ':status' header not present");
    throw protocolException;
  }
  
  public void cancel() {
    Http2Stream http2Stream = this.stream;
    if (http2Stream != null)
      http2Stream.closeLater(ErrorCode.CANCEL); 
  }
  
  public s createRequestBody(Request paramRequest, long paramLong) {
    return this.stream.getSink();
  }
  
  public void finishRequest() {
    this.stream.getSink().close();
  }
  
  public void flushRequest() {
    this.connection.flush();
  }
  
  public ResponseBody openResponseBody(Response paramResponse) {
    StreamAllocation streamAllocation = this.streamAllocation;
    streamAllocation.eventListener.responseBodyStart(streamAllocation.call);
    return (ResponseBody)new RealResponseBody(paramResponse.header("Content-Type"), HttpHeaders.contentLength(paramResponse), l.a((t)new StreamFinishingSource(this.stream.getSource())));
  }
  
  public Response.Builder readResponseHeaders(boolean paramBoolean) {
    Response.Builder builder = readHttp2HeadersList(this.stream.takeHeaders(), this.protocol);
    return (paramBoolean && Internal.instance.code(builder) == 100) ? null : builder;
  }
  
  public void writeRequestHeaders(Request paramRequest) {
    boolean bool;
    if (this.stream != null)
      return; 
    if (paramRequest.body() != null) {
      bool = true;
    } else {
      bool = false;
    } 
    List<Header> list = http2HeadersList(paramRequest);
    this.stream = this.connection.newStream(list, bool);
    this.stream.readTimeout().timeout(this.chain.readTimeoutMillis(), TimeUnit.MILLISECONDS);
    this.stream.writeTimeout().timeout(this.chain.writeTimeoutMillis(), TimeUnit.MILLISECONDS);
  }
  
  class StreamFinishingSource extends h {
    long bytesRead = 0L;
    
    boolean completed = false;
    
    StreamFinishingSource(t param1t) {
      super(param1t);
    }
    
    private void endOfInput(IOException param1IOException) {
      if (this.completed)
        return; 
      this.completed = true;
      Http2Codec http2Codec = Http2Codec.this;
      http2Codec.streamAllocation.streamFinished(false, http2Codec, this.bytesRead, param1IOException);
    }
    
    public void close() {
      super.close();
      endOfInput(null);
    }
    
    public long read(c param1c, long param1Long) {
      try {
        param1Long = delegate().read(param1c, param1Long);
        if (param1Long > 0L)
          this.bytesRead += param1Long; 
        return param1Long;
      } catch (IOException iOException) {
        endOfInput(iOException);
        throw iOException;
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http2/Http2Codec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */