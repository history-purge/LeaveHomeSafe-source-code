package e.e.l.d;

import e.e.e.d.j;
import e.e.e.h.a;

public class o<K, V> implements p<K, V> {
  private final p<K, V> a;
  
  private final r b;
  
  public o(p<K, V> paramp, r paramr) {
    this.a = paramp;
    this.b = paramr;
  }
  
  public int a(j<K> paramj) {
    return this.a.a(paramj);
  }
  
  public a<V> a(K paramK, a<V> parama) {
    this.b.b();
    return this.a.a(paramK, parama);
  }
  
  public boolean b(j<K> paramj) {
    return this.a.b(paramj);
  }
  
  public a<V> get(K paramK) {
    a<V> a = this.a.get(paramK);
    if (a == null) {
      this.b.a();
      return a;
    } 
    this.b.a(paramK);
    return a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/d/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */