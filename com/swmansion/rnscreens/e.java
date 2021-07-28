package com.swmansion.rnscreens;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class e extends c<e> {
  public e(int paramInt) {
    super(paramInt);
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), Arguments.createMap());
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return "topDismissed";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */