package com.google.firebase.components;

import com.google.firebase.p.b;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

class a0<T> implements b<Set<T>> {
  private volatile Set<b<T>> a = Collections.newSetFromMap(new ConcurrentHashMap<b<T>, Boolean>());
  
  private volatile Set<T> b = null;
  
  a0(Collection<b<T>> paramCollection) {
    this.a.addAll(paramCollection);
  }
  
  static a0<?> a(Collection<b<?>> paramCollection) {
    return new a0(paramCollection);
  }
  
  private void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Set;
    //   6: invokeinterface iterator : ()Ljava/util/Iterator;
    //   11: astore_1
    //   12: aload_1
    //   13: invokeinterface hasNext : ()Z
    //   18: ifeq -> 50
    //   21: aload_1
    //   22: invokeinterface next : ()Ljava/lang/Object;
    //   27: checkcast com/google/firebase/p/b
    //   30: astore_2
    //   31: aload_0
    //   32: getfield b : Ljava/util/Set;
    //   35: aload_2
    //   36: invokeinterface get : ()Ljava/lang/Object;
    //   41: invokeinterface add : (Ljava/lang/Object;)Z
    //   46: pop
    //   47: goto -> 12
    //   50: aload_0
    //   51: aconst_null
    //   52: putfield a : Ljava/util/Set;
    //   55: aload_0
    //   56: monitorexit
    //   57: return
    //   58: astore_1
    //   59: aload_0
    //   60: monitorexit
    //   61: goto -> 66
    //   64: aload_1
    //   65: athrow
    //   66: goto -> 64
    // Exception table:
    //   from	to	target	type
    //   2	12	58	finally
    //   12	47	58	finally
    //   50	55	58	finally
  }
  
  void a(b<T> paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/Set;
    //   6: ifnonnull -> 29
    //   9: aload_0
    //   10: getfield a : Ljava/util/Set;
    //   13: astore_3
    //   14: aload_1
    //   15: astore_2
    //   16: aload_3
    //   17: astore_1
    //   18: aload_1
    //   19: aload_2
    //   20: invokeinterface add : (Ljava/lang/Object;)Z
    //   25: pop
    //   26: goto -> 48
    //   29: aload_0
    //   30: getfield b : Ljava/util/Set;
    //   33: astore_2
    //   34: aload_1
    //   35: invokeinterface get : ()Ljava/lang/Object;
    //   40: astore_3
    //   41: aload_2
    //   42: astore_1
    //   43: aload_3
    //   44: astore_2
    //   45: goto -> 18
    //   48: aload_0
    //   49: monitorexit
    //   50: return
    //   51: astore_1
    //   52: aload_0
    //   53: monitorexit
    //   54: goto -> 59
    //   57: aload_1
    //   58: athrow
    //   59: goto -> 57
    // Exception table:
    //   from	to	target	type
    //   2	14	51	finally
    //   18	26	51	finally
    //   29	41	51	finally
  }
  
  public Set<T> get() {
    // Byte code:
    //   0: aload_0
    //   1: getfield b : Ljava/util/Set;
    //   4: ifnonnull -> 44
    //   7: aload_0
    //   8: monitorenter
    //   9: aload_0
    //   10: getfield b : Ljava/util/Set;
    //   13: ifnonnull -> 34
    //   16: aload_0
    //   17: new java/util/concurrent/ConcurrentHashMap
    //   20: dup
    //   21: invokespecial <init> : ()V
    //   24: invokestatic newSetFromMap : (Ljava/util/Map;)Ljava/util/Set;
    //   27: putfield b : Ljava/util/Set;
    //   30: aload_0
    //   31: invokespecial a : ()V
    //   34: aload_0
    //   35: monitorexit
    //   36: goto -> 44
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    //   44: aload_0
    //   45: getfield b : Ljava/util/Set;
    //   48: invokestatic unmodifiableSet : (Ljava/util/Set;)Ljava/util/Set;
    //   51: areturn
    // Exception table:
    //   from	to	target	type
    //   9	34	39	finally
    //   34	36	39	finally
    //   40	42	39	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/a0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */