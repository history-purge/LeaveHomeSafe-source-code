package net.time4j;

import net.time4j.d1.f0;
import net.time4j.d1.g;
import net.time4j.d1.h;
import net.time4j.d1.l;
import net.time4j.d1.l0;
import net.time4j.d1.m;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.d1.r;
import net.time4j.tz.k;
import net.time4j.tz.l;

public final class r<C> implements o {
  private final l<?> c;
  
  private final m<?, ?> d;
  
  private final g0 e;
  
  private r(l<?> paraml, m<?, ?> paramm, g0 paramg0) {
    if (paramg0.getHour() == 24) {
      if (paraml == null) {
        this.c = null;
        this.d = paramm.b(h.a(1L));
      } else {
        this.c = paraml.a(h.a(1L));
        this.d = null;
      } 
      this.e = g0.H();
      return;
    } 
    this.c = paraml;
    this.d = paramm;
    this.e = paramg0;
  }
  
  public static <C extends l<C>> r<C> a(C paramC, g0 paramg0) {
    if (paramC != null)
      return new r<C>((l<?>)paramC, null, paramg0); 
    throw new NullPointerException("Missing date component.");
  }
  
  public static <C extends m<?, C>> r<C> a(C paramC, g0 paramg0) {
    if (paramC != null)
      return new r<C>(null, (m<?, ?>)paramC, paramg0); 
    throw new NullPointerException("Missing date component.");
  }
  
  private o b() {
    m<?, ?> m1;
    l<?> l2 = this.c;
    l<?> l1 = l2;
    if (l2 == null)
      m1 = this.d; 
    return (o)m1;
  }
  
  public int a(p<Integer> paramp) {
    return paramp.d() ? b().a(paramp) : this.e.a(paramp);
  }
  
  public C a() {
    m<?, ?> m1;
    l<?> l2 = this.c;
    l<?> l1 = l2;
    if (l2 == null)
      m1 = this.d; 
    return (C)m1;
  }
  
  public a0 a(l paraml, f0 paramf0) {
    m m1;
    l<?> l1 = this.c;
    if (l1 == null) {
      m1 = this.d.a(f0.class);
    } else {
      m1 = m1.a(f0.class);
    } 
    h0 h0 = ((f0)m1).a(this.e);
    int i = paramf0.a((g)h0.w(), paraml.d());
    i = ((Integer)this.e.e(g0.B)).intValue() - i;
    if (i >= 86400) {
      l0 = h0.a(1L, f.j);
    } else {
      l0 = h0;
      if (i < 0) {
        l0 = h0.b(1L, f.j);
      } else {
        return l0.a(paraml);
      } 
    } 
    l0 l0 = l0;
    return l0.a(paraml);
  }
  
  public <V> V b(p<V> paramp) {
    return (V)(paramp.d() ? b().b(paramp) : this.e.b(paramp));
  }
  
  public k c() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Timezone not available: ");
    stringBuilder.append(this);
    throw new r(stringBuilder.toString());
  }
  
  public boolean c(p<?> paramp) {
    return paramp.d() ? b().c(paramp) : this.e.c(paramp);
  }
  
  public <V> V d(p<V> paramp) {
    return (V)(paramp.d() ? b().d(paramp) : this.e.d(paramp));
  }
  
  public boolean d() {
    return false;
  }
  
  public <V> V e(p<V> paramp) {
    return (V)(paramp.d() ? b().e(paramp) : this.e.e(paramp));
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof r) {
      paramObject = r.class.cast(paramObject);
      if (!this.e.equals(((r)paramObject).e))
        return false; 
      l<?> l1 = this.c;
      return (l1 == null) ? ((((r)paramObject).c == null && this.d.equals(((r)paramObject).d))) : ((((r)paramObject).d == null && l1.equals(((r)paramObject).c)));
    } 
    return false;
  }
  
  public int hashCode() {
    int i;
    l<?> l1 = this.c;
    if (l1 == null) {
      i = this.d.hashCode();
    } else {
      i = l1.hashCode();
    } 
    return i + this.e.hashCode();
  }
  
  public String toString() {
    m<?, ?> m1;
    StringBuilder stringBuilder = new StringBuilder();
    l<?> l2 = this.c;
    l<?> l1 = l2;
    if (l2 == null)
      m1 = this.d; 
    stringBuilder.append(m1);
    stringBuilder.append(this.e);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */