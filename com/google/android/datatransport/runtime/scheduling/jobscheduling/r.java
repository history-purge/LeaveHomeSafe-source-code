package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import e.f.a.c.i.u.b.b;
import e.f.a.c.i.x.j.y;
import e.f.a.c.i.y.b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class r implements b<q> {
  private final Provider<Executor> a;
  
  private final Provider<y> b;
  
  private final Provider<s> c;
  
  private final Provider<b> d;
  
  public r(Provider<Executor> paramProvider, Provider<y> paramProvider1, Provider<s> paramProvider2, Provider<b> paramProvider3) {
    this.a = paramProvider;
    this.b = paramProvider1;
    this.c = paramProvider2;
    this.d = paramProvider3;
  }
  
  public static q a(Executor paramExecutor, y paramy, s params, b paramb) {
    return new q(paramExecutor, paramy, params, paramb);
  }
  
  public static r a(Provider<Executor> paramProvider, Provider<y> paramProvider1, Provider<s> paramProvider2, Provider<b> paramProvider3) {
    return new r(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public q get() {
    return a((Executor)this.a.get(), (y)this.b.get(), (s)this.c.get(), (b)this.d.get());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */