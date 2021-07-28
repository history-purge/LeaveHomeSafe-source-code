package e.f.a.e.i.n;

import java.util.Iterator;
import java.util.Map;

final class v5 implements Iterator<Map.Entry<K, V>> {
  private int c = -1;
  
  private boolean d;
  
  private Iterator<Map.Entry<K, V>> e;
  
  private v5(n5 paramn5) {}
  
  private final Iterator<Map.Entry<K, V>> zza() {
    if (this.e == null)
      this.e = n5.c(this.f).entrySet().iterator(); 
    return this.e;
  }
  
  public final boolean hasNext() {
    return (this.c + 1 >= n5.b(this.f).size()) ? ((!n5.c(this.f).isEmpty() && zza().hasNext())) : true;
  }
  
  public final void remove() {
    if (this.d) {
      this.d = false;
      n5.a(this.f);
      if (this.c < n5.b(this.f).size()) {
        n5 n51 = this.f;
        int i = this.c;
        this.c = i - 1;
        n5.a(n51, i);
        return;
      } 
      zza().remove();
      return;
    } 
    throw new IllegalStateException("remove() was called before next()");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/v5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */