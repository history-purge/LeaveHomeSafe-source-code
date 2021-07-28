package com.facebook.react.modules.network;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.ValueCallback;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.GuardedAsyncTask;
import com.facebook.react.bridge.GuardedResultAsyncTask;
import com.facebook.react.bridge.ReactContext;
import java.net.CookieHandler;
import java.net.URI;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class c extends CookieHandler {
  private static final boolean d;
  
  private final e a;
  
  private final ReactContext b;
  
  private CookieManager c;
  
  static {
    boolean bool;
    if (Build.VERSION.SDK_INT < 21) {
      bool = true;
    } else {
      bool = false;
    } 
    d = bool;
  }
  
  public c(ReactContext paramReactContext) {
    this.b = paramReactContext;
    this.a = new e(this);
  }
  
  private static void a(Context paramContext) {
    if (d)
      CookieSyncManager.createInstance(paramContext).sync(); 
  }
  
  private void a(Runnable paramRunnable) {
    (new d(this, this.b, paramRunnable)).execute((Object[])new Void[0]);
  }
  
  @TargetApi(21)
  private void a(String paramString1, String paramString2) {
    CookieManager cookieManager = c();
    if (cookieManager != null)
      cookieManager.setCookie(paramString1, paramString2, null); 
  }
  
  private static boolean a(String paramString) {
    return (paramString.equalsIgnoreCase("Set-cookie") || paramString.equalsIgnoreCase("Set-cookie2"));
  }
  
  private void b(Callback paramCallback) {
    CookieManager cookieManager = c();
    if (cookieManager != null)
      cookieManager.removeAllCookies(new b(this, paramCallback)); 
  }
  
  private CookieManager c() {
    if (this.c == null) {
      a((Context)this.b);
      try {
        this.c = CookieManager.getInstance();
        if (d)
          this.c.removeExpiredCookie(); 
        return this.c;
      } catch (IllegalArgumentException illegalArgumentException) {
        return null;
      } catch (Exception exception) {
        if (exception.getMessage() != null && exception.getClass().getCanonicalName().equals("android.webkit.WebViewFactory.MissingWebViewPackageException"))
          return null; 
        throw exception;
      } 
    } 
    return this.c;
  }
  
  public void a() {
    if (d) {
      CookieManager cookieManager = c();
      if (cookieManager != null)
        cookieManager.removeExpiredCookie(); 
      this.a.b();
    } 
  }
  
  public void a(Callback paramCallback) {
    if (d) {
      (new a(this, this.b, paramCallback)).execute((Object[])new Void[0]);
      return;
    } 
    b(paramCallback);
  }
  
  public void a(String paramString, List<String> paramList) {
    CookieManager cookieManager = c();
    if (cookieManager == null)
      return; 
    if (d) {
      a(new c(this, paramList, cookieManager, paramString));
      return;
    } 
    Iterator<String> iterator = paramList.iterator();
    while (iterator.hasNext())
      a(paramString, iterator.next()); 
    cookieManager.flush();
    this.a.a();
  }
  
  public Map<String, List<String>> get(URI paramURI, Map<String, List<String>> paramMap) {
    CookieManager cookieManager = c();
    if (cookieManager == null)
      return Collections.emptyMap(); 
    String str = cookieManager.getCookie(paramURI.toString());
    return TextUtils.isEmpty(str) ? Collections.emptyMap() : Collections.singletonMap("Cookie", Collections.singletonList(str));
  }
  
  public void put(URI paramURI, Map<String, List<String>> paramMap) {
    String str = paramURI.toString();
    for (Map.Entry<String, List<String>> entry : paramMap.entrySet()) {
      String str1 = (String)entry.getKey();
      if (str1 != null && a(str1))
        a(str, (List<String>)entry.getValue()); 
    } 
  }
  
  class a extends GuardedResultAsyncTask<Boolean> {
    a(c this$0, ReactContext param1ReactContext, Callback param1Callback) {
      super(param1ReactContext);
    }
    
    protected void a(Boolean param1Boolean) {
      this.a.invoke(new Object[] { param1Boolean });
    }
    
    protected Boolean doInBackgroundGuarded() {
      CookieManager cookieManager = c.a(this.b);
      if (cookieManager != null)
        cookieManager.removeAllCookie(); 
      c.b(this.b).a();
      return Boolean.valueOf(true);
    }
  }
  
  class b implements ValueCallback<Boolean> {
    b(c this$0, Callback param1Callback) {}
    
    public void a(Boolean param1Boolean) {
      c.b(this.b).a();
      this.a.invoke(new Object[] { param1Boolean });
    }
  }
  
  class c implements Runnable {
    c(c this$0, List param1List, CookieManager param1CookieManager, String param1String) {}
    
    public void run() {
      for (String str : this.c)
        this.d.setCookie(this.e, str); 
      c.b(this.f).a();
    }
  }
  
  class d extends GuardedAsyncTask<Void, Void> {
    d(c this$0, ReactContext param1ReactContext, Runnable param1Runnable) {
      super(param1ReactContext);
    }
    
    protected void a(Void... param1VarArgs) {
      this.a.run();
    }
  }
  
  private class e {
    private final Handler a;
    
    public e(c this$0) {
      this.a = new Handler(Looper.getMainLooper(), new a(this, this$0));
    }
    
    @TargetApi(21)
    private void c() {
      CookieManager cookieManager = c.a(this.b);
      if (cookieManager != null)
        cookieManager.flush(); 
    }
    
    public void a() {
      if (c.b())
        this.a.sendEmptyMessageDelayed(1, 30000L); 
    }
    
    public void b() {
      this.a.removeMessages(1);
      c.a(this.b, new b(this));
    }
    
    class a implements Handler.Callback {
      a(c.e this$0, c param2c) {}
      
      public boolean handleMessage(Message param2Message) {
        if (param2Message.what == 1) {
          this.a.b();
          return true;
        } 
        return false;
      }
    }
    
    class b implements Runnable {
      b(c.e this$0) {}
      
      public void run() {
        if (c.b()) {
          CookieSyncManager.getInstance().sync();
          return;
        } 
        c.e.a(this.c);
      }
    }
  }
  
  class a implements Handler.Callback {
    a(c this$0, c param1c) {}
    
    public boolean handleMessage(Message param1Message) {
      if (param1Message.what == 1) {
        this.a.b();
        return true;
      } 
      return false;
    }
  }
  
  class b implements Runnable {
    b(c this$0) {}
    
    public void run() {
      if (c.b()) {
        CookieSyncManager.getInstance().sync();
        return;
      } 
      c.e.a(this.c);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */