package com.facebook.react.modules.debug;

import com.facebook.react.bridge.NotThreadSafeBridgeIdleDebugListener;
import com.facebook.react.common.e;
import com.facebook.react.uimanager.g1.a;

public class a implements NotThreadSafeBridgeIdleDebugListener, a {
  private final e a = e.c(20);
  
  private final e b = e.c(20);
  
  private final e c = e.c(20);
  
  private final e d = e.c(20);
  
  private volatile boolean e = true;
  
  private static long a(e parame, long paramLong1, long paramLong2) {
    long l = -1L;
    int i = 0;
    while (i < parame.a()) {
      long l1;
      long l2 = parame.b(i);
      if (l2 >= paramLong1 && l2 < paramLong2) {
        l1 = l2;
      } else {
        l1 = l;
        if (l2 >= paramLong2)
          return l; 
      } 
      i++;
      l = l1;
    } 
    return l;
  }
  
  private static void a(e parame, long paramLong) {
    int k = parame.a();
    boolean bool = false;
    int j = 0;
    int i;
    for (i = 0; j < k; i = m) {
      int m = i;
      if (parame.b(j) < paramLong)
        m = i + 1; 
      j++;
    } 
    if (i > 0) {
      for (j = bool; j < k - i; j++)
        parame.a(j, parame.b(j + i)); 
      parame.a(i);
    } 
  }
  
  private boolean b(long paramLong1, long paramLong2) {
    long l = a(this.a, paramLong1, paramLong2);
    paramLong1 = a(this.b, paramLong1, paramLong2);
    return (l == -1L && paramLong1 == -1L) ? this.e : ((l > paramLong1));
  }
  
  private static boolean b(e parame, long paramLong1, long paramLong2) {
    int i;
    for (i = 0; i < parame.a(); i++) {
      long l = parame.b(i);
      if (l >= paramLong1 && l < paramLong2)
        return true; 
    } 
    return false;
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Lcom/facebook/react/common/e;
    //   6: invokestatic nanoTime : ()J
    //   9: invokevirtual a : (J)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public boolean a(long paramLong1, long paramLong2) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Lcom/facebook/react/common/e;
    //   6: lload_1
    //   7: lload_3
    //   8: invokestatic b : (Lcom/facebook/react/common/e;JJ)Z
    //   11: istore #7
    //   13: aload_0
    //   14: lload_1
    //   15: lload_3
    //   16: invokespecial b : (JJ)Z
    //   19: istore #6
    //   21: iconst_1
    //   22: istore #5
    //   24: iload #7
    //   26: ifeq -> 32
    //   29: goto -> 52
    //   32: iload #6
    //   34: ifeq -> 102
    //   37: aload_0
    //   38: getfield c : Lcom/facebook/react/common/e;
    //   41: lload_1
    //   42: lload_3
    //   43: invokestatic b : (Lcom/facebook/react/common/e;JJ)Z
    //   46: ifne -> 102
    //   49: goto -> 52
    //   52: aload_0
    //   53: getfield a : Lcom/facebook/react/common/e;
    //   56: lload_3
    //   57: invokestatic a : (Lcom/facebook/react/common/e;J)V
    //   60: aload_0
    //   61: getfield b : Lcom/facebook/react/common/e;
    //   64: lload_3
    //   65: invokestatic a : (Lcom/facebook/react/common/e;J)V
    //   68: aload_0
    //   69: getfield c : Lcom/facebook/react/common/e;
    //   72: lload_3
    //   73: invokestatic a : (Lcom/facebook/react/common/e;J)V
    //   76: aload_0
    //   77: getfield d : Lcom/facebook/react/common/e;
    //   80: lload_3
    //   81: invokestatic a : (Lcom/facebook/react/common/e;J)V
    //   84: aload_0
    //   85: iload #6
    //   87: putfield e : Z
    //   90: aload_0
    //   91: monitorexit
    //   92: iload #5
    //   94: ireturn
    //   95: astore #8
    //   97: aload_0
    //   98: monitorexit
    //   99: aload #8
    //   101: athrow
    //   102: iconst_0
    //   103: istore #5
    //   105: goto -> 52
    // Exception table:
    //   from	to	target	type
    //   2	21	95	finally
    //   37	49	95	finally
    //   52	90	95	finally
  }
  
  public void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Lcom/facebook/react/common/e;
    //   6: invokestatic nanoTime : ()J
    //   9: invokevirtual a : (J)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public void onBridgeDestroyed() {
    /* monitor enter ThisExpression{ObjectType{com/facebook/react/modules/debug/a}} */
    /* monitor exit ThisExpression{ObjectType{com/facebook/react/modules/debug/a}} */
  }
  
  public void onTransitionToBridgeBusy() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/facebook/react/common/e;
    //   6: invokestatic nanoTime : ()J
    //   9: invokevirtual a : (J)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
  
  public void onTransitionToBridgeIdle() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Lcom/facebook/react/common/e;
    //   6: invokestatic nanoTime : ()J
    //   9: invokevirtual a : (J)V
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: astore_1
    //   16: aload_0
    //   17: monitorexit
    //   18: aload_1
    //   19: athrow
    // Exception table:
    //   from	to	target	type
    //   2	12	15	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/debug/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */