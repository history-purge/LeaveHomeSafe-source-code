package e.d.b;

import java.io.EOFException;

public class n extends o {
  private final byte[] b;
  
  private int c;
  
  public n(byte[] paramArrayOfbyte) {
    this(paramArrayOfbyte, 0);
  }
  
  public n(byte[] paramArrayOfbyte, int paramInt) {
    if (paramArrayOfbyte != null) {
      this.b = paramArrayOfbyte;
      this.c = paramInt;
      return;
    } 
    throw new NullPointerException();
  }
  
  public int a() {
    return this.b.length - this.c;
  }
  
  public void a(long paramLong) {
    if (paramLong >= 0L) {
      int i = this.c;
      if (i + paramLong <= this.b.length) {
        this.c = (int)(i + paramLong);
        return;
      } 
      throw new EOFException("End of data reached.");
    } 
    throw new IllegalArgumentException("n must be zero or greater.");
  }
  
  public void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.c;
    byte[] arrayOfByte = this.b;
    if (i + paramInt2 <= arrayOfByte.length) {
      System.arraycopy(arrayOfByte, i, paramArrayOfbyte, paramInt1, paramInt2);
      this.c += paramInt2;
      return;
    } 
    throw new EOFException("End of data reached.");
  }
  
  public byte[] a(int paramInt) {
    int i = this.c;
    byte[] arrayOfByte = this.b;
    if (i + paramInt <= arrayOfByte.length) {
      byte[] arrayOfByte1 = new byte[paramInt];
      System.arraycopy(arrayOfByte, i, arrayOfByte1, 0, paramInt);
      this.c += paramInt;
      return arrayOfByte1;
    } 
    throw new EOFException("End of data reached.");
  }
  
  public byte b() {
    int i = this.c;
    byte[] arrayOfByte = this.b;
    if (i < arrayOfByte.length) {
      this.c = i + 1;
      return arrayOfByte[i];
    } 
    throw new EOFException("End of data reached.");
  }
  
  public boolean b(long paramLong) {
    if (paramLong >= 0L) {
      this.c = (int)(this.c + paramLong);
      int i = this.c;
      byte[] arrayOfByte = this.b;
      if (i > arrayOfByte.length) {
        this.c = arrayOfByte.length;
        return false;
      } 
      return true;
    } 
    throw new IllegalArgumentException("n must be zero or greater.");
  }
  
  public long g() {
    return this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */