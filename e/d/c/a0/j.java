package e.d.c.a0;

import e.d.b.o;
import e.d.c.e;
import java.io.IOException;

public class j {
  public void a(o paramo, e parame) {
    i i = new i();
    parame.a(i);
    try {
      if (paramo.d() != 943870035) {
        i.a("Invalid PSD file signature");
        return;
      } 
      int k = paramo.h();
      if (k != 1 && k != 2) {
        i.a("Invalid PSD file version (must be 1 or 2)");
        return;
      } 
      paramo.a(6L);
      i.a(1, paramo.h());
      i.a(2, paramo.d());
      i.a(3, paramo.d());
      i.a(4, paramo.h());
      i.a(5, paramo.h());
      try {
        paramo.a(paramo.i());
        long l = paramo.i();
        (new f()).a(paramo, (int)l, parame);
        return;
      } catch (IOException iOException) {}
    } catch (IOException iOException) {
      i.a("Unable to read PSD header");
      return;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/a0/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */