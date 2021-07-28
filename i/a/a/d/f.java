package i.a.a.d;

import i.a.a.b.a;
import i.a.a.b.c;
import i.a.a.c.a;
import i.a.a.g.b;
import java.io.IOException;
import java.io.RandomAccessFile;

public class f extends a {
  private RandomAccessFile c;
  
  private long d;
  
  private long e;
  
  private b f;
  
  private c g;
  
  private byte[] h;
  
  private byte[] i;
  
  private int j;
  
  private boolean k;
  
  private int l;
  
  public f(RandomAccessFile paramRandomAccessFile, long paramLong1, long paramLong2, b paramb) {
    boolean bool = true;
    this.h = new byte[1];
    this.i = new byte[16];
    this.j = 0;
    this.k = false;
    this.l = -1;
    this.c = paramRandomAccessFile;
    this.f = paramb;
    this.g = paramb.b();
    this.d = 0L;
    this.e = paramLong2;
    if (!paramb.c().w() || paramb.c().g() != 99)
      bool = false; 
    this.k = bool;
  }
  
  public b a() {
    return this.f;
  }
  
  public int available() {
    long l = this.e - this.d;
    return (l > 2147483647L) ? Integer.MAX_VALUE : (int)l;
  }
  
  protected void b() {
    if (this.k) {
      c c1 = this.g;
      if (c1 != null && c1 instanceof a) {
        if (((a)c1).d() != null)
          return; 
        byte[] arrayOfByte = new byte[10];
        int i = this.c.read(arrayOfByte);
        if (i != 10)
          if (this.f.f().j()) {
            this.c.close();
            this.c = this.f.g();
            this.c.read(arrayOfByte, i, 10 - i);
          } else {
            throw new IOException("Error occured while reading stored AES authentication bytes");
          }  
        ((a)this.f.b()).a(arrayOfByte);
      } 
    } 
  }
  
  public void close() {
    this.c.close();
  }
  
  public int read() {
    if (this.d >= this.e)
      return -1; 
    if (this.k) {
      int i = this.j;
      if (i == 0 || i == 16) {
        if (read(this.i) == -1)
          return -1; 
        this.j = 0;
      } 
      byte[] arrayOfByte = this.i;
      i = this.j;
      this.j = i + 1;
      return arrayOfByte[i] & 0xFF;
    } 
    return (read(this.h, 0, 1) == -1) ? -1 : (this.h[0] & 0xFF);
  }
  
  public int read(byte[] paramArrayOfbyte) {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    RandomAccessFile randomAccessFile;
    c c1;
    long l1 = paramInt2;
    long l2 = this.e;
    long l3 = this.d;
    if (l1 > l2 - l3) {
      int j = (int)(l2 - l3);
      paramInt2 = j;
      if (j == 0) {
        b();
        return -1;
      } 
    } 
    int i = paramInt2;
    if (this.f.b() instanceof a) {
      i = paramInt2;
      if (this.d + paramInt2 < this.e) {
        int j = paramInt2 % 16;
        i = paramInt2;
        if (j != 0)
          i = paramInt2 - j; 
      } 
    } 
    synchronized (this.c) {
      this.l = this.c.read(paramArrayOfbyte, paramInt1, i);
      if (this.l < i && this.f.f().j()) {
        this.c.close();
        this.c = this.f.g();
        if (this.l < 0)
          this.l = 0; 
        paramInt2 = this.c.read(paramArrayOfbyte, this.l, i - this.l);
        if (paramInt2 > 0)
          this.l += paramInt2; 
      } 
      paramInt2 = this.l;
      if (paramInt2 > 0) {
        c1 = this.g;
        if (c1 != null)
          try {
            c1.a(paramArrayOfbyte, paramInt1, paramInt2);
          } catch (a a1) {
            throw new IOException(a1.getMessage());
          }  
        this.d += this.l;
      } 
      if (this.d >= this.e)
        b(); 
      return this.l;
    } 
  }
  
  public long skip(long paramLong) {
    if (paramLong >= 0L) {
      long l2 = this.e;
      long l3 = this.d;
      long l1 = paramLong;
      if (paramLong > l2 - l3)
        l1 = l2 - l3; 
      this.d += l1;
      return l1;
    } 
    throw new IllegalArgumentException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */