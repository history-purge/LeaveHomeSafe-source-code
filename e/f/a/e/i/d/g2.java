package e.f.a.e.i.d;

import java.util.Map;

final class g2 implements f2 {
  public final int a(int paramInt, Object paramObject1, Object paramObject2) {
    paramObject1 = paramObject1;
    if (paramObject1.isEmpty())
      return 0; 
    paramObject1 = paramObject1.entrySet().iterator();
    if (!paramObject1.hasNext())
      return 0; 
    paramObject1 = paramObject1.next();
    paramObject1.getKey();
    paramObject1.getValue();
    throw new NoSuchMethodError();
  }
  
  public final Object a(Object paramObject) {
    ((e2)paramObject).c();
    return paramObject;
  }
  
  public final Object b(Object paramObject1, Object paramObject2) {
    e2 e2 = (e2)paramObject1;
    paramObject2 = paramObject2;
    paramObject1 = e2;
    if (!paramObject2.isEmpty()) {
      paramObject1 = e2;
      if (!e2.a())
        paramObject1 = e2.b(); 
      paramObject1.a((e2)paramObject2);
    } 
    return paramObject1;
  }
  
  public final boolean b(Object paramObject) {
    return !((e2)paramObject).a();
  }
  
  public final Map<?, ?> c(Object paramObject) {
    return (e2)paramObject;
  }
  
  public final d2<?, ?> d(Object paramObject) {
    throw new NoSuchMethodError();
  }
  
  public final Map<?, ?> e(Object paramObject) {
    return (e2)paramObject;
  }
  
  public final Object f(Object paramObject) {
    return e2.d().b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/g2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */