package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.e.b;
import com.facebook.react.fabric.events.EventEmitterWrapper;

public class l implements g {
  private final EventEmitterWrapper a;
  
  private final int b;
  
  public l(int paramInt, EventEmitterWrapper paramEventEmitterWrapper) {
    this.b = paramInt;
    this.a = paramEventEmitterWrapper;
  }
  
  public void a(b paramb) {
    paramb.a(this.b, this.a);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("UpdateEventEmitterMountItem [");
    stringBuilder.append(this.b);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */