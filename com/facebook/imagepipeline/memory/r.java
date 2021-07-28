package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import e.e.e.d.i;
import e.e.e.g.a;
import e.e.e.g.c;

public class r extends a<byte[]> implements a {
  private final int[] j;
  
  public r(c paramc, g0 paramg0, h0 paramh0) {
    super(paramc, paramg0, paramh0);
    SparseIntArray sparseIntArray = paramg0.c;
    this.j = new int[sparseIntArray.size()];
    int i;
    for (i = 0; i < sparseIntArray.size(); i++)
      this.j[i] = sparseIntArray.keyAt(i); 
    a();
  }
  
  protected void a(byte[] paramArrayOfbyte) {
    i.a(paramArrayOfbyte);
  }
  
  protected byte[] a(int paramInt) {
    return new byte[paramInt];
  }
  
  protected int b(byte[] paramArrayOfbyte) {
    i.a(paramArrayOfbyte);
    return paramArrayOfbyte.length;
  }
  
  protected int d(int paramInt) {
    if (paramInt > 0) {
      for (int i : this.j) {
        if (i >= paramInt)
          return i; 
      } 
      return paramInt;
    } 
    a.b b = new a.b(Integer.valueOf(paramInt));
    throw b;
  }
  
  protected int e(int paramInt) {
    return paramInt;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */