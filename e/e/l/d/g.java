package e.e.l.d;

import e.e.e.d.j;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

public class g<K, V> {
  private final v<V> a;
  
  private final LinkedHashMap<K, V> b = new LinkedHashMap<K, V>();
  
  private int c = 0;
  
  public g(v<V> paramv) {
    this.a = paramv;
  }
  
  private int c(V paramV) {
    return (paramV == null) ? 0 : this.a.a(paramV);
  }
  
  public int a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/LinkedHashMap;
    //   6: invokevirtual size : ()I
    //   9: istore_1
    //   10: aload_0
    //   11: monitorexit
    //   12: iload_1
    //   13: ireturn
    //   14: astore_2
    //   15: aload_0
    //   16: monitorexit
    //   17: aload_2
    //   18: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	14	finally
  }
  
  public V a(K paramK) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/LinkedHashMap;
    //   6: aload_1
    //   7: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: areturn
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	15	finally
  }
  
  public V a(K paramK, V paramV) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/LinkedHashMap;
    //   6: aload_1
    //   7: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: astore_3
    //   11: aload_0
    //   12: aload_0
    //   13: getfield c : I
    //   16: aload_0
    //   17: aload_3
    //   18: invokespecial c : (Ljava/lang/Object;)I
    //   21: isub
    //   22: putfield c : I
    //   25: aload_0
    //   26: getfield b : Ljava/util/LinkedHashMap;
    //   29: aload_1
    //   30: aload_2
    //   31: invokevirtual put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   34: pop
    //   35: aload_0
    //   36: aload_0
    //   37: getfield c : I
    //   40: aload_0
    //   41: aload_2
    //   42: invokespecial c : (Ljava/lang/Object;)I
    //   45: iadd
    //   46: putfield c : I
    //   49: aload_0
    //   50: monitorexit
    //   51: aload_3
    //   52: areturn
    //   53: astore_1
    //   54: aload_0
    //   55: monitorexit
    //   56: aload_1
    //   57: athrow
    // Exception table:
    //   from	to	target	type
    //   2	49	53	finally
  }
  
  public ArrayList<Map.Entry<K, V>> a(j<K> paramj) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: dup
    //   6: aload_0
    //   7: getfield b : Ljava/util/LinkedHashMap;
    //   10: invokevirtual entrySet : ()Ljava/util/Set;
    //   13: invokeinterface size : ()I
    //   18: invokespecial <init> : (I)V
    //   21: astore_2
    //   22: aload_0
    //   23: getfield b : Ljava/util/LinkedHashMap;
    //   26: invokevirtual entrySet : ()Ljava/util/Set;
    //   29: invokeinterface iterator : ()Ljava/util/Iterator;
    //   34: astore_3
    //   35: aload_3
    //   36: invokeinterface hasNext : ()Z
    //   41: ifeq -> 85
    //   44: aload_3
    //   45: invokeinterface next : ()Ljava/lang/Object;
    //   50: checkcast java/util/Map$Entry
    //   53: astore #4
    //   55: aload_1
    //   56: ifnull -> 75
    //   59: aload_1
    //   60: aload #4
    //   62: invokeinterface getKey : ()Ljava/lang/Object;
    //   67: invokeinterface a : (Ljava/lang/Object;)Z
    //   72: ifeq -> 35
    //   75: aload_2
    //   76: aload #4
    //   78: invokevirtual add : (Ljava/lang/Object;)Z
    //   81: pop
    //   82: goto -> 35
    //   85: aload_0
    //   86: monitorexit
    //   87: aload_2
    //   88: areturn
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: goto -> 97
    //   95: aload_1
    //   96: athrow
    //   97: goto -> 95
    // Exception table:
    //   from	to	target	type
    //   2	35	89	finally
    //   35	55	89	finally
    //   59	75	89	finally
    //   75	82	89	finally
  }
  
  public K b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/LinkedHashMap;
    //   6: invokevirtual isEmpty : ()Z
    //   9: ifeq -> 17
    //   12: aconst_null
    //   13: astore_1
    //   14: goto -> 35
    //   17: aload_0
    //   18: getfield b : Ljava/util/LinkedHashMap;
    //   21: invokevirtual keySet : ()Ljava/util/Set;
    //   24: invokeinterface iterator : ()Ljava/util/Iterator;
    //   29: invokeinterface next : ()Ljava/lang/Object;
    //   34: astore_1
    //   35: aload_0
    //   36: monitorexit
    //   37: aload_1
    //   38: areturn
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	39	finally
    //   17	35	39	finally
  }
  
  public V b(K paramK) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/LinkedHashMap;
    //   6: aload_1
    //   7: invokevirtual remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   10: astore_1
    //   11: aload_0
    //   12: aload_0
    //   13: getfield c : I
    //   16: aload_0
    //   17: aload_1
    //   18: invokespecial c : (Ljava/lang/Object;)I
    //   21: isub
    //   22: putfield c : I
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: areturn
    //   29: astore_1
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_1
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   2	25	29	finally
  }
  
  public ArrayList<V> b(j<K> paramj) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: dup
    //   6: invokespecial <init> : ()V
    //   9: astore_2
    //   10: aload_0
    //   11: getfield b : Ljava/util/LinkedHashMap;
    //   14: invokevirtual entrySet : ()Ljava/util/Set;
    //   17: invokeinterface iterator : ()Ljava/util/Iterator;
    //   22: astore_3
    //   23: aload_3
    //   24: invokeinterface hasNext : ()Z
    //   29: ifeq -> 104
    //   32: aload_3
    //   33: invokeinterface next : ()Ljava/lang/Object;
    //   38: checkcast java/util/Map$Entry
    //   41: astore #4
    //   43: aload_1
    //   44: ifnull -> 63
    //   47: aload_1
    //   48: aload #4
    //   50: invokeinterface getKey : ()Ljava/lang/Object;
    //   55: invokeinterface a : (Ljava/lang/Object;)Z
    //   60: ifeq -> 23
    //   63: aload_2
    //   64: aload #4
    //   66: invokeinterface getValue : ()Ljava/lang/Object;
    //   71: invokevirtual add : (Ljava/lang/Object;)Z
    //   74: pop
    //   75: aload_0
    //   76: aload_0
    //   77: getfield c : I
    //   80: aload_0
    //   81: aload #4
    //   83: invokeinterface getValue : ()Ljava/lang/Object;
    //   88: invokespecial c : (Ljava/lang/Object;)I
    //   91: isub
    //   92: putfield c : I
    //   95: aload_3
    //   96: invokeinterface remove : ()V
    //   101: goto -> 23
    //   104: aload_0
    //   105: monitorexit
    //   106: aload_2
    //   107: areturn
    //   108: astore_1
    //   109: aload_0
    //   110: monitorexit
    //   111: goto -> 116
    //   114: aload_1
    //   115: athrow
    //   116: goto -> 114
    // Exception table:
    //   from	to	target	type
    //   2	23	108	finally
    //   23	43	108	finally
    //   47	63	108	finally
    //   63	101	108	finally
  }
  
  public int c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : I
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/d/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */