package e.f.c.w;

import e.f.c.c;
import e.f.c.e;
import e.f.c.j;
import e.f.c.l;
import e.f.c.m;
import e.f.c.n;
import e.f.c.o;
import e.f.c.p;
import e.f.c.s.a;
import java.util.Arrays;
import java.util.EnumMap;
import java.util.Map;

public abstract class k implements l {
  protected static float a(int[] paramArrayOfint1, int[] paramArrayOfint2, float paramFloat) {
    int n = paramArrayOfint1.length;
    boolean bool = false;
    int j = 0;
    int m = 0;
    int i = 0;
    while (j < n) {
      m += paramArrayOfint1[j];
      i += paramArrayOfint2[j];
      j++;
    } 
    if (m < i)
      return Float.POSITIVE_INFINITY; 
    float f2 = m;
    float f3 = f2 / i;
    float f1 = 0.0F;
    for (i = bool; i < n; i++) {
      j = paramArrayOfint1[i];
      float f4 = paramArrayOfint2[i] * f3;
      float f5 = j;
      if (f5 > f4) {
        f4 = f5 - f4;
      } else {
        f4 -= f5;
      } 
      if (f4 > paramFloat * f3)
        return Float.POSITIVE_INFINITY; 
      f1 += f4;
    } 
    return f1 / f2;
  }
  
  protected static void a(a parama, int paramInt, int[] paramArrayOfint) {
    int m = paramArrayOfint.length;
    int i = 0;
    Arrays.fill(paramArrayOfint, 0, m, 0);
    int n = parama.c();
    if (paramInt < n) {
      int i2 = parama.a(paramInt) ^ true;
      int i1 = paramInt;
      paramInt = i;
      while (true) {
        i = paramInt;
        if (i1 < n) {
          if (parama.a(i1) != i2) {
            paramArrayOfint[paramInt] = paramArrayOfint[paramInt] + 1;
          } else {
            i = ++paramInt;
            if (paramInt != m) {
              paramArrayOfint[paramInt] = 1;
              i2 ^= 0x1;
            } else {
              break;
            } 
          } 
          i1++;
          continue;
        } 
        break;
      } 
      if (i != m) {
        if (i == m - 1 && i1 == n)
          return; 
        throw j.a();
      } 
      return;
    } 
    j j = j.a();
    throw j;
  }
  
  private n b(c paramc, Map<e, ?> paramMap) {
    int j;
    int m = paramc.c();
    int n = paramc.b();
    a a = new a(m);
    if (paramMap != null && paramMap.containsKey(e.f)) {
      i = 1;
    } else {
      i = 0;
    } 
    if (i) {
      j = 8;
    } else {
      j = 5;
    } 
    int i2 = Math.max(1, n >> j);
    if (i) {
      j = n;
    } else {
      j = 15;
    } 
    int i3 = n / 2;
    int i1 = 0;
    int i = m;
    m = i1;
    label72: while (true) {
      if (m < j) {
        i1 = m + 1;
        int i4 = i1 / 2;
        if ((m & 0x1) == 0) {
          m = 1;
        } else {
          m = 0;
        } 
        if (m != 0) {
          m = i4;
        } else {
          m = -i4;
        } 
        i4 = m * i2 + i3;
        if (i4 >= 0 && i4 < n) {
          try {
            a a1 = paramc.a(i4, a);
            m = 0;
            while (true) {
              if (m < 2) {
                Map<e, ?> map = paramMap;
                if (m == 1) {
                  a1.d();
                  map = paramMap;
                  if (paramMap != null) {
                    map = paramMap;
                    if (paramMap.containsKey(e.l)) {
                      map = new EnumMap<e, Object>(e.class);
                      map.putAll(paramMap);
                      map.remove(e.l);
                    } 
                  } 
                } 
                try {
                  n n1 = a(i4, a1, map);
                  if (m == 1) {
                    n1.a(o.d, Integer.valueOf(180));
                    p[] arrayOfP = n1.d();
                    if (arrayOfP != null) {
                      float f1 = i;
                      float f2 = arrayOfP[0].a();
                      try {
                        arrayOfP[0] = new p(f1 - f2 - 1.0F, arrayOfP[0].b());
                        try {
                          arrayOfP[1] = new p(f1 - arrayOfP[1].a() - 1.0F, arrayOfP[1].b());
                          return n1;
                        } catch (m null) {}
                      } catch (m m1) {}
                    } else {
                      return (n)m1;
                    } 
                  } else {
                    return (n)m1;
                  } 
                } catch (m m1) {}
                m++;
                paramMap = map;
                continue;
              } 
              a = a1;
              m = i1;
              continue label72;
            } 
          } catch (j j2) {
            continue;
          } 
          break;
        } 
      } 
      j j1 = j.a();
      throw j1;
    } 
  }
  
  protected static void b(a parama, int paramInt, int[] paramArrayOfint) {
    int i = paramArrayOfint.length;
    boolean bool = parama.a(paramInt);
    while (paramInt > 0 && i >= 0) {
      int m = paramInt - 1;
      paramInt = m;
      if (parama.a(m) != bool) {
        i--;
        int n = bool ^ true;
        paramInt = m;
      } 
    } 
    if (i < 0) {
      a(parama, paramInt + 1, paramArrayOfint);
      return;
    } 
    j j = j.a();
    throw j;
  }
  
  public abstract n a(int paramInt, a parama, Map<e, ?> paramMap);
  
  public n a(c paramc, Map<e, ?> paramMap) {
    try {
      return b(paramc, paramMap);
    } catch (j j) {
      int i;
      p[] arrayOfP;
      boolean bool = false;
      if (paramMap != null && paramMap.containsKey(e.f)) {
        i = 1;
      } else {
        i = 0;
      } 
      if (i && paramc.d()) {
        paramc = paramc.e();
        n n = b(paramc, paramMap);
        Map map = n.c();
        int m = 270;
        i = m;
        if (map != null) {
          i = m;
          if (map.containsKey(o.d))
            i = (((Integer)map.get(o.d)).intValue() + 270) % 360; 
        } 
        n.a(o.d, Integer.valueOf(i));
        arrayOfP = n.d();
        if (arrayOfP != null) {
          m = paramc.b();
          for (i = bool; i < arrayOfP.length; i++)
            arrayOfP[i] = new p(m - arrayOfP[i].b() - 1.0F, arrayOfP[i].a()); 
        } 
        return n;
      } 
      throw arrayOfP;
    } 
  }
  
  public void a() {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */