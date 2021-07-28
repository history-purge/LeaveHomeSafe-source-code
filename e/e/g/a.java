package e.e.g;

import android.util.Pair;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public abstract class a<T> implements c<T> {
  private c a = c.c;
  
  private boolean b = false;
  
  private T c = null;
  
  private Throwable d = null;
  
  private float e = 0.0F;
  
  private final ConcurrentLinkedQueue<Pair<e<T>, Executor>> f = new ConcurrentLinkedQueue<Pair<e<T>, Executor>>();
  
  private void a(e<T> parame, Executor paramExecutor, boolean paramBoolean1, boolean paramBoolean2) {
    paramExecutor.execute(new a(this, paramBoolean1, parame, paramBoolean2));
  }
  
  private boolean b(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Z
    //   6: ifne -> 46
    //   9: aload_0
    //   10: getfield a : Le/e/g/a$c;
    //   13: getstatic e/e/g/a$c.c : Le/e/g/a$c;
    //   16: if_acmpeq -> 22
    //   19: goto -> 46
    //   22: aload_0
    //   23: getfield e : F
    //   26: fstore_2
    //   27: fload_1
    //   28: fload_2
    //   29: fcmpg
    //   30: ifge -> 37
    //   33: aload_0
    //   34: monitorexit
    //   35: iconst_0
    //   36: ireturn
    //   37: aload_0
    //   38: fload_1
    //   39: putfield e : F
    //   42: aload_0
    //   43: monitorexit
    //   44: iconst_1
    //   45: ireturn
    //   46: aload_0
    //   47: monitorexit
    //   48: iconst_0
    //   49: ireturn
    //   50: astore_3
    //   51: aload_0
    //   52: monitorexit
    //   53: aload_3
    //   54: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	50	finally
    //   22	27	50	finally
    //   37	42	50	finally
  }
  
  private boolean b(T paramT, boolean paramBoolean) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #4
    //   3: aconst_null
    //   4: astore_3
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_3
    //   8: astore #4
    //   10: aload_0
    //   11: getfield b : Z
    //   14: ifne -> 111
    //   17: aload_3
    //   18: astore #4
    //   20: aload_0
    //   21: getfield a : Le/e/g/a$c;
    //   24: getstatic e/e/g/a$c.c : Le/e/g/a$c;
    //   27: if_acmpeq -> 33
    //   30: goto -> 111
    //   33: iload_2
    //   34: ifeq -> 55
    //   37: aload_3
    //   38: astore #4
    //   40: aload_0
    //   41: getstatic e/e/g/a$c.d : Le/e/g/a$c;
    //   44: putfield a : Le/e/g/a$c;
    //   47: aload_3
    //   48: astore #4
    //   50: aload_0
    //   51: fconst_1
    //   52: putfield e : F
    //   55: aload_3
    //   56: astore #4
    //   58: aload_0
    //   59: getfield c : Ljava/lang/Object;
    //   62: aload_1
    //   63: if_acmpeq -> 94
    //   66: aload_3
    //   67: astore #4
    //   69: aload_0
    //   70: getfield c : Ljava/lang/Object;
    //   73: astore_3
    //   74: aload_0
    //   75: aload_1
    //   76: putfield c : Ljava/lang/Object;
    //   79: aload_3
    //   80: astore_1
    //   81: goto -> 96
    //   84: astore #4
    //   86: aload_3
    //   87: astore_1
    //   88: aload #4
    //   90: astore_3
    //   91: goto -> 140
    //   94: aconst_null
    //   95: astore_1
    //   96: aload_1
    //   97: astore_3
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_1
    //   101: ifnull -> 109
    //   104: aload_0
    //   105: aload_1
    //   106: invokevirtual a : (Ljava/lang/Object;)V
    //   109: iconst_1
    //   110: ireturn
    //   111: aload_1
    //   112: astore_3
    //   113: aload_0
    //   114: monitorexit
    //   115: aload_1
    //   116: ifnull -> 124
    //   119: aload_0
    //   120: aload_1
    //   121: invokevirtual a : (Ljava/lang/Object;)V
    //   124: iconst_0
    //   125: ireturn
    //   126: astore #4
    //   128: aload_3
    //   129: astore_1
    //   130: aload #4
    //   132: astore_3
    //   133: goto -> 140
    //   136: astore_3
    //   137: aload #4
    //   139: astore_1
    //   140: aload_1
    //   141: astore #4
    //   143: aload_0
    //   144: monitorexit
    //   145: aload_1
    //   146: astore #4
    //   148: aload_3
    //   149: athrow
    //   150: astore_1
    //   151: aload #4
    //   153: ifnull -> 162
    //   156: aload_0
    //   157: aload #4
    //   159: invokevirtual a : (Ljava/lang/Object;)V
    //   162: aload_1
    //   163: athrow
    // Exception table:
    //   from	to	target	type
    //   5	7	150	finally
    //   10	17	136	finally
    //   20	30	136	finally
    //   40	47	136	finally
    //   50	55	136	finally
    //   58	66	136	finally
    //   69	74	136	finally
    //   74	79	84	finally
    //   98	100	126	finally
    //   113	115	126	finally
    //   143	145	136	finally
    //   148	150	150	finally
  }
  
  private boolean b(Throwable paramThrowable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Z
    //   6: ifne -> 40
    //   9: aload_0
    //   10: getfield a : Le/e/g/a$c;
    //   13: getstatic e/e/g/a$c.c : Le/e/g/a$c;
    //   16: if_acmpeq -> 22
    //   19: goto -> 40
    //   22: aload_0
    //   23: getstatic e/e/g/a$c.e : Le/e/g/a$c;
    //   26: putfield a : Le/e/g/a$c;
    //   29: aload_0
    //   30: aload_1
    //   31: putfield d : Ljava/lang/Throwable;
    //   34: iconst_1
    //   35: istore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: iload_2
    //   39: ireturn
    //   40: iconst_0
    //   41: istore_2
    //   42: goto -> 36
    //   45: astore_1
    //   46: aload_0
    //   47: monitorexit
    //   48: goto -> 53
    //   51: aload_1
    //   52: athrow
    //   53: goto -> 51
    // Exception table:
    //   from	to	target	type
    //   2	19	45	finally
    //   22	34	45	finally
  }
  
  private void j() {
    boolean bool1 = g();
    boolean bool2 = k();
    for (Pair<e<T>, Executor> pair : this.f)
      a((e<T>)pair.first, (Executor)pair.second, bool1, bool2); 
  }
  
  private boolean k() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual h : ()Z
    //   6: ifeq -> 23
    //   9: aload_0
    //   10: invokevirtual d : ()Z
    //   13: istore_1
    //   14: iload_1
    //   15: ifne -> 23
    //   18: iconst_1
    //   19: istore_1
    //   20: goto -> 25
    //   23: iconst_0
    //   24: istore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: iload_1
    //   28: ireturn
    //   29: astore_2
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_2
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	29	finally
  }
  
  public T a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/lang/Object;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public void a(e<T> parame, Executor paramExecutor) {
    // Byte code:
    //   0: aload_1
    //   1: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   4: pop
    //   5: aload_2
    //   6: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   9: pop
    //   10: aload_0
    //   11: monitorenter
    //   12: aload_0
    //   13: getfield b : Z
    //   16: ifeq -> 22
    //   19: aload_0
    //   20: monitorexit
    //   21: return
    //   22: aload_0
    //   23: getfield a : Le/e/g/a$c;
    //   26: getstatic e/e/g/a$c.c : Le/e/g/a$c;
    //   29: if_acmpne -> 45
    //   32: aload_0
    //   33: getfield f : Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   36: aload_1
    //   37: aload_2
    //   38: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   41: invokevirtual add : (Ljava/lang/Object;)Z
    //   44: pop
    //   45: aload_0
    //   46: invokevirtual c : ()Z
    //   49: ifne -> 100
    //   52: aload_0
    //   53: invokevirtual d : ()Z
    //   56: ifne -> 100
    //   59: aload_0
    //   60: invokespecial k : ()Z
    //   63: ifeq -> 95
    //   66: goto -> 100
    //   69: aload_0
    //   70: monitorexit
    //   71: iload_3
    //   72: ifeq -> 89
    //   75: aload_0
    //   76: aload_1
    //   77: aload_2
    //   78: aload_0
    //   79: invokevirtual g : ()Z
    //   82: aload_0
    //   83: invokespecial k : ()Z
    //   86: invokespecial a : (Le/e/g/e;Ljava/util/concurrent/Executor;ZZ)V
    //   89: return
    //   90: astore_1
    //   91: aload_0
    //   92: monitorexit
    //   93: aload_1
    //   94: athrow
    //   95: iconst_0
    //   96: istore_3
    //   97: goto -> 69
    //   100: iconst_1
    //   101: istore_3
    //   102: goto -> 69
    // Exception table:
    //   from	to	target	type
    //   12	21	90	finally
    //   22	45	90	finally
    //   45	66	90	finally
    //   69	71	90	finally
    //   91	93	90	finally
  }
  
  protected void a(T paramT) {}
  
  protected boolean a(float paramFloat) {
    boolean bool = b(paramFloat);
    if (bool)
      i(); 
    return bool;
  }
  
  protected boolean a(T paramT, boolean paramBoolean) {
    paramBoolean = b(paramT, paramBoolean);
    if (paramBoolean)
      j(); 
    return paramBoolean;
  }
  
  protected boolean a(Throwable paramThrowable) {
    boolean bool = b(paramThrowable);
    if (bool)
      j(); 
    return bool;
  }
  
  public boolean b() {
    return false;
  }
  
  public boolean c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/lang/Object;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnull -> 16
    //   11: iconst_1
    //   12: istore_1
    //   13: goto -> 18
    //   16: iconst_0
    //   17: istore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: iload_1
    //   21: ireturn
    //   22: astore_2
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_2
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	22	finally
  }
  
  public boolean close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Z
    //   6: ifeq -> 13
    //   9: aload_0
    //   10: monitorexit
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: iconst_1
    //   15: putfield b : Z
    //   18: aload_0
    //   19: getfield c : Ljava/lang/Object;
    //   22: astore_1
    //   23: aload_0
    //   24: aconst_null
    //   25: putfield c : Ljava/lang/Object;
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: ifnull -> 39
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual a : (Ljava/lang/Object;)V
    //   39: aload_0
    //   40: invokevirtual d : ()Z
    //   43: ifne -> 50
    //   46: aload_0
    //   47: invokespecial j : ()V
    //   50: aload_0
    //   51: monitorenter
    //   52: aload_0
    //   53: getfield f : Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   56: invokevirtual clear : ()V
    //   59: aload_0
    //   60: monitorexit
    //   61: iconst_1
    //   62: ireturn
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    //   68: astore_1
    //   69: aload_0
    //   70: monitorexit
    //   71: aload_1
    //   72: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	68	finally
    //   13	30	68	finally
    //   52	61	63	finally
    //   64	66	63	finally
    //   69	71	68	finally
  }
  
  public boolean d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Le/e/g/a$c;
    //   6: astore_2
    //   7: getstatic e/e/g/a$c.c : Le/e/g/a$c;
    //   10: astore_3
    //   11: aload_2
    //   12: aload_3
    //   13: if_acmpeq -> 21
    //   16: iconst_1
    //   17: istore_1
    //   18: goto -> 23
    //   21: iconst_0
    //   22: istore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: iload_1
    //   26: ireturn
    //   27: astore_2
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_2
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	27	finally
  }
  
  public Throwable e() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Ljava/lang/Throwable;
    //   6: astore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: aload_1
    //   10: areturn
    //   11: astore_1
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_1
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public float f() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : F
    //   6: fstore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: fload_1
    //   10: freturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
  
  public boolean g() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Le/e/g/a$c;
    //   6: astore_2
    //   7: getstatic e/e/g/a$c.e : Le/e/g/a$c;
    //   10: astore_3
    //   11: aload_2
    //   12: aload_3
    //   13: if_acmpne -> 21
    //   16: iconst_1
    //   17: istore_1
    //   18: goto -> 23
    //   21: iconst_0
    //   22: istore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: iload_1
    //   26: ireturn
    //   27: astore_2
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_2
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	27	finally
  }
  
  public boolean h() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Z
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
  
  protected void i() {
    for (Pair<e<T>, Executor> pair : this.f) {
      e e = (e)pair.first;
      ((Executor)pair.second).execute(new b(this, e));
    } 
  }
  
  class a implements Runnable {
    a(a this$0, boolean param1Boolean1, e param1e, boolean param1Boolean2) {}
    
    public void run() {
      if (this.c) {
        this.d.c(this.f);
        return;
      } 
      if (this.e) {
        this.d.a(this.f);
        return;
      } 
      this.d.b(this.f);
    }
  }
  
  class b implements Runnable {
    b(a this$0, e param1e) {}
    
    public void run() {
      this.c.d(this.d);
    }
  }
  
  private enum c {
    c, d, e;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/g/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */