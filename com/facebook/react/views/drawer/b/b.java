package com.facebook.react.views.drawer.b;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class b extends c<b> {
  public b(int paramInt) {
    super(paramInt);
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), Arguments.createMap());
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return "topDrawerOpen";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/drawer/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */