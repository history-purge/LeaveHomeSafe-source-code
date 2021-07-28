package e.f.a.e.i.d;

final class y1 extends v1 {
  private y1() {
    super(null);
  }
  
  private static <E> k1<E> b(Object paramObject, long paramLong) {
    return (k1<E>)a4.f(paramObject, paramLong);
  }
  
  final void a(Object paramObject, long paramLong) {
    b(paramObject, paramLong).x();
  }
  
  final <E> void a(Object paramObject1, Object<?> paramObject2, long paramLong) {
    Object<?> object;
    k1<?> k11 = b(paramObject1, paramLong);
    k1<?> k12 = b(paramObject2, paramLong);
    int i = k11.size();
    int j = k12.size();
    paramObject2 = (Object<?>)k11;
    if (i > 0) {
      paramObject2 = (Object<?>)k11;
      if (j > 0) {
        paramObject2 = (Object<?>)k11;
        if (!k11.w())
          paramObject2 = (Object<?>)k11.h(j + i); 
        paramObject2.addAll(k12);
      } 
    } 
    k11 = k12;
    if (i > 0)
      object = paramObject2; 
    a4.a(paramObject1, paramLong, object);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/y1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */