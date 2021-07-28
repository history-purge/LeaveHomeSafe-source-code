package e.e.e.k;

import e.e.e.d.i;
import java.io.InputStream;

public class d {
  public static long a(InputStream paramInputStream, long paramLong) {
    long l2;
    boolean bool;
    i.a(paramInputStream);
    if (paramLong >= 0L) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
    long l1 = paramLong;
    while (true) {
      l2 = paramLong;
      if (l1 > 0L) {
        l2 = paramInputStream.skip(l1);
        if (l2 <= 0L)
          if (paramInputStream.read() != -1) {
            l2 = 1L;
          } else {
            l2 = paramLong - l1;
            break;
          }  
        l1 -= l2;
        continue;
      } 
      break;
    } 
    return l2;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/k/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */