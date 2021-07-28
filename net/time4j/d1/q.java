package net.time4j.d1;

import java.util.Set;
import net.time4j.tz.k;

public abstract class q<T extends q<T>> implements o {
  public int a(p<Integer> paramp) {
    c0<T> c0 = s().a(paramp);
    if (c0 == null)
      try {
        return ((Integer)e(paramp)).intValue();
      } catch (r r) {
        return Integer.MIN_VALUE;
      }  
    return c0.f(t());
  }
  
  public T a(p<Integer> paramp, int paramInt) {
    c0<T> c0 = s().a(paramp);
    return (T)((c0 != null) ? (q)c0.a(t(), paramInt, paramp.c()) : (Object)b(paramp, Integer.valueOf(paramInt)));
  }
  
  public T a(v<T> paramv) {
    return paramv.a(t());
  }
  
  public boolean a(p<Long> paramp, long paramLong) {
    return a(paramp, Long.valueOf(paramLong));
  }
  
  public <V> boolean a(p<V> paramp, V paramV) {
    if (paramp != null)
      return (c(paramp) && f(paramp).a(t(), paramV)); 
    throw new NullPointerException("Missing chronological element.");
  }
  
  public <V> V b(p<V> paramp) {
    return f(paramp).e(t());
  }
  
  public T b(p<Long> paramp, long paramLong) {
    return b(paramp, Long.valueOf(paramLong));
  }
  
  public <V> T b(p<V> paramp, V paramV) {
    return (T)f(paramp).a((q)t(), paramV, paramp.c());
  }
  
  public k c() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Timezone not available: ");
    stringBuilder.append(this);
    throw new r(stringBuilder.toString());
  }
  
  public boolean c(p<?> paramp) {
    return s().d(paramp);
  }
  
  public <V> V d(p<V> paramp) {
    return f(paramp).a(t());
  }
  
  public boolean d() {
    return false;
  }
  
  public <V> V e(p<V> paramp) {
    return f(paramp).d(t());
  }
  
  <V> z<T, V> f(p<V> paramp) {
    return s().b(paramp);
  }
  
  protected abstract x<T> s();
  
  protected T t() {
    x<T> x = s();
    Class<T> clazz = x.e();
    if (clazz.isInstance(this)) {
      clazz = (Class<T>)clazz.cast(this);
      return (T)clazz;
    } 
    for (p<T> p : x.g()) {
      if (clazz == p.getType()) {
        clazz = (Class<T>)clazz.cast(e(p));
        return (T)clazz;
      } 
    } 
    IllegalStateException illegalStateException = new IllegalStateException("Implementation error: Cannot find entity context.");
    throw illegalStateException;
  }
  
  public Set<p<?>> u() {
    return s().g();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */