package e.f.a.e.i.n;

import java.util.Iterator;
import java.util.Map;

final class w3<K> implements Iterator<Map.Entry<K, Object>> {
  private Iterator<Map.Entry<K, Object>> c;
  
  public w3(Iterator<Map.Entry<K, Object>> paramIterator) {
    this.c = paramIterator;
  }
  
  public final boolean hasNext() {
    return this.c.hasNext();
  }
  
  public final void remove() {
    this.c.remove();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/w3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */