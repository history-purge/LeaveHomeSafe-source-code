package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

class j extends s {
  private final l i;
  
  private final int j;
  
  private final double k;
  
  public j(ReadableMap paramReadableMap, l paraml) {
    this.i = paraml;
    this.j = paramReadableMap.getInt("input");
    this.k = paramReadableMap.getDouble("modulus");
  }
  
  public void a() {
    b b = this.i.d(this.j);
    if (b != null && b instanceof s) {
      double d1 = ((s)b).e();
      double d2 = this.k;
      this.f = (d1 % d2 + d2) % d2;
      return;
    } 
    throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.modulus node");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */