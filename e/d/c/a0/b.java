package e.d.c.a0;

import e.d.a.k.d;
import e.d.a.k.f;
import e.d.b.f;
import e.d.b.n;
import e.d.b.o;
import e.d.c.e;
import java.io.IOException;
import java.util.Collections;

public class b implements d {
  public Iterable<f> a() {
    return Collections.singletonList(f.o);
  }
  
  public void a(o paramo, e parame) {
    a a = new a();
    parame.a(a);
    try {
      while (true) {
        int i = paramo.h();
        if (i == 0)
          return; 
        int j = paramo.h();
        if (i != 1) {
          if (i != 2 && i != 3) {
            a.a(i, paramo.a(j));
            continue;
          } 
          paramo.a(4L);
          a.a(i, paramo.d(j - 4, f.d));
          continue;
        } 
        if (j != 4) {
          a.a("Unexpected length for the quality tag");
          return;
        } 
        a.a(i, paramo.d());
      } 
    } catch (IOException iOException) {
      a.a(iOException.getMessage());
      return;
    } 
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, f paramf) {
    for (byte[] arrayOfByte : paramIterable) {
      if (arrayOfByte.length < 5 || !"Ducky".equals(new String(arrayOfByte, 0, 5)))
        continue; 
      a((o)new n(arrayOfByte, 5), parame);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/a0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */