package e.f.a.e.i.k;

import java.util.Collection;
import java.util.List;
import java.util.Map;

class h7<K, V> extends m8<K, V> implements t<K, V> {
  protected h7(Map<K, Collection<V>> paramMap) {
    super(paramMap);
  }
  
  final Collection<V> a(K paramK, Collection<V> paramCollection) {
    return a(paramK, (List<V>)paramCollection, null);
  }
  
  public final List<V> b(K paramK) {
    return (List<V>)a(paramK);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/h7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */