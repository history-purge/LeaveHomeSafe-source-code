package com.facebook.imageutils;

import android.graphics.ColorSpace;
import android.util.Pair;

public class b {
  private final Pair<Integer, Integer> a;
  
  private final ColorSpace b;
  
  public b(int paramInt1, int paramInt2, ColorSpace paramColorSpace) {
    Pair<Integer, Integer> pair;
    if (paramInt1 == -1 || paramInt2 == -1) {
      pair = null;
    } else {
      pair = new Pair(Integer.valueOf(paramInt1), Integer.valueOf(paramInt2));
    } 
    this.a = pair;
    this.b = paramColorSpace;
  }
  
  public ColorSpace a() {
    return this.b;
  }
  
  public Pair<Integer, Integer> b() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imageutils/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */