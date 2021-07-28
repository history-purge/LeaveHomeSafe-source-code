package e.e.l.k;

import e.e.e.e.a;
import java.io.Closeable;

public abstract class b implements Closeable, e {
  public g c() {
    return f.d;
  }
  
  public abstract void close();
  
  public abstract int d();
  
  public boolean e() {
    return false;
  }
  
  protected void finalize() {
    if (isClosed())
      return; 
    a.c("CloseableImage", "finalize: %s %x still open.", new Object[] { getClass().getSimpleName(), Integer.valueOf(System.identityHashCode(this)) });
    try {
      close();
      return;
    } finally {
      super.finalize();
    } 
  }
  
  public abstract boolean isClosed();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/k/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */