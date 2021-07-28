package com.google.android.datatransport.runtime.backends;

import android.content.Context;
import e.f.a.c.i.u.b.b;
import e.f.a.c.i.z.a;
import javax.inject.Provider;

public final class j implements b<i> {
  private final Provider<Context> a;
  
  private final Provider<a> b;
  
  private final Provider<a> c;
  
  public j(Provider<Context> paramProvider, Provider<a> paramProvider1, Provider<a> paramProvider2) {
    this.a = paramProvider;
    this.b = paramProvider1;
    this.c = paramProvider2;
  }
  
  public static i a(Context paramContext, a parama1, a parama2) {
    return new i(paramContext, parama1, parama2);
  }
  
  public static j a(Provider<Context> paramProvider, Provider<a> paramProvider1, Provider<a> paramProvider2) {
    return new j(paramProvider, paramProvider1, paramProvider2);
  }
  
  public i get() {
    return a((Context)this.a.get(), (a)this.b.get(), (a)this.c.get());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/backends/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */