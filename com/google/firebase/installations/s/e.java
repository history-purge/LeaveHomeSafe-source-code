package com.google.firebase.installations.s;

import com.google.firebase.installations.p;
import java.util.concurrent.TimeUnit;

class e {
  private static final long d = TimeUnit.HOURS.toMillis(24L);
  
  private static final long e = TimeUnit.MINUTES.toMillis(30L);
  
  private final p a = p.d();
  
  private long b;
  
  private int c;
  
  private long b(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: invokestatic c : (I)Z
    //   6: ifne -> 19
    //   9: getstatic com/google/firebase/installations/s/e.d : J
    //   12: lstore #6
    //   14: aload_0
    //   15: monitorexit
    //   16: lload #6
    //   18: lreturn
    //   19: ldc2_w 2.0
    //   22: aload_0
    //   23: getfield c : I
    //   26: i2d
    //   27: invokestatic pow : (DD)D
    //   30: dstore_2
    //   31: aload_0
    //   32: getfield a : Lcom/google/firebase/installations/p;
    //   35: invokevirtual c : ()J
    //   38: lstore #6
    //   40: lload #6
    //   42: l2d
    //   43: dstore #4
    //   45: dload #4
    //   47: invokestatic isNaN : (D)Z
    //   50: pop
    //   51: dload_2
    //   52: dload #4
    //   54: dadd
    //   55: getstatic com/google/firebase/installations/s/e.e : J
    //   58: l2d
    //   59: invokestatic min : (DD)D
    //   62: dstore_2
    //   63: dload_2
    //   64: d2l
    //   65: lstore #6
    //   67: aload_0
    //   68: monitorexit
    //   69: lload #6
    //   71: lreturn
    //   72: astore #8
    //   74: aload_0
    //   75: monitorexit
    //   76: aload #8
    //   78: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	72	finally
    //   19	40	72	finally
    //   51	63	72	finally
  }
  
  private void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: iconst_0
    //   4: putfield c : I
    //   7: aload_0
    //   8: monitorexit
    //   9: return
    //   10: astore_1
    //   11: aload_0
    //   12: monitorexit
    //   13: aload_1
    //   14: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	10	finally
  }
  
  private static boolean c(int paramInt) {
    return (paramInt == 429 || (paramInt >= 500 && paramInt < 600));
  }
  
  private static boolean d(int paramInt) {
    return ((paramInt >= 200 && paramInt < 300) || paramInt == 401 || paramInt == 404);
  }
  
  public void a(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: iload_1
    //   3: invokestatic d : (I)Z
    //   6: ifeq -> 16
    //   9: aload_0
    //   10: invokespecial b : ()V
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: aload_0
    //   17: aload_0
    //   18: getfield c : I
    //   21: iconst_1
    //   22: iadd
    //   23: putfield c : I
    //   26: aload_0
    //   27: iload_1
    //   28: invokespecial b : (I)J
    //   31: lstore_2
    //   32: aload_0
    //   33: aload_0
    //   34: getfield a : Lcom/google/firebase/installations/p;
    //   37: invokevirtual a : ()J
    //   40: lload_2
    //   41: ladd
    //   42: putfield b : J
    //   45: aload_0
    //   46: monitorexit
    //   47: return
    //   48: astore #4
    //   50: aload_0
    //   51: monitorexit
    //   52: aload #4
    //   54: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	48	finally
    //   16	45	48	finally
  }
  
  public boolean a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : I
    //   6: ifeq -> 37
    //   9: aload_0
    //   10: getfield a : Lcom/google/firebase/installations/p;
    //   13: invokevirtual a : ()J
    //   16: lstore_1
    //   17: aload_0
    //   18: getfield b : J
    //   21: lstore_3
    //   22: lload_1
    //   23: lload_3
    //   24: lcmp
    //   25: ifle -> 31
    //   28: goto -> 37
    //   31: iconst_0
    //   32: istore #5
    //   34: goto -> 40
    //   37: iconst_1
    //   38: istore #5
    //   40: aload_0
    //   41: monitorexit
    //   42: iload #5
    //   44: ireturn
    //   45: astore #6
    //   47: aload_0
    //   48: monitorexit
    //   49: aload #6
    //   51: athrow
    // Exception table:
    //   from	to	target	type
    //   2	22	45	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/installations/s/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */