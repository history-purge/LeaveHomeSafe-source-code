package e.f.a.c.i.x;

import com.google.android.datatransport.runtime.backends.e;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import e.f.a.c.i.u.b.b;
import e.f.a.c.i.x.j.y;
import e.f.a.c.i.y.b;
import java.util.concurrent.Executor;
import javax.inject.Provider;

public final class d implements b<c> {
  private final Provider<Executor> a;
  
  private final Provider<e> b;
  
  private final Provider<s> c;
  
  private final Provider<y> d;
  
  private final Provider<b> e;
  
  public d(Provider<Executor> paramProvider, Provider<e> paramProvider1, Provider<s> paramProvider2, Provider<y> paramProvider3, Provider<b> paramProvider4) {
    this.a = paramProvider;
    this.b = paramProvider1;
    this.c = paramProvider2;
    this.d = paramProvider3;
    this.e = paramProvider4;
  }
  
  public static c a(Executor paramExecutor, e parame, s params, y paramy, b paramb) {
    return new c(paramExecutor, parame, params, paramy, paramb);
  }
  
  public static d a(Provider<Executor> paramProvider, Provider<e> paramProvider1, Provider<s> paramProvider2, Provider<y> paramProvider3, Provider<b> paramProvider4) {
    return new d(paramProvider, paramProvider1, paramProvider2, paramProvider3, paramProvider4);
  }
  
  public c get() {
    return a((Executor)this.a.get(), (e)this.b.get(), (s)this.c.get(), (y)this.d.get(), (b)this.e.get());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */