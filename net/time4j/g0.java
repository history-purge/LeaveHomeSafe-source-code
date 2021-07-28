package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.time4j.c1.c;
import net.time4j.c1.d;
import net.time4j.c1.g;
import net.time4j.d1.d;
import net.time4j.d1.f0;
import net.time4j.d1.h0;
import net.time4j.d1.i0;
import net.time4j.d1.l0;
import net.time4j.d1.n0;
import net.time4j.d1.o;
import net.time4j.d1.o0;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.s;
import net.time4j.d1.u;
import net.time4j.d1.x;
import net.time4j.d1.y;
import net.time4j.d1.z;
import net.time4j.e1.b;
import net.time4j.e1.c;
import net.time4j.e1.e;
import net.time4j.e1.h;

@c("iso8601")
public final class g0 extends l0<v, g0> implements g, h0<g0>, h {
  public static final j0<Integer, g0> A;
  
  public static final j0<Integer, g0> B;
  
  public static final j0<Integer, g0> C;
  
  public static final j0<Integer, g0> D;
  
  public static final j0<Integer, g0> E;
  
  public static final j0<Integer, g0> F;
  
  public static final j0<Long, g0> G;
  
  public static final j0<Long, g0> H;
  
  public static final b1<BigDecimal> I;
  
  public static final b1<BigDecimal> J;
  
  public static final b1<BigDecimal> K;
  
  public static final p<g> L;
  
  private static final Map<String, Object> M;
  
  private static final z<g0, BigDecimal> N;
  
  private static final z<g0, BigDecimal> O;
  
  private static final z<g0, BigDecimal> P;
  
  private static final i0<v, g0> Q;
  
  static final char g;
  
  private static final BigDecimal h = new BigDecimal(60);
  
  private static final BigDecimal i = new BigDecimal(3600);
  
  private static final BigDecimal j = new BigDecimal(1000000000);
  
  private static final BigDecimal k = new BigDecimal("24");
  
  private static final BigDecimal l = new BigDecimal("23.999999999999999");
  
  private static final BigDecimal m = new BigDecimal("59.999999999999999");
  
  private static final g0[] n = new g0[25];
  
  static final g0 o;
  
  static final g0 p;
  
  static final p<g0> q;
  
  public static final t0 r;
  
  public static final b1<z> s = d.c;
  
  private static final long serialVersionUID = 2780881537313863339L;
  
  public static final c<Integer, g0> t = t.a("CLOCK_HOUR_OF_AMPM", false);
  
  public static final c<Integer, g0> u = t.a("CLOCK_HOUR_OF_DAY", true);
  
  public static final j0<Integer, g0> v = t.a("DIGITAL_HOUR_OF_AMPM", 3, 0, 11, 'K');
  
  public static final j0<Integer, g0> w = t.a("DIGITAL_HOUR_OF_DAY", 4, 0, 23, 'H');
  
  public static final j0<Integer, g0> x = t.a("HOUR_FROM_0_TO_24", 5, 0, 23, 'H');
  
  public static final j0<Integer, g0> y = t.a("MINUTE_OF_HOUR", 6, 0, 59, 'm');
  
  public static final j0<Integer, g0> z = t.a("MINUTE_OF_DAY", 7, 0, 1439, false);
  
  private final transient byte c;
  
  private final transient byte d;
  
  private final transient byte e;
  
  private final transient int f;
  
  static {
    A = t.a("SECOND_OF_MINUTE", 8, 0, 59, 's');
    B = t.a("SECOND_OF_DAY", 9, 0, 86399, false);
    C = t.a("MILLI_OF_SECOND", 10, 0, 999, false);
    D = t.a("MICRO_OF_SECOND", 11, 0, 999999, false);
    E = t.a("NANO_OF_SECOND", 12, 0, 999999999, 'S');
    F = t.a("MILLI_OF_DAY", 13, 0, 86399999, 'A');
    G = x.a("MICRO_OF_DAY", 0L, 86399999999L);
    H = x.a("NANO_OF_DAY", 0L, 86399999999999L);
    I = new l("DECIMAL_HOUR", l);
    J = new l("DECIMAL_MINUTE", m);
    K = new l("DECIMAL_SECOND", m);
    L = i0.f;
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    a((Map)hashMap, q);
    a((Map)hashMap, s);
    a((Map)hashMap, t);
    a((Map)hashMap, u);
    a((Map)hashMap, v);
    a((Map)hashMap, w);
    a((Map)hashMap, x);
    a((Map)hashMap, y);
    a((Map)hashMap, z);
    a((Map)hashMap, A);
    a((Map)hashMap, B);
    a((Map)hashMap, C);
    a((Map)hashMap, D);
    a((Map)hashMap, E);
    a((Map)hashMap, F);
    a((Map)hashMap, G);
    a((Map)hashMap, H);
    a((Map)hashMap, I);
    a((Map)hashMap, J);
    a((Map)hashMap, K);
    M = Collections.unmodifiableMap(hashMap);
    N = new b(I, k);
    O = new b(J, m);
    P = new b(K, m);
    i0.b<v, g0> b2 = i0.b.a(v.class, g0.class, new f(null), o, p);
    b2.a(q, new i(null));
    b2.a(s, new g(null));
    c<Integer, g0> c1 = t;
    b2.a(c1, new d(c1, 1, 12), g.c);
    c1 = u;
    b2.a(c1, new d(c1, 1, 24), g.c);
    c1 = v;
    b2.a(c1, new d(c1, 0, 11), g.c);
    c1 = w;
    b2.a(c1, new d(c1, 0, 23), g.c);
    c1 = x;
    b2.a(c1, new d(c1, 0, 24), g.c);
    c1 = y;
    b2.a(c1, new d(c1, 0, 59), g.d);
    c1 = z;
    b2.a(c1, new d(c1, 0, 1440), g.d);
    c1 = A;
    b2.a(c1, new d(c1, 0, 59), g.e);
    c1 = B;
    b2.a(c1, new d(c1, 0, 86400), g.e);
    c1 = C;
    b2.a(c1, new d(c1, 0, 999), g.f);
    c1 = D;
    b2.a(c1, new d(c1, 0, 999999), g.g);
    c1 = E;
    b2.a(c1, new d(c1, 0, 999999999), g.h);
    c1 = F;
    b2.a(c1, new d(c1, 0, 86400000), g.f);
    j0<Long, g0> j01 = G;
    b2.a(j01, new e(j01, 0L, 86400000000L), g.g);
    j01 = H;
    b2.a(j01, new e(j01, 0L, 86400000000000L), g.h);
    b2.a(I, N);
    b2.a(J, O);
    b2.a(K, P);
    b2.a(L, new h(null));
    a(b2);
    b(b2);
    Q = b2.a();
  }
  
  private g0(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    if (paramBoolean) {
      d(paramInt1);
      e(paramInt2);
      f(paramInt3);
      f(paramInt4);
      if (paramInt1 == 24 && (paramInt2 | paramInt3 | paramInt4) != 0)
        throw new IllegalArgumentException("T24:00:00 exceeded."); 
    } 
    this.c = (byte)paramInt1;
    this.d = (byte)paramInt2;
    this.e = (byte)paramInt3;
    this.f = paramInt4;
  }
  
  public static i0<v, g0> C() {
    return Q;
  }
  
  private long D() {
    return this.f + this.e * 1000000000L + this.d * 60L * 1000000000L + this.c * 3600L * 1000000000L;
  }
  
  private boolean E() {
    return ((this.d | this.e | this.f) == 0);
  }
  
  private boolean F() {
    return ((this.e | this.f) == 0);
  }
  
  public static g0 G() {
    return p;
  }
  
  public static g0 H() {
    return o;
  }
  
  static Object a(String paramString) {
    return M.get(paramString);
  }
  
  public static g0 a(int paramInt1, int paramInt2, int paramInt3) {
    return ((paramInt2 | paramInt3) == 0) ? g(paramInt1) : new g0(paramInt1, paramInt2, paramInt3, 0, true);
  }
  
  public static g0 a(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    return b(paramInt1, paramInt2, paramInt3, paramInt4, true);
  }
  
  public static g0 a(BigDecimal paramBigDecimal) {
    return (g0)N.a(null, paramBigDecimal, false);
  }
  
  private static void a(int paramInt, StringBuilder paramStringBuilder) {
    if (paramInt < 10)
      paramStringBuilder.append('0'); 
    paramStringBuilder.append(paramInt);
  }
  
  static void a(StringBuilder paramStringBuilder, int paramInt) {
    paramStringBuilder.append(g);
    String str = Integer.toString(paramInt);
    if (paramInt % 1000000 == 0) {
      paramInt = 3;
    } else if (paramInt % 1000 == 0) {
      paramInt = 6;
    } else {
      paramInt = 9;
    } 
    int i;
    for (i = str.length(); i < 9; i++)
      paramStringBuilder.append('0'); 
    i = 0;
    int j = str.length();
    while (i < paramInt + j - 9) {
      paramStringBuilder.append(str.charAt(i));
      i++;
    } 
  }
  
  private static void a(Map<String, Object> paramMap, p<?> paramp) {
    paramMap.put(paramp.name(), paramp);
  }
  
  private static void a(i0.b<v, g0> paramb) {
    for (s s : d.c().a(s.class)) {
      if (s.a(g0.class))
        paramb.a(s); 
    } 
    paramb.a(new k.c());
  }
  
  private static g0 b(int paramInt1, int paramInt2) {
    int i = paramInt1 / 1000;
    int j = i / 60;
    return a(j / 60, j % 60, i % 60, paramInt1 % 1000 * 1000000 + paramInt2);
  }
  
  private static g0 b(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean) {
    return ((paramInt2 | paramInt3 | paramInt4) == 0) ? (paramBoolean ? g(paramInt1) : n[paramInt1]) : new g0(paramInt1, paramInt2, paramInt3, paramInt4, paramBoolean);
  }
  
  private static g0 b(long paramLong, int paramInt) {
    int i = (int)(paramLong % 1000000L);
    int j = (int)(paramLong / 1000000L);
    int k = j / 60;
    return a(k / 60, k % 60, j % 60, i * 1000 + paramInt);
  }
  
  private static void b(i0.b<v, g0> paramb) {
    EnumSet<g> enumSet = EnumSet.allOf(g.class);
    for (g g1 : g.values())
      paramb.a(g1, new c(g1, null), g1.b(), enumSet); 
  }
  
  private static long c(long paramLong1, long paramLong2) {
    return (paramLong1 >= 0L) ? (paramLong1 / paramLong2) : ((paramLong1 + 1L) / paramLong2 - 1L);
  }
  
  public static g0 c(int paramInt1, int paramInt2) {
    return (paramInt2 == 0) ? g(paramInt1) : new g0(paramInt1, paramInt2, 0, 0, true);
  }
  
  private static long d(long paramLong1, long paramLong2) {
    long l;
    if (paramLong1 >= 0L) {
      l = paramLong1 / paramLong2;
    } else {
      l = (paramLong1 + 1L) / paramLong2 - 1L;
    } 
    Long.signum(paramLong2);
    return paramLong1 - paramLong2 * l;
  }
  
  private static void d(long paramLong) {
    if (paramLong >= 0L && paramLong <= 24L)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("HOUR_OF_DAY out of range: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static void e(long paramLong) {
    if (paramLong >= 0L && paramLong <= 59L)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("MINUTE_OF_HOUR out of range: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static void f(int paramInt) {
    if (paramInt >= 0 && paramInt < 1000000000)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("NANO_OF_SECOND out of range: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private static void f(long paramLong) {
    if (paramLong >= 0L && paramLong <= 59L)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SECOND_OF_MINUTE out of range: ");
    stringBuilder.append(paramLong);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static g0 g(int paramInt) {
    d(paramInt);
    return n[paramInt];
  }
  
  private static g0 g(long paramLong) {
    int i = (int)(paramLong % 1000000000L);
    int j = (int)(paramLong / 1000000000L);
    int k = j / 60;
    return a(k / 60, k % 60, j % 60, i);
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 2);
  }
  
  public int a() {
    return this.f;
  }
  
  public int a(g0 paramg0) {
    int j = this.c - paramg0.c;
    int i = j;
    if (j == 0) {
      j = this.d - paramg0.d;
      i = j;
      if (j == 0) {
        j = this.e - paramg0.e;
        i = j;
        if (j == 0)
          i = this.f - paramg0.f; 
      } 
    } 
    return (i < 0) ? -1 : ((i == 0) ? 0 : 1);
  }
  
  public j a(long paramLong, g paramg) {
    return c.a(this, paramLong, paramg);
  }
  
  public boolean b(g0 paramg0) {
    return (a(paramg0) > 0);
  }
  
  public boolean c(g0 paramg0) {
    return (a(paramg0) < 0);
  }
  
  public boolean d(g0 paramg0) {
    return (a(paramg0) == 0);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof g0) {
      paramObject = paramObject;
      return (this.c == ((g0)paramObject).c && this.d == ((g0)paramObject).d && this.e == ((g0)paramObject).e && this.f == ((g0)paramObject).f);
    } 
    return false;
  }
  
  boolean g(p<?> paramp) {
    return ((paramp == F && this.f % 1000000 != 0) || (paramp == x && !E()) || (paramp == z && !F()) || (paramp == B && this.f != 0) || (paramp == G && this.f % 1000 != 0));
  }
  
  public int getHour() {
    return this.c;
  }
  
  public int getMinute() {
    return this.d;
  }
  
  public int getSecond() {
    return this.e;
  }
  
  public int hashCode() {
    return this.c + this.d * 60 + this.e * 3600 + this.f * 37;
  }
  
  protected i0<v, g0> s() {
    return Q;
  }
  
  protected g0 t() {
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(19);
    stringBuilder.append('T');
    a(this.c, stringBuilder);
    if ((this.d | this.e | this.f) != 0) {
      stringBuilder.append(':');
      a(this.d, stringBuilder);
      if ((this.e | this.f) != 0) {
        stringBuilder.append(':');
        a(this.e, stringBuilder);
        int i = this.f;
        if (i != 0)
          a(stringBuilder, i); 
      } 
    } 
    return stringBuilder.toString();
  }
  
  public boolean v() {
    return (E() && this.c % 24 == 0);
  }
  
  static {
    byte b;
    if (Boolean.getBoolean("net.time4j.format.iso.decimal.dot")) {
      b = 46;
    } else {
      b = 44;
    } 
    g = b;
  }
  
  static {
    for (int i = 0; i <= 24; i++)
      n[i] = new g0(i, 0, 0, 0, false); 
    g0[] arrayOfG0 = n;
    o = arrayOfG0[0];
    p = arrayOfG0[24];
    p0 p0 = p0.c;
    q = p0;
    r = p0;
  }
  
  private static class b implements z<g0, BigDecimal> {
    private final p<BigDecimal> c;
    
    private final BigDecimal d;
    
    b(p<BigDecimal> param1p, BigDecimal param1BigDecimal) {
      this.c = param1p;
      this.d = param1BigDecimal;
    }
    
    private static int a(BigDecimal param1BigDecimal) {
      return Math.min(999999999, param1BigDecimal.movePointRight(9).setScale(0, RoundingMode.HALF_UP).intValue());
    }
    
    private static BigDecimal a(BigDecimal param1BigDecimal1, BigDecimal param1BigDecimal2) {
      return param1BigDecimal1.divide(param1BigDecimal2, 16, RoundingMode.FLOOR);
    }
    
    public p<?> a(g0 param1g0) {
      return null;
    }
    
    public g0 a(g0 param1g0, BigDecimal param1BigDecimal, boolean param1Boolean) {
      if (param1BigDecimal != null) {
        BigDecimal bigDecimal1;
        int i;
        int j;
        int k;
        int m;
        long l;
        BigDecimal bigDecimal2;
        p<BigDecimal> p1 = this.c;
        if (p1 == g0.I) {
          bigDecimal1 = param1BigDecimal.setScale(0, RoundingMode.FLOOR);
          BigDecimal bigDecimal3 = param1BigDecimal.subtract(bigDecimal1).multiply(g0.z());
          bigDecimal2 = bigDecimal3.setScale(0, RoundingMode.FLOOR);
          bigDecimal3 = bigDecimal3.subtract(bigDecimal2).multiply(g0.z());
          BigDecimal bigDecimal4 = bigDecimal3.setScale(0, RoundingMode.FLOOR);
          l = bigDecimal1.longValueExact();
          k = bigDecimal2.intValue();
          i = bigDecimal4.intValue();
          j = a(bigDecimal3.subtract(bigDecimal4));
        } else if (bigDecimal2 == g0.J) {
          bigDecimal2 = param1BigDecimal.setScale(0, RoundingMode.FLOOR);
          BigDecimal bigDecimal3 = param1BigDecimal.subtract(bigDecimal2).multiply(g0.z());
          BigDecimal bigDecimal4 = bigDecimal3.setScale(0, RoundingMode.FLOOR);
          i = bigDecimal4.intValue();
          j = a(bigDecimal3.subtract(bigDecimal4));
          long l1 = bigDecimal2.longValueExact();
          l = g0.i((g0)bigDecimal1);
          if (param1Boolean) {
            l += c.a(l1, 60);
            k = c.b(l1, 60);
          } else {
            g0.b(l1);
            k = (int)l1;
          } 
        } else if (bigDecimal2 == g0.K) {
          bigDecimal2 = param1BigDecimal.setScale(0, RoundingMode.FLOOR);
          j = a(param1BigDecimal.subtract(bigDecimal2));
          long l1 = bigDecimal2.longValueExact();
          l = g0.i((g0)bigDecimal1);
          k = g0.j((g0)bigDecimal1);
          if (param1Boolean) {
            i = c.b(l1, 60);
            l1 = k + c.a(l1, 60);
            l += c.a(l1, 60);
            k = c.b(l1, 60);
          } else {
            g0.c(l1);
            i = (int)l1;
          } 
        } else {
          throw new UnsupportedOperationException(bigDecimal2.name());
        } 
        if (param1Boolean) {
          int n = c.b(l, 24);
          m = n;
          if (l > 0L) {
            m = n;
            if ((n | k | i | j) == 0)
              return g0.p; 
          } 
        } else {
          if (l >= 0L && l <= 24L) {
            m = (int)l;
            return g0.a(m, k, i, j);
          } 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Value out of range: ");
          stringBuilder.append(param1BigDecimal);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        return g0.a(m, k, i, j);
      } 
      throw new IllegalArgumentException("Missing element value.");
    }
    
    public boolean a(g0 param1g0, BigDecimal param1BigDecimal) {
      boolean bool2 = false;
      boolean bool1 = false;
      if (param1BigDecimal == null)
        return false; 
      if (g0.i(param1g0) == 24) {
        p<BigDecimal> p1 = this.c;
        if (p1 == g0.J || p1 == g0.K) {
          if (BigDecimal.ZERO.compareTo(param1BigDecimal) == 0)
            bool1 = true; 
          return bool1;
        } 
      } 
      bool1 = bool2;
      if (BigDecimal.ZERO.compareTo(param1BigDecimal) <= 0) {
        bool1 = bool2;
        if (this.d.compareTo(param1BigDecimal) >= 0)
          bool1 = true; 
      } 
      return bool1;
    }
    
    public p<?> b(g0 param1g0) {
      return null;
    }
    
    public BigDecimal c(g0 param1g0) {
      if (g0.i(param1g0) == 24) {
        p<BigDecimal> p1 = this.c;
        if (p1 == g0.J || p1 == g0.K)
          return BigDecimal.ZERO; 
      } 
      return this.d;
    }
    
    public BigDecimal d(g0 param1g0) {
      return BigDecimal.ZERO;
    }
    
    public BigDecimal e(g0 param1g0) {
      p<BigDecimal> p1 = this.c;
      if (p1 == g0.I) {
        if (param1g0.equals(g0.o))
          return BigDecimal.ZERO; 
        if (g0.i(param1g0) == 24)
          return g0.w(); 
        bigDecimal3 = BigDecimal.valueOf(g0.i(param1g0)).add(a(BigDecimal.valueOf(g0.j(param1g0)), g0.z())).add(a(BigDecimal.valueOf(g0.k(param1g0)), g0.y()));
        bigDecimal2 = BigDecimal.valueOf(g0.e(param1g0));
        BigDecimal bigDecimal = g0.y();
        bigDecimal1 = bigDecimal3;
        bigDecimal3 = bigDecimal;
      } else if (bigDecimal2 == g0.J) {
        if (g0.f((g0)bigDecimal1))
          return BigDecimal.ZERO; 
        BigDecimal bigDecimal = BigDecimal.valueOf(g0.j((g0)bigDecimal1)).add(a(BigDecimal.valueOf(g0.k((g0)bigDecimal1)), g0.z()));
        bigDecimal2 = BigDecimal.valueOf(g0.e((g0)bigDecimal1));
        bigDecimal3 = g0.z();
        bigDecimal1 = bigDecimal;
      } else {
        UnsupportedOperationException unsupportedOperationException;
        if (bigDecimal2 == g0.K) {
          if (g0.g((g0)bigDecimal1))
            return BigDecimal.ZERO; 
          bigDecimal2 = BigDecimal.valueOf(g0.k((g0)bigDecimal1));
          bigDecimal3 = BigDecimal.valueOf(g0.e((g0)bigDecimal1));
          BigDecimal bigDecimal = g0.x();
          bigDecimal1 = bigDecimal2;
          bigDecimal2 = bigDecimal;
        } else {
          unsupportedOperationException = new UnsupportedOperationException(bigDecimal2.name());
          throw unsupportedOperationException;
        } 
        bigDecimal1 = unsupportedOperationException.add(a(bigDecimal3, bigDecimal2));
      } 
      BigDecimal bigDecimal4 = bigDecimal3.multiply(g0.x());
      BigDecimal bigDecimal3 = bigDecimal2;
      BigDecimal bigDecimal2 = bigDecimal4;
      BigDecimal bigDecimal1 = bigDecimal1.add(a(bigDecimal3, bigDecimal2));
    }
  }
  
  private static class c implements n0<g0> {
    private final g a;
    
    private c(g param1g) {
      this.a = param1g;
    }
    
    private static <R> R a(Class<R> param1Class, g param1g, g0 param1g0, long param1Long) {
      g0 g01;
      int i;
      int j;
      long l1;
      long l2;
      long l3;
      long l4;
      byte b1 = g0.j(param1g0);
      byte b2 = g0.k(param1g0);
      int k = g0.e(param1g0);
      switch (g0.a.a[param1g.ordinal()]) {
        default:
          throw new UnsupportedOperationException(param1g.name());
        case 6:
          l2 = c.a(g0.e(param1g0), param1Long);
          l3 = c.a(g0.k(param1g0), c.a(l2, 1000000000));
          l4 = c.a(g0.j(param1g0), c.a(l3, 60));
          l1 = c.a(g0.i(param1g0), c.a(l4, 60));
          i = c.b(l4, 60);
          j = c.b(l3, 60);
          k = c.b(l2, 1000000000);
          break;
        case 5:
          return a(param1Class, g.h, param1g0, c.b(param1Long, 1000L));
        case 4:
          return a(param1Class, g.h, param1g0, c.b(param1Long, 1000000L));
        case 3:
          l2 = c.a(g0.k(param1g0), param1Long);
          l3 = c.a(g0.j(param1g0), c.a(l2, 60));
          l1 = c.a(g0.i(param1g0), c.a(l3, 60));
          i = c.b(l3, 60);
          j = c.b(l2, 60);
          break;
        case 2:
          l2 = c.a(g0.j(param1g0), param1Long);
          l1 = c.a(g0.i(param1g0), c.a(l2, 60));
          i = c.b(l2, 60);
          break;
        case 1:
          l1 = c.a(g0.i(param1g0), param1Long);
          break;
      } 
      int m = c.b(l1, 24);
      if ((m | i | j | k) == 0) {
        if (param1Long > 0L && param1Class == g0.class) {
          g01 = g0.p;
        } else {
          g01 = g0.o;
        } 
      } else {
        g01 = g0.a(m, i, j, k);
      } 
      return (param1Class == g0.class) ? param1Class.cast(g01) : param1Class.cast(new j(c.a(l1, 24), g01));
    }
    
    private static j b(g0 param1g0, long param1Long, g param1g) {
      return (param1Long == 0L && g0.i(param1g0) < 24) ? new j(0L, param1g0) : a(j.class, param1g, param1g0, param1Long);
    }
    
    public long a(g0 param1g01, g0 param1g02) {
      long l2 = g0.h(param1g02);
      long l3 = g0.h(param1g01);
      switch (g0.a.a[this.a.ordinal()]) {
        default:
          throw new UnsupportedOperationException(this.a.name());
        case 6:
          l1 = 1L;
          return (l2 - l3) / l1;
        case 5:
          l1 = 1000L;
          return (l2 - l3) / l1;
        case 4:
          l1 = 1000000L;
          return (l2 - l3) / l1;
        case 3:
          l1 = 1000000000L;
          return (l2 - l3) / l1;
        case 2:
          l1 = 60000000000L;
          return (l2 - l3) / l1;
        case 1:
          break;
      } 
      long l1 = 3600000000000L;
      return (l2 - l3) / l1;
    }
    
    public g0 a(g0 param1g0, long param1Long) {
      return (param1Long == 0L) ? param1g0 : a(g0.class, this.a, param1g0, param1Long);
    }
  }
  
  private static class d implements z<g0, Integer> {
    private final p<Integer> c;
    
    private final int d;
    
    private final int e;
    
    private final int f;
    
    d(p<Integer> param1p, int param1Int1, int param1Int2) {
      byte b;
      this.c = param1p;
      if (param1p instanceof t) {
        b = ((t)param1p).h();
      } else {
        b = -1;
      } 
      this.d = b;
      this.e = param1Int1;
      this.f = param1Int2;
    }
    
    private g0 a(g0 param1g0, int param1Int) {
      p<Integer> p1 = this.c;
      if (p1 == g0.x || p1 == g0.w || p1 == g0.v)
        return (g0)param1g0.b(c.e(param1Int, ((Integer)param1g0.e(this.c)).intValue()), g.c); 
      if (p1 == g0.y)
        return (g0)param1g0.b(c.e(param1Int, g0.j(param1g0)), g.d); 
      if (p1 == g0.A)
        return (g0)param1g0.b(c.e(param1Int, g0.k(param1g0)), g.e); 
      j0<Integer, g0> j0 = g0.C;
      if (p1 == j0)
        return (g0)param1g0.b(c.e(param1Int, ((Integer)param1g0.e(j0)).intValue()), g.f); 
      j0 = g0.D;
      if (p1 == j0)
        return (g0)param1g0.b(c.e(param1Int, ((Integer)param1g0.e(j0)).intValue()), g.g); 
      if (p1 == g0.E)
        return (g0)param1g0.b(c.e(param1Int, g0.e(param1g0)), g.h); 
      if (p1 == g0.F) {
        int i = c.b(param1Int, 86400000);
        int j = g0.e(param1g0) % 1000000;
        return (i == 0 && j == 0) ? ((param1Int > 0) ? g0.p : g0.o) : g0.a(i, j);
      } 
      if (p1 == g0.z) {
        int i = c.b(param1Int, 1440);
        return (i == 0 && g0.g(param1g0)) ? ((param1Int > 0) ? g0.p : g0.o) : a(param1g0, Integer.valueOf(i), false);
      } 
      if (p1 == g0.B) {
        int i = c.b(param1Int, 86400);
        return (i == 0 && g0.e(param1g0) == 0) ? ((param1Int > 0) ? g0.p : g0.o) : a(param1g0, Integer.valueOf(i), false);
      } 
      throw new UnsupportedOperationException(p1.name());
    }
    
    private p<?> f(g0 param1g0) {
      switch (this.d) {
        default:
          return null;
        case 8:
        case 9:
          return g0.E;
        case 6:
        case 7:
          return g0.A;
        case 1:
        case 2:
        case 3:
        case 4:
        case 5:
          break;
      } 
      return g0.y;
    }
    
    private static boolean g(g0 param1g0) {
      return (g0.i(param1g0) < 12 || g0.i(param1g0) == 24);
    }
    
    public p<?> a(g0 param1g0) {
      return f(param1g0);
    }
    
    public g0 a(g0 param1g0, Integer param1Integer, boolean param1Boolean) {
      // Byte code:
      //   0: aload_2
      //   1: ifnull -> 501
      //   4: iload_3
      //   5: ifeq -> 18
      //   8: aload_0
      //   9: aload_1
      //   10: aload_2
      //   11: invokevirtual intValue : ()I
      //   14: invokespecial a : (Lnet/time4j/g0;I)Lnet/time4j/g0;
      //   17: areturn
      //   18: aload_0
      //   19: aload_1
      //   20: aload_2
      //   21: invokevirtual a : (Lnet/time4j/g0;Ljava/lang/Integer;)Z
      //   24: ifeq -> 468
      //   27: aload_1
      //   28: invokestatic i : (Lnet/time4j/g0;)B
      //   31: istore #10
      //   33: aload_1
      //   34: invokestatic j : (Lnet/time4j/g0;)B
      //   37: istore #9
      //   39: aload_1
      //   40: invokestatic k : (Lnet/time4j/g0;)B
      //   43: istore #7
      //   45: aload_1
      //   46: invokestatic e : (Lnet/time4j/g0;)I
      //   49: istore #8
      //   51: aload_2
      //   52: invokevirtual intValue : ()I
      //   55: istore #4
      //   57: iload #4
      //   59: istore #5
      //   61: aload_0
      //   62: getfield d : I
      //   65: tableswitch default -> 132, 1 -> 428, 2 -> 399, 3 -> 371, 4 -> 352, 5 -> 352, 6 -> 333, 7 -> 304, 8 -> 285, 9 -> 244, 10 -> 202, 11 -> 181, 12 -> 162, 13 -> 149
      //   132: new java/lang/UnsupportedOperationException
      //   135: dup
      //   136: aload_0
      //   137: getfield c : Lnet/time4j/d1/p;
      //   140: invokeinterface name : ()Ljava/lang/String;
      //   145: invokespecial <init> : (Ljava/lang/String;)V
      //   148: athrow
      //   149: iload #4
      //   151: aload_1
      //   152: invokestatic e : (Lnet/time4j/g0;)I
      //   155: ldc 1000000
      //   157: irem
      //   158: invokestatic a : (II)Lnet/time4j/g0;
      //   161: areturn
      //   162: iload #9
      //   164: istore #5
      //   166: iload #7
      //   168: istore #6
      //   170: iload #4
      //   172: istore #7
      //   174: iload #10
      //   176: istore #4
      //   178: goto -> 456
      //   181: iload #4
      //   183: sipush #1000
      //   186: imul
      //   187: istore #5
      //   189: aload_1
      //   190: invokestatic e : (Lnet/time4j/g0;)I
      //   193: sipush #1000
      //   196: irem
      //   197: istore #4
      //   199: goto -> 218
      //   202: iload #4
      //   204: ldc 1000000
      //   206: imul
      //   207: istore #5
      //   209: aload_1
      //   210: invokestatic e : (Lnet/time4j/g0;)I
      //   213: ldc 1000000
      //   215: irem
      //   216: istore #4
      //   218: iload #5
      //   220: iload #4
      //   222: iadd
      //   223: istore #4
      //   225: iload #9
      //   227: istore #5
      //   229: iload #7
      //   231: istore #6
      //   233: iload #4
      //   235: istore #7
      //   237: iload #10
      //   239: istore #4
      //   241: goto -> 456
      //   244: iload #4
      //   246: sipush #3600
      //   249: idiv
      //   250: istore #9
      //   252: iload #4
      //   254: sipush #3600
      //   257: irem
      //   258: istore #4
      //   260: iload #4
      //   262: bipush #60
      //   264: idiv
      //   265: istore #5
      //   267: iload #4
      //   269: bipush #60
      //   271: irem
      //   272: istore #6
      //   274: iload #8
      //   276: istore #7
      //   278: iload #9
      //   280: istore #4
      //   282: goto -> 456
      //   285: iload #9
      //   287: istore #5
      //   289: iload #4
      //   291: istore #6
      //   293: iload #8
      //   295: istore #7
      //   297: iload #10
      //   299: istore #4
      //   301: goto -> 456
      //   304: iload #4
      //   306: bipush #60
      //   308: idiv
      //   309: istore #9
      //   311: iload #4
      //   313: bipush #60
      //   315: irem
      //   316: istore #5
      //   318: iload #7
      //   320: istore #6
      //   322: iload #8
      //   324: istore #7
      //   326: iload #9
      //   328: istore #4
      //   330: goto -> 456
      //   333: iload #4
      //   335: istore #5
      //   337: iload #7
      //   339: istore #6
      //   341: iload #8
      //   343: istore #7
      //   345: iload #10
      //   347: istore #4
      //   349: goto -> 456
      //   352: iload #5
      //   354: istore #4
      //   356: iload #9
      //   358: istore #5
      //   360: iload #7
      //   362: istore #6
      //   364: iload #8
      //   366: istore #7
      //   368: goto -> 456
      //   371: iload #4
      //   373: istore #6
      //   375: aload_1
      //   376: invokestatic g : (Lnet/time4j/g0;)Z
      //   379: ifeq -> 389
      //   382: iload #4
      //   384: istore #5
      //   386: goto -> 352
      //   389: iload #6
      //   391: bipush #12
      //   393: iadd
      //   394: istore #5
      //   396: goto -> 352
      //   399: iload #4
      //   401: istore #5
      //   403: iload #4
      //   405: bipush #24
      //   407: if_icmpne -> 352
      //   410: iconst_0
      //   411: istore #4
      //   413: iload #9
      //   415: istore #5
      //   417: iload #7
      //   419: istore #6
      //   421: iload #8
      //   423: istore #7
      //   425: goto -> 456
      //   428: iload #4
      //   430: istore #5
      //   432: iload #4
      //   434: bipush #12
      //   436: if_icmpne -> 442
      //   439: iconst_0
      //   440: istore #5
      //   442: iload #5
      //   444: istore #6
      //   446: aload_1
      //   447: invokestatic g : (Lnet/time4j/g0;)Z
      //   450: ifeq -> 389
      //   453: goto -> 352
      //   456: iload #4
      //   458: iload #5
      //   460: iload #6
      //   462: iload #7
      //   464: invokestatic a : (IIII)Lnet/time4j/g0;
      //   467: areturn
      //   468: new java/lang/StringBuilder
      //   471: dup
      //   472: invokespecial <init> : ()V
      //   475: astore_1
      //   476: aload_1
      //   477: ldc 'Value out of range: '
      //   479: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   482: pop
      //   483: aload_1
      //   484: aload_2
      //   485: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
      //   488: pop
      //   489: new java/lang/IllegalArgumentException
      //   492: dup
      //   493: aload_1
      //   494: invokevirtual toString : ()Ljava/lang/String;
      //   497: invokespecial <init> : (Ljava/lang/String;)V
      //   500: athrow
      //   501: new java/lang/IllegalArgumentException
      //   504: dup
      //   505: ldc 'Missing element value.'
      //   507: invokespecial <init> : (Ljava/lang/String;)V
      //   510: astore_1
      //   511: goto -> 516
      //   514: aload_1
      //   515: athrow
      //   516: goto -> 514
    }
    
    public boolean a(g0 param1g0, Integer param1Integer) {
      boolean bool2 = false;
      boolean bool3 = false;
      boolean bool1 = false;
      if (param1Integer == null)
        return false; 
      int i = param1Integer.intValue();
      if (i >= this.e) {
        int j = this.f;
        if (i > j)
          return false; 
        if (i == j) {
          j = this.d;
          if (j != 5) {
            if (j != 7) {
              if (j != 9) {
                if (j == 13) {
                  if (g0.e(param1g0) % 1000000 == 0)
                    bool1 = true; 
                  return bool1;
                } 
              } else {
                bool1 = bool2;
                if (g0.e(param1g0) == 0)
                  bool1 = true; 
                return bool1;
              } 
            } else {
              return g0.g(param1g0);
            } 
          } else {
            return g0.f(param1g0);
          } 
        } 
        if (g0.i(param1g0) == 24) {
          switch (this.d) {
            default:
              return true;
            case 6:
            case 8:
            case 10:
            case 11:
            case 12:
              break;
          } 
          bool1 = bool3;
          if (i == 0)
            bool1 = true; 
          return bool1;
        } 
        return true;
      } 
      return false;
    }
    
    public p<?> b(g0 param1g0) {
      return f(param1g0);
    }
    
    public Integer c(g0 param1g0) {
      if (g0.i(param1g0) == 24) {
        boolean bool;
        switch (this.d) {
          case 6:
          case 8:
          case 10:
          case 11:
          case 12:
            bool = false;
            return Integer.valueOf(bool);
        } 
      } 
      if (param1g0.g(this.c)) {
        int j = this.f - 1;
        return Integer.valueOf(j);
      } 
      int i = this.f;
      return Integer.valueOf(i);
    }
    
    public Integer d(g0 param1g0) {
      return Integer.valueOf(this.e);
    }
    
    public Integer e(g0 param1g0) {
      int j = this.d;
      int i = 24;
      switch (j) {
        default:
          throw new UnsupportedOperationException(this.c.name());
        case 13:
          i = (int)(g0.h(param1g0) / 1000000L);
          return Integer.valueOf(i);
        case 12:
          i = g0.e(param1g0);
          return Integer.valueOf(i);
        case 11:
          i = g0.e(param1g0) / 1000;
          return Integer.valueOf(i);
        case 10:
          i = g0.e(param1g0) / 1000000;
          return Integer.valueOf(i);
        case 9:
          i = g0.i(param1g0) * 3600 + g0.j(param1g0) * 60;
          j = g0.k(param1g0);
          i += j;
          return Integer.valueOf(i);
        case 8:
          i = g0.k(param1g0);
          return Integer.valueOf(i);
        case 7:
          i = g0.i(param1g0) * 60;
          j = g0.j(param1g0);
          i += j;
          return Integer.valueOf(i);
        case 6:
          i = g0.j(param1g0);
          return Integer.valueOf(i);
        case 5:
          i = g0.i(param1g0);
          return Integer.valueOf(i);
        case 4:
          i = g0.i(param1g0) % 24;
          return Integer.valueOf(i);
        case 3:
          i = g0.i(param1g0) % 12;
          return Integer.valueOf(i);
        case 2:
          j = g0.i(param1g0) % 24;
          if (j != 0)
            i = j; 
          return Integer.valueOf(i);
        case 1:
          break;
      } 
      j = g0.i(param1g0) % 12;
      i = j;
      if (j == 0)
        i = 12; 
      return Integer.valueOf(i);
    }
  }
  
  private static class e implements z<g0, Long> {
    private final p<Long> c;
    
    private final long d;
    
    private final long e;
    
    e(p<Long> param1p, long param1Long1, long param1Long2) {
      this.c = param1p;
      this.d = param1Long1;
      this.e = param1Long2;
    }
    
    private g0 a(g0 param1g0, long param1Long) {
      if (this.c == g0.G) {
        long l1 = g0.a(param1Long, 86400000000L);
        int i = g0.e(param1g0) % 1000;
        return (l1 == 0L && i == 0 && param1Long > 0L) ? g0.p : g0.a(l1, i);
      } 
      long l = g0.a(param1Long, 86400000000000L);
      return (l == 0L && param1Long > 0L) ? g0.p : g0.a(l);
    }
    
    public p<?> a(g0 param1g0) {
      return null;
    }
    
    public g0 a(g0 param1g0, Long param1Long, boolean param1Boolean) {
      if (param1Long != null) {
        if (param1Boolean)
          return a(param1g0, param1Long.longValue()); 
        if (a(param1g0, param1Long)) {
          long l = param1Long.longValue();
          return (this.c == g0.G) ? g0.a(l, g0.e(param1g0) % 1000) : g0.a(l);
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Value out of range: ");
        stringBuilder.append(param1Long);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new IllegalArgumentException("Missing element value.");
    }
    
    public boolean a(g0 param1g0, Long param1Long) {
      boolean bool2 = false;
      boolean bool1 = false;
      if (param1Long == null)
        return false; 
      if (this.c == g0.G && param1Long.longValue() == this.e) {
        if (g0.e(param1g0) % 1000 == 0)
          bool1 = true; 
        return bool1;
      } 
      bool1 = bool2;
      if (this.d <= param1Long.longValue()) {
        bool1 = bool2;
        if (param1Long.longValue() <= this.e)
          bool1 = true; 
      } 
      return bool1;
    }
    
    public p<?> b(g0 param1g0) {
      return null;
    }
    
    public Long c(g0 param1g0) {
      if (this.c == g0.G && g0.e(param1g0) % 1000 != 0) {
        long l1 = this.e - 1L;
        return Long.valueOf(l1);
      } 
      long l = this.e;
      return Long.valueOf(l);
    }
    
    public Long d(g0 param1g0) {
      return Long.valueOf(this.d);
    }
    
    public Long e(g0 param1g0) {
      long l;
      if (this.c == g0.G) {
        l = g0.h(param1g0) / 1000L;
      } else {
        l = g0.h(param1g0);
      } 
      return Long.valueOf(l);
    }
  }
  
  private static class f implements u<g0> {
    private f() {}
    
    private static int a(q<?> param1q) {
      int i = param1q.a(g0.w);
      if (i != Integer.MIN_VALUE)
        return i; 
      i = param1q.a(g0.u);
      if (i == 24)
        return 0; 
      if (i != Integer.MIN_VALUE)
        return i; 
      if (param1q.c(g0.s)) {
        z z = (z)param1q.e(g0.s);
        int j = param1q.a(g0.t);
        if (j != Integer.MIN_VALUE) {
          i = j;
          if (j == 12)
            i = 0; 
          return (z == z.c) ? i : (i + 12);
        } 
        i = param1q.a(g0.v);
        if (i != Integer.MIN_VALUE)
          return (z == z.c) ? i : (i + 12); 
      } 
      return Integer.MIN_VALUE;
    }
    
    private static void a(q<?> param1q, String param1String) {
      if (param1q.a((p)o0.c, param1String))
        param1q.b((p)o0.c, param1String); 
    }
    
    private static g0 b(q<?> param1q) {
      // Byte code:
      //   0: aload_0
      //   1: getstatic net/time4j/g0.H : Lnet/time4j/j0;
      //   4: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   7: ifeq -> 85
      //   10: aload_0
      //   11: getstatic net/time4j/g0.H : Lnet/time4j/j0;
      //   14: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   17: checkcast java/lang/Long
      //   20: invokevirtual longValue : ()J
      //   23: lstore_3
      //   24: lload_3
      //   25: lconst_0
      //   26: lcmp
      //   27: iflt -> 46
      //   30: lload_3
      //   31: ldc2_w 86400000000000
      //   34: lcmp
      //   35: ifle -> 41
      //   38: goto -> 46
      //   41: lload_3
      //   42: invokestatic a : (J)Lnet/time4j/g0;
      //   45: areturn
      //   46: new java/lang/StringBuilder
      //   49: dup
      //   50: invokespecial <init> : ()V
      //   53: astore #6
      //   55: aload #6
      //   57: ldc 'NANO_OF_DAY out of range: '
      //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   62: pop
      //   63: aload #6
      //   65: lload_3
      //   66: invokevirtual append : (J)Ljava/lang/StringBuilder;
      //   69: pop
      //   70: aload #6
      //   72: invokevirtual toString : ()Ljava/lang/String;
      //   75: astore #6
      //   77: aload_0
      //   78: aload #6
      //   80: invokestatic a : (Lnet/time4j/d1/q;Ljava/lang/String;)V
      //   83: aconst_null
      //   84: areturn
      //   85: aload_0
      //   86: getstatic net/time4j/g0.G : Lnet/time4j/j0;
      //   89: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   92: istore #5
      //   94: iconst_0
      //   95: istore_2
      //   96: iconst_0
      //   97: istore_1
      //   98: iload #5
      //   100: ifeq -> 149
      //   103: aload_0
      //   104: getstatic net/time4j/g0.E : Lnet/time4j/j0;
      //   107: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   110: ifeq -> 131
      //   113: aload_0
      //   114: getstatic net/time4j/g0.E : Lnet/time4j/j0;
      //   117: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   120: checkcast java/lang/Integer
      //   123: invokevirtual intValue : ()I
      //   126: sipush #1000
      //   129: irem
      //   130: istore_1
      //   131: aload_0
      //   132: getstatic net/time4j/g0.G : Lnet/time4j/j0;
      //   135: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   138: checkcast java/lang/Long
      //   141: invokevirtual longValue : ()J
      //   144: iload_1
      //   145: invokestatic a : (JI)Lnet/time4j/g0;
      //   148: areturn
      //   149: aload_0
      //   150: getstatic net/time4j/g0.F : Lnet/time4j/j0;
      //   153: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   156: ifeq -> 357
      //   159: aload_0
      //   160: getstatic net/time4j/g0.E : Lnet/time4j/j0;
      //   163: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   166: ifeq -> 242
      //   169: aload_0
      //   170: getstatic net/time4j/g0.E : Lnet/time4j/j0;
      //   173: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   176: checkcast java/lang/Integer
      //   179: invokevirtual intValue : ()I
      //   182: istore_1
      //   183: iload_1
      //   184: iflt -> 204
      //   187: iload_1
      //   188: ldc 1000000000
      //   190: if_icmplt -> 196
      //   193: goto -> 204
      //   196: iload_1
      //   197: ldc 1000000
      //   199: irem
      //   200: istore_1
      //   201: goto -> 306
      //   204: new java/lang/StringBuilder
      //   207: dup
      //   208: invokespecial <init> : ()V
      //   211: astore #6
      //   213: ldc 'NANO_OF_SECOND out of range: '
      //   215: astore #7
      //   217: aload #6
      //   219: aload #7
      //   221: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
      //   224: pop
      //   225: aload #6
      //   227: iload_1
      //   228: invokevirtual append : (I)Ljava/lang/StringBuilder;
      //   231: pop
      //   232: aload #6
      //   234: invokevirtual toString : ()Ljava/lang/String;
      //   237: astore #6
      //   239: goto -> 77
      //   242: iload_2
      //   243: istore_1
      //   244: aload_0
      //   245: getstatic net/time4j/g0.D : Lnet/time4j/j0;
      //   248: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   251: ifeq -> 306
      //   254: aload_0
      //   255: getstatic net/time4j/g0.D : Lnet/time4j/j0;
      //   258: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   261: checkcast java/lang/Integer
      //   264: invokevirtual intValue : ()I
      //   267: istore_1
      //   268: iload_1
      //   269: iflt -> 290
      //   272: iload_1
      //   273: ldc 1000000
      //   275: if_icmplt -> 281
      //   278: goto -> 290
      //   281: iload_1
      //   282: sipush #1000
      //   285: irem
      //   286: istore_1
      //   287: goto -> 306
      //   290: new java/lang/StringBuilder
      //   293: dup
      //   294: invokespecial <init> : ()V
      //   297: astore #6
      //   299: ldc 'MICRO_OF_SECOND out of range: '
      //   301: astore #7
      //   303: goto -> 217
      //   306: aload_0
      //   307: getstatic net/time4j/g0.F : Lnet/time4j/j0;
      //   310: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   313: checkcast java/lang/Integer
      //   316: invokevirtual intValue : ()I
      //   319: istore_2
      //   320: iload_2
      //   321: iflt -> 339
      //   324: iload_2
      //   325: ldc 86400000
      //   327: if_icmple -> 333
      //   330: goto -> 339
      //   333: iload_2
      //   334: iload_1
      //   335: invokestatic a : (II)Lnet/time4j/g0;
      //   338: areturn
      //   339: new java/lang/StringBuilder
      //   342: dup
      //   343: invokespecial <init> : ()V
      //   346: astore #6
      //   348: ldc 'MILLI_OF_DAY out of range: '
      //   350: astore #7
      //   352: iload_2
      //   353: istore_1
      //   354: goto -> 217
      //   357: aload_0
      //   358: getstatic net/time4j/g0.B : Lnet/time4j/j0;
      //   361: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   364: ifeq -> 488
      //   367: aload_0
      //   368: getstatic net/time4j/g0.E : Lnet/time4j/j0;
      //   371: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   374: ifeq -> 394
      //   377: aload_0
      //   378: getstatic net/time4j/g0.E : Lnet/time4j/j0;
      //   381: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   384: checkcast java/lang/Integer
      //   387: invokevirtual intValue : ()I
      //   390: istore_1
      //   391: goto -> 457
      //   394: aload_0
      //   395: getstatic net/time4j/g0.D : Lnet/time4j/j0;
      //   398: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   401: ifeq -> 425
      //   404: aload_0
      //   405: getstatic net/time4j/g0.D : Lnet/time4j/j0;
      //   408: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   411: checkcast java/lang/Integer
      //   414: invokevirtual intValue : ()I
      //   417: sipush #1000
      //   420: imul
      //   421: istore_1
      //   422: goto -> 457
      //   425: aload_0
      //   426: getstatic net/time4j/g0.C : Lnet/time4j/j0;
      //   429: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   432: ifeq -> 455
      //   435: aload_0
      //   436: getstatic net/time4j/g0.C : Lnet/time4j/j0;
      //   439: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   442: checkcast java/lang/Integer
      //   445: invokevirtual intValue : ()I
      //   448: ldc 1000000
      //   450: imul
      //   451: istore_1
      //   452: goto -> 457
      //   455: iconst_0
      //   456: istore_1
      //   457: iconst_0
      //   458: iconst_0
      //   459: iconst_0
      //   460: iload_1
      //   461: invokestatic a : (IIII)Lnet/time4j/g0;
      //   464: astore #6
      //   466: getstatic net/time4j/g0.B : Lnet/time4j/j0;
      //   469: astore #7
      //   471: aload #6
      //   473: aload #7
      //   475: aload_0
      //   476: aload #7
      //   478: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   481: invokevirtual b : (Lnet/time4j/d1/p;Ljava/lang/Object;)Lnet/time4j/d1/q;
      //   484: checkcast net/time4j/g0
      //   487: areturn
      //   488: aload_0
      //   489: getstatic net/time4j/g0.z : Lnet/time4j/j0;
      //   492: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   495: ifeq -> 648
      //   498: aload_0
      //   499: getstatic net/time4j/g0.E : Lnet/time4j/j0;
      //   502: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   505: ifeq -> 525
      //   508: aload_0
      //   509: getstatic net/time4j/g0.E : Lnet/time4j/j0;
      //   512: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   515: checkcast java/lang/Integer
      //   518: invokevirtual intValue : ()I
      //   521: istore_1
      //   522: goto -> 588
      //   525: aload_0
      //   526: getstatic net/time4j/g0.D : Lnet/time4j/j0;
      //   529: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   532: ifeq -> 556
      //   535: aload_0
      //   536: getstatic net/time4j/g0.D : Lnet/time4j/j0;
      //   539: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   542: checkcast java/lang/Integer
      //   545: invokevirtual intValue : ()I
      //   548: sipush #1000
      //   551: imul
      //   552: istore_1
      //   553: goto -> 588
      //   556: aload_0
      //   557: getstatic net/time4j/g0.C : Lnet/time4j/j0;
      //   560: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   563: ifeq -> 586
      //   566: aload_0
      //   567: getstatic net/time4j/g0.C : Lnet/time4j/j0;
      //   570: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   573: checkcast java/lang/Integer
      //   576: invokevirtual intValue : ()I
      //   579: ldc 1000000
      //   581: imul
      //   582: istore_1
      //   583: goto -> 588
      //   586: iconst_0
      //   587: istore_1
      //   588: aload_0
      //   589: getstatic net/time4j/g0.A : Lnet/time4j/j0;
      //   592: invokevirtual c : (Lnet/time4j/d1/p;)Z
      //   595: ifeq -> 615
      //   598: aload_0
      //   599: getstatic net/time4j/g0.A : Lnet/time4j/j0;
      //   602: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   605: checkcast java/lang/Integer
      //   608: invokevirtual intValue : ()I
      //   611: istore_2
      //   612: goto -> 617
      //   615: iconst_0
      //   616: istore_2
      //   617: iconst_0
      //   618: iconst_0
      //   619: iload_2
      //   620: iload_1
      //   621: invokestatic a : (IIII)Lnet/time4j/g0;
      //   624: astore #6
      //   626: getstatic net/time4j/g0.z : Lnet/time4j/j0;
      //   629: astore #7
      //   631: aload #6
      //   633: aload #7
      //   635: aload_0
      //   636: aload #7
      //   638: invokevirtual e : (Lnet/time4j/d1/p;)Ljava/lang/Object;
      //   641: invokevirtual b : (Lnet/time4j/d1/p;Ljava/lang/Object;)Lnet/time4j/d1/q;
      //   644: checkcast net/time4j/g0
      //   647: areturn
      //   648: aconst_null
      //   649: areturn
    }
    
    public String a(y param1y, Locale param1Locale) {
      return b.b(e.f(param1y.a()), param1Locale);
    }
    
    public f0 a() {
      return f0.a;
    }
    
    public o a(g0 param1g0, d param1d) {
      return (o)param1g0;
    }
    
    public g0 a(q<?> param1q, d param1d, boolean param1Boolean1, boolean param1Boolean2) {
      if (param1q instanceof net.time4j.c1.f)
        return ((h0)h0.B().a(param1q, param1d, param1Boolean1, param1Boolean2)).x(); 
      if (param1q.c(g0.q))
        return (g0)param1q.e(g0.q); 
      if (param1q.c(g0.I))
        return g0.a((BigDecimal)param1q.e(g0.I)); 
      int i = param1q.a(g0.x);
      int j = i;
      if (i == Integer.MIN_VALUE) {
        i = a(param1q);
        if (i == Integer.MIN_VALUE)
          return b(param1q); 
        j = i;
        if (i == 24) {
          j = i;
          if (!param1Boolean1) {
            String str1 = "Time 24:00 not allowed, use lax mode or element HOUR_FROM_0_TO_24 instead.";
            a(param1q, str1);
            return null;
          } 
        } 
      } 
      if (param1q.c(g0.J))
        return (g0)g0.A().a(g0.g(j), param1q.e(g0.J), false); 
      i = param1q.a(g0.y);
      int k = i;
      if (i == Integer.MIN_VALUE)
        k = 0; 
      if (param1q.c(g0.K))
        return (g0)g0.B().a(g0.c(j, k), param1q.e(g0.K), false); 
      i = param1q.a(g0.A);
      int m = i;
      if (i == Integer.MIN_VALUE)
        m = 0; 
      i = param1q.a(g0.E);
      if (i == Integer.MIN_VALUE) {
        int n = param1q.a(g0.D);
        if (n == Integer.MIN_VALUE) {
          n = param1q.a(g0.C);
          if (n == Integer.MIN_VALUE) {
            i = 0;
          } else {
            i = 1000000;
            i = c.d(n, i);
          } 
        } else {
          i = 1000;
          i = c.d(n, i);
        } 
      } 
      if (param1Boolean1) {
        long l2 = c.a(c.b(c.a(c.a(c.b(j, 3600L), c.b(k, 60L)), m), 1000000000L), i);
        long l1 = g0.a(l2, 86400000000000L);
        l2 = g0.b(l2, 86400000000000L);
        if (l2 != 0L && param1q.a(x.e, l2))
          param1q.b(x.e, l2); 
        return (l1 == 0L && l2 > 0L) ? g0.p : g0.a(l1);
      } 
      if ((j >= 0 && k >= 0 && m >= 0 && i >= 0 && j == 24 && (k | m | i) == 0) || (j < 24 && k <= 59 && m <= 59 && i <= 1000000000))
        return g0.a(j, k, m, i, false); 
      String str = "Time component out of range.";
      a(param1q, str);
      return null;
    }
    
    public x<?> b() {
      return null;
    }
    
    public int c() {
      return f0.I().c();
    }
  }
  
  private static class g implements z<g0, z> {
    private g() {}
    
    public p<?> a(g0 param1g0) {
      return g0.v;
    }
    
    public g0 a(g0 param1g0, z param1z, boolean param1Boolean) {
      byte b;
      if (g0.i(param1g0) == 24) {
        b = 0;
      } else {
        b = g0.i(param1g0);
      } 
      if (param1z != null) {
        int i;
        if (param1z == z.c) {
          i = b;
          if (b >= 12)
            i = b - 12; 
        } else {
          i = b;
          if (param1z == z.d) {
            i = b;
            if (b < 12)
              i = b + 12; 
          } 
        } 
        return g0.a(i, g0.j(param1g0), g0.k(param1g0), g0.e(param1g0));
      } 
      throw new IllegalArgumentException("Missing am/pm-value.");
    }
    
    public boolean a(g0 param1g0, z param1z) {
      return (param1z != null);
    }
    
    public p<?> b(g0 param1g0) {
      return g0.v;
    }
    
    public z c(g0 param1g0) {
      return z.d;
    }
    
    public z d(g0 param1g0) {
      return z.c;
    }
    
    public z e(g0 param1g0) {
      return z.f(g0.i(param1g0));
    }
  }
  
  private static class h implements z<g0, g> {
    private h() {}
    
    public p<?> a(g0 param1g0) {
      return null;
    }
    
    public g0 a(g0 param1g0, g param1g, boolean param1Boolean) {
      if (param1g != null) {
        if (param1g.ordinal() >= e(param1g0).ordinal())
          return param1g0; 
        switch (g0.a.a[param1g.ordinal()]) {
          default:
            throw new UnsupportedOperationException(param1g.name());
          case 6:
            return param1g0;
          case 5:
            return g0.a(g0.i(param1g0), g0.j(param1g0), g0.k(param1g0), g0.e(param1g0) / 1000 * 1000);
          case 4:
            return g0.a(g0.i(param1g0), g0.j(param1g0), g0.k(param1g0), g0.e(param1g0) / 1000000 * 1000000);
          case 3:
            return g0.a(g0.i(param1g0), g0.j(param1g0), g0.k(param1g0));
          case 2:
            return g0.c(g0.i(param1g0), g0.j(param1g0));
          case 1:
            break;
        } 
        return g0.g(g0.i(param1g0));
      } 
      throw new IllegalArgumentException("Missing precision value.");
    }
    
    public boolean a(g0 param1g0, g param1g) {
      return (param1g != null);
    }
    
    public p<?> b(g0 param1g0) {
      return null;
    }
    
    public g c(g0 param1g0) {
      return g.h;
    }
    
    public g d(g0 param1g0) {
      return g.c;
    }
    
    public g e(g0 param1g0) {
      return (g0.e(param1g0) != 0) ? ((g0.e(param1g0) % 1000000 == 0) ? g.f : ((g0.e(param1g0) % 1000 == 0) ? g.g : g.h)) : ((g0.k(param1g0) != 0) ? g.e : ((g0.j(param1g0) != 0) ? g.d : g.c));
    }
  }
  
  private static class i implements z<g0, g0> {
    private i() {}
    
    public p<?> a(g0 param1g0) {
      return null;
    }
    
    public g0 a(g0 param1g01, g0 param1g02, boolean param1Boolean) {
      if (param1g02 != null)
        return param1g02; 
      throw new IllegalArgumentException("Missing time value.");
    }
    
    public boolean a(g0 param1g01, g0 param1g02) {
      return (param1g02 != null);
    }
    
    public p<?> b(g0 param1g0) {
      return null;
    }
    
    public g0 c(g0 param1g0) {
      return g0.p;
    }
    
    public g0 d(g0 param1g0) {
      return g0.o;
    }
    
    public g0 e(g0 param1g0) {
      return param1g0;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */