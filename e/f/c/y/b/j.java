package e.f.c.y.b;

import e.f.c.f;

public final class j {
  private static final int[] e = new int[] { 
      31892, 34236, 39577, 42195, 48118, 51042, 55367, 58893, 63784, 68472, 
      70749, 76311, 79154, 84390, 87683, 92361, 96236, 102084, 102881, 110507, 
      110734, 117786, 119615, 126325, 127568, 133589, 136944, 141498, 145311, 150283, 
      152622, 158308, 161089, 167017 };
  
  private static final j[] f = f();
  
  private final int a;
  
  private final int[] b;
  
  private final b[] c;
  
  private final int d;
  
  private j(int paramInt, int[] paramArrayOfint, b... paramVarArgs) {
    this.a = paramInt;
    this.b = paramArrayOfint;
    this.c = paramVarArgs;
    paramInt = 0;
    int k = paramVarArgs[0].b();
    a[] arrayOfA = paramVarArgs[0].a();
    int m = arrayOfA.length;
    int i = 0;
    while (paramInt < m) {
      a a = arrayOfA[paramInt];
      i += a.a() * (a.b() + k);
      paramInt++;
    } 
    this.d = i;
  }
  
  static j a(int paramInt) {
    int i = 0;
    int k = Integer.MAX_VALUE;
    int m = 0;
    while (true) {
      int[] arrayOfInt = e;
      if (i < arrayOfInt.length) {
        int n = arrayOfInt[i];
        if (n == paramInt)
          return c(i + 7); 
        int i1 = g.c(paramInt, n);
        n = k;
        if (i1 < k) {
          m = i + 7;
          n = i1;
        } 
        i++;
        k = n;
        continue;
      } 
      return (k <= 3) ? c(m) : null;
    } 
  }
  
  public static j b(int paramInt) {
    if (paramInt % 4 == 1)
      try {
        return c((paramInt - 17) / 4);
      } catch (IllegalArgumentException illegalArgumentException) {
        throw f.a();
      }  
    throw f.a();
  }
  
  public static j c(int paramInt) {
    if (paramInt > 0 && paramInt <= 40)
      return f[paramInt - 1]; 
    throw new IllegalArgumentException();
  }
  
  private static j[] f() {
    b b1 = new b(7, new a[] { new a(1, 19) });
    b b2 = new b(10, new a[] { new a(1, 16) });
    b b3 = new b(13, new a[] { new a(1, 13) });
    b b4 = new b(17, new a[] { new a(1, 9) });
    j j1 = new j(1, new int[0], new b[] { b1, b2, b3, b4 });
    b2 = new b(10, new a[] { new a(1, 34) });
    b3 = new b(16, new a[] { new a(1, 28) });
    b4 = new b(22, new a[] { new a(1, 22) });
    b b5 = new b(28, new a[] { new a(1, 16) });
    j j2 = new j(2, new int[] { 6, 18 }, new b[] { b2, b3, b4, b5 });
    b3 = new b(15, new a[] { new a(1, 55) });
    b4 = new b(26, new a[] { new a(1, 44) });
    b5 = new b(18, new a[] { new a(2, 17) });
    b b6 = new b(22, new a[] { new a(2, 13) });
    j j3 = new j(3, new int[] { 6, 22 }, new b[] { b3, b4, b5, b6 });
    b4 = new b(20, new a[] { new a(1, 80) });
    b5 = new b(18, new a[] { new a(2, 32) });
    b6 = new b(26, new a[] { new a(2, 24) });
    b b7 = new b(16, new a[] { new a(4, 9) });
    j j4 = new j(4, new int[] { 6, 26 }, new b[] { b4, b5, b6, b7 });
    b5 = new b(26, new a[] { new a(1, 108) });
    b6 = new b(24, new a[] { new a(2, 43) });
    b7 = new b(18, new a[] { new a(2, 15), new a(2, 16) });
    b b8 = new b(22, new a[] { new a(2, 11), new a(2, 12) });
    j j5 = new j(5, new int[] { 6, 30 }, new b[] { b5, b6, b7, b8 });
    b6 = new b(18, new a[] { new a(2, 68) });
    b7 = new b(16, new a[] { new a(4, 27) });
    b8 = new b(24, new a[] { new a(4, 19) });
    b b9 = new b(28, new a[] { new a(4, 15) });
    j j6 = new j(6, new int[] { 6, 34 }, new b[] { b6, b7, b8, b9 });
    b7 = new b(20, new a[] { new a(2, 78) });
    b8 = new b(18, new a[] { new a(4, 31) });
    b9 = new b(18, new a[] { new a(2, 14), new a(4, 15) });
    b b10 = new b(26, new a[] { new a(4, 13), new a(1, 14) });
    j j7 = new j(7, new int[] { 6, 22, 38 }, new b[] { b7, b8, b9, b10 });
    b8 = new b(24, new a[] { new a(2, 97) });
    b9 = new b(22, new a[] { new a(2, 38), new a(2, 39) });
    b10 = new b(22, new a[] { new a(4, 18), new a(2, 19) });
    b b11 = new b(26, new a[] { new a(4, 14), new a(2, 15) });
    j j8 = new j(8, new int[] { 6, 24, 42 }, new b[] { b8, b9, b10, b11 });
    b9 = new b(30, new a[] { new a(2, 116) });
    b10 = new b(22, new a[] { new a(3, 36), new a(2, 37) });
    b11 = new b(20, new a[] { new a(4, 16), new a(4, 17) });
    b b12 = new b(24, new a[] { new a(4, 12), new a(4, 13) });
    j j9 = new j(9, new int[] { 6, 26, 46 }, new b[] { b9, b10, b11, b12 });
    b10 = new b(18, new a[] { new a(2, 68), new a(2, 69) });
    b11 = new b(26, new a[] { new a(4, 43), new a(1, 44) });
    b12 = new b(24, new a[] { new a(6, 19), new a(2, 20) });
    b b13 = new b(28, new a[] { new a(6, 15), new a(2, 16) });
    j j10 = new j(10, new int[] { 6, 28, 50 }, new b[] { b10, b11, b12, b13 });
    b11 = new b(20, new a[] { new a(4, 81) });
    b12 = new b(30, new a[] { new a(1, 50), new a(4, 51) });
    b13 = new b(28, new a[] { new a(4, 22), new a(4, 23) });
    b b14 = new b(24, new a[] { new a(3, 12), new a(8, 13) });
    j j11 = new j(11, new int[] { 6, 30, 54 }, new b[] { b11, b12, b13, b14 });
    b12 = new b(24, new a[] { new a(2, 92), new a(2, 93) });
    b13 = new b(22, new a[] { new a(6, 36), new a(2, 37) });
    b14 = new b(26, new a[] { new a(4, 20), new a(6, 21) });
    b b15 = new b(28, new a[] { new a(7, 14), new a(4, 15) });
    j j12 = new j(12, new int[] { 6, 32, 58 }, new b[] { b12, b13, b14, b15 });
    b13 = new b(26, new a[] { new a(4, 107) });
    b14 = new b(22, new a[] { new a(8, 37), new a(1, 38) });
    b15 = new b(24, new a[] { new a(8, 20), new a(4, 21) });
    b b16 = new b(22, new a[] { new a(12, 11), new a(4, 12) });
    j j13 = new j(13, new int[] { 6, 34, 62 }, new b[] { b13, b14, b15, b16 });
    b14 = new b(30, new a[] { new a(3, 115), new a(1, 116) });
    b15 = new b(24, new a[] { new a(4, 40), new a(5, 41) });
    b16 = new b(20, new a[] { new a(11, 16), new a(5, 17) });
    b b17 = new b(24, new a[] { new a(11, 12), new a(5, 13) });
    j j14 = new j(14, new int[] { 6, 26, 46, 66 }, new b[] { b14, b15, b16, b17 });
    b15 = new b(22, new a[] { new a(5, 87), new a(1, 88) });
    b16 = new b(24, new a[] { new a(5, 41), new a(5, 42) });
    b17 = new b(30, new a[] { new a(5, 24), new a(7, 25) });
    b b18 = new b(24, new a[] { new a(11, 12), new a(7, 13) });
    j j15 = new j(15, new int[] { 6, 26, 48, 70 }, new b[] { b15, b16, b17, b18 });
    b16 = new b(24, new a[] { new a(5, 98), new a(1, 99) });
    b17 = new b(28, new a[] { new a(7, 45), new a(3, 46) });
    b18 = new b(24, new a[] { new a(15, 19), new a(2, 20) });
    b b19 = new b(30, new a[] { new a(3, 15), new a(13, 16) });
    j j16 = new j(16, new int[] { 6, 26, 50, 74 }, new b[] { b16, b17, b18, b19 });
    b17 = new b(28, new a[] { new a(1, 107), new a(5, 108) });
    b18 = new b(28, new a[] { new a(10, 46), new a(1, 47) });
    b19 = new b(28, new a[] { new a(1, 22), new a(15, 23) });
    b b20 = new b(28, new a[] { new a(2, 14), new a(17, 15) });
    j j17 = new j(17, new int[] { 6, 30, 54, 78 }, new b[] { b17, b18, b19, b20 });
    b18 = new b(30, new a[] { new a(5, 120), new a(1, 121) });
    b19 = new b(26, new a[] { new a(9, 43), new a(4, 44) });
    b20 = new b(28, new a[] { new a(17, 22), new a(1, 23) });
    b b21 = new b(28, new a[] { new a(2, 14), new a(19, 15) });
    j j18 = new j(18, new int[] { 6, 30, 56, 82 }, new b[] { b18, b19, b20, b21 });
    b19 = new b(28, new a[] { new a(3, 113), new a(4, 114) });
    b20 = new b(26, new a[] { new a(3, 44), new a(11, 45) });
    b21 = new b(26, new a[] { new a(17, 21), new a(4, 22) });
    b b22 = new b(26, new a[] { new a(9, 13), new a(16, 14) });
    j j19 = new j(19, new int[] { 6, 30, 58, 86 }, new b[] { b19, b20, b21, b22 });
    b20 = new b(28, new a[] { new a(3, 107), new a(5, 108) });
    b21 = new b(26, new a[] { new a(3, 41), new a(13, 42) });
    b22 = new b(30, new a[] { new a(15, 24), new a(5, 25) });
    b b23 = new b(28, new a[] { new a(15, 15), new a(10, 16) });
    j j20 = new j(20, new int[] { 6, 34, 62, 90 }, new b[] { b20, b21, b22, b23 });
    b21 = new b(28, new a[] { new a(4, 116), new a(4, 117) });
    b22 = new b(26, new a[] { new a(17, 42) });
    b23 = new b(28, new a[] { new a(17, 22), new a(6, 23) });
    b b24 = new b(30, new a[] { new a(19, 16), new a(6, 17) });
    j j21 = new j(21, new int[] { 6, 28, 50, 72, 94 }, new b[] { b21, b22, b23, b24 });
    b22 = new b(28, new a[] { new a(2, 111), new a(7, 112) });
    b23 = new b(28, new a[] { new a(17, 46) });
    b24 = new b(30, new a[] { new a(7, 24), new a(16, 25) });
    b b25 = new b(24, new a[] { new a(34, 13) });
    j j22 = new j(22, new int[] { 6, 26, 50, 74, 98 }, new b[] { b22, b23, b24, b25 });
    b23 = new b(30, new a[] { new a(4, 121), new a(5, 122) });
    b24 = new b(28, new a[] { new a(4, 47), new a(14, 48) });
    b25 = new b(30, new a[] { new a(11, 24), new a(14, 25) });
    b b26 = new b(30, new a[] { new a(16, 15), new a(14, 16) });
    j j23 = new j(23, new int[] { 6, 30, 54, 78, 102 }, new b[] { b23, b24, b25, b26 });
    b24 = new b(30, new a[] { new a(6, 117), new a(4, 118) });
    b25 = new b(28, new a[] { new a(6, 45), new a(14, 46) });
    b26 = new b(30, new a[] { new a(11, 24), new a(16, 25) });
    b b27 = new b(30, new a[] { new a(30, 16), new a(2, 17) });
    j j24 = new j(24, new int[] { 6, 28, 54, 80, 106 }, new b[] { b24, b25, b26, b27 });
    b25 = new b(26, new a[] { new a(8, 106), new a(4, 107) });
    b26 = new b(28, new a[] { new a(8, 47), new a(13, 48) });
    b27 = new b(30, new a[] { new a(7, 24), new a(22, 25) });
    b b28 = new b(30, new a[] { new a(22, 15), new a(13, 16) });
    j j25 = new j(25, new int[] { 6, 32, 58, 84, 110 }, new b[] { b25, b26, b27, b28 });
    b26 = new b(28, new a[] { new a(10, 114), new a(2, 115) });
    b27 = new b(28, new a[] { new a(19, 46), new a(4, 47) });
    b28 = new b(28, new a[] { new a(28, 22), new a(6, 23) });
    b b29 = new b(30, new a[] { new a(33, 16), new a(4, 17) });
    j j26 = new j(26, new int[] { 6, 30, 58, 86, 114 }, new b[] { b26, b27, b28, b29 });
    b27 = new b(30, new a[] { new a(8, 122), new a(4, 123) });
    b28 = new b(28, new a[] { new a(22, 45), new a(3, 46) });
    b29 = new b(30, new a[] { new a(8, 23), new a(26, 24) });
    b b30 = new b(30, new a[] { new a(12, 15), new a(28, 16) });
    j j27 = new j(27, new int[] { 6, 34, 62, 90, 118 }, new b[] { b27, b28, b29, b30 });
    b28 = new b(30, new a[] { new a(3, 117), new a(10, 118) });
    b29 = new b(28, new a[] { new a(3, 45), new a(23, 46) });
    b30 = new b(30, new a[] { new a(4, 24), new a(31, 25) });
    b b31 = new b(30, new a[] { new a(11, 15), new a(31, 16) });
    j j28 = new j(28, new int[] { 6, 26, 50, 74, 98, 122 }, new b[] { b28, b29, b30, b31 });
    b29 = new b(30, new a[] { new a(7, 116), new a(7, 117) });
    b30 = new b(28, new a[] { new a(21, 45), new a(7, 46) });
    b31 = new b(30, new a[] { new a(1, 23), new a(37, 24) });
    b b32 = new b(30, new a[] { new a(19, 15), new a(26, 16) });
    j j29 = new j(29, new int[] { 6, 30, 54, 78, 102, 126 }, new b[] { b29, b30, b31, b32 });
    b30 = new b(30, new a[] { new a(5, 115), new a(10, 116) });
    b31 = new b(28, new a[] { new a(19, 47), new a(10, 48) });
    b32 = new b(30, new a[] { new a(15, 24), new a(25, 25) });
    b b33 = new b(30, new a[] { new a(23, 15), new a(25, 16) });
    j j30 = new j(30, new int[] { 6, 26, 52, 78, 104, 130 }, new b[] { b30, b31, b32, b33 });
    b31 = new b(30, new a[] { new a(13, 115), new a(3, 116) });
    b32 = new b(28, new a[] { new a(2, 46), new a(29, 47) });
    b33 = new b(30, new a[] { new a(42, 24), new a(1, 25) });
    b b34 = new b(30, new a[] { new a(23, 15), new a(28, 16) });
    j j31 = new j(31, new int[] { 6, 30, 56, 82, 108, 134 }, new b[] { b31, b32, b33, b34 });
    b32 = new b(30, new a[] { new a(17, 115) });
    b33 = new b(28, new a[] { new a(10, 46), new a(23, 47) });
    b34 = new b(30, new a[] { new a(10, 24), new a(35, 25) });
    b b35 = new b(30, new a[] { new a(19, 15), new a(35, 16) });
    j j32 = new j(32, new int[] { 6, 34, 60, 86, 112, 138 }, new b[] { b32, b33, b34, b35 });
    b33 = new b(30, new a[] { new a(17, 115), new a(1, 116) });
    b34 = new b(28, new a[] { new a(14, 46), new a(21, 47) });
    b35 = new b(30, new a[] { new a(29, 24), new a(19, 25) });
    b b36 = new b(30, new a[] { new a(11, 15), new a(46, 16) });
    j j33 = new j(33, new int[] { 6, 30, 58, 86, 114, 142 }, new b[] { b33, b34, b35, b36 });
    b34 = new b(30, new a[] { new a(13, 115), new a(6, 116) });
    b35 = new b(28, new a[] { new a(14, 46), new a(23, 47) });
    b36 = new b(30, new a[] { new a(44, 24), new a(7, 25) });
    b b37 = new b(30, new a[] { new a(59, 16), new a(1, 17) });
    j j34 = new j(34, new int[] { 6, 34, 62, 90, 118, 146 }, new b[] { b34, b35, b36, b37 });
    b35 = new b(30, new a[] { new a(12, 121), new a(7, 122) });
    b36 = new b(28, new a[] { new a(12, 47), new a(26, 48) });
    b37 = new b(30, new a[] { new a(39, 24), new a(14, 25) });
    b b38 = new b(30, new a[] { new a(22, 15), new a(41, 16) });
    j j35 = new j(35, new int[] { 6, 30, 54, 78, 102, 126, 150 }, new b[] { b35, b36, b37, b38 });
    b36 = new b(30, new a[] { new a(6, 121), new a(14, 122) });
    b37 = new b(28, new a[] { new a(6, 47), new a(34, 48) });
    b38 = new b(30, new a[] { new a(46, 24), new a(10, 25) });
    b b39 = new b(30, new a[] { new a(2, 15), new a(64, 16) });
    j j36 = new j(36, new int[] { 6, 24, 50, 76, 102, 128, 154 }, new b[] { b36, b37, b38, b39 });
    b37 = new b(30, new a[] { new a(17, 122), new a(4, 123) });
    b38 = new b(28, new a[] { new a(29, 46), new a(14, 47) });
    b39 = new b(30, new a[] { new a(49, 24), new a(10, 25) });
    b b40 = new b(30, new a[] { new a(24, 15), new a(46, 16) });
    j j37 = new j(37, new int[] { 6, 28, 54, 80, 106, 132, 158 }, new b[] { b37, b38, b39, b40 });
    b38 = new b(30, new a[] { new a(4, 122), new a(18, 123) });
    b39 = new b(28, new a[] { new a(13, 46), new a(32, 47) });
    b40 = new b(30, new a[] { new a(48, 24), new a(14, 25) });
    b b41 = new b(30, new a[] { new a(42, 15), new a(32, 16) });
    j j38 = new j(38, new int[] { 6, 32, 58, 84, 110, 136, 162 }, new b[] { b38, b39, b40, b41 });
    b39 = new b(30, new a[] { new a(20, 117), new a(4, 118) });
    b40 = new b(28, new a[] { new a(40, 47), new a(7, 48) });
    b41 = new b(30, new a[] { new a(43, 24), new a(22, 25) });
    b b42 = new b(30, new a[] { new a(10, 15), new a(67, 16) });
    j j39 = new j(39, new int[] { 6, 26, 54, 82, 110, 138, 166 }, new b[] { b39, b40, b41, b42 });
    b40 = new b(30, new a[] { new a(19, 118), new a(6, 119) });
    b41 = new b(28, new a[] { new a(18, 47), new a(31, 48) });
    b42 = new b(30, new a[] { new a(34, 24), new a(34, 25) });
    b b43 = new b(30, new a[] { new a(20, 15), new a(61, 16) });
    return new j[] { 
        j1, j2, j3, j4, j5, j6, j7, j8, j9, j10, 
        j11, j12, j13, j14, j15, j16, j17, j18, j19, j20, 
        j21, j22, j23, j24, j25, j26, j27, j28, j29, j30, 
        j31, j32, j33, j34, j35, j36, j37, j38, j39, new j(40, new int[] { 6, 30, 58, 86, 114, 142, 170 }, new b[] { b40, b41, b42, b43 }) };
  }
  
  e.f.c.s.b a() {
    int k = c();
    e.f.c.s.b b1 = new e.f.c.s.b(k);
    b1.a(0, 0, 9, 9);
    int i = k - 8;
    b1.a(i, 0, 8, 9);
    b1.a(0, i, 9, 8);
    int m = this.b.length;
    for (i = 0; i < m; i++) {
      int i1 = this.b[i];
      for (int n = 0; n < m; n++) {
        if ((i != 0 || (n != 0 && n != m - 1)) && (i != m - 1 || n != 0))
          b1.a(this.b[n] - 2, i1 - 2, 5, 5); 
      } 
    } 
    i = k - 17;
    b1.a(6, 9, 1, i);
    b1.a(9, 6, i, 1);
    if (this.a > 6) {
      i = k - 11;
      b1.a(i, 0, 3, 6);
      b1.a(0, i, 6, 3);
    } 
    return b1;
  }
  
  public b a(f paramf) {
    return this.c[paramf.ordinal()];
  }
  
  public int[] b() {
    return this.b;
  }
  
  public int c() {
    return this.a * 4 + 17;
  }
  
  public int d() {
    return this.d;
  }
  
  public int e() {
    return this.a;
  }
  
  public String toString() {
    return String.valueOf(this.a);
  }
  
  public static final class a {
    private final int a;
    
    private final int b;
    
    a(int param1Int1, int param1Int2) {
      this.a = param1Int1;
      this.b = param1Int2;
    }
    
    public int a() {
      return this.a;
    }
    
    public int b() {
      return this.b;
    }
  }
  
  public static final class b {
    private final int a;
    
    private final j.a[] b;
    
    b(int param1Int, j.a... param1VarArgs) {
      this.a = param1Int;
      this.b = param1VarArgs;
    }
    
    public j.a[] a() {
      return this.b;
    }
    
    public int b() {
      return this.a;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */