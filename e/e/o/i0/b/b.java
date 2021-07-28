package e.e.o.i0.b;

import e.e.l.f.h;
import e.e.l.f.k;
import java.util.Iterator;
import java.util.List;

public class b {
  public static b a(int paramInt1, int paramInt2, List<a> paramList) {
    return a(paramInt1, paramInt2, paramList, 1.0D);
  }
  
  public static b a(int paramInt1, int paramInt2, List<a> paramList, double paramDouble) {
    Object object1;
    Object object2;
    Object object3;
    if (paramList.isEmpty())
      return new b(null, null, null); 
    if (paramList.size() == 1)
      return new b(paramList.get(0), null, null); 
    if (paramInt1 <= 0 || paramInt2 <= 0)
      return new b(null, null, null); 
    h h = k.o().f();
    double d3 = (paramInt1 * paramInt2);
    Double.isNaN(d3);
    Iterator<a> iterator = paramList.iterator();
    double d2 = Double.MAX_VALUE;
    double d1 = d2;
    paramList = null;
    Object object4;
    for (object4 = paramList; iterator.hasNext(); object4 = SYNTHETIC_LOCAL_VARIABLE_17) {
      double d6;
      a a = iterator.next();
      double d5 = Math.abs(1.0D - a.a() / d3 * paramDouble);
      Object object6 = object3;
      Object object7 = object4;
      if (d5 < object3) {
        object7 = a;
        d6 = d5;
      } 
      double d4 = d6;
      object4 = object7;
      if (d5 < object2) {
        if (!h.a(a.c())) {
          d4 = d6;
          object4 = object7;
          if (h.b(a.c()))
            continue; 
          continue;
        } 
        continue;
      } 
      continue;
      object1 = SYNTHETIC_LOCAL_VARIABLE_16;
      object2 = SYNTHETIC_LOCAL_VARIABLE_9;
      object3 = SYNTHETIC_LOCAL_VARIABLE_11;
    } 
    Object object5 = object1;
    if (object1 != null) {
      object5 = object1;
      if (object4 != null) {
        object5 = object1;
        if (object1.b().equals(object4.b()))
          object5 = null; 
      } 
    } 
    return new b((a)object4, (a)object5, null);
  }
  
  public static class b {
    private final a a;
    
    private final a b;
    
    private b(a param1a1, a param1a2) {
      this.a = param1a1;
      this.b = param1a2;
    }
    
    public a a() {
      return this.a;
    }
    
    public a b() {
      return this.b;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/o/i0/b/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */