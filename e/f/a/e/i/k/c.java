package e.f.a.e.i.k;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class c extends AbstractSet<Map.Entry> {
  c(h paramh) {}
  
  public final void clear() {
    this.c.clear();
  }
  
  public final boolean contains(Object paramObject) {
    Map map = this.c.b();
    if (map != null)
      return map.entrySet().contains(paramObject); 
    if (paramObject instanceof Map.Entry) {
      paramObject = paramObject;
      int i = h.b(this.c, paramObject.getKey());
      if (i != -1 && a0.a(this.c.f[i], paramObject.getValue()))
        return true; 
    } 
    return false;
  }
  
  public final Iterator<Map.Entry> iterator() {
    h h1 = this.c;
    Map map = h1.b();
    return (map != null) ? map.entrySet().iterator() : new s8(h1);
  }
  
  public final boolean remove(Object paramObject) {
    Map map = this.c.b();
    if (map != null)
      return map.entrySet().remove(paramObject); 
    if (paramObject instanceof Map.Entry) {
      Map.Entry entry = (Map.Entry)paramObject;
      if (this.c.a())
        return false; 
      int i = h.b(this.c);
      paramObject = entry.getKey();
      entry = (Map.Entry)entry.getValue();
      Object object = h.c(this.c);
      h h1 = this.c;
      int j = i.a(paramObject, entry, i, object, h1.d, h1.e, h1.f);
      if (j == -1)
        return false; 
      this.c.a(j, i);
      h.d(this.c);
      this.c.c();
      return true;
    } 
    return false;
  }
  
  public final int size() {
    return this.c.size();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */