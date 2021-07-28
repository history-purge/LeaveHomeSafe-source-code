package e.f.c.x.e;

import e.f.c.c;
import e.f.c.e;
import e.f.c.p;
import e.f.c.s.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class a {
  private static final int[] a = new int[] { 0, 4, 1, 5 };
  
  private static final int[] b = new int[] { 6, 2, 7, 3 };
  
  private static final int[] c = new int[] { 8, 1, 1, 1, 1, 1, 1, 3 };
  
  private static final int[] d = new int[] { 7, 1, 1, 3, 1, 1, 1, 2, 1 };
  
  private static float a(int[] paramArrayOfint1, int[] paramArrayOfint2, float paramFloat) {
    int m = paramArrayOfint1.length;
    boolean bool = false;
    int j = 0;
    int k = 0;
    int i = 0;
    while (j < m) {
      k += paramArrayOfint1[j];
      i += paramArrayOfint2[j];
      j++;
    } 
    if (k < i)
      return Float.POSITIVE_INFINITY; 
    float f2 = k;
    float f3 = f2 / i;
    float f1 = 0.0F;
    for (i = bool; i < m; i++) {
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
  
  public static b a(c paramc, Map<e, ?> paramMap, boolean paramBoolean) {
    b b2 = paramc.a();
    List<p[]> list2 = a(paramBoolean, b2);
    b b1 = b2;
    List<p[]> list1 = list2;
    if (list2.isEmpty()) {
      b1 = b2.clone();
      b1.g();
      list1 = a(paramBoolean, b1);
    } 
    return new b(b1, list1);
  }
  
  private static List<p[]> a(boolean paramBoolean, b paramb) {
    ArrayList<p[]> arrayList = new ArrayList();
    int i = 0;
    label31: while (true) {
      int j = 0;
      boolean bool = false;
      while (i < paramb.c()) {
        p[] arrayOfP = a(paramb, i, j);
        if (arrayOfP[0] == null && arrayOfP[3] == null) {
          if (bool) {
            for (p[] arrayOfP1 : arrayList) {
              j = i;
              if (arrayOfP1[1] != null)
                j = (int)Math.max(i, arrayOfP1[1].b()); 
              i = j;
              if (arrayOfP1[3] != null)
                i = Math.max(j, (int)arrayOfP1[3].b()); 
            } 
            i += 5;
            continue label31;
          } 
          break;
        } 
        arrayList.add(arrayOfP);
        if (paramBoolean) {
          p p;
          if (arrayOfP[2] != null) {
            i = (int)arrayOfP[2].a();
            p = arrayOfP[2];
          } else {
            i = (int)p[4].a();
            p = p[4];
          } 
          int k = (int)p.b();
          j = i;
          bool = true;
          i = k;
        } 
      } 
      break;
    } 
    return (List<p[]>)arrayList;
  }
  
  private static void a(p[] paramArrayOfp1, p[] paramArrayOfp2, int[] paramArrayOfint) {
    for (int i = 0; i < paramArrayOfint.length; i++)
      paramArrayOfp1[paramArrayOfint[i]] = paramArrayOfp2[i]; 
  }
  
  private static int[] a(b paramb, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    Arrays.fill(paramArrayOfint2, 0, paramArrayOfint2.length, 0);
    int i;
    for (i = 0; paramb.b(paramInt1, paramInt2) && paramInt1 > 0 && i < 3; i++)
      paramInt1--; 
    int m = paramArrayOfint1.length;
    int k = paramInt1;
    i = 0;
    int j = paramInt1;
    paramInt1 = k;
    while (j < paramInt3) {
      if (paramb.b(j, paramInt2) != paramBoolean) {
        paramArrayOfint2[i] = paramArrayOfint2[i] + 1;
      } else {
        if (i == m - 1) {
          if (a(paramArrayOfint2, paramArrayOfint1, 0.8F) < 0.42F)
            return new int[] { paramInt1, j }; 
          paramInt1 += paramArrayOfint2[0] + paramArrayOfint2[1];
          k = i - 1;
          System.arraycopy(paramArrayOfint2, 2, paramArrayOfint2, 0, k);
          paramArrayOfint2[k] = 0;
          paramArrayOfint2[i] = 0;
          i--;
        } else {
          i++;
        } 
        paramArrayOfint2[i] = 1;
        int n = paramBoolean ^ true;
      } 
      j++;
    } 
    return (i == m - 1 && a(paramArrayOfint2, paramArrayOfint1, 0.8F) < 0.42F) ? new int[] { paramInt1, j - 1 } : null;
  }
  
  private static p[] a(b paramb, int paramInt1, int paramInt2) {
    int i = paramb.c();
    int j = paramb.f();
    p[] arrayOfP = new p[8];
    a(arrayOfP, a(paramb, i, j, paramInt1, paramInt2, c), a);
    if (arrayOfP[4] != null) {
      paramInt2 = (int)arrayOfP[4].a();
      paramInt1 = (int)arrayOfP[4].b();
    } 
    a(arrayOfP, a(paramb, i, j, paramInt1, paramInt2, d), b);
    return arrayOfP;
  }
  
  private static p[] a(b paramb, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfint) {
    int i;
    p[] arrayOfP = new p[4];
    int[] arrayOfInt = new int[paramArrayOfint.length];
    while (true) {
      if (paramInt3 < paramInt1) {
        int[] arrayOfInt1 = a(paramb, paramInt4, paramInt3, paramInt2, false, paramArrayOfint, arrayOfInt);
        if (arrayOfInt1 != null) {
          int k = paramInt3;
          while (true) {
            paramInt3 = k;
            if (k > 0) {
              int[] arrayOfInt2 = a(paramb, paramInt4, --k, paramInt2, false, paramArrayOfint, arrayOfInt);
              if (arrayOfInt2 != null) {
                arrayOfInt1 = arrayOfInt2;
                continue;
              } 
              paramInt3 = k + 1;
            } 
            break;
          } 
          float f1 = arrayOfInt1[0];
          float f2 = paramInt3;
          arrayOfP[0] = new p(f1, f2);
          arrayOfP[1] = new p(arrayOfInt1[1], f2);
          k = 1;
          paramInt4 = paramInt3;
          break;
        } 
        paramInt3 += 5;
        continue;
      } 
      i = 0;
      paramInt4 = paramInt3;
      break;
    } 
    paramInt3 = paramInt4 + 1;
    int j = paramInt3;
    if (i) {
      int[] arrayOfInt1 = { (int)arrayOfP[0].a(), (int)arrayOfP[1].a() };
      j = 0;
      i = paramInt3;
      paramInt3 = j;
      while (i < paramInt1) {
        int k = arrayOfInt1[0];
        j = paramInt3;
        int[] arrayOfInt2 = a(paramb, k, i, paramInt2, false, paramArrayOfint, arrayOfInt);
        if (arrayOfInt2 != null && Math.abs(arrayOfInt1[0] - arrayOfInt2[0]) < 5 && Math.abs(arrayOfInt1[1] - arrayOfInt2[1]) < 5) {
          arrayOfInt1 = arrayOfInt2;
          paramInt3 = 0;
        } else if (j <= 25) {
          paramInt3 = j + 1;
        } else {
          break;
        } 
        i++;
      } 
      j = i - paramInt3 + 1;
      float f1 = arrayOfInt1[0];
      float f2 = j;
      arrayOfP[2] = new p(f1, f2);
      arrayOfP[3] = new p(arrayOfInt1[1], f2);
    } 
    if (j - paramInt4 < 10)
      Arrays.fill((Object[])arrayOfP, (Object)null); 
    return arrayOfP;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/e/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */