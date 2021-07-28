package e.e.e.h;

import e.e.e.d.i;
import java.io.Closeable;
import java.io.IOException;

public final class a<T> implements Cloneable, Closeable {
  private static Class<a> g = a.class;
  
  private static final c<Closeable> h = new a();
  
  private static final c i = new b();
  
  private boolean c = false;
  
  private final d<T> d;
  
  private final c e;
  
  private final Throwable f;
  
  private a(d<T> paramd, c paramc, Throwable paramThrowable) {
    i.a(paramd);
    this.d = paramd;
    paramd.a();
    this.e = paramc;
    this.f = paramThrowable;
  }
  
  private a(T paramT, c<T> paramc, c paramc1, Throwable paramThrowable) {
    this.d = new d<T>(paramT, paramc);
    this.e = paramc1;
    this.f = paramThrowable;
  }
  
  public static <T> a<T> a(a<T> parama) {
    return (parama != null) ? parama.a() : null;
  }
  
  public static <T extends Closeable> a<T> a(T paramT) {
    return a(paramT, (c)h);
  }
  
  public static <T extends Closeable> a<T> a(T paramT, c paramc) {
    Throwable throwable = null;
    if (paramT == null)
      return null; 
    c<Closeable> c1 = h;
    if (paramc.a())
      throwable = new Throwable(); 
    return new a<T>(paramT, (c)c1, paramc, throwable);
  }
  
  public static <T> a<T> a(T paramT, c<T> paramc) {
    return a(paramT, paramc, i);
  }
  
  public static <T> a<T> a(T paramT, c<T> paramc, c paramc1) {
    Throwable throwable = null;
    if (paramT == null)
      return null; 
    if (paramc1.a())
      throwable = new Throwable(); 
    return new a<T>(paramT, paramc, paramc1, throwable);
  }
  
  public static void b(a<?> parama) {
    if (parama != null)
      parama.close(); 
  }
  
  public static boolean c(a<?> parama) {
    return (parama != null && parama.d());
  }
  
  public a<T> a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual d : ()Z
    //   6: ifeq -> 18
    //   9: aload_0
    //   10: invokevirtual clone : ()Le/e/e/h/a;
    //   13: astore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_1
    //   17: areturn
    //   18: aload_0
    //   19: monitorexit
    //   20: aconst_null
    //   21: areturn
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	22	finally
  }
  
  public T b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Z
    //   6: ifne -> 35
    //   9: iconst_1
    //   10: istore_1
    //   11: goto -> 14
    //   14: iload_1
    //   15: invokestatic b : (Z)V
    //   18: aload_0
    //   19: getfield d : Le/e/e/h/d;
    //   22: invokevirtual c : ()Ljava/lang/Object;
    //   25: astore_2
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_2
    //   29: areturn
    //   30: astore_2
    //   31: aload_0
    //   32: monitorexit
    //   33: aload_2
    //   34: athrow
    //   35: iconst_0
    //   36: istore_1
    //   37: goto -> 14
    // Exception table:
    //   from	to	target	type
    //   2	9	30	finally
    //   14	26	30	finally
  }
  
  public int c() {
    return d() ? System.identityHashCode(this.d.c()) : 0;
  }
  
  public a<T> clone() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual d : ()Z
    //   6: invokestatic b : (Z)V
    //   9: new e/e/e/h/a
    //   12: dup
    //   13: aload_0
    //   14: getfield d : Le/e/e/h/d;
    //   17: aload_0
    //   18: getfield e : Le/e/e/h/a$c;
    //   21: aload_0
    //   22: getfield f : Ljava/lang/Throwable;
    //   25: invokespecial <init> : (Le/e/e/h/d;Le/e/e/h/a$c;Ljava/lang/Throwable;)V
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_1
    //   32: areturn
    //   33: astore_1
    //   34: aload_0
    //   35: monitorexit
    //   36: aload_1
    //   37: athrow
    // Exception table:
    //   from	to	target	type
    //   2	29	33	finally
  }
  
  public void close() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Z
    //   6: ifeq -> 12
    //   9: aload_0
    //   10: monitorexit
    //   11: return
    //   12: aload_0
    //   13: iconst_1
    //   14: putfield c : Z
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_0
    //   20: getfield d : Le/e/e/h/d;
    //   23: invokevirtual b : ()V
    //   26: return
    //   27: astore_1
    //   28: aload_0
    //   29: monitorexit
    //   30: aload_1
    //   31: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	27	finally
    //   12	19	27	finally
    //   28	30	27	finally
  }
  
  public boolean d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: iconst_1
    //   11: ixor
    //   12: ireturn
    //   13: astore_2
    //   14: aload_0
    //   15: monitorexit
    //   16: aload_2
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	13	finally
  }
  
  protected void finalize() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Z
    //   6: ifeq -> 16
    //   9: aload_0
    //   10: monitorexit
    //   11: aload_0
    //   12: invokespecial finalize : ()V
    //   15: return
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_0
    //   19: getfield e : Le/e/e/h/a$c;
    //   22: aload_0
    //   23: getfield d : Le/e/e/h/d;
    //   26: aload_0
    //   27: getfield f : Ljava/lang/Throwable;
    //   30: invokeinterface a : (Le/e/e/h/d;Ljava/lang/Throwable;)V
    //   35: aload_0
    //   36: invokevirtual close : ()V
    //   39: aload_0
    //   40: invokespecial finalize : ()V
    //   43: return
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    //   49: astore_1
    //   50: aload_0
    //   51: invokespecial finalize : ()V
    //   54: aload_1
    //   55: athrow
    // Exception table:
    //   from	to	target	type
    //   0	2	49	finally
    //   2	11	44	finally
    //   16	18	44	finally
    //   18	39	49	finally
    //   45	47	44	finally
    //   47	49	49	finally
  }
  
  static final class a implements c<Closeable> {
    public void a(Closeable param1Closeable) {
      try {
        e.e.e.d.b.a(param1Closeable, true);
        return;
      } catch (IOException iOException) {
        return;
      } 
    }
  }
  
  static final class b implements c {
    public void a(d<Object> param1d, Throwable param1Throwable) {
      e.e.e.e.a.c(a.x(), "Finalized without closing: %x %x (type = %s)", new Object[] { Integer.valueOf(System.identityHashCode(this)), Integer.valueOf(System.identityHashCode(param1d)), param1d.c().getClass().getName() });
    }
    
    public boolean a() {
      return false;
    }
  }
  
  public static interface c {
    void a(d<Object> param1d, Throwable param1Throwable);
    
    boolean a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/h/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */