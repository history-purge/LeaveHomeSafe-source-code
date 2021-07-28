package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.e;
import e.f.a.c.i.u.b.b;
import e.f.a.c.i.x.j.y;
import e.f.a.c.i.y.b;
import e.f.a.c.i.z.a;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class p implements b<o> {
  private final Provider<Context> a;
  
  private final Provider<e> b;
  
  private final Provider<y> c;
  
  private final Provider<s> d;
  
  private final Provider<Executor> e;
  
  private final Provider<b> f;
  
  private final Provider<a> g;
  
  public p(Provider<Context> paramProvider, Provider<e> paramProvider1, Provider<y> paramProvider2, Provider<s> paramProvider3, Provider<Executor> paramProvider4, Provider<b> paramProvider5, Provider<a> paramProvider6) {
    this.a = paramProvider;
    this.b = paramProvider1;
    this.c = paramProvider2;
    this.d = paramProvider3;
    this.e = paramProvider4;
    this.f = paramProvider5;
    this.g = paramProvider6;
  }
  
  public static o a(Context paramContext, e parame, y paramy, s params, Executor paramExecutor, b paramb, a parama) {
    return new o(paramContext, parame, paramy, params, paramExecutor, paramb, parama);
  }
  
  public static p a(Provider<Context> paramProvider, Provider<e> paramProvider1, Provider<y> paramProvider2, Provider<s> paramProvider3, Provider<Executor> paramProvider4, Provider<b> paramProvider5, Provider<a> paramProvider6) {
    return new p(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4, paramProvider5, paramProvider6);
  }
  
  public o get() {
    return a((Context)this.a.get(), (e)this.b.get(), (y)this.c.get(), (s)this.d.get(), (Executor)this.e.get(), (b)this.f.get(), (a)this.g.get());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */