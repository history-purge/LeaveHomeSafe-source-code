package e.f.c;

import e.f.c.r.b;
import e.f.c.t.a;
import e.f.c.u.a;
import e.f.c.w.i;
import e.f.c.x.b;
import e.f.c.y.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class i implements l {
  private Map<e, ?> a;
  
  private l[] b;
  
  private n b(c paramc) {
    l[] arrayOfL = this.b;
    if (arrayOfL != null) {
      int m = arrayOfL.length;
      int k = 0;
      while (true) {
        if (k < m) {
          l l1 = arrayOfL[k];
          try {
            return l1.a(paramc, this.a);
          } catch (m m1) {
            k++;
            continue;
          } 
        } 
        j j1 = j.a();
        throw j1;
      } 
    } 
    j j = j.a();
    throw j;
  }
  
  public n a(c paramc) {
    if (this.b == null)
      a((Map<e, ?>)null); 
    return b(paramc);
  }
  
  public n a(c paramc, Map<e, ?> paramMap) {
    a(paramMap);
    return b(paramc);
  }
  
  public void a() {
    l[] arrayOfL = this.b;
    if (arrayOfL != null) {
      int k = arrayOfL.length;
      for (int j = 0; j < k; j++)
        arrayOfL[j].a(); 
    } 
  }
  
  public void a(Map<e, ?> paramMap) {
    boolean bool1;
    Collection collection;
    this.a = paramMap;
    boolean bool2 = true;
    if (paramMap != null && paramMap.containsKey(e.f)) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    if (paramMap == null) {
      collection = null;
    } else {
      collection = (Collection)paramMap.get(e.e);
    } 
    ArrayList<i> arrayList = new ArrayList();
    if (collection != null) {
      boolean bool = bool2;
      if (!collection.contains(a.q)) {
        bool = bool2;
        if (!collection.contains(a.r)) {
          bool = bool2;
          if (!collection.contains(a.j)) {
            bool = bool2;
            if (!collection.contains(a.i)) {
              bool = bool2;
              if (!collection.contains(a.d)) {
                bool = bool2;
                if (!collection.contains(a.e)) {
                  bool = bool2;
                  if (!collection.contains(a.f)) {
                    bool = bool2;
                    if (!collection.contains(a.g)) {
                      bool = bool2;
                      if (!collection.contains(a.k)) {
                        bool = bool2;
                        if (!collection.contains(a.o))
                          if (collection.contains(a.p)) {
                            bool = bool2;
                          } else {
                            bool = false;
                          }  
                      } 
                    } 
                  } 
                } 
              } 
            } 
          } 
        } 
      } 
      if (bool && !bool1)
        arrayList.add(new i(paramMap)); 
      if (collection.contains(a.n))
        arrayList.add(new a()); 
      if (collection.contains(a.h))
        arrayList.add(new a()); 
      if (collection.contains(a.c))
        arrayList.add(new b()); 
      if (collection.contains(a.m))
        arrayList.add(new b()); 
      if (collection.contains(a.l))
        arrayList.add(new a()); 
      if (bool && bool1)
        arrayList.add(new i(paramMap)); 
    } 
    if (arrayList.isEmpty()) {
      if (!bool1)
        arrayList.add(new i(paramMap)); 
      arrayList.add(new a());
      arrayList.add(new a());
      arrayList.add(new b());
      arrayList.add(new b());
      arrayList.add(new a());
      if (bool1)
        arrayList.add(new i(paramMap)); 
    } 
    this.b = arrayList.<l>toArray(new l[arrayList.size()]);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */