package e.f.c.s;

import e.f.c.b;
import e.f.c.h;
import java.lang.reflect.Array;

public final class j extends h {
  private b e;
  
  public j(h paramh) {
    super(paramh);
  }
  
  private static int a(int paramInt1, int paramInt2, int paramInt3) {
    return (paramInt1 < paramInt2) ? paramInt2 : ((paramInt1 > paramInt3) ? paramInt3 : paramInt1);
  }
  
  private static void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, b paramb) {
    int i = paramInt2 * paramInt4 + paramInt1;
    int k = 0;
    while (k < 8) {
      int m;
      for (m = 0; m < 8; m++) {
        if ((paramArrayOfbyte[i + m] & 0xFF) <= paramInt3)
          paramb.c(paramInt1 + m, paramInt2 + k); 
      } 
      k++;
      i += paramInt4;
    } 
  }
  
  private static void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[][] paramArrayOfint, b paramb) {
    int i = paramInt4 - 8;
    int k = paramInt3 - 8;
    for (paramInt4 = 0; paramInt4 < paramInt2; paramInt4++) {
      int m = paramInt4 << 3;
      if (m > i)
        m = i; 
      int i1 = a(paramInt4, 2, paramInt2 - 3);
      int n;
      for (n = 0; n < paramInt1; n++) {
        int i2 = n << 3;
        if (i2 > k)
          i2 = k; 
        int i5 = a(n, 2, paramInt1 - 3);
        int i3 = -2;
        int i4 = 0;
        while (i3 <= 2) {
          int[] arrayOfInt = paramArrayOfint[i1 + i3];
          i4 += arrayOfInt[i5 - 2] + arrayOfInt[i5 - 1] + arrayOfInt[i5] + arrayOfInt[i5 + 1] + arrayOfInt[i5 + 2];
          i3++;
        } 
        a(paramArrayOfbyte, i2, m, i4 / 25, paramInt3, paramb);
      } 
    } 
  }
  
  private static int[][] a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4) {
    int i = 8;
    int m = paramInt4 - 8;
    int n = paramInt3 - 8;
    int[][] arrayOfInt = (int[][])Array.newInstance(int.class, new int[] { paramInt2, paramInt1 });
    int k;
    for (k = 0; k < paramInt2; k++) {
      paramInt4 = k << 3;
      int i1 = paramInt4;
      if (paramInt4 > m)
        i1 = m; 
      int i2;
      for (i2 = 0; i2 < paramInt1; i2++) {
        int i3 = i2 << 3;
        paramInt4 = i3;
        if (i3 > n)
          paramInt4 = n; 
        i3 = i1 * paramInt3 + paramInt4;
        int i4 = 0;
        paramInt4 = 0;
        int i5 = 0;
        int i6 = 255;
        while (i4 < i) {
          int i8;
          int i7 = 0;
          while (i7 < i) {
            i = paramArrayOfbyte[i3 + i7] & 0xFF;
            i8 = paramInt4 + i;
            paramInt4 = i6;
            if (i < i6)
              paramInt4 = i; 
            i6 = i5;
            if (i > i5)
              i6 = i; 
            i7++;
            i = 8;
            i5 = i6;
            i6 = paramInt4;
            paramInt4 = i8;
          } 
          if (i5 - i6 > 24) {
            i = i4 + 1;
            i3 += paramInt3;
            i4 = paramInt4;
            paramInt4 = i3;
            i3 = i;
            while (true) {
              i8 = i3;
              i7 = paramInt4;
              i = i4;
              if (i3 < 8) {
                for (i = 0; i < 8; i++)
                  i4 += paramArrayOfbyte[paramInt4 + i] & 0xFF; 
                i3++;
                paramInt4 += paramInt3;
                continue;
              } 
              break;
            } 
          } else {
            i = paramInt4;
            i7 = i3;
            i8 = i4;
          } 
          i4 = 8;
          paramInt4 = i;
          i8++;
          i3 = i7 + paramInt3;
          i = i4;
          i4 = i8;
        } 
        paramInt4 >>= 6;
        if (i5 - i6 <= 24) {
          i3 = i6 / 2;
          paramInt4 = i3;
          if (k > 0) {
            paramInt4 = i3;
            if (i2 > 0) {
              paramInt4 = k - 1;
              i4 = arrayOfInt[paramInt4][i2];
              int[] arrayOfInt1 = arrayOfInt[k];
              i5 = i2 - 1;
              i4 = (i4 + arrayOfInt1[i5] * 2 + arrayOfInt[paramInt4][i5]) / 4;
              paramInt4 = i3;
              if (i6 < i4)
                paramInt4 = i4; 
            } 
          } 
        } 
        arrayOfInt[k][i2] = paramInt4;
      } 
    } 
    return arrayOfInt;
  }
  
  public b a(h paramh) {
    return new j(paramh);
  }
  
  public b a() {
    b b1;
    b b2 = this.e;
    if (b2 != null)
      return b2; 
    h h1 = c();
    int i = h1.c();
    int k = h1.a();
    if (i >= 40 && k >= 40) {
      byte[] arrayOfByte = h1.b();
      int n = i >> 3;
      int m = n;
      if ((i & 0x7) != 0)
        m = n + 1; 
      int i1 = k >> 3;
      n = i1;
      if ((k & 0x7) != 0)
        n = i1 + 1; 
      int[][] arrayOfInt = a(arrayOfByte, m, n, i, k);
      b1 = new b(i, k);
      a(arrayOfByte, m, n, i, k, arrayOfInt, b1);
    } else {
      b1 = super.a();
    } 
    this.e = b1;
    return this.e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/s/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */