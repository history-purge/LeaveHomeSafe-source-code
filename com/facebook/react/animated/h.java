package com.facebook.react.animated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;

class h extends d {
  private long e;
  
  private double[] f;
  
  private double g;
  
  private double h;
  
  private int i;
  
  private int j;
  
  h(ReadableMap paramReadableMap) {
    a(paramReadableMap);
  }
  
  public void a(long paramLong) {
    if (this.e < 0L) {
      this.e = paramLong;
      if (this.j == 1)
        this.h = this.b.f; 
    } 
    double d1 = ((paramLong - this.e) / 1000000L);
    Double.isNaN(d1);
    int i = (int)Math.round(d1 / 16.666666666666668D);
    if (i >= 0) {
      if (this.a)
        return; 
      double[] arrayOfDouble = this.f;
      if (i >= arrayOfDouble.length - 1) {
        d1 = this.g;
        i = this.i;
        if (i == -1 || this.j < i) {
          this.e = -1L;
          this.j++;
        } else {
          this.a = true;
        } 
      } else {
        d1 = this.h;
        d1 += arrayOfDouble[i] * (this.g - d1);
      } 
      this.b.f = d1;
      return;
    } 
    throw new IllegalStateException("Calculated frame index should never be lower than 0");
  }
  
  public void a(ReadableMap paramReadableMap) {
    ReadableArray readableArray = paramReadableMap.getArray("frames");
    int j = readableArray.size();
    double[] arrayOfDouble = this.f;
    if (arrayOfDouble == null || arrayOfDouble.length != j)
      this.f = new double[j]; 
    boolean bool = false;
    int i;
    for (i = 0; i < j; i++)
      this.f[i] = readableArray.getDouble(i); 
    boolean bool1 = paramReadableMap.hasKey("toValue");
    double d2 = 0.0D;
    double d1 = d2;
    if (bool1) {
      d1 = d2;
      if (paramReadableMap.getType("toValue") == ReadableType.Number)
        d1 = paramReadableMap.getDouble("toValue"); 
    } 
    this.g = d1;
    if (paramReadableMap.hasKey("iterations")) {
      if (paramReadableMap.getType("iterations") == ReadableType.Number) {
        i = paramReadableMap.getInt("iterations");
      } else {
        i = 1;
      } 
      this.i = i;
    } else {
      this.i = 1;
    } 
    this.j = 1;
    if (this.i == 0)
      bool = true; 
    this.a = bool;
    this.e = -1L;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */