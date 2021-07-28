package e.d.a.q;

import e.d.c.e;
import java.io.IOException;
import java.io.InputStream;

public class a {
  public static e a(InputStream paramInputStream) {
    if (paramInputStream.markSupported()) {
      paramInputStream.mark(512);
      byte[] arrayOfByte = new byte[512];
      int i = paramInputStream.read(arrayOfByte);
      if (i != -1) {
        paramInputStream.reset();
        for (int j = 0; j < i - 2; j++) {
          if (arrayOfByte[j] == -1 && arrayOfByte[j + 1] == -40 && arrayOfByte[j + 2] == -1) {
            long l = j;
            if (paramInputStream.skip(l) == l)
              break; 
            throw new IOException("Skipping stream bytes failed");
          } 
        } 
        return e.d.a.k.a.a(paramInputStream);
      } 
      throw new IOException("Stream is empty");
    } 
    IOException iOException = new IOException("Stream must support mark/reset");
    throw iOException;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/q/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */