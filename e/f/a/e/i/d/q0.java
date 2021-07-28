package e.f.a.e.i.d;

final class q0 {
  private static final Class<?> a = a();
  
  private static Class<?> a() {
    try {
      return Class.forName("com.google.protobuf.ExtensionRegistry");
    } catch (ClassNotFoundException classNotFoundException) {
      return null;
    } 
  }
  
  public static r0 b() {
    Class<?> clazz = a;
    if (clazz != null)
      try {
        return (r0)clazz.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
      } catch (Exception exception) {} 
    return r0.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */