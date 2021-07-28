package e.f.a.e.i.g;

import java.io.InputStream;
import java.util.ArrayDeque;
import java.util.Queue;

public final class r {
  static {
    new p();
  }
  
  public static InputStream a(InputStream paramInputStream, long paramLong) {
    return new q(paramInputStream, 1048577L);
  }
  
  public static byte[] a(InputStream paramInputStream) {
    ArrayDeque<byte[]> arrayDeque = new ArrayDeque(20);
    int j = 0;
    for (int i = 8192; j < 2147483639; i = (int)l) {
      long l;
      byte[] arrayOfByte = new byte[Math.min(i, 2147483639 - j)];
      arrayDeque.add(arrayOfByte);
      int k = 0;
      while (true) {
        int m = arrayOfByte.length;
        if (k < m) {
          m = paramInputStream.read(arrayOfByte, k, m - k);
          if (m == -1)
            return a((Queue<byte[]>)arrayDeque, j); 
          k += m;
          j += m;
          continue;
        } 
        l = i;
        l += l;
        if (l > 2147483647L) {
          i = Integer.MAX_VALUE;
          continue;
        } 
        if (l < -2147483648L) {
          i = Integer.MIN_VALUE;
          continue;
        } 
        break;
      } 
    } 
    if (paramInputStream.read() == -1)
      return a((Queue<byte[]>)arrayDeque, 2147483639); 
    OutOfMemoryError outOfMemoryError = new OutOfMemoryError("input is too large to fit in a byte array");
    throw outOfMemoryError;
  }
  
  private static byte[] a(Queue<byte[]> paramQueue, int paramInt) {
    byte[] arrayOfByte = new byte[paramInt];
    for (int i = paramInt; i > 0; i -= j) {
      byte[] arrayOfByte1 = paramQueue.remove();
      int j = Math.min(i, arrayOfByte1.length);
      System.arraycopy(arrayOfByte1, 0, arrayOfByte, paramInt - i, j);
    } 
    return arrayOfByte;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/g/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */