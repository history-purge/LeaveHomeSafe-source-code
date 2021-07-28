package e.f.a.e.i.d;

final class e1 implements j2 {
  private static final e1 a = new e1();
  
  public static e1 a() {
    return a;
  }
  
  public final boolean a(Class<?> paramClass) {
    return f1.class.isAssignableFrom(paramClass);
  }
  
  public final i2 b(Class<?> paramClass) {
    String str;
    if (!f1.class.isAssignableFrom(paramClass)) {
      str = String.valueOf(paramClass.getName());
      if (str.length() != 0) {
        str = "Unsupported message type: ".concat(str);
      } else {
        str = new String("Unsupported message type: ");
      } 
      throw new IllegalArgumentException(str);
    } 
    try {
      return (i2)f1.<f1<?, ?>>a(str.asSubclass(f1.class)).a(f1.e.c, (Object)null, (Object)null);
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/e1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */