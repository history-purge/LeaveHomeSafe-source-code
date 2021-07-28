package e.f.c;

public final class k extends h {
  private final byte[] c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  private final int g;
  
  public k(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, boolean paramBoolean) {
    super(paramInt5, paramInt6);
    if (paramInt3 + paramInt5 <= paramInt1 && paramInt4 + paramInt6 <= paramInt2) {
      this.c = paramArrayOfbyte;
      this.d = paramInt1;
      this.e = paramInt2;
      this.f = paramInt3;
      this.g = paramInt4;
      if (paramBoolean)
        a(paramInt5, paramInt6); 
      return;
    } 
    throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
  }
  
  private void a(int paramInt1, int paramInt2) {
    byte[] arrayOfByte = this.c;
    int i = this.g * this.d + this.f;
    int j = 0;
    while (j < paramInt2) {
      int i1 = paramInt1 / 2;
      int m = i + paramInt1 - 1;
      int n = i;
      while (n < i1 + i) {
        byte b = arrayOfByte[n];
        arrayOfByte[n] = arrayOfByte[m];
        arrayOfByte[m] = b;
        n++;
        m--;
      } 
      j++;
      i += this.d;
    } 
  }
  
  public byte[] a(int paramInt, byte[] paramArrayOfbyte) {
    int i;
    if (paramInt >= 0 && paramInt < a()) {
      i = c();
      if (paramArrayOfbyte != null) {
        byte[] arrayOfByte1 = paramArrayOfbyte;
        if (paramArrayOfbyte.length < i) {
          arrayOfByte1 = new byte[i];
          int i4 = this.g;
          int i5 = this.d;
          int i6 = this.f;
          System.arraycopy(this.c, (paramInt + i4) * i5 + i6, arrayOfByte1, 0, i);
          return arrayOfByte1;
        } 
        int i1 = this.g;
        int i2 = this.d;
        int i3 = this.f;
        System.arraycopy(this.c, (paramInt + i1) * i2 + i3, arrayOfByte1, 0, i);
        return arrayOfByte1;
      } 
    } else {
      throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(paramInt)));
    } 
    byte[] arrayOfByte = new byte[i];
    int j = this.g;
    int m = this.d;
    int n = this.f;
    System.arraycopy(this.c, (paramInt + j) * m + n, arrayOfByte, 0, i);
    return arrayOfByte;
  }
  
  public byte[] b() {
    int n = c();
    int i1 = a();
    if (n == this.d && i1 == this.e)
      return this.c; 
    int i2 = n * i1;
    byte[] arrayOfByte = new byte[i2];
    int i = this.g;
    int i3 = this.d;
    int m = i * i3 + this.f;
    int j = 0;
    i = m;
    if (n == i3) {
      System.arraycopy(this.c, m, arrayOfByte, 0, i2);
      return arrayOfByte;
    } 
    while (j < i1) {
      System.arraycopy(this.c, i, arrayOfByte, j * n, n);
      i += this.d;
      j++;
    } 
    return arrayOfByte;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */