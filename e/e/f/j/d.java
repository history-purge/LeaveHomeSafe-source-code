package e.e.f.j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class d extends FilterInputStream {
  private final byte[] c;
  
  private final int d;
  
  private int e;
  
  private boolean f;
  
  protected d(InputStream paramInputStream, int paramInt) {
    super(paramInputStream);
    this.c = new byte[paramInt];
    this.d = paramInt;
  }
  
  private int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.e;
    if (paramInt2 >= i) {
      int k = this.in.read(paramArrayOfbyte, this.e + paramInt1, paramInt2 - i);
      if (k == -1) {
        this.f = true;
        return -1;
      } 
      paramInt2 = this.e;
      if (paramInt2 > 0)
        System.arraycopy(this.c, 0, paramArrayOfbyte, paramInt1, paramInt2); 
      int m = this.e;
      i = this.in.read(this.c, 0, this.d);
      paramInt2 = i;
      if (i == -1) {
        this.f = true;
        paramInt2 = 0;
      } 
      return a(paramArrayOfbyte, m + k, paramInt2, paramInt1);
    } 
    i -= paramInt2;
    System.arraycopy(this.c, 0, paramArrayOfbyte, paramInt1, paramInt2);
    byte[] arrayOfByte = this.c;
    System.arraycopy(arrayOfByte, paramInt2, arrayOfByte, 0, i);
    int j = this.in.read(this.c, i, this.d - i);
    if (j == -1) {
      arrayOfByte = this.c;
      System.arraycopy(arrayOfByte, 0, arrayOfByte, paramInt2, i);
      System.arraycopy(paramArrayOfbyte, paramInt1, this.c, 0, paramInt2);
      this.f = true;
      return -1;
    } 
    return a(paramArrayOfbyte, paramInt2, j + i, paramInt1);
  }
  
  private int a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, int paramInt3) {
    int j = this.d - paramInt2;
    int i = Math.max(0, paramInt1 - j) + paramInt3;
    paramInt1 = Math.min(j, paramInt1);
    if (paramInt1 > 0) {
      if (paramInt2 > 0) {
        byte[] arrayOfByte = this.c;
        System.arraycopy(arrayOfByte, 0, arrayOfByte, paramInt1, paramInt2);
      } 
      System.arraycopy(paramArrayOfbyte, i, this.c, 0, paramInt1);
    } 
    this.e = paramInt1 + paramInt2;
    return i - paramInt3;
  }
  
  public byte[] a() {
    if (this.e == this.d)
      return this.c; 
    throw new IOException("Not enough tail data");
  }
  
  public boolean markSupported() {
    return false;
  }
  
  public int read() {
    byte[] arrayOfByte = new byte[1];
    while (true) {
      int i = read(arrayOfByte, 0, 1);
      if (i == 0)
        continue; 
      return (i == -1) ? -1 : (arrayOfByte[0] & 0xFF);
    } 
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (this.f)
      return -1; 
    int i = 0;
    if (paramInt2 == 0)
      return 0; 
    while (!i)
      i = a(paramArrayOfbyte, paramInt1, paramInt2); 
    return i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/f/j/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */