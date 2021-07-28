package e.f.a.e.i.k;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

final class g8 extends w {
  g8(m8 paramm8, Map<K, V> paramMap) {
    super(paramMap);
  }
  
  public final void clear() {
    s.a(iterator());
  }
  
  public final boolean containsAll(Collection<?> paramCollection) {
    return this.c.keySet().containsAll(paramCollection);
  }
  
  public final boolean equals(Object paramObject) {
    return (this == paramObject || this.c.keySet().equals(paramObject));
  }
  
  public final int hashCode() {
    return this.c.keySet().hashCode();
  }
  
  public final Iterator iterator() {
    return new f8(this, this.c.entrySet().iterator());
  }
  
  public final boolean remove(Object paramObject) {
    paramObject = (Collection)this.c.remove(paramObject);
    if (paramObject != null) {
      int i = paramObject.size();
      paramObject.clear();
      m8.b(this.d, i);
      if (i > 0)
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/g8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */