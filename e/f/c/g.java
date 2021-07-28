package e.f.c;

public final class g extends h {
  private final h c;
  
  public g(h paramh) {
    super(paramh.c(), paramh.a());
    this.c = paramh;
  }
  
  public byte[] a(int paramInt, byte[] paramArrayOfbyte) {
    paramArrayOfbyte = this.c.a(paramInt, paramArrayOfbyte);
    int i = c();
    for (paramInt = 0; paramInt < i; paramInt++)
      paramArrayOfbyte[paramInt] = (byte)(255 - (paramArrayOfbyte[paramInt] & 0xFF)); 
    return paramArrayOfbyte;
  }
  
  public byte[] b() {
    byte[] arrayOfByte1 = this.c.b();
    int j = c() * a();
    byte[] arrayOfByte2 = new byte[j];
    for (int i = 0; i < j; i++)
      arrayOfByte2[i] = (byte)(255 - (arrayOfByte1[i] & 0xFF)); 
    return arrayOfByte2;
  }
  
  public boolean e() {
    return this.c.e();
  }
  
  public h f() {
    return new g(this.c.f());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */