package e.e.l.g;

import e.e.e.h.a;
import e.e.l.n.j0;
import e.e.l.n.p0;
import e.e.l.p.b;

public class c<T> extends a<a<T>> {
  private c(j0<a<T>> paramj0, p0 paramp0, e.e.l.l.c paramc) {
    super(paramj0, paramp0, paramc);
  }
  
  public static <T> e.e.g.c<a<T>> a(j0<a<T>> paramj0, p0 paramp0, e.e.l.l.c paramc) {
    if (b.c())
      b.a("CloseableProducerToDataSourceAdapter#create"); 
    c<T> c1 = new c<T>(paramj0, paramp0, paramc);
    if (b.c())
      b.a(); 
    return (e.e.g.c)c1;
  }
  
  public a<T> a() {
    return a.a((a)super.a());
  }
  
  protected void a(a<T> parama) {
    a.b(parama);
  }
  
  protected void a(a<T> parama, int paramInt) {
    super.a(a.a(parama), paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */