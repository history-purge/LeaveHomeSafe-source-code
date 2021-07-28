package e.f.c.y.b;

final class b {
  private final int a;
  
  private final byte[] b;
  
  private b(int paramInt, byte[] paramArrayOfbyte) {
    this.a = paramInt;
    this.b = paramArrayOfbyte;
  }
  
  static b[] a(byte[] paramArrayOfbyte, j paramj, f paramf) {
    if (paramArrayOfbyte.length == paramj.d()) {
      j.b b1 = paramj.a(paramf);
      j.a[] arrayOfA = b1.a();
      int m = arrayOfA.length;
      int i = 0;
      int k = 0;
      while (i < m) {
        k += arrayOfA[i].a();
        i++;
      } 
      b[] arrayOfB = new b[k];
      int n = arrayOfA.length;
      m = 0;
      for (k = 0; m < n; k = i) {
        j.a a = arrayOfA[m];
        i = k;
        k = 0;
        while (k < a.a()) {
          int i4 = a.b();
          arrayOfB[i] = new b(i4, new byte[b1.b() + i4]);
          k++;
          i++;
        } 
        m++;
      } 
      m = (arrayOfB[0]).b.length;
      for (i = arrayOfB.length - 1; i >= 0 && (arrayOfB[i]).b.length != m; i--);
      int i2 = i + 1;
      int i1 = m - b1.b();
      m = 0;
      i = 0;
      while (m < i1) {
        n = 0;
        while (n < k) {
          (arrayOfB[n]).b[m] = paramArrayOfbyte[i];
          n++;
          i++;
        } 
        m++;
      } 
      n = i2;
      for (m = i; n < k; m++) {
        (arrayOfB[n]).b[i1] = paramArrayOfbyte[m];
        n++;
      } 
      int i3 = (arrayOfB[0]).b.length;
      for (i = i1; i < i3; i++) {
        n = 0;
        while (n < k) {
          if (n < i2) {
            i1 = i;
          } else {
            i1 = i + 1;
          } 
          (arrayOfB[n]).b[i1] = paramArrayOfbyte[m];
          n++;
          m++;
        } 
      } 
      return arrayOfB;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
    throw illegalArgumentException;
  }
  
  byte[] a() {
    return this.b;
  }
  
  int b() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/y/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */