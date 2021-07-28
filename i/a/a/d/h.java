package i.a.a.d;

import i.a.a.c.a;
import java.io.IOException;
import java.io.InputStream;

public class h extends InputStream {
  private a c;
  
  public h(a parama) {
    this.c = parama;
  }
  
  public void a(boolean paramBoolean) {
    try {
      this.c.close();
      if (!paramBoolean && this.c.a() != null)
        this.c.a().a(); 
      return;
    } catch (a a1) {
      throw new IOException(a1.getMessage());
    } 
  }
  
  public int available() {
    return this.c.available();
  }
  
  public void close() {
    a(false);
  }
  
  public int read() {
    int i = this.c.read();
    if (i != -1)
      this.c.a().a(i); 
    return i;
  }
  
  public int read(byte[] paramArrayOfbyte) {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    paramInt2 = this.c.read(paramArrayOfbyte, paramInt1, paramInt2);
    if (paramInt2 > 0 && this.c.a() != null)
      this.c.a().a(paramArrayOfbyte, paramInt1, paramInt2); 
    return paramInt2;
  }
  
  public long skip(long paramLong) {
    return this.c.skip(paramLong);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/d/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */