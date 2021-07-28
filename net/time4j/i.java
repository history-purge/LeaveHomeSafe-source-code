package net.time4j;

import net.time4j.d1.g0;
import net.time4j.d1.p;
import net.time4j.d1.v;

final class i extends o<f0> {
  private final Object d;
  
  i(p<?> paramp, int paramInt) {
    this(paramp, paramInt, null);
  }
  
  i(p<?> paramp, int paramInt, Object paramObject) {
    super(paramp, paramInt);
    StringBuilder stringBuilder;
    Object object;
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown: ");
        stringBuilder.append(a());
        throw new AssertionError(stringBuilder.toString());
      case 6:
        object = a((p<?>)stringBuilder, paramObject);
        break;
      case 5:
        object = g0.a((p)object);
        break;
      case 4:
        object = g0.b((p)object);
        break;
      case 3:
        object = g0.d((p)object);
        break;
      case 2:
        object = g0.c((p)object);
        break;
      case 1:
        object = g0.e((p)object);
        break;
      case 0:
        object = g0.f((p)object);
        break;
      case -1:
        object = b((p<?>)object, paramObject);
        break;
    } 
    this.d = object;
  }
  
  private static <V> Object a(p<V> paramp, Object paramObject) {
    return s0.a(g0.b(paramp.getType().cast(paramObject), paramp), paramObject);
  }
  
  private static <V> Object b(p<V> paramp, Object paramObject) {
    return s0.a(g0.a(paramp.getType().cast(paramObject), paramp), paramObject);
  }
  
  public f0 a(f0 paramf0) {
    return (f0)((v)this.d).a(paramf0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */