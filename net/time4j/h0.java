package net.time4j;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.math.BigDecimal;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import net.time4j.c1.a;
import net.time4j.c1.c;
import net.time4j.c1.f;
import net.time4j.c1.g;
import net.time4j.d1.a0;
import net.time4j.d1.b0;
import net.time4j.d1.d;
import net.time4j.d1.d0;
import net.time4j.d1.f0;
import net.time4j.d1.g;
import net.time4j.d1.h0;
import net.time4j.d1.i0;
import net.time4j.d1.l0;
import net.time4j.d1.n0;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.r;
import net.time4j.d1.s;
import net.time4j.d1.u;
import net.time4j.d1.x;
import net.time4j.d1.y;
import net.time4j.d1.z;
import net.time4j.e1.a;
import net.time4j.e1.b;
import net.time4j.e1.c;
import net.time4j.e1.e;
import net.time4j.e1.h;
import net.time4j.g1.f;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.o;
import net.time4j.tz.p;

@c("iso8601")
public final class h0 extends l0<w, h0> implements a, g, h0<h0>, d0<w>, h {
  private static final h0 e = new h0(f0.f, g0.o);
  
  private static final h0 f = new h0(f0.g, (g0)g0.q.b());
  
  private static final Map<Object, p<?>> g;
  
  private static final i0<w, h0> h;
  
  private static final long serialVersionUID = 7458380065762437714L;
  
  private final transient f0 c;
  
  private final transient g0 d;
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    hashMap.put(f0.p, g0.q);
    hashMap.put(f0.r, f0.v);
    hashMap.put(f0.s, y0.n.j());
    hashMap.put(f0.t, f0.z);
    hashMap.put(f0.u, f0.w);
    hashMap.put(f0.v, f0.w);
    hashMap.put(f0.w, g0.q);
    hashMap.put(f0.x, g0.q);
    hashMap.put(f0.y, g0.q);
    hashMap.put(f0.z, g0.q);
    hashMap.put(f0.A, g0.q);
    hashMap.put(g0.s, g0.v);
    hashMap.put(g0.t, g0.y);
    hashMap.put(g0.u, g0.y);
    hashMap.put(g0.v, g0.y);
    hashMap.put(g0.w, g0.y);
    hashMap.put(g0.x, g0.y);
    hashMap.put(g0.y, g0.A);
    hashMap.put(g0.z, g0.A);
    hashMap.put(g0.A, g0.E);
    hashMap.put(g0.B, g0.E);
    g = Collections.unmodifiableMap(hashMap);
    i0.b<w, h0> b = i0.b.a(w.class, h0.class, new e(null), e, f);
    p<f0> p2 = f0.p;
    b.a(p2, d.a(p2), f.j);
    c<Integer, f0> c1 = f0.r;
    b.a(c1, d.a(c1), f.f);
    c1 = f0.s;
    b.a(c1, d.a(c1), v0.c);
    c0<l0> c02 = f0.t;
    b.a(c02, d.a(c02), f.g);
    c0<b0> c01 = f0.u;
    b.a(c01, d.a(c01), f.h);
    j0<Integer, f0> j02 = f0.v;
    b.a(j02, d.a(j02), f.h);
    j02 = f0.w;
    b.a(j02, d.a(j02), f.j);
    c0<w0> c0 = f0.x;
    b.a(c0, d.a(c0), f.j);
    j0<Integer, f0> j01 = f0.y;
    b.a(j01, d.a(j01), f.j);
    j01 = f0.z;
    b.a(j01, d.a(j01), f.j);
    d0 d01 = f0.A;
    b.a(d01, d.a(d01), f.i);
    p<g0> p1 = g0.q;
    b.a(p1, d.a(p1));
    b1<z> b11 = g0.s;
    b.a(b11, d.a(b11));
    c<Integer, g0> c = g0.t;
    b.a(c, d.a(c), g.c);
    c = g0.u;
    b.a(c, d.a(c), g.c);
    c = g0.v;
    b.a(c, d.a(c), g.c);
    c = g0.w;
    b.a(c, d.a(c), g.c);
    c = g0.x;
    b.a(c, d.a(c), g.c);
    c = g0.y;
    b.a(c, d.a(c), g.d);
    c = g0.z;
    b.a(c, d.a(c), g.d);
    c = g0.A;
    b.a(c, d.a(c), g.e);
    c = g0.B;
    b.a(c, d.a(c), g.e);
    c = g0.C;
    b.a(c, d.a(c), g.f);
    c = g0.D;
    b.a(c, d.a(c), g.g);
    c = g0.E;
    b.a(c, d.a(c), g.h);
    c = g0.F;
    b.a(c, d.a(c), g.f);
    j0<Long, g0> j0 = g0.G;
    b.a(j0, d.a(j0), g.g);
    j0 = g0.H;
    b.a(j0, d.a(j0), g.h);
    b1<BigDecimal> b1 = g0.I;
    b.a(b1, new c(b1));
    b1 = g0.J;
    b.a(b1, new c(b1));
    b1 = g0.K;
    b.a(b1, new c(b1));
    p<g> p = g0.L;
    b.a(p, d.a(p));
    a(b);
    b(b);
    c(b);
    h = b.a();
    n.a(new w[] { f.f, f.h, f.j, g.c, g.d, g.e, g.h });
  }
  
  private h0(f0 paramf0, g0 paramg0) {
    if (paramg0.getHour() == 24) {
      this.c = (f0)paramf0.b(1L, f.j);
      this.d = g0.o;
      return;
    } 
    if (paramf0 != null) {
      this.c = paramf0;
      this.d = paramg0;
      return;
    } 
    throw new NullPointerException("Missing date.");
  }
  
  public static i0<w, h0> B() {
    return h;
  }
  
  public static h0 a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    return a(f0.b(paramInt1, paramInt2, paramInt3), g0.a(paramInt4, paramInt5, paramInt6));
  }
  
  static h0 a(f paramf, p paramp) {
    int i;
    long l1;
    long l2 = paramf.b() + paramp.r();
    int j = paramf.a() + paramp.q();
    if (j < 0) {
      i = j + 1000000000;
      l1 = l2 - 1L;
    } else {
      l1 = l2;
      i = j;
      if (j >= 1000000000) {
        i = j - 1000000000;
        l1 = l2 + 1L;
      } 
    } 
    f0 f01 = f0.a(c.a(l1, 86400), a0.d);
    j = c.b(l1, 86400);
    int k = j / 60;
    return a(f01, g0.a(k / 60, k % 60, j % 60, i));
  }
  
  public static h0 a(f0 paramf0, g0 paramg0) {
    return new h0(paramf0, paramg0);
  }
  
  private static void a(i0.b<w, h0> paramb) {
    EnumSet<f> enumSet1 = EnumSet.range(f.c, f.h);
    EnumSet<f> enumSet2 = EnumSet.range(f.i, f.j);
    for (f f : f.values()) {
      EnumSet<f> enumSet;
      b b1 = new b(f);
      double d = f.b();
      if (f.compareTo(f.i) < 0) {
        enumSet = enumSet1;
      } else {
        enumSet = enumSet2;
      } 
      paramb.a(f, b1, d, enumSet);
    } 
  }
  
  private static void b(i0.b<w, h0> paramb) {
    for (g g1 : g.values())
      paramb.a(g1, new b(g1), g1.b(), EnumSet.allOf(g.class)); 
  }
  
  private static void c(i0.b<w, h0> paramb) {
    Iterator<s> iterator = f0.I().f().iterator();
    while (iterator.hasNext())
      paramb.a(iterator.next()); 
    iterator = g0.C().f().iterator();
    while (iterator.hasNext())
      paramb.a(iterator.next()); 
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 8);
  }
  
  public int a() {
    return this.d.a();
  }
  
  public int a(h0 paramh0) {
    return this.c.b((g)paramh0.c) ? 1 : (this.c.c((g)paramh0.c) ? -1 : this.d.a(paramh0.d));
  }
  
  public a0 a(k paramk) {
    return a(l.a(paramk));
  }
  
  public a0 a(l paraml) {
    if (paraml.f())
      return a(paraml.c(this.c, this.d)); 
    o o = paraml.e();
    long l1 = o.a(this.c, this.d, paraml);
    a0 a0 = a0.a(l1, this.d.a(), f.c);
    if (o == l.f)
      a0.a(l1, this); 
    return a0;
  }
  
  public a0 a(p paramp) {
    long l1 = c.b(this.c.y() + 730L, 86400L);
    long l2 = (this.d.getHour() * 3600);
    long l3 = (this.d.getMinute() * 60);
    long l4 = this.d.getSecond();
    int i = this.d.a();
    l2 = l1 + l2 + l3 + l4 - paramp.r();
    int j = i - paramp.q();
    if (j < 0) {
      i = j + 1000000000;
      l1 = l2 - 1L;
    } else {
      l1 = l2;
      i = j;
      if (j >= 1000000000) {
        i = j - 1000000000;
        l1 = l2 + 1L;
      } 
    } 
    return a0.a(l1, i, f.c);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof h0) {
      paramObject = paramObject;
      return (this.c.equals(((h0)paramObject).c) && this.d.equals(((h0)paramObject).d));
    } 
    return false;
  }
  
  public int getHour() {
    return this.d.getHour();
  }
  
  public int getMinute() {
    return this.d.getMinute();
  }
  
  public int getMonth() {
    return this.c.getMonth();
  }
  
  public int getSecond() {
    return this.d.getSecond();
  }
  
  public int getYear() {
    return this.c.getYear();
  }
  
  public int hashCode() {
    return this.c.hashCode() * 13 + this.d.hashCode() * 37;
  }
  
  public int r() {
    return this.c.r();
  }
  
  protected i0<w, h0> s() {
    return h;
  }
  
  protected h0 t() {
    return this;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.c.toString());
    stringBuilder.append(this.d.toString());
    return stringBuilder.toString();
  }
  
  public a0 v() {
    return a(p.m);
  }
  
  public f0 w() {
    return this.c;
  }
  
  public g0 x() {
    return this.d;
  }
  
  public f0 y() {
    return this.c;
  }
  
  private static class b implements n0<h0> {
    private final f a;
    
    private final g b;
    
    b(f param1f) {
      this.a = param1f;
      this.b = null;
    }
    
    b(g param1g) {
      this.a = null;
      this.b = param1g;
    }
    
    public long a(h0 param1h01, h0 param1h02) {
      g0 g01;
      g0 g02;
      long l;
      f f1 = this.a;
      if (f1 != null) {
        long l1 = f1.a(h0.b(param1h01), h0.b(param1h02));
        l = l1;
        if (l1 != 0L) {
          f1 = this.a;
          f f2 = f.j;
          boolean bool = true;
          if (f1 != f2 && ((f0)h0.b(param1h01).b(l1, this.a)).a((g)h0.b(param1h02)) != 0)
            bool = false; 
          l = l1;
          if (bool) {
            g01 = h0.c(param1h01);
            g02 = h0.c(param1h02);
            if (l1 > 0L && g01.b(g02))
              return l1 - 1L; 
            l = l1;
            if (l1 < 0L) {
              l = l1;
              if (g01.c(g02))
                return l1 + 1L; 
            } 
          } 
        } 
      } else {
        long l1;
        if (h0.b((h0)g01).b((g)h0.b((h0)g02)))
          return -a((h0)g02, (h0)g01); 
        l = h0.b((h0)g01).a((l0)h0.b((h0)g02), f.j);
        if (l == 0L)
          return this.b.a(h0.c((h0)g01), h0.c((h0)g02)); 
        if (this.b.compareTo(g.e) <= 0) {
          l1 = c.a(c.b(l, 86400L), c.c(((Integer)h0.c((h0)g02).e(g0.B)).longValue(), ((Integer)h0.c((h0)g01).e(g0.B)).longValue()));
          l = l1;
          if (h0.c((h0)g01).a() > h0.c((h0)g02).a())
            l = l1 - 1L; 
          l1 = l;
        } else {
          l1 = c.a(c.b(l, 86400000000000L), c.c(((Long)h0.c((h0)g02).e(g0.H)).longValue(), ((Long)h0.c((h0)g01).e(g0.H)).longValue()));
        } 
        l = l1;
        switch (h0.a.a[this.b.ordinal()]) {
          default:
            throw new UnsupportedOperationException(this.b.name());
          case 5:
            l = 1000L;
            l = l1 / l;
            break;
          case 4:
            l = 1000000L;
            l = l1 / l;
            break;
          case 2:
            l = 60L;
            l = l1 / l;
            break;
          case 1:
            l = 3600L;
            l = l1 / l;
            break;
          case 3:
          case 6:
            break;
        } 
      } 
      return l;
    }
    
    public h0 a(h0 param1h0, long param1Long) {
      f0 f0;
      g0 g0;
      if (this.a != null) {
        f0 f01 = (f0)h0.b(param1h0).b(param1Long, this.a);
        g0 = h0.c(param1h0);
        f0 = f01;
      } else {
        j j = h0.c((h0)f0).a(param1Long, this.b);
        f0 = (f0)h0.b((h0)f0).b(j.a(), f.j);
        g0 = j.b();
      } 
      return h0.a(f0, g0);
    }
  }
  
  private static class c extends d<BigDecimal> {
    c(p<BigDecimal> param1p) {
      super(param1p, null);
    }
    
    public h0 a(h0 param1h0, BigDecimal param1BigDecimal, boolean param1Boolean) {
      g0 g0;
      if (a(param1h0, param1BigDecimal)) {
        g0 = (g0)h0.c(param1h0).b(h0.d.a(this), param1BigDecimal);
        return h0.a(h0.b(param1h0), g0);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Out of range: ");
      stringBuilder.append(g0);
      throw new IllegalArgumentException(stringBuilder.toString());
    }
    
    public boolean a(h0 param1h0, BigDecimal param1BigDecimal) {
      boolean bool2 = false;
      if (param1BigDecimal == null)
        return false; 
      BigDecimal bigDecimal1 = (BigDecimal)h0.d.a(this).q();
      BigDecimal bigDecimal2 = (BigDecimal)h0.d.a(this).b();
      boolean bool1 = bool2;
      if (bigDecimal1.compareTo(param1BigDecimal) <= 0) {
        bool1 = bool2;
        if (param1BigDecimal.compareTo(bigDecimal2) <= 0)
          bool1 = true; 
      } 
      return bool1;
    }
  }
  
  private static class d<V> implements z<h0, V> {
    private final p<V> c;
    
    private d(p<V> param1p) {
      this.c = param1p;
    }
    
    static <V> d<V> a(p<V> param1p) {
      return new d<V>(param1p);
    }
    
    private long g(V param1V) {
      return ((Number)Number.class.cast(param1V)).longValue();
    }
    
    public p<?> a(h0 param1h0) {
      return (p)h0.A().get(this.c);
    }
    
    public h0 a(h0 param1h0, V param1V, boolean param1Boolean) {
      if (param1V != null) {
        if (param1V.equals(e(param1h0)))
          return param1h0; 
        if (param1Boolean) {
          w w = (w)h0.z().e(this.c);
          long l = g(e(param1h0));
          return (h0)param1h0.b(c.c(g(param1V), l), w);
        } 
        if (this.c.d())
          return h0.a((f0)h0.b(param1h0).b(this.c, param1V), h0.c(param1h0)); 
        if (this.c.s()) {
          StringBuilder stringBuilder1;
          if (Number.class.isAssignableFrom(this.c.getType())) {
            long l1 = g((V)this.c.q());
            long l2 = g((V)this.c.b());
            long l3 = g(param1V);
            if (l1 > l3 || l2 < l3) {
              stringBuilder1 = new StringBuilder();
              stringBuilder1.append("Out of range: ");
              stringBuilder1.append(param1V);
              throw new IllegalArgumentException(stringBuilder1.toString());
            } 
          } else if (this.c.equals(g0.q) && param1V.equals(g0.p)) {
            stringBuilder1 = new StringBuilder();
            stringBuilder1.append("Out of range: ");
            stringBuilder1.append(param1V);
            throw new IllegalArgumentException(stringBuilder1.toString());
          } 
          g0 g0 = (g0)h0.c((h0)stringBuilder1).b(this.c, param1V);
          return h0.a(h0.b((h0)stringBuilder1), g0);
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Missing rule for: ");
        stringBuilder.append(this.c.name());
        throw new r(stringBuilder.toString());
      } 
      throw new IllegalArgumentException("Missing element value.");
    }
    
    public boolean a(h0 param1h0, V param1V) {
      f0 f0;
      boolean bool = false;
      if (param1V == null)
        return false; 
      if (this.c.d()) {
        f0 = h0.b(param1h0);
        return f0.a(this.c, param1V);
      } 
      if (this.c.s()) {
        if (Number.class.isAssignableFrom(this.c.getType())) {
          long l1 = g((V)this.c.q());
          long l2 = g((V)this.c.b());
          long l3 = g(param1V);
          boolean bool1 = bool;
          if (l1 <= l3) {
            bool1 = bool;
            if (l2 >= l3)
              bool1 = true; 
          } 
          return bool1;
        } 
        if (this.c.equals(g0.q) && g0.p.equals(param1V))
          return false; 
        g0 g0 = h0.c((h0)f0);
        return g0.a(this.c, param1V);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing rule for: ");
      stringBuilder.append(this.c.name());
      r r = new r(stringBuilder.toString());
      throw r;
    }
    
    public p<?> b(h0 param1h0) {
      return (p)h0.A().get(this.c);
    }
    
    public V c(h0 param1h0) {
      if (this.c.d())
        return (V)h0.b(param1h0).b(this.c); 
      if (this.c.s())
        return (V)this.c.b(); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing rule for: ");
      stringBuilder.append(this.c.name());
      throw new r(stringBuilder.toString());
    }
    
    public V d(h0 param1h0) {
      if (this.c.d())
        return (V)h0.b(param1h0).d(this.c); 
      if (this.c.s())
        return (V)this.c.q(); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing rule for: ");
      stringBuilder.append(this.c.name());
      throw new r(stringBuilder.toString());
    }
    
    public V e(h0 param1h0) {
      f0 f0;
      if (this.c.d()) {
        f0 = h0.b(param1h0);
        return (V)f0.e(this.c);
      } 
      if (this.c.s()) {
        g0 g0 = h0.c((h0)f0);
        return (V)g0.e(this.c);
      } 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Missing rule for: ");
      stringBuilder.append(this.c.name());
      r r = new r(stringBuilder.toString());
      throw r;
    }
  }
  
  private static class e implements u<h0> {
    private e() {}
    
    public String a(y param1y, Locale param1Locale) {
      e e1 = e.f(param1y.a());
      return b.b(e1, e1, param1Locale);
    }
    
    public f0 a() {
      return f0.a;
    }
    
    public o a(h0 param1h0, d param1d) {
      return (o)param1h0;
    }
    
    public h0 a(q<?> param1q, d param1d, boolean param1Boolean1, boolean param1Boolean2) {
      p p;
      Object object1;
      boolean bool;
      if (param1q instanceof f) {
        if (param1d.b(a.d)) {
          k k = (k)param1d.a(a.d);
        } else {
          if (param1Boolean1) {
            p = p.m;
            return a0.a(f.class.cast(param1q)).b((k)p);
          } 
          throw new IllegalArgumentException("Missing timezone attribute for type conversion.");
        } 
        return a0.a(f.class.cast(param1q)).b((k)p);
      } 
      if (param1Boolean2 && param1q.a(g0.A) == 60) {
        bool = true;
      } else {
        bool = false;
      } 
      if (bool)
        param1q.a(g0.A, 59); 
      if (param1q.c(f0.p)) {
        object2 = param1q.e(f0.p);
      } else {
        object2 = f0.I().a(param1q, (d)p, param1Boolean1, false);
      } 
      f0 f0 = (f0)object2;
      if (f0 == null)
        return null; 
      if (param1q.c(g0.q)) {
        object1 = param1q.e(g0.q);
      } else {
        object2 = g0.C().a(param1q, (d)object1, param1Boolean1, false);
        object1 = object2;
        if (object2 == null) {
          object1 = object2;
          if (param1Boolean1)
            object1 = g0.o; 
        } 
      } 
      if (object1 == null)
        return null; 
      Object object2 = f0;
      if (param1q.c(x.e))
        object2 = f0.b(((Long)param1q.e(x.e)).longValue(), f.j); 
      if (bool && param1q.a((p)b0.c, Boolean.TRUE))
        param1q.b((p)b0.c, Boolean.TRUE); 
      return h0.a((f0)object2, (g0)object1);
    }
    
    public x<?> b() {
      return null;
    }
    
    public int c() {
      return f0.I().c();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */