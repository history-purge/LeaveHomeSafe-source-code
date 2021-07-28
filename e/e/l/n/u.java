package e.e.l.n;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class u {
  private final Executor a;
  
  private final d b;
  
  private final Runnable c;
  
  private final Runnable d;
  
  private final int e;
  
  e.e.l.k.d f;
  
  int g;
  
  f h;
  
  long i;
  
  long j;
  
  public u(Executor paramExecutor, d paramd, int paramInt) {
    this.a = paramExecutor;
    this.b = paramd;
    this.e = paramInt;
    this.c = new a(this);
    this.d = new b(this);
    this.f = null;
    this.g = 0;
    this.h = f.c;
    this.i = 0L;
    this.j = 0L;
  }
  
  private void a(long paramLong) {
    if (paramLong > 0L) {
      e.a().schedule(this.d, paramLong, TimeUnit.MILLISECONDS);
      return;
    } 
    this.d.run();
  }
  
  private static boolean b(e.e.l.k.d paramd, int paramInt) {
    return (b.a(paramInt) || b.b(paramInt, 4) || e.e.l.k.d.e(paramd));
  }
  
  private void d() {
    // Byte code:
    //   0: invokestatic uptimeMillis : ()J
    //   3: lstore_2
    //   4: aload_0
    //   5: monitorenter
    //   6: aload_0
    //   7: getfield f : Le/e/l/k/d;
    //   10: astore #4
    //   12: aload_0
    //   13: getfield g : I
    //   16: istore_1
    //   17: aload_0
    //   18: aconst_null
    //   19: putfield f : Le/e/l/k/d;
    //   22: aload_0
    //   23: iconst_0
    //   24: putfield g : I
    //   27: aload_0
    //   28: getstatic e/e/l/n/u$f.e : Le/e/l/n/u$f;
    //   31: putfield h : Le/e/l/n/u$f;
    //   34: aload_0
    //   35: lload_2
    //   36: putfield j : J
    //   39: aload_0
    //   40: monitorexit
    //   41: aload #4
    //   43: iload_1
    //   44: invokestatic b : (Le/e/l/k/d;I)Z
    //   47: ifeq -> 62
    //   50: aload_0
    //   51: getfield b : Le/e/l/n/u$d;
    //   54: aload #4
    //   56: iload_1
    //   57: invokeinterface a : (Le/e/l/k/d;I)V
    //   62: aload #4
    //   64: invokestatic c : (Le/e/l/k/d;)V
    //   67: aload_0
    //   68: invokespecial e : ()V
    //   71: return
    //   72: astore #5
    //   74: aload #4
    //   76: invokestatic c : (Le/e/l/k/d;)V
    //   79: aload_0
    //   80: invokespecial e : ()V
    //   83: aload #5
    //   85: athrow
    //   86: astore #4
    //   88: aload_0
    //   89: monitorexit
    //   90: aload #4
    //   92: athrow
    // Exception table:
    //   from	to	target	type
    //   6	41	86	finally
    //   41	62	72	finally
    //   88	90	86	finally
  }
  
  private void e() {
    // Byte code:
    //   0: invokestatic uptimeMillis : ()J
    //   3: lstore #4
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield h : Le/e/l/n/u$f;
    //   11: getstatic e/e/l/n/u$f.f : Le/e/l/n/u$f;
    //   14: if_acmpne -> 51
    //   17: aload_0
    //   18: getfield j : J
    //   21: aload_0
    //   22: getfield e : I
    //   25: i2l
    //   26: ladd
    //   27: lload #4
    //   29: invokestatic max : (JJ)J
    //   32: lstore_2
    //   33: iconst_1
    //   34: istore_1
    //   35: aload_0
    //   36: lload #4
    //   38: putfield i : J
    //   41: aload_0
    //   42: getstatic e/e/l/n/u$f.d : Le/e/l/n/u$f;
    //   45: putfield h : Le/e/l/n/u$f;
    //   48: goto -> 62
    //   51: aload_0
    //   52: getstatic e/e/l/n/u$f.c : Le/e/l/n/u$f;
    //   55: putfield h : Le/e/l/n/u$f;
    //   58: lconst_0
    //   59: lstore_2
    //   60: iconst_0
    //   61: istore_1
    //   62: aload_0
    //   63: monitorexit
    //   64: iload_1
    //   65: ifeq -> 76
    //   68: aload_0
    //   69: lload_2
    //   70: lload #4
    //   72: lsub
    //   73: invokespecial a : (J)V
    //   76: return
    //   77: astore #6
    //   79: aload_0
    //   80: monitorexit
    //   81: aload #6
    //   83: athrow
    // Exception table:
    //   from	to	target	type
    //   7	33	77	finally
    //   35	48	77	finally
    //   51	58	77	finally
    //   62	64	77	finally
    //   79	81	77	finally
  }
  
  private void f() {
    this.a.execute(this.c);
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield f : Le/e/l/k/d;
    //   6: astore_1
    //   7: aload_0
    //   8: aconst_null
    //   9: putfield f : Le/e/l/k/d;
    //   12: aload_0
    //   13: iconst_0
    //   14: putfield g : I
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: invokestatic c : (Le/e/l/k/d;)V
    //   23: return
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	19	24	finally
    //   25	27	24	finally
  }
  
  public boolean a(e.e.l.k.d paramd, int paramInt) {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: invokestatic b : (Le/e/l/k/d;I)Z
    //   5: ifne -> 10
    //   8: iconst_0
    //   9: ireturn
    //   10: aload_0
    //   11: monitorenter
    //   12: aload_0
    //   13: getfield f : Le/e/l/k/d;
    //   16: astore_3
    //   17: aload_0
    //   18: aload_1
    //   19: invokestatic b : (Le/e/l/k/d;)Le/e/l/k/d;
    //   22: putfield f : Le/e/l/k/d;
    //   25: aload_0
    //   26: iload_2
    //   27: putfield g : I
    //   30: aload_0
    //   31: monitorexit
    //   32: aload_3
    //   33: invokestatic c : (Le/e/l/k/d;)V
    //   36: iconst_1
    //   37: ireturn
    //   38: astore_1
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: athrow
    // Exception table:
    //   from	to	target	type
    //   12	32	38	finally
    //   39	41	38	finally
  }
  
  public long b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield j : J
    //   6: lstore_1
    //   7: aload_0
    //   8: getfield i : J
    //   11: lstore_3
    //   12: aload_0
    //   13: monitorexit
    //   14: lload_1
    //   15: lload_3
    //   16: lsub
    //   17: lreturn
    //   18: astore #5
    //   20: aload_0
    //   21: monitorexit
    //   22: aload #5
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	18	finally
  }
  
  public boolean c() {
    // Byte code:
    //   0: invokestatic uptimeMillis : ()J
    //   3: lstore #5
    //   5: aload_0
    //   6: monitorenter
    //   7: aload_0
    //   8: getfield f : Le/e/l/k/d;
    //   11: aload_0
    //   12: getfield g : I
    //   15: invokestatic b : (Le/e/l/k/d;I)Z
    //   18: istore #7
    //   20: iconst_0
    //   21: istore_1
    //   22: iload #7
    //   24: ifne -> 31
    //   27: aload_0
    //   28: monitorexit
    //   29: iconst_0
    //   30: ireturn
    //   31: getstatic e/e/l/n/u$c.a : [I
    //   34: aload_0
    //   35: getfield h : Le/e/l/n/u$f;
    //   38: invokevirtual ordinal : ()I
    //   41: iaload
    //   42: istore_2
    //   43: iload_2
    //   44: iconst_1
    //   45: if_icmpeq -> 71
    //   48: iload_2
    //   49: iconst_2
    //   50: if_icmpeq -> 125
    //   53: iload_2
    //   54: iconst_3
    //   55: if_icmpeq -> 61
    //   58: goto -> 125
    //   61: aload_0
    //   62: getstatic e/e/l/n/u$f.f : Le/e/l/n/u$f;
    //   65: putfield h : Le/e/l/n/u$f;
    //   68: goto -> 125
    //   71: aload_0
    //   72: getfield j : J
    //   75: aload_0
    //   76: getfield e : I
    //   79: i2l
    //   80: ladd
    //   81: lload #5
    //   83: invokestatic max : (JJ)J
    //   86: lstore_3
    //   87: aload_0
    //   88: lload #5
    //   90: putfield i : J
    //   93: aload_0
    //   94: getstatic e/e/l/n/u$f.d : Le/e/l/n/u$f;
    //   97: putfield h : Le/e/l/n/u$f;
    //   100: iconst_1
    //   101: istore_1
    //   102: aload_0
    //   103: monitorexit
    //   104: iload_1
    //   105: ifeq -> 116
    //   108: aload_0
    //   109: lload_3
    //   110: lload #5
    //   112: lsub
    //   113: invokespecial a : (J)V
    //   116: iconst_1
    //   117: ireturn
    //   118: astore #8
    //   120: aload_0
    //   121: monitorexit
    //   122: aload #8
    //   124: athrow
    //   125: lconst_0
    //   126: lstore_3
    //   127: goto -> 102
    // Exception table:
    //   from	to	target	type
    //   7	20	118	finally
    //   27	29	118	finally
    //   31	43	118	finally
    //   61	68	118	finally
    //   71	100	118	finally
    //   102	104	118	finally
    //   120	122	118	finally
  }
  
  class a implements Runnable {
    a(u this$0) {}
    
    public void run() {
      u.a(this.c);
    }
  }
  
  class b implements Runnable {
    b(u this$0) {}
    
    public void run() {
      u.b(this.c);
    }
  }
  
  public static interface d {
    void a(e.e.l.k.d param1d, int param1Int);
  }
  
  static class e {
    private static ScheduledExecutorService a;
    
    static ScheduledExecutorService a() {
      if (a == null)
        a = Executors.newSingleThreadScheduledExecutor(); 
      return a;
    }
  }
  
  enum f {
    c, d, e, f;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */