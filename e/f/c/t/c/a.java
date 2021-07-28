package e.f.c.t.c;

import e.f.c.j;
import e.f.c.p;
import e.f.c.s.g;
import e.f.c.s.i;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class a {
  private final e.f.c.s.b a;
  
  private final e.f.c.s.m.b b;
  
  public a(e.f.c.s.b paramb) {
    this.a = paramb;
    this.b = new e.f.c.s.m.b(paramb);
  }
  
  private static int a(p paramp1, p paramp2) {
    return e.f.c.s.m.a.a(p.a(paramp1, paramp2));
  }
  
  private p a(p paramp1, p paramp2, p paramp3, p paramp4, int paramInt) {
    float f2 = a(paramp1, paramp2);
    float f1 = paramInt;
    f2 /= f1;
    paramInt = a(paramp3, paramp4);
    float f4 = paramp4.a();
    float f5 = paramp3.a();
    float f3 = paramInt;
    f4 = (f4 - f5) / f3;
    f3 = (paramp4.b() - paramp3.b()) / f3;
    p p1 = new p(paramp4.a() + f4 * f2, paramp4.b() + f2 * f3);
    f1 = a(paramp1, paramp3) / f1;
    paramInt = a(paramp2, paramp4);
    f3 = paramp4.a();
    f4 = paramp2.a();
    f2 = paramInt;
    f3 = (f3 - f4) / f2;
    f2 = (paramp4.b() - paramp2.b()) / f2;
    paramp1 = new p(paramp4.a() + f3 * f1, paramp4.b() + f1 * f2);
    return !a(p1) ? (a(paramp1) ? paramp1 : null) : (!a(paramp1) ? p1 : ((Math.abs(b(paramp3, p1).c() - b(paramp2, p1).c()) <= Math.abs(b(paramp3, paramp1).c() - b(paramp2, paramp1).c())) ? p1 : paramp1));
  }
  
  private p a(p paramp1, p paramp2, p paramp3, p paramp4, int paramInt1, int paramInt2) {
    float f1 = a(paramp1, paramp2) / paramInt1;
    int i = a(paramp3, paramp4);
    float f3 = paramp4.a();
    float f4 = paramp3.a();
    float f2 = i;
    f3 = (f3 - f4) / f2;
    f2 = (paramp4.b() - paramp3.b()) / f2;
    p p1 = new p(paramp4.a() + f3 * f1, paramp4.b() + f1 * f2);
    f1 = a(paramp1, paramp3) / paramInt2;
    i = a(paramp2, paramp4);
    f3 = paramp4.a();
    f4 = paramp2.a();
    f2 = i;
    f3 = (f3 - f4) / f2;
    f2 = (paramp4.b() - paramp2.b()) / f2;
    paramp1 = new p(paramp4.a() + f3 * f1, paramp4.b() + f1 * f2);
    return !a(p1) ? (a(paramp1) ? paramp1 : null) : (!a(paramp1) ? p1 : ((Math.abs(paramInt1 - b(paramp3, p1).c()) + Math.abs(paramInt2 - b(paramp2, p1).c()) <= Math.abs(paramInt1 - b(paramp3, paramp1).c()) + Math.abs(paramInt2 - b(paramp2, paramp1).c())) ? p1 : paramp1));
  }
  
  private static e.f.c.s.b a(e.f.c.s.b paramb, p paramp1, p paramp2, p paramp3, p paramp4, int paramInt1, int paramInt2) {
    i i = i.a();
    float f1 = paramInt1 - 0.5F;
    float f2 = paramInt2 - 0.5F;
    return i.a(paramb, paramInt1, paramInt2, 0.5F, 0.5F, f1, 0.5F, f1, f2, 0.5F, f2, paramp1.a(), paramp1.b(), paramp4.a(), paramp4.b(), paramp3.a(), paramp3.b(), paramp2.a(), paramp2.b());
  }
  
  private static void a(Map<p, Integer> paramMap, p paramp) {
    Integer integer = paramMap.get(paramp);
    int i = 1;
    if (integer != null)
      i = 1 + integer.intValue(); 
    paramMap.put(paramp, Integer.valueOf(i));
  }
  
  private boolean a(p paramp) {
    return (paramp.a() >= 0.0F && paramp.a() < this.a.f() && paramp.b() > 0.0F && paramp.b() < this.a.c());
  }
  
  private b b(p paramp1, p paramp2) {
    boolean bool;
    int i3 = (int)paramp1.a();
    int n = (int)paramp1.b();
    int m = (int)paramp2.a();
    int k = (int)paramp2.b();
    int i = Math.abs(k - n);
    int j = Math.abs(m - i3);
    int i4 = 0;
    byte b1 = 1;
    if (i > j) {
      bool = true;
    } else {
      bool = false;
    } 
    i = i3;
    j = n;
    int i2 = m;
    int i1 = k;
    if (bool) {
      j = i3;
      i = n;
      i1 = m;
      i2 = k;
    } 
    int i5 = Math.abs(i2 - i);
    int i6 = Math.abs(i1 - j);
    n = -i5 / 2;
    if (j < i1) {
      i3 = 1;
    } else {
      i3 = -1;
    } 
    if (i >= i2)
      b1 = -1; 
    e.f.c.s.b b2 = this.a;
    if (bool) {
      k = j;
    } else {
      k = i;
    } 
    if (bool) {
      m = i;
    } else {
      m = j;
    } 
    boolean bool1 = b2.b(k, m);
    k = i4;
    while (true) {
      i4 = k;
      if (i != i2) {
        b2 = this.a;
        if (bool) {
          m = j;
        } else {
          m = i;
        } 
        if (bool) {
          i4 = i;
        } else {
          i4 = j;
        } 
        boolean bool3 = b2.b(m, i4);
        m = k;
        boolean bool2 = bool1;
        if (bool3 != bool1) {
          m = k + 1;
          bool2 = bool3;
        } 
        int i7 = n + i6;
        k = j;
        n = i7;
        if (i7 > 0) {
          i4 = m;
          if (j != i1) {
            k = j + i3;
            n = i7 - i5;
          } else {
            break;
          } 
        } 
        i += b1;
        j = k;
        k = m;
        bool1 = bool2;
        continue;
      } 
      break;
    } 
    return new b(paramp1, paramp2, i4, null);
  }
  
  public g a() {
    p p1;
    p p3;
    p[] arrayOfP = this.b.a();
    p p4 = arrayOfP[0];
    p p5 = arrayOfP[1];
    p p6 = arrayOfP[2];
    p p7 = arrayOfP[3];
    ArrayList<b> arrayList = new ArrayList(4);
    arrayList.add(b(p4, p5));
    arrayList.add(b(p4, p6));
    arrayList.add(b(p5, p7));
    arrayList.add(b(p6, p7));
    p p2 = null;
    Collections.sort(arrayList, new c(null));
    b b1 = arrayList.get(0);
    b b2 = arrayList.get(1);
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    a((Map)hashMap, b1.a());
    a((Map)hashMap, b1.b());
    a((Map)hashMap, b2.a());
    a((Map)hashMap, b2.b());
    Iterator<Map.Entry> iterator = hashMap.entrySet().iterator();
    b b3 = null;
    b2 = b3;
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      p p = (p)entry.getKey();
      if (((Integer)entry.getValue()).intValue() == 2) {
        p3 = p;
        continue;
      } 
      if (p2 == null) {
        p2 = p;
        continue;
      } 
      p1 = p;
    } 
    if (p2 != null && p3 != null && p1 != null) {
      p p8;
      e.f.c.s.b b5;
      p[] arrayOfP1 = new p[3];
      arrayOfP1[0] = p2;
      arrayOfP1[1] = p3;
      arrayOfP1[2] = p1;
      p.a(arrayOfP1);
      p p9 = arrayOfP1[0];
      p p10 = arrayOfP1[1];
      p2 = arrayOfP1[2];
      if (!hashMap.containsKey(p4)) {
        p8 = p4;
      } else if (!hashMap.containsKey(p5)) {
        p8 = p5;
      } else if (!hashMap.containsKey(p6)) {
        p8 = p6;
      } else {
        p8 = p7;
      } 
      int m = b(p2, p8).c();
      int k = b(p9, p8).c();
      int i = m;
      if ((m & 0x1) == 1)
        i = m + 1; 
      m = i + 2;
      i = k;
      if ((k & 0x1) == 1)
        i = k + 1; 
      i += 2;
      if (m * 4 >= i * 7 || i * 4 >= m * 7) {
        p3 = p2;
        p4 = a(p10, p9, p2, p8, m, i);
        p1 = p4;
        if (p4 == null)
          p1 = p8; 
        k = b(p3, p1).c();
        m = b(p9, p1).c();
        i = k;
        if ((k & 0x1) == 1)
          i = k + 1; 
        k = m;
        if ((m & 0x1) == 1)
          k = m + 1; 
        b4 = a(this.a, p3, p10, p9, p1, i, k);
        return new g(b4, new p[] { p2, p10, p9, p1 });
      } 
      p3 = a(p10, p9, p2, (p)b4, Math.min(i, m));
      p1 = p3;
      if (p3 == null)
        b5 = b4; 
      k = Math.max(b(p2, (p)b5).c(), b(p9, (p)b5).c()) + 1;
      i = k;
      if ((k & 0x1) == 1)
        i = k + 1; 
      e.f.c.s.b b4 = a(this.a, p2, p10, p9, (p)b5, i, i);
      return new g(b4, new p[] { p2, p10, p9, (p)b5 });
    } 
    j j = j.a();
    throw j;
  }
  
  private static final class b {
    private final p a;
    
    private final p b;
    
    private final int c;
    
    private b(p param1p1, p param1p2, int param1Int) {
      this.a = param1p1;
      this.b = param1p2;
      this.c = param1Int;
    }
    
    p a() {
      return this.a;
    }
    
    p b() {
      return this.b;
    }
    
    int c() {
      return this.c;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(this.a);
      stringBuilder.append("/");
      stringBuilder.append(this.b);
      stringBuilder.append('/');
      stringBuilder.append(this.c);
      return stringBuilder.toString();
    }
  }
  
  private static final class c implements Serializable, Comparator<b> {
    private c() {}
    
    public int a(a.b param1b1, a.b param1b2) {
      return param1b1.c() - param1b2.c();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/t/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */