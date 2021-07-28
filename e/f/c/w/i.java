package e.f.c.w;

import e.f.c.a;
import e.f.c.e;
import e.f.c.j;
import e.f.c.m;
import e.f.c.n;
import e.f.c.s.a;
import e.f.c.w.r.e;
import e.f.c.w.r.g.d;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public final class i extends k {
  private final k[] a;
  
  public i(Map<e, ?> paramMap) {
    boolean bool;
    Collection collection;
    if (paramMap == null) {
      collection = null;
    } else {
      collection = (Collection)paramMap.get(e.e);
    } 
    if (paramMap != null && paramMap.get(e.i) != null) {
      bool = true;
    } else {
      bool = false;
    } 
    ArrayList<j> arrayList = new ArrayList();
    if (collection != null) {
      if (collection.contains(a.j) || collection.contains(a.q) || collection.contains(a.i) || collection.contains(a.r))
        arrayList.add(new j(paramMap)); 
      if (collection.contains(a.e))
        arrayList.add(new c(bool)); 
      if (collection.contains(a.f))
        arrayList.add(new d()); 
      if (collection.contains(a.g))
        arrayList.add(new b()); 
      if (collection.contains(a.k))
        arrayList.add(new h()); 
      if (collection.contains(a.d))
        arrayList.add(new a()); 
      if (collection.contains(a.o))
        arrayList.add(new e()); 
      if (collection.contains(a.p))
        arrayList.add(new d()); 
    } 
    if (arrayList.isEmpty()) {
      arrayList.add(new j(paramMap));
      arrayList.add(new c());
      arrayList.add(new a());
      arrayList.add(new d());
      arrayList.add(new b());
      arrayList.add(new h());
      arrayList.add(new e());
      arrayList.add(new d());
    } 
    this.a = arrayList.<k>toArray(new k[arrayList.size()]);
  }
  
  public n a(int paramInt, a parama, Map<e, ?> paramMap) {
    k[] arrayOfK = this.a;
    int m = arrayOfK.length;
    int j = 0;
    while (true) {
      if (j < m) {
        k k1 = arrayOfK[j];
        try {
          return k1.a(paramInt, parama, paramMap);
        } catch (m m1) {
          j++;
          continue;
        } 
      } 
      j j1 = j.a();
      throw j1;
    } 
  }
  
  public void a() {
    k[] arrayOfK = this.a;
    int m = arrayOfK.length;
    for (int j = 0; j < m; j++)
      arrayOfK[j].a(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/w/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */