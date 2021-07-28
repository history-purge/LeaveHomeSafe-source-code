package e.g.a.s;

import e.g.a.c;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

public class g<T> extends f implements c<T> {
  c f;
  
  Exception g;
  
  T h;
  
  boolean i;
  
  e<T> j;
  
  private boolean a(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial cancel : ()Z
    //   4: ifne -> 9
    //   7: iconst_0
    //   8: ireturn
    //   9: aload_0
    //   10: monitorenter
    //   11: aload_0
    //   12: new java/util/concurrent/CancellationException
    //   15: dup
    //   16: invokespecial <init> : ()V
    //   19: putfield g : Ljava/lang/Exception;
    //   22: aload_0
    //   23: invokevirtual g : ()V
    //   26: aload_0
    //   27: invokespecial i : ()Le/g/a/s/e;
    //   30: astore_2
    //   31: aload_0
    //   32: iload_1
    //   33: putfield i : Z
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_0
    //   39: aload_2
    //   40: invokespecial c : (Le/g/a/s/e;)V
    //   43: iconst_1
    //   44: ireturn
    //   45: astore_2
    //   46: aload_0
    //   47: monitorexit
    //   48: aload_2
    //   49: athrow
    // Exception table:
    //   from	to	target	type
    //   11	38	45	finally
    //   46	48	45	finally
  }
  
  private void c(e<T> parame) {
    if (parame != null && !this.i)
      parame.a(this.g, this.h); 
  }
  
  private T h() {
    Exception exception = this.g;
    if (exception == null)
      return this.h; 
    throw new ExecutionException(exception);
  }
  
  private e<T> i() {
    e<T> e1 = this.j;
    this.j = null;
    return e1;
  }
  
  public final <C extends e<T>> C a(C paramC) {
    if (paramC instanceof b)
      ((b)paramC).a(this); 
    b((e<T>)paramC);
    return paramC;
  }
  
  public g<T> a(a parama) {
    a(parama);
    return this;
  }
  
  public g<T> a(d<T> paramd) {
    paramd.b(f());
    a(paramd);
    return this;
  }
  
  public boolean a(Exception paramException) {
    return b(paramException, null);
  }
  
  public boolean a(T paramT) {
    return b(null, paramT);
  }
  
  public g<T> b(e<T> parame) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: putfield j : Le/g/a/s/e;
    //   7: aload_0
    //   8: invokevirtual isDone : ()Z
    //   11: ifne -> 24
    //   14: aload_0
    //   15: invokevirtual isCancelled : ()Z
    //   18: ifeq -> 43
    //   21: goto -> 24
    //   24: aload_0
    //   25: invokespecial i : ()Le/g/a/s/e;
    //   28: astore_1
    //   29: aload_0
    //   30: monitorexit
    //   31: aload_0
    //   32: aload_1
    //   33: invokespecial c : (Le/g/a/s/e;)V
    //   36: aload_0
    //   37: areturn
    //   38: astore_1
    //   39: aload_0
    //   40: monitorexit
    //   41: aload_1
    //   42: athrow
    //   43: aconst_null
    //   44: astore_1
    //   45: goto -> 29
    // Exception table:
    //   from	to	target	type
    //   2	21	38	finally
    //   24	29	38	finally
    //   29	31	38	finally
    //   39	41	38	finally
  }
  
  public boolean b(Exception paramException, T paramT) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokespecial d : ()Z
    //   6: ifne -> 13
    //   9: aload_0
    //   10: monitorexit
    //   11: iconst_0
    //   12: ireturn
    //   13: aload_0
    //   14: aload_2
    //   15: putfield h : Ljava/lang/Object;
    //   18: aload_0
    //   19: aload_1
    //   20: putfield g : Ljava/lang/Exception;
    //   23: aload_0
    //   24: invokevirtual g : ()V
    //   27: aload_0
    //   28: invokespecial i : ()Le/g/a/s/e;
    //   31: astore_1
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_0
    //   35: aload_1
    //   36: invokespecial c : (Le/g/a/s/e;)V
    //   39: iconst_1
    //   40: ireturn
    //   41: astore_1
    //   42: aload_0
    //   43: monitorexit
    //   44: aload_1
    //   45: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	41	finally
    //   13	34	41	finally
    //   42	44	41	finally
  }
  
  public boolean cancel() {
    return a(this.i);
  }
  
  public boolean cancel(boolean paramBoolean) {
    return cancel();
  }
  
  c e() {
    if (this.f == null)
      this.f = new c(); 
    return this.f;
  }
  
  public e<T> f() {
    return new a(this);
  }
  
  void g() {
    c c1 = this.f;
    if (c1 != null) {
      c1.b();
      this.f = null;
    } 
  }
  
  public T get() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual isCancelled : ()Z
    //   6: ifne -> 35
    //   9: aload_0
    //   10: invokevirtual isDone : ()Z
    //   13: ifeq -> 19
    //   16: goto -> 35
    //   19: aload_0
    //   20: invokevirtual e : ()Le/g/a/c;
    //   23: astore_1
    //   24: aload_0
    //   25: monitorexit
    //   26: aload_1
    //   27: invokevirtual a : ()V
    //   30: aload_0
    //   31: invokespecial h : ()Ljava/lang/Object;
    //   34: areturn
    //   35: aload_0
    //   36: invokespecial h : ()Ljava/lang/Object;
    //   39: astore_1
    //   40: aload_0
    //   41: monitorexit
    //   42: aload_1
    //   43: areturn
    //   44: astore_1
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_1
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	44	finally
    //   19	26	44	finally
    //   35	42	44	finally
    //   45	47	44	finally
  }
  
  public T get(long paramLong, TimeUnit paramTimeUnit) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual isCancelled : ()Z
    //   6: ifne -> 50
    //   9: aload_0
    //   10: invokevirtual isDone : ()Z
    //   13: ifeq -> 19
    //   16: goto -> 50
    //   19: aload_0
    //   20: invokevirtual e : ()Le/g/a/c;
    //   23: astore #4
    //   25: aload_0
    //   26: monitorexit
    //   27: aload #4
    //   29: lload_1
    //   30: aload_3
    //   31: invokevirtual a : (JLjava/util/concurrent/TimeUnit;)Z
    //   34: ifeq -> 42
    //   37: aload_0
    //   38: invokespecial h : ()Ljava/lang/Object;
    //   41: areturn
    //   42: new java/util/concurrent/TimeoutException
    //   45: dup
    //   46: invokespecial <init> : ()V
    //   49: athrow
    //   50: aload_0
    //   51: invokespecial h : ()Ljava/lang/Object;
    //   54: astore_3
    //   55: aload_0
    //   56: monitorexit
    //   57: aload_3
    //   58: areturn
    //   59: astore_3
    //   60: aload_0
    //   61: monitorexit
    //   62: aload_3
    //   63: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	59	finally
    //   19	27	59	finally
    //   50	57	59	finally
    //   60	62	59	finally
  }
  
  class a implements e<T> {
    a(g this$0) {}
    
    public void a(Exception param1Exception, T param1T) {
      this.c.b(param1Exception, param1T);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/s/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */