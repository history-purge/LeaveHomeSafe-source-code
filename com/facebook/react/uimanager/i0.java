package com.facebook.react.uimanager;

import com.facebook.yoga.g;

public class i0 {
  private static final int[] e = new int[] { 1, 2, 4, 8, 16, 32, 64, 128, 256 };
  
  private final float[] a;
  
  private int b = 0;
  
  private final float c;
  
  private boolean d;
  
  public i0() {
    this(0.0F);
  }
  
  public i0(float paramFloat) {
    this.c = paramFloat;
    this.a = a();
  }
  
  private static float[] a() {
    return new float[] { Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN, Float.NaN };
  }
  
  public float a(int paramInt) {
    float f;
    if (paramInt == 4 || paramInt == 5) {
      f = Float.NaN;
    } else {
      f = this.c;
    } 
    int i = this.b;
    if (i == 0)
      return f; 
    if ((i & e[paramInt]) != 0)
      return this.a[paramInt]; 
    if (this.d) {
      if (paramInt == 1 || paramInt == 3) {
        paramInt = 7;
      } else {
        paramInt = 6;
      } 
      i = this.b;
      int[] arrayOfInt = e;
      if ((arrayOfInt[paramInt] & i) != 0)
        return this.a[paramInt]; 
      if ((i & arrayOfInt[8]) != 0)
        return this.a[8]; 
    } 
    return f;
  }
  
  public boolean a(int paramInt, float paramFloat) {
    boolean bool1 = d.a(this.a[paramInt], paramFloat);
    boolean bool = false;
    if (!bool1) {
      this.a[paramInt] = paramFloat;
      if (g.a(paramFloat)) {
        int i = this.b;
        paramInt = (e[paramInt] ^ 0xFFFFFFFF) & i;
      } else {
        int i = this.b;
        paramInt = e[paramInt] | i;
      } 
      this.b = paramInt;
      paramInt = this.b;
      int[] arrayOfInt = e;
      if ((arrayOfInt[8] & paramInt) != 0 || (arrayOfInt[7] & paramInt) != 0 || (paramInt & arrayOfInt[6]) != 0)
        bool = true; 
      this.d = bool;
      return true;
    } 
    return false;
  }
  
  public float b(int paramInt) {
    return this.a[paramInt];
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */