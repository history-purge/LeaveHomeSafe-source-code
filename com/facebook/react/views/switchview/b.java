package com.facebook.react.views.switchview;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

class b extends c<b> {
  private final boolean f;
  
  public b(int paramInt, boolean paramBoolean) {
    super(paramInt);
    this.f = paramBoolean;
  }
  
  private WritableMap k() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putInt("target", g());
    writableMap.putBoolean("value", j());
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), k());
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return "topChange";
  }
  
  public boolean j() {
    return this.f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/switchview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */