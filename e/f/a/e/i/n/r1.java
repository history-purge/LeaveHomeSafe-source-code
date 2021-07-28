package e.f.a.e.i.n;

final class r1 {
  static {
    if (a("org.robolectric.Robolectric") != null) {
      bool = true;
    } else {
      bool = false;
    } 
    b = bool;
  }
  
  private static <T> Class<T> a(String paramString) {
    try {
      return (Class)Class.forName(paramString);
    } finally {
      paramString = null;
    } 
  }
  
  static boolean a() {
    return (a != null && !b);
  }
  
  static Class<?> b() {
    return a;
  }
  
  static {
    boolean bool;
  }
  
  private static final Class<?> a = a("libcore.io.Memory");
  
  private static final boolean b;
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/r1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */