package e.f.a.e.i.n;

import java.util.Map;

final class x3<K> implements Map.Entry<K, Object> {
  private Map.Entry<K, v3> c;
  
  private x3(Map.Entry<K, v3> paramEntry) {
    this.c = paramEntry;
  }
  
  public final v3 a() {
    return this.c.getValue();
  }
  
  public final K getKey() {
    return this.c.getKey();
  }
  
  public final Object getValue() {
    if ((v3)this.c.getValue() == null)
      return null; 
    v3.c();
    throw null;
  }
  
  public final Object setValue(Object paramObject) {
    if (paramObject instanceof r4)
      return ((v3)this.c.getValue()).a((r4)paramObject); 
    throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/x3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */