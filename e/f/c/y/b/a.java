package e.f.c.y.b;

import e.f.c.f;
import e.f.c.s.b;

final class a {
  private final b a;
  
  private j b;
  
  private g c;
  
  private boolean d;
  
  a(b paramb) {
    int i = paramb.c();
    if (i >= 21 && (i & 0x3) == 1) {
      this.a = paramb;
      return;
    } 
    throw f.a();
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3) {
    boolean bool;
    if (this.d) {
      bool = this.a.b(paramInt2, paramInt1);
    } else {
      bool = this.a.b(paramInt1, paramInt2);
    } 
    return bool ? (paramInt3 << 1 | 0x1) : (paramInt3 << 1);
  }
  
  void a() {
    for (int i = 0; i < this.a.f(); i = k) {
      int k = i + 1;
      for (int m = k; m < this.a.c(); m++) {
        if (this.a.b(i, m) != this.a.b(m, i)) {
          this.a.a(m, i);
          this.a.a(i, m);
        } 
      } 
    } 
  }
  
  void a(boolean paramBoolean) {
    this.b = null;
    this.c = null;
    this.d = paramBoolean;
  }
  
  byte[] b() {
    g g1 = c();
    j j1 = d();
    c c = c.values()[g1.a()];
    int i3 = this.a.c();
    c.a(this.a, i3);
    b b1 = j1.a();
    byte[] arrayOfByte = new byte[j1.d()];
    int i2 = i3 - 1;
    int n = i2;
    int i = 0;
    int i1 = 1;
    int k = 0;
    int m = 0;
    while (n > 0) {
      int i4 = n;
      if (n == 6)
        i4 = n - 1; 
      n = 0;
      while (n < i3) {
        int i6;
        if (i1) {
          i6 = i2 - n;
        } else {
          i6 = n;
        } 
        int i5 = k;
        int i7 = 0;
        k = m;
        m = i5;
        while (i7 < 2) {
          int i10 = i4 - i7;
          int i9 = i;
          i5 = m;
          int i8 = k;
          if (!b1.b(i10, i6)) {
            i5 = m + 1;
            k <<= 1;
            if (this.a.b(i10, i6))
              k |= 0x1; 
            if (i5 == 8) {
              arrayOfByte[i] = (byte)k;
              i9 = i + 1;
              i5 = 0;
              i8 = 0;
            } else {
              i8 = k;
              i9 = i;
            } 
          } 
          i7++;
          i = i9;
          m = i5;
          k = i8;
        } 
        n++;
        i5 = k;
        k = m;
        m = i5;
      } 
      i1 ^= 0x1;
      n = i4 - 2;
    } 
    if (i == j1.d())
      return arrayOfByte; 
    f f = f.a();
    throw f;
  }
  
  g c() {
    g g1 = this.c;
    if (g1 != null)
      return g1; 
    boolean bool = false;
    int i = 0;
    int k = 0;
    while (i < 6) {
      k = a(i, 8, k);
      i++;
    } 
    k = a(8, 7, a(8, 8, a(7, 8, k)));
    for (i = 5; i >= 0; i--)
      k = a(8, i, k); 
    int n = this.a.c();
    int m = n - 1;
    i = bool;
    while (m >= n - 7) {
      i = a(8, m, i);
      m--;
    } 
    for (m = n - 8; m < n; m++)
      i = a(m, 8, i); 
    this.c = g.a(k, i);
    g1 = this.c;
    if (g1 != null)
      return g1; 
    f f = f.a();
    throw f;
  }
  
  j d() {
    j j1 = this.b;
    if (j1 != null)
      return j1; 
    int m = this.a.c();
    int i = (m - 17) / 4;
    if (i <= 6)
      return j.c(i); 
    int n = m - 11;
    byte b1 = 5;
    boolean bool = false;
    i = 5;
    int k = 0;
    while (i >= 0) {
      for (int i1 = m - 9; i1 >= n; i1--)
        k = a(i1, i, k); 
      i--;
    } 
    j1 = j.a(k);
    i = b1;
    k = bool;
    if (j1 != null) {
      i = b1;
      k = bool;
      if (j1.c() == m) {
        this.b = j1;
        return j1;
      } 
    } 
    while (i >= 0) {
      for (int i1 = m - 9; i1 >= n; i1--)
        k = a(i, i1, k); 
      i--;
    } 
    j1 = j.a(k);
    if (j1 != null && j1.c() == m) {
      this.b = j1;
      return j1;
    } 
    f f = f.a();
    throw f;
  }
  
  void e() {
    if (this.c == null)
      return; 
    c c = c.values()[this.c.a()];
    int i = this.a.c();
    c.a(this.a, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */