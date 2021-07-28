package e.d.c.o;

import e.d.a.k.d;
import e.d.a.k.f;
import e.d.a.s.b;
import e.d.a.s.d;
import e.d.a.s.e;
import e.d.b.b;
import e.d.b.k;
import e.d.c.b;
import e.d.c.e;
import java.io.IOException;
import java.util.Collections;

public class i implements d {
  public Iterable<f> a() {
    return Collections.singletonList(f.d);
  }
  
  public void a(k paramk, e parame) {
    a(paramk, parame, 0);
  }
  
  public void a(k paramk, e parame, int paramInt) {
    a(paramk, parame, paramInt, null);
  }
  
  public void a(k paramk, e parame, int paramInt, b paramb) {
    n n = new n(parame, paramb);
    try {
      (new e()).a(paramk, (b)n, paramInt);
      return;
    } catch (d d1) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Exception processing TIFF data: ");
      stringBuilder.append(d1.getMessage());
      n.a(stringBuilder.toString());
      d1.printStackTrace(System.err);
      return;
    } catch (IOException iOException) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Exception processing TIFF data: ");
      stringBuilder.append(iOException.getMessage());
      n.a(stringBuilder.toString());
      iOException.printStackTrace(System.err);
      return;
    } 
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, f paramf) {
    for (byte[] arrayOfByte : paramIterable) {
      if (arrayOfByte.length < 6 || !(new String(arrayOfByte, 0, 6)).equals("Exif\000\000"))
        continue; 
      a((k)new b(arrayOfByte), parame, 6);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/o/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */