package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableMap;

public class e extends d {
  private final double e;
  
  private double f;
  
  private long g;
  
  private double h;
  
  private double i;
  
  private int j;
  
  private int k;
  
  public e(ReadableMap paramReadableMap) {
    this.e = paramReadableMap.getDouble("velocity");
    a(paramReadableMap);
  }
  
  public void a(long paramLong) {
    paramLong /= 1000000L;
    if (this.g == -1L) {
      this.g = paramLong - 16L;
      double d5 = this.h;
      if (d5 == this.i) {
        this.h = this.b.f;
      } else {
        this.b.f = d5;
      } 
      this.i = this.b.f;
    } 
    double d1 = this.h;
    double d2 = this.e;
    double d3 = this.f;
    d2 /= 1.0D - d3;
    d3 = -(1.0D - d3);
    double d4 = (paramLong - this.g);
    Double.isNaN(d4);
    d1 += d2 * (1.0D - Math.exp(d3 * d4));
    if (Math.abs(this.i - d1) < 0.1D) {
      int i = this.j;
      if (i == -1 || this.k < i) {
        this.g = -1L;
        this.k++;
      } else {
        this.a = true;
        return;
      } 
    } 
    this.i = d1;
    this.b.f = d1;
  }
  
  public void a(ReadableMap paramReadableMap) {
    boolean bool1;
    this.f = paramReadableMap.getDouble("deceleration");
    boolean bool = paramReadableMap.hasKey("iterations");
    boolean bool2 = true;
    if (bool) {
      bool1 = paramReadableMap.getInt("iterations");
    } else {
      bool1 = true;
    } 
    this.j = bool1;
    this.k = 1;
    if (this.j != 0)
      bool2 = false; 
    this.a = bool2;
    this.g = -1L;
    this.h = 0.0D;
    this.i = 0.0D;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */