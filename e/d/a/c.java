package e.d.a;

import e.d.a.f.a;
import e.d.a.g.a;
import e.d.a.h.a;
import e.d.a.i.a;
import e.d.a.j.a;
import e.d.a.k.a;
import e.d.a.l.b;
import e.d.a.m.a;
import e.d.a.n.g;
import e.d.a.o.a;
import e.d.a.p.b;
import e.d.a.q.a;
import e.d.a.s.c;
import e.d.a.t.a;
import e.d.a.u.a;
import e.d.b.k;
import e.d.b.l;
import e.d.c.b;
import e.d.c.e;
import e.d.c.p.b;
import java.io.BufferedInputStream;
import java.io.InputStream;

public class c {
  public static e a(InputStream paramInputStream, long paramLong) {
    if (paramInputStream instanceof BufferedInputStream) {
      paramInputStream = paramInputStream;
    } else {
      paramInputStream = new BufferedInputStream(paramInputStream);
    } 
    a a = b.a((BufferedInputStream)paramInputStream);
    e e = a(paramInputStream, paramLong, a);
    e.a((b)new b(a));
    return e;
  }
  
  public static e a(InputStream paramInputStream, long paramLong, a parama) {
    switch (a.a[parama.ordinal()]) {
      default:
        return new e();
      case 21:
        throw new d("File format could not be determined");
      case 20:
        return a.a(paramInputStream);
      case 19:
        return b.a(paramInputStream);
      case 18:
        return b.a(paramInputStream);
      case 17:
        return a.a(paramInputStream);
      case 16:
        return a.a(paramInputStream);
      case 15:
        return a.a(paramInputStream);
      case 14:
        return a.a(paramInputStream);
      case 13:
        return a.a(paramInputStream);
      case 12:
        return a.a(paramInputStream);
      case 11:
        return a.a(paramInputStream);
      case 10:
        return a.a(paramInputStream);
      case 9:
        return g.a(paramInputStream);
      case 8:
        return a.a(paramInputStream);
      case 2:
      case 3:
      case 4:
      case 5:
      case 6:
      case 7:
        return c.a((k)new l(paramInputStream, 2048, paramLong));
      case 1:
        break;
    } 
    return a.a(paramInputStream);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */