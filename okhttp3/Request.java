package okhttp3;

import java.net.URL;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import okhttp3.internal.http.HttpMethod;

public final class Request {
  final RequestBody body;
  
  private volatile CacheControl cacheControl;
  
  final Headers headers;
  
  final String method;
  
  final Map<Class<?>, Object> tags;
  
  final HttpUrl url;
  
  Request(Builder paramBuilder) {
    this.url = paramBuilder.url;
    this.method = paramBuilder.method;
    this.headers = paramBuilder.headers.build();
    this.body = paramBuilder.body;
    this.tags = Util.immutableMap(paramBuilder.tags);
  }
  
  public RequestBody body() {
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
  
  public String header(String paramString) {
    return this.headers.get(paramString);
  }
  
  public List<String> headers(String paramString) {
    return this.headers.values(paramString);
  }
  
  public Headers headers() {
    return this.headers;
  }
  
  public boolean isHttps() {
    return this.url.isHttps();
  }
  
  public String method() {
    return this.method;
  }
  
  public Builder newBuilder() {
    return new Builder(this);
  }
  
  public Object tag() {
    return tag(Object.class);
  }
  
  public <T> T tag(Class<? extends T> paramClass) {
    return paramClass.cast(this.tags.get(paramClass));
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Request{method=");
    stringBuilder.append(this.method);
    stringBuilder.append(", url=");
    stringBuilder.append(this.url);
    stringBuilder.append(", tags=");
    stringBuilder.append(this.tags);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public HttpUrl url() {
    return this.url;
  }
  
  public static class Builder {
    RequestBody body;
    
    Headers.Builder headers;
    
    String method;
    
    Map<Class<?>, Object> tags;
    
    HttpUrl url;
    
    public Builder() {
      this.tags = Collections.emptyMap();
      this.method = "GET";
      this.headers = new Headers.Builder();
    }
    
    Builder(Request param1Request) {
      Map<?, ?> map;
      this.tags = Collections.emptyMap();
      this.url = param1Request.url;
      this.method = param1Request.method;
      this.body = param1Request.body;
      if (param1Request.tags.isEmpty()) {
        map = Collections.emptyMap();
      } else {
        map = new LinkedHashMap<Class<?>, Object>(param1Request.tags);
      } 
      this.tags = (Map)map;
      this.headers = param1Request.headers.newBuilder();
    }
    
    public Builder addHeader(String param1String1, String param1String2) {
      this.headers.add(param1String1, param1String2);
      return this;
    }
    
    public Request build() {
      if (this.url != null)
        return new Request(this); 
      throw new IllegalStateException("url == null");
    }
    
    public Builder cacheControl(CacheControl param1CacheControl) {
      String str = param1CacheControl.toString();
      return str.isEmpty() ? removeHeader("Cache-Control") : header("Cache-Control", str);
    }
    
    public Builder delete() {
      return delete(Util.EMPTY_REQUEST);
    }
    
    public Builder delete(RequestBody param1RequestBody) {
      return method("DELETE", param1RequestBody);
    }
    
    public Builder get() {
      return method("GET", null);
    }
    
    public Builder head() {
      return method("HEAD", null);
    }
    
    public Builder header(String param1String1, String param1String2) {
      this.headers.set(param1String1, param1String2);
      return this;
    }
    
    public Builder headers(Headers param1Headers) {
      this.headers = param1Headers.newBuilder();
      return this;
    }
    
    public Builder method(String param1String, RequestBody param1RequestBody) {
      if (param1String != null) {
        if (param1String.length() != 0) {
          if (param1RequestBody == null || HttpMethod.permitsRequestBody(param1String)) {
            if (param1RequestBody != null || !HttpMethod.requiresRequestBody(param1String)) {
              this.method = param1String;
              this.body = param1RequestBody;
              return this;
            } 
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append("method ");
            stringBuilder1.append(param1String);
            stringBuilder1.append(" must have a request body.");
            throw new IllegalArgumentException(stringBuilder1.toString());
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("method ");
          stringBuilder.append(param1String);
          stringBuilder.append(" must not have a request body.");
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        throw new IllegalArgumentException("method.length() == 0");
      } 
      throw new NullPointerException("method == null");
    }
    
    public Builder patch(RequestBody param1RequestBody) {
      return method("PATCH", param1RequestBody);
    }
    
    public Builder post(RequestBody param1RequestBody) {
      return method("POST", param1RequestBody);
    }
    
    public Builder put(RequestBody param1RequestBody) {
      return method("PUT", param1RequestBody);
    }
    
    public Builder removeHeader(String param1String) {
      this.headers.removeAll(param1String);
      return this;
    }
    
    public <T> Builder tag(Class<? super T> param1Class, T param1T) {
      if (param1Class != null) {
        if (param1T == null) {
          this.tags.remove(param1Class);
          return this;
        } 
        if (this.tags.isEmpty())
          this.tags = new LinkedHashMap<Class<?>, Object>(); 
        this.tags.put(param1Class, param1Class.cast(param1T));
        return this;
      } 
      throw new NullPointerException("type == null");
    }
    
    public Builder tag(Object param1Object) {
      return tag(Object.class, param1Object);
    }
    
    public Builder url(String param1String) {
      if (param1String != null) {
        byte b;
        StringBuilder stringBuilder;
        if (param1String.regionMatches(true, 0, "ws:", 0, 3)) {
          stringBuilder = new StringBuilder();
          stringBuilder.append("http:");
          b = 3;
        } else {
          String str1 = param1String;
          if (param1String.regionMatches(true, 0, "wss:", 0, 4)) {
            stringBuilder = new StringBuilder();
            stringBuilder.append("https:");
            b = 4;
          } else {
            return url(HttpUrl.get((String)stringBuilder));
          } 
        } 
        stringBuilder.append(param1String.substring(b));
        String str = stringBuilder.toString();
        return url(HttpUrl.get(str));
      } 
      NullPointerException nullPointerException = new NullPointerException("url == null");
      throw nullPointerException;
    }
    
    public Builder url(URL param1URL) {
      if (param1URL != null)
        return url(HttpUrl.get(param1URL.toString())); 
      throw new NullPointerException("url == null");
    }
    
    public Builder url(HttpUrl param1HttpUrl) {
      if (param1HttpUrl != null) {
        this.url = param1HttpUrl;
        return this;
      } 
      throw new NullPointerException("url == null");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/Request.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */