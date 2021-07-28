package e.e.l.n;

import e.e.l.k.d;

public class a implements j0<d> {
  private final j0<d> a;
  
  public a(j0<d> paramj0) {
    this.a = paramj0;
  }
  
  public void a(k<d> paramk, k0 paramk0) {
    this.a.a(new b(paramk, null), paramk0);
  }
  
  private static class b extends n<d, d> {
    private b(k<d> param1k) {
      super(param1k);
    }
    
    protected void a(d param1d, int param1Int) {
      if (param1d == null) {
        c().a(null, param1Int);
        return;
      } 
      if (!d.d(param1d))
        param1d.B(); 
      c().a((O)param1d, param1Int);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */