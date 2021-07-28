package e.d.c.w;

import e.d.a.k.d;
import e.d.a.k.f;
import e.d.b.n;
import e.d.c.b;
import e.d.c.c;
import e.d.c.e;
import java.io.IOException;
import java.util.Collections;
import java.util.Iterator;

public class j implements d {
  public Iterable<f> a() {
    return Collections.singletonList(f.u);
  }
  
  public void a(Iterable<byte[]> paramIterable, e parame, f paramf) {
    Iterator<byte> iterator = paramIterable.iterator();
    while (iterator.hasNext())
      a((byte[])iterator.next(), parame, paramf); 
  }
  
  public void a(byte[] paramArrayOfbyte, e parame, f paramf) {
    c c;
    i i = (i)parame.b(i.class);
    if (i == null) {
      c = new c();
      parame.a((b)c);
      c.a("DNL segment found without SOFx - illegal JPEG format");
      return;
    } 
    n n = new n((byte[])c);
    try {
      Integer integer = i.k(1);
      if (integer == null || integer.intValue() == 0) {
        i.a(1, n.h());
        return;
      } 
    } catch (IOException iOException) {
      i.a(iOException.getMessage());
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/c/w/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */