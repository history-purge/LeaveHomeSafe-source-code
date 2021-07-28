package e.d.b;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class p extends o {
  private final InputStream b;
  
  private long c;
  
  public p(InputStream paramInputStream) {
    if (paramInputStream != null) {
      this.b = paramInputStream;
      this.c = 0L;
      return;
    } 
    throw new NullPointerException();
  }
  
  private long c(long paramLong) {
    long l2;
    long l1 = 0L;
    while (true) {
      l2 = l1;
      if (l1 != paramLong) {
        long l = this.b.skip(paramLong - l1);
        l2 = l1 + l;
        l1 = l2;
        if (l == 0L)
          break; 
        continue;
      } 
      break;
    } 
    this.c += l2;
    return l2;
  }
  
  public int a() {
    try {
      return this.b.available();
    } catch (IOException iOException) {
      return 0;
    } 
  }
  
  public void a(long paramLong) {
    if (paramLong >= 0L) {
      long l = c(paramLong);
      if (l == paramLong)
        return; 
      throw new EOFException(String.format("Unable to skip. Requested %d bytes but skipped %d.", new Object[] { Long.valueOf(paramLong), Long.valueOf(l) }));
    } 
    throw new IllegalArgumentException("n must be zero or greater.");
  }
  
  public void a(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int i = 0;
    while (i != paramInt2) {
      int j = this.b.read(paramArrayOfbyte, paramInt1 + i, paramInt2 - i);
      if (j != -1) {
        i += j;
        continue;
      } 
      throw new EOFException("End of data reached.");
    } 
    this.c += i;
  }
  
  public byte[] a(int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    a(arrayOfByte, 0, paramInt);
    return arrayOfByte;
  }
  
  public byte b() {
    int i = this.b.read();
    if (i != -1) {
      this.c++;
      return (byte)i;
    } 
    throw new EOFException("End of data reached.");
  }
  
  public boolean b(long paramLong) {
    if (paramLong >= 0L)
      return (c(paramLong) == paramLong); 
    throw new IllegalArgumentException("n must be zero or greater.");
  }
  
  public long g() {
    return this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */