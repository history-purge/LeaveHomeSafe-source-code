package e.f.a.e.i.k;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

abstract class m8<K, V> extends o8<K, V> implements Serializable {
  private transient Map<K, Collection<V>> e;
  
  private transient int f;
  
  protected m8(Map<K, Collection<V>> paramMap) {
    if (paramMap.isEmpty()) {
      this.e = paramMap;
      return;
    } 
    throw new IllegalArgumentException();
  }
  
  public final Collection<V> a(K paramK) {
    Collection<V> collection2 = this.e.get(paramK);
    Collection<V> collection1 = collection2;
    if (collection2 == null)
      collection1 = e(); 
    return a(paramK, collection1);
  }
  
  abstract Collection<V> a(K paramK, Collection<V> paramCollection);
  
  final List<V> a(K paramK, List<V> paramList, j8 paramj8) {
    return (paramList instanceof java.util.RandomAccess) ? new h8(this, paramK, paramList, paramj8) : new l8(this, paramK, paramList, paramj8);
  }
  
  public final boolean a(K paramK, V paramV) {
    Collection<V> collection = this.e.get(paramK);
    if (collection == null) {
      collection = e();
      if (collection.add(paramV)) {
        this.f++;
        this.e.put(paramK, collection);
        return true;
      } 
      throw new AssertionError("New Collection violated the Collection spec");
    } 
    if (collection.add(paramV)) {
      this.f++;
      return true;
    } 
    return false;
  }
  
  final Set<K> c() {
    return new g8(this, this.e);
  }
  
  final Map<K, Collection<V>> d() {
    return new e8(this, this.e);
  }
  
  abstract Collection<V> e();
  
  public final void f() {
    Iterator<Collection> iterator = this.e.values().iterator();
    while (iterator.hasNext())
      ((Collection)iterator.next()).clear(); 
    this.e.clear();
    this.f = 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/m8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */