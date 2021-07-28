package j;

import java.util.Arrays;

final class r extends f {
  final transient byte[][] g;
  
  final transient int[] h;
  
  r(c paramc, int paramInt) {
    super(null);
    v.a(paramc.d, 0L, paramInt);
    p p2 = paramc.c;
    int k = 0;
    int j = 0;
    int i = 0;
    while (j < paramInt) {
      int m = p2.c;
      int n = p2.b;
      if (m != n) {
        j += m - n;
        i++;
        p2 = p2.f;
        continue;
      } 
      throw new AssertionError("s.limit == s.pos");
    } 
    this.g = new byte[i][];
    this.h = new int[i * 2];
    p p1 = paramc.c;
    j = 0;
    i = k;
    while (i < paramInt) {
      this.g[j] = p1.a;
      k = i + p1.c - p1.b;
      i = k;
      if (k > paramInt)
        i = paramInt; 
      int[] arrayOfInt = this.h;
      arrayOfInt[j] = i;
      arrayOfInt[this.g.length + j] = p1.b;
      p1.d = true;
      j++;
      p1 = p1.f;
    } 
  }
  
  private int g(int paramInt) {
    paramInt = Arrays.binarySearch(this.h, 0, this.g.length, paramInt + 1);
    return (paramInt >= 0) ? paramInt : (paramInt ^ 0xFFFFFFFF);
  }
  
  private f w() {
    return new f(u());
  }
  
  private Object writeReplace() {
    return w();
  }
  
  public f a(int paramInt1, int paramInt2) {
    return w().a(paramInt1, paramInt2);
  }
  
  public String a() {
    return w().a();
  }
  
  void a(c paramc) {
    int k = this.g.length;
    int i = 0;
    int j;
    for (j = 0; i < k; j = m) {
      int[] arrayOfInt = this.h;
      int n = arrayOfInt[k + i];
      int m = arrayOfInt[i];
      p p1 = new p(this.g[i], n, n + m - j, true, false);
      p p2 = paramc.c;
      if (p2 == null) {
        p1.g = p1;
        p1.f = p1;
        paramc.c = p1;
      } else {
        p2.g.a(p1);
      } 
      i++;
    } 
    paramc.d += j;
  }
  
  public boolean a(int paramInt1, f paramf, int paramInt2, int paramInt3) {
    if (paramInt1 >= 0) {
      if (paramInt1 > s() - paramInt3)
        return false; 
      int j = g(paramInt1);
      int i = paramInt1;
      for (paramInt1 = j; paramInt3 > 0; paramInt1++) {
        if (paramInt1 == 0) {
          j = 0;
        } else {
          j = this.h[paramInt1 - 1];
        } 
        int k = Math.min(paramInt3, this.h[paramInt1] - j + j - i);
        int[] arrayOfInt = this.h;
        byte[][] arrayOfByte = this.g;
        int m = arrayOfInt[arrayOfByte.length + paramInt1];
        if (!paramf.a(paramInt2, arrayOfByte[paramInt1], i - j + m, k))
          return false; 
        i += k;
        paramInt2 += k;
        paramInt3 -= k;
      } 
      return true;
    } 
    return false;
  }
  
  public boolean a(int paramInt1, byte[] paramArrayOfbyte, int paramInt2, int paramInt3) {
    if (paramInt1 >= 0 && paramInt1 <= s() - paramInt3 && paramInt2 >= 0) {
      if (paramInt2 > paramArrayOfbyte.length - paramInt3)
        return false; 
      int j = g(paramInt1);
      int i = paramInt1;
      for (paramInt1 = j; paramInt3 > 0; paramInt1++) {
        if (paramInt1 == 0) {
          j = 0;
        } else {
          j = this.h[paramInt1 - 1];
        } 
        int k = Math.min(paramInt3, this.h[paramInt1] - j + j - i);
        int[] arrayOfInt = this.h;
        byte[][] arrayOfByte = this.g;
        int m = arrayOfInt[arrayOfByte.length + paramInt1];
        if (!v.a(arrayOfByte[paramInt1], i - j + m, paramArrayOfbyte, paramInt2, k))
          return false; 
        i += k;
        paramInt2 += k;
        paramInt3 -= k;
      } 
      return true;
    } 
    return false;
  }
  
  public String b() {
    return w().b();
  }
  
  byte[] c() {
    return u();
  }
  
  public f d() {
    return w().d();
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject instanceof f) {
      paramObject = paramObject;
      if (paramObject.s() == s() && a(0, (f)paramObject, 0, s()))
        return true; 
    } 
    return false;
  }
  
  public byte f(int paramInt) {
    int i;
    v.a(this.h[this.g.length - 1], paramInt, 1L);
    int j = g(paramInt);
    if (j == 0) {
      i = 0;
    } else {
      i = this.h[j - 1];
    } 
    int[] arrayOfInt = this.h;
    byte[][] arrayOfByte = this.g;
    int k = arrayOfInt[arrayOfByte.length + j];
    return arrayOfByte[j][paramInt - i + k];
  }
  
  public int hashCode() {
    int i = this.c;
    if (i != 0)
      return i; 
    int n = this.g.length;
    int k = 0;
    int m = 1;
    for (int j = 0; k < n; j = i1) {
      byte[] arrayOfByte = this.g[k];
      int[] arrayOfInt = this.h;
      int i2 = arrayOfInt[n + k];
      int i1 = arrayOfInt[k];
      for (i = i2; i < i1 - j + i2; i++)
        m = m * 31 + arrayOfByte[i]; 
      k++;
    } 
    this.c = m;
    return m;
  }
  
  public f q() {
    return w().q();
  }
  
  public f r() {
    return w().r();
  }
  
  public int s() {
    return this.h[this.g.length - 1];
  }
  
  public f t() {
    return w().t();
  }
  
  public String toString() {
    return w().toString();
  }
  
  public byte[] u() {
    int[] arrayOfInt = this.h;
    byte[][] arrayOfByte = this.g;
    byte[] arrayOfByte1 = new byte[arrayOfInt[arrayOfByte.length - 1]];
    int k = arrayOfByte.length;
    int i = 0;
    for (int j = 0; i < k; j = m) {
      int[] arrayOfInt1 = this.h;
      int n = arrayOfInt1[k + i];
      int m = arrayOfInt1[i];
      System.arraycopy(this.g[i], n, arrayOfByte1, j, m - j);
      i++;
    } 
    return arrayOfByte1;
  }
  
  public String v() {
    return w().v();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */