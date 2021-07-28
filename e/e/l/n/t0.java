package e.e.l.n;

import e.e.e.d.i;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

public class t0 {
  private boolean a = false;
  
  private final Deque<Runnable> b;
  
  private final Executor c;
  
  public t0(Executor paramExecutor) {
    i.a(paramExecutor);
    this.c = paramExecutor;
    this.b = new ArrayDeque<Runnable>();
  }
  
  public void a(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: ifeq -> 23
    //   9: aload_0
    //   10: getfield b : Ljava/util/Deque;
    //   13: aload_1
    //   14: invokeinterface add : (Ljava/lang/Object;)Z
    //   19: pop
    //   20: goto -> 33
    //   23: aload_0
    //   24: getfield c : Ljava/util/concurrent/Executor;
    //   27: aload_1
    //   28: invokeinterface execute : (Ljava/lang/Runnable;)V
    //   33: aload_0
    //   34: monitorexit
    //   35: return
    //   36: astore_1
    //   37: aload_0
    //   38: monitorexit
    //   39: aload_1
    //   40: athrow
    // Exception table:
    //   from	to	target	type
    //   2	20	36	finally
    //   23	33	36	finally
  }
  
  public void b(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/util/Deque;
    //   6: aload_1
    //   7: invokeinterface remove : (Ljava/lang/Object;)Z
    //   12: pop
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: astore_1
    //   17: aload_0
    //   18: monitorexit
    //   19: aload_1
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	16	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/t0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */