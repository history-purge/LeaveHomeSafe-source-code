package e.f.a.e.i.d;

final class v0 {
  private static final s0<?> a = new t0();
  
  private static final s0<?> b = a();
  
  private static s0<?> a() {
    try {
      return Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    } catch (Exception exception) {
      return null;
    } 
  }
  
  static s0<?> b() {
    return a;
  }
  
  static s0<?> c() {
    s0<?> s01 = b;
    if (s01 != null)
      return s01; 
    throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */