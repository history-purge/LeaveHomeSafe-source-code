package net.time4j.calendar;

import net.time4j.calendar.t.f;
import net.time4j.d1.a0;
import net.time4j.d1.c0;
import net.time4j.d1.g;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.v;
import net.time4j.d1.z;
import net.time4j.w0;

final class q<T extends q<T> & g> extends f<T> implements l<T> {
  private static final long serialVersionUID = 4275169663905222176L;
  
  private final transient p<Integer> f;
  
  private final transient p<w0> g;
  
  q(Class<T> paramClass, p<Integer> paramp, p<w0> paramp1) {
    super("WEEKDAY_IN_MONTH", paramClass, 1, ((Integer)paramp.b()).intValue() / 7, 'F', new c<q>(true), new c<q>(false));
    this.f = paramp;
    this.g = paramp1;
  }
  
  static <T extends q<T> & g> z<T, Integer> c(q<T> paramq) {
    return (z)new a<T>(paramq);
  }
  
  public v<T> a(int paramInt, w0 paramw0) {
    return new b<T>(this, paramInt, paramw0);
  }
  
  private static class a<T extends q<T> & g> implements c0<T> {
    private final q<T> c;
    
    a(q<T> param1q) {
      this.c = param1q;
    }
    
    private int g(T param1T) {
      int i = param1T.a(q.b(this.c));
      int j = ((Integer)param1T.b(q.b(this.c))).intValue();
      while (true) {
        int k = i + 7;
        if (k <= j) {
          i = k;
          continue;
        } 
        return net.time4j.c1.c.a(i - 1, 7) + 1;
      } 
    }
    
    public p<?> a(T param1T) {
      return null;
    }
    
    public T a(T param1T, int param1Int, boolean param1Boolean) {
      if (a(param1T, param1Int)) {
        w0 w0 = (w0)param1T.e(q.a(this.c));
        return (T)param1T.a(this.c.a(param1Int, w0));
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid value: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public T a(T param1T, Integer param1Integer, boolean param1Boolean) {
      if (param1Integer != null)
        return a(param1T, param1Integer.intValue(), param1Boolean); 
      throw new IllegalArgumentException("Missing value.");
    }
    
    public boolean a(T param1T, int param1Int) {
      return (param1Int >= 1 && param1Int <= g(param1T));
    }
    
    public boolean a(T param1T, Integer param1Integer) {
      return (param1Integer != null && a(param1T, param1Integer.intValue()));
    }
    
    public p<?> b(T param1T) {
      return null;
    }
    
    public int c(T param1T) {
      return net.time4j.c1.c.a(param1T.a(q.b(this.c)) - 1, 7) + 1;
    }
    
    public Integer d(T param1T) {
      return Integer.valueOf(g(param1T));
    }
    
    public Integer e(T param1T) {
      return Integer.valueOf(1);
    }
    
    public Integer f(T param1T) {
      return Integer.valueOf(c(param1T));
    }
  }
  
  private static class b<T extends q<T> & g> implements v<T> {
    private final q<T> c;
    
    private final long d;
    
    private final w0 e;
    
    b(q<T> param1q, int param1Int, w0 param1w0) {
      if (param1w0 != null) {
        this.c = param1q;
        this.d = param1Int;
        this.e = param1w0;
        return;
      } 
      throw new NullPointerException("Missing value.");
    }
    
    public T a(T param1T) {
      long l1;
      w0 w01 = (w0)param1T.e(q.a(this.c));
      int i = param1T.a(q.b(this.c));
      if (this.d == 2147483647L) {
        int k = ((Integer)param1T.b(q.b(this.c))).intValue();
        int j = w01.a();
        k -= i;
        j += k % 7;
        i = j;
        if (j > 7)
          i = j - 7; 
        i = this.e.a() - i;
        long l = (k + i);
        l1 = l;
        if (i > 0)
          l1 = l - 7L; 
      } else {
        int j = this.e.a() - w01.a();
        l1 = (this.d - (net.time4j.c1.c.a(i + j - 1, 7) + 1)) * 7L + j;
      } 
      long l2 = ((g)param1T).q();
      return (T)param1T.b((p)a0.c, l2 + l1);
    }
  }
  
  private static class c<T extends q<T>> implements v<T> {
    private final boolean c;
    
    c(boolean param1Boolean) {
      this.c = param1Boolean;
    }
    
    public T a(T param1T) {
      long l = ((Long)param1T.e((p)a0.c)).longValue();
      if (this.c) {
        l -= 7L;
      } else {
        l += 7L;
      } 
      return (T)param1T.b((p)a0.c, l);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */