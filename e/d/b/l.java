package e.d.b;

import java.io.InputStream;
import java.util.ArrayList;

public class l extends k {
  private final InputStream b;
  
  private final int c;
  
  private final ArrayList<byte[]> d = (ArrayList)new ArrayList<byte>();
  
  private boolean e;
  
  private long f;
  
  public l(InputStream paramInputStream) {
    this(paramInputStream, 2048, -1L);
  }
  
  public l(InputStream paramInputStream, int paramInt, long paramLong) {
    if (paramInputStream != null) {
      if (paramInt > 0) {
        this.c = paramInt;
        this.b = paramInputStream;
        this.f = paramLong;
        return;
      } 
      throw new IllegalArgumentException("chunkLength must be greater than zero");
    } 
    throw new NullPointerException();
  }
  
  public long a() {
    long l1 = this.f;
    if (l1 != -1L)
      return l1; 
    d(2147483647, 1);
    return this.f;
  }
  
  public byte[] a(int paramInt1, int paramInt2) {
    c(paramInt1, paramInt2);
    byte[] arrayOfByte = new byte[paramInt2];
    int j = 0;
    int i = paramInt2;
    paramInt2 = paramInt1;
    for (paramInt1 = j; i != 0; paramInt1 += j) {
      j = this.c;
      int m = paramInt2 / j;
      int n = paramInt2 % j;
      j = Math.min(i, j - n);
      System.arraycopy(this.d.get(m), n, arrayOfByte, paramInt1, j);
      i -= j;
      paramInt2 += j;
    } 
    return arrayOfByte;
  }
  
  public byte b(int paramInt) {
    int i = this.c;
    int j = paramInt / i;
    return ((byte[])this.d.get(j))[paramInt % i];
  }
  
  protected void c(int paramInt1, int paramInt2) {
    if (paramInt1 >= 0) {
      if (paramInt2 >= 0) {
        if (paramInt1 + paramInt2 - 1L <= 2147483647L) {
          if (!d(paramInt1, paramInt2))
            throw new a(paramInt1, paramInt2, this.f); 
          return;
        } 
        throw new a(String.format("Number of requested bytes summed with starting index exceed maximum range of signed 32 bit integers (requested index: %d, requested count: %d)", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) }));
      } 
      throw new a("Number of requested bytes must be zero or greater");
    } 
    throw new a(String.format("Attempt to read from buffer using a negative index (%d)", new Object[] { Integer.valueOf(paramInt1) }));
  }
  
  protected boolean d(int paramInt1, int paramInt2) {
    boolean bool = false;
    if (paramInt1 >= 0) {
      if (paramInt2 < 0)
        return false; 
      long l1 = paramInt1 + paramInt2 - 1L;
      if (l1 > 2147483647L)
        return false; 
      paramInt2 = (int)l1;
      if (this.e) {
        if (paramInt2 < this.f)
          bool = true; 
        return bool;
      } 
      int i = paramInt2 / this.c;
      while (i >= this.d.size()) {
        byte[] arrayOfByte = new byte[this.c];
        paramInt1 = 0;
        while (!this.e) {
          int j = this.c;
          if (paramInt1 != j) {
            j = this.b.read(arrayOfByte, paramInt1, j - paramInt1);
            if (j == -1) {
              this.e = true;
              j = this.d.size() * this.c + paramInt1;
              l1 = this.f;
              if (l1 == -1L) {
                this.f = j;
              } else {
                l1 = j;
              } 
              if (paramInt2 >= this.f) {
                this.d.add(arrayOfByte);
                return false;
              } 
              continue;
            } 
            paramInt1 += j;
          } 
        } 
        this.d.add(arrayOfByte);
      } 
      return true;
    } 
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */