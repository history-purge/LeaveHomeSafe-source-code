package com.google.firebase.components;

import com.google.firebase.p.b;

public class z<T> implements b<T> {
  private static final Object c = new Object();
  
  private volatile Object a = c;
  
  private volatile b<T> b;
  
  public z(b<T> paramb) {
    this.b = paramb;
  }
  
  public T get() {
    // Byte code:
    //   0: aload_0
    //   1: getfield a : Ljava/lang/Object;
    //   4: astore_1
    //   5: aload_1
    //   6: getstatic com/google/firebase/components/z.c : Ljava/lang/Object;
    //   9: if_acmpne -> 57
    //   12: aload_0
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield a : Ljava/lang/Object;
    //   18: astore_2
    //   19: aload_2
    //   20: astore_1
    //   21: aload_2
    //   22: getstatic com/google/firebase/components/z.c : Ljava/lang/Object;
    //   25: if_acmpne -> 48
    //   28: aload_0
    //   29: getfield b : Lcom/google/firebase/p/b;
    //   32: invokeinterface get : ()Ljava/lang/Object;
    //   37: astore_1
    //   38: aload_0
    //   39: aload_1
    //   40: putfield a : Ljava/lang/Object;
    //   43: aload_0
    //   44: aconst_null
    //   45: putfield b : Lcom/google/firebase/p/b;
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: areturn
    //   52: astore_1
    //   53: aload_0
    //   54: monitorexit
    //   55: aload_1
    //   56: athrow
    //   57: aload_1
    //   58: areturn
    // Exception table:
    //   from	to	target	type
    //   14	19	52	finally
    //   21	48	52	finally
    //   48	50	52	finally
    //   53	55	52	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */