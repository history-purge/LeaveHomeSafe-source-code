package e.f.c.w;

import e.f.c.a;
import e.f.c.d;
import e.f.c.e;
import e.f.c.f;
import e.f.c.j;
import e.f.c.m;
import e.f.c.n;
import e.f.c.o;
import e.f.c.q;
import e.f.c.s.a;
import java.util.Arrays;
import java.util.Map;

public abstract class p extends k {
  static final int[] d = new int[] { 1, 1, 1 };
  
  static final int[] e = new int[] { 1, 1, 1, 1, 1 };
  
  static final int[][] f;
  
  static final int[][] g = new int[20][];
  
  private final StringBuilder a = new StringBuilder(20);
  
  private final o b = new o();
  
  private final g c = new g();
  
  static {
    System.arraycopy(f, 0, g, 0, 10);
    while (i < 20) {
      arrayOfInt1 = f[i - 10];
      arrayOfInt2 = new int[arrayOfInt1.length];
      for (int j = 0; j < arrayOfInt1.length; j++)
        arrayOfInt2[j] = arrayOfInt1[arrayOfInt1.length - j - 1]; 
      g[i] = arrayOfInt2;
      i++;
    } 
  }
  
  static int a(a parama, int[] paramArrayOfint, int paramInt, int[][] paramArrayOfint1) {
    k.a(parama, paramInt, paramArrayOfint);
    int m = paramArrayOfint1.length;
    float f = 0.48F;
    int i = -1;
    paramInt = 0;
    while (paramInt < m) {
      float f2 = k.a(paramArrayOfint, paramArrayOfint1[paramInt], 0.7F);
      float f1 = f;
      if (f2 < f) {
        i = paramInt;
        f1 = f2;
      } 
      paramInt++;
      f = f1;
    } 
    if (i >= 0)
      return i; 
    j j = j.a();
    throw j;
  }
  
  static boolean a(CharSequence paramCharSequence) {
    int i = paramCharSequence.length();
    if (i == 0)
      return false; 
    int j = Character.digit(paramCharSequence.charAt(--i), 10);
    return (b(paramCharSequence.subSequence(0, i)) == j);
  }
  
  static int[] a(a parama) {
    int[] arrayOfInt2 = new int[d.length];
    int[] arrayOfInt1 = null;
    boolean bool = false;
    int i = 0;
    while (!bool) {
      Arrays.fill(arrayOfInt2, 0, d.length, 0);
      arrayOfInt1 = a(parama, i, false, d, arrayOfInt2);
      int j = arrayOfInt1[0];
      i = arrayOfInt1[1];
      int m = j - i - j;
      if (m >= 0)
        bool = parama.a(m, j, false); 
    } 
    return arrayOfInt1;
  }
  
  static int[] a(a parama, int paramInt, boolean paramBoolean, int[] paramArrayOfint) {
    return a(parama, paramInt, paramBoolean, paramArrayOfint, new int[paramArrayOfint.length]);
  }
  
  private static int[] a(a parama, int paramInt, boolean paramBoolean, int[] paramArrayOfint1, int[] paramArrayOfint2) {
    int i1 = parama.c();
    if (paramBoolean) {
      paramInt = parama.c(paramInt);
    } else {
      paramInt = parama.b(paramInt);
    } 
    int i2 = paramArrayOfint1.length;
    int i = paramInt;
    int n = 0;
    int m = paramInt;
    paramInt = i;
    i = n;
    while (m < i1) {
      if (parama.a(m) != paramBoolean) {
        paramArrayOfint2[i] = paramArrayOfint2[i] + 1;
        n = paramInt;
      } else {
        if (i == i2 - 1) {
          if (k.a(paramArrayOfint2, paramArrayOfint1, 0.7F) < 0.48F)
            return new int[] { paramInt, m }; 
          n = paramInt + paramArrayOfint2[0] + paramArrayOfint2[1];
          paramInt = i - 1;
          System.arraycopy(paramArrayOfint2, 2, paramArrayOfint2, 0, paramInt);
          paramArrayOfint2[paramInt] = 0;
          paramArrayOfint2[i] = 0;
          paramInt = i - 1;
          i = n;
        } else {
          n = i + 1;
          i = paramInt;
          paramInt = n;
        } 
        paramArrayOfint2[paramInt] = 1;
        int i3 = paramBoolean ^ true;
        n = i;
        i = paramInt;
      } 
      m++;
      paramInt = n;
    } 
    j j = j.a();
    throw j;
  }
  
  static int b(CharSequence paramCharSequence) {
    int m = paramCharSequence.length();
    int i = m - 1;
    int j = 0;
    while (i >= 0) {
      int n = paramCharSequence.charAt(i) - 48;
      if (n >= 0 && n <= 9) {
        j += n;
        i -= 2;
        continue;
      } 
      throw f.a();
    } 
    j *= 3;
    i = m - 2;
    while (i >= 0) {
      m = paramCharSequence.charAt(i) - 48;
      if (m >= 0 && m <= 9) {
        j += m;
        i -= 2;
        continue;
      } 
      throw f.a();
    } 
    return (1000 - j) % 10;
  }
  
  protected abstract int a(a parama, int[] paramArrayOfint, StringBuilder paramStringBuilder);
  
  public n a(int paramInt, a parama, Map<e, ?> paramMap) {
    return a(paramInt, parama, a(parama), paramMap);
  }
  
  public n a(int paramInt, a parama, int[] paramArrayOfint, Map<e, ?> paramMap) {
    q q;
    a a1 = null;
    if (paramMap == null) {
      q = null;
    } else {
      q = (q)paramMap.get(e.l);
    } 
    boolean bool = true;
    if (q != null)
      q.a(new e.f.c.p((paramArrayOfint[0] + paramArrayOfint[1]) / 2.0F, paramInt)); 
    StringBuilder stringBuilder = this.a;
    stringBuilder.setLength(0);
    int i = a(parama, paramArrayOfint, stringBuilder);
    if (q != null)
      q.a(new e.f.c.p(i, paramInt)); 
    int[] arrayOfInt = a(parama, i);
    if (q != null)
      q.a(new e.f.c.p((arrayOfInt[0] + arrayOfInt[1]) / 2.0F, paramInt)); 
    i = arrayOfInt[1];
    int m = i - arrayOfInt[0] + i;
    if (m < parama.c() && parama.a(i, m, false)) {
      String str = stringBuilder.toString();
      if (str.length() >= 8) {
        if (a(str)) {
          int[] arrayOfInt1;
          float f1 = (paramArrayOfint[1] + paramArrayOfint[0]) / 2.0F;
          float f2 = (arrayOfInt[1] + arrayOfInt[0]) / 2.0F;
          a a2 = b();
          float f3 = paramInt;
          n n = new n(str, null, new e.f.c.p[] { new e.f.c.p(f1, f3), new e.f.c.p(f2, f3) }a2);
          try {
            n n1 = this.b.a(paramInt, parama, arrayOfInt[1]);
            n.a(o.j, n1.e());
            n.a(n1.c());
            n.a(n1.d());
            paramInt = n1.e().length();
          } catch (m m1) {
            paramInt = 0;
          } 
          if (paramMap == null) {
            parama = a1;
          } else {
            arrayOfInt1 = (int[])paramMap.get(e.m);
          } 
          if (arrayOfInt1 != null) {
            m = arrayOfInt1.length;
            i = 0;
            while (true) {
              if (i < m) {
                if (paramInt == arrayOfInt1[i]) {
                  paramInt = bool;
                  break;
                } 
                i++;
                continue;
              } 
              paramInt = 0;
              break;
            } 
            if (paramInt == 0)
              throw j.a(); 
          } 
          if (a2 == a.j || a2 == a.q) {
            String str1 = this.c.a(str);
            if (str1 != null)
              n.a(o.i, str1); 
          } 
          return n;
        } 
        throw d.a();
      } 
      throw f.a();
    } 
    j j = j.a();
    throw j;
  }
  
  boolean a(String paramString) {
    return a(paramString);
  }
  
  int[] a(a parama, int paramInt) {
    return a(parama, paramInt, false, d);
  }
  
  abstract a b();
  
  static {
    int i = 10;
    int[] arrayOfInt1 = { 1, 4, 1, 1 };
    int[] arrayOfInt2 = { 1, 1, 3, 2 };
    int[] arrayOfInt3 = { 1, 2, 3, 1 };
    int[] arrayOfInt4 = { 3, 1, 1, 2 };
    f = new int[][] { { 3, 2, 1, 1 }, { 2, 2, 2, 1 }, { 2, 1, 2, 2 }, arrayOfInt1, arrayOfInt2, arrayOfInt3, { 1, 1, 1, 4 }, { 1, 3, 1, 2 }, { 1, 2, 1, 3 }, arrayOfInt4 };
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */