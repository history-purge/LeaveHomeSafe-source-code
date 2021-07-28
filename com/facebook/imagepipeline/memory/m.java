package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

public class m {
  public static final int a = Runtime.getRuntime().availableProcessors();
  
  public static SparseIntArray a(int paramInt1, int paramInt2, int paramInt3) {
    SparseIntArray sparseIntArray = new SparseIntArray();
    while (paramInt1 <= paramInt2) {
      sparseIntArray.put(paramInt1, paramInt3);
      paramInt1 *= 2;
    } 
    return sparseIntArray;
  }
  
  public static g0 a() {
    int i = a;
    return new g0(4194304, i * 4194304, a(131072, 4194304, i), 131072, 4194304, a);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */