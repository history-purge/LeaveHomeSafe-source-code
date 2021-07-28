package e.e.j.a.a;

import android.content.Context;
import android.content.res.Resources;
import e.e.c.a.d;
import e.e.e.d.l;
import e.e.j.a.a.i.f;
import e.e.j.b.a;
import e.e.j.c.d;
import e.e.l.d.p;
import e.e.l.f.h;
import e.e.l.f.k;
import e.e.l.j.a;
import e.e.l.k.b;
import java.util.Set;
import java.util.concurrent.Executor;

public class f implements l<e> {
  private final Context a;
  
  private final h b;
  
  private final g c;
  
  private final Set<d> d;
  
  private final f e;
  
  public f(Context paramContext, b paramb) {
    this(paramContext, k.o(), paramb);
  }
  
  public f(Context paramContext, k paramk, b paramb) {
    this(paramContext, paramk, null, paramb);
  }
  
  public f(Context paramContext, k paramk, Set<d> paramSet, b paramb) {
    this.a = paramContext;
    this.b = paramk.f();
    if (paramb == null) {
      this.c = new g();
      g g1 = this.c;
      Resources resources = paramContext.getResources();
      a a1 = a.c();
      a a = paramk.a(paramContext);
      e.e.e.b.f f1 = e.e.e.b.f.b();
      p<d, b> p = this.b.e();
      if (paramb == null) {
        if (paramb == null) {
          g1.a(resources, a1, a, (Executor)f1, p, null, null);
          this.d = paramSet;
          if (paramb == null) {
            this.e = null;
            return;
          } 
          paramb.c();
          throw null;
        } 
        paramb.b();
        throw null;
      } 
      paramb.a();
      throw null;
    } 
    paramb.d();
    throw null;
  }
  
  public e get() {
    return (new e(this.a, this.c, this.b, this.d)).a(this.e);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/a/a/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */