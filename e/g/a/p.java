package e.g.a;

import java.util.LinkedList;
import java.util.WeakHashMap;
import java.util.concurrent.Semaphore;

public class p extends LinkedList<Runnable> {
  private static final WeakHashMap<Thread, p> c = new WeakHashMap<Thread, p>();
  
  Semaphore queueSemaphore = new Semaphore(0);
  
  c waiter;
  
  static p a(Thread paramThread) {
    synchronized (c) {
      p p2 = c.get(paramThread);
      p p1 = p2;
      if (p2 == null) {
        p1 = new p();
        c.put(paramThread, p1);
      } 
      return p1;
    } 
  }
  
  static void a(c paramc) {
    synchronized (c) {
      for (p p1 : c.values()) {
        if (p1.waiter == paramc)
          p1.queueSemaphore.release(); 
      } 
      return;
    } 
  }
  
  public boolean a(Runnable paramRunnable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial add : (Ljava/lang/Object;)Z
    //   7: istore_2
    //   8: aload_0
    //   9: monitorexit
    //   10: iload_2
    //   11: ireturn
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	12	finally
    //   13	15	12	finally
  }
  
  public Runnable remove() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: invokevirtual isEmpty : ()Z
    //   6: ifeq -> 13
    //   9: aload_0
    //   10: monitorexit
    //   11: aconst_null
    //   12: areturn
    //   13: aload_0
    //   14: invokespecial remove : ()Ljava/lang/Object;
    //   17: checkcast java/lang/Runnable
    //   20: astore_1
    //   21: aload_0
    //   22: monitorexit
    //   23: aload_1
    //   24: areturn
    //   25: astore_1
    //   26: aload_0
    //   27: monitorexit
    //   28: aload_1
    //   29: athrow
    // Exception table:
    //   from	to	target	type
    //   2	11	25	finally
    //   13	23	25	finally
    //   26	28	25	finally
  }
  
  public boolean remove(Object paramObject) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_1
    //   4: invokespecial remove : (Ljava/lang/Object;)Z
    //   7: istore_2
    //   8: aload_0
    //   9: monitorexit
    //   10: iload_2
    //   11: ireturn
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	12	finally
    //   13	15	12	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */