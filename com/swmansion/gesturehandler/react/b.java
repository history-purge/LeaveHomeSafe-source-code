package com.swmansion.gesturehandler.react;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;

public class b extends c<b> {
  private static final e<b> h = new e(7);
  
  private WritableMap f;
  
  private short g;
  
  private void a(e.h.a.b paramb, c<e.h.a.b> paramc) {
    a(paramb.n().getId());
    this.f = Arguments.createMap();
    if (paramc != null)
      paramc.a(paramb, this.f); 
    this.f.putInt("handlerTag", paramb.m());
    this.f.putInt("state", paramb.l());
    this.g = paramb.f();
  }
  
  public static b b(e.h.a.b paramb, c paramc) {
    b b2 = (b)h.a();
    b b1 = b2;
    if (b2 == null)
      b1 = new b(); 
    b1.a(paramb, paramc);
    return b1;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), "onGestureHandlerEvent", this.f);
  }
  
  public boolean a() {
    return true;
  }
  
  public short c() {
    return this.g;
  }
  
  public String d() {
    return "onGestureHandlerEvent";
  }
  
  public void i() {
    this.f = null;
    h.a(this);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */