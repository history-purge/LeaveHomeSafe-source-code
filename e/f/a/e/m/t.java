package e.f.a.e.m;

final class t implements Runnable {
  t(r paramr, l paraml) {}
  
  public final void run() {
    if (this.c.c()) {
      r.a(this.d).f();
      return;
    } 
    try {
      Object object = r.b(this.d).a(this.c);
      r.a(this.d).a(object);
      return;
    } catch (j j) {
      if (j.getCause() instanceof Exception) {
        r.a(this.d).a((Exception)j.getCause());
        return;
      } 
      r.a(this.d).a(j);
      return;
    } catch (Exception exception) {
      r.a(this.d).a(exception);
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/m/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */