package e.f.a.c.i.x.j;

import e.f.a.c.i.u.b.b;
import e.f.a.c.i.z.a;
import javax.inject.Provider;

public final class g0 implements b<f0> {
  private final Provider<a> a;
  
  private final Provider<a> b;
  
  private final Provider<z> c;
  
  private final Provider<h0> d;
  
  public g0(Provider<a> paramProvider1, Provider<a> paramProvider2, Provider<z> paramProvider, Provider<h0> paramProvider3) {
    this.a = paramProvider1;
    this.b = paramProvider2;
    this.c = paramProvider;
    this.d = paramProvider3;
  }
  
  public static f0 a(a parama1, a parama2, Object paramObject1, Object paramObject2) {
    return new f0(parama1, parama2, (z)paramObject1, (h0)paramObject2);
  }
  
  public static g0 a(Provider<a> paramProvider1, Provider<a> paramProvider2, Provider<z> paramProvider, Provider<h0> paramProvider3) {
    return new g0(paramProvider1, paramProvider2, paramProvider, paramProvider3);
  }
  
  public f0 get() {
    return a((a)this.a.get(), (a)this.b.get(), this.c.get(), this.d.get());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/j/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */