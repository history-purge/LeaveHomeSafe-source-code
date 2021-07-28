package e.e.j.a.a;

import android.content.Context;
import android.net.Uri;
import e.e.c.a.d;
import e.e.e.h.a;
import e.e.g.c;
import e.e.j.a.a.i.b;
import e.e.j.a.a.i.f;
import e.e.j.c.b;
import e.e.j.c.d;
import e.e.j.h.d;
import e.e.l.d.f;
import e.e.l.e.f;
import e.e.l.f.h;
import e.e.l.k.b;
import e.e.l.k.e;
import e.e.l.l.c;
import e.e.l.o.c;
import e.e.l.o.d;
import e.e.l.p.b;
import java.util.Set;

public class e extends b<e, c, a<b>, e> {
  private final h s;
  
  private final g t;
  
  private e.e.e.d.e<e.e.l.j.a> u;
  
  private b v;
  
  private f w;
  
  public e(Context paramContext, g paramg, h paramh, Set<d> paramSet) {
    super(paramContext, paramSet);
    this.s = paramh;
    this.t = paramg;
  }
  
  public static c.b a(b.c paramc) {
    int i = a.a[paramc.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i == 3)
          return c.b.f; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Cache level");
        stringBuilder.append(paramc);
        stringBuilder.append("is not supported. ");
        throw new RuntimeException(stringBuilder.toString());
      } 
      return c.b.d;
    } 
    return c.b.c;
  }
  
  private d n() {
    c c = (c)f();
    f f1 = this.s.f();
    return (f1 != null && c != null) ? ((c.f() != null) ? f1.b(c, c()) : f1.a(c, c())) : null;
  }
  
  protected c<a<b>> a(e.e.j.h.a parama, String paramString, c paramc, Object paramObject, b.c paramc1) {
    return this.s.a(paramc, paramObject, a(paramc1), b(parama));
  }
  
  public e a(Uri paramUri) {
    if (paramUri == null) {
      paramUri = null;
      b(paramUri);
      return this;
    } 
    d d = d.b(paramUri);
    d.a(f.f());
    c c = d.a();
    b(c);
    return this;
  }
  
  public e a(f paramf) {
    this.w = paramf;
    i();
    return this;
  }
  
  protected c b(e.e.j.h.a parama) {
    return (parama instanceof d) ? ((d)parama).q() : null;
  }
  
  protected d j() {
    if (b.c())
      b.a("PipelineDraweeControllerBuilder#obtainController"); 
    try {
      d d;
      e.e.j.h.a a = g();
      String str = b.m();
      if (a instanceof d) {
        d = (d)a;
      } else {
        d = this.t.a();
      } 
      d.a(a((e.e.j.h.a)d, str), str, n(), c(), this.u, this.v);
      d.a(this.w);
      return d;
    } finally {
      if (b.c())
        b.a(); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/a/a/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */