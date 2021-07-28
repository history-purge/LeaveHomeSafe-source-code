package e.f.c.t.b;

final class b {
  private final int a;
  
  private final byte[] b;
  
  private b(int paramInt, byte[] paramArrayOfbyte) {
    this.a = paramInt;
    this.b = paramArrayOfbyte;
  }
  
  static b[] a(byte[] paramArrayOfbyte, e parame) {
    e.c c = parame.c();
    e.b[] arrayOfB = c.a();
    int k = arrayOfB.length;
    int i = 0;
    int j = 0;
    while (i < k) {
      j += arrayOfB[i].a();
      i++;
    } 
    b[] arrayOfB1 = new b[j];
    int m = arrayOfB.length;
    j = 0;
    i = 0;
    while (j < m) {
      e.b b1 = arrayOfB[j];
      k = 0;
      while (k < b1.a()) {
        int i4 = b1.b();
        arrayOfB1[i] = new b(i4, new byte[c.b() + i4]);
        k++;
        i++;
      } 
      j++;
    } 
    int i1 = (arrayOfB1[0]).b.length - c.b();
    int i2 = i1 - 1;
    k = 0;
    j = 0;
    while (k < i2) {
      m = 0;
      while (m < i) {
        (arrayOfB1[m]).b[k] = paramArrayOfbyte[j];
        m++;
        j++;
      } 
      k++;
    } 
    if (parame.g() == 24) {
      m = 1;
    } else {
      m = 0;
    } 
    if (m != 0) {
      k = 8;
    } else {
      k = i;
    } 
    int n = 0;
    while (n < k) {
      (arrayOfB1[n]).b[i2] = paramArrayOfbyte[j];
      n++;
      j++;
    } 
    int i3 = (arrayOfB1[0]).b.length;
    n = j;
    for (j = i1; j < i3; j++) {
      k = 0;
      while (k < i) {
        if (m != 0) {
          i1 = (k + 8) % i;
        } else {
          i1 = k;
        } 
        if (m != 0 && i1 > 7) {
          i2 = j - 1;
        } else {
          i2 = j;
        } 
        (arrayOfB1[i1]).b[i2] = paramArrayOfbyte[n];
        k++;
        n++;
      } 
    } 
    if (n == paramArrayOfbyte.length)
      return arrayOfB1; 
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/t/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */