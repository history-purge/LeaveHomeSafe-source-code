package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.e.b;

public class p implements g {
  private final int a;
  
  private final ReadableMap b;
  
  public p(int paramInt, ReadableMap paramReadableMap) {
    this.a = paramInt;
    this.b = paramReadableMap;
  }
  
  public void a(b paramb) {
    paramb.b(this.a, this.b);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("UpdatePropsMountItem [");
    stringBuilder.append(this.a);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */