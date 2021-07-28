package e.f.a.e.i.k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class d8 implements Iterator<Map.Entry> {
  final Iterator<Map.Entry> c = this.e.e.entrySet().iterator();
  
  Collection d;
  
  d8(e8 parame8) {}
  
  public final boolean hasNext() {
    return this.c.hasNext();
  }
  
  public final void remove() {
    boolean bool;
    if (this.d != null) {
      bool = true;
    } else {
      bool = false;
    } 
    e4.a(bool, "no calls to next() since the last call to remove()");
    this.c.remove();
    m8.b(this.e.f, this.d.size());
    this.d.clear();
    this.d = null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/d8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */