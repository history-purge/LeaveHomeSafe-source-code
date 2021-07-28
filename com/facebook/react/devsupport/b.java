package com.facebook.react.devsupport;

import android.view.View;
import com.facebook.react.bridge.DefaultNativeModuleCallExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.devsupport.h.b;
import com.facebook.react.devsupport.h.c;
import com.facebook.react.devsupport.h.d;
import com.facebook.react.modules.debug.c.a;
import e.e.e.e.a;

public class b implements c {
  private final DefaultNativeModuleCallExceptionHandler a = new DefaultNativeModuleCallExceptionHandler();
  
  public View a(String paramString) {
    return null;
  }
  
  public void a(View paramView) {}
  
  public void a(ReactContext paramReactContext) {}
  
  public void a(d paramd) {}
  
  public void a(String paramString, ReadableArray paramReadableArray, int paramInt) {}
  
  public void a(String paramString, b paramb) {}
  
  public void a(boolean paramBoolean) {}
  
  public boolean a() {
    return false;
  }
  
  public a b() {
    return null;
  }
  
  public void b(ReactContext paramReactContext) {}
  
  public void b(String paramString, ReadableArray paramReadableArray, int paramInt) {}
  
  public void b(boolean paramBoolean) {}
  
  public void c() {}
  
  public void c(boolean paramBoolean) {}
  
  public void d() {}
  
  public void d(boolean paramBoolean) {}
  
  public void e() {}
  
  public void f() {}
  
  public void g() {}
  
  public void handleException(Exception paramException) {
    a.b("DisabledDevSupportManager", "Caught exception", paramException);
    this.a.handleException(paramException);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/devsupport/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */