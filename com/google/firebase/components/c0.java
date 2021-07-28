package com.google.firebase.components;

import com.google.firebase.p.a;
import com.google.firebase.p.b;

class c0<T> implements b<T>, a<T> {
  private static final a.a<Object> c = k.a;
  
  private static final b<Object> d = j.a;
  
  private a.a<T> a;
  
  private volatile b<T> b;
  
  private c0(a.a<T> parama, b<T> paramb) {
    this.a = parama;
    this.b = paramb;
  }
  
  static <T> c0<T> a() {
    return new c0<T>((a.a)c, (b)d);
  }
  
  void a(b<T> paramb) {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Lcom/google/firebase/p/b;
    //   4: getstatic com/google/firebase/components/c0.d : Lcom/google/firebase/p/b;
    //   7: if_acmpne -> 42
    //   10: aload_0
    //   11: monitorenter
    //   12: aload_0
    //   13: getfield a : Lcom/google/firebase/p/a$a;
    //   16: astore_2
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield a : Lcom/google/firebase/p/a$a;
    //   22: aload_0
    //   23: aload_1
    //   24: putfield b : Lcom/google/firebase/p/b;
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: aload_1
    //   31: invokeinterface a : (Lcom/google/firebase/p/b;)V
    //   36: return
    //   37: astore_1
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_1
    //   41: athrow
    //   42: new java/lang/IllegalStateException
    //   45: dup
    //   46: ldc 'provide() can be called only once.'
    //   48: invokespecial <init> : (Ljava/lang/String;)V
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   12	29	37	finally
    //   38	40	37	finally
  }
  
  public T get() {
    return (T)this.b.get();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */