package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class b extends c<b> {
  private final double f;
  
  private final boolean g;
  
  public b(int paramInt, double paramDouble, boolean paramBoolean) {
    super(paramInt);
    this.f = paramDouble;
    this.g = paramBoolean;
  }
  
  private WritableMap l() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putInt("target", g());
    writableMap.putDouble("value", j());
    writableMap.putBoolean("fromUser", k());
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), l());
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return "topChange";
  }
  
  public double j() {
    return this.f;
  }
  
  public boolean k() {
    return this.g;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/slider/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */