package e.e.e.g;

import e.e.e.d.i;
import java.io.InputStream;
import java.io.OutputStream;

public class k {
  private final int a;
  
  private final a b;
  
  public k(a parama) {
    this(parama, 16384);
  }
  
  public k(a parama, int paramInt) {
    boolean bool;
    if (paramInt > 0) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
    this.a = paramInt;
    this.b = parama;
  }
  
  public long a(InputStream paramInputStream, OutputStream paramOutputStream) {
    byte[] arrayOfByte = this.b.get(this.a);
    long l = 0L;
    try {
      while (true) {
        int i = paramInputStream.read(arrayOfByte, 0, this.a);
        if (i == -1)
          return l; 
        paramOutputStream.write(arrayOfByte, 0, i);
        l += i;
      } 
    } finally {
      this.b.a(arrayOfByte);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/g/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */