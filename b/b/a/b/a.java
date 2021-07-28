package b.b.a.b;

import java.util.HashMap;
import java.util.Map;

public class a<K, V> extends b<K, V> {
  private HashMap<K, b.c<K, V>> g = new HashMap<K, b.c<K, V>>();
  
  protected b.c<K, V> a(K paramK) {
    return this.g.get(paramK);
  }
  
  public V b(K paramK, V paramV) {
    b.c<K, V> c = a(paramK);
    if (c != null)
      return c.d; 
    this.g.put(paramK, a(paramK, paramV));
    return null;
  }
  
  public Map.Entry<K, V> b(K paramK) {
    return contains(paramK) ? ((b.c)this.g.get(paramK)).f : null;
  }
  
  public boolean contains(K paramK) {
    return this.g.containsKey(paramK);
  }
  
  public V remove(K paramK) {
    V v = super.remove(paramK);
    this.g.remove(paramK);
    return v;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/b/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */