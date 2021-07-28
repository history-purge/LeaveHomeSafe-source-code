package e.f.a.e.i.n;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

final class p5 implements Iterator<Map.Entry<K, V>> {
  private int c = n5.b(this.e).size();
  
  private Iterator<Map.Entry<K, V>> d;
  
  private p5(n5 paramn5) {}
  
  private final Iterator<Map.Entry<K, V>> zza() {
    if (this.d == null)
      this.d = n5.d(this.e).entrySet().iterator(); 
    return this.d;
  }
  
  public final boolean hasNext() {
    int i = this.c;
    return ((i > 0 && i <= n5.b(this.e).size()) || zza().hasNext());
  }
  
  public final void remove() {
    throw new UnsupportedOperationException();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/p5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */