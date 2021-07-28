package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class e extends c<e> {
  private String f;
  
  private int g;
  
  public e(int paramInt1, String paramString, int paramInt2) {
    super(paramInt1);
    this.f = paramString;
    this.g = paramInt2;
  }
  
  private WritableMap j() {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("text", this.f);
    writableMap.putInt("eventCount", this.g);
    writableMap.putInt("target", g());
    return writableMap;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public String d() {
    return "topChange";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/textinput/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */