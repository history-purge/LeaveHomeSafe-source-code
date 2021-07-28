package e.f.c.y.b;

final class g {
  private static final int[][] c;
  
  private final f a;
  
  private final byte b;
  
  static {
    int[] arrayOfInt1 = { 24188, 2 };
    int[] arrayOfInt2 = { 23371, 3 };
    int[] arrayOfInt3 = { 30660, 8 };
    int[] arrayOfInt4 = { 25368, 13 };
    int[] arrayOfInt5 = { 27713, 14 };
    int[] arrayOfInt6 = { 26998, 15 };
    int[] arrayOfInt7 = { 5054, 17 };
    int[] arrayOfInt8 = { 1890, 20 };
    int[] arrayOfInt9 = { 597, 21 };
    int[] arrayOfInt10 = { 12392, 25 };
    int[] arrayOfInt11 = { 16177, 26 };
    int[] arrayOfInt12 = { 14854, 27 };
    int[] arrayOfInt13 = { 9396, 28 };
    int[] arrayOfInt14 = { 11994, 30 };
    c = new int[][] { 
        { 21522, 0 }, { 20773, 1 }, arrayOfInt1, arrayOfInt2, { 17913, 4 }, { 16590, 5 }, { 20375, 6 }, { 19104, 7 }, arrayOfInt3, { 29427, 9 }, 
        { 32170, 10 }, { 30877, 11 }, { 26159, 12 }, arrayOfInt4, arrayOfInt5, arrayOfInt6, { 5769, 16 }, arrayOfInt7, { 7399, 18 }, { 6608, 19 }, 
        arrayOfInt8, arrayOfInt9, { 3340, 22 }, { 2107, 23 }, { 13663, 24 }, arrayOfInt10, arrayOfInt11, arrayOfInt12, arrayOfInt13, { 8579, 29 }, 
        arrayOfInt14, { 11245, 31 } };
  }
  
  private g(int paramInt) {
    this.a = f.f(paramInt >> 3 & 0x3);
    this.b = (byte)(paramInt & 0x7);
  }
  
  static g a(int paramInt1, int paramInt2) {
    g g1 = b(paramInt1, paramInt2);
    return (g1 != null) ? g1 : b(paramInt1 ^ 0x5412, paramInt2 ^ 0x5412);
  }
  
  private static g b(int paramInt1, int paramInt2) {
    int[][] arrayOfInt = c;
    int m = arrayOfInt.length;
    int k = 0;
    int j = Integer.MAX_VALUE;
    int i;
    for (i = 0; k < m; i = i1) {
      int[] arrayOfInt1 = arrayOfInt[k];
      int i2 = arrayOfInt1[0];
      if (i2 == paramInt1 || i2 == paramInt2)
        return new g(arrayOfInt1[1]); 
      int i1 = c(paramInt1, i2);
      int n = j;
      if (i1 < j) {
        i = arrayOfInt1[1];
        n = i1;
      } 
      j = n;
      i1 = i;
      if (paramInt1 != paramInt2) {
        i2 = c(paramInt2, i2);
        j = n;
        i1 = i;
        if (i2 < n) {
          i1 = arrayOfInt1[1];
          j = i2;
        } 
      } 
      k++;
    } 
    return (j <= 3) ? new g(i) : null;
  }
  
  static int c(int paramInt1, int paramInt2) {
    return Integer.bitCount(paramInt1 ^ paramInt2);
  }
  
  byte a() {
    return this.b;
  }
  
  f b() {
    return this.a;
  }
  
  public boolean equals(Object paramObject) {
    if (!(paramObject instanceof g))
      return false; 
    paramObject = paramObject;
    return (this.a == ((g)paramObject).a && this.b == ((g)paramObject).b);
  }
  
  public int hashCode() {
    return this.a.ordinal() << 3 | this.b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/b/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */