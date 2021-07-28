package e.e.e.g;

import java.io.InputStream;

public class i extends InputStream {
  final g c;
  
  int d;
  
  int e;
  
  public i(g paramg) {
    e.e.e.d.i.a(paramg.isClosed() ^ true);
    e.e.e.d.i.a(paramg);
    this.c = paramg;
    this.d = 0;
    this.e = 0;
  }
  
  public int available() {
    return this.c.size() - this.d;
  }
  
  public void mark(int paramInt) {
    this.e = this.d;
  }
  
  public boolean markSupported() {
    return true;
  }
  
  public int read() {
    if (available() <= 0)
      return -1; 
    g g1 = this.c;
    int j = this.d;
    this.d = j + 1;
    return g1.a(j) & 0xFF;
  }
  
  public int read(byte[] paramArrayOfbyte) {
    return read(paramArrayOfbyte, 0, paramArrayOfbyte.length);
  }
  
  public int read(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    if (paramInt1 >= 0 && paramInt2 >= 0 && paramInt1 + paramInt2 <= paramArrayOfbyte.length) {
      int j = available();
      if (j <= 0)
        return -1; 
      if (paramInt2 <= 0)
        return 0; 
      paramInt2 = Math.min(j, paramInt2);
      this.c.a(this.d, paramArrayOfbyte, paramInt1, paramInt2);
      this.d += paramInt2;
      return paramInt2;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("length=");
    stringBuilder.append(paramArrayOfbyte.length);
    stringBuilder.append("; regionStart=");
    stringBuilder.append(paramInt1);
    stringBuilder.append("; regionLength=");
    stringBuilder.append(paramInt2);
    throw new ArrayIndexOutOfBoundsException(stringBuilder.toString());
  }
  
  public void reset() {
    this.d = this.e;
  }
  
  public long skip(long paramLong) {
    boolean bool;
    if (paramLong >= 0L) {
      bool = true;
    } else {
      bool = false;
    } 
    e.e.e.d.i.a(bool);
    int j = Math.min((int)paramLong, available());
    this.d += j;
    return j;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/g/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */