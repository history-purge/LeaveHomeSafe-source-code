package e.f.a.e.i.n;

final class f4 extends a4 {
  private f4() {
    super(null);
  }
  
  private static <E> r3<E> b(Object paramObject, long paramLong) {
    return (r3<E>)h6.f(paramObject, paramLong);
  }
  
  final void a(Object paramObject, long paramLong) {
    b(paramObject, paramLong).zzb();
  }
  
  final <E> void a(Object paramObject1, Object<?> paramObject2, long paramLong) {
    Object<?> object;
    r3<?> r31 = b(paramObject1, paramLong);
    r3<?> r32 = b(paramObject2, paramLong);
    int i = r31.size();
    int j = r32.size();
    paramObject2 = (Object<?>)r31;
    if (i > 0) {
      paramObject2 = (Object<?>)r31;
      if (j > 0) {
        paramObject2 = (Object<?>)r31;
        if (!r31.zza())
          paramObject2 = (Object<?>)r31.f(j + i); 
        paramObject2.addAll(r32);
      } 
    } 
    r31 = r32;
    if (i > 0)
      object = paramObject2; 
    h6.a(paramObject1, paramLong, object);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/n/f4.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */