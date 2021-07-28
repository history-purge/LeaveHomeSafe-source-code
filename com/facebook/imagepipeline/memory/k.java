package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

public class k {
  private static final SparseIntArray a = new SparseIntArray(0);
  
  public static g0 a() {
    return new g0(0, b(), a);
  }
  
  private static int b() {
    int i = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
    return (i > 16777216) ? (i / 4 * 3) : (i / 2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */