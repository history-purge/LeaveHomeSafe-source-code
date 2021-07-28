package e.f.a.e.i.d;

final class a2 implements c3 {
  private static final j2 b = new b2();
  
  private final j2 a;
  
  public a2() {
    this(new c2(new j2[] { e1.a(), a() }));
  }
  
  private a2(j2 paramj2) {
    h1.a(paramj2, "messageInfoFactory");
    this.a = paramj2;
  }
  
  private static j2 a() {
    try {
      return (j2)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
    } catch (Exception exception) {
      return b;
    } 
  }
  
  private static boolean a(i2 parami2) {
    return (parami2.a() == f1.e.i);
  }
  
  public final <T> b3<T> a(Class<T> paramClass) {
    d3.a(paramClass);
    i2 i2 = this.a.b(paramClass);
    if (i2.b())
      return f1.class.isAssignableFrom(paramClass) ? p2.a(d3.c(), v0.b(), i2.c()) : p2.a(d3.a(), v0.c(), i2.c()); 
    if (f1.class.isAssignableFrom(paramClass)) {
      boolean bool1 = a(i2);
      r2 r21 = t2.b();
      v1 v11 = v1.b();
      t3<?, ?> t3 = d3.c();
      return bool1 ? o2.a(paramClass, i2, r21, v11, t3, v0.b(), h2.b()) : o2.a(paramClass, i2, r21, v11, t3, (s0<?>)null, h2.b());
    } 
    boolean bool = a(i2);
    r2 r2 = t2.a();
    v1 v1 = v1.a();
    return bool ? o2.a(paramClass, i2, r2, v1, d3.a(), v0.c(), h2.a()) : o2.a(paramClass, i2, r2, v1, d3.b(), (s0<?>)null, h2.a());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/a2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */