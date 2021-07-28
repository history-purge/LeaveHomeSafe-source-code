package okhttp3.internal.cache;

import j.c;
import j.d;
import j.e;
import j.l;
import j.s;
import j.t;
import j.u;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;
import okhttp3.Headers;
import okhttp3.Interceptor;
import okhttp3.Protocol;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;
import okhttp3.internal.Internal;
import okhttp3.internal.Util;
import okhttp3.internal.http.RealResponseBody;

public final class CacheInterceptor implements Interceptor {
  final InternalCache cache;
  
  public CacheInterceptor(InternalCache paramInternalCache) {
    this.cache = paramInternalCache;
  }
  
  private Response cacheWritingResponse(final CacheRequest cacheRequest, Response paramResponse) {
    if (cacheRequest == null)
      return paramResponse; 
    s s = cacheRequest.body();
    if (s == null)
      return paramResponse; 
    t t = new t() {
        boolean cacheRequestClosed;
        
        public void close() {
          if (!this.cacheRequestClosed && !Util.discard(this, 100, TimeUnit.MILLISECONDS)) {
            this.cacheRequestClosed = true;
            cacheRequest.abort();
          } 
          source.close();
        }
        
        public long read(c param1c, long param1Long) {
          try {
            param1Long = source.read(param1c, param1Long);
            if (param1Long == -1L) {
              if (!this.cacheRequestClosed) {
                this.cacheRequestClosed = true;
                cacheBody.close();
              } 
              return -1L;
            } 
            param1c.a(cacheBody.f(), param1c.s() - param1Long, param1Long);
            cacheBody.p();
            return param1Long;
          } catch (IOException iOException) {
            if (!this.cacheRequestClosed) {
              this.cacheRequestClosed = true;
              cacheRequest.abort();
            } 
            throw iOException;
          } 
        }
        
        public u timeout() {
          return source.timeout();
        }
      };
    String str = paramResponse.header("Content-Type");
    long l = paramResponse.body().contentLength();
    return paramResponse.newBuilder().body((ResponseBody)new RealResponseBody(str, l, l.a(t))).build();
  }
  
  private static Headers combine(Headers paramHeaders1, Headers paramHeaders2) {
    Headers.Builder builder = new Headers.Builder();
    int j = paramHeaders1.size();
    boolean bool = false;
    int i;
    for (i = 0; i < j; i++) {
      String str1 = paramHeaders1.name(i);
      String str2 = paramHeaders1.value(i);
      if ((!"Warning".equalsIgnoreCase(str1) || !str2.startsWith("1")) && (isContentSpecificHeader(str1) || !isEndToEnd(str1) || paramHeaders2.get(str1) == null))
        Internal.instance.addLenient(builder, str1, str2); 
    } 
    j = paramHeaders2.size();
    for (i = bool; i < j; i++) {
      String str = paramHeaders2.name(i);
      if (!isContentSpecificHeader(str) && isEndToEnd(str))
        Internal.instance.addLenient(builder, str, paramHeaders2.value(i)); 
    } 
    return builder.build();
  }
  
  static boolean isContentSpecificHeader(String paramString) {
    return ("Content-Length".equalsIgnoreCase(paramString) || "Content-Encoding".equalsIgnoreCase(paramString) || "Content-Type".equalsIgnoreCase(paramString));
  }
  
  static boolean isEndToEnd(String paramString) {
    return (!"Connection".equalsIgnoreCase(paramString) && !"Keep-Alive".equalsIgnoreCase(paramString) && !"Proxy-Authenticate".equalsIgnoreCase(paramString) && !"Proxy-Authorization".equalsIgnoreCase(paramString) && !"TE".equalsIgnoreCase(paramString) && !"Trailers".equalsIgnoreCase(paramString) && !"Transfer-Encoding".equalsIgnoreCase(paramString) && !"Upgrade".equalsIgnoreCase(paramString));
  }
  
  private static Response stripBody(Response paramResponse) {
    Response response = paramResponse;
    if (paramResponse != null) {
      response = paramResponse;
      if (paramResponse.body() != null)
        response = paramResponse.newBuilder().body(null).build(); 
    } 
    return response;
  }
  
  public Response intercept(Interceptor.Chain paramChain) {
    InternalCache internalCache1 = this.cache;
    if (internalCache1 != null) {
      Response response1 = internalCache1.get(paramChain.request());
    } else {
      internalCache1 = null;
    } 
    CacheStrategy cacheStrategy = (new CacheStrategy.Factory(System.currentTimeMillis(), paramChain.request(), (Response)internalCache1)).get();
    Request request = cacheStrategy.networkRequest;
    Response response = cacheStrategy.cacheResponse;
    InternalCache internalCache2 = this.cache;
    if (internalCache2 != null)
      internalCache2.trackResponse(cacheStrategy); 
    if (internalCache1 != null && response == null)
      Util.closeQuietly((Closeable)internalCache1.body()); 
    if (request == null && response == null)
      return (new Response.Builder()).request(paramChain.request()).protocol(Protocol.HTTP_1_1).code(504).message("Unsatisfiable Request (only-if-cached)").body(Util.EMPTY_RESPONSE).sentRequestAtMillis(-1L).receivedResponseAtMillis(System.currentTimeMillis()).build(); 
    if (request == null)
      return response.newBuilder().cacheResponse(stripBody(response)).build(); 
    try {
      Response response1 = paramChain.proceed(request);
      if (response1 == null && internalCache1 != null)
        Util.closeQuietly((Closeable)internalCache1.body()); 
      if (response != null) {
        if (response1.code() == 304) {
          Response response2 = response.newBuilder().headers(combine(response.headers(), response1.headers())).sentRequestAtMillis(response1.sentRequestAtMillis()).receivedResponseAtMillis(response1.receivedResponseAtMillis()).cacheResponse(stripBody(response)).networkResponse(stripBody(response1)).build();
          response1.body().close();
          this.cache.trackConditionalCacheHit();
          return response2;
        } 
        Util.closeQuietly((Closeable)response.body());
      } 
      response1 = response1.newBuilder().cacheResponse(stripBody(response)).networkResponse(stripBody(response1)).build();
      return response1;
    } finally {
      if (iOException != null)
        Util.closeQuietly((Closeable)iOException.body()); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/cache/CacheInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */