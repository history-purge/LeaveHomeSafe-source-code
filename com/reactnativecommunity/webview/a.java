package com.reactnativecommunity.webview;

import com.facebook.react.bridge.ReactApplicationContext;
import e.e.o.v;
import g.c.a.b;
import java.util.List;

public final class a implements v {
  public List<RNCWebViewModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    b.b(paramReactApplicationContext, "reactContext");
    return g.b.a.a(new RNCWebViewModule(paramReactApplicationContext));
  }
  
  public List<RNCWebViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    b.b(paramReactApplicationContext, "reactContext");
    return g.b.a.a(new RNCWebViewManager());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/reactnativecommunity/webview/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */