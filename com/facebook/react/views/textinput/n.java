package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

class n extends c<n> {
  private String f;
  
  public n(int paramInt, String paramString) {
    super(paramInt);
    this.f = paramString;
  }
  
  private WritableMap j() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putInt("target", g());
    writableMap.putString("text", this.f);
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public boolean a() {
    return false;
  }
  
  public String d() {
    return "topSubmitEditing";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/textinput/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */