package e.f.a.c.i.x;

import android.content.Context;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.n;
import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import e.f.a.c.i.u.b.b;
import e.f.a.c.i.u.b.d;
import e.f.a.c.i.x.j.y;
import e.f.a.c.i.z.a;
import javax.inject.Provider;

public final class i implements b<s> {
  private final Provider<Context> a;
  
  private final Provider<y> b;
  
  private final Provider<n> c;
  
  private final Provider<a> d;
  
  public i(Provider<Context> paramProvider, Provider<y> paramProvider1, Provider<n> paramProvider2, Provider<a> paramProvider3) {
    this.a = paramProvider;
    this.b = paramProvider1;
    this.c = paramProvider2;
    this.d = paramProvider3;
  }
  
  public static s a(Context paramContext, y paramy, n paramn, a parama) {
    s s = h.a(paramContext, paramy, paramn, parama);
    d.a(s, "Cannot return null from a non-@Nullable @Provides method");
    return s;
  }
  
  public static i a(Provider<Context> paramProvider, Provider<y> paramProvider1, Provider<n> paramProvider2, Provider<a> paramProvider3) {
    return new i(paramProvider, paramProvider1, paramProvider2, paramProvider3);
  }
  
  public s get() {
    return a((Context)this.a.get(), (y)this.b.get(), (n)this.c.get(), (a)this.d.get());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */