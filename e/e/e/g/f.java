package e.e.e.g;

import e.e.e.d.i;
import e.e.e.e.a;
import e.e.e.h.c;
import java.io.IOException;
import java.io.InputStream;

public class f extends InputStream {
  private final InputStream c;
  
  private final byte[] d;
  
  private final c<byte[]> e;
  
  private int f;
  
  private int g;
  
  private boolean h;
  
  public f(InputStream paramInputStream, byte[] paramArrayOfbyte, c<byte[]> paramc) {
    i.a(paramInputStream);
    this.c = paramInputStream;
    i.a(paramArrayOfbyte);
    this.d = paramArrayOfbyte;
    i.a(paramc);
    this.e = paramc;
    this.f = 0;
    this.g = 0;
    this.h = false;
  }
  
  private boolean a() {
    if (this.g < this.f)
      return true; 
    int i = this.c.read(this.d);
    if (i <= 0)
      return false; 
    this.f = i;
    this.g = 0;
    return true;
  }
  
  private void b() {
    if (!this.h)
      return; 
    throw new IOException("stream already closed");
  }
  
  public int available() {
    boolean bool;
    if (this.g <= this.f) {
      bool = true;
    } else {
      bool = false;
    } 
    i.b(bool);
    b();
    return this.f - this.g + this.c.available();
  }
  
  public void close() {
    if (!this.h) {
      this.h = true;
      this.e.a(this.d);
      super.close();
    } 
  }
  
  protected void finalize() {
    if (!this.h) {
      a.b("PooledByteInputStream", "Finalized without closing");
      close();
    } 
    super.finalize();
  }
  
  public int read() {
    boolean bool;
    if (this.g <= this.f) {
      bool = true;
    } else {
      bool = false;
    } 
    i.b(bool);
    b();
    if (!a())
      return -1; 
    byte[] arrayOfByte = this.d;
    int i = this.g;
    this.g = i + 1;
    return arrayOfByte[i] & 0xFF;
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    boolean bool;
    if (this.g <= this.f) {
      bool = true;
    } else {
      bool = false;
    } 
    i.b(bool);
    b();
    if (!a())
      return -1; 
    paramInt2 = Math.min(this.f - this.g, paramInt2);
    System.arraycopy(this.d, this.g, paramArrayOfbyte, paramInt1, paramInt2);
    this.g += paramInt2;
    return paramInt2;
  }
  
  public long skip(long paramLong) {
    boolean bool;
    if (this.g <= this.f) {
      bool = true;
    } else {
      bool = false;
    } 
    i.b(bool);
    b();
    int i = this.f;
    int j = this.g;
    long l = (i - j);
    if (l >= paramLong) {
      this.g = (int)(j + paramLong);
      return paramLong;
    } 
    this.g = i;
    return l + this.c.skip(paramLong - l);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/g/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */