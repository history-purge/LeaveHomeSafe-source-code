package e.e.e.j;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class a extends FilterInputStream {
  private int c;
  
  private int d;
  
  public a(InputStream paramInputStream, int paramInt) {
    super(paramInputStream);
    if (paramInputStream != null) {
      if (paramInt >= 0) {
        this.c = paramInt;
        this.d = -1;
        return;
      } 
      throw new IllegalArgumentException("limit must be >= 0");
    } 
    throw new NullPointerException();
  }
  
  public int available() {
    return Math.min(this.in.available(), this.c);
  }
  
  public void mark(int paramInt) {
    if (this.in.markSupported()) {
      this.in.mark(paramInt);
      this.d = this.c;
    } 
  }
  
  public int read() {
    if (this.c == 0)
      return -1; 
    int i = this.in.read();
    if (i != -1)
      this.c--; 
    return i;
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = this.c;
    if (i == 0)
      return -1; 
    paramInt2 = Math.min(paramInt2, i);
    paramInt1 = this.in.read(paramArrayOfbyte, paramInt1, paramInt2);
    if (paramInt1 > 0)
      this.c -= paramInt1; 
    return paramInt1;
  }
  
  public void reset() {
    if (this.in.markSupported()) {
      if (this.d != -1) {
        this.in.reset();
        this.c = this.d;
        return;
      } 
      throw new IOException("mark not set");
    } 
    throw new IOException("mark is not supported");
  }
  
  public long skip(long paramLong) {
    paramLong = Math.min(paramLong, this.c);
    paramLong = this.in.skip(paramLong);
    this.c = (int)(this.c - paramLong);
    return paramLong;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/j/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */