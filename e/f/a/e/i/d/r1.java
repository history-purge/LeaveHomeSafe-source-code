package e.f.a.e.i.d;

import java.util.Iterator;
import java.util.Map;

final class r1<K> implements Iterator<Map.Entry<K, Object>> {
  private Iterator<Map.Entry<K, Object>> c;
  
  public r1(Iterator<Map.Entry<K, Object>> paramIterator) {
    this.c = paramIterator;
  }
  
  public final boolean hasNext() {
    return this.c.hasNext();
  }
  
  public final void remove() {
    this.c.remove();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/r1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */