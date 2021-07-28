package e.f.a.e.i.n;

final class q4 {
  private static final o4 a = c();
  
  private static final o4 b = new n4();
  
  static o4 a() {
    return a;
  }
  
  static o4 b() {
    return b;
  }
  
  private static o4 c() {
    try {
      return Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/q4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */