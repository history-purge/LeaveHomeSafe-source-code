package e.f.a.e.i.k;

import java.util.AbstractCollection;
import java.util.Iterator;
import java.util.Map;

final class g extends AbstractCollection {
  g(h paramh) {}
  
  public final void clear() {
    this.c.clear();
  }
  
  public final Iterator iterator() {
    h h1 = this.c;
    Map map = h1.b();
    return (map != null) ? map.values().iterator() : new b(h1);
  }
  
  public final int size() {
    return this.c.size();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */