package e.f.c.s;

import e.f.c.b;
import e.f.c.j;

public class h extends b {
  private static final byte[] d = new byte[0];
  
  private byte[] b = d;
  
  private final int[] c = new int[32];
  
  public h(e.f.c.h paramh) {
    super(paramh);
  }
  
  private static int a(int[] paramArrayOfint) {
    int i3 = paramArrayOfint.length;
    int i2 = 0;
    int k = 0;
    int i1 = 0;
    int n = 0;
    int i = 0;
    while (k < i3) {
      int i4 = i1;
      if (paramArrayOfint[k] > i1) {
        i4 = paramArrayOfint[k];
        i = k;
      } 
      int i5 = n;
      if (paramArrayOfint[k] > n)
        i5 = paramArrayOfint[k]; 
      k++;
      i1 = i4;
      n = i5;
    } 
    k = 0;
    i1 = 0;
    int m = i2;
    while (m < i3) {
      int i4 = m - i;
      i2 = paramArrayOfint[m] * i4 * i4;
      i4 = i1;
      if (i2 > i1) {
        k = m;
        i4 = i2;
      } 
      m++;
      i1 = i4;
    } 
    i1 = k;
    m = i;
    if (i > k) {
      m = k;
      i1 = i;
    } 
    if (i1 - m > i3 / 16) {
      i = i1 - 1;
      i2 = i;
      for (k = -1; i > m; k = i4) {
        int i4 = i - m;
        i3 = i4 * i4 * (i1 - i) * (n - paramArrayOfint[i]);
        i4 = k;
        if (i3 > k) {
          i2 = i;
          i4 = i3;
        } 
        i--;
      } 
      return i2 << 3;
    } 
    j j = j.a();
    throw j;
  }
  
  private void a(int paramInt) {
    if (this.b.length < paramInt)
      this.b = new byte[paramInt]; 
    for (paramInt = 0; paramInt < 32; paramInt++)
      this.c[paramInt] = 0; 
  }
  
  public a a(int paramInt, a parama) {
    e.f.c.h h1 = c();
    int j = h1.c();
    if (parama == null || parama.c() < j) {
      parama = new a(j);
    } else {
      parama.a();
    } 
    a(j);
    byte[] arrayOfByte = h1.a(paramInt, this.b);
    int[] arrayOfInt = this.c;
    int i = 0;
    for (paramInt = 0; paramInt < j; paramInt++) {
      int m = (arrayOfByte[paramInt] & 0xFF) >> 3;
      arrayOfInt[m] = arrayOfInt[m] + 1;
    } 
    int k = a(arrayOfInt);
    if (j < 3) {
      for (paramInt = i; paramInt < j; paramInt++) {
        if ((arrayOfByte[paramInt] & 0xFF) < k)
          parama.d(paramInt); 
      } 
    } else {
      i = arrayOfByte[0];
      paramInt = arrayOfByte[1] & 0xFF;
      int m = i & 0xFF;
      i = 1;
      while (i < j - 1) {
        int i1 = i + 1;
        int n = arrayOfByte[i1] & 0xFF;
        if (((paramInt << 2) - m - n) / 2 < k)
          parama.d(i); 
        m = paramInt;
        i = i1;
        paramInt = n;
      } 
    } 
    return parama;
  }
  
  public b a() {
    e.f.c.h h1 = c();
    int j = h1.c();
    int k = h1.a();
    b b1 = new b(j, k);
    a(j);
    int[] arrayOfInt = this.c;
    int i;
    for (i = 1; i < 5; i++) {
      byte[] arrayOfByte1 = h1.a(k * i / 5, this.b);
      int i1 = (j << 2) / 5;
      for (int n = j / 5; n < i1; n++) {
        int i2 = (arrayOfByte1[n] & 0xFF) >> 3;
        arrayOfInt[i2] = arrayOfInt[i2] + 1;
      } 
    } 
    int m = a(arrayOfInt);
    byte[] arrayOfByte = h1.b();
    for (i = 0; i < k; i++) {
      for (int n = 0; n < j; n++) {
        if ((arrayOfByte[i * j + n] & 0xFF) < m)
          b1.c(n, i); 
      } 
    } 
    return b1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/s/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */