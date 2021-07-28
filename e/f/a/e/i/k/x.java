package e.f.a.e.i.k;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

final class x<K, V> extends AbstractCollection<V> {
  final Map<K, V> c;
  
  x(Map<K, V> paramMap) {
    this.c = paramMap;
  }
  
  public final void clear() {
    this.c.clear();
  }
  
  public final boolean contains(Object paramObject) {
    return this.c.containsValue(paramObject);
  }
  
  public final boolean isEmpty() {
    return this.c.isEmpty();
  }
  
  public final Iterator<V> iterator() {
    return new u(this.c.entrySet().iterator());
  }
  
  public final boolean remove(Object paramObject) {
    try {
      return super.remove(paramObject);
    } catch (UnsupportedOperationException unsupportedOperationException) {
      for (Map.Entry<K, V> entry : this.c.entrySet()) {
        if (a0.a(paramObject, entry.getValue())) {
          this.c.remove(entry.getKey());
          return true;
        } 
      } 
      return false;
    } 
  }
  
  public final boolean removeAll(Collection<?> paramCollection) {
    if (paramCollection != null)
      try {
        return super.removeAll(paramCollection);
      } catch (UnsupportedOperationException unsupportedOperationException) {
        HashSet<?> hashSet = new HashSet();
        for (Map.Entry<K, V> entry : this.c.entrySet()) {
          if (paramCollection.contains(entry.getValue()))
            hashSet.add(entry.getKey()); 
        } 
        return this.c.keySet().removeAll(hashSet);
      }  
    throw null;
  }
  
  public final boolean retainAll(Collection<?> paramCollection) {
    if (paramCollection != null)
      try {
        return super.retainAll(paramCollection);
      } catch (UnsupportedOperationException unsupportedOperationException) {
        HashSet<?> hashSet = new HashSet();
        for (Map.Entry<K, V> entry : this.c.entrySet()) {
          if (paramCollection.contains(entry.getValue()))
            hashSet.add(entry.getKey()); 
        } 
        return this.c.keySet().retainAll(hashSet);
      }  
    throw null;
  }
  
  public final int size() {
    return this.c.size();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */