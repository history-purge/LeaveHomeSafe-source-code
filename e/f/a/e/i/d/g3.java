package e.f.a.e.i.d;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class g3 implements Iterator<Map.Entry<K, V>> {
  private int c = e3.b(this.e).size();
  
  private Iterator<Map.Entry<K, V>> d;
  
  private g3(e3 parame3) {}
  
  private final Iterator<Map.Entry<K, V>> a() {
    if (this.d == null)
      this.d = e3.d(this.e).entrySet().iterator(); 
    return this.d;
  }
  
  public final boolean hasNext() {
    int i = this.c;
    return ((i > 0 && i <= e3.b(this.e).size()) || a().hasNext());
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/g3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */