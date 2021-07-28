package e.f.a.e.i.g;

import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class s {
  static final Logger a = Logger.getLogger(s.class.getName());
  
  public static void a(InputStream paramInputStream) {
    if (paramInputStream == null)
      return; 
    try {
      paramInputStream.close();
      return;
    } catch (IOException iOException) {
      try {
        a.logp(Level.WARNING, "com.google.common.io.Closeables", "close", "IOException thrown while closing Closeable.", iOException);
        return;
      } catch (IOException iOException1) {
        throw new AssertionError(iOException1);
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/g/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */