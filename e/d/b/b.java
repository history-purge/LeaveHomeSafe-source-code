package e.d.b;

public class b extends k {
  private final byte[] b;
  
  private final int c;
  
  public b(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, 0);
  }
  
  public b(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte != null) {
      if (paramInt >= 0) {
        this.b = paramArrayOfbyte;
        this.c = paramInt;
        return;
      } 
      throw new IllegalArgumentException("Must be zero or greater");
    } 
    throw new NullPointerException();
  }
  
  public long a() {
    return (this.b.length - this.c);
  }
  
  public byte[] a(int paramInt1, int paramInt2) {
    c(paramInt1, paramInt2);
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(this.b, paramInt1 + this.c, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }
  
  public byte b(int paramInt) {
    c(paramInt, 1);
    return this.b[paramInt + this.c];
  }
  
  protected void c(int paramInt1, int paramInt2) {
    if (d(paramInt1, paramInt2))
      return; 
    throw new a(n(paramInt1), paramInt2, this.b.length);
  }
  
  protected boolean d(int paramInt1, int paramInt2) {
    return (paramInt2 >= 0 && paramInt1 >= 0 && paramInt1 + paramInt2 - 1L < a());
  }
  
  public int n(int paramInt) {
    return paramInt + this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */