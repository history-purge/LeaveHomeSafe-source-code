package com.reactnativecommunity.webview.c;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import g.c.a.b;

public final class g extends c<g> {
  private final WritableMap f;
  
  static {
    new a(null);
  }
  
  public g(int paramInt, WritableMap paramWritableMap) {
    super(paramInt);
    this.f = paramWritableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    b.b(paramRCTEventEmitter, "rctEventEmitter");
    paramRCTEventEmitter.receiveEvent(g(), d(), this.f);
  }
  
  public boolean a() {
    return false;
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return "topRenderProcessGone";
  }
  
  public static final class a {
    private a() {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/reactnativecommunity/webview/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */