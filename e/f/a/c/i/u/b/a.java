package e.f.a.c.i.u.b;

import e.f.a.c.i.u.a;
import javax.inject.Provider;

public final class a<T> implements Provider<T>, a<T> {
  private static final Object c = new Object();
  
  private volatile Provider<T> a;
  
  private volatile Object b = c;
  
  private a(Provider<T> paramProvider) {
    this.a = paramProvider;
  }
  
  public static Object a(Object paramObject1, Object paramObject2) {
    boolean bool;
    if (paramObject1 != c) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      if (paramObject1 == paramObject2)
        return paramObject2; 
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Scoped provider was invoked recursively returning different results: ");
      stringBuilder.append(paramObject1);
      stringBuilder.append(" & ");
      stringBuilder.append(paramObject2);
      stringBuilder.append(". This is likely due to a circular dependency.");
      throw new IllegalStateException(stringBuilder.toString());
    } 
    return paramObject2;
  }
  
  public static <P extends Provider<T>, T> Provider<T> a(P paramP) {
    d.a(paramP);
    return (Provider<T>)((paramP instanceof a) ? (Object)paramP : new a<T>((Provider<T>)paramP));
  }
  
  public T get() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: getstatic e/f/a/c/i/u/b/a.c : Ljava/lang/Object;
    //   9: if_acmpne -> 66
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield b : Ljava/lang/Object;
    //   18: astore_2
    //   19: aload_2
    //   20: astore_1
    //   21: aload_2
    //   22: getstatic e/f/a/c/i/u/b/a.c : Ljava/lang/Object;
    //   25: if_acmpne -> 57
    //   28: aload_0
    //   29: getfield a : Ljavax/inject/Provider;
    //   32: invokeinterface get : ()Ljava/lang/Object;
    //   37: astore_1
    //   38: aload_0
    //   39: getfield b : Ljava/lang/Object;
    //   42: aload_1
    //   43: invokestatic a : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   46: pop
    //   47: aload_0
    //   48: aload_1
    //   49: putfield b : Ljava/lang/Object;
    //   52: aload_0
    //   53: aconst_null
    //   54: putfield a : Ljavax/inject/Provider;
    //   57: aload_0
    //   58: monitorexit
    //   59: aload_1
    //   60: areturn
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: aload_1
    //   65: athrow
    //   66: aload_1
    //   67: areturn
    // Exception table:
    //   from	to	target	type
    //   14	19	61	finally
    //   21	57	61	finally
    //   57	59	61	finally
    //   62	64	61	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/c/i/u/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */