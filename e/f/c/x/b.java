package e.f.c.x;

import e.f.c.a;
import e.f.c.c;
import e.f.c.e;
import e.f.c.j;
import e.f.c.l;
import e.f.c.n;
import e.f.c.o;
import e.f.c.p;
import e.f.c.s.e;
import e.f.c.v.a;
import e.f.c.x.d.j;
import e.f.c.x.e.a;
import e.f.c.x.e.b;
import java.util.ArrayList;
import java.util.Map;

public final class b implements l, a {
  private static int a(p paramp1, p paramp2) {
    return (paramp1 == null || paramp2 == null) ? 0 : (int)Math.abs(paramp1.a() - paramp2.a());
  }
  
  private static int a(p[] paramArrayOfp) {
    return Math.max(Math.max(a(paramArrayOfp[0], paramArrayOfp[4]), a(paramArrayOfp[6], paramArrayOfp[2]) * 17 / 18), Math.max(a(paramArrayOfp[1], paramArrayOfp[5]), a(paramArrayOfp[7], paramArrayOfp[3]) * 17 / 18));
  }
  
  private static n[] a(c paramc, Map<e, ?> paramMap, boolean paramBoolean) {
    ArrayList<n> arrayList = new ArrayList();
    b b1 = a.a(paramc, paramMap, paramBoolean);
    for (p[] arrayOfP : b1.b()) {
      e e = j.a(b1.a(), arrayOfP[4], arrayOfP[5], arrayOfP[6], arrayOfP[7], b(arrayOfP), a(arrayOfP));
      n n = new n(e.h(), e.e(), arrayOfP, a.m);
      n.a(o.f, e.b());
      c c1 = (c)e.d();
      if (c1 != null)
        n.a(o.k, c1); 
      arrayList.add(n);
    } 
    return arrayList.<n>toArray(new n[arrayList.size()]);
  }
  
  private static int b(p paramp1, p paramp2) {
    return (paramp1 == null || paramp2 == null) ? Integer.MAX_VALUE : (int)Math.abs(paramp1.a() - paramp2.a());
  }
  
  private static int b(p[] paramArrayOfp) {
    return Math.min(Math.min(b(paramArrayOfp[0], paramArrayOfp[4]), b(paramArrayOfp[6], paramArrayOfp[2]) * 17 / 18), Math.min(b(paramArrayOfp[1], paramArrayOfp[5]), b(paramArrayOfp[7], paramArrayOfp[3]) * 17 / 18));
  }
  
  public n a(c paramc, Map<e, ?> paramMap) {
    n[] arrayOfN = a(paramc, paramMap, false);
    if (arrayOfN != null && arrayOfN.length != 0 && arrayOfN[0] != null)
      return arrayOfN[0]; 
    throw j.a();
  }
  
  public void a() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */