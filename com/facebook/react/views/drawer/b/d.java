package com.facebook.react.views.drawer.b;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class d extends c<d> {
  private final int f;
  
  public d(int paramInt1, int paramInt2) {
    super(paramInt1);
    this.f = paramInt2;
  }
  
  private WritableMap k() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putDouble("drawerState", j());
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), k());
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return "topDrawerStateChanged";
  }
  
  public int j() {
    return this.f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/drawer/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */