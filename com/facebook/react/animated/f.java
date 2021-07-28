package com.facebook.react.animated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

class f extends s {
  private final l i;
  
  private final int j;
  
  private final double k;
  
  private final double l;
  
  private double m;
  
  public f(ReadableMap paramReadableMap, l paraml) {
    this.i = paraml;
    this.j = paramReadableMap.getInt("input");
    this.k = paramReadableMap.getDouble("min");
    this.l = paramReadableMap.getDouble("max");
    this.m = 0.0D;
    this.f = 0.0D;
  }
  
  private double g() {
    b b = this.i.d(this.j);
    if (b != null && b instanceof s)
      return ((s)b).e(); 
    throw new JSApplicationCausedNativeException("Illegal node ID set as an input for Animated.DiffClamp node");
  }
  
  public void a() {
    double d1 = g();
    double d2 = this.m;
    this.m = d1;
    this.f = Math.min(Math.max(this.f + d1 - d2, this.k), this.l);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */