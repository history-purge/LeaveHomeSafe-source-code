package b.d;

import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class a<K, V> extends g<K, V> implements Map<K, V> {
  f<K, V> j;
  
  public a() {}
  
  public a(int paramInt) {
    super(paramInt);
  }
  
  public a(g<K, V> paramg) {
    super(paramg);
  }
  
  private f<K, V> b() {
    if (this.j == null)
      this.j = new a(this); 
    return this.j;
  }
  
  public boolean a(Collection<?> paramCollection) {
    return f.c(this, paramCollection);
  }
  
  public Set<Map.Entry<K, V>> entrySet() {
    return b().d();
  }
  
  public Set<K> keySet() {
    return b().e();
  }
  
  public void putAll(Map<? extends K, ? extends V> paramMap) {
    a(this.e + paramMap.size());
    for (Map.Entry<? extends K, ? extends V> entry : paramMap.entrySet())
      put((K)entry.getKey(), (V)entry.getValue()); 
  }
  
  public Collection<V> values() {
    return b().f();
  }
  
  class a extends f<K, V> {
    a(a this$0) {}
    
    protected int a(Object param1Object) {
      return this.d.a(param1Object);
    }
    
    protected Object a(int param1Int1, int param1Int2) {
      return this.d.d[(param1Int1 << 1) + param1Int2];
    }
    
    protected V a(int param1Int, V param1V) {
      return (V)this.d.a(param1Int, param1V);
    }
    
    protected void a() {
      this.d.clear();
    }
    
    protected void a(int param1Int) {
      this.d.c(param1Int);
    }
    
    protected void a(K param1K, V param1V) {
      this.d.put(param1K, param1V);
    }
    
    protected int b(Object param1Object) {
      return this.d.b(param1Object);
    }
    
    protected Map<K, V> b() {
      return this.d;
    }
    
    protected int c() {
      return this.d.e;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/d/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */