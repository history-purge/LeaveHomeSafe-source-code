package e.f.c.y;

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
import e.f.c.y.b.e;
import e.f.c.y.b.i;
import e.f.c.y.c.c;
import java.util.List;
import java.util.Map;

public class a implements l {
  private static final p[] b = new p[0];
  
  private final e a = new e();
  
  private static float a(int[] paramArrayOfint, b paramb) {
    int n = paramb.c();
    int i1 = paramb.f();
    int k = paramArrayOfint[0];
    boolean bool = true;
    int i = paramArrayOfint[1];
    int m;
    for (m = 0; k < i1 && i < n; m = i2) {
      int i4;
      boolean bool1 = bool;
      int i2 = m;
      if (bool != paramb.b(k, i)) {
        i2 = m + 1;
        if (i2 != 5) {
          i4 = bool ^ true;
        } else {
          break;
        } 
      } 
      k++;
      i++;
      int i3 = i4;
    } 
    if (k != i1 && i != n)
      return (k - paramArrayOfint[0]) / 7.0F; 
    j j = j.a();
    throw j;
  }
  
  private static b a(b paramb) {
    int[] arrayOfInt1 = paramb.d();
    int[] arrayOfInt2 = paramb.a();
    if (arrayOfInt1 != null && arrayOfInt2 != null) {
      float f = a(arrayOfInt1, paramb);
      int k = arrayOfInt1[1];
      int m = arrayOfInt2[1];
      int n = arrayOfInt1[0];
      int i = arrayOfInt2[0];
      if (n < i && k < m) {
        int i3 = m - k;
        int i1 = i;
        if (i3 != i - n) {
          i1 = n + i3;
          if (i1 >= paramb.f())
            throw j.a(); 
        } 
        int i2 = Math.round((i1 - n + 1) / f);
        i3 = Math.round((i3 + 1) / f);
        if (i2 > 0 && i3 > 0) {
          if (i3 == i2) {
            int i4 = (int)(f / 2.0F);
            k += i4;
            i = n + i4;
            n = (int)((i2 - 1) * f) + i - i1;
            i1 = i;
            if (n > 0)
              if (n <= i4) {
                i1 = i - n;
              } else {
                throw j.a();
              }  
            m = (int)((i3 - 1) * f) + k - m;
            i = k;
            if (m > 0)
              if (m <= i4) {
                i = k - m;
              } else {
                throw j.a();
              }  
            b b1 = new b(i2, i3);
            for (k = 0; k < i3; k++) {
              i4 = (int)(k * f);
              for (m = 0; m < i2; m++) {
                if (paramb.b((int)(m * f) + i1, i4 + i))
                  b1.c(m, k); 
              } 
            } 
            return b1;
          } 
          throw j.a();
        } 
        throw j.a();
      } 
      throw j.a();
    } 
    j j = j.a();
    throw j;
  }
  
  public final n a(c paramc, Map<e, ?> paramMap) {
    e e1;
    p[] arrayOfP;
    if (paramMap != null && paramMap.containsKey(e.d)) {
      b b = a(paramc.a());
      e1 = this.a.a(b, paramMap);
      arrayOfP = b;
    } else {
      g g = (new c(e1.a())).a((Map)arrayOfP);
      e1 = this.a.a(g.a(), (Map)arrayOfP);
      arrayOfP = g.b();
    } 
    if (e1.d() instanceof i)
      ((i)e1.d()).a(arrayOfP); 
    n n = new n(e1.h(), e1.e(), arrayOfP, e.f.c.a.n);
    List list = e1.a();
    if (list != null)
      n.a(o.e, list); 
    String str = e1.b();
    if (str != null)
      n.a(o.f, str); 
    if (e1.i()) {
      n.a(o.l, Integer.valueOf(e1.g()));
      n.a(o.m, Integer.valueOf(e1.f()));
    } 
    return n;
  }
  
  public void a() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */