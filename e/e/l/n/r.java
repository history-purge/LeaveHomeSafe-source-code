package e.e.l.n;

import e.e.c.a.d;
import e.e.e.d.f;
import e.e.e.g.g;
import e.e.k.c;
import e.e.l.d.f;
import e.e.l.d.p;
import e.e.l.k.d;
import e.e.l.o.c;
import e.e.l.p.b;
import java.util.Map;

public class r implements j0<d> {
  private final p<d, g> a;
  
  private final f b;
  
  private final j0<d> c;
  
  public r(p<d, g> paramp, f paramf, j0<d> paramj0) {
    this.a = paramp;
    this.b = paramf;
    this.c = paramj0;
  }
  
  public void a(k<d> paramk, k0 paramk0) {
    try {
      Map<String, String> map1;
      Map<String, String> map2;
      if (b.c())
        b.a("EncodedMemoryCacheProducer#produceResults"); 
      String str = paramk0.a();
      m0 m0 = paramk0.e();
      m0.a(str, "EncodedMemoryCacheProducer");
      c c = paramk0.f();
      d d = this.b.c(c, paramk0.b());
      e.e.e.h.a a1 = this.a.get(d);
      d d2 = null;
      c = null;
      if (a1 != null)
        try {
          d2 = new d(a1);
          c c1 = c;
        } finally {
          e.e.e.h.a.b(a1);
        }  
      int i = map2.h().a();
      int j = c.b.e.a();
      if (i >= j) {
        if (m0.a(str)) {
          map2 = f.of("cached_value_found", "false");
        } else {
          map2 = null;
        } 
        m0.a(str, "EncodedMemoryCacheProducer", map2);
        m0.a(str, "EncodedMemoryCacheProducer", false);
        paramk.a(null, 1);
        e.e.e.h.a.b(a1);
        return;
      } 
      boolean bool = map2.f().s();
      a a = new a(paramk, this.a, d, bool);
      d d1 = d2;
      if (m0.a(str))
        map1 = f.of("cached_value_found", "false"); 
      m0.a(str, "EncodedMemoryCacheProducer", map1);
      this.c.a(a, (k0)map2);
      e.e.e.h.a.b(a1);
      return;
    } finally {
      if (b.c())
        b.a(); 
    } 
  }
  
  private static class a extends n<d, d> {
    private final p<d, g> c;
    
    private final d d;
    
    private final boolean e;
    
    public a(k<d> param1k, p<d, g> param1p, d param1d, boolean param1Boolean) {
      super(param1k);
      this.c = param1p;
      this.d = param1d;
      this.e = param1Boolean;
    }
    
    public void a(d param1d, int param1Int) {
      try {
        if (b.c())
          b.a("EncodedMemoryCacheProducer#onNewResultImpl"); 
        if (b.b(param1Int) || param1d == null || b.a(param1Int, 10) || param1d.t() == c.b) {
          c().a((O)param1d, param1Int);
          return;
        } 
        e.e.e.h.a a1 = param1d.b();
        if (a1 != null) {
          d d1;
          e.e.e.h.a a2 = null;
          try {
            if (this.e)
              a2 = this.c.a(this.d, a1); 
            e.e.e.h.a.b(a1);
          } finally {
            e.e.e.h.a.b((e.e.e.h.a)d1);
          } 
        } 
        c().a((O)param1d, param1Int);
        return;
      } finally {
        if (b.c())
          b.a(); 
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */