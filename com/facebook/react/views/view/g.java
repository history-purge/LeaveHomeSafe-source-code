package com.facebook.react.views.view;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class g extends c<g> {
  public g(int paramInt) {
    super(paramInt);
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), Arguments.createMap());
  }
  
  public boolean a() {
    return false;
  }
  
  public String d() {
    return "topClick";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/view/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */