package e.f.a.e.i.n;

import java.util.Arrays;

public final class d6 {
  private static final d6 f = new d6(0, new int[0], new Object[0], false);
  
  private int a;
  
  private int[] b;
  
  private Object[] c;
  
  private int d = -1;
  
  private boolean e;
  
  private d6() {
    this(0, new int[8], new Object[8], true);
  }
  
  private d6(int paramInt, int[] paramArrayOfint, Object[] paramArrayOfObject, boolean paramBoolean) {
    this.a = paramInt;
    this.b = paramArrayOfint;
    this.c = paramArrayOfObject;
    this.e = paramBoolean;
  }
  
  static d6 a(d6 paramd61, d6 paramd62) {
    int i = paramd61.a + paramd62.a;
    int[] arrayOfInt = Arrays.copyOf(paramd61.b, i);
    System.arraycopy(paramd62.b, 0, arrayOfInt, paramd61.a, paramd62.a);
    Object[] arrayOfObject = Arrays.copyOf(paramd61.c, i);
    System.arraycopy(paramd62.c, 0, arrayOfObject, paramd61.a, paramd62.a);
    return new d6(i, arrayOfInt, arrayOfObject, true);
  }
  
  private static void a(int paramInt, Object paramObject, y6 paramy6) {
    int i = paramInt >>> 3;
    paramInt &= 0x7;
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3) {
            if (paramInt == 5) {
              paramy6.d(i, ((Integer)paramObject).intValue());
              return;
            } 
            throw new RuntimeException(q3.d());
          } 
          if (paramy6.zza() == x6.a) {
            paramy6.f(i);
            ((d6)paramObject).b(paramy6);
            paramy6.g(i);
            return;
          } 
          paramy6.g(i);
          ((d6)paramObject).b(paramy6);
          paramy6.f(i);
          return;
        } 
        paramy6.a(i, (z1)paramObject);
        return;
      } 
      paramy6.d(i, ((Long)paramObject).longValue());
      return;
    } 
    paramy6.c(i, ((Long)paramObject).longValue());
  }
  
  public static d6 d() {
    return f;
  }
  
  static d6 e() {
    return new d6();
  }
  
  public final void a() {
    this.e = false;
  }
  
  final void a(int paramInt, Object paramObject) {
    if (this.e) {
      int i = this.a;
      if (i == this.b.length) {
        if (i < 4) {
          i = 8;
        } else {
          i >>= 1;
        } 
        i = this.a + i;
        this.b = Arrays.copyOf(this.b, i);
        this.c = Arrays.copyOf(this.c, i);
      } 
      int[] arrayOfInt = this.b;
      i = this.a;
      arrayOfInt[i] = paramInt;
      this.c[i] = paramObject;
      this.a = i + 1;
      return;
    } 
    throw new UnsupportedOperationException();
  }
  
  final void a(y6 paramy6) {
    if (paramy6.zza() == x6.b) {
      for (int j = this.a - 1; j >= 0; j--)
        paramy6.a(this.b[j] >>> 3, this.c[j]); 
      return;
    } 
    for (int i = 0; i < this.a; i++)
      paramy6.a(this.b[i] >>> 3, this.c[i]); 
  }
  
  final void a(StringBuilder paramStringBuilder, int paramInt) {
    for (int i = 0; i < this.a; i++)
      w4.a(paramStringBuilder, paramInt, String.valueOf(this.b[i] >>> 3), this.c[i]); 
  }
  
  public final int b() {
    int i = this.d;
    if (i != -1)
      return i; 
    i = 0;
    int j = 0;
    while (i < this.a) {
      j += o2.d(this.b[i] >>> 3, (z1)this.c[i]);
      i++;
    } 
    this.d = j;
    return j;
  }
  
  public final void b(y6 paramy6) {
    if (this.a == 0)
      return; 
    if (paramy6.zza() == x6.a) {
      for (int j = 0; j < this.a; j++)
        a(this.b[j], this.c[j], paramy6); 
      return;
    } 
    for (int i = this.a - 1; i >= 0; i--)
      a(this.b[i], this.c[i], paramy6); 
  }
  
  public final int c() {
    int i = this.d;
    if (i != -1)
      return i; 
    int j = 0;
    int k = 0;
    while (j < this.a) {
      int m = this.b[j];
      i = m >>> 3;
      m &= 0x7;
      if (m != 0) {
        if (m != 1) {
          if (m != 2) {
            if (m != 3) {
              if (m == 5) {
                i = o2.i(i, ((Integer)this.c[j]).intValue());
              } else {
                throw new IllegalStateException(q3.d());
              } 
            } else {
              i = (o2.e(i) << 1) + ((d6)this.c[j]).c();
            } 
          } else {
            i = o2.c(i, (z1)this.c[j]);
          } 
        } else {
          i = o2.g(i, ((Long)this.c[j]).longValue());
        } 
      } else {
        i = o2.e(i, ((Long)this.c[j]).longValue());
      } 
      k += i;
      j++;
    } 
    this.d = k;
    return k;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof d6))
      return false; 
    paramObject = paramObject;
    int i = this.a;
    if (i == ((d6)paramObject).a) {
      int[] arrayOfInt1 = this.b;
      int[] arrayOfInt2 = ((d6)paramObject).b;
      int j = 0;
      while (true) {
        if (j < i) {
          if (arrayOfInt1[j] != arrayOfInt2[j]) {
            j = 0;
            break;
          } 
          j++;
          continue;
        } 
        j = 1;
        break;
      } 
      if (j != 0) {
        Object[] arrayOfObject = this.c;
        paramObject = ((d6)paramObject).c;
        i = this.a;
        j = 0;
        while (true) {
          if (j < i) {
            if (!arrayOfObject[j].equals(paramObject[j])) {
              j = 0;
              break;
            } 
            j++;
            continue;
          } 
          j = 1;
          break;
        } 
        return !(j == 0);
      } 
    } 
    return false;
  }
  
  public final int hashCode() {
    int m = this.a;
    int[] arrayOfInt = this.b;
    boolean bool = false;
    int k = 17;
    int j = 0;
    int i = 17;
    while (j < m) {
      i = i * 31 + arrayOfInt[j];
      j++;
    } 
    Object[] arrayOfObject = this.c;
    int n = this.a;
    for (j = bool; j < n; j++)
      k = k * 31 + arrayOfObject[j].hashCode(); 
    return ((m + 527) * 31 + i) * 31 + k;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/d6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */