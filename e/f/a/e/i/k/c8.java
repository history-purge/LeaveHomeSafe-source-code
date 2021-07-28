package e.f.a.e.i.k;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

final class c8 extends v {
  c8(e8 parame8) {}
  
  public final boolean contains(Object paramObject) {
    Set set = this.c.e.entrySet();
    if (set != null)
      try {
        return set.contains(paramObject);
      } catch (ClassCastException|NullPointerException classCastException) {
        return false;
      }  
    throw null;
  }
  
  public final Iterator<Map.Entry> iterator() {
    return new d8(this.c);
  }
  
  public final boolean remove(Object paramObject) {
    if (!contains(paramObject))
      return false; 
    paramObject = paramObject;
    m8.a(this.c.f, paramObject.getKey());
    return true;
  }
  
  final Map zza() {
    return this.c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/c8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */