package com.facebook.react.views.textinput;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class h extends c<h> {
  private String f;
  
  private String g;
  
  private int h;
  
  private int i;
  
  public h(int paramInt1, String paramString1, String paramString2, int paramInt2, int paramInt3) {
    super(paramInt1);
    this.f = paramString1;
    this.g = paramString2;
    this.h = paramInt2;
    this.i = paramInt3;
  }
  
  private WritableMap j() {
    WritableMap writableMap1 = Arguments.createMap();
    WritableMap writableMap2 = Arguments.createMap();
    writableMap2.putDouble("start", this.h);
    writableMap2.putDouble("end", this.i);
    writableMap1.putString("text", this.f);
    writableMap1.putString("previousText", this.g);
    writableMap1.putMap("range", (ReadableMap)writableMap2);
    writableMap1.putInt("target", g());
    return writableMap1;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), d(), j());
  }
  
  public boolean a() {
    return false;
  }
  
  public String d() {
    return "topTextInput";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/textinput/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */