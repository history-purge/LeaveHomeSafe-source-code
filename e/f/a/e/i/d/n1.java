package e.f.a.e.i.d;

public enum n1 {
  c(Void.class, Void.class, null),
  d(int.class, Integer.class, Integer.valueOf(0)),
  e(long.class, Long.class, Long.valueOf(0L)),
  f(float.class, Float.class, Float.valueOf(0.0F)),
  g(double.class, Double.class, Double.valueOf(0.0D)),
  h(boolean.class, Boolean.class, Boolean.valueOf(false)),
  i(String.class, String.class, ""),
  j(a0.class, a0.class, a0.c),
  k(int.class, Integer.class, null),
  l(Object.class, Object.class, null);
  
  private final Class<?> zzlh;
  
  private final Class<?> zzli;
  
  private final Object zzlj;
  
  n1(Class<?> paramClass1, Class<?> paramClass2, Object paramObject) {
    this.zzlh = paramClass1;
    this.zzli = paramClass2;
    this.zzlj = paramObject;
  }
  
  public final Class<?> a() {
    return this.zzli;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/n1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */