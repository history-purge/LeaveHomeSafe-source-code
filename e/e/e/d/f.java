package e.e.e.d;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class f<K, V> extends HashMap<K, V> {
  private f(Map<? extends K, ? extends V> paramMap) {
    super(paramMap);
  }
  
  public static <K, V> f<K, V> a(Map<? extends K, ? extends V> paramMap) {
    return new f<K, V>(paramMap);
  }
  
  public static <K, V> Map<K, V> of(K paramK, V paramV) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(1);
    hashMap.put(paramK, paramV);
    return Collections.unmodifiableMap((Map)hashMap);
  }
  
  public static <K, V> Map<K, V> of(K paramK1, V paramV1, K paramK2, V paramV2) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>(2);
    hashMap.put(paramK1, paramV1);
    hashMap.put(paramK2, paramV2);
    return Collections.unmodifiableMap((Map)hashMap);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/d/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */