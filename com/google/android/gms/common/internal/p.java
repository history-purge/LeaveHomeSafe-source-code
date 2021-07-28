package com.google.android.gms.common.internal;

import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import e.f.a.e.m.l;
import e.f.a.e.m.m;

public class p {
  private static final b a = new c0();
  
  @RecentlyNonNull
  public static <R extends com.google.android.gms.common.api.l> l<Void> a(@RecentlyNonNull h<R> paramh) {
    return a(paramh, new e0());
  }
  
  @RecentlyNonNull
  public static <R extends com.google.android.gms.common.api.l, T> l<T> a(@RecentlyNonNull h<R> paramh, @RecentlyNonNull a<R, T> parama) {
    b b1 = a;
    m m = new m();
    paramh.a(new d0(paramh, m, parama, b1));
    return m.a();
  }
  
  public static interface a<R extends com.google.android.gms.common.api.l, T> {
    @RecentlyNonNull
    T a(@RecentlyNonNull R param1R);
  }
  
  public static interface b {
    com.google.android.gms.common.api.b a(Status param1Status);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */