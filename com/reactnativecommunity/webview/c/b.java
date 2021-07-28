package com.reactnativecommunity.webview.c;

import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public final class b extends c<b> {
  private final WritableMap f;
  
  static {
    new a(null);
  }
  
  public b(int paramInt, WritableMap paramWritableMap) {
    super(paramInt);
    this.f = paramWritableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    g.c.a.b.b(paramRCTEventEmitter, "rctEventEmitter");
    paramRCTEventEmitter.receiveEvent(g(), d(), this.f);
  }
  
  public boolean a() {
    return false;
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return "topLoadingError";
  }
  
  public static final class a {
    private a() {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/reactnativecommunity/webview/c/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */