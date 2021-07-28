package com.facebook.imagepipeline.memory;

import android.util.SparseIntArray;
import e.e.e.d.i;
import e.e.e.g.c;

public abstract class v extends a<u> {
  private final int[] j;
  
  v(c paramc, g0 paramg0, h0 paramh0) {
    super(paramc, paramg0, paramh0);
    SparseIntArray sparseIntArray = paramg0.c;
    this.j = new int[sparseIntArray.size()];
    int i = 0;
    while (true) {
      int[] arrayOfInt = this.j;
      if (i < arrayOfInt.length) {
        arrayOfInt[i] = sparseIntArray.keyAt(i);
        i++;
        continue;
      } 
      a();
      return;
    } 
  }
  
  protected abstract u a(int paramInt);
  
  protected void a(u paramu) {
    i.a(paramu);
    paramu.close();
  }
  
  protected int b(u paramu) {
    i.a(paramu);
    return paramu.b();
  }
  
  protected boolean c(u paramu) {
    i.a(paramu);
    return paramu.isClosed() ^ true;
  }
  
  int d() {
    return this.j[0];
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */