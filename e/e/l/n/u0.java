package e.e.l.n;

import android.util.Pair;
import e.e.e.d.i;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;

public class u0<T> implements j0<T> {
  private final j0<T> a;
  
  private final int b;
  
  private int c;
  
  private final ConcurrentLinkedQueue<Pair<k<T>, k0>> d;
  
  private final Executor e;
  
  public u0(int paramInt, Executor paramExecutor, j0<T> paramj0) {
    this.b = paramInt;
    i.a(paramExecutor);
    this.e = paramExecutor;
    i.a(paramj0);
    this.a = paramj0;
    this.d = new ConcurrentLinkedQueue<Pair<k<T>, k0>>();
    this.c = 0;
  }
  
  public void a(k<T> paramk, k0 paramk0) {
    // Byte code:
    //   0: aload_2
    //   1: invokeinterface e : ()Le/e/l/n/m0;
    //   6: aload_2
    //   7: invokeinterface a : ()Ljava/lang/String;
    //   12: ldc 'ThrottlingProducer'
    //   14: invokeinterface a : (Ljava/lang/String;Ljava/lang/String;)V
    //   19: aload_0
    //   20: monitorenter
    //   21: aload_0
    //   22: getfield c : I
    //   25: istore #4
    //   27: aload_0
    //   28: getfield b : I
    //   31: istore #5
    //   33: iconst_1
    //   34: istore_3
    //   35: iload #4
    //   37: iload #5
    //   39: if_icmplt -> 58
    //   42: aload_0
    //   43: getfield d : Ljava/util/concurrent/ConcurrentLinkedQueue;
    //   46: aload_1
    //   47: aload_2
    //   48: invokestatic create : (Ljava/lang/Object;Ljava/lang/Object;)Landroid/util/Pair;
    //   51: invokevirtual add : (Ljava/lang/Object;)Z
    //   54: pop
    //   55: goto -> 70
    //   58: aload_0
    //   59: aload_0
    //   60: getfield c : I
    //   63: iconst_1
    //   64: iadd
    //   65: putfield c : I
    //   68: iconst_0
    //   69: istore_3
    //   70: aload_0
    //   71: monitorexit
    //   72: iload_3
    //   73: ifne -> 82
    //   76: aload_0
    //   77: aload_1
    //   78: aload_2
    //   79: invokevirtual b : (Le/e/l/n/k;Le/e/l/n/k0;)V
    //   82: return
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Exception table:
    //   from	to	target	type
    //   21	33	83	finally
    //   42	55	83	finally
    //   58	68	83	finally
    //   70	72	83	finally
    //   84	86	83	finally
  }
  
  void b(k<T> paramk, k0 paramk0) {
    paramk0.e().a(paramk0.a(), "ThrottlingProducer", (Map<String, String>)null);
    this.a.a(new b(paramk, null), paramk0);
  }
  
  private class b extends n<T, T> {
    private b(u0 this$0, k<T> param1k) {
      super(param1k);
    }
    
    private void d() {
      synchronized (this.c) {
        Pair pair = u0.a(this.c).poll();
        if (pair == null)
          u0.b(this.c); 
        if (pair != null)
          u0.c(this.c).execute(new a(this, pair)); 
        return;
      } 
    }
    
    protected void b() {
      c().a();
      d();
    }
    
    protected void b(T param1T, int param1Int) {
      c().a((O)param1T, param1Int);
      if (b.a(param1Int))
        d(); 
    }
    
    protected void b(Throwable param1Throwable) {
      c().a(param1Throwable);
      d();
    }
    
    class a implements Runnable {
      a(u0.b this$0, Pair param2Pair) {}
      
      public void run() {
        u0 u0 = this.d.c;
        Pair pair = this.c;
        u0.b((k)pair.first, (k0)pair.second);
      }
    }
  }
  
  class a implements Runnable {
    a(u0 this$0, Pair param1Pair) {}
    
    public void run() {
      u0 u0 = this.d.c;
      Pair pair = this.c;
      u0.b((k)pair.first, (k0)pair.second);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */