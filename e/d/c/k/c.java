package e.d.c.k;

import e.d.a.k.d;
import e.d.a.k.f;
import e.d.b.n;
import e.d.b.o;
import e.d.c.e;
import java.io.IOException;
import java.util.Collections;

public class c implements d {
  public Iterable<f> a() {
    return Collections.singletonList(f.q);
  }
  
  public void a(o paramo, e parame) {
    b b = new b();
    parame.a(b);
    try {
      paramo.a(false);
      if (!paramo.c(5).equals("Adobe")) {
        b.a("Invalid Adobe JPEG data header.");
        return;
      } 
      b.a(0, paramo.h());
      b.a(1, paramo.h());
      b.a(2, paramo.h());
      b.a(3, paramo.f());
      return;
    } catch (IOException iOException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("IO exception processing data: ");
      stringBuilder.append(iOException.getMessage());
      b.a(stringBuilder.toString());
      return;
    } 
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, f paramf) {
    for (byte[] arrayOfByte : paramIterable) {
      if (arrayOfByte.length == 12 && "Adobe".equalsIgnoreCase(new String(arrayOfByte, 0, 5)))
        a((o)new n(arrayOfByte), parame); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */