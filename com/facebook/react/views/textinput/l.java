package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

class l extends c<l> {
  private int f;
  
  private int g;
  
  public l(int paramInt1, int paramInt2, int paramInt3) {
    super(paramInt1);
    this.f = paramInt2;
    this.g = paramInt3;
  }
  
  private WritableMap j() {
    WritableMap writableMap1 = Arguments.createMap();
    WritableMap writableMap2 = Arguments.createMap();
    writableMap2.putInt("end", this.g);
    writableMap2.putInt("start", this.f);
    writableMap1.putMap("selection", (ReadableMap)writableMap2);
    return writableMap1;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public String d() {
    return "topSelectionChange";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/textinput/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */