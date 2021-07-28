package e.f.c.t;

import e.f.c.c;
import e.f.c.e;
import e.f.c.j;
import e.f.c.l;
import e.f.c.n;
import e.f.c.o;
import e.f.c.p;
import e.f.c.s.b;
import e.f.c.s.e;
import e.f.c.s.g;
import e.f.c.t.b.d;
import e.f.c.t.c.a;
import java.util.List;
import java.util.Map;

public final class a implements l {
  private static final p[] b = new p[0];
  
  private final d a = new d();
  
  private static int a(int[] paramArrayOfint, b paramb) {
    int k = paramb.f();
    int i = paramArrayOfint[0];
    int m = paramArrayOfint[1];
    while (i < k && paramb.b(i, m))
      i++; 
    if (i != k) {
      i -= paramArrayOfint[0];
      if (i != 0)
        return i; 
      throw j.a();
    } 
    j j = j.a();
    throw j;
  }
  
  private static b a(b paramb) {
    int[] arrayOfInt1 = paramb.d();
    int[] arrayOfInt2 = paramb.a();
    if (arrayOfInt1 != null && arrayOfInt2 != null) {
      int k = a(arrayOfInt1, paramb);
      int m = arrayOfInt1[1];
      int i = arrayOfInt2[1];
      int n = arrayOfInt1[0];
      int i1 = (arrayOfInt2[0] - n + 1) / k;
      int i2 = (i - m + 1) / k;
      if (i1 > 0 && i2 > 0) {
        int i3 = k / 2;
        b b1 = new b(i1, i2);
        for (i = 0; i < i2; i++) {
          for (int i4 = 0; i4 < i1; i4++) {
            if (paramb.b(i4 * k + n + i3, i * k + m + i3))
              b1.c(i4, i); 
          } 
        } 
        return b1;
      } 
      throw j.a();
    } 
    j j = j.a();
    throw j;
  }
  
  public n a(c paramc, Map<e, ?> paramMap) {
    e e;
    p[] arrayOfP;
    if (paramMap != null && paramMap.containsKey(e.d)) {
      b b = a(paramc.a());
      e = this.a.a(b);
      arrayOfP = b;
    } else {
      g g = (new a(e.a())).a();
      e = this.a.a(g.a());
      arrayOfP = g.b();
    } 
    n n = new n(e.h(), e.e(), arrayOfP, e.f.c.a.h);
    List list = e.a();
    if (list != null)
      n.a(o.e, list); 
    String str = e.b();
    if (str != null)
      n.a(o.f, str); 
    return n;
  }
  
  public void a() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/t/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */