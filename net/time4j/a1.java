package net.time4j;

import net.time4j.c1.f;
import net.time4j.d1.o;
import net.time4j.d1.p;
import net.time4j.g1.f;
import net.time4j.g1.g;
import net.time4j.tz.k;
import net.time4j.tz.l;
import net.time4j.tz.p;

public final class a1 implements o, g {
  private final a0 c;
  
  private final l d;
  
  private final transient h0 e;
  
  private a1(a0 parama0, l paraml) {
    this.d = paraml;
    p p = paraml.b((f)parama0);
    if (!parama0.v() || (p.q() == 0 && p.d() % 60 == 0)) {
      this.c = parama0;
      this.e = h0.a((f)parama0, p);
      return;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Leap second can only be represented  with timezone-offset in full minutes: ");
    stringBuilder.append(p);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  static a1 a(a0 parama0, l paraml) {
    return new a1(parama0, paraml);
  }
  
  public int a() {
    return this.c.a();
  }
  
  public int a(p<Integer> paramp) {
    if (this.c.v() && paramp == g0.A)
      return 60; 
    int j = this.e.a(paramp);
    int i = j;
    if (j == Integer.MIN_VALUE)
      i = this.c.a(paramp); 
    return i;
  }
  
  public long a(f paramf) {
    return this.c.a(paramf);
  }
  
  public int b(f paramf) {
    return this.c.b(paramf);
  }
  
  public long b() {
    return this.c.b();
  }
  
  public <V> V b(p<V> paramp) {
    a0 a01;
    if (this.e.c(paramp)) {
      h0 h01 = this.e;
    } else {
      a01 = this.c;
    } 
    Object object = a01.b(paramp);
    if (paramp == g0.A && this.e.getYear() >= 1972) {
      h0 h01 = (h0)this.e.b(paramp, object);
      if (!this.d.d(h01, h01) && h01.a(this.d).a(1L, m0.c).v())
        return paramp.getType().cast(Integer.valueOf(60)); 
    } 
    return (V)object;
  }
  
  public k c() {
    return this.d.d();
  }
  
  public boolean c(p<?> paramp) {
    return (this.e.c(paramp) || this.c.c(paramp));
  }
  
  public <V> V d(p<V> paramp) {
    if (this.e.c(paramp)) {
      h0 h01 = this.e;
      return (V)h01.d(paramp);
    } 
    a0 a01 = this.c;
    return (V)a01.d(paramp);
  }
  
  public boolean d() {
    return true;
  }
  
  public <V> V e(p<V> paramp) {
    return (V)((this.c.v() && paramp == g0.A) ? (Object)paramp.getType().cast(Integer.valueOf(60)) : (this.e.c(paramp) ? this.e.e(paramp) : this.c.e(paramp)));
  }
  
  public p e() {
    return this.d.b((f)this.c);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof a1) {
      paramObject = paramObject;
      return (this.c.equals(((a1)paramObject).c) && this.d.equals(((a1)paramObject).d));
    } 
    return false;
  }
  
  public boolean f() {
    return this.c.v();
  }
  
  public int hashCode() {
    return this.c.hashCode() ^ this.d.hashCode();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(40);
    stringBuilder.append(this.e.w());
    stringBuilder.append('T');
    int i = this.e.getHour();
    if (i < 10)
      stringBuilder.append('0'); 
    stringBuilder.append(i);
    stringBuilder.append(':');
    i = this.e.getMinute();
    if (i < 10)
      stringBuilder.append('0'); 
    stringBuilder.append(i);
    stringBuilder.append(':');
    if (f()) {
      stringBuilder.append("60");
    } else {
      i = this.e.getSecond();
      if (i < 10)
        stringBuilder.append('0'); 
      stringBuilder.append(i);
    } 
    i = this.e.a();
    if (i != 0)
      g0.a(stringBuilder, i); 
    stringBuilder.append(e());
    k k = c();
    if (!(k instanceof p)) {
      stringBuilder.append('[');
      stringBuilder.append(k.a());
      stringBuilder.append(']');
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */