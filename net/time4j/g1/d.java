package net.time4j.g1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArrayList;
import net.time4j.c1.b;
import net.time4j.c1.c;

public final class d implements Iterable<b>, Comparator<b> {
  public static final boolean h = Boolean.getBoolean("net.time4j.scale.leapseconds.suppressed");
  
  public static final boolean i = Boolean.getBoolean("net.time4j.scale.leapseconds.final");
  
  private static final a[] j = new a[0];
  
  private static final d k = new d();
  
  private final c c;
  
  private final List<a> d;
  
  private final a[] e;
  
  private volatile a[] f;
  
  private final boolean g;
  
  private d() {
    boolean bool;
    c c1;
    if (!h) {
      Iterator<c> iterator = net.time4j.c1.d.c().a(c.class).iterator();
      c c2 = null;
      int i = 0;
      while (true) {
        c1 = c2;
        bool = i;
        if (iterator.hasNext()) {
          c1 = iterator.next();
          bool = c1.i().size();
          if (bool > i) {
            c2 = c1;
            i = bool;
          } 
          continue;
        } 
        break;
      } 
    } else {
      c1 = null;
      bool = false;
    } 
    if (c1 == null || !bool) {
      this.c = null;
      this.d = Collections.emptyList();
      a[] arrayOfA = j;
      this.e = arrayOfA;
      this.f = arrayOfA;
      this.g = false;
      return;
    } 
    TreeSet<a> treeSet = new TreeSet(this);
    for (Map.Entry<net.time4j.c1.a, Integer> entry : c1.i().entrySet()) {
      net.time4j.c1.a a1 = (net.time4j.c1.a)entry.getKey();
      treeSet.add(new a(a1, Long.MIN_VALUE, c(a1) - 62985600L - 1L, ((Integer)entry.getValue()).intValue()));
    } 
    a((SortedSet)treeSet);
    if (i) {
      this.d = Collections.unmodifiableList(new ArrayList<a>((Collection)treeSet));
    } else {
      this.d = new CopyOnWriteArrayList<a>((Collection)treeSet);
    } 
    this.e = l();
    this.f = this.e;
    this.c = c1;
    if (i) {
      boolean bool2 = c1.h();
      boolean bool1 = bool2;
      if (bool2) {
        Iterator<a> iterator = this.d.iterator();
        while (true) {
          if (iterator.hasNext()) {
            if (((a)iterator.next()).b() < 0) {
              bool1 = true;
              break;
            } 
            continue;
          } 
          bool1 = false;
          break;
        } 
      } 
      this.g = bool1;
      return;
    } 
    this.g = true;
  }
  
  private static void a(SortedSet<a> paramSortedSet) {
    ArrayList<a> arrayList = new ArrayList(paramSortedSet.size());
    Iterator<a> iterator = paramSortedSet.iterator();
    int i = 0;
    while (iterator.hasNext()) {
      a a1 = iterator.next();
      if (a1.c() == Long.MIN_VALUE) {
        i += a1.b();
        arrayList.add(new a(a1, i));
        continue;
      } 
      arrayList.add(a1);
    } 
    paramSortedSet.clear();
    paramSortedSet.addAll((Collection)arrayList);
  }
  
  private static String b(net.time4j.c1.a parama) {
    return String.format("%1$04d-%2$02d-%3$02d", new Object[] { Integer.valueOf(parama.getYear()), Integer.valueOf(parama.getMonth()), Integer.valueOf(parama.r()) });
  }
  
  private static long c(net.time4j.c1.a parama) {
    return c.b(c.c(b.a(parama), 40587L), 86400L);
  }
  
  private a[] j() {
    return (h || i) ? this.e : this.f;
  }
  
  public static d k() {
    return k;
  }
  
  private a[] l() {
    ArrayList<a> arrayList = new ArrayList(this.d.size());
    arrayList.addAll(this.d);
    Collections.reverse(arrayList);
    return arrayList.<a>toArray(new a[arrayList.size()]);
  }
  
  public int a(b paramb1, b paramb2) {
    net.time4j.c1.a a1 = paramb1.d();
    net.time4j.c1.a a2 = paramb2.d();
    int i = a1.getYear();
    int j = a2.getYear();
    if (i < j)
      return -1; 
    if (i > j)
      return 1; 
    i = a1.getMonth();
    j = a2.getMonth();
    if (i < j)
      return -1; 
    if (i > j)
      return 1; 
    i = a1.r();
    j = a2.r();
    return (i < j) ? -1 : ((i == j) ? 0 : 1);
  }
  
  public long a(long paramLong) {
    long l = paramLong - 63072000L;
    if (paramLong <= 0L)
      return l; 
    a[] arrayOfA = j();
    for (int i = 0; i < arrayOfA.length; i++) {
      a a1 = arrayOfA[i];
      if (a1.a() < l)
        return c.a(l, a1.c() - a1.a()); 
    } 
    return l;
  }
  
  public b b(long paramLong) {
    a[] arrayOfA = j();
    b b = null;
    int i = 0;
    while (i < arrayOfA.length) {
      a a1 = arrayOfA[i];
      if (paramLong >= a1.c())
        return b; 
      i++;
      b = a1;
    } 
    return b;
  }
  
  public int c(long paramLong) {
    if (paramLong <= 0L)
      return 0; 
    a[] arrayOfA = j();
    for (int i = 0; i < arrayOfA.length; i++) {
      a a1 = arrayOfA[i];
      if (paramLong > a1.c())
        return 0; 
      long l = a1.c() - a1.b();
      if (paramLong > l)
        return (int)(paramLong - l); 
    } 
    return 0;
  }
  
  public boolean d(long paramLong) {
    if (paramLong <= 0L)
      return false; 
    a[] arrayOfA = j();
    for (int i = 0; i < arrayOfA.length; i++) {
      long l = arrayOfA[i].c();
      if (l == paramLong)
        return (arrayOfA[i].b() == 1); 
      if (l < paramLong)
        return false; 
    } 
    return false;
  }
  
  public long e(long paramLong) {
    long l;
    if (paramLong <= 0L)
      return paramLong + 63072000L; 
    a[] arrayOfA = j();
    boolean bool = this.g;
    int i = 0;
    while (true) {
      l = paramLong;
      if (i < arrayOfA.length) {
        a a1 = arrayOfA[i];
        if (a1.c() - a1.b() < paramLong || (bool && a1.b() < 0 && a1.c() < paramLong)) {
          l = c.a(paramLong, a1.a() - a1.c());
          break;
        } 
        i++;
        continue;
      } 
      break;
    } 
    return l + 63072000L;
  }
  
  public net.time4j.c1.a g() {
    if (h())
      return this.c.g(); 
    throw new IllegalStateException("Leap seconds not activated.");
  }
  
  public boolean h() {
    return this.d.isEmpty() ^ true;
  }
  
  public boolean i() {
    return this.g;
  }
  
  public Iterator<b> iterator() {
    return Collections.<b>unmodifiableList(Arrays.asList((b[])j())).iterator();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(2048);
    stringBuilder.append("[PROVIDER=");
    stringBuilder.append(this.c);
    if (this.c != null) {
      stringBuilder.append(",EXPIRES=");
      stringBuilder.append(b(g()));
    } 
    stringBuilder.append(",EVENTS=[");
    if (h()) {
      boolean bool = true;
      for (a a1 : this.d) {
        if (bool) {
          bool = false;
        } else {
          stringBuilder.append('|');
        } 
        stringBuilder.append(a1);
      } 
    } else {
      stringBuilder.append("NOT SUPPORTED");
    } 
    stringBuilder.append("]]");
    return stringBuilder.toString();
  }
  
  static {
    System.getProperty("net.time4j.scale.leapseconds.path", "data/leapseconds.data");
  }
  
  private static class a implements a, Serializable {
    private static final long serialVersionUID = 5986185471610524587L;
    
    private final long _raw;
    
    private final long _utc;
    
    private final net.time4j.c1.a date;
    
    private final int shift;
    
    a(net.time4j.c1.a param1a, long param1Long1, long param1Long2, int param1Int) {
      this.date = param1a;
      this.shift = param1Int;
      this._utc = param1Long1;
      this._raw = param1Long2;
    }
    
    a(a param1a, int param1Int) {
      this.date = param1a.d();
      this.shift = param1a.b();
      this._utc = param1a.a() + param1Int;
      this._raw = param1a.a();
    }
    
    public long a() {
      return this._raw;
    }
    
    public int b() {
      return this.shift;
    }
    
    public long c() {
      return this._utc;
    }
    
    public net.time4j.c1.a d() {
      return this.date;
    }
    
    public String toString() {
      StringBuilder stringBuilder = new StringBuilder(128);
      stringBuilder.append(b.class.getName());
      stringBuilder.append('[');
      stringBuilder.append(d.a(this.date));
      stringBuilder.append(": utc=");
      stringBuilder.append(this._utc);
      stringBuilder.append(", raw=");
      stringBuilder.append(this._raw);
      stringBuilder.append(" (shift=");
      stringBuilder.append(this.shift);
      stringBuilder.append(")]");
      return stringBuilder.toString();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/g1/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */