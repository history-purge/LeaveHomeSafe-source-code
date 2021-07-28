package e.e.l.g;

import e.e.g.a;
import e.e.l.l.c;
import e.e.l.n.b;
import e.e.l.n.j0;
import e.e.l.n.k;
import e.e.l.n.k0;
import e.e.l.n.p0;
import e.e.l.o.b;
import e.e.l.p.b;

public abstract class a<T> extends a<T> implements b {
  private final p0 g;
  
  private final c h;
  
  protected a(j0<T> paramj0, p0 paramp0, c paramc) {
    if (b.c())
      b.a("AbstractProducerToDataSourceAdapter()"); 
    this.g = paramp0;
    this.h = paramc;
    if (b.c())
      b.a("AbstractProducerToDataSourceAdapter()->onRequestStart"); 
    this.h.a(paramp0.f(), this.g.b(), this.g.a(), this.g.d());
    if (b.c())
      b.a(); 
    if (b.c())
      b.a("AbstractProducerToDataSourceAdapter()->produceResult"); 
    paramj0.a(j(), (k0)paramp0);
    if (b.c())
      b.a(); 
    if (b.c())
      b.a(); 
  }
  
  private void b(Throwable paramThrowable) {
    if (a(paramThrowable))
      this.h.a(this.g.f(), this.g.a(), paramThrowable, this.g.d()); 
  }
  
  private k<T> j() {
    return (k<T>)new a(this);
  }
  
  private void k() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual h : ()Z
    //   6: invokestatic b : (Z)V
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	9	12	finally
  }
  
  protected void a(T paramT, int paramInt) {
    boolean bool = b.a(paramInt);
    if (a(paramT, bool) && bool)
      this.h.a(this.g.f(), this.g.a(), this.g.d()); 
  }
  
  public boolean close() {
    if (!super.close())
      return false; 
    if (!d()) {
      this.h.b(this.g.a());
      this.g.i();
    } 
    return true;
  }
  
  class a extends b<T> {
    a(a this$0) {}
    
    protected void b() {
      a.a(this.b);
    }
    
    protected void b(float param1Float) {
      a.a(this.b, param1Float);
    }
    
    protected void b(T param1T, int param1Int) {
      this.b.a(param1T, param1Int);
    }
    
    protected void b(Throwable param1Throwable) {
      a.a(this.b, param1Throwable);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */