package okhttp3.internal.http;

import j.c;
import j.d;
import j.g;
import j.l;
import j.s;
import java.net.ProtocolException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RealConnection;
import okhttp3.internal.connection.StreamAllocation;

public final class CallServerInterceptor implements Interceptor {
  private final boolean forWebSocket;
  
  public CallServerInterceptor(boolean paramBoolean) {
    this.forWebSocket = paramBoolean;
  }
  
  public Response intercept(Interceptor.Chain paramChain) {
    Response.Builder builder1;
    ResponseBody responseBody;
    RealInterceptorChain realInterceptorChain = (RealInterceptorChain)paramChain;
    HttpCodec httpCodec = realInterceptorChain.httpStream();
    StreamAllocation streamAllocation = realInterceptorChain.streamAllocation();
    RealConnection realConnection = (RealConnection)realInterceptorChain.connection();
    Request request = realInterceptorChain.request();
    long l = System.currentTimeMillis();
    realInterceptorChain.eventListener().requestHeadersStart(realInterceptorChain.call());
    httpCodec.writeRequestHeaders(request);
    realInterceptorChain.eventListener().requestHeadersEnd(realInterceptorChain.call(), request);
    boolean bool = HttpMethod.permitsRequestBody(request.method());
    Interceptor.Chain chain = null;
    Response.Builder builder2 = null;
    paramChain = chain;
    if (bool) {
      paramChain = chain;
      if (request.body() != null) {
        if ("100-continue".equalsIgnoreCase(request.header("Expect"))) {
          httpCodec.flushRequest();
          realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
          builder2 = httpCodec.readResponseHeaders(true);
        } 
        if (builder2 == null) {
          realInterceptorChain.eventListener().requestBodyStart(realInterceptorChain.call());
          CountingSink countingSink = new CountingSink(httpCodec.createRequestBody(request, request.body().contentLength()));
          d d = l.a((s)countingSink);
          request.body().writeTo(d);
          d.close();
          realInterceptorChain.eventListener().requestBodyEnd(realInterceptorChain.call(), countingSink.successfulCount);
          builder1 = builder2;
        } else {
          builder1 = builder2;
          if (!realConnection.isMultiplexed()) {
            streamAllocation.noNewStreams();
            builder1 = builder2;
          } 
        } 
      } 
    } 
    httpCodec.finishRequest();
    builder2 = builder1;
    if (builder1 == null) {
      realInterceptorChain.eventListener().responseHeadersStart(realInterceptorChain.call());
      builder2 = httpCodec.readResponseHeaders(false);
    } 
    Response response2 = builder2.request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(l).receivedResponseAtMillis(System.currentTimeMillis()).build();
    int j = response2.code();
    int i = j;
    if (j == 100) {
      response2 = httpCodec.readResponseHeaders(false).request(request).handshake(streamAllocation.connection().handshake()).sentRequestAtMillis(l).receivedResponseAtMillis(System.currentTimeMillis()).build();
      i = response2.code();
    } 
    realInterceptorChain.eventListener().responseHeadersEnd(realInterceptorChain.call(), response2);
    if (this.forWebSocket && i == 101) {
      builder2 = response2.newBuilder();
      responseBody = Util.EMPTY_RESPONSE;
    } else {
      builder2 = responseBody.newBuilder();
      responseBody = httpCodec.openResponseBody((Response)responseBody);
    } 
    Response response1 = builder2.body(responseBody).build();
    if ("close".equalsIgnoreCase(response1.request().header("Connection")) || "close".equalsIgnoreCase(response1.header("Connection")))
      streamAllocation.noNewStreams(); 
    if ((i != 204 && i != 205) || response1.body().contentLength() <= 0L)
      return response1; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("HTTP ");
    stringBuilder.append(i);
    stringBuilder.append(" had non-zero Content-Length: ");
    stringBuilder.append(response1.body().contentLength());
    throw new ProtocolException(stringBuilder.toString());
  }
  
  static final class CountingSink extends g {
    long successfulCount;
    
    CountingSink(s param1s) {
      super(param1s);
    }
    
    public void write(c param1c, long param1Long) {
      super.write(param1c, param1Long);
      this.successfulCount += param1Long;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http/CallServerInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */