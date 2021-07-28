package e.f.c.x.d;

import e.f.c.d;
import e.f.c.f;
import e.f.c.p;
import e.f.c.s.b;
import e.f.c.s.e;
import e.f.c.s.m.a;
import e.f.c.x.a;
import e.f.c.x.d.k.a;
import java.lang.reflect.Array;
import java.util.ArrayList;

public final class j {
  private static final a a = new a();
  
  private static int a(b paramb, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4) {
    byte b1;
    if (paramBoolean) {
      b1 = -1;
    } else {
      b1 = 1;
    } 
    int i = 0;
    int k = paramInt3;
    while (i < 2) {
      while ((paramBoolean ? (k >= paramInt1) : (k < paramInt2)) && paramBoolean == paramb.b(k, paramInt4)) {
        if (Math.abs(paramInt3 - k) > 2)
          return paramInt3; 
        k += b1;
      } 
      b1 = -b1;
      int m = paramBoolean ^ true;
      i++;
    } 
    return k;
  }
  
  private static int a(f paramf, int paramInt1, int paramInt2, boolean paramBoolean) {
    byte b;
    if (paramBoolean) {
      b = 1;
    } else {
      b = -1;
    } 
    d d = null;
    int i = paramInt1 - b;
    if (a(paramf, i))
      d = paramf.a(i).a(paramInt2); 
    if (d != null)
      return paramBoolean ? d.b() : d.d(); 
    d = paramf.a(paramInt1).b(paramInt2);
    if (d != null)
      return paramBoolean ? d.d() : d.b(); 
    if (a(paramf, i))
      d = paramf.a(i).b(paramInt2); 
    if (d != null)
      return paramBoolean ? d.b() : d.d(); 
    i = 0;
    paramInt2 = paramInt1;
    paramInt1 = i;
    while (true) {
      i = paramInt2 - b;
      if (a(paramf, i)) {
        d[] arrayOfD = paramf.a(i).b();
        int k = arrayOfD.length;
        for (paramInt2 = 0; paramInt2 < k; paramInt2++) {
          d d1 = arrayOfD[paramInt2];
          if (d1 != null) {
            if (paramBoolean) {
              paramInt2 = d1.b();
            } else {
              paramInt2 = d1.d();
            } 
            return paramInt2 + b * paramInt1 * (d1.b() - d1.d());
          } 
        } 
        paramInt1++;
        paramInt2 = i;
        continue;
      } 
      c c = paramf.d();
      return paramBoolean ? c.e() : c.c();
    } 
  }
  
  private static int a(int[] paramArrayOfint) {
    return (paramArrayOfint[0] - paramArrayOfint[2] + paramArrayOfint[4] - paramArrayOfint[6] + 9) % 9;
  }
  
  private static int a(int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt) {
    if ((paramArrayOfint2 == null || paramArrayOfint2.length <= paramInt / 2 + 3) && paramInt >= 0 && paramInt <= 512)
      return a.a(paramArrayOfint1, paramInt, paramArrayOfint2); 
    throw d.a();
  }
  
  private static e a(int paramInt, int[] paramArrayOfint1, int[] paramArrayOfint2, int[] paramArrayOfint3, int[][] paramArrayOfint) {
    int[] arrayOfInt = new int[paramArrayOfint3.length];
    int i = 100;
    while (true) {
      if (i > 0) {
        int k;
        for (k = 0; k < arrayOfInt.length; k++)
          paramArrayOfint1[paramArrayOfint3[k]] = paramArrayOfint[k][arrayOfInt[k]]; 
        try {
          return a(paramArrayOfint1, paramInt, paramArrayOfint2);
        } catch (d d1) {
          if (arrayOfInt.length != 0) {
            k = 0;
            while (k < arrayOfInt.length) {
              if (arrayOfInt[k] < (paramArrayOfint[k]).length - 1) {
                arrayOfInt[k] = arrayOfInt[k] + 1;
                break;
              } 
              arrayOfInt[k] = 0;
              if (k != arrayOfInt.length - 1) {
                k++;
                continue;
              } 
              throw d.a();
            } 
            i--;
            continue;
          } 
          throw d.a();
        } 
      } 
      d d = d.a();
      throw d;
    } 
  }
  
  public static e a(b paramb, p paramp1, p paramp2, p paramp3, p paramp4, int paramInt1, int paramInt2) {
    h h1;
    h h2;
    boolean bool;
    f f;
    c c = new c(paramb, paramp1, paramp2, paramp3, paramp4);
    paramp2 = null;
    p p1 = paramp2;
    paramp4 = p1;
    int i = 0;
    while (i < 2) {
      if (paramp1 != null)
        h1 = a(paramb, c, paramp1, true, paramInt1, paramInt2); 
      if (paramp3 != null)
        h2 = a(paramb, c, paramp3, false, paramInt1, paramInt2); 
      f = b(h1, h2);
      if (f != null) {
        if (i == 0 && f.d() != null && (f.d().f() < c.f() || f.d().d() > c.d())) {
          c = f.d();
          i++;
          continue;
        } 
        f.a(c);
        break;
      } 
      throw e.f.c.j.a();
    } 
    int k = f.a() + 1;
    f.a(0, h1);
    f.a(k, h2);
    if (h1 != null) {
      bool = true;
    } else {
      bool = false;
    } 
    i = 1;
    while (i <= k) {
      int i1;
      if (bool) {
        i1 = i;
      } else {
        i1 = k - i;
      } 
      int n = paramInt1;
      int m = paramInt2;
      if (f.a(i1) == null) {
        g g;
        if (i1 == 0 || i1 == k) {
          boolean bool1;
          if (i1 == 0) {
            bool1 = true;
          } else {
            bool1 = false;
          } 
          g = new h(c, bool1);
        } else {
          g = new g(c);
        } 
        f.a(i1, g);
        int i2 = c.f();
        n = -1;
        m = paramInt1;
        paramInt1 = paramInt2;
        paramInt2 = n;
        while (i2 <= c.d()) {
          n = a(f, i1, i2, bool);
          if (n < 0 || n > c.c())
            if (paramInt2 != -1) {
              n = paramInt2;
            } else {
              continue;
            }  
          d d = a(paramb, c.e(), c.c(), bool, n, i2, m, paramInt1);
          if (d != null) {
            g.a(i2, d);
            m = Math.min(m, d.f());
            paramInt1 = Math.max(paramInt1, d.f());
            paramInt2 = n;
          } 
          continue;
          i2++;
        } 
        n = m;
        m = paramInt1;
      } 
      i++;
      paramInt1 = n;
      paramInt2 = m;
    } 
    return b(f);
  }
  
  private static e a(int[] paramArrayOfint1, int paramInt, int[] paramArrayOfint2) {
    if (paramArrayOfint1.length != 0) {
      int i = 1 << paramInt + 1;
      int k = a(paramArrayOfint1, paramArrayOfint2, i);
      a(paramArrayOfint1, i);
      e e = e.a(paramArrayOfint1, String.valueOf(paramInt));
      e.b(Integer.valueOf(k));
      e.a(Integer.valueOf(paramArrayOfint2.length));
      return e;
    } 
    throw f.a();
  }
  
  private static a a(h paramh1, h paramh2) {
    a a1;
    if (paramh1 != null) {
      a a2 = paramh1.c();
      if (a2 != null) {
        if (paramh2 != null) {
          a1 = paramh2.c();
          if (a1 == null)
            return a2; 
          if (a2.a() != a1.a() && a2.b() != a1.b() && a2.c() != a1.c())
            return null; 
        } 
        return a2;
      } 
    } 
    return (a1 == null) ? null : a1.c();
  }
  
  private static c a(h paramh) {
    if (paramh == null)
      return null; 
    int[] arrayOfInt = paramh.d();
    if (arrayOfInt == null)
      return null; 
    int i1 = b(arrayOfInt);
    int n = arrayOfInt.length;
    boolean bool = false;
    int m = 0;
    int k = 0;
    while (true) {
      i = k;
      if (m < n) {
        int i2 = arrayOfInt[m];
        k += i1 - i2;
        i = k;
        if (i2 <= 0) {
          m++;
          continue;
        } 
      } 
      break;
    } 
    d[] arrayOfD = paramh.b();
    k = 0;
    m = i;
    int i;
    for (i = k; m > 0 && arrayOfD[i] == null; i++)
      m--; 
    n = arrayOfInt.length - 1;
    k = bool;
    while (true) {
      i = k;
      if (n >= 0) {
        k += i1 - arrayOfInt[n];
        i = k;
        if (arrayOfInt[n] <= 0) {
          n--;
          continue;
        } 
      } 
      break;
    } 
    n = arrayOfD.length - 1;
    k = i;
    for (i = n; k > 0 && arrayOfD[i] == null; i--)
      k--; 
    return paramh.a().a(m, k, paramh.e());
  }
  
  private static d a(b paramb, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    paramInt3 = a(paramb, paramInt1, paramInt2, paramBoolean, paramInt3, paramInt4);
    int[] arrayOfInt = b(paramb, paramInt1, paramInt2, paramBoolean, paramInt3, paramInt4);
    if (arrayOfInt == null)
      return null; 
    paramInt4 = a.a(arrayOfInt);
    if (paramBoolean) {
      paramInt2 = paramInt3 + paramInt4;
      paramInt1 = paramInt3;
      paramInt3 = paramInt2;
    } else {
      for (paramInt1 = 0; paramInt1 < arrayOfInt.length / 2; paramInt1++) {
        paramInt2 = arrayOfInt[paramInt1];
        arrayOfInt[paramInt1] = arrayOfInt[arrayOfInt.length - 1 - paramInt1];
        arrayOfInt[arrayOfInt.length - 1 - paramInt1] = paramInt2;
      } 
      paramInt1 = paramInt3 - paramInt4;
    } 
    if (!a(paramInt4, paramInt5, paramInt6))
      return null; 
    paramInt2 = i.d(arrayOfInt);
    paramInt4 = a.a(paramInt2);
    return (paramInt4 == -1) ? null : new d(paramInt1, paramInt3, b(paramInt2), paramInt4);
  }
  
  private static h a(b paramb, c paramc, p paramp, boolean paramBoolean, int paramInt1, int paramInt2) {
    h h = new h(paramc, paramBoolean);
    int i;
    for (i = 0; i < 2; i++) {
      byte b1;
      if (i == 0) {
        b1 = 1;
      } else {
        b1 = -1;
      } 
      int k = (int)paramp.a();
      int m;
      for (m = (int)paramp.b(); m <= paramc.d() && m >= paramc.f(); m += b1) {
        d d = a(paramb, 0, paramb.f(), paramBoolean, k, m, paramInt1, paramInt2);
        if (d != null) {
          h.a(m, d);
          if (paramBoolean) {
            k = d.d();
          } else {
            k = d.b();
          } 
        } 
      } 
    } 
    return h;
  }
  
  private static void a(f paramf, b[][] paramArrayOfb) {
    b b1 = paramArrayOfb[0][1];
    int[] arrayOfInt = b1.a();
    int i = paramf.a() * paramf.c() - c(paramf.b());
    if (arrayOfInt.length == 0) {
      if (i > 0 && i <= 928) {
        b1.a(i);
        return;
      } 
      throw e.f.c.j.a();
    } 
    if (arrayOfInt[0] != i)
      b1.a(i); 
  }
  
  private static void a(int[] paramArrayOfint, int paramInt) {
    if (paramArrayOfint.length >= 4) {
      int i = paramArrayOfint[0];
      if (i <= paramArrayOfint.length) {
        if (i == 0) {
          if (paramInt < paramArrayOfint.length) {
            paramArrayOfint[0] = paramArrayOfint.length - paramInt;
            return;
          } 
          throw f.a();
        } 
        return;
      } 
      throw f.a();
    } 
    throw f.a();
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt2 - 2 <= paramInt1 && paramInt1 <= paramInt3 + 2);
  }
  
  private static boolean a(f paramf, int paramInt) {
    return (paramInt >= 0 && paramInt <= paramf.a() + 1);
  }
  
  private static int[] a(int paramInt) {
    int[] arrayOfInt = new int[8];
    int k = 0;
    for (int i = 7;; i = n) {
      int i1 = paramInt & 0x1;
      int m = k;
      int n = i;
      if (i1 != k) {
        n = i - 1;
        if (n >= 0) {
          m = i1;
        } else {
          return arrayOfInt;
        } 
      } 
      arrayOfInt[n] = arrayOfInt[n] + 1;
      paramInt >>= 1;
      k = m;
    } 
  }
  
  private static b[][] a(f paramf) {
    b[][] arrayOfB = (b[][])Array.newInstance(b.class, new int[] { paramf.c(), paramf.a() + 2 });
    int i;
    for (i = 0; i < arrayOfB.length; i++) {
      for (int n = 0; n < (arrayOfB[i]).length; n++)
        arrayOfB[i][n] = new b(); 
    } 
    g[] arrayOfG = paramf.e();
    int m = arrayOfG.length;
    i = 0;
    int k = 0;
    while (i < m) {
      g g = arrayOfG[i];
      if (g != null)
        for (d d : g.b()) {
          if (d != null) {
            int n = d.c();
            if (n >= 0 && n < arrayOfB.length)
              arrayOfB[n][k].a(d.e()); 
          } 
        }  
      k++;
      i++;
    } 
    return arrayOfB;
  }
  
  private static int b(int paramInt) {
    return a(a(paramInt));
  }
  
  private static int b(int[] paramArrayOfint) {
    int m = paramArrayOfint.length;
    int k = -1;
    for (int i = 0; i < m; i++)
      k = Math.max(k, paramArrayOfint[i]); 
    return k;
  }
  
  private static e b(f paramf) {
    b[][] arrayOfB = a(paramf);
    a(paramf, arrayOfB);
    ArrayList<Integer> arrayList1 = new ArrayList();
    int[] arrayOfInt = new int[paramf.c() * paramf.a()];
    ArrayList<int[]> arrayList = new ArrayList();
    ArrayList<Integer> arrayList2 = new ArrayList();
    boolean bool = false;
    int i;
    for (i = 0; i < paramf.c(); i++) {
      for (int k = 0; k < paramf.a(); k = m) {
        b[] arrayOfB1 = arrayOfB[i];
        int m = k + 1;
        int[] arrayOfInt2 = arrayOfB1[m].a();
        k = paramf.a() * i + k;
        if (arrayOfInt2.length == 0) {
          arrayList1.add(Integer.valueOf(k));
        } else if (arrayOfInt2.length == 1) {
          arrayOfInt[k] = arrayOfInt2[0];
        } else {
          arrayList2.add(Integer.valueOf(k));
          arrayList.add(arrayOfInt2);
        } 
      } 
    } 
    int[][] arrayOfInt1 = new int[arrayList.size()][];
    for (i = bool; i < arrayOfInt1.length; i++)
      arrayOfInt1[i] = arrayList.get(i); 
    return a(paramf.b(), arrayOfInt, a.a(arrayList1), a.a(arrayList2), arrayOfInt1);
  }
  
  private static f b(h paramh1, h paramh2) {
    if (paramh1 == null && paramh2 == null)
      return null; 
    a a1 = a(paramh1, paramh2);
    return (a1 == null) ? null : new f(a1, c.a(a(paramh1), a(paramh2)));
  }
  
  private static int[] b(b paramb, int paramInt1, int paramInt2, boolean paramBoolean, int paramInt3, int paramInt4) {
    byte b1;
    int[] arrayOfInt = new int[8];
    if (paramBoolean) {
      b1 = 1;
    } else {
      b1 = -1;
    } 
    int i = 0;
    boolean bool = paramBoolean;
    while ((paramBoolean ? (paramInt3 < paramInt2) : (paramInt3 >= paramInt1)) && i < 8) {
      if (paramb.b(paramInt3, paramInt4) == bool) {
        arrayOfInt[i] = arrayOfInt[i] + 1;
        paramInt3 += b1;
        continue;
      } 
      i++;
      int k = bool ^ true;
    } 
    if (i != 8) {
      if (paramBoolean)
        paramInt1 = paramInt2; 
      return (paramInt3 == paramInt1 && i == 7) ? arrayOfInt : null;
    } 
    return arrayOfInt;
  }
  
  private static int c(int paramInt) {
    return 2 << paramInt;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/d/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */