package e.f.a.e.i.n;

final class w2 {
  private static final v2<?> a = new u2();
  
  private static final v2<?> b = c();
  
  static v2<?> a() {
    return a;
  }
  
  static v2<?> b() {
    v2<?> v21 = b;
    if (v21 != null)
      return v21; 
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
  
  private static v2<?> c() {
    try {
      return Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/w2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */