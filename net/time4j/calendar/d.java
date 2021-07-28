package net.time4j.calendar;

import net.time4j.a0;
import net.time4j.c1.c;
import net.time4j.calendar.s.b;
import net.time4j.calendar.s.c;
import net.time4j.calendar.s.d;
import net.time4j.d1.a0;
import net.time4j.d1.g;
import net.time4j.d1.k;
import net.time4j.f0;
import net.time4j.tz.k;
import net.time4j.tz.p;

abstract class d<D extends f<?, D>> implements k<D> {
  private static final long a = f0.b(1645, 1, 28).q();
  
  private static final long b = f0.b(3000, 1, 27).q();
  
  private static final long c = f0.b(-2636, 2, 15).q();
  
  private long a(int paramInt1, int paramInt2, h paramh) {
    long l = e(b(paramInt1, paramInt2) + ((paramh.a() - 1) * 29));
    return paramh.equals(a(l).getMonth()) ? l : e(l + 1L);
  }
  
  private boolean a(long paramLong1, long paramLong2) {
    return (paramLong2 >= paramLong1 && (c(paramLong2) || a(paramLong1, f(paramLong2))));
  }
  
  private static long b(long paramLong1, long paramLong2) {
    double d1 = (paramLong2 - paramLong1);
    Double.isNaN(d1);
    return Math.round(d1 / 29.530588861D);
  }
  
  private long f(long paramLong) {
    return d.d.b(d(paramLong)).b((k)b(paramLong)).y().q();
  }
  
  private long g(long paramLong) {
    long l1 = i(paramLong);
    paramLong = i(370L + l1);
    l1 = e(l1 + 1L);
    long l2 = e(l1 + 1L);
    return (b(l1, f(paramLong + 1L)) == 12L && (c(l1) || c(l2))) ? e(l2 + 1L) : l2;
  }
  
  private long h(long paramLong) {
    long l = g(paramLong);
    return (paramLong >= l) ? l : g(paramLong - 180L);
  }
  
  private long i(long paramLong) {
    int i;
    p p = b(paramLong);
    f0 f03 = f0.a(paramLong, a0.c);
    if (f03.getMonth() <= 11 || f03.r() <= 15) {
      i = f03.getYear() - 1;
    } else {
      i = f03.getYear();
    } 
    f0 f02 = b.f.f(i).b((k)p).w();
    f0 f01 = f02;
    if (f02.b((g)f03))
      f01 = b.f.f(i - 1).b((k)p).w(); 
    return f01.q();
  }
  
  final int a(int paramInt1, int paramInt2) {
    int[] arrayOfInt = c();
    int i = (paramInt1 - 1) * 60 + paramInt2 - 1;
    boolean bool = false;
    paramInt1 = (i - arrayOfInt[0]) / 3 * 2;
    while (true) {
      paramInt2 = bool;
      if (paramInt1 < arrayOfInt.length) {
        paramInt2 = arrayOfInt[paramInt1];
        if (paramInt2 < i) {
          paramInt1 += Math.max((i - paramInt2) / 3 * 2, 2);
          continue;
        } 
        if (paramInt2 > i)
          return 0; 
        paramInt2 = arrayOfInt[paramInt1 + 1];
      } 
      break;
    } 
    return paramInt2;
  }
  
  public final long a() {
    return b;
  }
  
  public final long a(D paramD) {
    return b(paramD.w(), paramD.getYear().b(), paramD.getMonth(), paramD.r());
  }
  
  abstract D a(int paramInt1, int paramInt2, h paramh, int paramInt3, long paramLong);
  
  public final D a(long paramLong) {
    boolean bool;
    long l2 = i(paramLong);
    long l1 = i(370L + l2);
    long l3 = e(l2 + 1L);
    l1 = f(l1 + 1L);
    long l4 = f(paramLong + 1L);
    if (b(l3, l1) == 12L) {
      bool = true;
    } else {
      bool = false;
    } 
    l2 = b(l3, l4);
    l1 = l2;
    if (bool) {
      l1 = l2;
      if (a(l3, l4))
        l1 = l2 - 1L; 
    } 
    int i = 12;
    int j = c.b(l1, 12);
    if (j != 0)
      i = j; 
    double d1 = i;
    Double.isNaN(d1);
    d1 /= 12.0D;
    double d2 = (paramLong - c);
    Double.isNaN(d2);
    l1 = (long)Math.floor(1.5D - d1 + d2 / 365.242189D);
    j = 60;
    int n = (int)c.a(l1 - 1L, 60);
    int m = c.b(l1, 60);
    if (m != 0)
      j = m; 
    m = (int)(paramLong - l4 + 1L);
    h h2 = h.f(i);
    h h1 = h2;
    if (bool) {
      h1 = h2;
      if (c(l4)) {
        h1 = h2;
        if (!a(l3, f(l4)))
          h1 = h2.c(); 
      } 
    } 
    return a(1 + n, j, h1, m, paramLong);
  }
  
  boolean a(int paramInt1, int paramInt2, h paramh, int paramInt3) {
    boolean bool = false;
    if (paramInt1 >= 72 && paramInt1 <= 94 && paramInt2 >= 1 && paramInt2 <= 60 && (paramInt1 != 72 || paramInt2 >= 22) && (paramInt1 != 94 || paramInt2 <= 56) && paramInt3 >= 1 && paramInt3 <= 30 && paramh != null) {
      if (paramh.b() && paramh.a() != a(paramInt1, paramInt2))
        return false; 
      if (paramInt3 == 30) {
        long l = a(paramInt1, paramInt2, paramh);
        if (e(1L + l) - l == 30L)
          bool = true; 
        return bool;
      } 
      return true;
    } 
    return false;
  }
  
  public long b() {
    return a;
  }
  
  final long b(int paramInt1, int paramInt2) {
    double d1 = c;
    double d2 = ((paramInt1 - 1) * 60 + paramInt2);
    Double.isNaN(d2);
    Double.isNaN(d1);
    return h((long)Math.floor(d1 + (d2 - 0.5D) * 365.242189D));
  }
  
  final long b(int paramInt1, int paramInt2, h paramh, int paramInt3) {
    if (a(paramInt1, paramInt2, paramh, paramInt3))
      return a(paramInt1, paramInt2, paramh) + paramInt3 - 1L; 
    throw new IllegalArgumentException("Invalid date.");
  }
  
  abstract p b(long paramLong);
  
  final boolean c(long paramLong) {
    return (((int)Math.floor(o.b(c.a(d(paramLong)).b()) / 30.0D) + 2) % 12 == ((int)Math.floor(o.b(c.a(d(e(paramLong + 1L))).b()) / 30.0D) + 2) % 12);
  }
  
  abstract int[] c();
  
  a0 d(long paramLong) {
    return f0.a(paramLong, a0.c).v().a(b(paramLong));
  }
  
  final long e(long paramLong) {
    return d.d.a(d(paramLong)).b((k)b(paramLong)).y().q();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */