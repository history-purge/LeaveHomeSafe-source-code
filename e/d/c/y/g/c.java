package e.d.c.y.g;

import e.d.b.o;
import e.d.c.y.d;
import java.util.ArrayList;

public class c extends b {
  String d;
  
  long e;
  
  ArrayList<String> f;
  
  public c(o paramo, b paramb) {
    super(paramb);
    this.d = paramo.c(4);
    this.e = paramo.i();
    this.f = new ArrayList<String>();
    for (int i = 16; i < this.a; i += 4)
      this.f.add(paramo.c(4)); 
  }
  
  public void a(d paramd) {
    paramd.a(1, this.d);
    paramd.a(2, this.e);
    ArrayList<String> arrayList = this.f;
    paramd.a(3, arrayList.<String>toArray(new String[arrayList.size()]));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/y/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */