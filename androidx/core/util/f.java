package androidx.core.util;

public final class f {
  public static int a(int paramInt) {
    if (paramInt >= 0)
      return paramInt; 
    throw new IllegalArgumentException();
  }
  
  public static <T> T a(T paramT) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException();
  }
  
  public static <T> T a(T paramT, Object paramObject) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(String.valueOf(paramObject));
  }
  
  public static void a(boolean paramBoolean, Object paramObject) {
    if (paramBoolean)
      return; 
    throw new IllegalArgumentException(String.valueOf(paramObject));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/util/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */