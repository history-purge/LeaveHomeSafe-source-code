package com.google.android.datatransport.cct.f;

import android.util.SparseArray;

public enum p {
  c(0),
  d(1),
  e(2),
  f(3),
  g(4),
  h(-1);
  
  private static final SparseArray<p> i;
  
  private final int value;
  
  static {
    i = new SparseArray();
    i.put(0, c);
    i.put(1, d);
    i.put(2, e);
    i.put(3, f);
    i.put(4, g);
    i.put(-1, h);
  }
  
  p(int paramInt1) {
    this.value = paramInt1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/cct/f/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */