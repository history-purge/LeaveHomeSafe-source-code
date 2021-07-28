package e.e.l.n;

import android.util.Pair;
import e.e.e.d.k;
import e.e.l.e.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

public abstract class d0<K, T extends Closeable> implements j0<T> {
  final Map<K, b> a;
  
  private final j0<T> b;
  
  protected d0(j0<T> paramj0) {
    this.b = paramj0;
    this.a = new HashMap<K, b>();
  }
  
  private b a(K paramK) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: new e/e/l/n/d0$b
    //   5: dup
    //   6: aload_0
    //   7: aload_1
    //   8: invokespecial <init> : (Le/e/l/n/d0;Ljava/lang/Object;)V
    //   11: astore_2
    //   12: aload_0
    //   13: getfield a : Ljava/util/Map;
    //   16: aload_1
    //   17: aload_2
    //   18: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   23: pop
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_2
    //   27: areturn
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: athrow
    // Exception table:
    //   from	to	target	type
    //   2	24	28	finally
  }
  
  private void a(K paramK, b paramb) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: aload_2
    //   13: if_acmpne -> 27
    //   16: aload_0
    //   17: getfield a : Ljava/util/Map;
    //   20: aload_1
    //   21: invokeinterface remove : (Ljava/lang/Object;)Ljava/lang/Object;
    //   26: pop
    //   27: aload_0
    //   28: monitorexit
    //   29: return
    //   30: astore_1
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_1
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   2	27	30	finally
  }
  
  private b b(K paramK) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Ljava/util/Map;
    //   6: aload_1
    //   7: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   12: checkcast e/e/l/n/d0$b
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: areturn
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	20	finally
  }
  
  protected abstract T a(T paramT);
  
  protected abstract K a(k0 paramk0);
  
  public void a(k<T> paramk, k0 paramk0) {
    // Byte code:
    //   0: invokestatic c : ()Z
    //   3: ifeq -> 11
    //   6: ldc 'MultiplexProducer#produceResults'
    //   8: invokestatic a : (Ljava/lang/String;)V
    //   11: aload_0
    //   12: aload_2
    //   13: invokevirtual a : (Le/e/l/n/k0;)Ljava/lang/Object;
    //   16: astore #6
    //   18: iconst_0
    //   19: istore_3
    //   20: aload_0
    //   21: monitorenter
    //   22: aload_0
    //   23: aload #6
    //   25: invokespecial b : (Ljava/lang/Object;)Le/e/l/n/d0$b;
    //   28: astore #5
    //   30: aload #5
    //   32: astore #4
    //   34: aload #5
    //   36: ifnonnull -> 49
    //   39: aload_0
    //   40: aload #6
    //   42: invokespecial a : (Ljava/lang/Object;)Le/e/l/n/d0$b;
    //   45: astore #4
    //   47: iconst_1
    //   48: istore_3
    //   49: aload_0
    //   50: monitorexit
    //   51: aload #4
    //   53: aload_1
    //   54: aload_2
    //   55: invokevirtual a : (Le/e/l/n/k;Le/e/l/n/k0;)Z
    //   58: ifeq -> 18
    //   61: iload_3
    //   62: ifeq -> 70
    //   65: aload #4
    //   67: invokestatic a : (Le/e/l/n/d0$b;)V
    //   70: invokestatic c : ()Z
    //   73: ifeq -> 79
    //   76: invokestatic a : ()V
    //   79: return
    //   80: astore_1
    //   81: aload_0
    //   82: monitorexit
    //   83: aload_1
    //   84: athrow
    //   85: astore_1
    //   86: invokestatic c : ()Z
    //   89: ifeq -> 95
    //   92: invokestatic a : ()V
    //   95: goto -> 100
    //   98: aload_1
    //   99: athrow
    //   100: goto -> 98
    // Exception table:
    //   from	to	target	type
    //   0	11	85	finally
    //   11	18	85	finally
    //   20	22	85	finally
    //   22	30	80	finally
    //   39	47	80	finally
    //   49	51	80	finally
    //   51	61	85	finally
    //   65	70	85	finally
    //   81	83	80	finally
    //   83	85	85	finally
  }
  
  class b {
    private final K a;
    
    private final CopyOnWriteArraySet<Pair<k<T>, k0>> b = k.a();
    
    private T c;
    
    private float d;
    
    private int e;
    
    private d f;
    
    private b g;
    
    public b(d0 this$0, K param1K) {
      this.a = param1K;
    }
    
    private void a(Pair<k<T>, k0> param1Pair, k0 param1k0) {
      param1k0.a(new a(this, param1Pair));
    }
    
    private void a(Closeable param1Closeable) {
      if (param1Closeable != null)
        try {
          param1Closeable.close();
          return;
        } catch (IOException iOException) {
          throw new RuntimeException(iOException);
        }  
    }
    
    private boolean a() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
      //   6: invokevirtual iterator : ()Ljava/util/Iterator;
      //   9: astore_2
      //   10: aload_2
      //   11: invokeinterface hasNext : ()Z
      //   16: ifeq -> 50
      //   19: aload_2
      //   20: invokeinterface next : ()Ljava/lang/Object;
      //   25: checkcast android/util/Pair
      //   28: getfield second : Ljava/lang/Object;
      //   31: checkcast e/e/l/n/k0
      //   34: invokeinterface g : ()Z
      //   39: istore_1
      //   40: iload_1
      //   41: ifeq -> 10
      //   44: iconst_1
      //   45: istore_1
      //   46: aload_0
      //   47: monitorexit
      //   48: iload_1
      //   49: ireturn
      //   50: iconst_0
      //   51: istore_1
      //   52: goto -> 46
      //   55: astore_2
      //   56: aload_0
      //   57: monitorexit
      //   58: goto -> 63
      //   61: aload_2
      //   62: athrow
      //   63: goto -> 61
      // Exception table:
      //   from	to	target	type
      //   2	10	55	finally
      //   10	40	55	finally
    }
    
    private boolean b() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
      //   6: invokevirtual iterator : ()Ljava/util/Iterator;
      //   9: astore_2
      //   10: aload_2
      //   11: invokeinterface hasNext : ()Z
      //   16: ifeq -> 50
      //   19: aload_2
      //   20: invokeinterface next : ()Ljava/lang/Object;
      //   25: checkcast android/util/Pair
      //   28: getfield second : Ljava/lang/Object;
      //   31: checkcast e/e/l/n/k0
      //   34: invokeinterface d : ()Z
      //   39: istore_1
      //   40: iload_1
      //   41: ifne -> 10
      //   44: iconst_0
      //   45: istore_1
      //   46: aload_0
      //   47: monitorexit
      //   48: iload_1
      //   49: ireturn
      //   50: iconst_1
      //   51: istore_1
      //   52: goto -> 46
      //   55: astore_2
      //   56: aload_0
      //   57: monitorexit
      //   58: goto -> 63
      //   61: aload_2
      //   62: athrow
      //   63: goto -> 61
      // Exception table:
      //   from	to	target	type
      //   2	10	55	finally
      //   10	40	55	finally
    }
    
    private d c() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: getstatic e/e/l/e/d.c : Le/e/l/e/d;
      //   5: astore_1
      //   6: aload_0
      //   7: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
      //   10: invokevirtual iterator : ()Ljava/util/Iterator;
      //   13: astore_2
      //   14: aload_2
      //   15: invokeinterface hasNext : ()Z
      //   20: ifeq -> 51
      //   23: aload_1
      //   24: aload_2
      //   25: invokeinterface next : ()Ljava/lang/Object;
      //   30: checkcast android/util/Pair
      //   33: getfield second : Ljava/lang/Object;
      //   36: checkcast e/e/l/n/k0
      //   39: invokeinterface c : ()Le/e/l/e/d;
      //   44: invokestatic a : (Le/e/l/e/d;Le/e/l/e/d;)Le/e/l/e/d;
      //   47: astore_1
      //   48: goto -> 14
      //   51: aload_0
      //   52: monitorexit
      //   53: aload_1
      //   54: areturn
      //   55: astore_1
      //   56: aload_0
      //   57: monitorexit
      //   58: goto -> 63
      //   61: aload_1
      //   62: athrow
      //   63: goto -> 61
      // Exception table:
      //   from	to	target	type
      //   2	14	55	finally
      //   14	48	55	finally
    }
    
    private void d() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield f : Le/e/l/n/d;
      //   6: astore_3
      //   7: iconst_1
      //   8: istore_2
      //   9: aload_3
      //   10: ifnonnull -> 185
      //   13: iconst_1
      //   14: istore_1
      //   15: goto -> 18
      //   18: iload_1
      //   19: invokestatic a : (Z)V
      //   22: aload_0
      //   23: getfield g : Le/e/l/n/d0$b$b;
      //   26: ifnonnull -> 190
      //   29: iload_2
      //   30: istore_1
      //   31: goto -> 34
      //   34: iload_1
      //   35: invokestatic a : (Z)V
      //   38: aload_0
      //   39: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
      //   42: invokevirtual isEmpty : ()Z
      //   45: ifeq -> 63
      //   48: aload_0
      //   49: getfield h : Le/e/l/n/d0;
      //   52: aload_0
      //   53: getfield a : Ljava/lang/Object;
      //   56: aload_0
      //   57: invokestatic a : (Le/e/l/n/d0;Ljava/lang/Object;Le/e/l/n/d0$b;)V
      //   60: aload_0
      //   61: monitorexit
      //   62: return
      //   63: aload_0
      //   64: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
      //   67: invokevirtual iterator : ()Ljava/util/Iterator;
      //   70: invokeinterface next : ()Ljava/lang/Object;
      //   75: checkcast android/util/Pair
      //   78: getfield second : Ljava/lang/Object;
      //   81: checkcast e/e/l/n/k0
      //   84: astore_3
      //   85: aload_0
      //   86: new e/e/l/n/d
      //   89: dup
      //   90: aload_3
      //   91: invokeinterface f : ()Le/e/l/o/c;
      //   96: aload_3
      //   97: invokeinterface a : ()Ljava/lang/String;
      //   102: aload_3
      //   103: invokeinterface e : ()Le/e/l/n/m0;
      //   108: aload_3
      //   109: invokeinterface b : ()Ljava/lang/Object;
      //   114: aload_3
      //   115: invokeinterface h : ()Le/e/l/o/c$b;
      //   120: aload_0
      //   121: invokespecial b : ()Z
      //   124: aload_0
      //   125: invokespecial a : ()Z
      //   128: aload_0
      //   129: invokespecial c : ()Le/e/l/e/d;
      //   132: invokespecial <init> : (Le/e/l/o/c;Ljava/lang/String;Le/e/l/n/m0;Ljava/lang/Object;Le/e/l/o/c$b;ZZLe/e/l/e/d;)V
      //   135: putfield f : Le/e/l/n/d;
      //   138: aload_0
      //   139: new e/e/l/n/d0$b$b
      //   142: dup
      //   143: aload_0
      //   144: aconst_null
      //   145: invokespecial <init> : (Le/e/l/n/d0$b;Le/e/l/n/d0$a;)V
      //   148: putfield g : Le/e/l/n/d0$b$b;
      //   151: aload_0
      //   152: getfield f : Le/e/l/n/d;
      //   155: astore_3
      //   156: aload_0
      //   157: getfield g : Le/e/l/n/d0$b$b;
      //   160: astore #4
      //   162: aload_0
      //   163: monitorexit
      //   164: aload_0
      //   165: getfield h : Le/e/l/n/d0;
      //   168: invokestatic a : (Le/e/l/n/d0;)Le/e/l/n/j0;
      //   171: aload #4
      //   173: aload_3
      //   174: invokeinterface a : (Le/e/l/n/k;Le/e/l/n/k0;)V
      //   179: return
      //   180: astore_3
      //   181: aload_0
      //   182: monitorexit
      //   183: aload_3
      //   184: athrow
      //   185: iconst_0
      //   186: istore_1
      //   187: goto -> 18
      //   190: iconst_0
      //   191: istore_1
      //   192: goto -> 34
      // Exception table:
      //   from	to	target	type
      //   2	7	180	finally
      //   18	29	180	finally
      //   34	62	180	finally
      //   63	164	180	finally
      //   181	183	180	finally
    }
    
    private List<l0> e() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield f : Le/e/l/n/d;
      //   6: astore_1
      //   7: aload_1
      //   8: ifnonnull -> 15
      //   11: aload_0
      //   12: monitorexit
      //   13: aconst_null
      //   14: areturn
      //   15: aload_0
      //   16: getfield f : Le/e/l/n/d;
      //   19: aload_0
      //   20: invokespecial a : ()Z
      //   23: invokevirtual a : (Z)Ljava/util/List;
      //   26: astore_1
      //   27: aload_0
      //   28: monitorexit
      //   29: aload_1
      //   30: areturn
      //   31: astore_1
      //   32: aload_0
      //   33: monitorexit
      //   34: aload_1
      //   35: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	31	finally
      //   15	27	31	finally
    }
    
    private List<l0> f() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield f : Le/e/l/n/d;
      //   6: astore_1
      //   7: aload_1
      //   8: ifnonnull -> 15
      //   11: aload_0
      //   12: monitorexit
      //   13: aconst_null
      //   14: areturn
      //   15: aload_0
      //   16: getfield f : Le/e/l/n/d;
      //   19: aload_0
      //   20: invokespecial b : ()Z
      //   23: invokevirtual b : (Z)Ljava/util/List;
      //   26: astore_1
      //   27: aload_0
      //   28: monitorexit
      //   29: aload_1
      //   30: areturn
      //   31: astore_1
      //   32: aload_0
      //   33: monitorexit
      //   34: aload_1
      //   35: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	31	finally
      //   15	27	31	finally
    }
    
    private List<l0> g() {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield f : Le/e/l/n/d;
      //   6: astore_1
      //   7: aload_1
      //   8: ifnonnull -> 15
      //   11: aload_0
      //   12: monitorexit
      //   13: aconst_null
      //   14: areturn
      //   15: aload_0
      //   16: getfield f : Le/e/l/n/d;
      //   19: aload_0
      //   20: invokespecial c : ()Le/e/l/e/d;
      //   23: invokevirtual a : (Le/e/l/e/d;)Ljava/util/List;
      //   26: astore_1
      //   27: aload_0
      //   28: monitorexit
      //   29: aload_1
      //   30: areturn
      //   31: astore_1
      //   32: aload_0
      //   33: monitorexit
      //   34: aload_1
      //   35: athrow
      // Exception table:
      //   from	to	target	type
      //   2	7	31	finally
      //   15	27	31	finally
    }
    
    public void a(b param1b) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield g : Le/e/l/n/d0$b$b;
      //   6: aload_1
      //   7: if_acmpeq -> 13
      //   10: aload_0
      //   11: monitorexit
      //   12: return
      //   13: aload_0
      //   14: aconst_null
      //   15: putfield g : Le/e/l/n/d0$b$b;
      //   18: aload_0
      //   19: aconst_null
      //   20: putfield f : Le/e/l/n/d;
      //   23: aload_0
      //   24: aload_0
      //   25: getfield c : Ljava/io/Closeable;
      //   28: invokespecial a : (Ljava/io/Closeable;)V
      //   31: aload_0
      //   32: aconst_null
      //   33: putfield c : Ljava/io/Closeable;
      //   36: aload_0
      //   37: monitorexit
      //   38: aload_0
      //   39: invokespecial d : ()V
      //   42: return
      //   43: astore_1
      //   44: aload_0
      //   45: monitorexit
      //   46: aload_1
      //   47: athrow
      // Exception table:
      //   from	to	target	type
      //   2	12	43	finally
      //   13	38	43	finally
      //   44	46	43	finally
    }
    
    public void a(b param1b, float param1Float) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield g : Le/e/l/n/d0$b$b;
      //   6: aload_1
      //   7: if_acmpeq -> 13
      //   10: aload_0
      //   11: monitorexit
      //   12: return
      //   13: aload_0
      //   14: fload_2
      //   15: putfield d : F
      //   18: aload_0
      //   19: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
      //   22: invokevirtual iterator : ()Ljava/util/Iterator;
      //   25: astore_3
      //   26: aload_0
      //   27: monitorexit
      //   28: aload_3
      //   29: invokeinterface hasNext : ()Z
      //   34: ifeq -> 72
      //   37: aload_3
      //   38: invokeinterface next : ()Ljava/lang/Object;
      //   43: checkcast android/util/Pair
      //   46: astore_1
      //   47: aload_1
      //   48: monitorenter
      //   49: aload_1
      //   50: getfield first : Ljava/lang/Object;
      //   53: checkcast e/e/l/n/k
      //   56: fload_2
      //   57: invokeinterface a : (F)V
      //   62: aload_1
      //   63: monitorexit
      //   64: goto -> 28
      //   67: astore_3
      //   68: aload_1
      //   69: monitorexit
      //   70: aload_3
      //   71: athrow
      //   72: return
      //   73: astore_1
      //   74: aload_0
      //   75: monitorexit
      //   76: goto -> 81
      //   79: aload_1
      //   80: athrow
      //   81: goto -> 79
      // Exception table:
      //   from	to	target	type
      //   2	12	73	finally
      //   13	28	73	finally
      //   49	64	67	finally
      //   68	70	67	finally
      //   74	76	73	finally
    }
    
    public void a(b param1b, T param1T, int param1Int) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield g : Le/e/l/n/d0$b$b;
      //   6: aload_1
      //   7: if_acmpeq -> 13
      //   10: aload_0
      //   11: monitorexit
      //   12: return
      //   13: aload_0
      //   14: aload_0
      //   15: getfield c : Ljava/io/Closeable;
      //   18: invokespecial a : (Ljava/io/Closeable;)V
      //   21: aload_0
      //   22: aconst_null
      //   23: putfield c : Ljava/io/Closeable;
      //   26: aload_0
      //   27: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
      //   30: invokevirtual iterator : ()Ljava/util/Iterator;
      //   33: astore #4
      //   35: iload_3
      //   36: invokestatic b : (I)Z
      //   39: ifeq -> 62
      //   42: aload_0
      //   43: aload_0
      //   44: getfield h : Le/e/l/n/d0;
      //   47: aload_2
      //   48: invokevirtual a : (Ljava/io/Closeable;)Ljava/io/Closeable;
      //   51: putfield c : Ljava/io/Closeable;
      //   54: aload_0
      //   55: iload_3
      //   56: putfield e : I
      //   59: goto -> 81
      //   62: aload_0
      //   63: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
      //   66: invokevirtual clear : ()V
      //   69: aload_0
      //   70: getfield h : Le/e/l/n/d0;
      //   73: aload_0
      //   74: getfield a : Ljava/lang/Object;
      //   77: aload_0
      //   78: invokestatic a : (Le/e/l/n/d0;Ljava/lang/Object;Le/e/l/n/d0$b;)V
      //   81: aload_0
      //   82: monitorexit
      //   83: aload #4
      //   85: invokeinterface hasNext : ()Z
      //   90: ifeq -> 130
      //   93: aload #4
      //   95: invokeinterface next : ()Ljava/lang/Object;
      //   100: checkcast android/util/Pair
      //   103: astore_1
      //   104: aload_1
      //   105: monitorenter
      //   106: aload_1
      //   107: getfield first : Ljava/lang/Object;
      //   110: checkcast e/e/l/n/k
      //   113: aload_2
      //   114: iload_3
      //   115: invokeinterface a : (Ljava/lang/Object;I)V
      //   120: aload_1
      //   121: monitorexit
      //   122: goto -> 83
      //   125: astore_2
      //   126: aload_1
      //   127: monitorexit
      //   128: aload_2
      //   129: athrow
      //   130: return
      //   131: astore_1
      //   132: aload_0
      //   133: monitorexit
      //   134: goto -> 139
      //   137: aload_1
      //   138: athrow
      //   139: goto -> 137
      // Exception table:
      //   from	to	target	type
      //   2	12	131	finally
      //   13	59	131	finally
      //   62	81	131	finally
      //   81	83	131	finally
      //   106	122	125	finally
      //   126	128	125	finally
      //   132	134	131	finally
    }
    
    public void a(b param1b, Throwable param1Throwable) {
      // Byte code:
      //   0: aload_0
      //   1: monitorenter
      //   2: aload_0
      //   3: getfield g : Le/e/l/n/d0$b$b;
      //   6: aload_1
      //   7: if_acmpeq -> 13
      //   10: aload_0
      //   11: monitorexit
      //   12: return
      //   13: aload_0
      //   14: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
      //   17: invokevirtual iterator : ()Ljava/util/Iterator;
      //   20: astore_3
      //   21: aload_0
      //   22: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
      //   25: invokevirtual clear : ()V
      //   28: aload_0
      //   29: getfield h : Le/e/l/n/d0;
      //   32: aload_0
      //   33: getfield a : Ljava/lang/Object;
      //   36: aload_0
      //   37: invokestatic a : (Le/e/l/n/d0;Ljava/lang/Object;Le/e/l/n/d0$b;)V
      //   40: aload_0
      //   41: aload_0
      //   42: getfield c : Ljava/io/Closeable;
      //   45: invokespecial a : (Ljava/io/Closeable;)V
      //   48: aload_0
      //   49: aconst_null
      //   50: putfield c : Ljava/io/Closeable;
      //   53: aload_0
      //   54: monitorexit
      //   55: aload_3
      //   56: invokeinterface hasNext : ()Z
      //   61: ifeq -> 99
      //   64: aload_3
      //   65: invokeinterface next : ()Ljava/lang/Object;
      //   70: checkcast android/util/Pair
      //   73: astore_1
      //   74: aload_1
      //   75: monitorenter
      //   76: aload_1
      //   77: getfield first : Ljava/lang/Object;
      //   80: checkcast e/e/l/n/k
      //   83: aload_2
      //   84: invokeinterface a : (Ljava/lang/Throwable;)V
      //   89: aload_1
      //   90: monitorexit
      //   91: goto -> 55
      //   94: astore_2
      //   95: aload_1
      //   96: monitorexit
      //   97: aload_2
      //   98: athrow
      //   99: return
      //   100: astore_1
      //   101: aload_0
      //   102: monitorexit
      //   103: goto -> 108
      //   106: aload_1
      //   107: athrow
      //   108: goto -> 106
      // Exception table:
      //   from	to	target	type
      //   2	12	100	finally
      //   13	55	100	finally
      //   76	91	94	finally
      //   95	97	94	finally
      //   101	103	100	finally
    }
    
    public boolean a(k<T> param1k, k0 param1k0) {
      // Byte code:
      //   0: aload_1
      //   1: aload_2
      //   2: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
      //   5: astore #7
      //   7: aload_0
      //   8: monitorenter
      //   9: aload_0
      //   10: getfield h : Le/e/l/n/d0;
      //   13: aload_0
      //   14: getfield a : Ljava/lang/Object;
      //   17: invokestatic a : (Le/e/l/n/d0;Ljava/lang/Object;)Le/e/l/n/d0$b;
      //   20: aload_0
      //   21: if_acmpeq -> 28
      //   24: aload_0
      //   25: monitorexit
      //   26: iconst_0
      //   27: ireturn
      //   28: aload_0
      //   29: getfield b : Ljava/util/concurrent/CopyOnWriteArraySet;
      //   32: aload #7
      //   34: invokevirtual add : (Ljava/lang/Object;)Z
      //   37: pop
      //   38: aload_0
      //   39: invokespecial f : ()Ljava/util/List;
      //   42: astore #5
      //   44: aload_0
      //   45: invokespecial g : ()Ljava/util/List;
      //   48: astore #8
      //   50: aload_0
      //   51: invokespecial e : ()Ljava/util/List;
      //   54: astore #9
      //   56: aload_0
      //   57: getfield c : Ljava/io/Closeable;
      //   60: astore #6
      //   62: aload_0
      //   63: getfield d : F
      //   66: fstore_3
      //   67: aload_0
      //   68: getfield e : I
      //   71: istore #4
      //   73: aload_0
      //   74: monitorexit
      //   75: aload #5
      //   77: invokestatic c : (Ljava/util/List;)V
      //   80: aload #8
      //   82: invokestatic d : (Ljava/util/List;)V
      //   85: aload #9
      //   87: invokestatic b : (Ljava/util/List;)V
      //   90: aload #7
      //   92: monitorenter
      //   93: aload_0
      //   94: monitorenter
      //   95: aload #6
      //   97: aload_0
      //   98: getfield c : Ljava/io/Closeable;
      //   101: if_acmpeq -> 110
      //   104: aconst_null
      //   105: astore #5
      //   107: goto -> 130
      //   110: aload #6
      //   112: astore #5
      //   114: aload #6
      //   116: ifnull -> 130
      //   119: aload_0
      //   120: getfield h : Le/e/l/n/d0;
      //   123: aload #6
      //   125: invokevirtual a : (Ljava/io/Closeable;)Ljava/io/Closeable;
      //   128: astore #5
      //   130: aload_0
      //   131: monitorexit
      //   132: aload #5
      //   134: ifnull -> 166
      //   137: fload_3
      //   138: fconst_0
      //   139: fcmpl
      //   140: ifle -> 150
      //   143: aload_1
      //   144: fload_3
      //   145: invokeinterface a : (F)V
      //   150: aload_1
      //   151: aload #5
      //   153: iload #4
      //   155: invokeinterface a : (Ljava/lang/Object;I)V
      //   160: aload_0
      //   161: aload #5
      //   163: invokespecial a : (Ljava/io/Closeable;)V
      //   166: aload #7
      //   168: monitorexit
      //   169: aload_0
      //   170: aload #7
      //   172: aload_2
      //   173: invokespecial a : (Landroid/util/Pair;Le/e/l/n/k0;)V
      //   176: iconst_1
      //   177: ireturn
      //   178: astore_1
      //   179: aload_0
      //   180: monitorexit
      //   181: aload_1
      //   182: athrow
      //   183: astore_1
      //   184: aload #7
      //   186: monitorexit
      //   187: aload_1
      //   188: athrow
      //   189: astore_1
      //   190: aload_0
      //   191: monitorexit
      //   192: aload_1
      //   193: athrow
      // Exception table:
      //   from	to	target	type
      //   9	26	189	finally
      //   28	75	189	finally
      //   93	95	183	finally
      //   95	104	178	finally
      //   119	130	178	finally
      //   130	132	178	finally
      //   143	150	183	finally
      //   150	166	183	finally
      //   166	169	183	finally
      //   179	181	178	finally
      //   181	183	183	finally
      //   184	187	183	finally
      //   190	192	189	finally
    }
    
    class a extends e {
      a(d0.b this$0, Pair param2Pair) {}
      
      public void a() {
        List<l0> list;
        synchronized (this.b) {
          boolean bool = d0.b.b(this.b).remove(this.a);
          list = null;
          if (bool) {
            if (d0.b.b(this.b).isEmpty()) {
              d d = d0.b.c(this.b);
            } else {
              list = d0.b.d(this.b);
              List<l0> list3 = d0.b.e(this.b);
              List<l0> list4 = d0.b.f(this.b);
              Object object = null;
              d.c(list);
              d.d(list3);
              d.b(list4);
            } 
          } else {
            Object object = null;
          } 
        } 
        List list1 = null;
        List list2 = null;
        /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_6} */
        d.c(list);
        d.d(list1);
        d.b(list2);
      }
      
      public void b() {
        d.b(d0.b.f(this.b));
      }
      
      public void c() {
        d.d(d0.b.e(this.b));
      }
      
      public void d() {
        d.c(d0.b.d(this.b));
      }
    }
    
    private class b extends b<T> {
      private b(d0.b this$0) {}
      
      protected void a(T param2T, int param2Int) {
        try {
          if (e.e.l.p.b.c())
            e.e.l.p.b.a("MultiplexProducer#onNewResult"); 
          this.b.a(this, param2T, param2Int);
          return;
        } finally {
          if (e.e.l.p.b.c())
            e.e.l.p.b.a(); 
        } 
      }
      
      protected void b() {
        try {
          if (e.e.l.p.b.c())
            e.e.l.p.b.a("MultiplexProducer#onCancellation"); 
          this.b.a(this);
          return;
        } finally {
          if (e.e.l.p.b.c())
            e.e.l.p.b.a(); 
        } 
      }
      
      protected void b(float param2Float) {
        try {
          if (e.e.l.p.b.c())
            e.e.l.p.b.a("MultiplexProducer#onProgressUpdate"); 
          this.b.a(this, param2Float);
          return;
        } finally {
          if (e.e.l.p.b.c())
            e.e.l.p.b.a(); 
        } 
      }
      
      protected void b(Throwable param2Throwable) {
        try {
          if (e.e.l.p.b.c())
            e.e.l.p.b.a("MultiplexProducer#onFailure"); 
          this.b.a(this, param2Throwable);
          return;
        } finally {
          if (e.e.l.p.b.c())
            e.e.l.p.b.a(); 
        } 
      }
    }
  }
  
  class a extends e {
    a(d0 this$0, Pair param1Pair) {}
    
    public void a() {
      List<l0> list;
      synchronized (this.b) {
        boolean bool = d0.b.b(this.b).remove(this.a);
        list = null;
        if (bool) {
          if (d0.b.b(this.b).isEmpty()) {
            d d = d0.b.c(this.b);
          } else {
            list = d0.b.d(this.b);
            List<l0> list3 = d0.b.e(this.b);
            List<l0> list4 = d0.b.f(this.b);
            Object object = null;
            d.c(list);
            d.d(list3);
            d.b(list4);
          } 
        } else {
          Object object = null;
        } 
      } 
      List list1 = null;
      List list2 = null;
      /* monitor exit ClassFileLocalVariableReferenceExpression{type=ObjectType{java/lang/Object}, name=SYNTHETIC_LOCAL_VARIABLE_6} */
      d.c(list);
      d.d(list1);
      d.b(list2);
    }
    
    public void b() {
      d.b(d0.b.f(this.b));
    }
    
    public void c() {
      d.d(d0.b.e(this.b));
    }
    
    public void d() {
      d.c(d0.b.d(this.b));
    }
  }
  
  private class b extends b<T> {
    private b(d0 this$0) {}
    
    protected void a(T param1T, int param1Int) {
      try {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a("MultiplexProducer#onNewResult"); 
        this.b.a(this, param1T, param1Int);
        return;
      } finally {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a(); 
      } 
    }
    
    protected void b() {
      try {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a("MultiplexProducer#onCancellation"); 
        this.b.a(this);
        return;
      } finally {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a(); 
      } 
    }
    
    protected void b(float param1Float) {
      try {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a("MultiplexProducer#onProgressUpdate"); 
        this.b.a(this, param1Float);
        return;
      } finally {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a(); 
      } 
    }
    
    protected void b(Throwable param1Throwable) {
      try {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a("MultiplexProducer#onFailure"); 
        this.b.a(this, param1Throwable);
        return;
      } finally {
        if (e.e.l.p.b.c())
          e.e.l.p.b.a(); 
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */