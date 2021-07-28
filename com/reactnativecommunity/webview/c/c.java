package com.reactnativecommunity.webview.c;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import g.c.a.b;

public final class c extends c<c> {
  private final WritableMap f;
  
  static {
    new a(null);
  }
  
  public c(int paramInt, WritableMap paramWritableMap) {
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
    return "topLoadingFinish";
  }
  
  public static final class a {
    private a() {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/reactnativecommunity/webview/c/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */