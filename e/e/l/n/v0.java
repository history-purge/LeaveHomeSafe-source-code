package e.e.l.n;

import e.e.e.d.i;
import e.e.l.e.e;
import e.e.l.k.d;

public class v0 implements j0<d> {
  private final w0<d>[] a;
  
  public v0(w0<d>... paramVarArgs) {
    i.a(paramVarArgs);
    this.a = paramVarArgs;
    i.a(0, this.a.length);
  }
  
  private int a(int paramInt, e parame) {
    while (true) {
      w0<d>[] arrayOfW0 = this.a;
      if (paramInt < arrayOfW0.length) {
        if (arrayOfW0[paramInt].a(parame))
          return paramInt; 
        paramInt++;
        continue;
      } 
      return -1;
    } 
  }
  
  private boolean a(int paramInt, k<d> paramk, k0 paramk0) {
    paramInt = a(paramInt, paramk0.f().l());
    if (paramInt == -1)
      return false; 
    this.a[paramInt].a(new a(this, paramk, paramk0, paramInt), paramk0);
    return true;
  }
  
  public void a(k<d> paramk, k0 paramk0) {
    if (paramk0.f().l() == null || !a(0, paramk, paramk0)) {
      paramk.a(null, 1);
      return;
    } 
  }
  
  private class a extends n<d, d> {
    private final k0 c;
    
    private final int d;
    
    private final e e;
    
    public a(v0 this$0, k<d> param1k, k0 param1k0, int param1Int) {
      super(param1k);
      this.c = param1k0;
      this.d = param1Int;
      this.e = this.c.f().l();
    }
    
    protected void a(d param1d, int param1Int) {
      if (param1d != null && (b.b(param1Int) || x0.a(param1d, this.e))) {
        c().a((O)param1d, param1Int);
        return;
      } 
      if (b.a(param1Int)) {
        d.c(param1d);
        if (!v0.a(this.f, this.d + 1, c(), this.c))
          c().a(null, 1); 
      } 
    }
    
    protected void b(Throwable param1Throwable) {
      if (!v0.a(this.f, this.d + 1, c(), this.c))
        c().a(param1Throwable); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */