package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

class b extends c<b> {
  private a f;
  
  private c g;
  
  b(int paramInt, a parama, c paramc) {
    super(paramInt);
    this.f = parama;
    this.g = paramc;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putMap("insets", (ReadableMap)l.b(this.f));
    writableMap.putMap("frame", (ReadableMap)l.b(this.g));
    paramRCTEventEmitter.receiveEvent(g(), d(), writableMap);
  }
  
  public String d() {
    return "topInsetsChange";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/th3rdwave/safeareacontext/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */