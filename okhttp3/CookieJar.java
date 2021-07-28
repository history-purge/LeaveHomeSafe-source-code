package okhttp3;

import java.util.Collections;
import java.util.List;

public interface CookieJar {
  public static final CookieJar NO_COOKIES = new CookieJar() {
      public List<Cookie> loadForRequest(HttpUrl param1HttpUrl) {
        return Collections.emptyList();
      }
      
      public void saveFromResponse(HttpUrl param1HttpUrl, List<Cookie> param1List) {}
    };
  
  List<Cookie> loadForRequest(HttpUrl paramHttpUrl);
  
  void saveFromResponse(HttpUrl paramHttpUrl, List<Cookie> paramList);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/CookieJar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */