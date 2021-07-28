package e.f.a.e.i.d;

import java.util.Arrays;

public final class u3 {
  private static final u3 f = new u3(0, new int[0], new Object[0], false);
  
  private int a;
  
  private int[] b;
  
  private Object[] c;
  
  private int d = -1;
  
  private boolean e;
  
  private u3() {
    this(0, new int[8], new Object[8], true);
  }
  
  private u3(int paramInt, int[] paramArrayOfint, Object[] paramArrayOfObject, boolean paramBoolean) {
    this.a = paramInt;
    this.b = paramArrayOfint;
    this.c = paramArrayOfObject;
    this.e = paramBoolean;
  }
  
  static u3 a(u3 paramu31, u3 paramu32) {
    int i = paramu31.a + paramu32.a;
    int[] arrayOfInt = Arrays.copyOf(paramu31.b, i);
    System.arraycopy(paramu32.b, 0, arrayOfInt, paramu31.a, paramu32.a);
    Object[] arrayOfObject = Arrays.copyOf(paramu31.c, i);
    System.arraycopy(paramu32.c, 0, arrayOfObject, paramu31.a, paramu32.a);
    return new u3(i, arrayOfInt, arrayOfObject, true);
  }
  
  private static void a(int paramInt, Object paramObject, o4 paramo4) {
    int i = paramInt >>> 3;
    paramInt &= 0x7;
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3) {
            if (paramInt == 5) {
              paramo4.b(i, ((Integer)paramObject).intValue());
              return;
            } 
            throw new RuntimeException(l1.c());
          } 
          if (paramo4.a() == f1.e.k) {
            paramo4.a(i);
            ((u3)paramObject).b(paramo4);
            paramo4.b(i);
            return;
          } 
          paramo4.b(i);
          ((u3)paramObject).b(paramo4);
          paramo4.a(i);
          return;
        } 
        paramo4.a(i, (a0)paramObject);
        return;
      } 
      paramo4.b(i, ((Long)paramObject).longValue());
      return;
    } 
    paramo4.e(i, ((Long)paramObject).longValue());
  }
  
  public static u3 d() {
    return f;
  }
  
  static u3 e() {
    return new u3();
  }
  
  public final int a() {
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
                i = m0.i(i, ((Integer)this.c[j]).intValue());
              } else {
                throw new IllegalStateException(l1.c());
              } 
            } else {
              i = (m0.e(i) << 1) + ((u3)this.c[j]).a();
            } 
          } else {
            i = m0.c(i, (a0)this.c[j]);
          } 
        } else {
          i = m0.g(i, ((Long)this.c[j]).longValue());
        } 
      } else {
        i = m0.e(i, ((Long)this.c[j]).longValue());
      } 
      k += i;
      j++;
    } 
    this.d = k;
    return k;
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
  
  final void a(o4 paramo4) {
    if (paramo4.a() == f1.e.l) {
      for (int j = this.a - 1; j >= 0; j--)
        paramo4.a(this.b[j] >>> 3, this.c[j]); 
      return;
    } 
    for (int i = 0; i < this.a; i++)
      paramo4.a(this.b[i] >>> 3, this.c[i]); 
  }
  
  final void a(StringBuilder paramStringBuilder, int paramInt) {
    for (int i = 0; i < this.a; i++)
      n2.a(paramStringBuilder, paramInt, String.valueOf(this.b[i] >>> 3), this.c[i]); 
  }
  
  public final int b() {
    int i = this.d;
    if (i != -1)
      return i; 
    i = 0;
    int j = 0;
    while (i < this.a) {
      j += m0.d(this.b[i] >>> 3, (a0)this.c[i]);
      i++;
    } 
    this.d = j;
    return j;
  }
  
  public final void b(o4 paramo4) {
    if (this.a == 0)
      return; 
    if (paramo4.a() == f1.e.k) {
      for (int j = 0; j < this.a; j++)
        a(this.b[j], this.c[j], paramo4); 
      return;
    } 
    for (int i = this.a - 1; i >= 0; i--)
      a(this.b[i], this.c[i], paramo4); 
  }
  
  public final void c() {
    this.e = false;
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null)
      return false; 
    if (!(paramObject instanceof u3))
      return false; 
    paramObject = paramObject;
    int i = this.a;
    if (i == ((u3)paramObject).a) {
      int[] arrayOfInt1 = this.b;
      int[] arrayOfInt2 = ((u3)paramObject).b;
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
        paramObject = ((u3)paramObject).c;
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/u3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */