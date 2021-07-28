package net.time4j;

import net.time4j.d1.g0;
import net.time4j.d1.p;
import net.time4j.d1.q;
import net.time4j.d1.v;

final class q0 extends o<g0> {
  private final Object d;
  
  q0(p<?> paramp, int paramInt) {
    this(paramp, paramInt, null);
  }
  
  q0(p<?> paramp, int paramInt, Object paramObject) {
    super(paramp, paramInt);
    StringBuilder stringBuilder;
    Object<q> object1;
    v<q> v;
    Object object;
    boolean bool;
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown: ");
        stringBuilder.append(a());
        throw new AssertionError(stringBuilder.toString());
      case 6:
        object1 = a((p<?>)stringBuilder, paramObject);
        break;
      case 5:
        bool = true;
        object1 = a((p<?>)object1, bool);
        break;
      case 4:
        bool = false;
        v = a((p<q>)object1, bool);
        break;
      case 3:
        v = g0.d((p)v);
        break;
      case 2:
        v = g0.c((p)v);
        break;
      case 1:
        v = g0.e((p)v);
        break;
      case 0:
        v = g0.f((p)v);
        break;
      case -1:
        object = b((p<q>)v, paramObject);
        break;
    } 
    this.d = object;
  }
  
  private static <V> Object a(p<V> paramp, Object paramObject) {
    return s0.a(g0.b(paramp.getType().cast(paramObject), paramp), paramObject);
  }
  
  private static <V, T extends q<T>> v<T> a(p<V> paramp, boolean paramBoolean) {
    String str = paramp.name();
    return (str.equals("MILLI_OF_SECOND") || str.equals("MILLI_OF_DAY")) ? new q<T>('3', paramBoolean) : ((str.equals("MICRO_OF_SECOND") || str.equals("MICRO_OF_DAY")) ? new q<T>('6', paramBoolean) : ((str.equals("NANO_OF_SECOND") || str.equals("NANO_OF_DAY")) ? new q<T>('9', paramBoolean) : (paramBoolean ? g0.a(paramp) : g0.b(paramp))));
  }
  
  private static <V> Object b(p<V> paramp, Object paramObject) {
    return s0.a(g0.a(paramp.getType().cast(paramObject), paramp), paramObject);
  }
  
  public g0 a(g0 paramg0) {
    return (g0)((v)this.d).a(paramg0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */