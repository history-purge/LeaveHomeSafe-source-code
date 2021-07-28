package e.d.c.x.h;

import e.d.b.o;
import e.d.c.b;
import e.d.c.x.c;

public class r extends i<r.a> {
  public r(o paramo, a parama) {
    super(paramo, parama);
  }
  
  a a(o paramo) {
    return new a(this, paramo);
  }
  
  public void a(e.d.c.x.i.r paramr) {
    a a = (a)this.d.get(0);
    c.a(1, a.b, (b)paramr);
    c.a(10, a.a, (b)paramr);
    paramr.a(2, a.c);
    paramr.a(3, a.d);
    paramr.a(4, a.e);
    paramr.a(5, a.f);
    paramr.a(8, a.i.trim());
    paramr.a(9, a.j);
    paramr.a(13, a.k);
    long l = a.g;
    double d1 = ((l & 0xFFFFFFFFFFFF0000L) >> 16L);
    double d2 = (l & 0xFFFFL);
    double d3 = Math.pow(2.0D, 4.0D);
    Double.isNaN(d2);
    d2 /= d3;
    Double.isNaN(d1);
    paramr.a(6, d1 + d2);
    l = a.h;
    d1 = ((0xFFFFFFFFFFFF0000L & l) >> 16L);
    d2 = (l & 0xFFFFL);
    d3 = Math.pow(2.0D, 4.0D);
    Double.isNaN(d2);
    d2 /= d3;
    Double.isNaN(d1);
    paramr.a(7, d1 + d2);
  }
  
  class a extends h {
    String b;
    
    long c;
    
    long d;
    
    int e;
    
    int f;
    
    long g;
    
    long h;
    
    String i;
    
    int j;
    
    int k;
    
    public a(r this$0, o param1o) {
      super(param1o);
      param1o.h();
      param1o.h();
      this.b = param1o.c(4);
      this.c = param1o.i();
      this.d = param1o.i();
      this.e = param1o.h();
      this.f = param1o.h();
      this.g = param1o.i();
      this.h = param1o.i();
      param1o.i();
      param1o.h();
      this.i = param1o.c(param1o.j());
      this.j = param1o.h();
      this.k = param1o.c();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/h/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */