package e.f.a.e.m;

import java.util.ArrayDeque;
import java.util.Queue;

final class f0<TResult> {
  private final Object a = new Object();
  
  private Queue<g0<TResult>> b;
  
  private boolean c;
  
  public final void a(g0<TResult> paramg0) {
    synchronized (this.a) {
      if (this.b == null)
        this.b = new ArrayDeque<g0<TResult>>(); 
      this.b.add(paramg0);
      return;
    } 
  }
  
  public final void a(l<TResult> paraml) {
    synchronized (this.a) {
      if (this.b == null || this.c)
        return; 
      this.c = true;
      while (true) {
        synchronized (this.a) {
          g0<TResult> g0 = this.b.poll();
          if (g0 == null) {
            this.c = false;
            return;
          } 
          g0.a(paraml);
        } 
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */