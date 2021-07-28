package okhttp3;

import j.c;
import j.e;
import java.io.Closeable;
import java.util.Collections;
import java.util.List;
import okhttp3.internal.http.HttpHeaders;

public final class Response implements Closeable {
  final ResponseBody body;
  
  private volatile CacheControl cacheControl;
  
  final Response cacheResponse;
  
  final int code;
  
  final Handshake handshake;
  
  final Headers headers;
  
  final String message;
  
  final Response networkResponse;
  
  final Response priorResponse;
  
  final Protocol protocol;
  
  final long receivedResponseAtMillis;
  
  final Request request;
  
  final long sentRequestAtMillis;
  
  Response(Builder paramBuilder) {
    this.request = paramBuilder.request;
    this.protocol = paramBuilder.protocol;
    this.code = paramBuilder.code;
    this.message = paramBuilder.message;
    this.handshake = paramBuilder.handshake;
    this.headers = paramBuilder.headers.build();
    this.body = paramBuilder.body;
    this.networkResponse = paramBuilder.networkResponse;
    this.cacheResponse = paramBuilder.cacheResponse;
    this.priorResponse = paramBuilder.priorResponse;
    this.sentRequestAtMillis = paramBuilder.sentRequestAtMillis;
    this.receivedResponseAtMillis = paramBuilder.receivedResponseAtMillis;
  }
  
  public ResponseBody body() {
    return this.body;
  }
  
  public CacheControl cacheControl() {
    CacheControl cacheControl = this.cacheControl;
    if (cacheControl != null)
      return cacheControl; 
    cacheControl = CacheControl.parse(this.headers);
    this.cacheControl = cacheControl;
    return cacheControl;
  }
  
  public Response cacheResponse() {
    return this.cacheResponse;
  }
  
  public List<Challenge> challenges() {
    String str;
    int i = this.code;
    if (i == 401) {
      str = "WWW-Authenticate";
    } else {
      if (i == 407) {
        str = "Proxy-Authenticate";
        return HttpHeaders.parseChallenges(headers(), str);
      } 
      return Collections.emptyList();
    } 
    return HttpHeaders.parseChallenges(headers(), str);
  }
  
  public void close() {
    ResponseBody responseBody = this.body;
    if (responseBody != null) {
      responseBody.close();
      return;
    } 
    throw new IllegalStateException("response is not eligible for a body and must not be closed");
  }
  
  public int code() {
    return this.code;
  }
  
  public Handshake handshake() {
    return this.handshake;
  }
  
  public String header(String paramString) {
    return header(paramString, null);
  }
  
  public String header(String paramString1, String paramString2) {
    paramString1 = this.headers.get(paramString1);
    return (paramString1 != null) ? paramString1 : paramString2;
  }
  
  public List<String> headers(String paramString) {
    return this.headers.values(paramString);
  }
  
  public Headers headers() {
    return this.headers;
  }
  
  public boolean isRedirect() {
    int i = this.code;
    if (i != 307 && i != 308)
      switch (i) {
        default:
          return false;
        case 300:
        case 301:
        case 302:
        case 303:
          break;
      }  
    return true;
  }
  
  public boolean isSuccessful() {
    int i = this.code;
    return (i >= 200 && i < 300);
  }
  
  public String message() {
    return this.message;
  }
  
  public Response networkResponse() {
    return this.networkResponse;
  }
  
  public Builder newBuilder() {
    return new Builder(this);
  }
  
  public ResponseBody peekBody(long paramLong) {
    e e = this.body.source();
    e.d(paramLong);
    c c2 = e.f().clone();
    c c1 = c2;
    if (c2.s() > paramLong) {
      c1 = new c();
      c1.write(c2, paramLong);
      c2.a();
    } 
    return ResponseBody.create(this.body.contentType(), c1.s(), (e)c1);
  }
  
  public Response priorResponse() {
    return this.priorResponse;
  }
  
  public Protocol protocol() {
    return this.protocol;
  }
  
  public long receivedResponseAtMillis() {
    return this.receivedResponseAtMillis;
  }
  
  public Request request() {
    return this.request;
  }
  
  public long sentRequestAtMillis() {
    return this.sentRequestAtMillis;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Response{protocol=");
    stringBuilder.append(this.protocol);
    stringBuilder.append(", code=");
    stringBuilder.append(this.code);
    stringBuilder.append(", message=");
    stringBuilder.append(this.message);
    stringBuilder.append(", url=");
    stringBuilder.append(this.request.url());
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public static class Builder {
    ResponseBody body;
    
    Response cacheResponse;
    
    int code = -1;
    
    Handshake handshake;
    
    Headers.Builder headers;
    
    String message;
    
    Response networkResponse;
    
    Response priorResponse;
    
    Protocol protocol;
    
    long receivedResponseAtMillis;
    
    Request request;
    
    long sentRequestAtMillis;
    
    public Builder() {
      this.headers = new Headers.Builder();
    }
    
    Builder(Response param1Response) {
      this.request = param1Response.request;
      this.protocol = param1Response.protocol;
      this.code = param1Response.code;
      this.message = param1Response.message;
      this.handshake = param1Response.handshake;
      this.headers = param1Response.headers.newBuilder();
      this.body = param1Response.body;
      this.networkResponse = param1Response.networkResponse;
      this.cacheResponse = param1Response.cacheResponse;
      this.priorResponse = param1Response.priorResponse;
      this.sentRequestAtMillis = param1Response.sentRequestAtMillis;
      this.receivedResponseAtMillis = param1Response.receivedResponseAtMillis;
    }
    
    private void checkPriorResponse(Response param1Response) {
      if (param1Response.body == null)
        return; 
      throw new IllegalArgumentException("priorResponse.body != null");
    }
    
    private void checkSupportResponse(String param1String, Response param1Response) {
      if (param1Response.body == null) {
        if (param1Response.networkResponse == null) {
          if (param1Response.cacheResponse == null) {
            if (param1Response.priorResponse == null)
              return; 
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append(param1String);
            stringBuilder3.append(".priorResponse != null");
            throw new IllegalArgumentException(stringBuilder3.toString());
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append(param1String);
          stringBuilder2.append(".cacheResponse != null");
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(param1String);
        stringBuilder1.append(".networkResponse != null");
        throw new IllegalArgumentException(stringBuilder1.toString());
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(param1String);
      stringBuilder.append(".body != null");
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public Builder addHeader(String param1String1, String param1String2) {
      this.headers.add(param1String1, param1String2);
      return this;
    }
    
    public Builder body(ResponseBody param1ResponseBody) {
      this.body = param1ResponseBody;
      return this;
    }
    
    public Response build() {
      if (this.request != null) {
        if (this.protocol != null) {
          if (this.code >= 0) {
            if (this.message != null)
              return new Response(this); 
            throw new IllegalStateException("message == null");
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("code < 0: ");
          stringBuilder.append(this.code);
          throw new IllegalStateException(stringBuilder.toString());
        } 
        throw new IllegalStateException("protocol == null");
      } 
      throw new IllegalStateException("request == null");
    }
    
    public Builder cacheResponse(Response param1Response) {
      if (param1Response != null)
        checkSupportResponse("cacheResponse", param1Response); 
      this.cacheResponse = param1Response;
      return this;
    }
    
    public Builder code(int param1Int) {
      this.code = param1Int;
      return this;
    }
    
    public Builder handshake(Handshake param1Handshake) {
      this.handshake = param1Handshake;
      return this;
    }
    
    public Builder header(String param1String1, String param1String2) {
      this.headers.set(param1String1, param1String2);
      return this;
    }
    
    public Builder headers(Headers param1Headers) {
      this.headers = param1Headers.newBuilder();
      return this;
    }
    
    public Builder message(String param1String) {
      this.message = param1String;
      return this;
    }
    
    public Builder networkResponse(Response param1Response) {
      if (param1Response != null)
        checkSupportResponse("networkResponse", param1Response); 
      this.networkResponse = param1Response;
      return this;
    }
    
    public Builder priorResponse(Response param1Response) {
      if (param1Response != null)
        checkPriorResponse(param1Response); 
      this.priorResponse = param1Response;
      return this;
    }
    
    public Builder protocol(Protocol param1Protocol) {
      this.protocol = param1Protocol;
      return this;
    }
    
    public Builder receivedResponseAtMillis(long param1Long) {
      this.receivedResponseAtMillis = param1Long;
      return this;
    }
    
    public Builder removeHeader(String param1String) {
      this.headers.removeAll(param1String);
      return this;
    }
    
    public Builder request(Request param1Request) {
      this.request = param1Request;
      return this;
    }
    
    public Builder sentRequestAtMillis(long param1Long) {
      this.sentRequestAtMillis = param1Long;
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Response.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */