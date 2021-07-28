package okhttp3;

import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.internal.Util;
import okhttp3.internal.annotations.EverythingIsNonNull;
import okhttp3.internal.platform.Platform;

@EverythingIsNonNull
public final class JavaNetCookieJar implements CookieJar {
  private final CookieHandler cookieHandler;
  
  public JavaNetCookieJar(CookieHandler paramCookieHandler) {
    this.cookieHandler = paramCookieHandler;
  }
  
  private List<Cookie> decodeHeaderAsJavaNetCookies(HttpUrl paramHttpUrl, String paramString) {
    ArrayList<Cookie> arrayList = new ArrayList();
    int j = paramString.length();
    for (int i = 0; i < j; i = k + 1) {
      int k = Util.delimiterOffset(paramString, i, j, ";,");
      int m = Util.delimiterOffset(paramString, i, k, '=');
      String str = Util.trimSubstring(paramString, i, m);
      if (!str.startsWith("$")) {
        String str1;
        if (m < k) {
          str1 = Util.trimSubstring(paramString, m + 1, k);
        } else {
          str1 = "";
        } 
        String str2 = str1;
        if (str1.startsWith("\"")) {
          str2 = str1;
          if (str1.endsWith("\""))
            str2 = str1.substring(1, str1.length() - 1); 
        } 
        arrayList.add((new Cookie.Builder()).name(str).value(str2).domain(paramHttpUrl.host()).build());
      } 
    } 
    return arrayList;
  }
  
  public List<Cookie> loadForRequest(HttpUrl paramHttpUrl) {
    Map<?, ?> map = Collections.emptyMap();
    try {
      ArrayList<Cookie> arrayList;
      Map<String, List<String>> map1 = this.cookieHandler.get(paramHttpUrl.uri(), (Map)map);
      map = null;
      label23: for (Map.Entry<String, List<String>> entry : map1.entrySet()) {
        String str = (String)entry.getKey();
        if (("Cookie".equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && !((List)entry.getValue()).isEmpty()) {
          Iterator<String> iterator = ((List)entry.getValue()).iterator();
          Map<?, ?> map2 = map;
          while (true) {
            map = map2;
            if (iterator.hasNext()) {
              String str1 = iterator.next();
              map = map2;
              if (map2 == null)
                arrayList = new ArrayList(); 
              arrayList.addAll(decodeHeaderAsJavaNetCookies(paramHttpUrl, str1));
              ArrayList<Cookie> arrayList1 = arrayList;
              continue;
            } 
            continue label23;
          } 
        } 
      } 
      return (arrayList != null) ? Collections.unmodifiableList(arrayList) : Collections.emptyList();
    } catch (IOException iOException) {
      Platform platform = Platform.get();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Loading cookies failed for ");
      stringBuilder.append(paramHttpUrl.resolve("/..."));
      platform.log(5, stringBuilder.toString(), iOException);
      return Collections.emptyList();
    } 
  }
  
  public void saveFromResponse(HttpUrl paramHttpUrl, List<Cookie> paramList) {
    if (this.cookieHandler != null) {
      ArrayList<String> arrayList = new ArrayList();
      Iterator<Cookie> iterator = paramList.iterator();
      while (iterator.hasNext())
        arrayList.add(((Cookie)iterator.next()).toString(true)); 
      Map<String, ArrayList<String>> map = Collections.singletonMap("Set-Cookie", arrayList);
      try {
        this.cookieHandler.put(paramHttpUrl.uri(), (Map)map);
        return;
      } catch (IOException iOException) {
        Platform platform = Platform.get();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Saving cookies failed for ");
        stringBuilder.append(paramHttpUrl.resolve("/..."));
        platform.log(5, stringBuilder.toString(), iOException);
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/okhttp3/JavaNetCookieJar.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */