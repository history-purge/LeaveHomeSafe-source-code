package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;

public class n {
  public static g0 a() {
    SparseIntArray sparseIntArray = new SparseIntArray();
    sparseIntArray.put(1024, 5);
    sparseIntArray.put(2048, 5);
    sparseIntArray.put(4096, 5);
    sparseIntArray.put(8192, 5);
    sparseIntArray.put(16384, 5);
    sparseIntArray.put(32768, 5);
    sparseIntArray.put(65536, 5);
    sparseIntArray.put(131072, 5);
    sparseIntArray.put(262144, 2);
    sparseIntArray.put(524288, 2);
    sparseIntArray.put(1048576, 2);
    return new g0(c(), b(), sparseIntArray);
  }
  
  private static int b() {
    int i = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
    return (i < 16777216) ? (i / 2) : (i / 4 * 3);
  }
  
  private static int c() {
    int i = (int)Math.min(Runtime.getRuntime().maxMemory(), 2147483647L);
    return (i < 16777216) ? 3145728 : ((i < 33554432) ? 6291456 : 12582912);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */