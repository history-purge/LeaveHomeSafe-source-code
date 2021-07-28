package e.f.c.x.d;

import e.f.c.x.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

final class b {
  private final Map<Integer, Integer> a = new HashMap<Integer, Integer>();
  
  void a(int paramInt) {
    Integer integer2 = this.a.get(Integer.valueOf(paramInt));
    Integer integer1 = integer2;
    if (integer2 == null)
      integer1 = Integer.valueOf(0); 
    int i = integer1.intValue();
    this.a.put(Integer.valueOf(paramInt), Integer.valueOf(i + 1));
  }
  
  int[] a() {
    ArrayList arrayList = new ArrayList();
    Iterator<Map.Entry> iterator = this.a.entrySet().iterator();
    int i = -1;
    while (iterator.hasNext()) {
      Map.Entry entry = iterator.next();
      if (((Integer)entry.getValue()).intValue() > i) {
        i = ((Integer)entry.getValue()).intValue();
        arrayList.clear();
        continue;
      } 
      if (((Integer)entry.getValue()).intValue() == i)
        continue; 
      continue;
      arrayList.add(SYNTHETIC_LOCAL_VARIABLE_4.getKey());
    } 
    return a.a(arrayList);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/c/x/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */