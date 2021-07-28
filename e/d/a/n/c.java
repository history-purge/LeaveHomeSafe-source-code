package e.d.a.n;

import e.d.b.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class c {
  private static final byte[] a = new byte[] { -119, 80, 78, 71, 13, 10, 26, 10 };
  
  public Iterable<b> a(o paramo, Set<d> paramSet) {
    paramo.a(true);
    byte[] arrayOfByte = a;
    if (Arrays.equals(arrayOfByte, paramo.a(arrayOfByte.length))) {
      ArrayList<b> arrayList = new ArrayList();
      HashSet<d> hashSet = new HashSet();
      boolean bool1 = false;
      boolean bool2 = false;
      while (!bool1) {
        int i = paramo.d();
        if (i >= 0) {
          boolean bool;
          d d = new d(paramo.a(4));
          if (paramSet == null || paramSet.contains(d)) {
            bool = true;
          } else {
            bool = false;
          } 
          byte[] arrayOfByte1 = paramo.a(i);
          paramo.a(4L);
          if (!bool || !hashSet.contains(d) || d.a()) {
            if (d.equals(d.d)) {
              bool2 = true;
            } else if (!bool2) {
              throw new h(String.format("First chunk should be '%s', but '%s' was observed", new Object[] { d.d, d }));
            } 
            if (d.equals(d.f))
              bool1 = true; 
            if (bool)
              arrayList.add(new b(d, arrayOfByte1)); 
            hashSet.add(d);
            continue;
          } 
          throw new h(String.format("Observed multiple instances of PNG chunk '%s', for which multiples are not allowed", new Object[] { d }));
        } 
        throw new h("PNG chunk length exceeds maximum");
      } 
      return arrayList;
    } 
    h h = new h("PNG signature mismatch");
    throw h;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/d/a/n/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */