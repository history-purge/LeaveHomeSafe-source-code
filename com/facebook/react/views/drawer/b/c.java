package com.facebook.react.views.drawer.b;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class c extends c<c> {
  private final float f;
  
  public c(int paramInt, float paramFloat) {
    super(paramInt);
    this.f = paramFloat;
  }
  
  private WritableMap k() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putDouble("offset", j());
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), k());
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return "topDrawerSlide";
  }
  
  public float j() {
    return this.f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/drawer/b/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */