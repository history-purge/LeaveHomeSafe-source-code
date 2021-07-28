package e.f.a.e.m;

final class u implements Runnable {
  u(s params, l paraml) {}
  
  public final void run() {
    try {
      l l1 = (l)s.a(this.d).a(this.c);
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
        s.b(this.d).a((Exception)j.getCause());
        return;
      } 
      s.b(this.d).a(j);
      return;
    } catch (Exception exception) {
      s.b(this.d).a(exception);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */