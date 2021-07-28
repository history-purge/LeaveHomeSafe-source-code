package e.f.a.e.m;

import java.util.concurrent.CancellationException;

final class d0 implements Runnable {
  d0(e0 parame0, l paraml) {}
  
  public final void run() {
    try {
      l l1 = e0.a(this.d).a(this.c.b());
      if (l1 == null) {
        this.d.a(new NullPointerException("Continuation returned null"));
        return;
      } 
      l1.a(n.b, this.d);
      l1.a(n.b, this.d);
      l1.a(n.b, this.d);
      return;
    } catch (j j) {
      if (j.getCause() instanceof Exception) {
        this.d.a((Exception)j.getCause());
        return;
      } 
      this.d.a(j);
      return;
    } catch (CancellationException cancellationException) {
      this.d.a();
      return;
    } catch (Exception exception) {
      this.d.a(exception);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */