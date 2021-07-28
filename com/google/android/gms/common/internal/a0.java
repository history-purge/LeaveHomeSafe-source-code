package com.google.android.gms.common.internal;

import android.content.Context;
import android.util.SparseIntArray;
import com.google.android.gms.common.api.a;
import e.f.a.e.e.e;

public final class a0 {
  private final SparseIntArray a = new SparseIntArray();
  
  private e b;
  
  public a0(e parame) {
    q.a(parame);
    this.b = parame;
  }
  
  public final int a(Context paramContext, a.f paramf) {
    int i;
    q.a(paramContext);
    q.a(paramf);
    if (!paramf.c())
      return 0; 
    int m = paramf.d();
    int k = this.a.get(m, -1);
    if (k != -1)
      return k; 
    int j = 0;
    while (true) {
      i = k;
      if (j < this.a.size()) {
        i = this.a.keyAt(j);
        if (i > m && this.a.get(i) == 0) {
          i = 0;
          break;
        } 
        j++;
        continue;
      } 
      break;
    } 
    j = i;
    if (i == -1)
      j = this.b.a(paramContext, m); 
    this.a.put(m, j);
    return j;
  }
  
  public final void a() {
    this.a.clear();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */