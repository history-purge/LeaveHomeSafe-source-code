package e.e.e.j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class b extends FilterInputStream {
  private final byte[] c;
  
  private int d;
  
  private int e;
  
  public b(InputStream paramInputStream, byte[] paramArrayOfbyte) {
    super(paramInputStream);
    if (paramInputStream != null) {
      if (paramArrayOfbyte != null) {
        this.c = paramArrayOfbyte;
        return;
      } 
      throw new NullPointerException();
    } 
    throw new NullPointerException();
  }
  
  private int a() {
    int i = this.d;
    byte[] arrayOfByte = this.c;
    if (i >= arrayOfByte.length)
      return -1; 
    this.d = i + 1;
    return arrayOfByte[i] & 0xFF;
  }
  
  public void mark(int paramInt) {
    if (this.in.markSupported()) {
      super.mark(paramInt);
      this.e = this.d;
    } 
  }
  
  public int read() {
    int i = this.in.read();
    return (i != -1) ? i : a();
  }
  
  public int read(byte[] paramArrayOfbyte) {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.in.read(paramArrayOfbyte, paramInt1, paramInt2);
    if (i != -1)
      return i; 
    i = 0;
    if (paramInt2 == 0)
      return 0; 
    while (i < paramInt2) {
      int j = a();
      if (j == -1)
        break; 
      paramArrayOfbyte[paramInt1 + i] = (byte)j;
      i++;
    } 
    return (i > 0) ? i : -1;
  }
  
  public void reset() {
    if (this.in.markSupported()) {
      this.in.reset();
      this.d = this.e;
      return;
    } 
    throw new IOException("mark is not supported");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/j/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */