package e.f.c.x.d;

import e.f.c.p;

final class h extends g {
  private final boolean c;
  
  h(c paramc, boolean paramBoolean) {
    super(paramc);
    this.c = paramBoolean;
  }
  
  private void a(d[] paramArrayOfd, a parama) {
    for (int i = 0; i < paramArrayOfd.length; i++) {
      d d1 = paramArrayOfd[i];
      if (paramArrayOfd[i] != null) {
        int k = d1.e() % 30;
        int j = d1.c();
        if (j > parama.c()) {
          paramArrayOfd[i] = null;
        } else {
          int m = j;
          if (!this.c)
            m = j + 2; 
          m %= 3;
          if (m != 0) {
            if (m != 1) {
              if (m == 2 && k + 1 != parama.a())
                paramArrayOfd[i] = null; 
            } else if (k / 3 != parama.b() || k % 3 != parama.d()) {
              paramArrayOfd[i] = null;
            } 
          } else if (k * 3 + 1 != parama.e()) {
            paramArrayOfd[i] = null;
          } 
        } 
      } 
    } 
  }
  
  private void b(a parama) {
    p p1;
    p p2;
    c c = a();
    if (this.c) {
      p1 = c.g();
    } else {
      p1 = c.h();
    } 
    if (this.c) {
      p2 = c.a();
    } else {
      p2 = p2.b();
    } 
    int j = c((int)p1.b());
    int n = c((int)p2.b());
    d[] arrayOfD = b();
    int k = -1;
    int m = 0;
    for (int i = 1;; i = i3) {
      int i1;
      int i2;
      int i3;
      if (j < n) {
        i2 = k;
        i1 = m;
        i3 = i;
        if (arrayOfD[j] != null) {
          d d = arrayOfD[j];
          d.h();
          i1 = d.c() - k;
          if (i1 == 0) {
            i1 = m + 1;
            i2 = k;
            i3 = i;
          } else {
            if (i1 == 1) {
              i = Math.max(i, m);
              i1 = d.c();
            } else {
              if (d.c() >= parama.c()) {
                arrayOfD[j] = null;
                i2 = k;
                i1 = m;
                i3 = i;
              } else {
                i1 = d.c();
                k = 1;
                i2 = i1;
                i1 = k;
                i3 = i;
              } 
              j++;
              k = i2;
              m = i1;
              i = i3;
            } 
            k = 1;
            i2 = i1;
            i1 = k;
            i3 = i;
          } 
        } 
      } else {
        break;
      } 
      j++;
      k = i2;
      m = i1;
    } 
  }
  
  private void f() {
    for (d d : b()) {
      if (d != null)
        d.h(); 
    } 
  }
  
  void a(a parama) {
    p p1;
    p p2;
    d[] arrayOfD = b();
    f();
    a(arrayOfD, parama);
    c c = a();
    if (this.c) {
      p1 = c.g();
    } else {
      p1 = c.h();
    } 
    if (this.c) {
      p2 = c.a();
    } else {
      p2 = p2.b();
    } 
    int j = c((int)p1.b());
    int n = c((int)p2.b());
    int k = -1;
    int m = 0;
    for (int i = 1;; i = i3) {
      int i1;
      int i2;
      int i3;
      if (j < n) {
        i2 = k;
        i1 = m;
        i3 = i;
        if (arrayOfD[j] != null) {
          d d = arrayOfD[j];
          i1 = d.c() - k;
          if (i1 == 0) {
            i1 = m + 1;
            i2 = k;
            i3 = i;
          } else {
            if (i1 == 1) {
              i = Math.max(i, m);
              i1 = d.c();
            } else {
              if (i1 < 0 || d.c() >= parama.c() || i1 > j) {
                arrayOfD[j] = null;
                i3 = i;
                i1 = m;
                i2 = k;
              } else {
                i2 = i1;
                if (i > 2)
                  i2 = i1 * (i - 2); 
                if (i2 >= j) {
                  i1 = 1;
                } else {
                  i1 = 0;
                } 
                for (i3 = 1; i3 <= i2 && i1 == 0; i3++) {
                  if (arrayOfD[j - i3] != null) {
                    i1 = 1;
                  } else {
                    i1 = 0;
                  } 
                } 
                if (i1 != 0) {
                  arrayOfD[j] = null;
                  i2 = k;
                  i1 = m;
                  i3 = i;
                } else {
                  i1 = d.c();
                  k = 1;
                  i2 = i1;
                  i1 = k;
                  i3 = i;
                } 
              } 
              j++;
              k = i2;
              m = i1;
              i = i3;
            } 
            k = 1;
            i2 = i1;
            i1 = k;
            i3 = i;
          } 
        } 
      } else {
        break;
      } 
      j++;
      k = i2;
      m = i1;
    } 
  }
  
  a c() {
    d[] arrayOfD = b();
    b b1 = new b();
    b b2 = new b();
    b b3 = new b();
    b b4 = new b();
    int j = arrayOfD.length;
    for (int i = 0; i < j; i++) {
      d d = arrayOfD[i];
      if (d != null) {
        d.h();
        int n = d.e() % 30;
        int m = d.c();
        int k = m;
        if (!this.c)
          k = m + 2; 
        k %= 3;
        if (k != 0) {
          if (k != 1) {
            if (k == 2)
              b1.a(n + 1); 
          } else {
            b4.a(n / 3);
            b3.a(n % 3);
          } 
        } else {
          b2.a(n * 3 + 1);
        } 
      } 
    } 
    if ((b1.a()).length == 0 || (b2.a()).length == 0 || (b3.a()).length == 0 || (b4.a()).length == 0 || b1.a()[0] <= 0 || b2.a()[0] + b3.a()[0] < 3 || b2.a()[0] + b3.a()[0] > 90)
      return null; 
    a a = new a(b1.a()[0], b2.a()[0], b3.a()[0], b4.a()[0]);
    a(arrayOfD, a);
    return a;
  }
  
  int[] d() {
    a a = c();
    if (a == null)
      return null; 
    b(a);
    int[] arrayOfInt = new int[a.c()];
    for (d d : b()) {
      if (d != null) {
        int i = d.c();
        if (i < arrayOfInt.length)
          arrayOfInt[i] = arrayOfInt[i] + 1; 
      } 
    } 
    return arrayOfInt;
  }
  
  boolean e() {
    return this.c;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("IsLeft: ");
    stringBuilder.append(this.c);
    stringBuilder.append('\n');
    stringBuilder.append(super.toString());
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */