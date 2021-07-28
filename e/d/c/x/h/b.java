package e.d.c.x.h;

import e.d.b.o;
import e.d.c.x.d;
import java.util.ArrayList;

public class b extends a {
  String c;
  
  long d;
  
  ArrayList<String> e;
  
  public b(o paramo, a parama) {
    super(parama);
    this.c = paramo.c(4);
    this.d = paramo.i();
    this.e = new ArrayList<String>((int)(this.a / 16L >> 2L));
    for (int i = 16; i < this.a; i += 4)
      this.e.add(paramo.c(4)); 
  }
  
  public void a(d paramd) {
    paramd.a(4096, this.c);
    paramd.a(4097, this.d);
    ArrayList<String> arrayList = this.e;
    paramd.a(4098, arrayList.<String>toArray(new String[arrayList.size()]));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/h/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */