package com.google.mlkit.vision.common.internal;

import com.google.android.gms.common.internal.q;
import com.google.firebase.p.b;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class e {
  private final Map<Class<? extends Object<?>>, b<? extends Object<?, ?>>> a = new HashMap<Class<? extends Object<?>>, b<? extends Object<?, ?>>>();
  
  e(Set<a> paramSet) {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    for (a a : paramSet) {
      Class<? extends Object<?>> clazz = a.a();
      if (this.a.containsKey(clazz)) {
        int i = a.c();
        Integer integer = (Integer)hashMap.get(clazz);
        q.a(integer);
        if (i >= integer.intValue())
          continue; 
        continue;
      } 
      continue;
      this.a.put(SYNTHETIC_LOCAL_VARIABLE_5, SYNTHETIC_LOCAL_VARIABLE_4.b());
      hashMap.put(SYNTHETIC_LOCAL_VARIABLE_5, Integer.valueOf(SYNTHETIC_LOCAL_VARIABLE_4.c()));
    } 
  }
  
  public static class a {
    private final Class<? extends Object<?>> a;
    
    private final b<? extends Object<?, ?>> b;
    
    private final int c;
    
    final Class<? extends Object<?>> a() {
      return this.a;
    }
    
    final b<? extends Object<?, ?>> b() {
      return this.b;
    }
    
    final int c() {
      return this.c;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/mlkit/vision/common/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */