package e.d.b;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;

public final class q {
  public static byte[] a(InputStream paramInputStream) {
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    byte[] arrayOfByte = new byte[1024];
    while (true) {
      int i = paramInputStream.read(arrayOfByte);
      if (i == -1)
        return byteArrayOutputStream.toByteArray(); 
      byteArrayOutputStream.write(arrayOfByte, 0, i);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/b/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */