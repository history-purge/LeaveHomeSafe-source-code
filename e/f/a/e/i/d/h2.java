package e.f.a.e.i.d;

final class h2 {
  private static final f2 a = c();
  
  private static final f2 b = new g2();
  
  static f2 a() {
    return a;
  }
  
  static f2 b() {
    return b;
  }
  
  private static f2 c() {
    try {
      return Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/h2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */