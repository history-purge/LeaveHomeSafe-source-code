package e.f.a.e.i.k;

import java.util.Map;

class w<K, V> extends e0<K> {
  final Map<K, V> c;
  
  w(Map<K, V> paramMap) {
    if (paramMap != null) {
      this.c = paramMap;
      return;
    } 
    throw null;
  }
  
  public final boolean contains(Object paramObject) {
    return this.c.containsKey(paramObject);
  }
  
  public final boolean isEmpty() {
    return this.c.isEmpty();
  }
  
  public final int size() {
    return this.c.size();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */