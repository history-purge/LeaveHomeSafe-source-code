package e.f.c.s.m;

import e.f.c.j;
import e.f.c.p;

public final class b {
  private final e.f.c.s.b a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  private final int g;
  
  public b(e.f.c.s.b paramb) {
    this(paramb, 10, paramb.f() / 2, paramb.c() / 2);
  }
  
  public b(e.f.c.s.b paramb, int paramInt1, int paramInt2, int paramInt3) {
    this.a = paramb;
    this.b = paramb.c();
    this.c = paramb.f();
    paramInt1 /= 2;
    this.d = paramInt2 - paramInt1;
    this.e = paramInt2 + paramInt1;
    this.g = paramInt3 - paramInt1;
    this.f = paramInt3 + paramInt1;
    if (this.g >= 0 && this.d >= 0 && this.f < this.b && this.e < this.c)
      return; 
    throw j.a();
  }
  
  private p a(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4) {
    int j = a.a(a.a(paramFloat1, paramFloat2, paramFloat3, paramFloat4));
    float f = j;
    paramFloat3 = (paramFloat3 - paramFloat1) / f;
    paramFloat4 = (paramFloat4 - paramFloat2) / f;
    int i;
    for (i = 0; i < j; i++) {
      f = i;
      int k = a.a(f * paramFloat3 + paramFloat1);
      int m = a.a(f * paramFloat4 + paramFloat2);
      if (this.a.b(k, m))
        return new p(k, m); 
    } 
    return null;
  }
  
  private boolean a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
    int i = paramInt1;
    if (paramBoolean) {
      while (paramInt1 <= paramInt2) {
        if (this.a.b(paramInt1, paramInt3))
          return true; 
        paramInt1++;
      } 
    } else {
      while (i <= paramInt2) {
        if (this.a.b(paramInt3, i))
          return true; 
        i++;
      } 
    } 
    return false;
  }
  
  private p[] a(p paramp1, p paramp2, p paramp3, p paramp4) {
    float f1 = paramp1.a();
    float f2 = paramp1.b();
    float f3 = paramp2.a();
    float f4 = paramp2.b();
    float f5 = paramp3.a();
    float f6 = paramp3.b();
    float f7 = paramp4.a();
    float f8 = paramp4.b();
    return (f1 < this.c / 2.0F) ? new p[] { new p(f7 - 1.0F, f8 + 1.0F), new p(f3 + 1.0F, f4 + 1.0F), new p(f5 - 1.0F, f6 - 1.0F), new p(f1 + 1.0F, f2 - 1.0F) } : new p[] { new p(f7 + 1.0F, f8 + 1.0F), new p(f3 + 1.0F, f4 - 1.0F), new p(f5 - 1.0F, f6 + 1.0F), new p(f1 - 1.0F, f2 - 1.0F) };
  }
  
  public p[] a() {
    int n;
    int i1;
    int i2;
    int i5;
    boolean bool5;
    int j = this.d;
    int k = this.e;
    int i = this.g;
    int m = this.f;
    boolean bool7 = false;
    boolean bool6 = true;
    int i4 = 1;
    int i3 = 0;
    boolean bool4 = false;
    boolean bool3 = false;
    boolean bool1 = false;
    boolean bool2 = false;
    while (true) {
      n = k;
      i2 = i;
      i1 = m;
      bool5 = bool7;
      i5 = j;
      if (i4) {
        boolean bool = true;
        n = 0;
        i1 = i3;
        while ((bool || i1 == 0) && k < this.c) {
          boolean bool8 = a(i, m, k, false);
          if (bool8) {
            k++;
            i1 = 1;
            n = 1;
            bool = bool8;
            continue;
          } 
          bool = bool8;
          if (i1 == 0) {
            k++;
            bool = bool8;
          } 
        } 
        if (k < this.c) {
          bool = true;
          while ((bool || !bool4) && m < this.b) {
            boolean bool8 = a(j, k, m, true);
            if (bool8) {
              m++;
              bool4 = true;
              n = 1;
              bool = bool8;
              continue;
            } 
            bool = bool8;
            if (!bool4) {
              m++;
              bool = bool8;
            } 
          } 
          if (m < this.b) {
            bool = true;
            while ((bool || !bool3) && j >= 0) {
              boolean bool8 = a(i, m, j, false);
              if (bool8) {
                j--;
                bool3 = true;
                n = 1;
                bool = bool8;
                continue;
              } 
              bool = bool8;
              if (!bool3) {
                j--;
                bool = bool8;
              } 
            } 
            if (j >= 0) {
              bool = true;
              while ((bool || !bool2) && i >= 0) {
                boolean bool8 = a(j, k, i, true);
                if (bool8) {
                  i--;
                  bool2 = true;
                  n = 1;
                  bool = bool8;
                  continue;
                } 
                bool = bool8;
                if (!bool2) {
                  i--;
                  bool = bool8;
                } 
              } 
              if (i >= 0) {
                if (n != 0)
                  bool1 = true; 
                i4 = n;
                i3 = i1;
                continue;
              } 
            } 
          } 
        } 
        bool5 = true;
        n = k;
        i2 = i;
        i1 = m;
        i5 = j;
      } 
      break;
    } 
    if (!bool5 && bool1) {
      j = n - i5;
      p p2 = null;
      p p1 = null;
      for (i = 1; p1 == null && i < j; i++)
        p1 = a(i5, (i1 - i), (i5 + i), i1); 
      if (p1 != null) {
        p p = null;
        for (i = 1; p == null && i < j; i++)
          p = a(i5, (i2 + i), (i5 + i), i2); 
        if (p != null) {
          p p3 = null;
          for (i = 1; p3 == null && i < j; i++)
            p3 = a(n, (i2 + i), (n - i), i2); 
          if (p3 != null) {
            for (i = bool6; p2 == null && i < j; i++)
              p2 = a(n, (i1 - i), (n - i), i1); 
            if (p2 != null)
              return a(p2, p1, p3, p); 
            throw j.a();
          } 
          throw j.a();
        } 
        throw j.a();
      } 
      throw j.a();
    } 
    j j1 = j.a();
    throw j1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/s/m/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */