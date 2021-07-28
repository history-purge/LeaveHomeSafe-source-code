package net.time4j.tz.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.time4j.c1.a;
import net.time4j.c1.b;
import net.time4j.c1.c;
import net.time4j.c1.g;
import net.time4j.d1.a0;
import net.time4j.tz.m;
import net.time4j.tz.p;
import net.time4j.tz.q;

public abstract class l implements m, Serializable {
  static {
    System.getProperty("line.separator");
  }
  
  static long a(int paramInt) {
    double d = paramInt;
    Double.isNaN(d);
    long l1 = (long)(d * 3.1556952E7D);
    return System.currentTimeMillis() / 1000L + l1;
  }
  
  static List<p> a(int paramInt1, int paramInt2) {
    p p1 = p.f(paramInt1);
    p p2 = p.f(paramInt2);
    ArrayList<p> arrayList = new ArrayList(2);
    arrayList.add(p1);
    arrayList.add(p2);
    return Collections.unmodifiableList(arrayList);
  }
  
  static m a(p paramp, List<q> paramList, List<d> paramList1, boolean paramBoolean1, boolean paramBoolean2) {
    q q;
    if (paramBoolean1) {
      paramList = new ArrayList<q>(paramList);
      paramList1 = new ArrayList<d>(paramList1);
      Collections.sort(paramList);
      Collections.sort(paramList1, k.c);
    } 
    int i = paramList.size();
    if (i == 0)
      return (m)(paramList1.isEmpty() ? new e(paramp) : new j(paramp, paramList1, false)); 
    p p1 = p.f(((q)paramList.get(0)).c());
    if (!paramBoolean2 || paramp.equals(p1)) {
      if (paramList1.isEmpty())
        return new a(paramList, false, paramBoolean2); 
      q = paramList.get(i - 1);
      long l1 = q.b() + 1L;
      long l2 = a(1);
      if (l1 < l2)
        paramList.addAll(j.a(q, paramList1, l1, l2)); 
      return new b(i, paramList, paramList1, false, paramBoolean2);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Initial offset ");
    stringBuilder.append(q);
    stringBuilder.append(" not equal ");
    stringBuilder.append("to previous offset of first transition: ");
    stringBuilder.append(p1);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  static List<p> b(int paramInt) {
    return Collections.singletonList(p.f(paramInt));
  }
  
  static long c(a parama, g paramg) {
    long l1 = b.d(parama.getYear(), parama.getMonth(), parama.r());
    return c.b(a0.d.a(l1, a0.e), 86400L) + (paramg.getHour() * 3600) + (paramg.getMinute() * 60) + paramg.getSecond();
  }
  
  public boolean isEmpty() {
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */