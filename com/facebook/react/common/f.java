package com.facebook.react.common;

import java.util.HashMap;
import java.util.Map;

public class f {
  public static <K, V> b<K, V> a() {
    return new b<K, V>(null);
  }
  
  public static <K, V> Map<K, V> a(K paramK, V paramV) {
    Map<?, ?> map = c();
    map.put(paramK, paramV);
    return (Map)map;
  }
  
  public static <K, V> Map<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2) {
    Map<?, ?> map = c();
    map.put(paramK1, paramV1);
    map.put(paramK2, paramV2);
    return (Map)map;
  }
  
  public static <K, V> Map<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3) {
    Map<?, ?> map = c();
    map.put(paramK1, paramV1);
    map.put(paramK2, paramV2);
    map.put(paramK3, paramV3);
    return (Map)map;
  }
  
  public static <K, V> Map<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3, K paramK4, V paramV4) {
    Map<?, ?> map = c();
    map.put(paramK1, paramV1);
    map.put(paramK2, paramV2);
    map.put(paramK3, paramV3);
    map.put(paramK4, paramV4);
    return (Map)map;
  }
  
  public static <K, V> Map<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3, K paramK4, V paramV4, K paramK5, V paramV5) {
    Map<?, ?> map = c();
    map.put(paramK1, paramV1);
    map.put(paramK2, paramV2);
    map.put(paramK3, paramV3);
    map.put(paramK4, paramV4);
    map.put(paramK5, paramV5);
    return (Map)map;
  }
  
  public static <K, V> Map<K, V> a(K paramK1, V paramV1, K paramK2, V paramV2, K paramK3, V paramV3, K paramK4, V paramV4, K paramK5, V paramV5, K paramK6, V paramV6) {
    Map<?, ?> map = c();
    map.put(paramK1, paramV1);
    map.put(paramK2, paramV2);
    map.put(paramK3, paramV3);
    map.put(paramK4, paramV4);
    map.put(paramK5, paramV5);
    map.put(paramK6, paramV6);
    return (Map)map;
  }
  
  public static <K, V> HashMap<K, V> b() {
    return new HashMap<K, V>();
  }
  
  public static <K, V> Map<K, V> c() {
    return b();
  }
  
  public static final class b<K, V> {
    private Map a = f.b();
    
    private boolean b = true;
    
    private b() {}
    
    public b<K, V> a(K param1K, V param1V) {
      if (this.b) {
        this.a.put(param1K, param1V);
        return this;
      } 
      throw new IllegalStateException("Underlying map has already been built");
    }
    
    public Map<K, V> a() {
      if (this.b) {
        this.b = false;
        return this.a;
      } 
      throw new IllegalStateException("Underlying map has already been built");
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/common/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */