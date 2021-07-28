package e.f.a.e.i.k;

import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;

final class e extends AbstractSet {
  e(h paramh) {}
  
  public final void clear() {
    this.c.clear();
  }
  
  public final boolean contains(Object paramObject) {
    return this.c.containsKey(paramObject);
  }
  
  public final Iterator iterator() {
    h h1 = this.c;
    Map map = h1.b();
    return (map != null) ? map.keySet().iterator() : new r8(h1);
  }
  
  public final boolean remove(Object paramObject) {
    Map map = this.c.b();
    return (map != null) ? map.keySet().remove(paramObject) : (!(h.a(this.c, paramObject) == h.e()));
  }
  
  public final int size() {
    return this.c.size();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */