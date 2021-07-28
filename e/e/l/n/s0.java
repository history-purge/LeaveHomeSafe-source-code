package e.e.l.n;

import e.e.e.d.i;
import java.util.Map;

public class s0<T> implements j0<T> {
  private final j0<T> a;
  
  private final t0 b;
  
  public s0(j0<T> paramj0, t0 paramt0) {
    i.a(paramj0);
    this.a = paramj0;
    this.b = paramt0;
  }
  
  public void a(k<T> paramk, k0 paramk0) {
    m0 m0 = paramk0.e();
    String str = paramk0.a();
    a a = new a(this, paramk, m0, "BackgroundThreadHandoffProducer", str, m0, str, paramk, paramk0);
    paramk0.a(new b(this, a));
    this.b.a((Runnable)a);
  }
  
  class a extends q0<T> {
    a(s0 this$0, k<T> param1k1, m0 param1m01, String param1String1, String param1String2, m0 param1m02, String param1String3, k param1k2, k0 param1k0) {
      super(param1k1, param1m01, param1String1, param1String2);
    }
    
    protected void a(T param1T) {}
    
    protected T b() {
      return null;
    }
    
    protected void b(T param1T) {
      this.h.a(this.i, "BackgroundThreadHandoffProducer", (Map<String, String>)null);
      s0.a(this.l).a(this.j, this.k);
    }
  }
  
  class b extends e {
    b(s0 this$0, q0 param1q0) {}
    
    public void a() {
      this.a.a();
      s0.b(this.b).b((Runnable)this.a);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/s0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */