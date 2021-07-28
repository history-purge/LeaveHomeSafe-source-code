package okhttp3.internal.http;

import java.net.Proxy;
import okhttp3.HttpUrl;
import okhttp3.Request;

public final class RequestLine {
  public static String get(Request paramRequest, Proxy.Type paramType) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramRequest.method());
    stringBuilder.append(' ');
    boolean bool = includeAuthorityInRequestLine(paramRequest, paramType);
    HttpUrl httpUrl = paramRequest.url();
    if (bool) {
      stringBuilder.append(httpUrl);
    } else {
      stringBuilder.append(requestPath(httpUrl));
    } 
    stringBuilder.append(" HTTP/1.1");
    return stringBuilder.toString();
  }
  
  private static boolean includeAuthorityInRequestLine(Request paramRequest, Proxy.Type paramType) {
    return (!paramRequest.isHttps() && paramType == Proxy.Type.HTTP);
  }
  
  public static String requestPath(HttpUrl paramHttpUrl) {
    String str2 = paramHttpUrl.encodedPath();
    String str3 = paramHttpUrl.encodedQuery();
    String str1 = str2;
    if (str3 != null) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(str2);
      stringBuilder.append('?');
      stringBuilder.append(str3);
      str1 = stringBuilder.toString();
    } 
    return str1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/internal/http/RequestLine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */