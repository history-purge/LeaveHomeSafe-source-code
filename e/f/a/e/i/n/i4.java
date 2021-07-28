package e.f.a.e.i.n;

final class i4 implements l5 {
  private static final s4 b = new h4();
  
  private final s4 a;
  
  public i4() {
    this(new k4(new s4[] { i3.a(), a() }));
  }
  
  private i4(s4 params4) {
    l3.a(params4, "messageInfoFactory");
    this.a = params4;
  }
  
  private static s4 a() {
    try {
      return (s4)Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", new Class[0]).invoke(null, new Object[0]);
    } catch (Exception exception) {
      return b;
    } 
  }
  
  private static boolean a(p4 paramp4) {
    return (paramp4.zza() == f5.a);
  }
  
  public final <T> j5<T> a(Class<T> paramClass) {
    k5.a(paramClass);
    p4 p4 = this.a.b(paramClass);
    if (p4.zzb())
      return h3.class.isAssignableFrom(paramClass) ? x4.a(k5.c(), w2.a(), p4.g()) : x4.a(k5.a(), w2.b(), p4.g()); 
    if (h3.class.isAssignableFrom(paramClass)) {
      boolean bool1 = a(p4);
      y4 y41 = a5.b();
      a4 a41 = a4.b();
      a6<?, ?> a6 = k5.c();
      return bool1 ? v4.a(paramClass, p4, y41, a41, a6, w2.a(), q4.b()) : v4.a(paramClass, p4, y41, a41, a6, (v2<?>)null, q4.b());
    } 
    boolean bool = a(p4);
    y4 y4 = a5.a();
    a4 a4 = a4.a();
    return bool ? v4.a(paramClass, p4, y4, a4, k5.a(), w2.b(), q4.a()) : v4.a(paramClass, p4, y4, a4, k5.b(), (v2<?>)null, q4.a());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/i4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */