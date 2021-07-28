package e.f.a.e.i.n;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

final class e5 {
  private static final e5 c = new e5();
  
  private final l5 a = new i4();
  
  private final ConcurrentMap<Class<?>, j5<?>> b = new ConcurrentHashMap<Class<?>, j5<?>>();
  
  public static e5 a() {
    return c;
  }
  
  public final <T> j5<T> a(Class<T> paramClass) {
    l3.a(paramClass, "messageType");
    j5<T> j52 = (j5)this.b.get(paramClass);
    j5<T> j51 = j52;
    if (j52 == null) {
      j51 = this.a.a(paramClass);
      l3.a(paramClass, "messageType");
      l3.a(j51, "schema");
      j5<T> j5 = (j5)this.b.putIfAbsent(paramClass, j51);
      if (j5 != null)
        j51 = j5; 
    } 
    return j51;
  }
  
  public final <T> j5<T> a(T paramT) {
    return a((Class)paramT.getClass());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/e5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */