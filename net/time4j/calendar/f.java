package net.time4j.calendar;

import java.util.Locale;
import net.time4j.d1.c0;
import net.time4j.d1.g;
import net.time4j.d1.m;
import net.time4j.d1.n0;
import net.time4j.d1.p;
import net.time4j.d1.z;

public abstract class f<U, D extends f<U, D>> extends m<U, D> {
  private final transient int c;
  
  private final transient int d;
  
  private final transient h e;
  
  private final transient int f;
  
  private final transient long g;
  
  private final transient int h;
  
  f(int paramInt1, int paramInt2, h paramh, int paramInt3, long paramLong) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramh;
    this.f = paramInt3;
    this.g = paramLong;
    this.h = v().a(paramInt1, paramInt2);
  }
  
  static <D extends f<?, D>> z<D, Integer> C() {
    return (z)new d<f>(0, null, null);
  }
  
  static <D extends f<?, D>> z<D, Integer> D() {
    return (z)new d<f>(1, null, null);
  }
  
  static <D extends f<?, D>> n0<D> f(int paramInt) {
    return new c<D>(paramInt);
  }
  
  static <D extends f<?, D>> z<D, Integer> g(p<?> paramp) {
    return (z)new d<f>(3, paramp, null);
  }
  
  static <D extends f<?, D>> z<D, Integer> h(p<?> paramp) {
    return (z)new d<f>(2, paramp, null);
  }
  
  static <D extends f<?, D>> z<D, h> i(p<?> paramp) {
    return new e<D>(paramp, null);
  }
  
  static <D extends f<?, D>> z<D, c> j(p<?> paramp) {
    return new b<D>(paramp, false, null);
  }
  
  public int A() {
    long l = v().e(this.g + 1L);
    return (int)(this.f + l - this.g - 1L);
  }
  
  public int B() {
    int k = this.c;
    int n = this.d + 1;
    int j = k;
    int i = n;
    if (n > 60) {
      j = k + 1;
      i = 1;
    } 
    long l = v().b(this.c, this.d);
    return (int)(v().b(j, i) - l);
  }
  
  public boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (paramObject == null)
      return false; 
    if (getClass() == paramObject.getClass()) {
      paramObject = paramObject;
      return (this.c == ((f)paramObject).c && this.d == ((f)paramObject).d && this.f == ((f)paramObject).f && this.e.equals(((f)paramObject).e) && this.g == ((f)paramObject).g);
    } 
    return false;
  }
  
  public h getMonth() {
    return this.e;
  }
  
  public c getYear() {
    return c.g(this.d);
  }
  
  public int hashCode() {
    long l = this.g;
    return (int)(l ^ l >>> 32L);
  }
  
  public long q() {
    return this.g;
  }
  
  public int r() {
    return this.f;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    String str2 = ((net.time4j.e1.c)getClass().<net.time4j.e1.c>getAnnotation(net.time4j.e1.c.class)).value();
    String str1 = str2;
    if (str2.equals("dangi"))
      str1 = "korean"; 
    stringBuilder.append(str1);
    stringBuilder.append('[');
    stringBuilder.append(getYear().a(Locale.ROOT));
    stringBuilder.append('(');
    stringBuilder.append(a(b.a));
    stringBuilder.append(")-");
    stringBuilder.append(this.e.toString());
    stringBuilder.append('-');
    if (this.f < 10)
      stringBuilder.append('0'); 
    stringBuilder.append(this.f);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  abstract d<D> v();
  
  int w() {
    return this.c;
  }
  
  public int x() {
    return (int)(this.g - v().b(this.c, this.d) + 1L);
  }
  
  int y() {
    return this.h;
  }
  
  public boolean z() {
    return (this.h > 0);
  }
  
  private static class b<D extends f<?, D>> implements z<D, c> {
    private final p<?> c;
    
    private final boolean d;
    
    private b(p<?> param1p, boolean param1Boolean) {
      this.c = param1p;
      this.d = param1Boolean;
    }
    
    public D a(D param1D, c param1c, boolean param1Boolean) {
      if (a(param1D, param1c)) {
        h h1;
        d<D> d = param1D.v();
        int i = param1D.r();
        h h2 = param1D.getMonth();
        int j = param1c.b();
        int k = param1D.w();
        if (h2.b() && h2.a() != d.a(k, j)) {
          h1 = h.f(h2.a());
        } else {
          h1 = h2;
        } 
        if (i <= 29) {
          long l1 = d.b(k, j, h1, i);
          return d.a(k, j, h1, i, l1);
        } 
        long l = d.b(k, j, h1, 1);
        i = Math.min(i, d.a(l).A());
        l = l + i - 1L;
        return d.a(k, j, h1, i, l);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid cyclic year: ");
      stringBuilder.append(param1c);
      IllegalArgumentException illegalArgumentException = new IllegalArgumentException(stringBuilder.toString());
      throw illegalArgumentException;
    }
    
    public p<?> a(D param1D) {
      return this.c;
    }
    
    public boolean a(D param1D, c param1c) {
      c c2 = d(param1D);
      c c1 = c(param1D);
      return (param1c != null && c2.a(param1c) <= 0 && c1.a(param1c) >= 0);
    }
    
    public p<?> b(D param1D) {
      return this.c;
    }
    
    public c c(D param1D) {
      byte b1;
      if (param1D.w() == 94) {
        b1 = 56;
      } else {
        b1 = 60;
      } 
      return c.g(b1);
    }
    
    public c d(D param1D) {
      boolean bool = this.d;
      int i = param1D.w();
      return bool ? ((i == 75) ? c.g(10) : c.g(1)) : ((i == 72) ? c.g(22) : c.g(1));
    }
    
    public c e(D param1D) {
      return param1D.getYear();
    }
  }
  
  private static class c<D extends f<?, D>> implements n0<D> {
    private final int a;
    
    c(int param1Int) {
      this.a = param1Int;
    }
    
    private static <D extends f<?, D>> long a(D param1D1, D param1D2, int param1Int) {
      h h;
      int i;
      d d = param1D1.v();
      if (param1Int != 0) {
        if (param1Int != 1) {
          D d1;
          if (param1Int != 2) {
            if (param1Int != 3) {
              if (param1Int == 4)
                return param1D2.q() - param1D1.q(); 
              throw new UnsupportedOperationException();
            } 
            return (param1D2.q() - param1D1.q()) / 7L;
          } 
          boolean bool2 = param1D1.b((g)param1D2);
          if (bool2) {
            d1 = param1D1;
          } else {
            d1 = param1D2;
            param1D2 = param1D1;
          } 
          param1Int = param1D2.w();
          int m = param1D2.getYear().b();
          h = param1D2.getMonth();
          int j = h.a();
          boolean bool1 = h.b();
          int n = d.a(param1Int, m);
          int k = 0;
          while (true) {
            if (param1Int != d1.w() || m != d1.getYear().b() || !h.equals(d1.getMonth())) {
              int i1;
              if (bool1) {
                i1 = j + 1;
                bool1 = false;
              } else if (n == j) {
                bool1 = true;
                i1 = j;
              } else {
                i1 = j + 1;
              } 
              j = i1;
              int i2 = n;
              int i3 = param1Int;
              int i4 = m;
              if (!bool1)
                if (i1 == 13) {
                  j = m + 1;
                  i3 = param1Int;
                  i4 = j;
                  if (j == 61) {
                    i3 = param1Int + 1;
                    i4 = 1;
                  } 
                  i2 = d.a(i3, i4);
                  j = 1;
                } else {
                  j = i1;
                  i2 = n;
                  i3 = param1Int;
                  i4 = m;
                  if (i1 == 0) {
                    j = m - 1;
                    i3 = param1Int;
                    i4 = j;
                    if (j == 0) {
                      i3 = param1Int - 1;
                      i4 = 60;
                    } 
                    i2 = d.a(i3, i4);
                    j = 12;
                  } 
                }  
              h h1 = h.f(j);
              h = h1;
              if (bool1)
                h = h1.c(); 
              k++;
              n = i2;
              param1Int = i3;
              m = i4;
              continue;
            } 
            param1Int = k;
            if (k > 0) {
              param1Int = k;
              if (param1D2.r() > d1.r())
                param1Int = k - 1; 
            } 
            j = param1Int;
            if (bool2)
              j = -param1Int; 
            return j;
          } 
        } 
        i = param1D2.w() * 60 + param1D2.getYear().b() - h.w() * 60 - h.getYear().b();
        if (i > 0) {
          int j = h.getMonth().a(param1D2.getMonth());
          if (j <= 0) {
            param1Int = i;
            if (j == 0) {
              param1Int = i;
              if (h.r() > param1D2.r()) {
                param1Int = i - 1;
                return param1Int;
              } 
            } 
            return param1Int;
          } 
        } else {
          param1Int = i;
          if (i < 0) {
            int j = h.getMonth().a(param1D2.getMonth());
            if (j >= 0) {
              param1Int = i;
              if (j == 0) {
                param1Int = i;
                if (h.r() < param1D2.r())
                  param1Int = i + 1; 
              } 
              return param1Int;
            } 
          } else {
            return param1Int;
          } 
          param1Int = i + 1;
        } 
      } else {
        return a(h, (h)param1D2, 1) / 60L;
      } 
      param1Int = i - 1;
      return param1Int;
    }
    
    private static <D extends f<?, D>> D a(int param1Int1, int param1Int2, h param1h, int param1Int3, d<D> param1d) {
      if (param1Int3 <= 29)
        return param1d.a(param1Int1, param1Int2, param1h, param1Int3, param1d.b(param1Int1, param1Int2, param1h, param1Int3)); 
      long l = param1d.b(param1Int1, param1Int2, param1h, 1);
      param1Int3 = Math.min(param1Int3, param1d.a(l).A());
      return param1d.a(param1Int1, param1Int2, param1h, param1Int3, l + param1Int3 - 1L);
    }
    
    private static void a(long param1Long) {
      if (param1Long <= 1200L && param1Long >= -1200L)
        return; 
      throw new ArithmeticException("Month arithmetic limited to delta not greater than 1200.");
    }
    
    public long a(D param1D1, D param1D2) {
      return a(param1D1, param1D2, this.a);
    }
    
    public D a(D param1D, long param1Long) {
      long l2;
      long l1 = param1Long;
      d<D> d = param1D.v();
      int m = param1D.r();
      int j = param1D.w();
      int k = param1D.getYear().b();
      h h2 = param1D.getMonth();
      int i = this.a;
      if (i != 0) {
        l2 = l1;
        if (i != 1) {
          byte b;
          if (i != 2) {
            if (i != 3) {
              if (i != 4)
                throw new UnsupportedOperationException(); 
            } else {
              l1 = net.time4j.c1.c.b(l1, 7L);
            } 
            return d.a(net.time4j.c1.c.a(param1D.q(), l1));
          } 
          a(param1Long);
          if (l1 > 0L) {
            b = 1;
          } else {
            b = -1;
          } 
          int n = h2.a();
          boolean bool = h2.b();
          int i1 = d.a(j, k);
          while (true) {
            if (l1 != 0L) {
              if (bool) {
                boolean bool1 = false;
                bool = bool1;
                i = n;
                if (b == 1) {
                  i = n + 1;
                  bool = bool1;
                } 
              } else {
                if (b == 1 && i1 == n) {
                  i = n;
                } else if (b == -1 && i1 == n - 1) {
                  i = n - 1;
                } else {
                  i = n + b;
                  int i6 = j;
                  int i7 = k;
                  n = i;
                  int i5 = i1;
                } 
                bool = true;
              } 
            } else {
              break;
            } 
            int i3 = j;
            int i4 = k;
            n = i;
            int i2 = i1;
          } 
          h2 = h.f(n);
          h h = h2;
          if (bool)
            h = h2.c(); 
          return a(j, k, h, m, d);
        } 
      } else {
        l2 = net.time4j.c1.c.b(l1, 60L);
      } 
      param1Long = net.time4j.c1.c.a((j * 60 + k - 1), l2);
      i = net.time4j.c1.c.a(net.time4j.c1.c.a(param1Long, 60));
      j = net.time4j.c1.c.b(param1Long, 60) + 1;
      h h1 = h2;
      if (h2.b()) {
        h1 = h2;
        if (d.a(i, j) != h2.a())
          h1 = h.f(h2.a()); 
      } 
      return a(i, j, h1, m, d);
    }
  }
  
  private static class d<D extends f<?, D>> implements c0<D> {
    private final p<?> c;
    
    private final int d;
    
    private d(int param1Int, p<?> param1p) {
      this.d = param1Int;
      this.c = param1p;
    }
    
    public D a(D param1D, int param1Int, boolean param1Boolean) {
      int i = this.d;
      if (i != 0) {
        if (i != 1) {
          boolean bool2 = false;
          boolean bool1 = false;
          if (i != 2) {
            if (i == 3) {
              if (a(param1D, param1Int)) {
                i = param1D.w();
                return (D)f.<D>f(0).a(param1D, (param1Int - i));
              } 
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append("Sexagesimal cycle out of range: ");
              stringBuilder1.append(param1Int);
              throw new IllegalArgumentException(stringBuilder1.toString());
            } 
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown element index: ");
            stringBuilder.append(this.d);
            throw new UnsupportedOperationException(stringBuilder.toString());
          } 
          if (a((D)stringBuilder, param1Int)) {
            int k = stringBuilder.y();
            i = bool2;
            int j = param1Int;
            if (k > 0) {
              i = bool2;
              j = param1Int;
              if (k < param1Int) {
                i = bool1;
                if (param1Int == k + 1)
                  i = 1; 
                j = param1Int - 1;
              } 
            } 
            h h2 = h.f(j);
            h h1 = h2;
            if (i != 0)
              h1 = h2.c(); 
            return f.e.b((D)stringBuilder, h1);
          } 
          stringBuilder = new StringBuilder();
          stringBuilder.append("Ordinal month out of range: ");
          stringBuilder.append(param1Int);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        if (param1Boolean || (param1Int >= 1 && param1Int <= stringBuilder.B())) {
          long l1 = stringBuilder.q();
          long l2 = param1Int;
          long l3 = stringBuilder.x();
          return stringBuilder.v().a(l1 + l2 - l3);
        } 
        stringBuilder = new StringBuilder();
        stringBuilder.append("Day of year out of range: ");
        stringBuilder.append(param1Int);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      if (param1Boolean) {
        long l1 = stringBuilder.q();
        long l2 = param1Int;
        long l3 = stringBuilder.r();
        return stringBuilder.v().a(l1 + l2 - l3);
      } 
      if (param1Int >= 1 && param1Int <= 30 && (param1Int != 30 || stringBuilder.A() >= 30)) {
        long l1 = stringBuilder.q();
        long l2 = param1Int;
        long l3 = stringBuilder.r();
        return stringBuilder.v().a(stringBuilder.w(), stringBuilder.getYear().b(), stringBuilder.getMonth(), param1Int, l1 + l2 - l3);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Day of month out of range: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public D a(D param1D, Integer param1Integer, boolean param1Boolean) {
      if (param1Integer != null)
        return a(param1D, param1Integer.intValue(), param1Boolean); 
      throw new IllegalArgumentException("Missing element value.");
    }
    
    public p<?> a(D param1D) {
      return this.c;
    }
    
    public boolean a(D param1D, int param1Int) {
      boolean bool3 = false;
      boolean bool1 = false;
      boolean bool2 = false;
      null = false;
      if (param1Int < 1)
        return false; 
      int i = this.d;
      if (i == 0) {
        if (param1Int > 30)
          return false; 
        if (param1Int == 30) {
          if (param1D.A() == 30)
            null = true; 
          return null;
        } 
        return true;
      } 
      if (i == 1) {
        null = bool3;
        if (param1Int <= param1D.B())
          null = true; 
        return null;
      } 
      if (i == 2) {
        if (param1Int > 12) {
          null = bool1;
          if (param1Int == 13) {
            null = bool1;
            if (param1D.y() > 0)
              return true; 
          } 
          return null;
        } 
      } else {
        if (i == 3) {
          d d1 = param1D.v();
          i = ((f)d1.a(d1.b())).w();
          int j = ((f)d1.a(d1.a())).w();
          null = bool2;
          if (param1Int >= i) {
            null = bool2;
            if (param1Int <= j)
              null = true; 
          } 
          return null;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown element index: ");
        stringBuilder.append(this.d);
        throw new UnsupportedOperationException(stringBuilder.toString());
      } 
      return true;
    }
    
    public boolean a(D param1D, Integer param1Integer) {
      return (param1Integer != null && a(param1D, param1Integer.intValue()));
    }
    
    public p<?> b(D param1D) {
      return this.c;
    }
    
    public int c(D param1D) {
      StringBuilder stringBuilder;
      int i;
      null = this.d;
      if (null != 0) {
        if (null != 1) {
          if (null != 2) {
            if (null == 3)
              return param1D.w(); 
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown element index: ");
            stringBuilder.append(this.d);
            throw new UnsupportedOperationException(stringBuilder.toString());
          } 
          i = stringBuilder.getMonth().a();
          null = stringBuilder.y();
          if (null <= 0 || null >= i) {
            null = i;
            return stringBuilder.getMonth().b() ? (i + 1) : null;
          } 
        } else {
          return stringBuilder.x();
        } 
      } else {
        return stringBuilder.r();
      } 
      return i + 1;
    }
    
    public Integer d(D param1D) {
      StringBuilder stringBuilder;
      int i = this.d;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i == 3) {
              d d1 = param1D.v();
              i = ((f)d1.a(d1.a())).w();
            } else {
              stringBuilder = new StringBuilder();
              stringBuilder.append("Unknown element index: ");
              stringBuilder.append(this.d);
              throw new UnsupportedOperationException(stringBuilder.toString());
            } 
          } else if (stringBuilder.z()) {
            i = 13;
          } else {
            i = 12;
          } 
        } else {
          i = stringBuilder.B();
        } 
      } else {
        i = stringBuilder.A();
      } 
      return Integer.valueOf(i);
    }
    
    public Integer e(D param1D) {
      if (this.d == 3) {
        d d1 = param1D.v();
        int i = ((f)d1.a(d1.b())).w();
        return Integer.valueOf(i);
      } 
      boolean bool = true;
      return Integer.valueOf(bool);
    }
    
    public Integer f(D param1D) {
      return Integer.valueOf(c(param1D));
    }
  }
  
  private static class e<D extends f<?, D>> implements z<D, h> {
    private final p<?> c;
    
    private e(p<?> param1p) {
      this.c = param1p;
    }
    
    static <D extends f<?, D>> D b(D param1D, h param1h) {
      d<D> d = param1D.v();
      int j = param1D.r();
      int k = param1D.getYear().b();
      if (j <= 29) {
        long l1 = d.b(param1D.w(), k, param1h, j);
        int m = param1D.w();
        return d.a(m, k, param1h, j, l1);
      } 
      long l = d.b(param1D.w(), k, param1h, 1);
      j = Math.min(j, d.a(l).A());
      int i = param1D.w();
      l = l + j - 1L;
      return d.a(i, k, param1h, j, l);
    }
    
    public D a(D param1D, h param1h, boolean param1Boolean) {
      if (a(param1D, param1h))
        return b(param1D, param1h); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid month: ");
      stringBuilder.append(param1h);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public p<?> a(D param1D) {
      return this.c;
    }
    
    public boolean a(D param1D, h param1h) {
      return (param1h != null && (!param1h.b() || param1h.a() == param1D.y()));
    }
    
    public p<?> b(D param1D) {
      return this.c;
    }
    
    public h c(D param1D) {
      return h.f(12);
    }
    
    public h d(D param1D) {
      return h.f(1);
    }
    
    public h e(D param1D) {
      return param1D.getMonth();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */