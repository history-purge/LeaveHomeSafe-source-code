package e.f.a.c.i.x;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import e.f.a.c.i.u.b.b;
import e.f.a.c.i.u.b.d;
import e.f.a.c.i.z.a;
import javax.inject.Provider;

public final class g implements b<n> {
  private final Provider<a> a;
  
  public g(Provider<a> paramProvider) {
    this.a = paramProvider;
  }
  
  public static n a(a parama) {
    n n = f.a(parama);
    d.a(n, "Cannot return null from a non-@Nullable @Provides method");
    return n;
  }
  
  public static g a(Provider<a> paramProvider) {
    return new g(paramProvider);
  }
  
  public n get() {
    return a((a)this.a.get());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */