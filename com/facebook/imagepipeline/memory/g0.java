package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import e.e.e.d.i;

public class g0 {
  public final int a;
  
  public final int b;
  
  public final SparseIntArray c;
  
  public boolean d;
  
  public final int e;
  
  public g0(int paramInt1, int paramInt2, SparseIntArray paramSparseIntArray) {
    this(paramInt1, paramInt2, paramSparseIntArray, 0, 2147483647, -1);
  }
  
  public g0(int paramInt1, int paramInt2, SparseIntArray paramSparseIntArray, int paramInt3, int paramInt4, int paramInt5) {
    boolean bool;
    if (paramInt1 >= 0 && paramInt2 >= paramInt1) {
      bool = true;
    } else {
      bool = false;
    } 
    i.b(bool);
    this.b = paramInt1;
    this.a = paramInt2;
    this.c = paramSparseIntArray;
    this.e = paramInt5;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */