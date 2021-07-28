package okhttp3.internal.http;

import java.io.Closeable;
import java.io.IOException;
import java.net.HttpRetryException;
import java.net.ProtocolException;
import java.net.Proxy;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.Address;
import okhttp3.Call;
import okhttp3.CertificatePinner;
import okhttp3.EventListener;
import okhttp3.HttpUrl;
import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.Route;
import okhttp3.internal.Util;
import okhttp3.internal.connection.RouteException;
import okhttp3.internal.connection.StreamAllocation;

public final class RetryAndFollowUpInterceptor implements Interceptor {
  private static final int MAX_FOLLOW_UPS = 20;
  
  private Object callStackTrace;
  
  private volatile boolean canceled;
  
  private final OkHttpClient client;
  
  private final boolean forWebSocket;
  
  private volatile StreamAllocation streamAllocation;
  
  public RetryAndFollowUpInterceptor(OkHttpClient paramOkHttpClient, boolean paramBoolean) {
    this.client = paramOkHttpClient;
    this.forWebSocket = paramBoolean;
  }
  
  private Address createAddress(HttpUrl paramHttpUrl) {
    SSLSocketFactory sSLSocketFactory1;
    SSLSocketFactory sSLSocketFactory2;
    SSLSocketFactory sSLSocketFactory3;
    if (paramHttpUrl.isHttps()) {
      sSLSocketFactory2 = this.client.sslSocketFactory();
      sSLSocketFactory1 = (SSLSocketFactory)this.client.hostnameVerifier();
      CertificatePinner certificatePinner = this.client.certificatePinner();
      sSLSocketFactory3 = (SSLSocketFactory)certificatePinner;
    } else {
      SSLSocketFactory sSLSocketFactory = null;
      sSLSocketFactory1 = sSLSocketFactory;
      sSLSocketFactory3 = sSLSocketFactory1;
      sSLSocketFactory2 = sSLSocketFactory;
    } 
    return new Address(paramHttpUrl.host(), paramHttpUrl.port(), this.client.dns(), this.client.socketFactory(), sSLSocketFactory2, (HostnameVerifier)sSLSocketFactory1, (CertificatePinner)sSLSocketFactory3, this.client.proxyAuthenticator(), this.client.proxy(), this.client.protocols(), this.client.connectionSpecs(), this.client.proxySelector());
  }
  
  private Request followUpRequest(Response paramResponse, Route paramRoute) {
    if (paramResponse != null) {
      int i = paramResponse.code();
      String str2 = paramResponse.request().method();
      Proxy proxy = null;
      if (i != 307 && i != 308) {
        if (i != 401) {
          if (i != 503) {
            if (i != 407) {
              if (i != 408) {
                switch (i) {
                  default:
                    return null;
                  case 300:
                  case 301:
                  case 302:
                  case 303:
                    break;
                } 
              } else {
                return !this.client.retryOnConnectionFailure() ? null : ((paramResponse.request().body() instanceof UnrepeatableRequestBody) ? null : ((paramResponse.priorResponse() != null && paramResponse.priorResponse().code() == 408) ? null : ((retryAfter(paramResponse, 0) > 0) ? null : paramResponse.request())));
              } 
            } else {
              if (paramRoute != null) {
                proxy = paramRoute.proxy();
              } else {
                proxy = this.client.proxy();
              } 
              if (proxy.type() == Proxy.Type.HTTP)
                return this.client.proxyAuthenticator().authenticate(paramRoute, paramResponse); 
              throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            } 
          } else {
            return (paramResponse.priorResponse() != null && paramResponse.priorResponse().code() == 503) ? null : ((retryAfter(paramResponse, 2147483647) == 0) ? paramResponse.request() : null);
          } 
        } else {
          return this.client.authenticator().authenticate(paramRoute, paramResponse);
        } 
      } else if (!str2.equals("GET") && !str2.equals("HEAD")) {
        return null;
      } 
      if (!this.client.followRedirects())
        return null; 
      String str1 = paramResponse.header("Location");
      if (str1 == null)
        return null; 
      HttpUrl httpUrl = paramResponse.request().url().resolve(str1);
      if (httpUrl == null)
        return null; 
      if (!httpUrl.scheme().equals(paramResponse.request().url().scheme()) && !this.client.followSslRedirects())
        return null; 
      Request.Builder builder = paramResponse.request().newBuilder();
      if (HttpMethod.permitsRequestBody(str2)) {
        boolean bool = HttpMethod.redirectsWithBody(str2);
        if (HttpMethod.redirectsToGet(str2)) {
          builder.method("GET", null);
        } else {
          RequestBody requestBody;
          Proxy proxy1 = proxy;
          if (bool)
            requestBody = paramResponse.request().body(); 
          builder.method(str2, requestBody);
        } 
        if (!bool) {
          builder.removeHeader("Transfer-Encoding");
          builder.removeHeader("Content-Length");
          builder.removeHeader("Content-Type");
        } 
      } 
      if (!sameConnection(paramResponse, httpUrl))
        builder.removeHeader("Authorization"); 
      return builder.url(httpUrl).build();
    } 
    throw new IllegalStateException();
  }
  
  private boolean isRecoverable(IOException paramIOException, boolean paramBoolean) {
    boolean bool = paramIOException instanceof ProtocolException;
    boolean bool1 = false;
    if (bool)
      return false; 
    if (paramIOException instanceof java.io.InterruptedIOException) {
      bool = bool1;
      if (paramIOException instanceof java.net.SocketTimeoutException) {
        bool = bool1;
        if (!paramBoolean)
          bool = true; 
      } 
      return bool;
    } 
    return (paramIOException instanceof javax.net.ssl.SSLHandshakeException && paramIOException.getCause() instanceof java.security.cert.CertificateException) ? false : (!(paramIOException instanceof javax.net.ssl.SSLPeerUnverifiedException));
  }
  
  private boolean recover(IOException paramIOException, StreamAllocation paramStreamAllocation, boolean paramBoolean, Request paramRequest) {
    paramStreamAllocation.streamFailed(paramIOException);
    return !this.client.retryOnConnectionFailure() ? false : ((paramBoolean && paramRequest.body() instanceof UnrepeatableRequestBody) ? false : (!isRecoverable(paramIOException, paramBoolean) ? false : (!!paramStreamAllocation.hasMoreRoutes())));
  }
  
  private int retryAfter(Response paramResponse, int paramInt) {
    String str = paramResponse.header("Retry-After");
    return (str == null) ? paramInt : (str.matches("\\d+") ? Integer.valueOf(str).intValue() : Integer.MAX_VALUE);
  }
  
  private boolean sameConnection(Response paramResponse, HttpUrl paramHttpUrl) {
    HttpUrl httpUrl = paramResponse.request().url();
    return (httpUrl.host().equals(paramHttpUrl.host()) && httpUrl.port() == paramHttpUrl.port() && httpUrl.scheme().equals(paramHttpUrl.scheme()));
  }
  
  public void cancel() {
    this.canceled = true;
    StreamAllocation streamAllocation = this.streamAllocation;
    if (streamAllocation != null)
      streamAllocation.cancel(); 
  }
  
  public Response intercept(Interceptor.Chain paramChain) {
    Request request2 = paramChain.request();
    RealInterceptorChain realInterceptorChain = (RealInterceptorChain)paramChain;
    Call call = realInterceptorChain.call();
    EventListener eventListener = realInterceptorChain.eventListener();
    StreamAllocation streamAllocation = new StreamAllocation(this.client.connectionPool(), createAddress(request2.url()), call, eventListener, this.callStackTrace);
    this.streamAllocation = streamAllocation;
    Response response = null;
    int i = 0;
    Request request1 = request2;
    while (true) {
      StringBuilder stringBuilder;
      if (!this.canceled) {
        try {
          Response response2 = realInterceptorChain.proceed(request1, streamAllocation, null, null);
          Response response1 = response2;
          if (response != null)
            response1 = response2.newBuilder().priorResponse(response.newBuilder().body(null).build()).build(); 
          try {
            Request request = followUpRequest(response1, streamAllocation.route());
            if (request == null) {
              streamAllocation.release();
              return response1;
            } 
            Util.closeQuietly((Closeable)response1.body());
            if (++i <= 20) {
              Request request3;
              if (!(request.body() instanceof UnrepeatableRequestBody)) {
                if (!sameConnection(response1, request.url())) {
                  streamAllocation.release();
                  streamAllocation = new StreamAllocation(this.client.connectionPool(), createAddress(request.url()), call, eventListener, this.callStackTrace);
                  this.streamAllocation = streamAllocation;
                } else if (streamAllocation.codec() != null) {
                  stringBuilder = new StringBuilder();
                  stringBuilder.append("Closing the body of ");
                  stringBuilder.append(response1);
                  stringBuilder.append(" didn't close its backing stream. Bad interceptor?");
                  throw new IllegalStateException(stringBuilder.toString());
                } 
                response = response1;
                request3 = request;
                continue;
              } 
              stringBuilder.release();
              throw new HttpRetryException("Cannot retry streamed HTTP body", request3.code());
            } 
            stringBuilder.release();
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Too many follow-up requests: ");
            stringBuilder1.append(i);
            throw new ProtocolException(stringBuilder1.toString());
          } catch (IOException iOException1) {
            stringBuilder.release();
            throw iOException1;
          } 
        } catch (RouteException routeException) {
          if (recover(routeException.getLastConnectException(), (StreamAllocation)stringBuilder, false, (Request)iOException1))
            continue; 
          throw routeException.getFirstConnectException();
        } catch (IOException iOException2) {
          boolean bool;
          if (!(iOException2 instanceof okhttp3.internal.http2.ConnectionShutdownException)) {
            bool = true;
          } else {
            bool = false;
          } 
          if (recover(iOException2, (StreamAllocation)stringBuilder, bool, (Request)iOException1))
            continue; 
          throw iOException2;
        } finally {}
        stringBuilder.streamFailed(null);
        stringBuilder.release();
        throw iOException1;
      } 
      stringBuilder.release();
      IOException iOException = new IOException("Canceled");
      throw iOException;
    } 
  }
  
  public boolean isCanceled() {
    return this.canceled;
  }
  
  public void setCallStackTrace(Object paramObject) {
    this.callStackTrace = paramObject;
  }
  
  public StreamAllocation streamAllocation() {
    return this.streamAllocation;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http/RetryAndFollowUpInterceptor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */