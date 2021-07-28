package net.time4j.d1;

public final class g0<T extends q<T>> implements v<T> {
  private final int c;
  
  private final p<?> d;
  
  private final Object e;
  
  private g0(int paramInt, p<?> paramp) {
    this(paramInt, paramp, null);
  }
  
  private g0(int paramInt, p<?> paramp, Object paramObject) {
    if (paramp != null) {
      this.c = paramInt;
      this.d = paramp;
      this.e = paramObject;
      return;
    } 
    throw new NullPointerException("Missing chronological element.");
  }
  
  private static <U, T extends l0<U, T>> T a(l0<U, T> paraml0, p<?> paramp, boolean paramBoolean) {
    paramp = (p<?>)paraml0.s().e(paramp);
    return paramBoolean ? paraml0.b(1L, (U)paramp) : paraml0.a(1L, (U)paramp);
  }
  
  private <V> T a(q<T> paramq, p<V> paramp) {
    paramq = (q<T>)paramq.t();
    while (true) {
      paramp = (p)paramq.s().b(paramp).b(paramq);
      if (paramp != null) {
        paramq = e(paramq, paramp);
        continue;
      } 
      return (T)paramq;
    } 
  }
  
  private <V> T a(q<T> paramq, p<V> paramp, Object paramObject, boolean paramBoolean) {
    paramq = (q<T>)paramq.t();
    return (T)paramq.s().b(paramp).a(paramq, paramp.getType().cast(paramObject), paramBoolean);
  }
  
  private T a(T paramT, boolean paramBoolean) {
    if (paramT instanceof l0) {
      Object object = a(l0.class.cast(paramT), this.d, paramBoolean);
      return (T)paramT.s().e().cast(object);
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Base units not supported by: ");
    stringBuilder.append(paramT.s().e());
    throw new r(stringBuilder.toString());
  }
  
  public static <T extends q<T>, V> v<T> a(V paramV, p<V> paramp) {
    return new g0<T>(0, paramp, paramV);
  }
  
  public static <T extends q<T>> v<T> a(p<?> paramp) {
    return new g0<T>(4, paramp);
  }
  
  private <V> T b(q<T> paramq, p<V> paramp) {
    paramq = (q<T>)paramq.t();
    while (true) {
      paramp = (p)paramq.s().b(paramp).c(paramq);
      if (paramp != null) {
        paramq = f(paramq, paramp);
        continue;
      } 
      return (T)paramq;
    } 
  }
  
  public static <T extends q<T>, V> v<T> b(V paramV, p<V> paramp) {
    return new g0<T>(5, paramp, paramV);
  }
  
  public static <T extends q<T>> v<T> b(p<?> paramp) {
    return new g0<T>(3, paramp);
  }
  
  private <V> T c(q<T> paramq, p<V> paramp) {
    return paramq.b(paramp, paramq.b(paramp));
  }
  
  public static <T extends q<T>> v<T> c(p<?> paramp) {
    return new g0<T>(6, paramp);
  }
  
  private <V> T d(q<T> paramq, p<V> paramp) {
    return paramq.b(paramp, paramq.d(paramp));
  }
  
  public static <T extends q<T>> v<T> d(p<?> paramp) {
    return new g0<T>(7, paramp);
  }
  
  private <V> T e(T paramT, p<V> paramp) {
    z z = paramT.s().b(paramp);
    return (T)z.a(paramT, z.e(paramT), paramp.c());
  }
  
  public static <T extends q<T>> v<T> e(p<?> paramp) {
    return new g0<T>(2, paramp);
  }
  
  private <V> T f(T paramT, p<V> paramp) {
    z z = paramT.s().b(paramp);
    return (T)z.a(paramT, z.a(paramT), paramp.c());
  }
  
  public static <T extends q<T>> v<T> f(p<?> paramp) {
    return new g0<T>(1, paramp);
  }
  
  public T a(T paramT) {
    StringBuilder stringBuilder;
    switch (this.c) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown mode: ");
        stringBuilder.append(this.c);
        throw new UnsupportedOperationException(stringBuilder.toString());
      case 7:
        return a((T)stringBuilder, true);
      case 6:
        return a((T)stringBuilder, false);
      case 5:
        return a((q<T>)stringBuilder, this.d, this.e, true);
      case 4:
        return a((q<T>)stringBuilder, this.d);
      case 3:
        return b((q<T>)stringBuilder, this.d);
      case 2:
        return c((q<T>)stringBuilder, this.d);
      case 1:
        return d((q<T>)stringBuilder, this.d);
      case 0:
        break;
    } 
    return a((q<T>)stringBuilder, this.d, this.e, false);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/d1/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */