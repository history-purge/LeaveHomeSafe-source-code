package net.time4j.calendar;

import java.text.ParsePosition;
import java.util.Locale;
import net.time4j.d1.i;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.x;
import net.time4j.d1.z;
import net.time4j.e1.u;
import net.time4j.e1.w;
import net.time4j.f;
import net.time4j.f0;

public enum k implements i {
  e;
  
  private final transient p<k> c = (p<k>)new b(null);
  
  private final transient p<Integer> d = (p<Integer>)new e(null);
  
  public String a(Locale paramLocale, w paramw) {
    return net.time4j.e1.b.a("dangi", paramLocale).a(paramw).a(this);
  }
  
  p<k> a() {
    return this.c;
  }
  
  p<Integer> b() {
    return this.d;
  }
  
  private static class b extends net.time4j.e1.d<k> implements u<k> {
    private static final long serialVersionUID = -5179188137244162427L;
    
    private b() {
      super("ERA");
    }
    
    private Object readResolve() {
      return k.e.a();
    }
    
    public char a() {
      return 'G';
    }
    
    public k a(CharSequence param1CharSequence, ParsePosition param1ParsePosition, net.time4j.d1.d param1d) {
      Locale locale = (Locale)param1d.a(net.time4j.e1.a.c, Locale.ROOT);
      boolean bool1 = ((Boolean)param1d.a(net.time4j.e1.a.i, Boolean.TRUE)).booleanValue();
      boolean bool2 = ((Boolean)param1d.a(net.time4j.e1.a.j, Boolean.FALSE)).booleanValue();
      w w = (w)param1d.a(net.time4j.e1.a.g, w.c);
      int i = param1ParsePosition.getIndex();
      String str = k.e.a(locale, w);
      int j = Math.max(Math.min(str.length() + i, param1CharSequence.length()), i);
      if (j > i) {
        String str2 = param1CharSequence.subSequence(i, j).toString();
        String str1 = str2;
        param1CharSequence = str;
        if (bool1) {
          param1CharSequence = str.toLowerCase(locale);
          str1 = str2.toLowerCase(locale);
        } 
        if (param1CharSequence.equals(str1) || (bool2 && param1CharSequence.startsWith(str1))) {
          param1ParsePosition.setIndex(j);
          return k.e;
        } 
      } 
      param1ParsePosition.setErrorIndex(i);
      return null;
    }
    
    protected <T extends q<T>> z<T, k> a(x<T> param1x) {
      return param1x.c((p)f0.q) ? new k.c(null) : null;
    }
    
    public void a(o param1o, Appendable param1Appendable, net.time4j.d1.d param1d) {
      Locale locale = (Locale)param1d.a(net.time4j.e1.a.c, Locale.ROOT);
      w w = (w)param1d.a(net.time4j.e1.a.g, w.c);
      param1Appendable.append(k.e.a(locale, w));
    }
    
    public k b() {
      return k.e;
    }
    
    public boolean d() {
      return true;
    }
    
    protected boolean g() {
      return true;
    }
    
    public Class<k> getType() {
      return k.class;
    }
    
    public k q() {
      return k.e;
    }
    
    public boolean s() {
      return false;
    }
  }
  
  private static class c implements z<q<?>, k> {
    private c() {}
    
    public p<?> a(q<?> param1q) {
      throw new AbstractMethodError("Never called.");
    }
    
    public q<?> a(q<?> param1q, k param1k, boolean param1Boolean) {
      if (a(param1q, param1k))
        return param1q; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid Korean era: ");
      stringBuilder.append(param1k);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public boolean a(q<?> param1q, k param1k) {
      return (param1k == k.e);
    }
    
    public p<?> b(q<?> param1q) {
      throw new AbstractMethodError("Never called.");
    }
    
    public k c(q<?> param1q) {
      return k.e;
    }
    
    public k d(q<?> param1q) {
      return k.e;
    }
    
    public k e(q<?> param1q) {
      return k.e;
    }
  }
  
  private static class d implements z<q<?>, Integer> {
    private d() {}
    
    private int f(q<?> param1q) {
      return ((f0)param1q.e((p)f0.q)).getYear() + 2333;
    }
    
    public p<?> a(q<?> param1q) {
      throw new AbstractMethodError("Never called.");
    }
    
    public q<?> a(q<?> param1q, Integer param1Integer, boolean param1Boolean) {
      if (param1Integer != null) {
        f0 f0;
        if (a(param1q, param1Integer)) {
          int i = f(param1q);
          f0 = (f0)((f0)param1q.e((p)f0.q)).b((param1Integer.intValue() - i), f.f);
          return param1q.b((p)f0.q, f0);
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Invalid year of era: ");
        stringBuilder.append(f0);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new IllegalArgumentException("Missing year of era.");
    }
    
    public boolean a(q<?> param1q, Integer param1Integer) {
      boolean bool2 = false;
      if (param1Integer == null)
        return false; 
      int i = d(param1q).intValue();
      int j = c(param1q).intValue();
      boolean bool1 = bool2;
      if (param1Integer.intValue() >= i) {
        bool1 = bool2;
        if (param1Integer.intValue() <= j)
          bool1 = true; 
      } 
      return bool1;
    }
    
    public p<?> b(q<?> param1q) {
      throw new AbstractMethodError("Never called.");
    }
    
    public Integer c(q<?> param1q) {
      return Integer.valueOf(1000002332);
    }
    
    public Integer d(q<?> param1q) {
      return Integer.valueOf(-999997666);
    }
    
    public Integer e(q<?> param1q) {
      return Integer.valueOf(f(param1q));
    }
  }
  
  private static class e extends net.time4j.e1.d<Integer> {
    private static final long serialVersionUID = -7864513245908399367L;
    
    private e() {
      super("YEAR_OF_ERA");
    }
    
    private Object readResolve() {
      return k.e.b();
    }
    
    public char a() {
      return 'y';
    }
    
    protected <T extends q<T>> z<T, Integer> a(x<T> param1x) {
      return param1x.c((p)f0.q) ? new k.d(null) : null;
    }
    
    public Integer b() {
      return Integer.valueOf(5332);
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
      return Integer.valueOf(3978);
    }
    
    public boolean s() {
      return false;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */