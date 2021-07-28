package e.d.c.v;

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
      b.a(5, paramk.m(5));
      return;
    } catch (IOException iOException) {
      b.a(iOException.getMessage());
      return;
    } 
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, f paramf) {
    for (byte[] arrayOfByte : paramIterable) {
      if (arrayOfByte.length >= 4 && "JFXX".equals(new String(arrayOfByte, 0, 4)))
        a((k)new b(arrayOfByte), parame); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/v/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */