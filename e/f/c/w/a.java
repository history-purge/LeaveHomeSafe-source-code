package e.f.c.w;

import e.f.c.e;
import e.f.c.j;
import e.f.c.n;
import e.f.c.p;
import java.util.Arrays;
import java.util.Map;

public final class a extends k {
  static final char[] d = "0123456789-$:/.+ABCD".toCharArray();
  
  static final int[] e = new int[] { 
      3, 6, 9, 96, 18, 66, 33, 36, 48, 72, 
      12, 24, 69, 81, 84, 21, 26, 41, 11, 14 };
  
  private static final char[] f = new char[] { 'A', 'B', 'C', 'D' };
  
  private final StringBuilder a = new StringBuilder(20);
  
  private int[] b = new int[80];
  
  private int c = 0;
  
  private void a(int paramInt) {
    int[] arrayOfInt = this.b;
    int i = this.c;
    arrayOfInt[i] = paramInt;
    this.c = i + 1;
    paramInt = this.c;
    if (paramInt >= arrayOfInt.length) {
      int[] arrayOfInt1 = new int[paramInt << 1];
      System.arraycopy(arrayOfInt, 0, arrayOfInt1, 0, paramInt);
      this.b = arrayOfInt1;
    } 
  }
  
  private void a(e.f.c.s.a parama) {
    int i = 0;
    this.c = 0;
    int m = parama.c(0);
    int n = parama.c();
    if (m < n) {
      boolean bool = true;
      while (m < n) {
        if (parama.a(m) != bool) {
          i++;
        } else {
          a(i);
          int i1 = bool ^ true;
          i = 1;
        } 
        m++;
      } 
      a(i);
      return;
    } 
    j j = j.a();
    throw j;
  }
  
  static boolean a(char[] paramArrayOfchar, char paramChar) {
    if (paramArrayOfchar != null) {
      int j = paramArrayOfchar.length;
      for (int i = 0; i < j; i++) {
        if (paramArrayOfchar[i] == paramChar)
          return true; 
      } 
    } 
    return false;
  }
  
  private int b() {
    for (int i = 1; i < this.c; i += 2) {
      int m = b(i);
      if (m != -1 && a(f, d[m])) {
        m = i;
        int n = 0;
        while (m < i + 7) {
          n += this.b[m];
          m++;
        } 
        if (i == 1 || this.b[i - 1] >= n / 2)
          return i; 
      } 
    } 
    j j = j.a();
    throw j;
  }
  
  private int b(int paramInt) {
    int i4 = paramInt + 7;
    if (i4 >= this.c)
      return -1; 
    int[] arrayOfInt = this.b;
    int i3 = Integer.MAX_VALUE;
    boolean bool = false;
    int j = paramInt;
    int n = Integer.MAX_VALUE;
    int i;
    for (i = 0; j < i4; i = i7) {
      int i6 = arrayOfInt[j];
      int i5 = n;
      if (i6 < n)
        i5 = i6; 
      int i7 = i;
      if (i6 > i)
        i7 = i6; 
      j += 2;
      n = i5;
    } 
    int i2 = (n + i) / 2;
    i = paramInt + 1;
    j = 0;
    n = i3;
    while (i < i4) {
      int i6 = arrayOfInt[i];
      int i5 = n;
      if (i6 < n)
        i5 = i6; 
      int i7 = j;
      if (i6 > j)
        i7 = i6; 
      i += 2;
      n = i5;
      j = i7;
    } 
    int i1 = (n + j) / 2;
    j = 0;
    int m = 128;
    i = 0;
    while (true) {
      n = bool;
      if (j < 7) {
        int i5;
        if ((j & 0x1) == 0) {
          i5 = i2;
        } else {
          i5 = i1;
        } 
        m >>= 1;
        n = i;
        if (arrayOfInt[paramInt + j] > i5)
          n = i | m; 
        j++;
        i = n;
        continue;
      } 
      break;
    } 
    while (true) {
      arrayOfInt = e;
      if (n < arrayOfInt.length) {
        if (arrayOfInt[n] == i)
          return n; 
        n++;
        continue;
      } 
      return -1;
    } 
  }
  
  private void c(int paramInt) {
    int[] arrayOfInt1 = new int[4];
    arrayOfInt1[0] = 0;
    arrayOfInt1[1] = 0;
    arrayOfInt1[2] = 0;
    arrayOfInt1[3] = 0;
    int[] arrayOfInt2 = new int[4];
    arrayOfInt2[0] = 0;
    arrayOfInt2[1] = 0;
    arrayOfInt2[2] = 0;
    arrayOfInt2[3] = 0;
    int m = this.a.length() - 1;
    boolean bool = false;
    int j = paramInt;
    int i = 0;
    while (true) {
      int i1 = e[this.a.charAt(i)];
      int n;
      for (n = 6; n >= 0; n--) {
        int i2 = (n & 0x1) + ((i1 & 0x1) << 1);
        arrayOfInt1[i2] = arrayOfInt1[i2] + this.b[j + n];
        arrayOfInt2[i2] = arrayOfInt2[i2] + 1;
        i1 >>= 1;
      } 
      if (i < m) {
        j += 8;
        i++;
        continue;
      } 
      float[] arrayOfFloat1 = new float[4];
      float[] arrayOfFloat2 = new float[4];
      n = 0;
      while (true) {
        i = bool;
        j = paramInt;
        if (n < 2) {
          arrayOfFloat2[n] = 0.0F;
          i = n + 2;
          arrayOfFloat2[i] = (arrayOfInt1[n] / arrayOfInt2[n] + arrayOfInt1[i] / arrayOfInt2[i]) / 2.0F;
          arrayOfFloat1[n] = arrayOfFloat2[i];
          arrayOfFloat1[i] = (arrayOfInt1[i] * 2.0F + 1.5F) / arrayOfInt2[i];
          n++;
          continue;
        } 
        break;
      } 
      while (true) {
        n = e[this.a.charAt(i)];
        paramInt = 6;
        while (paramInt >= 0) {
          i1 = (paramInt & 0x1) + ((n & 0x1) << 1);
          float f = this.b[j + paramInt];
          if (f >= arrayOfFloat2[i1] && f <= arrayOfFloat1[i1]) {
            n >>= 1;
            paramInt--;
            continue;
          } 
          throw j.a();
        } 
        if (i < m) {
          j += 8;
          i++;
          continue;
        } 
        break;
      } 
      return;
    } 
  }
  
  public n a(int paramInt, e.f.c.s.a parama, Map<e, ?> paramMap) {
    Arrays.fill(this.b, 0);
    a(parama);
    int j = b();
    this.a.setLength(0);
    int i = j;
    while (true) {
      int m = b(i);
      if (m != -1) {
        this.a.append((char)m);
        int n = i + 8;
        if (this.a.length() <= 1 || !a(f, d[m])) {
          i = n;
          if (n >= this.c) {
            int[] arrayOfInt = this.b;
            int i1 = n - 1;
            int i2 = arrayOfInt[i1];
            i = -8;
            m = 0;
            while (i < -1) {
              m += this.b[n + i];
              i++;
            } 
            if (n >= this.c || i2 >= m / 2) {
              c(j);
              for (i = 0; i < this.a.length(); i++) {
                StringBuilder stringBuilder = this.a;
                stringBuilder.setCharAt(i, d[stringBuilder.charAt(i)]);
              } 
              char c = this.a.charAt(0);
              if (a(f, c)) {
                StringBuilder stringBuilder = this.a;
                c = stringBuilder.charAt(stringBuilder.length() - 1);
                if (a(f, c)) {
                  if (this.a.length() > 3) {
                    if (paramMap == null || !paramMap.containsKey(e.k)) {
                      stringBuilder = this.a;
                      stringBuilder.deleteCharAt(stringBuilder.length() - 1);
                      this.a.deleteCharAt(0);
                    } 
                    m = 0;
                    i = 0;
                    while (m < j) {
                      i += this.b[m];
                      m++;
                    } 
                    float f1 = i;
                    while (j < i1) {
                      i += this.b[j];
                      j++;
                    } 
                    float f2 = i;
                    String str = this.a.toString();
                    float f3 = paramInt;
                    p p1 = new p(f1, f3);
                    p p2 = new p(f2, f3);
                    e.f.c.a a1 = e.f.c.a.d;
                    return new n(str, null, new p[] { p1, p2 }, a1);
                  } 
                  throw j.a();
                } 
                throw j.a();
              } 
              throw j.a();
            } 
            throw j.a();
          } 
          continue;
        } 
        continue;
      } 
      j j1 = j.a();
      throw j1;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */