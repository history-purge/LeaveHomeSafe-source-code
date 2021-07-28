package e.f.b.a.c;

import androidx.annotation.RecentlyNonNull;
import java.util.HashMap;
import java.util.Map;

public abstract class e<K, V> {
  private final Map<K, V> a = new HashMap<K, V>();
  
  @RecentlyNonNull
  protected abstract V a(@RecentlyNonNull K paramK);
  
  @RecentlyNonNull
  public V b(@RecentlyNonNull K paramK) {
    synchronized (this.a) {
      if (this.a.containsKey(paramK)) {
        paramK = (K)this.a.get(paramK);
        return (V)paramK;
      } 
      V v = a(paramK);
      this.a.put(paramK, v);
      return v;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/b/a/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */