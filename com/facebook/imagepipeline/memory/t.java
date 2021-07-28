package com.facebook.imagepipeline.memory;

import java.util.HashSet;
import java.util.Set;

public abstract class t<T> implements d0<T> {
  private final Set<T> a = new HashSet<T>();
  
  private final g<T> b = new g<T>();
  
  private T c(T paramT) {
    // Byte code:
    //   0: aload_1
    //   1: ifnull -> 26
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield a : Ljava/util/Set;
    //   10: aload_1
    //   11: invokeinterface remove : (Ljava/lang/Object;)Z
    //   16: pop
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: areturn
    //   21: astore_1
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: athrow
    //   26: aload_1
    //   27: areturn
    // Exception table:
    //   from	to	target	type
    //   6	19	21	finally
    //   22	24	21	finally
  }
  
  public void b(T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Set;
    //   6: aload_1
    //   7: invokeinterface add : (Ljava/lang/Object;)Z
    //   12: istore_2
    //   13: aload_0
    //   14: monitorexit
    //   15: iload_2
    //   16: ifeq -> 34
    //   19: aload_0
    //   20: getfield b : Lcom/facebook/imagepipeline/memory/g;
    //   23: aload_0
    //   24: aload_1
    //   25: invokeinterface a : (Ljava/lang/Object;)I
    //   30: aload_1
    //   31: invokevirtual a : (ILjava/lang/Object;)V
    //   34: return
    //   35: astore_1
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_1
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   2	15	35	finally
    //   36	38	35	finally
  }
  
  public T get(int paramInt) {
    T t1 = this.b.a(paramInt);
    c(t1);
    return t1;
  }
  
  public T pop() {
    T t1 = this.b.a();
    c(t1);
    return t1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */