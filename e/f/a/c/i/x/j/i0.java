package e.f.a.c.i.x.j;

import android.content.Context;
import e.f.a.c.i.u.b.b;
import javax.inject.Provider;

public final class i0 implements b<h0> {
  private final Provider<Context> a;
  
  private final Provider<String> b;
  
  private final Provider<Integer> c;
  
  public i0(Provider<Context> paramProvider, Provider<String> paramProvider1, Provider<Integer> paramProvider2) {
    this.a = paramProvider;
    this.b = paramProvider1;
    this.c = paramProvider2;
  }
  
  public static h0 a(Context paramContext, String paramString, int paramInt) {
    return new h0(paramContext, paramString, paramInt);
  }
  
  public static i0 a(Provider<Context> paramProvider, Provider<String> paramProvider1, Provider<Integer> paramProvider2) {
    return new i0(paramProvider, paramProvider1, paramProvider2);
  }
  
  public h0 get() {
    return a((Context)this.a.get(), (String)this.b.get(), ((Integer)this.c.get()).intValue());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/x/j/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */