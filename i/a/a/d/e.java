package i.a.a.d;

import i.a.a.g.b;
import java.io.EOFException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public class e extends f {
  private Inflater m = new Inflater(true);
  
  private byte[] n = new byte[4096];
  
  private byte[] o = new byte[1];
  
  private b p;
  
  private long q;
  
  private long r;
  
  public e(RandomAccessFile paramRandomAccessFile, long paramLong1, long paramLong2, b paramb) {
    super(paramRandomAccessFile, paramLong1, paramLong2, paramb);
    this.p = paramb;
    this.q = 0L;
    this.r = paramb.c().r();
  }
  
  private void c() {
    byte[] arrayOfByte = this.n;
    int i = super.read(arrayOfByte, 0, arrayOfByte.length);
    if (i != -1) {
      this.m.setInput(this.n, 0, i);
      return;
    } 
    throw new EOFException("Unexpected end of ZLIB input stream");
  }
  
  private void d() {
    byte[] arrayOfByte = new byte[1024];
    while (super.read(arrayOfByte, 0, 1024) != -1);
    b();
  }
  
  public b a() {
    return super.a();
  }
  
  public int available() {
    return this.m.finished() ^ true;
  }
  
  public void close() {
    this.m.end();
    super.close();
  }
  
  public int read() {
    return (read(this.o, 0, 1) == -1) ? -1 : (this.o[0] & 0xFF);
  }
  
  public int read(byte[] paramArrayOfbyte) {
    if (paramArrayOfbyte != null)
      return read(paramArrayOfbyte, 0, paramArrayOfbyte.length); 
    throw new NullPointerException("input buffer is null");
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramArrayOfbyte != null) {
      if (paramInt1 >= 0 && paramInt2 >= 0 && paramInt2 <= paramArrayOfbyte.length - paramInt1) {
        if (paramInt2 == 0)
          return 0; 
        try {
          if (this.q >= this.r) {
            d();
            return -1;
          } 
          while (true) {
            int i = this.m.inflate(paramArrayOfbyte, paramInt1, paramInt2);
            if (i == 0) {
              if (!this.m.finished()) {
                if (this.m.needsDictionary()) {
                  d();
                  return -1;
                } 
                if (this.m.needsInput())
                  c(); 
                continue;
              } 
              continue;
            } 
            this.q += i;
            return i;
          } 
        } catch (DataFormatException dataFormatException) {
          String str1;
          if (dataFormatException.getMessage() != null) {
            str1 = dataFormatException.getMessage();
          } else {
            str1 = "Invalid ZLIB data format";
          } 
          b b1 = this.p;
          String str2 = str1;
          if (b1 != null) {
            str2 = str1;
            if (b1.e().q()) {
              str2 = str1;
              if (this.p.e().e() == 0) {
                StringBuilder stringBuilder = new StringBuilder();
                stringBuilder.append(str1);
                stringBuilder.append(" - Wrong Password?");
                str2 = stringBuilder.toString();
              } 
            } 
          } 
          throw new IOException(str2);
        } 
      } 
      throw new IndexOutOfBoundsException();
    } 
    NullPointerException nullPointerException = new NullPointerException("input buffer is null");
    throw nullPointerException;
  }
  
  public long skip(long paramLong) {
    if (paramLong >= 0L) {
      int j = (int)Math.min(paramLong, 2147483647L);
      byte[] arrayOfByte = new byte[512];
      int i;
      for (i = 0; i < j; i += k) {
        int m = j - i;
        int k = m;
        if (m > arrayOfByte.length)
          k = arrayOfByte.length; 
        k = read(arrayOfByte, 0, k);
        if (k == -1)
          break; 
      } 
      return i;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("negative skip length");
    throw illegalArgumentException;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/i/a/a/d/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */