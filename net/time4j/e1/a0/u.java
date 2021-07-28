package net.time4j.e1.a0;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import net.time4j.d1.p;
import net.time4j.d1.r;

class u extends t<u> {
  private Object c = null;
  
  private Map<p<?>, Object> d = null;
  
  public int a(p<Integer> paramp) {
    if (paramp != null) {
      Map<p<?>, Object> map = this.d;
      return (map != null && map.containsKey(paramp)) ? ((Integer)paramp.getType().cast(map.get(paramp))).intValue() : Integer.MIN_VALUE;
    } 
    throw new NullPointerException();
  }
  
  void a(Object paramObject) {
    this.c = paramObject;
  }
  
  void b(p<?> paramp, int paramInt) {
    if (paramp != null) {
      Map<p<?>, Object> map2 = this.d;
      Map<p<?>, Object> map1 = map2;
      if (map2 == null) {
        map1 = new HashMap<p<?>, Object>();
        this.d = map1;
      } 
      map1.put(paramp, Integer.valueOf(paramInt));
      return;
    } 
    throw new NullPointerException();
  }
  
  void c(p<?> paramp, Object<p<?>, Object> paramObject) {
    if (paramp != null) {
      if (paramObject == null) {
        paramObject = (Object<p<?>, Object>)this.d;
        if (paramObject != null) {
          paramObject.remove(paramp);
          if (this.d.isEmpty()) {
            this.d = null;
            return;
          } 
        } 
      } else {
        Map<p<?>, Object> map2 = this.d;
        Map<p<?>, Object> map1 = map2;
        if (map2 == null) {
          map1 = new HashMap<p<?>, Object>();
          this.d = map1;
        } 
        map1.put(paramp, paramObject);
      } 
      return;
    } 
    throw new NullPointerException();
  }
  
  public boolean c(p<?> paramp) {
    if (paramp != null) {
      Map<p<?>, Object> map = this.d;
      if (map != null)
        return map.containsKey(paramp); 
    } 
    return false;
  }
  
  public <V> V e(p<V> paramp) {
    if (paramp != null) {
      Map<p<?>, Object> map = this.d;
      if (map != null && map.containsKey(paramp))
        return paramp.getType().cast(map.get(paramp)); 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("No value found for: ");
      stringBuilder.append(paramp.name());
      throw new r(stringBuilder.toString());
    } 
    throw new NullPointerException();
  }
  
  public Set<p<?>> u() {
    Map<p<?>, Object> map = this.d;
    return (map == null) ? Collections.emptySet() : Collections.unmodifiableSet(map.keySet());
  }
  
  <E> E v() {
    return (E)this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */