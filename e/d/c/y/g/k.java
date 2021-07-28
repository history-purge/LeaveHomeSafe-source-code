package e.d.c.y.g;

import e.d.b.o;
import e.d.c.y.e;
import e.d.c.y.h.i;
import e.d.c.y.h.o;
import java.util.ArrayList;

public class k extends d {
  long e;
  
  ArrayList<a> f;
  
  public k(o paramo, b paramb) {
    super(paramo, paramb);
    this.e = paramo.i();
    this.f = new ArrayList<a>();
    for (int i = 0; i < this.e; i++)
      this.f.add(new a(this, paramo.i(), paramo.i())); 
  }
  
  public void a(i parami) {
    parami.a(104, e.b.longValue());
  }
  
  public void a(o paramo) {
    paramo.a(114, (float)e.b.longValue() / (float)((a)this.f.get(0)).a);
  }
  
  class a {
    long a;
    
    public a(k this$0, long param1Long1, long param1Long2) {
      this.a = param1Long2;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/g/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */