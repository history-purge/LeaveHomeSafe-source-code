package e.e.c.b;

import e.e.c.a.b;
import e.e.c.a.c;
import e.e.c.a.d;
import java.io.IOException;

public class j implements b {
  private static final Object b = new Object();
  
  private static j c;
  
  private static int d;
  
  private j a;
  
  public static j b() {
    synchronized (b) {
      if (c != null) {
        j j1 = c;
        c = j1.a;
        j1.a = null;
        d--;
        return j1;
      } 
      return new j();
    } 
  }
  
  private void c() {}
  
  public j a(long paramLong) {
    return this;
  }
  
  public j a(c.a parama) {
    return this;
  }
  
  public j a(d paramd) {
    return this;
  }
  
  public j a(IOException paramIOException) {
    return this;
  }
  
  public j a(String paramString) {
    return this;
  }
  
  public void a() {
    synchronized (b) {
      if (d < 5) {
        c();
        d++;
        if (c != null)
          this.a = c; 
        c = this;
      } 
      return;
    } 
  }
  
  public j b(long paramLong) {
    return this;
  }
  
  public j c(long paramLong) {
    return this;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/c/b/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */