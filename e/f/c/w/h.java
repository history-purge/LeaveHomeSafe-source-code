package e.f.c.w;

import e.f.c.a;
import e.f.c.e;
import e.f.c.f;
import e.f.c.j;
import e.f.c.n;
import e.f.c.p;
import e.f.c.s.a;
import java.util.Map;

public final class h extends k {
  private static final int[] b = new int[] { 6, 8, 10, 12, 14 };
  
  private static final int[] c = new int[] { 1, 1, 1, 1 };
  
  private static final int[][] d = new int[][] { { 1, 1, 2 }, { 1, 1, 3 } };
  
  private static final int[][] e;
  
  private int a = -1;
  
  static {
    int[] arrayOfInt1 = { 1, 2, 1, 1, 2 };
    int[] arrayOfInt2 = { 3, 1, 3, 1, 1 };
    int[] arrayOfInt3 = { 3, 1, 1, 3, 1 };
    e = new int[][] { 
        { 1, 1, 2, 2, 1 }, { 2, 1, 1, 1, 2 }, arrayOfInt1, { 2, 2, 1, 1, 1 }, { 1, 1, 2, 1, 2 }, { 2, 1, 2, 1, 1 }, { 1, 2, 2, 1, 1 }, { 1, 1, 1, 2, 2 }, { 2, 1, 1, 2, 1 }, { 1, 2, 1, 2, 1 }, 
        { 1, 1, 3, 3, 1 }, { 3, 1, 1, 1, 3 }, { 1, 3, 1, 1, 3 }, { 3, 3, 1, 1, 1 }, { 1, 1, 3, 1, 3 }, arrayOfInt2, { 1, 3, 3, 1, 1 }, { 1, 1, 1, 3, 3 }, arrayOfInt3, { 1, 3, 1, 3, 1 } };
  }
  
  private static int a(int[] paramArrayOfint) {
    int n = e.length;
    int i = 0;
    int m = -1;
    for (float f = 0.38F; i < n; f = f1) {
      float f1;
      float f2 = k.a(paramArrayOfint, e[i], 0.5F);
      if (f2 < f) {
        m = i;
        f1 = f2;
      } else {
        f1 = f;
        if (f2 == f) {
          m = -1;
          f1 = f;
        } 
      } 
      i++;
    } 
    if (m >= 0)
      return m % 10; 
    j j = j.a();
    throw j;
  }
  
  private void a(a parama, int paramInt) {
    int i = this.a * 10;
    if (i >= paramInt)
      i = paramInt; 
    while (i > 0 && --paramInt >= 0 && !parama.a(paramInt)) {
      i--;
      paramInt--;
    } 
    if (i == 0)
      return; 
    j j = j.a();
    throw j;
  }
  
  private static void a(a parama, int paramInt1, int paramInt2, StringBuilder paramStringBuilder) {
    int[] arrayOfInt1 = new int[10];
    int[] arrayOfInt2 = new int[5];
    int[] arrayOfInt3 = new int[5];
    label16: while (paramInt1 < paramInt2) {
      k.a(parama, paramInt1, arrayOfInt1);
      boolean bool = false;
      int i;
      for (i = 0; i < 5; i++) {
        int m = i * 2;
        arrayOfInt2[i] = arrayOfInt1[m];
        arrayOfInt3[i] = arrayOfInt1[m + 1];
      } 
      paramStringBuilder.append((char)(a(arrayOfInt2) + 48));
      paramStringBuilder.append((char)(a(arrayOfInt3) + 48));
      int j = paramInt1;
      i = bool;
      while (true) {
        paramInt1 = j;
        if (i < 10) {
          j += arrayOfInt1[i];
          i++;
          continue;
        } 
        continue label16;
      } 
    } 
  }
  
  private int[] a(a parama) {
    parama.d();
    try {
      int[] arrayOfInt;
      int i = c(parama);
      try {
        arrayOfInt = c(parama, i, d[0]);
      } catch (j j) {
        arrayOfInt = c(parama, i, d[1]);
      } 
      a(parama, arrayOfInt[0]);
      i = arrayOfInt[0];
      arrayOfInt[0] = parama.c() - arrayOfInt[1];
      arrayOfInt[1] = parama.c() - i;
      return arrayOfInt;
    } finally {
      parama.d();
    } 
  }
  
  private int[] b(a parama) {
    int[] arrayOfInt = c(parama, c(parama), c);
    this.a = (arrayOfInt[1] - arrayOfInt[0]) / 4;
    a(parama, arrayOfInt[0]);
    return arrayOfInt;
  }
  
  private static int c(a parama) {
    int i = parama.c();
    int j = parama.b(0);
    if (j != i)
      return j; 
    throw j.a();
  }
  
  private static int[] c(a parama, int paramInt, int[] paramArrayOfint) {
    int i1 = paramArrayOfint.length;
    int[] arrayOfInt = new int[i1];
    int i2 = parama.c();
    int i = paramInt;
    boolean bool = false;
    int n = 0;
    int m = paramInt;
    paramInt = i;
    i = n;
    while (m < i2) {
      if (parama.a(m) != bool) {
        arrayOfInt[i] = arrayOfInt[i] + 1;
        n = paramInt;
      } else {
        if (i == i1 - 1) {
          if (k.a(arrayOfInt, paramArrayOfint, 0.5F) < 0.38F)
            return new int[] { paramInt, m }; 
          n = paramInt + arrayOfInt[0] + arrayOfInt[1];
          paramInt = i - 1;
          System.arraycopy(arrayOfInt, 2, arrayOfInt, 0, paramInt);
          arrayOfInt[paramInt] = 0;
          arrayOfInt[i] = 0;
          paramInt = i - 1;
          i = n;
        } else {
          n = i + 1;
          i = paramInt;
          paramInt = n;
        } 
        arrayOfInt[paramInt] = 1;
        int i3 = bool ^ true;
        n = i;
        i = paramInt;
      } 
      m++;
      paramInt = n;
    } 
    j j = j.a();
    throw j;
  }
  
  public n a(int paramInt, a parama, Map<e, ?> paramMap) {
    int[] arrayOfInt1;
    int[] arrayOfInt3 = b(parama);
    int[] arrayOfInt2 = a(parama);
    StringBuilder stringBuilder = new StringBuilder(20);
    a(parama, arrayOfInt3[1], arrayOfInt2[0], stringBuilder);
    String str = stringBuilder.toString();
    if (paramMap != null) {
      int[] arrayOfInt = (int[])paramMap.get(e.h);
    } else {
      parama = null;
    } 
    a a1 = parama;
    if (parama == null)
      arrayOfInt1 = b; 
    int n = str.length();
    int i1 = arrayOfInt1.length;
    int i = 0;
    int j = 0;
    while (true) {
      if (i < i1) {
        int i3 = arrayOfInt1[i];
        if (n == i3) {
          i = 1;
          break;
        } 
        int i2 = j;
        if (i3 > j)
          i2 = i3; 
        i++;
        j = i2;
        continue;
      } 
      i = 0;
      break;
    } 
    int m = i;
    if (i == 0) {
      m = i;
      if (n > j)
        m = 1; 
    } 
    if (m != 0) {
      float f1 = arrayOfInt3[1];
      float f2 = paramInt;
      p p1 = new p(f1, f2);
      p p2 = new p(arrayOfInt2[0], f2);
      a a2 = a.k;
      return new n(str, null, new p[] { p1, p2 }, a2);
    } 
    f f = f.a();
    throw f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */