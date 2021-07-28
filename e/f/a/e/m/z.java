package e.f.a.e.m;

import com.google.android.gms.common.internal.q;

final class z implements Runnable {
  z(a0 parama0, l paraml) {}
  
  public final void run() {
    synchronized (a0.a(this.d)) {
      if (a0.b(this.d) != null) {
        g g = a0.b(this.d);
        Exception exception = this.c.a();
        q.a(exception);
        g.a(exception);
      } 
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */