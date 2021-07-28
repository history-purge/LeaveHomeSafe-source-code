package e.e.e.d;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public final class b {
  static final Logger a = Logger.getLogger(b.class.getName());
  
  public static void a(Closeable paramCloseable, boolean paramBoolean) {
    if (paramCloseable == null)
      return; 
    try {
      paramCloseable.close();
      return;
    } catch (IOException iOException) {
      if (paramBoolean) {
        a.log(Level.WARNING, "IOException thrown while closing Closeable.", iOException);
        return;
      } 
      throw iOException;
    } 
  }
  
  public static void a(InputStream paramInputStream) {
    try {
      a(paramInputStream, true);
      return;
    } catch (IOException iOException) {
      throw new AssertionError(iOException);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */