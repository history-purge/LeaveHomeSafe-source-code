package e.f.a.c.i;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.o;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.q;
import e.f.a.c.i.u.b.b;
import e.f.a.c.i.x.e;
import e.f.a.c.i.z.a;
import javax.inject.Provider;

public final class t implements b<r> {
  private final Provider<a> a;
  
  private final Provider<a> b;
  
  private final Provider<e> c;
  
  private final Provider<o> d;
  
  private final Provider<q> e;
  
  public t(Provider<a> paramProvider1, Provider<a> paramProvider2, Provider<e> paramProvider, Provider<o> paramProvider3, Provider<q> paramProvider4) {
    this.a = paramProvider1;
    this.b = paramProvider2;
    this.c = paramProvider;
    this.d = paramProvider3;
    this.e = paramProvider4;
  }
  
  public static r a(a parama1, a parama2, e parame, o paramo, q paramq) {
    return new r(parama1, parama2, parame, paramo, paramq);
  }
  
  public static t a(Provider<a> paramProvider1, Provider<a> paramProvider2, Provider<e> paramProvider, Provider<o> paramProvider3, Provider<q> paramProvider4) {
    return new t(paramProvider1, paramProvider2, paramProvider, paramProvider3, paramProvider4);
  }
  
  public r get() {
    return a((a)this.a.get(), (a)this.b.get(), (e)this.c.get(), (o)this.d.get(), (q)this.e.get());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */