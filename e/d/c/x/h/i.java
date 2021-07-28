package e.d.c.x.h;

import e.d.b.o;
import java.util.ArrayList;

public abstract class i<T extends h> extends c {
  long c;
  
  ArrayList<T> d;
  
  public i(o paramo, a parama) {
    super(paramo, parama);
    this.c = paramo.i();
    this.d = new ArrayList<T>((int)this.c);
    for (int j = 0; j < this.c; j++)
      this.d.add(a(paramo)); 
  }
  
  abstract T a(o paramo);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/x/h/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */