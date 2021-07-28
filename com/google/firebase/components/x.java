package com.google.firebase.components;

import com.google.firebase.n.a;
import com.google.firebase.n.b;
import com.google.firebase.n.c;
import com.google.firebase.n.d;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

class x implements d, c {
  private final Map<Class<?>, ConcurrentHashMap<b<Object>, Executor>> a = new HashMap<Class<?>, ConcurrentHashMap<b<Object>, Executor>>();
  
  private Queue<a<?>> b = new ArrayDeque<a<?>>();
  
  private final Executor c;
  
  x(Executor paramExecutor) {
    this.c = paramExecutor;
  }
  
  private Set<Map.Entry<b<Object>, Executor>> b(a<?> parama) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokevirtual a : ()Ljava/lang/Class;
    //   10: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   15: checkcast java/util/Map
    //   18: astore_1
    //   19: aload_1
    //   20: ifnonnull -> 30
    //   23: invokestatic emptySet : ()Ljava/util/Set;
    //   26: astore_1
    //   27: goto -> 37
    //   30: aload_1
    //   31: invokeinterface entrySet : ()Ljava/util/Set;
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: areturn
    //   41: astore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_1
    //   45: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	41	finally
    //   23	27	41	finally
    //   30	37	41	finally
  }
  
  void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/Queue;
    //   6: ifnull -> 72
    //   9: aload_0
    //   10: getfield b : Ljava/util/Queue;
    //   13: astore_1
    //   14: aload_0
    //   15: aconst_null
    //   16: putfield b : Ljava/util/Queue;
    //   19: goto -> 22
    //   22: aload_0
    //   23: monitorexit
    //   24: aload_1
    //   25: ifnull -> 60
    //   28: aload_1
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore_1
    //   35: aload_1
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 60
    //   44: aload_0
    //   45: aload_1
    //   46: invokeinterface next : ()Ljava/lang/Object;
    //   51: checkcast com/google/firebase/n/a
    //   54: invokevirtual a : (Lcom/google/firebase/n/a;)V
    //   57: goto -> 35
    //   60: return
    //   61: astore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: goto -> 69
    //   67: aload_1
    //   68: athrow
    //   69: goto -> 67
    //   72: aconst_null
    //   73: astore_1
    //   74: goto -> 22
    // Exception table:
    //   from	to	target	type
    //   2	19	61	finally
    //   22	24	61	finally
    //   62	64	61	finally
  }
  
  public void a(a<?> parama) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield b : Ljava/util/Queue;
    //   11: ifnull -> 28
    //   14: aload_0
    //   15: getfield b : Ljava/util/Queue;
    //   18: aload_1
    //   19: invokeinterface add : (Ljava/lang/Object;)Z
    //   24: pop
    //   25: aload_0
    //   26: monitorexit
    //   27: return
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_0
    //   31: aload_1
    //   32: invokespecial b : (Lcom/google/firebase/n/a;)Ljava/util/Set;
    //   35: invokeinterface iterator : ()Ljava/util/Iterator;
    //   40: astore_2
    //   41: aload_2
    //   42: invokeinterface hasNext : ()Z
    //   47: ifeq -> 86
    //   50: aload_2
    //   51: invokeinterface next : ()Ljava/lang/Object;
    //   56: checkcast java/util/Map$Entry
    //   59: astore_3
    //   60: aload_3
    //   61: invokeinterface getValue : ()Ljava/lang/Object;
    //   66: checkcast java/util/concurrent/Executor
    //   69: new com/google/firebase/components/i
    //   72: dup
    //   73: aload_3
    //   74: aload_1
    //   75: invokespecial <init> : (Ljava/util/Map$Entry;Lcom/google/firebase/n/a;)V
    //   78: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   83: goto -> 41
    //   86: return
    //   87: astore_1
    //   88: aload_0
    //   89: monitorexit
    //   90: goto -> 95
    //   93: aload_1
    //   94: athrow
    //   95: goto -> 93
    // Exception table:
    //   from	to	target	type
    //   7	27	87	finally
    //   28	30	87	finally
    //   88	90	87	finally
  }
  
  public <T> void a(Class<T> paramClass, b<? super T> paramb) {
    a(paramClass, this.c, paramb);
  }
  
  public <T> void a(Class<T> paramClass, Executor paramExecutor, b<? super T> paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_3
    //   8: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: aload_2
    //   13: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   16: pop
    //   17: aload_0
    //   18: getfield a : Ljava/util/Map;
    //   21: aload_1
    //   22: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   27: ifne -> 48
    //   30: aload_0
    //   31: getfield a : Ljava/util/Map;
    //   34: aload_1
    //   35: new java/util/concurrent/ConcurrentHashMap
    //   38: dup
    //   39: invokespecial <init> : ()V
    //   42: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   47: pop
    //   48: aload_0
    //   49: getfield a : Ljava/util/Map;
    //   52: aload_1
    //   53: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   58: checkcast java/util/concurrent/ConcurrentHashMap
    //   61: aload_3
    //   62: aload_2
    //   63: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   66: pop
    //   67: aload_0
    //   68: monitorexit
    //   69: return
    //   70: astore_1
    //   71: aload_0
    //   72: monitorexit
    //   73: aload_1
    //   74: athrow
    // Exception table:
    //   from	to	target	type
    //   2	48	70	finally
    //   48	67	70	finally
  }
  
  public <T> void b(Class<T> paramClass, b<? super T> paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_2
    //   8: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: aload_0
    //   13: getfield a : Ljava/util/Map;
    //   16: aload_1
    //   17: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   22: istore_3
    //   23: iload_3
    //   24: ifne -> 30
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: aload_0
    //   31: getfield a : Ljava/util/Map;
    //   34: aload_1
    //   35: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   40: checkcast java/util/concurrent/ConcurrentHashMap
    //   43: astore #4
    //   45: aload #4
    //   47: aload_2
    //   48: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   51: pop
    //   52: aload #4
    //   54: invokevirtual isEmpty : ()Z
    //   57: ifeq -> 71
    //   60: aload_0
    //   61: getfield a : Ljava/util/Map;
    //   64: aload_1
    //   65: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   70: pop
    //   71: aload_0
    //   72: monitorexit
    //   73: return
    //   74: astore_1
    //   75: aload_0
    //   76: monitorexit
    //   77: aload_1
    //   78: athrow
    // Exception table:
    //   from	to	target	type
    //   2	23	74	finally
    //   30	71	74	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/components/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */