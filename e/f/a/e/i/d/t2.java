package e.f.a.e.i.d;

final class t2 {
  private static final r2 a = c();
  
  private static final r2 b = new s2();
  
  static r2 a() {
    return a;
  }
  
  static r2 b() {
    return b;
  }
  
  private static r2 c() {
    try {
      return Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/t2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */