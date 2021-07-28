package e.d.c.u;

import e.d.a.k.d;
import e.d.a.k.f;
import e.d.b.b;
import e.d.b.k;
import e.d.c.e;
import e.d.c.g;
import java.io.IOException;
import java.util.Collections;

public class c implements d, g {
  public Iterable<f> a() {
    return Collections.singletonList(f.c);
  }
  
  public void a(k paramk, e parame) {
    b b = new b();
    parame.a(b);
    try {
      b.a(5, paramk.k(5));
      b.a(7, paramk.m(7));
      b.a(8, paramk.k(8));
      b.a(10, paramk.k(10));
      b.a(12, paramk.m(12));
      b.a(13, paramk.m(13));
      return;
    } catch (IOException iOException) {
      b.a(iOException.getMessage());
      return;
    } 
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, f paramf) {
    for (byte[] arrayOfByte : paramIterable) {
      if (arrayOfByte.length >= 4 && "JFIF".equals(new String(arrayOfByte, 0, 4)))
        a((k)new b(arrayOfByte), parame); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/u/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */