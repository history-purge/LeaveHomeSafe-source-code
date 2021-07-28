package net.time4j.tz;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import net.time4j.c1.b;
import net.time4j.c1.c;
import net.time4j.c1.g;

final class n implements o, Serializable {
  private static final Map<Integer, n> e = new HashMap<Integer, n>();
  
  private static final long serialVersionUID = 1790434289322009750L;
  
  private final transient b c;
  
  private final transient g d;
  
  static {
    for (b b1 : b.values()) {
      for (g g1 : g.values()) {
        n n1 = new n(b1, g1);
        int i = b1.ordinal();
        int j = g1.ordinal();
        e.put(Integer.valueOf(i * 2 + j), n1);
      } 
    } 
  }
  
  private n(b paramb, g paramg) {
    this.c = paramb;
    this.d = paramg;
  }
  
  private static long a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    return c.b(c.c(b.d(paramInt1, paramInt2, paramInt3), 40587L), 86400L) + (paramInt4 * 3600 + paramInt5 * 60 + paramInt6);
  }
  
  static n a(b paramb, g paramg) {
    int i = paramb.ordinal();
    int j = paramg.ordinal();
    return e.get(Integer.valueOf(i * 2 + j));
  }
  
  private static void b(net.time4j.c1.a parama, g paramg, l paraml) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid local timestamp due to timezone transition: local-date=");
    stringBuilder.append(parama);
    stringBuilder.append(", local-time=");
    stringBuilder.append(paramg);
    stringBuilder.append(" [");
    stringBuilder.append(paraml.d().a());
    stringBuilder.append("]");
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 13);
  }
  
  int a() {
    return this.c.ordinal() * 2 + this.d.ordinal();
  }
  
  public long a(net.time4j.c1.a parama, g paramg, l paraml) {
    p p;
    GregorianCalendar gregorianCalendar;
    int i = parama.getYear();
    int j = parama.getMonth();
    int k = parama.r();
    int m = paramg.getHour();
    int i1 = paramg.getMinute();
    int i2 = paramg.getSecond();
    m m1 = paraml.c();
    if (m1 == null && this.d == g.d) {
      b b1 = this.c;
      if (b1 == b.c || b1 == b.e) {
        gregorianCalendar = new GregorianCalendar(TimeZone.getTimeZone(paraml.d().a()));
        gregorianCalendar.setGregorianChange(new Date(Long.MIN_VALUE));
        gregorianCalendar.set(14, 0);
        gregorianCalendar.set(i, j - 1, k, m, i1, i2);
        int i3 = gregorianCalendar.get(1);
        int i4 = gregorianCalendar.get(2) + 1;
        int i5 = gregorianCalendar.get(5);
        int i6 = gregorianCalendar.get(11);
        int i7 = gregorianCalendar.get(12);
        int i8 = gregorianCalendar.get(13);
        if (this.c != b.e || (i == i3 && j == i4 && k == i5 && m == i6 && i1 == i7 && i2 == i8)) {
          long l1 = a(i3, i4, i5, i6, i7, i8);
          p = paraml.c(parama, paramg);
          return l1 - p.r();
        } 
        b((net.time4j.c1.a)p, paramg, paraml);
        throw null;
      } 
    } 
    if (gregorianCalendar != null) {
      q q = gregorianCalendar.b((net.time4j.c1.a)p, paramg);
      if (q != null) {
        if (q.s()) {
          int i3 = a.a[this.c.ordinal()];
          if (i3 != 1) {
            if (i3 != 2) {
              if (i3 != 3)
                throw new UnsupportedOperationException(this.c.name()); 
              b((net.time4j.c1.a)p, paramg, paraml);
              throw null;
            } 
            return q.b();
          } 
          long l2 = a(i, j, k, m, i1, i2) + q.d();
          i = q.r();
          return l2 - i;
        } 
        if (q.t()) {
          long l3 = a(i, j, k, m, i1, i2);
          i = q.r();
          long l2 = l3;
          if (this.d == g.c) {
            i = q.c();
            l2 = l3;
          } 
          return l2 - i;
        } 
      } 
      long l1 = a(i, j, k, m, i1, i2);
      p = gregorianCalendar.a((net.time4j.c1.a)p, paramg).get(0);
      return l1 - p.r();
    } 
    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException("Timezone provider does not expose its transition history.");
    throw unsupportedOperationException;
  }
  
  public o a(g paramg) {
    return (paramg == this.d) ? this : this.c.a(paramg);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(32);
    stringBuilder.append(n.class.getName());
    stringBuilder.append(":[gap=");
    stringBuilder.append(this.c);
    stringBuilder.append(",overlap=");
    stringBuilder.append(this.d);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */