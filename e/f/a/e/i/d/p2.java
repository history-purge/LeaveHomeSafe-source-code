package e.f.a.e.i.d;

import java.util.Iterator;
import java.util.Map;

final class p2<T> implements b3<T> {
  private final k2 a;
  
  private final t3<?, ?> b;
  
  private final boolean c;
  
  private final s0<?> d;
  
  private p2(t3<?, ?> paramt3, s0<?> params0, k2 paramk2) {
    this.b = paramt3;
    this.c = params0.a(paramk2);
    this.d = params0;
    this.a = paramk2;
  }
  
  static <T> p2<T> a(t3<?, ?> paramt3, s0<?> params0, k2 paramk2) {
    return new p2<T>(paramt3, params0, paramk2);
  }
  
  public final T a() {
    return (T)this.a.e().v();
  }
  
  public final void a(T paramT) {
    this.b.a(paramT);
    this.d.c(paramT);
  }
  
  public final void a(T paramT, o4 paramo4) {
    Iterator<Map.Entry> iterator = this.d.a(paramT).e();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      z0 z0 = (z0)entry.getKey();
      if (z0.n() == n4.k && !z0.p() && !z0.h()) {
        a0 a0;
        boolean bool = entry instanceof q1;
        int i = z0.g();
        if (bool) {
          a0 = ((q1)entry).a().b();
        } else {
          a0 = (a0)a0.getValue();
        } 
        paramo4.a(i, a0);
        continue;
      } 
      throw new IllegalStateException("Found invalid MessageSet item.");
    } 
    t3<?, ?> t31 = this.b;
    t31.b(t31.c(paramT), paramo4);
  }
  
  public final void a(T paramT1, T paramT2) {
    d3.a(this.b, paramT1, paramT2);
    if (this.c)
      d3.a(this.d, paramT1, paramT2); 
  }
  
  public final void a(T paramT, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, w paramw) {
    f1 f1 = (f1)paramT;
    u3 u32 = f1.zzjp;
    u3 u31 = u32;
    if (u32 == u3.d()) {
      u31 = u3.e();
      f1.zzjp = u31;
    } 
    while (paramInt1 < paramInt2) {
      a0 a0;
      paramInt1 = v.a(paramArrayOfbyte, paramInt1, paramw);
      int i = paramw.a;
      if (i != 11) {
        if ((i & 0x7) == 2) {
          paramInt1 = v.a(i, paramArrayOfbyte, paramInt1, paramInt2, u31, paramw);
          continue;
        } 
        paramInt1 = v.a(i, paramArrayOfbyte, paramInt1, paramInt2, paramw);
        continue;
      } 
      int j = 0;
      u32 = null;
      while (true) {
        i = paramInt1;
        if (paramInt1 < paramInt2) {
          paramInt1 = v.a(paramArrayOfbyte, paramInt1, paramw);
          int k = paramw.a;
          i = k >>> 3;
          int m = k & 0x7;
          if (i != 2) {
            if (i == 3 && m == 2) {
              paramInt1 = v.e(paramArrayOfbyte, paramInt1, paramw);
              a0 = (a0)paramw.c;
              continue;
            } 
          } else if (m == 0) {
            paramInt1 = v.a(paramArrayOfbyte, paramInt1, paramw);
            j = paramw.a;
            continue;
          } 
          i = paramInt1;
          if (k != 12) {
            paramInt1 = v.a(k, paramArrayOfbyte, paramInt1, paramInt2, paramw);
            continue;
          } 
        } 
        break;
      } 
      if (a0 != null)
        u31.a(j << 3 | 0x2, a0); 
      paramInt1 = i;
    } 
    if (paramInt1 == paramInt2)
      return; 
    l1 l1 = l1.d();
    throw l1;
  }
  
  public final int b(T paramT) {
    t3<?, ?> t31 = this.b;
    int j = t31.d(t31.c(paramT)) + 0;
    int i = j;
    if (this.c)
      i = j + this.d.a(paramT).g(); 
    return i;
  }
  
  public final boolean b(T paramT1, T paramT2) {
    return !this.b.c(paramT1).equals(this.b.c(paramT2)) ? false : (this.c ? this.d.a(paramT1).equals(this.d.a(paramT2)) : true);
  }
  
  public final boolean c(T paramT) {
    return this.d.a(paramT).d();
  }
  
  public final int d(T paramT) {
    int j = this.b.c(paramT).hashCode();
    int i = j;
    if (this.c)
      i = j * 53 + this.d.a(paramT).hashCode(); 
    return i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/p2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */