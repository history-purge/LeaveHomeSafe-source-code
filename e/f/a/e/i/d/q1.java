package e.f.a.e.i.d;

import java.util.Map;

final class q1<K> implements Map.Entry<K, Object> {
  private Map.Entry<K, o1> c;
  
  private q1(Map.Entry<K, o1> paramEntry) {
    this.c = paramEntry;
  }
  
  public final o1 a() {
    return this.c.getValue();
  }
  
  public final K getKey() {
    return this.c.getKey();
  }
  
  public final Object getValue() {
    if ((o1)this.c.getValue() == null)
      return null; 
    o1.c();
    throw null;
  }
  
  public final Object setValue(Object paramObject) {
    if (paramObject instanceof k2)
      return ((o1)this.c.getValue()).a((k2)paramObject); 
    throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/q1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */