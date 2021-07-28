package net.time4j.e1;

import java.util.Collections;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import net.time4j.d1.c;
import net.time4j.d1.d;
import net.time4j.d1.f0;
import net.time4j.d1.x;
import net.time4j.g1.f;
import net.time4j.tz.k;
import net.time4j.tz.o;

public final class a implements d {
  public static final c<String> b = q.a("CALENDAR_TYPE", String.class);
  
  public static final c<Locale> c = q.a("LANGUAGE", Locale.class);
  
  public static final c<k> d = q.a("TIMEZONE_ID", k.class);
  
  public static final c<o> e = q.a("TRANSITION_STRATEGY", o.class);
  
  public static final c<g> f = q.a("LENIENCY", g.class);
  
  public static final c<w> g = q.a("TEXT_WIDTH", w.class);
  
  public static final c<m> h = q.a("OUTPUT_CONTEXT", m.class);
  
  public static final c<Boolean> i = q.a("PARSE_CASE_INSENSITIVE", Boolean.class);
  
  public static final c<Boolean> j = q.a("PARSE_PARTIAL_COMPARE", Boolean.class);
  
  public static final c<Boolean> k = q.a("PARSE_MULTIPLE_CONTEXT", Boolean.class);
  
  public static final c<j> l = q.a("NUMBER_SYSTEM", j.class);
  
  public static final c<Character> m = q.a("ZERO_DIGIT", Character.class);
  
  public static final c<Boolean> n = q.a("NO_GMT_PREFIX", Boolean.class);
  
  public static final c<Character> o = q.a("DECIMAL_SEPARATOR", Character.class);
  
  public static final c<Character> p = q.a("PAD_CHAR", Character.class);
  
  public static final c<Integer> q = q.a("PIVOT_YEAR", Integer.class);
  
  public static final c<Boolean> r = q.a("TRAILING_CHARACTERS", Boolean.class);
  
  public static final c<Integer> s = q.a("PROTECTED_CHARACTERS", Integer.class);
  
  public static final c<String> t = q.a("CALENDAR_VARIANT", String.class);
  
  public static final c<f0> u = q.a("START_OF_DAY", f0.class);
  
  public static final c<Boolean> v = q.a("FOUR_DIGIT_YEAR", Boolean.class);
  
  public static final c<f> w = q.a("TIME_SCALE", f.class);
  
  public static final c<String> x = q.a("FORMAT_PATTERN", String.class);
  
  private static final a y = (new b()).a();
  
  private final Map<String, Object> a;
  
  private a(Map<String, Object> paramMap) {
    this.a = Collections.unmodifiableMap(new HashMap<String, Object>(paramMap));
  }
  
  public static <A> c<A> a(String paramString, Class<A> paramClass) {
    return q.a(paramString, paramClass);
  }
  
  public static a a() {
    return y;
  }
  
  public <A> A a(c<A> paramc) {
    Object object = this.a.get(paramc.name());
    if (object != null)
      return paramc.a().cast(object); 
    throw new NoSuchElementException(paramc.name());
  }
  
  public <A> A a(c<A> paramc, A paramA) {
    Object object = this.a.get(paramc.name());
    return (object == null) ? paramA : paramc.a().cast(object);
  }
  
  public boolean b(c<?> paramc) {
    return this.a.containsKey(paramc.name());
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof a) {
      paramObject = paramObject;
      return this.a.equals(((a)paramObject).a);
    } 
    return false;
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(this.a.size() * 32);
    stringBuilder.append(a.class.getName());
    stringBuilder.append('[');
    stringBuilder.append(this.a);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  public static final class b {
    private final Map<String, Object> a = new HashMap<String, Object>();
    
    public b() {}
    
    public b(x<?> param1x) {
      a(a.b, b.a(param1x));
    }
    
    private <A> void a(c<A> param1c, A param1A) {
      if (param1A != null) {
        this.a.put(param1c.name(), param1A);
        return;
      } 
      throw new NullPointerException("Missing attribute value.");
    }
    
    public b a(Locale param1Locale) {
      a(a.c, param1Locale);
      return this;
    }
    
    public b a(c<Character> param1c, char param1Char) {
      this.a.put(param1c.name(), Character.valueOf(param1Char));
      return this;
    }
    
    public b a(c<Integer> param1c, int param1Int) {
      if (param1c != a.q || param1Int >= 100) {
        this.a.put(param1c.name(), Integer.valueOf(param1Int));
        return this;
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Pivot year in far past not supported: ");
      stringBuilder.append(param1Int);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public <A extends Enum<A>> b a(c<A> param1c, A param1A) {
      if (param1A != null) {
        if (param1A instanceof Enum) {
          this.a.put(param1c.name(), param1A);
          if (param1c == a.f) {
            int i = a.a.a[((g)g.class.cast(param1A)).ordinal()];
            if (i != 1) {
              if (i != 2) {
                if (i == 3) {
                  a(a.i, true);
                  a(a.j, true);
                  a(a.r, true);
                } else {
                  throw new UnsupportedOperationException(param1A.name());
                } 
              } else {
                a(a.i, true);
                a(a.j, false);
                a(a.r, false);
              } 
              a(a.k, true);
              return this;
            } 
            a(a.i, false);
            a(a.j, false);
            a(a.r, false);
            a(a.k, false);
            return this;
          } 
          if (param1c == a.l) {
            j j = j.class.cast(param1A);
            if (j.b())
              a(a.m, j.a().charAt(0)); 
          } 
          return this;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Enum expected, but found: ");
        stringBuilder.append(param1A);
        throw new ClassCastException(stringBuilder.toString());
      } 
      throw new NullPointerException("Missing attribute value.");
    }
    
    public b a(c<Boolean> param1c, boolean param1Boolean) {
      this.a.put(param1c.name(), Boolean.valueOf(param1Boolean));
      return this;
    }
    
    public b a(a param1a) {
      this.a.putAll(a.a(param1a));
      return this;
    }
    
    public b a(k param1k) {
      a(a.d, param1k);
      return this;
    }
    
    public a a() {
      return new a(this.a, null);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */