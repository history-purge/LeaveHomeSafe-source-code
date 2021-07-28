package e.d.c.x.h;

import e.d.b.o;
import e.d.c.x.e;
import e.d.c.x.i.r;
import java.util.ArrayList;

public class n extends c {
  long c;
  
  ArrayList<a> d;
  
  long e;
  
  public n(o paramo, a parama) {
    super(paramo, parama);
    this.c = paramo.i();
    this.d = new ArrayList<a>();
    for (int i = 0; i < this.c; i++)
      this.d.add(new a(this, paramo)); 
    paramo.i();
    this.e = paramo.i();
  }
  
  public void a(r paramr) {
    paramr.a(14, (float)e.b.longValue() / (float)this.e);
  }
  
  class a {
    public a(n this$0, o param1o) {
      param1o.i();
      param1o.i();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/h/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */