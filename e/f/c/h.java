package e.f.c;

public abstract class h {
  private final int a;
  
  private final int b;
  
  protected h(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public final int a() {
    return this.b;
  }
  
  public abstract byte[] a(int paramInt, byte[] paramArrayOfbyte);
  
  public abstract byte[] b();
  
  public final int c() {
    return this.a;
  }
  
  public h d() {
    return new g(this);
  }
  
  public boolean e() {
    return false;
  }
  
  public h f() {
    throw new UnsupportedOperationException("This luminance source does not support rotation by 90 degrees.");
  }
  
  public final String toString() {
    int i = this.a;
    byte[] arrayOfByte = new byte[i];
    StringBuilder stringBuilder = new StringBuilder(this.b * (i + 1));
    for (i = 0; i < this.b; i++) {
      arrayOfByte = a(i, arrayOfByte);
      for (int j = 0; j < this.a; j++) {
        byte b;
        int k = arrayOfByte[j] & 0xFF;
        if (k < 64) {
          b = 35;
        } else if (k < 128) {
          b = 43;
        } else if (k < 192) {
          b = 46;
        } else {
          b = 32;
        } 
        stringBuilder.append(b);
      } 
      stringBuilder.append('\n');
    } 
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */