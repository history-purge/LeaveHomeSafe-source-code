package com.google.android.gms.common.api;

import android.os.Looper;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.internal.f;
import com.google.android.gms.common.api.internal.k;
import com.google.android.gms.common.api.internal.m;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

@Deprecated
public abstract class f {
  private static final Set<f> a = Collections.newSetFromMap(new WeakHashMap<f, Boolean>());
  
  @RecentlyNonNull
  public static Set<f> c() {
    synchronized (a) {
      return a;
    } 
  }
  
  @RecentlyNonNull
  public Looper a() {
    throw new UnsupportedOperationException();
  }
  
  @RecentlyNonNull
  public <A extends a.b, T extends com.google.android.gms.common.api.internal.d<? extends l, A>> T a(@RecentlyNonNull T paramT) {
    throw new UnsupportedOperationException();
  }
  
  @RecentlyNonNull
  public boolean a(@RecentlyNonNull m paramm) {
    throw new UnsupportedOperationException();
  }
  
  public void b() {
    throw new UnsupportedOperationException();
  }
  
  @Deprecated
  public static interface a extends f {}
  
  @Deprecated
  public static interface b extends k {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */