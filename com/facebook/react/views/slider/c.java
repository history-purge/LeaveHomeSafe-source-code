package com.facebook.react.views.slider;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class c extends c<c> {
  private final double f;
  
  public c(int paramInt, double paramDouble) {
    super(paramInt);
    this.f = paramDouble;
  }
  
  private WritableMap k() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putInt("target", g());
    writableMap.putDouble("value", j());
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), k());
  }
  
  public boolean a() {
    return false;
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return "topSlidingComplete";
  }
  
  public double j() {
    return this.f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/slider/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */