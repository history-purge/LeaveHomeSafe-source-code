package e.f.a.e.i.d;

import java.util.Iterator;
import java.util.Map;

final class m3 implements Iterator<Map.Entry<K, V>> {
  private int c = -1;
  
  private boolean d;
  
  private Iterator<Map.Entry<K, V>> e;
  
  private m3(e3 parame3) {}
  
  private final Iterator<Map.Entry<K, V>> a() {
    if (this.e == null)
      this.e = e3.c(this.f).entrySet().iterator(); 
    return this.e;
  }
  
  public final boolean hasNext() {
    return (this.c + 1 >= e3.b(this.f).size()) ? ((!e3.c(this.f).isEmpty() && a().hasNext())) : true;
  }
  
  public final void remove() {
    if (this.d) {
      this.d = false;
      e3.a(this.f);
      if (this.c < e3.b(this.f).size()) {
        e3 e31 = this.f;
        int i = this.c;
        this.c = i - 1;
        e3.a(e31, i);
        return;
      } 
      a().remove();
      return;
    } 
    throw new IllegalStateException("remove() was called before next()");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/m3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */