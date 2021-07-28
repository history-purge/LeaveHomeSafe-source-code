package e.e.e.d;

import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArraySet;

public final class k {
  public static <E> Set<E> a(Map<E, Boolean> paramMap) {
    return Collections.newSetFromMap(paramMap);
  }
  
  public static <E> CopyOnWriteArraySet<E> a() {
    return new CopyOnWriteArraySet<E>();
  }
  
  public static <E> Set<E> b() {
    return a(new IdentityHashMap<E, Boolean>());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/d/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */