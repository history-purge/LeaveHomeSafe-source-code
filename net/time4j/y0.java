package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.text.ParsePosition;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import net.time4j.c1.a;
import net.time4j.c1.b;
import net.time4j.c1.c;
import net.time4j.c1.d;
import net.time4j.d1.d;
import net.time4j.d1.e;
import net.time4j.d1.n;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.x;
import net.time4j.d1.z;
import net.time4j.e1.a;
import net.time4j.e1.b;
import net.time4j.e1.l;
import net.time4j.e1.m;
import net.time4j.e1.t;
import net.time4j.e1.u;
import net.time4j.e1.w;
import net.time4j.e1.z;

public final class y0 implements Serializable {
  private static final Map<Locale, y0> m = new ConcurrentHashMap<Locale, y0>();
  
  public static final y0 n = new y0(w0.c, 4, w0.h, w0.i);
  
  private static final z o;
  
  private static final long serialVersionUID = 7794495882610436763L;
  
  private final transient w0 c;
  
  private final transient int d;
  
  private final transient w0 e;
  
  private final transient w0 f;
  
  private final transient c<Integer, f0> g;
  
  private final transient c<Integer, f0> h;
  
  private final transient c<Integer, f0> i;
  
  private final transient c<Integer, f0> j;
  
  private final transient c0<w0> k;
  
  private final transient Set<p<?>> l;
  
  static {
    Iterator<z> iterator = d.c().a(z.class).iterator();
    if (iterator.hasNext()) {
      z z1 = iterator.next();
    } else {
      iterator = null;
    } 
    o = (z)iterator;
  }
  
  private y0(w0 paramw01, int paramInt, w0 paramw02, w0 paramw03) {
    if (paramw01 != null) {
      if (paramInt >= 1 && paramInt <= 7) {
        if (paramw02 != null) {
          if (paramw03 != null) {
            this.c = paramw01;
            this.d = paramInt;
            this.e = paramw02;
            this.f = paramw03;
            this.g = new d("WEEK_OF_YEAR", 0);
            this.h = new d("WEEK_OF_MONTH", 1);
            this.i = new d("BOUNDED_WEEK_OF_YEAR", 2);
            this.j = new d("BOUNDED_WEEK_OF_MONTH", 3);
            this.k = new f();
            new a(this, paramw02, paramw03);
            HashSet<c<Integer, f0>> hashSet = new HashSet();
            hashSet.add(this.g);
            hashSet.add(this.h);
            hashSet.add(this.k);
            hashSet.add(this.i);
            hashSet.add(this.j);
            this.l = Collections.unmodifiableSet((Set)hashSet);
            return;
          } 
          throw new NullPointerException("Missing end of weekend.");
        } 
        throw new NullPointerException("Missing start of weekend.");
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Minimal days in first week out of range: ");
      stringBuilder.append(paramInt);
      throw new IllegalArgumentException(stringBuilder.toString());
    } 
    throw new NullPointerException("Missing first day of week.");
  }
  
  static w0 a(long paramLong) {
    return w0.g(c.b(paramLong + 5L, 7) + 1);
  }
  
  public static y0 a(Locale paramLocale) {
    GregorianCalendar gregorianCalendar;
    if (paramLocale.getCountry().isEmpty())
      return n; 
    y0 y02 = m.get(paramLocale);
    if (y02 != null)
      return y02; 
    z z1 = o;
    if (z1 == null) {
      gregorianCalendar = new GregorianCalendar(paramLocale);
      int i = gregorianCalendar.getFirstDayOfWeek();
      if (i == 1) {
        i = 7;
      } else {
        i--;
      } 
      return a(w0.g(i), gregorianCalendar.getMinimalDaysInFirstWeek());
    } 
    y0 y01 = new y0(w0.g(z1.d((Locale)gregorianCalendar)), z1.c((Locale)gregorianCalendar), w0.g(z1.b((Locale)gregorianCalendar)), w0.g(z1.a((Locale)gregorianCalendar)));
    if (m.size() > 150)
      m.clear(); 
    m.put(gregorianCalendar, y01);
    return y01;
  }
  
  public static y0 a(w0 paramw0, int paramInt) {
    return a(paramw0, paramInt, w0.h, w0.i);
  }
  
  public static y0 a(w0 paramw01, int paramInt, w0 paramw02, w0 paramw03) {
    return (paramw01 == w0.c && paramInt == 4 && paramw02 == w0.h && paramw03 == w0.i) ? n : new y0(paramw01, paramInt, paramw02, paramw03);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 3);
  }
  
  public c<Integer, f0> a() {
    return this.j;
  }
  
  public c<Integer, f0> b() {
    return this.i;
  }
  
  Set<p<?>> c() {
    return this.l;
  }
  
  public w0 d() {
    return this.f;
  }
  
  public w0 e() {
    return this.c;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof y0) {
      paramObject = paramObject;
      return (this.c == ((y0)paramObject).c && this.d == ((y0)paramObject).d && this.e == ((y0)paramObject).e && this.f == ((y0)paramObject).f);
    } 
    return false;
  }
  
  public int f() {
    return this.d;
  }
  
  public w0 g() {
    return this.e;
  }
  
  public c0<w0> h() {
    return this.k;
  }
  
  public int hashCode() {
    return this.c.name().hashCode() * 17 + this.d * 37;
  }
  
  public c<Integer, f0> i() {
    return this.h;
  }
  
  public c<Integer, f0> j() {
    return this.g;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(64);
    stringBuilder.append(y0.class.getName());
    stringBuilder.append("[firstDayOfWeek=");
    stringBuilder.append(this.c);
    stringBuilder.append(",minimalDaysInFirstWeek=");
    stringBuilder.append(this.d);
    stringBuilder.append(",startOfWeekend=");
    stringBuilder.append(this.e);
    stringBuilder.append(",endOfWeekend=");
    stringBuilder.append(this.f);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
  
  class a implements n<a> {
    a(y0 this$0, w0 param1w01, w0 param1w02) {}
    
    public boolean a(a param1a) {
      w0 w01 = w0.g(b.b(param1a.getYear(), param1a.getMonth(), param1a.r()));
      return (w01 == this.c || w01 == this.d);
    }
  }
  
  private static class b<T extends q<T>> implements z<T, Integer> {
    private final y0.d c;
    
    private b(y0.d param1d) {
      this.c = param1d;
    }
    
    private int a(f0 param1f0) {
      return y0.d.b(this.c) ? (b.b(param1f0.getYear()) ? 366 : 365) : b.a(param1f0.getYear(), param1f0.getMonth());
    }
    
    private int a(f0 param1f0, int param1Int) {
      int i;
      if (y0.d.b(this.c)) {
        i = param1f0.x();
      } else {
        i = param1f0.r();
      } 
      int j = y0.a(param1f0.y() - i + 1L).a(y0.d.a(this.c));
      if (j <= 8 - y0.d.a(this.c).f()) {
        j = 2 - j;
      } else {
        j = 9 - j;
      } 
      if (param1Int != -1) {
        if (param1Int != 0)
          if (param1Int == 1) {
            i = a(param1f0);
          } else {
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unexpected: ");
            stringBuilder.append(param1Int);
            throw new AssertionError(stringBuilder.toString());
          }  
      } else {
        i = 1;
      } 
      return c.a(i - j, 7) + 1;
    }
    
    private p<?> a(T param1T, boolean param1Boolean) {
      f0 f01;
      f0 f02 = (f0)param1T.e(f0.p);
      c0<w0> c0 = y0.d.a(this.c).h();
      int i = e(param1T).intValue();
      if (param1Boolean) {
        byte b1;
        if (y0.d.b(this.c)) {
          b1 = 52;
        } else {
          b1 = 4;
        } 
        if (i >= b1) {
          f01 = (f0)f02.b(c0, param1T.b(c0));
          if (y0.d.b(this.c)) {
            if (f01.x() < f02.x())
              return f0.y; 
          } else if (f01.r() < f02.r()) {
            return f0.w;
          } 
        } 
      } else if (i <= 1) {
        f01 = (f0)f02.b(c0, f01.d(c0));
        if (y0.d.b(this.c)) {
          if (f01.x() > f02.x())
            return f0.y; 
        } else if (f01.r() > f02.r()) {
          return f0.w;
        } 
      } 
      return c0;
    }
    
    private int b(f0 param1f0) {
      return a(param1f0, 1);
    }
    
    private f0 b(f0 param1f0, int param1Int) {
      int i = d(param1f0);
      return (param1Int == i) ? param1f0 : param1f0.a(param1f0.y() + ((param1Int - i) * 7));
    }
    
    private int c(f0 param1f0) {
      return a(param1f0, -1);
    }
    
    private int d(f0 param1f0) {
      return a(param1f0, 0);
    }
    
    public p<?> a(T param1T) {
      return a(param1T, true);
    }
    
    public T a(T param1T, Integer param1Integer, boolean param1Boolean) {
      f0 f0 = (f0)param1T.e(f0.p);
      if (param1Integer != null && (param1Boolean || a(param1T, param1Integer)))
        return (T)param1T.b(f0.p, b(f0, param1Integer.intValue())); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid value: ");
      stringBuilder.append(param1Integer);
      stringBuilder.append(" (context=");
      stringBuilder.append(param1T);
      stringBuilder.append(")");
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public boolean a(T param1T, Integer param1Integer) {
      boolean bool2 = false;
      if (param1Integer == null)
        return false; 
      int i = param1Integer.intValue();
      f0 f0 = (f0)param1T.e(f0.p);
      boolean bool1 = bool2;
      if (i >= c(f0)) {
        bool1 = bool2;
        if (i <= b(f0))
          bool1 = true; 
      } 
      return bool1;
    }
    
    public p<?> b(T param1T) {
      return a(param1T, false);
    }
    
    public Integer c(T param1T) {
      return Integer.valueOf(b((f0)param1T.e(f0.p)));
    }
    
    public Integer d(T param1T) {
      return Integer.valueOf(c((f0)param1T.e(f0.p)));
    }
    
    public Integer e(T param1T) {
      return Integer.valueOf(d((f0)param1T.e(f0.p)));
    }
  }
  
  private static class c<T extends q<T>> implements z<T, Integer> {
    private final y0.d c;
    
    private c(y0.d param1d) {
      this.c = param1d;
    }
    
    private int a(f0 param1f0) {
      // Byte code:
      //   0: aload_0
      //   1: getfield c : Lnet/time4j/y0$d;
      //   4: invokestatic b : (Lnet/time4j/y0$d;)Z
      //   7: ifeq -> 18
      //   10: aload_1
      //   11: invokevirtual x : ()I
      //   14: istore_2
      //   15: goto -> 23
      //   18: aload_1
      //   19: invokevirtual r : ()I
      //   22: istore_2
      //   23: aload_0
      //   24: aload_1
      //   25: iconst_0
      //   26: invokespecial a : (Lnet/time4j/f0;I)I
      //   29: istore_3
      //   30: iload_3
      //   31: iload_2
      //   32: if_icmpgt -> 98
      //   35: iload_2
      //   36: iload_3
      //   37: isub
      //   38: bipush #7
      //   40: idiv
      //   41: iconst_1
      //   42: iadd
      //   43: istore #4
      //   45: iload #4
      //   47: bipush #53
      //   49: if_icmpge -> 74
      //   52: iload #4
      //   54: istore_3
      //   55: aload_0
      //   56: getfield c : Lnet/time4j/y0$d;
      //   59: invokestatic b : (Lnet/time4j/y0$d;)Z
      //   62: ifne -> 96
      //   65: iload #4
      //   67: istore_3
      //   68: iload #4
      //   70: iconst_5
      //   71: if_icmplt -> 96
      //   74: iload #4
      //   76: istore_3
      //   77: aload_0
      //   78: aload_1
      //   79: iconst_1
      //   80: invokespecial a : (Lnet/time4j/f0;I)I
      //   83: aload_0
      //   84: aload_1
      //   85: iconst_0
      //   86: invokespecial b : (Lnet/time4j/f0;I)I
      //   89: iadd
      //   90: iload_2
      //   91: if_icmpgt -> 96
      //   94: iconst_1
      //   95: istore_3
      //   96: iload_3
      //   97: ireturn
      //   98: aload_0
      //   99: aload_1
      //   100: iconst_m1
      //   101: invokespecial a : (Lnet/time4j/f0;I)I
      //   104: istore_3
      //   105: iload_2
      //   106: aload_0
      //   107: aload_1
      //   108: iconst_m1
      //   109: invokespecial b : (Lnet/time4j/f0;I)I
      //   112: iadd
      //   113: iload_3
      //   114: isub
      //   115: bipush #7
      //   117: idiv
      //   118: iconst_1
      //   119: iadd
      //   120: ireturn
    }
    
    private int a(f0 param1f0, int param1Int) {
      w0 w0 = c(param1f0, param1Int);
      y0 y0 = y0.d.a(this.c);
      param1Int = w0.a(y0);
      return (param1Int <= 8 - y0.f()) ? (2 - param1Int) : (9 - param1Int);
    }
    
    private p<?> a() {
      return y0.d.a(this.c).h();
    }
    
    private int b(f0 param1f0) {
      int j;
      if (y0.d.b(this.c)) {
        j = param1f0.x();
      } else {
        j = param1f0.r();
      } 
      int k = a(param1f0, 0);
      if (k <= j) {
        int i1 = a(param1f0, 1) + b(param1f0, 0);
        int n = k;
        int m = i1;
        if (i1 <= j)
          try {
            n = a(param1f0, 1);
            m = a(param1f0, 2);
            j = b(param1f0, 1);
            m += j;
          } catch (RuntimeException runtimeException) {
            m = i1 + 7;
            n = k;
          }  
        return (m - n) / 7;
      } 
      int i = a((f0)runtimeException, -1);
      return (k + b((f0)runtimeException, -1) - i) / 7;
    }
    
    private int b(f0 param1f0, int param1Int) {
      int i;
      if (y0.d.b(this.c))
        return b.b(param1f0.getYear() + param1Int) ? 366 : 365; 
      int j = param1f0.getYear();
      int k = param1f0.getMonth() + param1Int;
      if (k == 0) {
        i = 12;
        param1Int = j - 1;
      } else {
        param1Int = j;
        i = k;
        if (k == 13) {
          param1Int = j + 1;
          i = 1;
        } 
      } 
      return b.a(param1Int, i);
    }
    
    private w0 c(f0 param1f0, int param1Int) {
      int i;
      if (y0.d.b(this.c)) {
        param1Int = b.b(param1f0.getYear() + param1Int, 1, 1);
        return w0.g(param1Int);
      } 
      int j = param1f0.getYear();
      int k = param1f0.getMonth() + param1Int;
      if (k == 0) {
        i = 12;
        param1Int = j - 1;
      } else if (k == 13) {
        param1Int = j + 1;
        i = 1;
      } else {
        param1Int = j;
        i = k;
        if (k == 14) {
          i = 2;
          param1Int = j + 1;
        } 
      } 
      param1Int = b.b(param1Int, i, 1);
      return w0.g(param1Int);
    }
    
    private f0 d(f0 param1f0, int param1Int) {
      int i = a(param1f0);
      return (param1Int == i) ? param1f0 : param1f0.a(param1f0.y() + ((param1Int - i) * 7));
    }
    
    public p<?> a(T param1T) {
      return a();
    }
    
    public T a(T param1T, Integer param1Integer, boolean param1Boolean) {
      f0 f0 = (f0)param1T.e(f0.p);
      if (param1Integer != null && (param1Boolean || a(param1T, param1Integer)))
        return (T)param1T.b(f0.p, d(f0, param1Integer.intValue())); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Invalid value: ");
      stringBuilder.append(param1Integer);
      stringBuilder.append(" (context=");
      stringBuilder.append(param1T);
      stringBuilder.append(")");
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public boolean a(T param1T, Integer param1Integer) {
      boolean bool = false;
      if (param1Integer == null)
        return false; 
      int i = param1Integer.intValue();
      if (y0.d.b(this.c) && i >= 1 && i <= 52)
        return true; 
      if (!y0.d.b(this.c) || i == 53) {
        f0 f0 = (f0)param1T.e(f0.p);
        boolean bool1 = bool;
        if (i >= 1) {
          bool1 = bool;
          if (i <= b(f0))
            bool1 = true; 
        } 
        return bool1;
      } 
      return false;
    }
    
    public p<?> b(T param1T) {
      return a();
    }
    
    public Integer c(T param1T) {
      return Integer.valueOf(b((f0)param1T.e(f0.p)));
    }
    
    public Integer d(T param1T) {
      return Integer.valueOf(1);
    }
    
    public Integer e(T param1T) {
      return Integer.valueOf(a((f0)param1T.e(f0.p)));
    }
  }
  
  private class d extends a<Integer> {
    private static final long serialVersionUID = -5936254509996557266L;
    
    private final int category;
    
    d(String param1String, int param1Int) {
      super(param1String);
      this.category = param1Int;
    }
    
    private y0 h() {
      return y0.this;
    }
    
    private boolean i() {
      return (this.category >= 2);
    }
    
    private boolean j() {
      return (this.category % 2 == 0);
    }
    
    private Object readResolve() {
      StringBuilder stringBuilder;
      y0 y01 = h();
      int i = this.category;
      if (i != 0) {
        if (i != 1) {
          if (i != 2) {
            if (i == 3)
              return y01.a(); 
            stringBuilder = new StringBuilder();
            stringBuilder.append("Unknown category: ");
            stringBuilder.append(this.category);
            throw new InvalidObjectException(stringBuilder.toString());
          } 
          return stringBuilder.b();
        } 
        return stringBuilder.i();
      } 
      return stringBuilder.j();
    }
    
    public char a() {
      int i = this.category;
      return (i != 0) ? ((i != 1) ? super.a() : 'W') : 'w';
    }
    
    protected <T extends q<T>> z<T, Integer> a(x<T> param1x) {
      return (z<T, Integer>)(param1x.c(f0.p) ? (i() ? new y0.b<T>(this, null) : new y0.c<T>(this, null)) : null);
    }
    
    protected boolean a(e<?> param1e) {
      return h().equals(((d)param1e).h());
    }
    
    public Integer b() {
      byte b;
      if (j()) {
        b = 52;
      } else {
        b = 5;
      } 
      return Integer.valueOf(b);
    }
    
    public boolean c() {
      return true;
    }
    
    public boolean d() {
      return true;
    }
    
    protected p<?> e() {
      return f0.A;
    }
    
    public Class<Integer> getType() {
      return Integer.class;
    }
    
    public Integer q() {
      return Integer.valueOf(1);
    }
    
    public boolean s() {
      return false;
    }
  }
  
  private static class e<T extends q<T>> implements z<T, w0> {
    final y0.f c;
    
    private e(y0.f param1f) {
      this.c = param1f;
    }
    
    private p<?> f(T param1T) {
      return param1T.c(g0.q) ? g0.q : null;
    }
    
    public p<?> a(T param1T) {
      return f(param1T);
    }
    
    public T a(T param1T, w0 param1w0, boolean param1Boolean) {
      if (param1w0 != null) {
        f0 f02 = (f0)param1T.e(f0.p);
        long l = f02.y();
        w0 w01 = y0.a(l);
        if (param1w0 == w01)
          return param1T; 
        int i = w01.a(y0.f.a(this.c));
        f0 f01 = f02.a(l + param1w0.a(y0.f.a(this.c)) - i);
        return (T)param1T.b(f0.p, f01);
      } 
      throw new IllegalArgumentException("Missing weekday.");
    }
    
    public boolean a(T param1T, w0 param1w0) {
      if (param1w0 == null)
        return false; 
      try {
        a(param1T, param1w0, false);
        return true;
      } catch (RuntimeException runtimeException) {
        return false;
      } 
    }
    
    public p<?> b(T param1T) {
      return f(param1T);
    }
    
    public w0 c(T param1T) {
      f0 f0 = (f0)param1T.e(f0.p);
      int i = f0.w().a(y0.f.a(this.c));
      return (f0.q() + 7L - i > f0.I().d().a()) ? w0.g : this.c.b();
    }
    
    public w0 d(T param1T) {
      f0 f0 = (f0)param1T.e(f0.p);
      int i = f0.w().a(y0.f.a(this.c));
      return (f0.q() + 1L - i < f0.I().d().b()) ? w0.c : this.c.q();
    }
    
    public w0 e(T param1T) {
      return ((f0)param1T.e(f0.p)).w();
    }
  }
  
  private class f extends a<w0> implements c0<w0>, l<w0>, u<w0> {
    private static final long serialVersionUID = 1945670789283677398L;
    
    f() {
      super("LOCAL_DAY_OF_WEEK");
    }
    
    private t a(d param1d, m param1m) {
      return b.a((Locale)param1d.a(a.c, Locale.ROOT)).e((w)param1d.a(a.g, w.c), param1m);
    }
    
    private y0 h() {
      return y0.this;
    }
    
    private Object readResolve() {
      return y0.this.h();
    }
    
    public char a() {
      return 'e';
    }
    
    public int a(o param1o1, o param1o2) {
      int i = ((w0)param1o1.e(this)).a(y0.this);
      int j = ((w0)param1o2.e(this)).a(y0.this);
      return (i < j) ? -1 : ((i == j) ? 0 : 1);
    }
    
    public int a(w0 param1w0) {
      return param1w0.a(y0.this);
    }
    
    public int a(w0 param1w0, o param1o, d param1d) {
      return a(param1w0);
    }
    
    protected <T extends q<T>> z<T, w0> a(x<T> param1x) {
      return param1x.c(f0.p) ? new y0.e<T>(this, null) : null;
    }
    
    public w0 a(CharSequence param1CharSequence, ParsePosition param1ParsePosition, d param1d) {
      int i = param1ParsePosition.getIndex();
      m m = (m)param1d.a(a.h, m.c);
      w0 w02 = (w0)a(param1d, m).a(param1CharSequence, param1ParsePosition, getType(), param1d);
      w0 w01 = w02;
      if (w02 == null) {
        w01 = w02;
        if (((Boolean)param1d.a(a.k, Boolean.TRUE)).booleanValue()) {
          param1ParsePosition.setErrorIndex(-1);
          param1ParsePosition.setIndex(i);
          m m2 = m.c;
          m m1 = m2;
          if (m == m2)
            m1 = m.d; 
          w01 = (w0)a(param1d, m1).a(param1CharSequence, param1ParsePosition, getType(), param1d);
        } 
      } 
      return w01;
    }
    
    public void a(o param1o, Appendable param1Appendable, d param1d) {
      param1Appendable.append(a(param1d, (m)param1d.a(a.h, m.c)).a((Enum)param1o.e(this)));
    }
    
    protected boolean a(e<?> param1e) {
      return h().equals(((f)param1e).h());
    }
    
    public boolean a(q<?> param1q, int param1Int) {
      for (w0 w0 : w0.values()) {
        if (w0.a(y0.this) == param1Int) {
          param1q.b(this, w0);
          return true;
        } 
      } 
      return false;
    }
    
    public w0 b() {
      return y0.this.e().f(6);
    }
    
    public boolean d() {
      return true;
    }
    
    protected p<?> e() {
      return f0.x;
    }
    
    public Class<w0> getType() {
      return w0.class;
    }
    
    public w0 q() {
      return y0.this.e();
    }
    
    public boolean s() {
      return false;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/y0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */