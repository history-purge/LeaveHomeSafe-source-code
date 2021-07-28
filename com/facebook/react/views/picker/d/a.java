package com.facebook.react.views.picker.d;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class a extends c<a> {
  private final int f;
  
  public a(int paramInt1, int paramInt2) {
    super(paramInt1);
    this.f = paramInt2;
  }
  
  private WritableMap j() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putInt("position", this.f);
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public String d() {
    return "topSelect";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/picker/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */