package com.swmansion.gesturehandler.react;

import androidx.core.util.e;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.uimanager.events.RCTEventEmitter;
import com.facebook.react.uimanager.events.c;
import e.h.a.b;

public class i extends c<i> {
  private static final e<i> g = new e(7);
  
  private WritableMap f;
  
  private void a(b paramb, int paramInt1, int paramInt2, c<b> paramc) {
    a(paramb.n().getId());
    this.f = Arguments.createMap();
    if (paramc != null)
      paramc.a(paramb, this.f); 
    this.f.putInt("handlerTag", paramb.m());
    this.f.putInt("state", paramInt1);
    this.f.putInt("oldState", paramInt2);
  }
  
  public static i b(b paramb, int paramInt1, int paramInt2, c paramc) {
    i i2 = (i)g.a();
    i i1 = i2;
    if (i2 == null)
      i1 = new i(); 
    i1.a(paramb, paramInt1, paramInt2, paramc);
    return i1;
  }
  
  public void a(RCTEventEmitter paramRCTEventEmitter) {
    paramRCTEventEmitter.receiveEvent(g(), "onGestureHandlerStateChange", this.f);
  }
  
  public boolean a() {
    return false;
  }
  
  public short c() {
    return 0;
  }
  
  public String d() {
    return "onGestureHandlerStateChange";
  }
  
  public void i() {
    this.f = null;
    g.a(this);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/gesturehandler/react/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */