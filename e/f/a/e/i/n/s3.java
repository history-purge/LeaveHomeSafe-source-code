package e.f.a.e.i.n;

public enum s3 {
  c(Void.class, Void.class, null),
  d(int.class, Integer.class, Integer.valueOf(0)),
  e(long.class, Long.class, Long.valueOf(0L)),
  f(float.class, Float.class, Float.valueOf(0.0F)),
  g(double.class, Double.class, Double.valueOf(0.0D)),
  h(boolean.class, Boolean.class, Boolean.valueOf(false)),
  i(String.class, String.class, ""),
  j(z1.class, z1.class, z1.c),
  k(int.class, Integer.class, null),
  l(Object.class, Object.class, null);
  
  private final Class<?> zzk;
  
  private final Class<?> zzl;
  
  private final Object zzm;
  
  s3(Class<?> paramClass1, Class<?> paramClass2, Object paramObject) {
    this.zzk = paramClass1;
    this.zzl = paramClass2;
    this.zzm = paramObject;
  }
  
  public final Class<?> zza() {
    return this.zzl;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/s3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */