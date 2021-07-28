package e.d.c.x.h;

import e.d.b.o;
import e.d.c.x.i.o;
import java.util.ArrayList;

public class p extends i<p.a> {
  public p(o paramo, a parama) {
    super(paramo, parama);
  }
  
  a a(o paramo) {
    return new a(this, paramo);
  }
  
  public void a(o paramo) {
    ArrayList<T> arrayList = this.d;
    boolean bool2 = false;
    a a = (a)arrayList.get(0);
    if ((a.b & 0x1) == 1) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    paramo.a(1, bool1);
    if ((a.b & 0x2) == 2) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    paramo.a(2, bool1);
    if ((a.b & 0x4) == 4) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    paramo.a(3, bool1);
    boolean bool1 = bool2;
    if ((a.b & 0x8) == 8)
      bool1 = true; 
    paramo.a(4, bool1);
  }
  
  class a extends h {
    int b;
    
    public a(p this$0, o param1o) {
      super(param1o);
      param1o.a(4L);
      this.b = param1o.d();
      param1o.d();
      param1o.d();
      param1o.f();
      param1o.a(1L);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/h/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */