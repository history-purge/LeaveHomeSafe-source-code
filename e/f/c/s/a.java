package e.f.c.s;

import java.util.Arrays;

public final class a implements Cloneable {
  private int[] c;
  
  private int d;
  
  public a() {
    this.d = 0;
    this.c = new int[1];
  }
  
  public a(int paramInt) {
    this.d = paramInt;
    this.c = e(paramInt);
  }
  
  a(int[] paramArrayOfint, int paramInt) {
    this.c = paramArrayOfint;
    this.d = paramInt;
  }
  
  private static int[] e(int paramInt) {
    return new int[(paramInt + 31) / 32];
  }
  
  public void a() {
    int j = this.c.length;
    for (int i = 0; i < j; i++)
      this.c[i] = 0; 
  }
  
  public void a(int paramInt1, int paramInt2) {
    this.c[paramInt1 / 32] = paramInt2;
  }
  
  public boolean a(int paramInt) {
    return ((1 << (paramInt & 0x1F) & this.c[paramInt / 32]) != 0);
  }
  
  public boolean a(int paramInt1, int paramInt2, boolean paramBoolean) {
    if (paramInt2 >= paramInt1 && paramInt1 >= 0 && paramInt2 <= this.d) {
      if (paramInt2 == paramInt1)
        return true; 
      int k = paramInt2 - 1;
      int j = paramInt1 / 32;
      int m = k / 32;
      int i;
      for (i = j; i <= m; i++) {
        int n = 31;
        if (i > j) {
          paramInt2 = 0;
        } else {
          paramInt2 = paramInt1 & 0x1F;
        } 
        if (i >= m)
          n = 0x1F & k; 
        n = (2 << n) - (1 << paramInt2);
        int i1 = this.c[i];
        if (paramBoolean) {
          paramInt2 = n;
        } else {
          paramInt2 = 0;
        } 
        if ((i1 & n) != paramInt2)
          return false; 
      } 
      return true;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    throw illegalArgumentException;
  }
  
  public int b(int paramInt) {
    int i = this.d;
    if (paramInt >= i)
      return i; 
    int j = paramInt / 32;
    i = ((1 << (paramInt & 0x1F)) - 1 ^ 0xFFFFFFFF) & this.c[j];
    paramInt = j;
    while (i == 0) {
      paramInt++;
      int[] arrayOfInt = this.c;
      if (paramInt == arrayOfInt.length)
        return this.d; 
      i = arrayOfInt[paramInt];
    } 
    paramInt = (paramInt << 5) + Integer.numberOfTrailingZeros(i);
    i = this.d;
    return (paramInt > i) ? i : paramInt;
  }
  
  public int[] b() {
    return this.c;
  }
  
  public int c() {
    return this.d;
  }
  
  public int c(int paramInt) {
    int i = this.d;
    if (paramInt >= i)
      return i; 
    int j = paramInt / 32;
    i = ((1 << (paramInt & 0x1F)) - 1 ^ 0xFFFFFFFF) & (this.c[j] ^ 0xFFFFFFFF);
    paramInt = j;
    while (i == 0) {
      paramInt++;
      int[] arrayOfInt = this.c;
      if (paramInt == arrayOfInt.length)
        return this.d; 
      i = arrayOfInt[paramInt] ^ 0xFFFFFFFF;
    } 
    paramInt = (paramInt << 5) + Integer.numberOfTrailingZeros(i);
    i = this.d;
    return (paramInt > i) ? i : paramInt;
  }
  
  public a clone() {
    return new a((int[])this.c.clone(), this.d);
  }
  
  public void d() {
    int[] arrayOfInt = new int[this.c.length];
    int j = (this.d - 1) / 32;
    int k = j + 1;
    int i;
    for (i = 0; i < k; i++) {
      long l = this.c[i];
      l = (l & 0x55555555L) << 1L | l >> 1L & 0x55555555L;
      l = (l & 0x33333333L) << 2L | l >> 2L & 0x33333333L;
      l = (l & 0xF0F0F0FL) << 4L | l >> 4L & 0xF0F0F0FL;
      l = (l & 0xFF00FFL) << 8L | l >> 8L & 0xFF00FFL;
      arrayOfInt[j - i] = (int)((l & 0xFFFFL) << 16L | l >> 16L & 0xFFFFL);
    } 
    i = this.d;
    j = k << 5;
    if (i != j) {
      int m = j - i;
      j = arrayOfInt[0] >>> m;
      for (i = 1; i < k; i++) {
        int n = arrayOfInt[i];
        arrayOfInt[i - 1] = j | n << 32 - m;
        j = n >>> m;
      } 
      arrayOfInt[k - 1] = j;
    } 
    this.c = arrayOfInt;
  }
  
  public void d(int paramInt) {
    int[] arrayOfInt = this.c;
    int i = paramInt / 32;
    arrayOfInt[i] = 1 << (paramInt & 0x1F) | arrayOfInt[i];
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof a))
      return false; 
    paramObject = paramObject;
    return (this.d == ((a)paramObject).d && Arrays.equals(this.c, ((a)paramObject).c));
  }
  
  public int hashCode() {
    return this.d * 31 + Arrays.hashCode(this.c);
  }
  
  public String toString() {
    int i = this.d;
    StringBuilder stringBuilder = new StringBuilder(i + i / 8 + 1);
    for (i = 0; i < this.d; i++) {
      byte b;
      if ((i & 0x7) == 0)
        stringBuilder.append(' '); 
      if (a(i)) {
        b = 88;
      } else {
        b = 46;
      } 
      stringBuilder.append(b);
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/s/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */