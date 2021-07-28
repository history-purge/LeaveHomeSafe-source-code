package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class b extends c<e> {
  private float f;
  
  private float g;
  
  public b(int paramInt, float paramFloat1, float paramFloat2) {
    super(paramInt);
    this.f = paramFloat1;
    this.g = paramFloat2;
  }
  
  private WritableMap j() {
    WritableMap writableMap1 = Arguments.createMap();
    WritableMap writableMap2 = Arguments.createMap();
    writableMap2.putDouble("width", this.f);
    writableMap2.putDouble("height", this.g);
    writableMap1.putMap("contentSize", (ReadableMap)writableMap2);
    writableMap1.putInt("target", g());
    return writableMap1;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public String d() {
    return "topContentSizeChange";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/textinput/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */