package com.facebook.react.views.drawer.b;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class a extends c<a> {
  public a(int paramInt) {
    super(paramInt);
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), Arguments.createMap());
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return "topDrawerClose";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/drawer/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */