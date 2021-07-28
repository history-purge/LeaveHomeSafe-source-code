package e.f.c.u;

import e.f.c.c;
import e.f.c.e;
import e.f.c.j;
import e.f.c.l;
import e.f.c.n;
import e.f.c.o;
import e.f.c.p;
import e.f.c.s.b;
import e.f.c.s.e;
import e.f.c.u.b.c;
import java.util.Map;

public final class a implements l {
  private static final p[] b = new p[0];
  
  private final c a = new c();
  
  private static b a(b paramb) {
    int[] arrayOfInt = paramb.b();
    if (arrayOfInt != null) {
      int k = arrayOfInt[0];
      int m = arrayOfInt[1];
      int n = arrayOfInt[2];
      int i1 = arrayOfInt[3];
      b b1 = new b(30, 33);
      for (int i = 0; i < 33; i++) {
        int i3 = (i * i1 + i1 / 2) / 33;
        for (int i2 = 0; i2 < 30; i2++) {
          if (paramb.b((i2 * n + n / 2 + (i & 0x1) * n / 2) / 30 + k, i3 + m))
            b1.c(i2, i); 
        } 
      } 
      return b1;
    } 
    j j = j.a();
    throw j;
  }
  
  public n a(c paramc, Map<e, ?> paramMap) {
    if (paramMap != null && paramMap.containsKey(e.d)) {
      b b = a(paramc.a());
      e e = this.a.a(b, paramMap);
      n n = new n(e.h(), e.e(), b, e.f.c.a.l);
      String str = e.b();
      if (str != null)
        n.a(o.f, str); 
      return n;
    } 
    throw j.a();
  }
  
  public void a() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/u/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */