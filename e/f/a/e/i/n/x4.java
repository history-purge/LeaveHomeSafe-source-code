package e.f.a.e.i.n;

import java.util.Iterator;
import java.util.Map;

final class x4<T> implements j5<T> {
  private final r4 a;
  
  private final a6<?, ?> b;
  
  private final boolean c;
  
  private final v2<?> d;
  
  private x4(a6<?, ?> parama6, v2<?> paramv2, r4 paramr4) {
    this.b = parama6;
    this.c = paramv2.a(paramr4);
    this.d = paramv2;
    this.a = paramr4;
  }
  
  static <T> x4<T> a(a6<?, ?> parama6, v2<?> paramv2, r4 paramr4) {
    return new x4<T>(parama6, paramv2, paramr4);
  }
  
  public final void a(T paramT) {
    this.b.b(paramT);
    this.d.c(paramT);
  }
  
  public final void a(T paramT, y6 paramy6) {
    Iterator<Map.Entry> iterator = this.d.a(paramT).c();
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      b3 b3 = (b3)entry.getKey();
      if (b3.g() == v6.k && !b3.f() && !b3.e()) {
        z1 z1;
        boolean bool = entry instanceof x3;
        int i = b3.zza();
        if (bool) {
          z1 = ((x3)entry).a().b();
        } else {
          z1 = (z1)z1.getValue();
        } 
        paramy6.a(i, z1);
        continue;
      } 
      throw new IllegalStateException("Found invalid MessageSet item.");
    } 
    a6<?, ?> a61 = this.b;
    a61.b(a61.a(paramT), paramy6);
  }
  
  public final void a(T paramT, byte[] paramArrayOfbyte, int paramInt1, int paramInt2, v1 paramv1) {
    h3 h3 = (h3)paramT;
    d6 d62 = h3.zzb;
    d6 d61 = d62;
    if (d62 == d6.d()) {
      d61 = d6.e();
      h3.zzb = d61;
    } 
    z2<h3.e> z2 = ((h3.c)paramT).zza();
    paramT = null;
    while (paramInt1 < paramInt2) {
      h3.d d;
      z1 z1;
      paramInt1 = u1.a(paramArrayOfbyte, paramInt1, paramv1);
      int i = paramv1.a;
      if (i != 11) {
        if ((i & 0x7) == 2) {
          d = (h3.d)this.d.a(paramv1.d, this.a, i >>> 3);
          if (d != null) {
            paramInt1 = u1.a(e5.a().a(d.a.getClass()), paramArrayOfbyte, paramInt1, paramInt2, paramv1);
            z2.a(d.b, paramv1.c);
            continue;
          } 
          paramInt1 = u1.a(i, paramArrayOfbyte, paramInt1, paramInt2, d61, paramv1);
          continue;
        } 
        paramInt1 = u1.a(i, paramArrayOfbyte, paramInt1, paramInt2, paramv1);
        continue;
      } 
      int j = 0;
      d62 = null;
      while (true) {
        i = paramInt1;
        if (paramInt1 < paramInt2) {
          paramInt1 = u1.a(paramArrayOfbyte, paramInt1, paramv1);
          int k = paramv1.a;
          i = k >>> 3;
          int m = k & 0x7;
          if (i != 2) {
            if (i == 3) {
              if (d != null) {
                paramInt1 = u1.a(e5.a().a(d.a.getClass()), paramArrayOfbyte, paramInt1, paramInt2, paramv1);
                z2.a(d.b, paramv1.c);
                continue;
              } 
              if (m == 2) {
                paramInt1 = u1.e(paramArrayOfbyte, paramInt1, paramv1);
                z1 = (z1)paramv1.c;
                continue;
              } 
            } 
          } else if (m == 0) {
            paramInt1 = u1.a(paramArrayOfbyte, paramInt1, paramv1);
            j = paramv1.a;
            d = (h3.d)this.d.a(paramv1.d, this.a, j);
            continue;
          } 
          i = paramInt1;
          if (k != 12) {
            paramInt1 = u1.a(k, paramArrayOfbyte, paramInt1, paramInt2, paramv1);
            continue;
          } 
        } 
        break;
      } 
      if (z1 != null)
        d61.a(j << 3 | 0x2, z1); 
      paramInt1 = i;
    } 
    if (paramInt1 == paramInt2)
      return; 
    q3 q3 = q3.e();
    throw q3;
  }
  
  public final boolean a(T paramT1, T paramT2) {
    return !this.b.a(paramT1).equals(this.b.a(paramT2)) ? false : (this.c ? this.d.a(paramT1).equals(this.d.a(paramT2)) : true);
  }
  
  public final int b(T paramT) {
    a6<?, ?> a61 = this.b;
    int j = a61.c(a61.a(paramT)) + 0;
    int i = j;
    if (this.c)
      i = j + this.d.a(paramT).f(); 
    return i;
  }
  
  public final void b(T paramT1, T paramT2) {
    k5.a(this.b, paramT1, paramT2);
    if (this.c)
      k5.a(this.d, paramT1, paramT2); 
  }
  
  public final int c(T paramT) {
    int j = this.b.a(paramT).hashCode();
    int i = j;
    if (this.c)
      i = j * 53 + this.d.a(paramT).hashCode(); 
    return i;
  }
  
  public final boolean d(T paramT) {
    return this.d.a(paramT).e();
  }
  
  public final T zza() {
    return (T)this.a.b().e();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/x4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */