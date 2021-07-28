package b.e.b.k.m;

import b.e.b.k.e;
import b.e.b.k.f;
import java.util.ArrayList;

class k {
  public static int d;
  
  public boolean a;
  
  m b = null;
  
  ArrayList<m> c = new ArrayList<m>();
  
  public k(m paramm, int paramInt) {
    d++;
    this.b = paramm;
  }
  
  private long a(f paramf, long paramLong) {
    m m1 = paramf.d;
    if (m1 instanceof i)
      return paramLong; 
    int j = paramf.k.size();
    int i = 0;
    long l1;
    for (l1 = paramLong; i < j; l1 = l) {
      d d = paramf.k.get(i);
      long l = l1;
      if (d instanceof f) {
        d = d;
        if (((f)d).d == m1) {
          l = l1;
        } else {
          l = Math.min(l1, a((f)d, ((f)d).f + paramLong));
        } 
      } 
      i++;
    } 
    long l2 = l1;
    if (paramf == m1.i) {
      l2 = m1.d();
      paramf = m1.h;
      paramLong -= l2;
      l2 = Math.min(Math.min(l1, a(paramf, paramLong)), paramLong - m1.h.f);
    } 
    return l2;
  }
  
  private long b(f paramf, long paramLong) {
    m m1 = paramf.d;
    if (m1 instanceof i)
      return paramLong; 
    int j = paramf.k.size();
    int i = 0;
    long l1;
    for (l1 = paramLong; i < j; l1 = l) {
      d d = paramf.k.get(i);
      long l = l1;
      if (d instanceof f) {
        d = d;
        if (((f)d).d == m1) {
          l = l1;
        } else {
          l = Math.max(l1, b((f)d, ((f)d).f + paramLong));
        } 
      } 
      i++;
    } 
    long l2 = l1;
    if (paramf == m1.h) {
      l2 = m1.d();
      paramf = m1.i;
      paramLong += l2;
      l2 = Math.max(Math.max(l1, b(paramf, paramLong)), paramLong - m1.i.f);
    } 
    return l2;
  }
  
  public long a(f paramf, int paramInt) {
    j j;
    l l;
    m m1;
    long l1;
    m m2 = this.b;
    boolean bool1 = m2 instanceof c;
    long l2 = 0L;
    if (bool1) {
      if (m2.f != paramInt)
        return 0L; 
    } else if (paramInt == 0) {
      if (!(m2 instanceof j))
        return 0L; 
    } else if (!(m2 instanceof l)) {
      return 0L;
    } 
    if (paramInt == 0) {
      m2 = ((e)paramf).d;
    } else {
      m2 = ((e)paramf).e;
    } 
    f f2 = m2.h;
    if (paramInt == 0) {
      j = ((e)paramf).d;
    } else {
      l = ((e)j).e;
    } 
    f f1 = l.i;
    bool1 = this.b.h.l.contains(f2);
    boolean bool2 = this.b.i.l.contains(f1);
    long l3 = this.b.d();
    if (bool1 && bool2) {
      l1 = b(this.b.h, 0L);
      long l5 = a(this.b.i, 0L);
      long l4 = l1 - l3;
      int i = this.b.i.f;
      l1 = l4;
      if (l4 >= -i)
        l1 = l4 + i; 
      l4 = -l5;
      i = this.b.h.f;
      l5 = l4 - l3 - i;
      l4 = l5;
      if (l5 >= i)
        l4 = l5 - i; 
      float f3 = this.b.b.a(paramInt);
      if (f3 > 0.0F)
        l2 = (long)((float)l4 / f3 + (float)l1 / (1.0F - f3)); 
      float f4 = (float)l2;
      l1 = (long)(f4 * f3 + 0.5F);
      l4 = (long)(f4 * (1.0F - f3) + 0.5F);
      m1 = this.b;
      l1 = m1.h.f + l1 + l3 + l4;
    } else {
      if (bool1) {
        f1 = this.b.h;
        long l5 = b(f1, f1.f);
        long l4 = this.b.h.f + l3;
        return Math.max(l5, l4);
      } 
      if (bool2) {
        f1 = this.b.i;
        long l5 = a(f1, f1.f);
        long l4 = -this.b.i.f + l3;
        l5 = -l5;
        return Math.max(l5, l4);
      } 
      m1 = this.b;
      l1 = m1.h.f + m1.d();
      m1 = this.b;
    } 
    return l1 - m1.i.f;
  }
  
  public void a(m paramm) {
    this.c.add(paramm);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/b/k/m/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */