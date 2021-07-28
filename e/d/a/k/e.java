package e.d.a.k;

import e.d.b.o;
import java.util.HashSet;
import java.util.Iterator;

public class e {
  public static c a(o paramo, Iterable<f> paramIterable) {
    int i = paramo.h();
    if (i == 65496) {
      HashSet<Byte> hashSet = null;
      if (paramIterable != null) {
        HashSet<Byte> hashSet1 = new HashSet();
        Iterator<f> iterator = paramIterable.iterator();
        while (true) {
          hashSet = hashSet1;
          if (iterator.hasNext()) {
            hashSet1.add(Byte.valueOf(((f)iterator.next()).byteValue));
            continue;
          } 
          break;
        } 
      } 
      c c = new c();
      label40: while (true) {
        i = paramo.f();
        byte b1 = paramo.f();
        while (true) {
          if (i != -1 || b1 == -1 || b1 == 0) {
            byte b2 = paramo.f();
            i = b1;
            b1 = b2;
            continue;
          } 
          if (b1 == -38)
            return c; 
          if (b1 == -39)
            return c; 
          i = paramo.h() - 2;
          if (i >= 0) {
            if (hashSet == null || hashSet.contains(Byte.valueOf(b1))) {
              c.a(b1, paramo.a(i));
              continue label40;
            } 
            if (!paramo.b(i))
              return c; 
            continue label40;
          } 
          throw new b("JPEG segment size would be less than zero");
        } 
        break;
      } 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("JPEG data is expected to begin with 0xFFD8 (ÿØ) not 0x");
    stringBuilder.append(Integer.toHexString(i));
    b b = new b(stringBuilder.toString());
    throw b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/k/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */