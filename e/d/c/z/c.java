package e.d.c.z;

import e.d.a.d;
import e.d.b.o;
import e.d.c.e;

public class c {
  public void a(o paramo, e parame) {
    paramo.a(false);
    b b = new b();
    parame.a(b);
    try {
      if (paramo.f() == 10) {
        b.a(1, paramo.f());
        if (paramo.f() == 1) {
          b.a(2, paramo.j());
          b.a(3, paramo.h());
          b.a(4, paramo.h());
          b.a(5, paramo.h());
          b.a(6, paramo.h());
          b.a(7, paramo.h());
          b.a(8, paramo.h());
          b.a(9, paramo.a(48));
          paramo.a(1L);
          b.a(10, paramo.j());
          b.a(11, paramo.h());
          int i = paramo.h();
          if (i != 0)
            b.a(12, i); 
          i = paramo.h();
          if (i != 0)
            b.a(13, i); 
          i = paramo.h();
          if (i != 0) {
            b.a(14, i);
            return;
          } 
        } else {
          throw new d("Invalid PCX encoding byte");
        } 
      } else {
        throw new d("Invalid PCX identifier byte");
      } 
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Exception reading PCX file metadata: ");
      stringBuilder.append(exception.getMessage());
      b.a(stringBuilder.toString());
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/z/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */