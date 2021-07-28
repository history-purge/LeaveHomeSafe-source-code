package e.g.a;

import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.util.Set;
import java.util.concurrent.Semaphore;

public class m {
  private Selector a;
  
  boolean b;
  
  Semaphore c = new Semaphore(0);
  
  public m(Selector paramSelector) {
    this.a = paramSelector;
  }
  
  public void a() {
    this.a.close();
  }
  
  public void a(long paramLong) {
    try {
      this.c.drainPermits();
      this.a.select(paramLong);
      return;
    } finally {
      this.c.release(2147483647);
    } 
  }
  
  public Selector b() {
    return this.a;
  }
  
  public boolean c() {
    return this.a.isOpen();
  }
  
  public Set<SelectionKey> d() {
    return this.a.keys();
  }
  
  public void e() {
    a(0L);
  }
  
  public int f() {
    return this.a.selectNow();
  }
  
  public Set<SelectionKey> g() {
    return this.a.selectedKeys();
  }
  
  public void h() {
    // Byte code:
    //   0: aload_0
    //   1: getfield c : Ljava/util/concurrent/Semaphore;
    //   4: invokevirtual tryAcquire : ()Z
    //   7: istore_2
    //   8: aload_0
    //   9: getfield a : Ljava/nio/channels/Selector;
    //   12: invokevirtual wakeup : ()Ljava/nio/channels/Selector;
    //   15: pop
    //   16: iload_2
    //   17: iconst_1
    //   18: ixor
    //   19: ifeq -> 23
    //   22: return
    //   23: aload_0
    //   24: monitorenter
    //   25: aload_0
    //   26: getfield b : Z
    //   29: ifeq -> 35
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: aload_0
    //   36: iconst_1
    //   37: putfield b : Z
    //   40: aload_0
    //   41: monitorexit
    //   42: iconst_0
    //   43: istore_1
    //   44: iload_1
    //   45: bipush #100
    //   47: if_icmpge -> 118
    //   50: aload_0
    //   51: getfield c : Ljava/util/concurrent/Semaphore;
    //   54: ldc2_w 10
    //   57: getstatic java/util/concurrent/TimeUnit.MILLISECONDS : Ljava/util/concurrent/TimeUnit;
    //   60: invokevirtual tryAcquire : (JLjava/util/concurrent/TimeUnit;)Z
    //   63: istore_2
    //   64: iload_2
    //   65: ifeq -> 87
    //   68: aload_0
    //   69: monitorenter
    //   70: aload_0
    //   71: iconst_0
    //   72: putfield b : Z
    //   75: aload_0
    //   76: monitorexit
    //   77: return
    //   78: astore_3
    //   79: aload_0
    //   80: monitorexit
    //   81: aload_3
    //   82: athrow
    //   83: astore_3
    //   84: goto -> 102
    //   87: aload_0
    //   88: getfield a : Ljava/nio/channels/Selector;
    //   91: invokevirtual wakeup : ()Ljava/nio/channels/Selector;
    //   94: pop
    //   95: iload_1
    //   96: iconst_1
    //   97: iadd
    //   98: istore_1
    //   99: goto -> 44
    //   102: aload_0
    //   103: monitorenter
    //   104: aload_0
    //   105: iconst_0
    //   106: putfield b : Z
    //   109: aload_0
    //   110: monitorexit
    //   111: aload_3
    //   112: athrow
    //   113: astore_3
    //   114: aload_0
    //   115: monitorexit
    //   116: aload_3
    //   117: athrow
    //   118: aload_0
    //   119: monitorenter
    //   120: aload_0
    //   121: iconst_0
    //   122: putfield b : Z
    //   125: aload_0
    //   126: monitorexit
    //   127: return
    //   128: astore_3
    //   129: aload_0
    //   130: monitorexit
    //   131: aload_3
    //   132: athrow
    //   133: astore_3
    //   134: aload_0
    //   135: monitorexit
    //   136: goto -> 141
    //   139: aload_3
    //   140: athrow
    //   141: goto -> 139
    //   144: astore_3
    //   145: goto -> 87
    // Exception table:
    //   from	to	target	type
    //   25	34	133	finally
    //   35	42	133	finally
    //   50	64	144	java/lang/InterruptedException
    //   50	64	83	finally
    //   70	77	78	finally
    //   79	81	78	finally
    //   87	95	83	finally
    //   104	111	113	finally
    //   114	116	113	finally
    //   120	127	128	finally
    //   129	131	128	finally
    //   134	136	133	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/g/a/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */