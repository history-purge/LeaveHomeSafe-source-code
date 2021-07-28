package net.time4j;

import net.time4j.c1.b;
import net.time4j.c1.c;
import net.time4j.d1.a0;
import net.time4j.d1.n0;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.v;
import net.time4j.d1.z;

final class z0 extends a<Integer> {
  private static final n0 c = new c<q>(null);
  
  static final z0 d = new z0("YEAR_OF_WEEKDATE");
  
  private static final long serialVersionUID = -6907291758376370420L;
  
  private z0(String paramString) {
    super(paramString);
    new d(-1L, null);
    new d(1L, null);
  }
  
  static <T extends q<T>> z<T, Integer> a(Class<T> paramClass) {
    return new b<T>(null);
  }
  
  private static int b(int paramInt) {
    paramInt = w0.g(b.b(paramInt, 1, 1)).a(y0.n);
    return (paramInt <= 8 - y0.n.f()) ? (2 - paramInt) : (9 - paramInt);
  }
  
  private static int b(f0 paramf0) {
    int j = paramf0.x();
    int i = c(paramf0, 0);
    if (i <= j) {
      int k = (j - i) / 7 + 1;
      i = k;
      if (k >= 53) {
        i = k;
        if (c(paramf0, 1) + d(paramf0, 0) <= j)
          i = 1; 
      } 
      return i;
    } 
    i = c(paramf0, -1);
    return (j + d(paramf0, -1) - i) / 7 + 1;
  }
  
  private static int c(f0 paramf0, int paramInt) {
    return b(paramf0.getYear() + paramInt);
  }
  
  private static int d(f0 paramf0, int paramInt) {
    return b.b(paramf0.getYear() + paramInt) ? 366 : 365;
  }
  
  static <T extends q<T>> n0<T> h() {
    return c;
  }
  
  private Object readResolve() {
    return d;
  }
  
  public char a() {
    return 'Y';
  }
  
  public Integer b() {
    return f0.i;
  }
  
  public boolean d() {
    return true;
  }
  
  protected boolean g() {
    return true;
  }
  
  public Class<Integer> getType() {
    return Integer.class;
  }
  
  public Integer q() {
    return f0.h;
  }
  
  public boolean s() {
    return false;
  }
  
  private static class b<T extends q<T>> implements z<T, Integer> {
    private b() {}
    
    private p<?> a() {
      return y0.n.j();
    }
    
    private static f0 a(f0 param1f0, int param1Int) {
      int i = z0.a(param1Int);
      int j = z0.a(param1f0);
      int k = param1f0.w().a(y0.n);
      long l2 = a0.d.a(b.d(param1Int, 1, 1), a0.e) + (i - 1) + ((j - 1) * 7) + (k - 1);
      long l1 = l2;
      if (j == 53) {
        j = z0.a(param1Int + 1);
        if (b.b(param1Int)) {
          param1Int = 366;
        } else {
          param1Int = 365;
        } 
        l1 = l2;
        if ((j + param1Int - i) / 7 < 53)
          l1 = l2 - 7L; 
      } 
      return param1f0.a(l1 - 730L);
    }
    
    public p<?> a(T param1T) {
      return a();
    }
    
    public T a(T param1T, Integer param1Integer, boolean param1Boolean) {
      if (param1Integer != null) {
        f0 f0 = a((f0)param1T.e(f0.p), param1Integer.intValue());
        return (T)param1T.b(f0.p, f0);
      } 
      throw new IllegalArgumentException("Missing element value.");
    }
    
    public boolean a(T param1T, Integer param1Integer) {
      boolean bool2 = false;
      if (param1Integer == null)
        return false; 
      int i = param1Integer.intValue();
      boolean bool1 = bool2;
      if (i >= -999999999) {
        bool1 = bool2;
        if (i <= 999999999)
          bool1 = true; 
      } 
      return bool1;
    }
    
    public p<?> b(T param1T) {
      return a();
    }
    
    public Integer c(T param1T) {
      return z0.d.b();
    }
    
    public Integer d(T param1T) {
      return z0.d.q();
    }
    
    public Integer e(T param1T) {
      int i;
      f0 f0 = (f0)param1T.e(f0.p);
      int j = f0.getYear();
      int k = f0.x();
      int m = z0.a(f0, 0);
      if (m <= k) {
        i = j;
        if ((k - m) / 7 + 1 >= 53) {
          i = j;
          if (z0.a(f0, 1) + z0.b(f0, 0) <= k)
            i = j + 1; 
        } 
      } else {
        i = j - 1;
      } 
      return Integer.valueOf(i);
    }
  }
  
  private static class c<T extends q<T>> implements n0<T> {
    private c() {}
    
    public long a(T param1T1, T param1T2) {
      f0 f01 = (f0)param1T1.e(f0.p);
      f0 f02 = (f0)param1T2.e(f0.p);
      int i = ((Integer)f01.e(z0.d)).intValue();
      long l2 = (((Integer)f02.e(z0.d)).intValue() - i);
      long l1 = l2;
      if (l2 != 0L) {
        long l;
        i = z0.a(f01);
        int j = z0.a(f02);
        if (l2 > 0L && i > j) {
          l = l2 - 1L;
        } else {
          l = l2;
          if (l2 < 0L) {
            l = l2;
            if (i < j)
              l = l2 + 1L; 
          } 
        } 
        l1 = l;
        if (l != 0L) {
          l1 = l;
          if (i == j) {
            i = f01.w().a();
            j = f02.w().a();
            if (l > 0L && i > j) {
              l2 = l - 1L;
            } else {
              l2 = l;
              if (l < 0L) {
                l2 = l;
                if (i < j)
                  l2 = l + 1L; 
              } 
            } 
            l1 = l2;
            if (l2 != 0L) {
              l1 = l2;
              if (i == j) {
                l1 = l2;
                if (param1T1.c(g0.q)) {
                  l1 = l2;
                  if (param1T2.c(g0.q)) {
                    g0 g01 = (g0)param1T1.e(g0.q);
                    g0 g02 = (g0)param1T2.e(g0.q);
                    if (l2 > 0L && g01.b(g02))
                      return l2 - 1L; 
                    l1 = l2;
                    if (l2 < 0L) {
                      l1 = l2;
                      if (g01.c(g02))
                        l1 = l2 + 1L; 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
      return l1;
    }
    
    public T a(T param1T, long param1Long) {
      if (param1Long == 0L)
        return param1T; 
      int k = c.a(c.a(((Integer)param1T.e(z0.d)).intValue(), param1Long));
      f0 f0 = (f0)param1T.e(f0.p);
      int j = f0.A();
      w0 w0 = f0.w();
      int i = j;
      if (j == 53)
        i = ((Integer)f0.a(k, 26, w0).b(y0.n.j())).intValue(); 
      return (T)param1T.b(f0.p, f0.a(k, i, w0));
    }
  }
  
  private static class d extends o<f0> {
    private final long d;
    
    private d(long param1Long) {
      super(z0.d, 8);
      this.d = param1Long;
      new a(this);
    }
    
    public f0 a(f0 param1f0) {
      return (f0)z0.<q>h().a(param1f0, this.d);
    }
    
    class a implements v<h0> {
      a(z0.d this$0) {}
      
      public h0 a(h0 param2h0) {
        return (h0)z0.<q>h().a(param2h0, z0.d.a(this.c));
      }
    }
  }
  
  class a implements v<h0> {
    a(z0 this$0) {}
    
    public h0 a(h0 param1h0) {
      return (h0)z0.<q>h().a(param1h0, z0.d.a(this.c));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/z0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */