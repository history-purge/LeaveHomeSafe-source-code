package e.f.a.e.i.k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class f8 implements Iterator {
  Map.Entry c;
  
  f8(g8 paramg8, Iterator paramIterator) {}
  
  public final boolean hasNext() {
    return this.d.hasNext();
  }
  
  public final Object next() {
    this.c = this.d.next();
    return this.c.getKey();
  }
  
  public final void remove() {
    boolean bool;
    if (this.c != null) {
      bool = true;
    } else {
      bool = false;
    } 
    e4.a(bool, "no calls to next() since the last call to remove()");
    Collection collection = (Collection)this.c.getValue();
    this.d.remove();
    m8.b(this.e.d, collection.size());
    collection.clear();
    this.c = null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/f8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */