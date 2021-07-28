package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import e.f.a.c.i.u.b.b;
import javax.inject.Provider;

public final class l implements b<k> {
  private final Provider<Context> a;
  
  private final Provider<i> b;
  
  public l(Provider<Context> paramProvider, Provider<i> paramProvider1) {
    this.a = paramProvider;
    this.b = paramProvider1;
  }
  
  public static k a(Context paramContext, Object paramObject) {
    return new k(paramContext, (i)paramObject);
  }
  
  public static l a(Provider<Context> paramProvider, Provider<i> paramProvider1) {
    return new l(paramProvider, paramProvider1);
  }
  
  public k get() {
    return a((Context)this.a.get(), this.b.get());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/backends/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */