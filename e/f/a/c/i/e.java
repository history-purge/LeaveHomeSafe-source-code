package e.f.a.c.i;

import android.content.Context;
import com.google.android.datatransport.runtime.backends.j;
import com.google.android.datatransport.runtime.backends.l;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.p;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.r;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import e.f.a.c.i.u.b.a;
import e.f.a.c.i.u.b.c;
import e.f.a.c.i.u.b.d;
import e.f.a.c.i.x.c;
import e.f.a.c.i.x.d;
import e.f.a.c.i.x.g;
import e.f.a.c.i.x.i;
import e.f.a.c.i.x.j.b0;
import e.f.a.c.i.x.j.c0;
import e.f.a.c.i.x.j.d0;
import e.f.a.c.i.x.j.f0;
import e.f.a.c.i.x.j.g0;
import e.f.a.c.i.x.j.i0;
import e.f.a.c.i.x.j.y;
import e.f.a.c.i.z.a;
import e.f.a.c.i.z.c;
import e.f.a.c.i.z.d;
import java.util.concurrent.Executor;
import javax.inject.Provider;

final class e extends s {
  private Provider<Executor> c;
  
  private Provider<Context> d;
  
  private Provider e;
  
  private Provider f;
  
  private Provider g;
  
  private Provider<f0> h;
  
  private Provider<n> i;
  
  private Provider<s> j;
  
  private Provider<c> k;
  
  private Provider<o> l;
  
  private Provider<q> m;
  
  private Provider<r> n;
  
  private e(Context paramContext) {
    a(paramContext);
  }
  
  private void a(Context paramContext) {
    this.c = a.a((Provider)k.a());
    this.d = (Provider<Context>)c.a(paramContext);
    this.e = (Provider)j.a(this.d, (Provider)c.a(), (Provider)d.a());
    this.f = a.a((Provider)l.a(this.d, this.e));
    this.g = (Provider)i0.a(this.d, (Provider)b0.a(), (Provider)c0.a());
    this.h = a.a((Provider)g0.a((Provider)c.a(), (Provider)d.a(), (Provider)d0.a(), this.g));
    this.i = (Provider<n>)g.a((Provider)c.a());
    this.j = (Provider<s>)i.a(this.d, this.h, this.i, (Provider)d.a());
    Provider<Executor> provider2 = this.c;
    Provider<f0> provider3 = this.f;
    Provider<s> provider5 = this.j;
    Provider<f0> provider6 = this.h;
    this.k = (Provider<c>)d.a(provider2, provider3, provider5, provider6, provider6);
    Provider<Context> provider = this.d;
    provider3 = this.f;
    Provider<f0> provider4 = this.h;
    this.l = (Provider<o>)p.a(provider, provider3, provider4, this.j, this.c, provider4, (Provider)c.a());
    Provider<Executor> provider1 = this.c;
    provider3 = this.h;
    this.m = (Provider<q>)r.a(provider1, provider3, this.j, provider3);
    this.n = a.a((Provider)t.a((Provider<a>)c.a(), (Provider<a>)d.a(), (Provider)this.k, this.l, this.m));
  }
  
  public static s.a c() {
    return new b(null);
  }
  
  y a() {
    return (y)this.h.get();
  }
  
  r b() {
    return (r)this.n.get();
  }
  
  private static final class b implements s.a {
    private Context a;
    
    private b() {}
    
    public b a(Context param1Context) {
      d.a(param1Context);
      this.a = param1Context;
      return this;
    }
    
    public s a() {
      d.a(this.a, Context.class);
      return new e(this.a, null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */