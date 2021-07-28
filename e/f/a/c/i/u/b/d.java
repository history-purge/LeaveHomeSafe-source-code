package e.f.a.c.i.u.b;

public final class d {
  public static <T> T a(T paramT) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException();
  }
  
  public static <T> T a(T paramT, String paramString) {
    if (paramT != null)
      return paramT; 
    throw new NullPointerException(paramString);
  }
  
  public static <T> void a(T paramT, Class<T> paramClass) {
    if (paramT != null)
      return; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramClass.getCanonicalName());
    stringBuilder.append(" must be set");
    throw new IllegalStateException(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/u/b/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */