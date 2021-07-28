package net.time4j.tz.model;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import net.time4j.a0;
import net.time4j.c1.b;
import net.time4j.c1.c;
import net.time4j.c1.f;
import net.time4j.c1.g;
import net.time4j.d1.a0;
import net.time4j.tz.p;
import net.time4j.tz.q;

final class j extends l {
  private static final int g;
  
  private static final long serialVersionUID = 2456700806862862287L;
  
  private final transient q c;
  
  private final transient List<d> d;
  
  private final transient ConcurrentMap<Integer, List<q>> e = new ConcurrentHashMap<Integer, List<q>>();
  
  private final transient boolean f;
  
  static {
    long l1 = l.a(100);
    g = b.c(b.d(a0.e.a(l1, a0.d)));
  }
  
  j(p paramp, List<d> paramList, boolean paramBoolean) {
    this(new q(Long.MIN_VALUE, paramp.r(), paramp.r(), 0), paramList, paramBoolean);
  }
  
  j(q paramq, List<d> paramList, boolean paramBoolean) {
    if (!paramList.isEmpty()) {
      StringBuilder stringBuilder2;
      if (paramList.size() < 128) {
        d d;
        List<d> list1 = paramList;
        if (paramBoolean)
          list1 = new ArrayList<d>(paramList); 
        Collections.sort(list1, k.c);
        List<d> list2 = null;
        paramList = null;
        if (list1.size() > 1) {
          Iterator<d> iterator = list1.iterator();
          while (true) {
            list2 = paramList;
            if (iterator.hasNext()) {
              String str;
              d = iterator.next();
              if (paramList == null) {
                str = d.a();
                continue;
              } 
              if (str.equals(d.a()))
                continue; 
              throw new IllegalArgumentException("Rules with different calendar systems not permitted.");
            } 
            break;
          } 
        } 
        this.f = "iso8601".equals(d);
        if (paramq.b() == Long.MIN_VALUE) {
          if (paramq.a() == 0) {
            paramq = new q(((a0)a0.y().j()).b(), paramq.q(), paramq.q(), 0);
          } else {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Initial transition must not have any dst-offset: ");
            stringBuilder2.append(paramq);
            throw new IllegalArgumentException(stringBuilder2.toString());
          } 
        } else {
          q q1 = a(paramq.b(), paramq, list1);
          if (paramq.r() != q1.c()) {
            stringBuilder2 = new StringBuilder();
            stringBuilder2.append("Inconsistent model: ");
            stringBuilder2.append(paramq);
            stringBuilder2.append(" / ");
            stringBuilder2.append(list1);
            throw new IllegalArgumentException(stringBuilder2.toString());
          } 
        } 
        this.c = paramq;
        this.d = Collections.unmodifiableList(list1);
        long l1 = l.a(1);
        a(this.c, this.d, 0L, l1);
        return;
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Too many daylight saving rules: ");
      stringBuilder1.append(stringBuilder2);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Missing daylight saving rules.");
    throw illegalArgumentException;
  }
  
  private static int a(d paramd, int paramInt1, int paramInt2) {
    i i = paramd.c();
    int k = a.a[i.ordinal()];
    if (k != 1) {
      if (k != 2) {
        if (k == 3)
          return paramInt1 + paramInt2; 
        throw new UnsupportedOperationException(i.name());
      } 
      return paramInt1;
    } 
    return 0;
  }
  
  private static int a(d paramd, long paramLong) {
    return paramd.a(a0.e.a(c.a(paramLong, 86400), a0.d));
  }
  
  private List<q> a(net.time4j.c1.a parama) {
    return c(((d)this.d.get(0)).a(parama));
  }
  
  static List<q> a(q paramq, List<d> paramList, long paramLong1, long paramLong2) {
    long l1 = paramq.b();
    if (paramLong1 <= paramLong2) {
      if (paramLong2 <= l1 || paramLong1 == paramLong2)
        return Collections.emptyList(); 
      ArrayList<? extends q> arrayList = new ArrayList();
      int m = Integer.MIN_VALUE;
      int i = paramList.size();
      int k = 0;
      int n = paramq.q();
      while (true) {
        int i1;
        int i3 = k % i;
        d d1 = paramList.get(i3);
        d d2 = paramList.get((k - 1 + i) % i);
        int i2 = a(d1, n, d2.d());
        if (k == 0) {
          i1 = a(d1, Math.max(paramLong1, l1) + i2);
        } else {
          i1 = m;
          if (i3 == 0)
            i1 = m + 1; 
        } 
        long l2 = b(d1, i1, i2);
        k++;
        if (l2 >= paramLong2)
          return Collections.unmodifiableList(arrayList); 
        if (l2 >= paramLong1 && l2 > l1)
          arrayList.add(new q(l2, n + d2.d(), n + d1.d(), d1.d())); 
        m = i1;
      } 
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Start after end.");
    throw illegalArgumentException;
  }
  
  private static q a(long paramLong, q paramq, List<d> paramList) {
    paramLong = Math.max(paramLong, paramq.b());
    int m = paramq.q();
    int n = paramList.size();
    int k = Integer.MIN_VALUE;
    paramq = null;
    int i = 0;
    while (paramq == null) {
      int i1;
      int i3 = i % n;
      d d1 = paramList.get(i3);
      d d2 = paramList.get((i - 1 + n) % n);
      int i2 = a(d1, m, d2.d());
      if (i == 0) {
        i1 = a(d1, i2 + paramLong);
      } else {
        i1 = k;
        if (i3 == 0)
          i1 = k + 1; 
      } 
      long l1 = b(d1, i1, i2);
      if (l1 > paramLong)
        paramq = new q(l1, m + d2.d(), m + d1.d(), d1.d()); 
      i++;
      k = i1;
    } 
    return paramq;
  }
  
  private static long b(d paramd, int paramInt1, int paramInt2) {
    return paramd.a(paramInt1).a(paramd.e()).a(p.f(paramInt2)).b();
  }
  
  private List<q> c(int paramInt) {
    Integer integer = Integer.valueOf(paramInt);
    List<q> list2 = this.e.get(integer);
    List<q> list1 = list2;
    if (list2 == null) {
      list1 = new ArrayList();
      int k = this.c.q();
      int i = 0;
      int m = this.d.size();
      while (i < m) {
        d d1 = this.d.get(i);
        d d2 = this.d.get((i - 1 + m) % m);
        list1.add(new q(b(d1, paramInt, a(d1, k, d2.d())), k + d2.d(), k + d1.d(), d1.d()));
        i++;
      } 
      list2 = Collections.unmodifiableList(list1);
      list1 = list2;
      if (paramInt <= g) {
        list1 = list2;
        if (this.f) {
          List<q> list = this.e.putIfAbsent(integer, list2);
          list1 = list2;
          if (list != null)
            list1 = list; 
        } 
      } 
    } 
    return list1;
  }
  
  private void readObject(ObjectInputStream paramObjectInputStream) {
    throw new InvalidObjectException("Serialization proxy required.");
  }
  
  private Object writeReplace() {
    return new SPX(this, 125);
  }
  
  public List<p> a(net.time4j.c1.a parama, g paramg) {
    return b(parama, l.c(parama, paramg));
  }
  
  q a(net.time4j.c1.a parama, long paramLong) {
    if (paramLong <= this.c.b() + Math.max(this.c.c(), this.c.r()))
      return null; 
    for (q q1 : a(parama)) {
      long l1 = q1.b();
      if (q1.s()) {
        if (paramLong < q1.c() + l1)
          return null; 
        if (paramLong < l1 + q1.r())
          return q1; 
        continue;
      } 
      if (q1.t()) {
        if (paramLong < q1.r() + l1)
          return null; 
        if (paramLong < l1 + q1.c())
          return q1; 
      } 
    } 
    return null;
  }
  
  public q a(f paramf) {
    long l1 = this.c.b();
    long l2 = paramf.b();
    q q1 = null;
    if (l2 <= l1)
      return null; 
    int n = this.c.q();
    int k = this.d.size();
    List<d> list1 = this.d;
    int i = 0;
    d d = list1.get(0);
    List<d> list2 = this.d;
    int m = k - 1;
    n = a(d, n, ((d)list2.get(m)).d());
    n = a(d, paramf.b() + n);
    list2 = (List)c(n);
    while (i < k) {
      q q2 = (q)list2.get(i);
      l2 = q2.b();
      if (paramf.b() < l2) {
        if (q1 == null) {
          if (i == 0) {
            paramf = (f)c(n - 1).get(m);
          } else {
            paramf = (f)list2.get(i - 1);
          } 
          q q3 = (q)paramf;
          if (q3.b() > l1)
            return q3; 
        } 
        break;
      } 
      if (l2 > l1)
        q1 = q2; 
      i++;
    } 
    return q1;
  }
  
  public boolean a() {
    Iterator<d> iterator = this.d.iterator();
    while (iterator.hasNext()) {
      if (((d)iterator.next()).d() < 0)
        return true; 
    } 
    return false;
  }
  
  List<p> b(net.time4j.c1.a parama, long paramLong) {
    long l1 = this.c.b();
    int i = this.c.r();
    if (paramLong <= l1 + Math.max(this.c.c(), i))
      return l.b(i); 
    for (q q1 : a(parama)) {
      l1 = q1.b();
      i = q1.r();
      if (q1.s()) {
        if (paramLong < q1.c() + l1)
          return l.b(q1.c()); 
        if (paramLong < l1 + i)
          return Collections.emptyList(); 
        continue;
      } 
      if (q1.t()) {
        if (paramLong < i + l1)
          return l.b(q1.c()); 
        if (paramLong < l1 + q1.c())
          return l.a(i, q1.c()); 
      } 
    } 
    return l.b(i);
  }
  
  public p b() {
    return p.f(this.c.r());
  }
  
  public q b(net.time4j.c1.a parama, g paramg) {
    return a(parama, l.c(parama, paramg));
  }
  
  q c() {
    return this.c;
  }
  
  List<d> d() {
    return this.d;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof j) {
      paramObject = paramObject;
      return (this.c.equals(((j)paramObject).c) && this.d.equals(((j)paramObject).d));
    } 
    return false;
  }
  
  public int hashCode() {
    return this.c.hashCode() * 17 + this.d.hashCode() * 37;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(256);
    stringBuilder.append(j.class.getName());
    stringBuilder.append("[initial=");
    stringBuilder.append(this.c);
    stringBuilder.append(",rules=");
    stringBuilder.append(this.d);
    stringBuilder.append(']');
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/tz/model/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */