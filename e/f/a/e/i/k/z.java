package e.f.a.e.i.k;

import java.util.Map;

public final class z {
  static <V> V a(Map<?, V> paramMap, Object paramObject) {
    if (paramMap != null)
      try {
        return paramMap.get(paramObject);
      } catch (ClassCastException|NullPointerException classCastException) {
        return null;
      }  
    throw null;
  }
  
  static boolean b(Map<?, ?> paramMap, Object paramObject) {
    if (paramMap != null)
      try {
        return paramMap.containsKey(paramObject);
      } catch (ClassCastException|NullPointerException classCastException) {
        return false;
      }  
    throw null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */