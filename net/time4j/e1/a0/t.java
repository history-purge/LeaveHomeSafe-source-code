package net.time4j.e1.a0;

import java.util.Iterator;
import java.util.Set;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.x;
import net.time4j.tz.k;

abstract class t<T extends t<T>> extends q<T> {
  public T a(p<Integer> paramp, int paramInt) {
    b(paramp, paramInt);
    return (T)this;
  }
  
  abstract void a(Object paramObject);
  
  public <V> boolean a(p<V> paramp, V paramV) {
    if (paramp != null)
      return true; 
    throw new NullPointerException("Missing chronological element.");
  }
  
  public <V> V b(p<V> paramp) {
    return (V)paramp.b();
  }
  
  public <V> T b(p<V> paramp, V paramV) {
    c(paramp, paramV);
    return (T)this;
  }
  
  abstract void b(p<?> paramp, int paramInt);
  
  public final k c() {
    if (c(b0.c)) {
      object = b0.c;
    } else if (c(b0.d)) {
      object = b0.d;
    } else {
      object = null;
      if (object instanceof k)
        return k.class.cast(object); 
    } 
    Object object = e((p)object);
    if (object instanceof k)
      return k.class.cast(object); 
  }
  
  abstract void c(p<?> paramp, Object paramObject);
  
  public <V> V d(p<V> paramp) {
    return (V)paramp.q();
  }
  
  public final boolean d() {
    return (c(b0.c) || c(b0.d));
  }
  
  public final boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof t) {
      paramObject = paramObject;
      Set set2 = u();
      Set set1 = paramObject.u();
      if (set2.size() != set1.size())
        return false; 
      for (p p : set2) {
        if (!set1.contains(p) || !e(p).equals(paramObject.e(p)))
          return false; 
      } 
      set1 = v();
      paramObject = paramObject.v();
      return (set1 == null) ? ((paramObject == null)) : set1.equals(paramObject);
    } 
    return false;
  }
  
  public final int hashCode() {
    int j = u().hashCode();
    Object object = v();
    int i = j;
    if (object != null)
      i = j + object.hashCode() * 31; 
    return i;
  }
  
  protected final x<T> s() {
    throw new UnsupportedOperationException("Parsed values do not have any chronology.");
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder(128);
    stringBuilder.append('{');
    Iterator<p> iterator = u().iterator();
    boolean bool = true;
    while (iterator.hasNext()) {
      p p = iterator.next();
      if (bool) {
        bool = false;
      } else {
        stringBuilder.append(", ");
      } 
      stringBuilder.append(p.name());
      stringBuilder.append('=');
      stringBuilder.append(e(p));
    } 
    stringBuilder.append('}');
    iterator = v();
    if (iterator != null) {
      stringBuilder.append(">>>result=");
      stringBuilder.append(iterator);
    } 
    return stringBuilder.toString();
  }
  
  abstract <E> E v();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/a0/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */