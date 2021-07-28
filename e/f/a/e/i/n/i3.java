package e.f.a.e.i.n;

final class i3 implements s4 {
  private static final i3 a = new i3();
  
  public static i3 a() {
    return a;
  }
  
  public final boolean a(Class<?> paramClass) {
    return h3.class.isAssignableFrom(paramClass);
  }
  
  public final p4 b(Class<?> paramClass) {
    String str;
    if (!h3.class.isAssignableFrom(paramClass)) {
      str = String.valueOf(paramClass.getName());
      if (str.length() != 0) {
        str = "Unsupported message type: ".concat(str);
      } else {
        str = new String("Unsupported message type: ");
      } 
      throw new IllegalArgumentException(str);
    } 
    try {
      return (p4)h3.<h3<?, ?>>a(str.asSubclass(h3.class)).a(h3.f.c, (Object)null, (Object)null);
    } catch (Exception exception) {
      str = String.valueOf(str.getName());
      if (str.length() != 0) {
        str = "Unable to get message info for ".concat(str);
      } else {
        str = new String("Unable to get message info for ");
      } 
      throw new RuntimeException(str, exception);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/i3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */