package e.f.c.x.d;

import java.util.Formatter;

final class f {
  private final a a;
  
  private final g[] b;
  
  private c c;
  
  private final int d;
  
  f(a parama, c paramc) {
    this.a = parama;
    this.d = parama.a();
    this.c = paramc;
    this.b = new g[this.d + 2];
  }
  
  private static int a(int paramInt1, int paramInt2, d paramd) {
    if (paramd == null)
      return paramInt2; 
    int i = paramInt2;
    if (!paramd.g()) {
      if (paramd.a(paramInt1)) {
        paramd.b(paramInt1);
        return 0;
      } 
      i = paramInt2 + 1;
    } 
    return i;
  }
  
  private void a(int paramInt1, int paramInt2, d[] paramArrayOfd) {
    d[] arrayOfD1;
    d d1 = paramArrayOfd[paramInt2];
    d[] arrayOfD2 = this.b[paramInt1 - 1].b();
    g[] arrayOfG = this.b;
    if (arrayOfG[++paramInt1] != null) {
      arrayOfD1 = arrayOfG[paramInt1].b();
    } else {
      arrayOfD1 = arrayOfD2;
    } 
    d[] arrayOfD3 = new d[14];
    arrayOfD3[2] = arrayOfD2[paramInt2];
    arrayOfD3[3] = arrayOfD1[paramInt2];
    boolean bool = false;
    if (paramInt2 > 0) {
      paramInt1 = paramInt2 - 1;
      arrayOfD3[0] = paramArrayOfd[paramInt1];
      arrayOfD3[4] = arrayOfD2[paramInt1];
      arrayOfD3[5] = arrayOfD1[paramInt1];
    } 
    if (paramInt2 > 1) {
      paramInt1 = paramInt2 - 2;
      arrayOfD3[8] = paramArrayOfd[paramInt1];
      arrayOfD3[10] = arrayOfD2[paramInt1];
      arrayOfD3[11] = arrayOfD1[paramInt1];
    } 
    if (paramInt2 < paramArrayOfd.length - 1) {
      paramInt1 = paramInt2 + 1;
      arrayOfD3[1] = paramArrayOfd[paramInt1];
      arrayOfD3[6] = arrayOfD2[paramInt1];
      arrayOfD3[7] = arrayOfD1[paramInt1];
    } 
    paramInt1 = bool;
    if (paramInt2 < paramArrayOfd.length - 2) {
      paramInt1 = paramInt2 + 2;
      arrayOfD3[9] = paramArrayOfd[paramInt1];
      arrayOfD3[12] = arrayOfD2[paramInt1];
      arrayOfD3[13] = arrayOfD1[paramInt1];
      paramInt1 = bool;
    } 
    while (paramInt1 < 14) {
      if (a(d1, arrayOfD3[paramInt1]))
        return; 
      paramInt1++;
    } 
  }
  
  private void a(g paramg) {
    if (paramg != null)
      ((h)paramg).a(this.a); 
  }
  
  private static boolean a(d paramd1, d paramd2) {
    if (paramd2 == null)
      return false; 
    if (paramd2.g() && paramd2.a() == paramd1.a()) {
      paramd1.b(paramd2.c());
      return true;
    } 
    return false;
  }
  
  private int f() {
    int j = g();
    if (j == 0)
      return 0; 
    for (int i = 1; i < this.d + 1; i++) {
      d[] arrayOfD = this.b[i].b();
      for (int k = 0; k < arrayOfD.length; k++) {
        if (arrayOfD[k] != null && !arrayOfD[k].g())
          a(i, k, arrayOfD); 
      } 
    } 
    return j;
  }
  
  private int g() {
    h();
    return i() + j();
  }
  
  private void h() {
    g[] arrayOfG = this.b;
    int i = 0;
    if (arrayOfG[0] != null) {
      if (arrayOfG[this.d + 1] == null)
        return; 
      d[] arrayOfD1 = arrayOfG[0].b();
      d[] arrayOfD2 = this.b[this.d + 1].b();
      while (i < arrayOfD1.length) {
        if (arrayOfD1[i] != null && arrayOfD2[i] != null && arrayOfD1[i].c() == arrayOfD2[i].c())
          for (int j = 1; j <= this.d; j++) {
            d d = this.b[j].b()[i];
            if (d != null) {
              d.b(arrayOfD1[i].c());
              if (!d.g())
                this.b[j].b()[i] = null; 
            } 
          }  
        i++;
      } 
    } 
  }
  
  private int i() {
    g[] arrayOfG = this.b;
    if (arrayOfG[0] == null)
      return 0; 
    d[] arrayOfD = arrayOfG[0].b();
    int j = 0;
    int i;
    for (i = 0; j < arrayOfD.length; i = k) {
      int k = i;
      if (arrayOfD[j] != null) {
        int n = arrayOfD[j].c();
        k = 1;
        int m = 0;
        while (k < this.d + 1 && m < 2) {
          d d = this.b[k].b()[j];
          int i1 = m;
          int i2 = i;
          if (d != null) {
            m = a(n, m, d);
            i1 = m;
            i2 = i;
            if (!d.g()) {
              i2 = i + 1;
              i1 = m;
            } 
          } 
          k++;
          m = i1;
          i = i2;
        } 
        k = i;
      } 
      j++;
    } 
    return i;
  }
  
  private int j() {
    g[] arrayOfG = this.b;
    int i = this.d;
    if (arrayOfG[i + 1] == null)
      return 0; 
    d[] arrayOfD = arrayOfG[i + 1].b();
    int j = 0;
    for (i = 0; j < arrayOfD.length; i = k) {
      int k = i;
      if (arrayOfD[j] != null) {
        int n = arrayOfD[j].c();
        k = this.d + 1;
        int m = 0;
        while (k > 0 && m < 2) {
          d d = this.b[k].b()[j];
          int i1 = m;
          int i2 = i;
          if (d != null) {
            m = a(n, m, d);
            i1 = m;
            i2 = i;
            if (!d.g()) {
              i2 = i + 1;
              i1 = m;
            } 
          } 
          k--;
          m = i1;
          i = i2;
        } 
        k = i;
      } 
      j++;
    } 
    return i;
  }
  
  int a() {
    return this.d;
  }
  
  g a(int paramInt) {
    return this.b[paramInt];
  }
  
  void a(int paramInt, g paramg) {
    this.b[paramInt] = paramg;
  }
  
  void a(c paramc) {
    this.c = paramc;
  }
  
  int b() {
    return this.a.b();
  }
  
  int c() {
    return this.a.c();
  }
  
  c d() {
    return this.c;
  }
  
  g[] e() {
    a(this.b[0]);
    a(this.b[this.d + 1]);
    for (int i = 928;; i = j) {
      int j = f();
      if (j <= 0 || j >= i)
        break; 
    } 
    return this.b;
  }
  
  public String toString() {
    g[] arrayOfG = this.b;
    g g2 = arrayOfG[0];
    g g1 = g2;
    if (g2 == null)
      g1 = arrayOfG[this.d + 1]; 
    Formatter formatter = new Formatter();
    int i = 0;
    label37: while (true) {
      try {
        if (i < (g1.b()).length) {
          formatter.format("CW %3d:", new Object[] { Integer.valueOf(i) });
          for (int j = 0;; j++) {
            if (j < this.d + 2) {
              g g3 = this.b[j];
              if (g3 == null) {
                formatter.format("    |   ", new Object[0]);
              } else {
                d d = this.b[j].b()[i];
                if (d == null) {
                  formatter.format("    |   ", new Object[0]);
                } else {
                  formatter.format(" %3d|%3d", new Object[] { Integer.valueOf(d.c()), Integer.valueOf(d.e()) });
                } 
              } 
            } else {
              formatter.format("%n", new Object[0]);
              i++;
              continue label37;
            } 
          } 
          break;
        } 
        return formatter.toString();
      } finally {
        g1 = null;
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */