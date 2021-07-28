package e.e.e.d;

import java.io.InputStream;
import java.io.OutputStream;

public final class a {
  public static int a(InputStream paramInputStream, byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    i.a(paramInputStream);
    i.a(paramArrayOfbyte);
    if (paramInt2 >= 0) {
      int i;
      for (i = 0; i < paramInt2; i += j) {
        int j = paramInputStream.read(paramArrayOfbyte, paramInt1 + i, paramInt2 - i);
        if (j == -1)
          return i; 
      } 
      return i;
    } 
    IndexOutOfBoundsException indexOutOfBoundsException = new IndexOutOfBoundsException("len is negative");
    throw indexOutOfBoundsException;
  }
  
  public static long a(InputStream paramInputStream, OutputStream paramOutputStream) {
    i.a(paramInputStream);
    i.a(paramOutputStream);
    byte[] arrayOfByte = new byte[4096];
    for (long l = 0L;; l += i) {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        return l; 
      paramOutputStream.write(arrayOfByte, 0, i);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */