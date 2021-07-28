package e.e.j.b;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class b {
  private static final b b = new b();
  
  private static boolean c = true;
  
  private final Queue<a> a = new ArrayBlockingQueue<a>(20);
  
  public static b a() {
    return c ? new b() : b;
  }
  
  public void a(a parama) {
    if (!c)
      return; 
    if (this.a.size() + 1 > 20)
      this.a.poll(); 
    this.a.add(parama);
  }
  
  public String toString() {
    return this.a.toString();
  }
  
  public enum a {
    c, d, e, f, g, h, i, j, k, l, m, n, o, p, q, r, s, t, u, v, w, x, y, z;
    
    static {
    
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */