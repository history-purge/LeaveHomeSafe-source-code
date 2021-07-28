package e.f.a.e.i.k;

import java.util.AbstractMap;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class y<K, V> extends AbstractMap<K, V> {
  private transient Set<Map.Entry<K, V>> c;
  
  private transient Collection<V> d;
  
  abstract Set<Map.Entry<K, V>> a();
  
  public final Set<Map.Entry<K, V>> entrySet() {
    Set<Map.Entry<K, V>> set2 = this.c;
    Set<Map.Entry<K, V>> set1 = set2;
    if (set2 == null) {
      set1 = a();
      this.c = set1;
    } 
    return set1;
  }
  
  public final Collection<V> values() {
    Collection<V> collection2 = this.d;
    Collection<V> collection1 = collection2;
    if (collection2 == null) {
      collection1 = new x<Object, V>(this);
      this.d = collection1;
    } 
    return collection1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */