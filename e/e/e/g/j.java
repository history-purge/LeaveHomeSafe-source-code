package e.e.e.g;

import e.e.e.d.n;
import java.io.IOException;
import java.io.OutputStream;

public abstract class j extends OutputStream {
  public abstract g a();
  
  public void close() {
    try {
      super.close();
      return;
    } catch (IOException iOException) {
      n.a(iOException);
      throw null;
    } 
  }
  
  public abstract int size();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/g/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */