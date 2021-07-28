package e.e.m.a;

public class a {
  public static <T> T a(T paramT) {
    if (paramT != null)
      return paramT; 
    throw new AssertionError();
  }
  
  public static <T> T a(T paramT, String paramString) {
    if (paramT != null)
      return paramT; 
    throw new AssertionError(paramString);
  }
  
  public static void a(boolean paramBoolean) {
    if (paramBoolean)
      return; 
    throw new AssertionError();
  }
  
  public static void a(boolean paramBoolean, String paramString) {
    if (paramBoolean)
      return; 
    throw new AssertionError(paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/m/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */