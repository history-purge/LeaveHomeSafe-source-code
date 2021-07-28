package e.f.c.x.d;

import java.util.Formatter;

class g {
  private final c a;
  
  private final d[] b;
  
  g(c paramc) {
    this.a = new c(paramc);
    this.b = new d[paramc.d() - paramc.f() + 1];
  }
  
  final c a() {
    return this.a;
  }
  
  final d a(int paramInt) {
    return this.b[c(paramInt)];
  }
  
  final void a(int paramInt, d paramd) {
    this.b[c(paramInt)] = paramd;
  }
  
  final d b(int paramInt) {
    d d1 = a(paramInt);
    if (d1 != null)
      return d1; 
    for (int i = 1; i < 5; i++) {
      int j = c(paramInt) - i;
      if (j >= 0) {
        d1 = this.b[j];
        if (d1 != null)
          return d1; 
      } 
      j = c(paramInt) + i;
      d[] arrayOfD = this.b;
      if (j < arrayOfD.length) {
        d d2 = arrayOfD[j];
        if (d2 != null)
          return d2; 
      } 
    } 
    return null;
  }
  
  final d[] b() {
    return this.b;
  }
  
  final int c(int paramInt) {
    return paramInt - this.a.f();
  }
  
  public String toString() {
    Formatter formatter = new Formatter();
    try {
      d[] arrayOfD = this.b;
      int k = arrayOfD.length;
      int j = 0;
      int i = 0;
      while (true) {
        if (j < k) {
          d d1 = arrayOfD[j];
          if (d1 == null) {
            formatter.format("%3d:    |   %n", new Object[] { Integer.valueOf(i) });
            i++;
          } else {
            formatter.format("%3d: %3d|%3d%n", new Object[] { Integer.valueOf(i), Integer.valueOf(d1.c()), Integer.valueOf(d1.e()) });
            i++;
          } 
        } else {
          return formatter.toString();
        } 
        j++;
      } 
    } finally {
      null = null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */