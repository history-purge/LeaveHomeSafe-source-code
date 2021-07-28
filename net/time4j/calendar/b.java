package net.time4j.calendar;

import java.util.Collections;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;
import net.time4j.calendar.t.e;
import net.time4j.calendar.t.f;
import net.time4j.d1.a0;
import net.time4j.d1.k;
import net.time4j.d1.l;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.s;
import net.time4j.d1.x;
import net.time4j.d1.z;
import net.time4j.w0;
import net.time4j.y0;

public class b {
  public static final p<Integer> a = (p<Integer>)m.c;
  
  private static <D extends q<D>> int b(p<?> paramp, D paramD) {
    return ((Integer)Integer.class.cast(paramD.b(paramp))).intValue();
  }
  
  private static w0 b(long paramLong) {
    return w0.g(net.time4j.c1.c.b(paramLong + 5L, 7) + 1);
  }
  
  private static class b<D extends q<D>> implements z<D, Integer> {
    private final b.d<?> c;
    
    private b(b.d<?> param1d) {
      this.c = param1d;
    }
    
    private int a(D param1D, int param1Int) {
      int i = param1D.a(b.d.b(this.c));
      int j = b.a(((Long)param1D.e((p)a0.c)).longValue() - i + 1L).a(b.d.a(this.c));
      if (j <= 8 - b.d.a(this.c).f()) {
        j = 2 - j;
      } else {
        j = 9 - j;
      } 
      if (param1Int != -1) {
        if (param1Int != 0)
          if (param1Int == 1) {
            i = ((Integer)param1D.b(b.d.b(this.c))).intValue();
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected: ");
            stringBuilder.append(param1Int);
            throw new AssertionError(stringBuilder.toString());
          }  
      } else {
        i = 1;
      } 
      return net.time4j.c1.c.a(i - j, 7) + 1;
    }
    
    private p<?> a(D param1D, boolean param1Boolean) {
      b.f<?> f = b.f.a(param1D.getClass(), b.d.a(this.c));
      int i = h(param1D);
      long l = ((Long)param1D.e((p)a0.c)).longValue();
      int j = param1D.a(b.d.b(this.c));
      if (param1Boolean) {
        long l1 = ((Long)param1D.b((p)f, param1D.b((p)f)).e((p)a0.c)).longValue();
        if (((Integer)param1D.b(b.d.b(this.c))).intValue() < j + l1 - l)
          return b.d.b(this.c); 
      } else if (i <= 1) {
        long l1 = ((Long)param1D.b((p)f, param1D.d((p)f)).e((p)a0.c)).longValue();
        if (((Integer)param1D.d(b.d.b(this.c))).intValue() > j - l - l1)
          return b.d.b(this.c); 
      } 
      return (p<?>)f;
    }
    
    private D b(D param1D, int param1Int) {
      int i = h(param1D);
      if (param1Int == i)
        return param1D; 
      a0 a0 = a0.c;
      return (D)param1D.b((p)a0, ((Long)param1D.e((p)a0)).longValue() + ((param1Int - i) * 7));
    }
    
    private int f(D param1D) {
      return a(param1D, 1);
    }
    
    private int g(D param1D) {
      return a(param1D, -1);
    }
    
    private int h(D param1D) {
      return a(param1D, 0);
    }
    
    public p<?> a(D param1D) {
      return a(param1D, true);
    }
    
    public D a(D param1D, Integer param1Integer, boolean param1Boolean) {
      if (param1Integer != null && (param1Boolean || a(param1D, param1Integer)))
        return b(param1D, param1Integer.intValue()); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid value: ");
      stringBuilder.append(param1Integer);
      stringBuilder.append(" (context=");
      stringBuilder.append(param1D);
      stringBuilder.append(")");
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public boolean a(D param1D, Integer param1Integer) {
      boolean bool2 = false;
      if (param1Integer == null)
        return false; 
      int i = param1Integer.intValue();
      boolean bool1 = bool2;
      if (i >= g(param1D)) {
        bool1 = bool2;
        if (i <= f(param1D))
          bool1 = true; 
      } 
      return bool1;
    }
    
    public p<?> b(D param1D) {
      return a(param1D, false);
    }
    
    public Integer c(D param1D) {
      return Integer.valueOf(f(param1D));
    }
    
    public Integer d(D param1D) {
      return Integer.valueOf(g(param1D));
    }
    
    public Integer e(D param1D) {
      return Integer.valueOf(h(param1D));
    }
  }
  
  private static class c<D extends q<D>> implements z<D, Integer> {
    private final b.d<?> c;
    
    private c(b.d<?> param1d) {
      this.c = param1d;
    }
    
    private int a(D param1D, int param1Int) {
      w0 w0 = c(param1D, param1Int);
      y0 y0 = b.d.a(this.c);
      param1Int = w0.a(y0);
      return (param1Int <= 8 - y0.f()) ? (2 - param1Int) : (9 - param1Int);
    }
    
    private int b(D param1D, int param1Int) {
      StringBuilder stringBuilder;
      int i = param1D.a(b.d.b(this.c));
      if (param1Int != -1) {
        if (param1Int != 0) {
          if (param1Int == 1) {
            param1Int = b.a(b.d.b(this.c), (q)param1D);
            p p1 = b.d.b(this.c);
            a0 a01 = a0.c;
            return b.a(p1, param1D.b((p)a01, ((Long)param1D.e((p)a01)).longValue() + param1Int + 1L - i));
          } 
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unexpected: ");
          stringBuilder.append(param1Int);
          throw new AssertionError(stringBuilder.toString());
        } 
        return b.a(b.d.b(this.c), (q)stringBuilder);
      } 
      p p = b.d.b(this.c);
      a0 a0 = a0.c;
      return b.a(p, stringBuilder.b((p)a0, ((Long)stringBuilder.e((p)a0)).longValue() - i));
    }
    
    private w0 c(D param1D, int param1Int) {
      StringBuilder stringBuilder;
      int i = param1D.a(b.d.b(this.c));
      if (param1Int != -1) {
        if (param1Int != 0) {
          if (param1Int == 1) {
            param1Int = b.a(b.d.b(this.c), (q)param1D);
            return b.a(((Long)param1D.e((p)a0.c)).longValue() + param1Int + 1L - i);
          } 
          stringBuilder = new StringBuilder();
          stringBuilder.append("Unexpected: ");
          stringBuilder.append(param1Int);
          throw new AssertionError(stringBuilder.toString());
        } 
        return b.a(((Long)stringBuilder.e((p)a0.c)).longValue() - i + 1L);
      } 
      long l = ((Long)stringBuilder.e((p)a0.c)).longValue() - i;
      return b.a(l - stringBuilder.b((p)a0.c, l).a(b.d.b(this.c)) + 1L);
    }
    
    private D d(D param1D, int param1Int) {
      int i = f(param1D);
      if (param1Int == i)
        return param1D; 
      a0 a0 = a0.c;
      return (D)param1D.b((p)a0, ((Long)param1D.e((p)a0)).longValue() + ((param1Int - i) * 7));
    }
    
    private int f(D param1D) {
      int k = param1D.a(b.d.b(this.c));
      int j = a(param1D, 0);
      if (j <= k) {
        int m = k;
        return (a(param1D, 1) + b(param1D, 0) <= k) ? 1 : ((m - j) / 7 + 1);
      } 
      j = a(param1D, -1);
      int i = k + b(param1D, -1);
      return (i - j) / 7 + 1;
    }
    
    private int g(D param1D) {
      int k = param1D.a(b.d.b(this.c));
      int j = a(param1D, 0);
      if (j <= k) {
        int i1 = a(param1D, 1) + b(param1D, 0);
        int n = j;
        int m = i1;
        if (i1 <= k)
          try {
            n = a(param1D, 1);
            m = a((D)param1D.b((p)a0.c, ((Long)param1D.e((p)a0.c)).longValue() + 7L), 1);
            k = b(param1D, 1);
            m += k;
          } catch (RuntimeException runtimeException) {
            m = i1 + 7;
            n = j;
          }  
        return (m - n) / 7;
      } 
      int i = a((D)runtimeException, -1);
      return (j + b((D)runtimeException, -1) - i) / 7;
    }
    
    private p<?> g(Object param1Object) {
      return (p<?>)new b.f<q>((Class<q>)param1Object, b.d.a(this.c));
    }
    
    public p<?> a(D param1D) {
      return g(param1D.getClass());
    }
    
    public D a(D param1D, Integer param1Integer, boolean param1Boolean) {
      int i = param1Integer.intValue();
      if (param1Boolean || a(param1D, param1Integer))
        return d(param1D, i); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid value: ");
      stringBuilder.append(i);
      stringBuilder.append(" (context=");
      stringBuilder.append(param1D);
      stringBuilder.append(")");
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public boolean a(D param1D, Integer param1Integer) {
      boolean bool2 = false;
      if (param1Integer == null)
        return false; 
      int i = param1Integer.intValue();
      boolean bool1 = bool2;
      if (i >= 1) {
        bool1 = bool2;
        if (i <= g(param1D))
          bool1 = true; 
      } 
      return bool1;
    }
    
    public p<?> b(D param1D) {
      return g(param1D.getClass());
    }
    
    public Integer c(D param1D) {
      return Integer.valueOf(g(param1D));
    }
    
    public Integer d(D param1D) {
      return Integer.valueOf(1);
    }
    
    public Integer e(D param1D) {
      return Integer.valueOf(f(param1D));
    }
  }
  
  private static class d<T extends q<T>> extends f<T> {
    private static final long serialVersionUID = -7471192143785466686L;
    
    private final boolean bounded;
    
    private final p<Integer> dayElement;
    
    private final y0 model;
    
    d(String param1String, Class<T> param1Class, int param1Int1, int param1Int2, char param1Char, y0 param1y0, p<Integer> param1p, boolean param1Boolean) {
      super(param1String, param1Class, param1Int1, param1Int2, param1Char);
      if (param1y0 != null) {
        this.model = param1y0;
        this.dayElement = param1p;
        this.bounded = param1Boolean;
        return;
      } 
      throw new NullPointerException("Missing week model.");
    }
    
    static <T extends q<T>> d<T> a(String param1String, Class<T> param1Class, int param1Int1, int param1Int2, char param1Char, y0 param1y0, p<Integer> param1p, boolean param1Boolean) {
      return new d<T>(param1String, param1Class, param1Int1, param1Int2, param1Char, param1y0, param1p, param1Boolean);
    }
    
    protected <D extends q<D>> z<D, Integer> a(x<D> param1x) {
      return (z<D, Integer>)(h().equals(param1x.e()) ? (this.bounded ? new b.b<D>(this, null) : new b.c<D>(this, null)) : null);
    }
    
    protected boolean a(net.time4j.d1.e<?> param1e) {
      boolean bool = super.a(param1e);
      boolean bool2 = false;
      boolean bool1 = bool2;
      if (bool) {
        d d1 = d.class.cast(param1e);
        bool1 = bool2;
        if (this.model.equals(d1.model)) {
          bool1 = bool2;
          if (this.bounded == d1.bounded)
            bool1 = true; 
        } 
      } 
      return bool1;
    }
    
    public boolean c() {
      return true;
    }
    
    protected Object readResolve() {
      return this;
    }
  }
  
  private static class e<T extends q<T>> implements z<T, w0> {
    private final b.f<?> c;
    
    private e(b.f<?> param1f) {
      this.c = param1f;
    }
    
    public p<?> a(T param1T) {
      return null;
    }
    
    public T a(T param1T, w0 param1w0, boolean param1Boolean) {
      long l = ((Long)param1T.e((p)a0.c)).longValue();
      w0 w01 = b.a(l);
      if (param1w0 == w01)
        return param1T; 
      int i = w01.a(b.f.a(this.c));
      int j = param1w0.a(b.f.a(this.c));
      return (T)param1T.b((p)a0.c, l + j - i);
    }
    
    public boolean a(T param1T, w0 param1w0) {
      if (param1w0 == null)
        return false; 
      try {
        a(param1T, param1w0, false);
        return true;
      } catch (ArithmeticException|IllegalArgumentException arithmeticException) {
        return false;
      } 
    }
    
    public p<?> b(T param1T) {
      return null;
    }
    
    public w0 c(T param1T) {
      k k;
      x x = x.a(param1T.getClass());
      if (param1T instanceof l) {
        k = x.a(((l)l.class.cast(param1T)).v());
      } else {
        k = k.d();
      } 
      long l1 = k.a();
      long l2 = ((Long)param1T.e((p)a0.c)).longValue();
      return (l2 + 7L - b.a(l2).a(b.f.a(this.c)) > l1) ? b.a(l1) : this.c.b();
    }
    
    public w0 d(T param1T) {
      k k;
      x x = x.a(param1T.getClass());
      if (param1T instanceof l) {
        k = x.a(((l)l.class.cast(param1T)).v());
      } else {
        k = k.d();
      } 
      long l1 = k.b();
      long l2 = ((Long)param1T.e((p)a0.c)).longValue();
      return (l2 + 1L - b.a(l2).a(b.f.a(this.c)) < l1) ? b.a(l1) : this.c.q();
    }
    
    public w0 e(T param1T) {
      return b.a(((Long)param1T.e((p)a0.c)).longValue());
    }
  }
  
  private static class f<T extends q<T>> extends e<w0, T> {
    private static final long serialVersionUID = 5613494586572932860L;
    
    private final y0 model;
    
    f(Class<T> param1Class, y0 param1y0) {
      super("LOCAL_DAY_OF_WEEK", param1Class, w0.class, 'e');
      this.model = param1y0;
    }
    
    static <T extends q<T>> f<T> a(Class<T> param1Class, y0 param1y0) {
      return new f<T>(param1Class, param1y0);
    }
    
    public int a(o param1o1, o param1o2) {
      int i = ((w0)param1o1.e((p)this)).a(this.model);
      int j = ((w0)param1o2.e((p)this)).a(this.model);
      return (i < j) ? -1 : ((i == j) ? 0 : 1);
    }
    
    public int a(w0 param1w0) {
      return param1w0.a(this.model);
    }
    
    protected <D extends q<D>> z<D, w0> a(x<D> param1x) {
      return h().equals(param1x.e()) ? new b.e<D>(this, null) : null;
    }
    
    protected boolean a(net.time4j.d1.e<?> param1e) {
      if (super.a(param1e)) {
        f f1 = f.class.cast(param1e);
        return this.model.equals(f1.model);
      } 
      return false;
    }
    
    public w0 b() {
      return this.model.e().f(6);
    }
    
    protected boolean k() {
      return true;
    }
    
    public w0 q() {
      return this.model.e();
    }
    
    protected Object readResolve() {
      return this;
    }
  }
  
  static class g implements s {
    private final Class<? extends q> a;
    
    private final p<Integer> b;
    
    private final p<Integer> c;
    
    private final y0 d;
    
    g(Class<? extends q> param1Class, p<Integer> param1p1, p<Integer> param1p2, y0 param1y0) {
      this.a = param1Class;
      this.b = param1p1;
      this.c = param1p2;
      this.d = param1y0;
    }
    
    public Set<p<?>> a(Locale param1Locale, net.time4j.d1.d param1d) {
      y0 y01;
      if (param1Locale.getCountry().isEmpty()) {
        y01 = this.d;
      } else {
        y01 = y0.a((Locale)y01);
      } 
      HashSet<? extends p<?>> hashSet = new HashSet();
      hashSet.add(b.f.a(this.a, y01));
      hashSet.add(b.d.a("WEEK_OF_MONTH", this.a, 1, 5, 'W', y01, this.b, false));
      hashSet.add(b.d.a("WEEK_OF_YEAR", this.a, 1, 52, 'w', y01, this.c, false));
      hashSet.add(b.d.a("BOUNDED_WEEK_OF_MONTH", this.a, 1, 5, false, y01, this.b, true));
      hashSet.add(b.d.a("BOUNDED_WEEK_OF_YEAR", this.a, 1, 52, false, y01, this.c, true));
      return Collections.unmodifiableSet(hashSet);
    }
    
    public q<?> a(q<?> param1q, Locale param1Locale, net.time4j.d1.d param1d) {
      return param1q;
    }
    
    public boolean a(Class<?> param1Class) {
      return this.a.equals(param1Class);
    }
    
    public boolean a(p<?> param1p) {
      return false;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */