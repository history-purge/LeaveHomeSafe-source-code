package e.f.a.e.i.k;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

abstract class o8<K, V> implements b0<K, V> {
  private transient Set<K> c;
  
  private transient Map<K, Collection<V>> d;
  
  public final Set<K> a() {
    Set<K> set2 = this.c;
    Set<K> set1 = set2;
    if (set2 == null) {
      set1 = c();
      this.c = set1;
    } 
    return set1;
  }
  
  public final Map<K, Collection<V>> b() {
    Map<K, Collection<V>> map2 = this.d;
    Map<K, Collection<V>> map1 = map2;
    if (map2 == null) {
      map1 = d();
      this.d = map1;
    } 
    return map1;
  }
  
  abstract Set<K> c();
  
  abstract Map<K, Collection<V>> d();
  
  public final boolean equals(Object paramObject) {
    if (paramObject == this)
      return true; 
    if (!(paramObject instanceof b0))
      return false; 
    paramObject = paramObject;
    return super.b().equals(paramObject.b());
  }
  
  public final int hashCode() {
    return b().hashCode();
  }
  
  public final String toString() {
    return ((e8)b()).e.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/o8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */