package e.f.c.s;

import java.util.Arrays;

public final class b implements Cloneable {
  private final int c;
  
  private final int d;
  
  private final int e;
  
  private final int[] f;
  
  public b(int paramInt) {
    this(paramInt, paramInt);
  }
  
  public b(int paramInt1, int paramInt2) {
    if (paramInt1 > 0 && paramInt2 > 0) {
      this.c = paramInt1;
      this.d = paramInt2;
      this.e = (paramInt1 + 31) / 32;
      this.f = new int[this.e * paramInt2];
      return;
    } 
    throw new IllegalArgumentException("Both dimensions must be greater than 0");
  }
  
  private b(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramArrayOfint;
  }
  
  private String a(String paramString1, String paramString2, String paramString3) {
    StringBuilder stringBuilder = new StringBuilder(this.d * (this.c + 1));
    int i;
    for (i = 0; i < this.d; i++) {
      int j;
      for (j = 0; j < this.c; j++) {
        String str;
        if (b(j, i)) {
          str = paramString1;
        } else {
          str = paramString2;
        } 
        stringBuilder.append(str);
      } 
      stringBuilder.append(paramString3);
    } 
    return stringBuilder.toString();
  }
  
  public a a(int paramInt, a parama) {
    if (parama == null || parama.c() < this.c) {
      parama = new a(this.c);
    } else {
      parama.a();
    } 
    int j = this.e;
    for (int i = 0; i < this.e; i++)
      parama.a(i << 5, this.f[paramInt * j + i]); 
    return parama;
  }
  
  public String a(String paramString1, String paramString2) {
    return a(paramString1, paramString2, "\n");
  }
  
  public void a(int paramInt1, int paramInt2) {
    paramInt2 = paramInt2 * this.e + paramInt1 / 32;
    int[] arrayOfInt = this.f;
    arrayOfInt[paramInt2] = 1 << (paramInt1 & 0x1F) ^ arrayOfInt[paramInt2];
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    if (paramInt2 >= 0 && paramInt1 >= 0) {
      if (paramInt4 > 0 && paramInt3 > 0) {
        int i = paramInt3 + paramInt1;
        paramInt4 += paramInt2;
        if (paramInt4 <= this.d && i <= this.c) {
          while (paramInt2 < paramInt4) {
            int j = this.e;
            for (paramInt3 = paramInt1; paramInt3 < i; paramInt3++) {
              int[] arrayOfInt = this.f;
              int k = paramInt3 / 32 + j * paramInt2;
              arrayOfInt[k] = arrayOfInt[k] | 1 << (paramInt3 & 0x1F);
            } 
            paramInt2++;
          } 
          return;
        } 
        throw new IllegalArgumentException("The region must fit inside the matrix");
      } 
      throw new IllegalArgumentException("Height and width must be at least 1");
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Left and top must be nonnegative");
    throw illegalArgumentException;
  }
  
  public int[] a() {
    int i;
    for (i = this.f.length - 1; i >= 0 && this.f[i] == 0; i--);
    if (i < 0)
      return null; 
    int k = this.e;
    int m = i / k;
    int n = this.f[i];
    int j;
    for (j = 31; n >>> j == 0; j--);
    return new int[] { (i % k << 5) + j, m };
  }
  
  public void b(int paramInt, a parama) {
    int[] arrayOfInt1 = parama.b();
    int[] arrayOfInt2 = this.f;
    int i = this.e;
    System.arraycopy(arrayOfInt1, 0, arrayOfInt2, paramInt * i, i);
  }
  
  public boolean b(int paramInt1, int paramInt2) {
    int i = this.e;
    int j = paramInt1 / 32;
    return ((this.f[paramInt2 * i + j] >>> (paramInt1 & 0x1F) & 0x1) != 0);
  }
  
  public int[] b() {
    int j = this.c;
    int n = this.d;
    int k = -1;
    int m = -1;
    int i = 0;
    while (i < this.d) {
      int i1 = m;
      m = k;
      int i2 = 0;
      k = i1;
      while (true) {
        i1 = this.e;
        if (i2 < i1) {
          int i7 = this.f[i1 * i + i2];
          int i5 = j;
          int i6 = m;
          int i3 = n;
          int i4 = k;
          if (i7 != 0) {
            i1 = n;
            if (i < n)
              i1 = i; 
            n = k;
            if (i > k)
              n = i; 
            int i8 = i2 << 5;
            byte b1 = 31;
            k = j;
            if (i8 < j) {
              for (k = 0; i7 << 31 - k == 0; k++);
              i3 = k + i8;
              k = j;
              if (i3 < j)
                k = i3; 
            } 
            i5 = k;
            i6 = m;
            i3 = i1;
            i4 = n;
            if (i8 + 31 > m) {
              for (j = b1; i7 >>> j == 0; j--);
              j = i8 + j;
              i5 = k;
              i6 = m;
              i3 = i1;
              i4 = n;
              if (j > m) {
                i6 = j;
                i4 = n;
                i3 = i1;
                i5 = k;
              } 
            } 
          } 
          i2++;
          j = i5;
          m = i6;
          n = i3;
          k = i4;
          continue;
        } 
        i++;
        i1 = k;
        k = m;
        m = i1;
      } 
    } 
    return (k < j || m < n) ? null : new int[] { j, n, k - j + 1, m - n + 1 };
  }
  
  public int c() {
    return this.d;
  }
  
  public void c(int paramInt1, int paramInt2) {
    paramInt2 = paramInt2 * this.e + paramInt1 / 32;
    int[] arrayOfInt = this.f;
    arrayOfInt[paramInt2] = 1 << (paramInt1 & 0x1F) | arrayOfInt[paramInt2];
  }
  
  public b clone() {
    return new b(this.c, this.d, this.e, (int[])this.f.clone());
  }
  
  public int[] d() {
    int i = 0;
    while (true) {
      int[] arrayOfInt1 = this.f;
      if (i < arrayOfInt1.length && arrayOfInt1[i] == 0) {
        i++;
        continue;
      } 
      break;
    } 
    int[] arrayOfInt = this.f;
    if (i == arrayOfInt.length)
      return null; 
    int k = this.e;
    int m = i / k;
    int n = arrayOfInt[i];
    int j;
    for (j = 0; n << 31 - j == 0; j++);
    return new int[] { (i % k << 5) + j, m };
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof b))
      return false; 
    paramObject = paramObject;
    return (this.c == ((b)paramObject).c && this.d == ((b)paramObject).d && this.e == ((b)paramObject).e && Arrays.equals(this.f, ((b)paramObject).f));
  }
  
  public int f() {
    return this.c;
  }
  
  public void g() {
    int i = f();
    int j = c();
    a a2 = new a(i);
    a a1 = new a(i);
    for (i = 0; i < (j + 1) / 2; i++) {
      a2 = a(i, a2);
      int k = j - 1 - i;
      a1 = a(k, a1);
      a2.d();
      a1.d();
      b(i, a1);
      b(k, a2);
    } 
  }
  
  public int hashCode() {
    int i = this.c;
    return (((i * 31 + i) * 31 + this.d) * 31 + this.e) * 31 + Arrays.hashCode(this.f);
  }
  
  public String toString() {
    return a("X ", "  ");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/s/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */