package e.e.l.d;

import e.e.c.a.d;
import e.e.l.k.d;
import java.util.HashMap;
import java.util.Map;

public class u {
  private static final Class<?> b = u.class;
  
  private Map<d, d> a = new HashMap<d, d>();
  
  public static u b() {
    return new u();
  }
  
  private void c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic e/e/l/d/u.b : Ljava/lang/Class;
    //   5: ldc 'Count = %d'
    //   7: aload_0
    //   8: getfield a : Ljava/util/Map;
    //   11: invokeinterface size : ()I
    //   16: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   19: invokestatic b : (Ljava/lang/Class;Ljava/lang/String;Ljava/lang/Object;)V
    //   22: aload_0
    //   23: monitorexit
    //   24: return
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	22	25	finally
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new java/util/ArrayList
    //   5: dup
    //   6: aload_0
    //   7: getfield a : Ljava/util/Map;
    //   10: invokeinterface values : ()Ljava/util/Collection;
    //   15: invokespecial <init> : (Ljava/util/Collection;)V
    //   18: astore_2
    //   19: aload_0
    //   20: getfield a : Ljava/util/Map;
    //   23: invokeinterface clear : ()V
    //   28: aload_0
    //   29: monitorexit
    //   30: iconst_0
    //   31: istore_1
    //   32: iload_1
    //   33: aload_2
    //   34: invokeinterface size : ()I
    //   39: if_icmpge -> 68
    //   42: aload_2
    //   43: iload_1
    //   44: invokeinterface get : (I)Ljava/lang/Object;
    //   49: checkcast e/e/l/k/d
    //   52: astore_3
    //   53: aload_3
    //   54: ifnull -> 61
    //   57: aload_3
    //   58: invokevirtual close : ()V
    //   61: iload_1
    //   62: iconst_1
    //   63: iadd
    //   64: istore_1
    //   65: goto -> 32
    //   68: return
    //   69: astore_2
    //   70: aload_0
    //   71: monitorexit
    //   72: goto -> 77
    //   75: aload_2
    //   76: athrow
    //   77: goto -> 75
    // Exception table:
    //   from	to	target	type
    //   2	30	69	finally
    //   70	72	69	finally
  }
  
  public void a(d paramd, d paramd1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_2
    //   8: invokestatic e : (Le/e/l/k/d;)Z
    //   11: invokestatic a : (Z)V
    //   14: aload_0
    //   15: getfield a : Ljava/util/Map;
    //   18: aload_1
    //   19: aload_2
    //   20: invokestatic b : (Le/e/l/k/d;)Le/e/l/k/d;
    //   23: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   28: checkcast e/e/l/k/d
    //   31: invokestatic c : (Le/e/l/k/d;)V
    //   34: aload_0
    //   35: invokespecial c : ()V
    //   38: aload_0
    //   39: monitorexit
    //   40: return
    //   41: astore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_1
    //   45: athrow
    // Exception table:
    //   from	to	target	type
    //   2	38	41	finally
  }
  
  public boolean a(d paramd) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_0
    //   8: getfield a : Ljava/util/Map;
    //   11: aload_1
    //   12: invokeinterface containsKey : (Ljava/lang/Object;)Z
    //   17: istore_2
    //   18: iload_2
    //   19: ifne -> 26
    //   22: aload_0
    //   23: monitorexit
    //   24: iconst_0
    //   25: ireturn
    //   26: aload_0
    //   27: getfield a : Ljava/util/Map;
    //   30: aload_1
    //   31: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   36: checkcast e/e/l/k/d
    //   39: astore_3
    //   40: aload_3
    //   41: monitorenter
    //   42: aload_3
    //   43: invokestatic e : (Le/e/l/k/d;)Z
    //   46: ifne -> 107
    //   49: aload_0
    //   50: getfield a : Ljava/util/Map;
    //   53: aload_1
    //   54: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   59: pop
    //   60: getstatic e/e/l/d/u.b : Ljava/lang/Class;
    //   63: ldc 'Found closed reference %d for key %s (%d)'
    //   65: iconst_3
    //   66: anewarray java/lang/Object
    //   69: dup
    //   70: iconst_0
    //   71: aload_3
    //   72: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   75: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: aload_1
    //   82: invokeinterface a : ()Ljava/lang/String;
    //   87: aastore
    //   88: dup
    //   89: iconst_2
    //   90: aload_1
    //   91: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   94: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   97: aastore
    //   98: invokestatic c : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    //   101: aload_3
    //   102: monitorexit
    //   103: aload_0
    //   104: monitorexit
    //   105: iconst_0
    //   106: ireturn
    //   107: aload_3
    //   108: monitorexit
    //   109: aload_0
    //   110: monitorexit
    //   111: iconst_1
    //   112: ireturn
    //   113: astore_1
    //   114: aload_3
    //   115: monitorexit
    //   116: aload_1
    //   117: athrow
    //   118: astore_1
    //   119: aload_0
    //   120: monitorexit
    //   121: aload_1
    //   122: athrow
    // Exception table:
    //   from	to	target	type
    //   2	18	118	finally
    //   26	42	118	finally
    //   42	103	113	finally
    //   107	109	113	finally
    //   114	116	113	finally
    //   116	118	118	finally
  }
  
  public d b(d paramd) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_0
    //   8: getfield a : Ljava/util/Map;
    //   11: aload_1
    //   12: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   17: checkcast e/e/l/k/d
    //   20: astore_2
    //   21: aload_2
    //   22: ifnull -> 107
    //   25: aload_2
    //   26: monitorenter
    //   27: aload_2
    //   28: invokestatic e : (Le/e/l/k/d;)Z
    //   31: ifne -> 92
    //   34: aload_0
    //   35: getfield a : Ljava/util/Map;
    //   38: aload_1
    //   39: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   44: pop
    //   45: getstatic e/e/l/d/u.b : Ljava/lang/Class;
    //   48: ldc 'Found closed reference %d for key %s (%d)'
    //   50: iconst_3
    //   51: anewarray java/lang/Object
    //   54: dup
    //   55: iconst_0
    //   56: aload_2
    //   57: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   60: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   63: aastore
    //   64: dup
    //   65: iconst_1
    //   66: aload_1
    //   67: invokeinterface a : ()Ljava/lang/String;
    //   72: aastore
    //   73: dup
    //   74: iconst_2
    //   75: aload_1
    //   76: invokestatic identityHashCode : (Ljava/lang/Object;)I
    //   79: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   82: aastore
    //   83: invokestatic c : (Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Object;)V
    //   86: aload_2
    //   87: monitorexit
    //   88: aload_0
    //   89: monitorexit
    //   90: aconst_null
    //   91: areturn
    //   92: aload_2
    //   93: invokestatic b : (Le/e/l/k/d;)Le/e/l/k/d;
    //   96: astore_1
    //   97: aload_2
    //   98: monitorexit
    //   99: goto -> 109
    //   102: astore_1
    //   103: aload_2
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    //   107: aload_2
    //   108: astore_1
    //   109: aload_0
    //   110: monitorexit
    //   111: aload_1
    //   112: areturn
    //   113: astore_1
    //   114: aload_0
    //   115: monitorexit
    //   116: aload_1
    //   117: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	113	finally
    //   25	27	113	finally
    //   27	88	102	finally
    //   92	99	102	finally
    //   103	105	102	finally
    //   105	107	113	finally
  }
  
  public boolean b(d paramd, d paramd1) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   6: pop
    //   7: aload_2
    //   8: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   11: pop
    //   12: aload_2
    //   13: invokestatic e : (Le/e/l/k/d;)Z
    //   16: invokestatic a : (Z)V
    //   19: aload_0
    //   20: getfield a : Ljava/util/Map;
    //   23: aload_1
    //   24: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   29: checkcast e/e/l/k/d
    //   32: astore_3
    //   33: aload_3
    //   34: ifnonnull -> 41
    //   37: aload_0
    //   38: monitorexit
    //   39: iconst_0
    //   40: ireturn
    //   41: aload_3
    //   42: invokevirtual b : ()Le/e/e/h/a;
    //   45: astore #4
    //   47: aload_2
    //   48: invokevirtual b : ()Le/e/e/h/a;
    //   51: astore_2
    //   52: aload #4
    //   54: ifnull -> 124
    //   57: aload_2
    //   58: ifnull -> 124
    //   61: aload #4
    //   63: invokevirtual b : ()Ljava/lang/Object;
    //   66: aload_2
    //   67: invokevirtual b : ()Ljava/lang/Object;
    //   70: if_acmpeq -> 76
    //   73: goto -> 124
    //   76: aload_0
    //   77: getfield a : Ljava/util/Map;
    //   80: aload_1
    //   81: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   86: pop
    //   87: aload_2
    //   88: invokestatic b : (Le/e/e/h/a;)V
    //   91: aload #4
    //   93: invokestatic b : (Le/e/e/h/a;)V
    //   96: aload_3
    //   97: invokestatic c : (Le/e/l/k/d;)V
    //   100: aload_0
    //   101: invokespecial c : ()V
    //   104: aload_0
    //   105: monitorexit
    //   106: iconst_1
    //   107: ireturn
    //   108: astore_1
    //   109: aload_2
    //   110: invokestatic b : (Le/e/e/h/a;)V
    //   113: aload #4
    //   115: invokestatic b : (Le/e/e/h/a;)V
    //   118: aload_3
    //   119: invokestatic c : (Le/e/l/k/d;)V
    //   122: aload_1
    //   123: athrow
    //   124: aload_2
    //   125: invokestatic b : (Le/e/e/h/a;)V
    //   128: aload #4
    //   130: invokestatic b : (Le/e/e/h/a;)V
    //   133: aload_3
    //   134: invokestatic c : (Le/e/l/k/d;)V
    //   137: aload_0
    //   138: monitorexit
    //   139: iconst_0
    //   140: ireturn
    //   141: astore_1
    //   142: aload_0
    //   143: monitorexit
    //   144: aload_1
    //   145: athrow
    // Exception table:
    //   from	to	target	type
    //   2	33	141	finally
    //   41	52	141	finally
    //   61	73	108	finally
    //   76	87	108	finally
    //   87	104	141	finally
    //   109	124	141	finally
    //   124	137	141	finally
  }
  
  public boolean c(d paramd) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield a : Ljava/util/Map;
    //   11: aload_1
    //   12: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   17: checkcast e/e/l/k/d
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: ifnonnull -> 29
    //   27: iconst_0
    //   28: ireturn
    //   29: aload_1
    //   30: invokevirtual A : ()Z
    //   33: istore_2
    //   34: aload_1
    //   35: invokevirtual close : ()V
    //   38: iload_2
    //   39: ireturn
    //   40: astore_3
    //   41: aload_1
    //   42: invokevirtual close : ()V
    //   45: aload_3
    //   46: athrow
    //   47: astore_1
    //   48: aload_0
    //   49: monitorexit
    //   50: aload_1
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   7	23	47	finally
    //   29	34	40	finally
    //   48	50	47	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/d/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */