package e.e.l.n;

import e.e.l.k.d;
import e.e.l.o.c;

public class j implements j0<d> {
  private final j0<d> a;
  
  private final j0<d> b;
  
  public j(j0<d> paramj01, j0<d> paramj02) {
    this.a = paramj01;
    this.b = paramj02;
  }
  
  public void a(k<d> paramk, k0 paramk0) {
    paramk = new b(paramk, paramk0, null);
    this.a.a(paramk, paramk0);
  }
  
  private class b extends n<d, d> {
    private k0 c;
    
    private b(j this$0, k<d> param1k, k0 param1k0) {
      super(param1k);
      this.c = param1k0;
    }
    
    protected void a(d param1d, int param1Int) {
      c c = this.c.f();
      boolean bool1 = b.a(param1Int);
      boolean bool2 = x0.a(param1d, c.l());
      if (param1d != null && (bool2 || c.d())) {
        if (!bool1 || !bool2)
          param1Int = b.c(param1Int, 1); 
        c().a((O)param1d, param1Int);
      } 
      if (bool1 && !bool2) {
        d.c(param1d);
        j.a(this.d).a(c(), this.c);
      } 
    }
    
    protected void b(Throwable param1Throwable) {
      j.a(this.d).a(c(), this.c);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */