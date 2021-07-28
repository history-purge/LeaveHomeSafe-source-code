package com.facebook.react.modules.network;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Headers;
import okhttp3.HttpUrl;

public class l implements a {
  private CookieJar a = null;
  
  public void a() {
    this.a = null;
  }
  
  public void a(CookieJar paramCookieJar) {
    this.a = paramCookieJar;
  }
  
  public List<Cookie> loadForRequest(HttpUrl paramHttpUrl) {
    CookieJar cookieJar = this.a;
    if (cookieJar != null) {
      List list = cookieJar.loadForRequest(paramHttpUrl);
      ArrayList<Cookie> arrayList = new ArrayList();
      Iterator<Cookie> iterator = list.iterator();
      while (true) {
        if (iterator.hasNext()) {
          Cookie cookie = iterator.next();
          try {
            (new Headers.Builder()).add(cookie.name(), cookie.value());
            arrayList.add(cookie);
          } catch (IllegalArgumentException illegalArgumentException) {}
          continue;
        } 
        return arrayList;
      } 
    } 
    return Collections.emptyList();
  }
  
  public void saveFromResponse(HttpUrl paramHttpUrl, List<Cookie> paramList) {
    CookieJar cookieJar = this.a;
    if (cookieJar != null)
      cookieJar.saveFromResponse(paramHttpUrl, paramList); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */