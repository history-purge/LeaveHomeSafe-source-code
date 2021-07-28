package e.f.a.e.i.n;

final class a5 {
  private static final y4 a = c();
  
  private static final y4 b = new b5();
  
  static y4 a() {
    return a;
  }
  
  static y4 b() {
    return b;
  }
  
  private static y4 c() {
    try {
      return Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/a5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */