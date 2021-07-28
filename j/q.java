package j;

final class q {
  static p a;
  
  static long b;
  
  static p a() {
    // Byte code:
    //   0: ldc j/q
    //   2: monitorenter
    //   3: getstatic j/q.a : Lj/p;
    //   6: ifnull -> 40
    //   9: getstatic j/q.a : Lj/p;
    //   12: astore_0
    //   13: aload_0
    //   14: getfield f : Lj/p;
    //   17: putstatic j/q.a : Lj/p;
    //   20: aload_0
    //   21: aconst_null
    //   22: putfield f : Lj/p;
    //   25: getstatic j/q.b : J
    //   28: ldc2_w 8192
    //   31: lsub
    //   32: putstatic j/q.b : J
    //   35: ldc j/q
    //   37: monitorexit
    //   38: aload_0
    //   39: areturn
    //   40: ldc j/q
    //   42: monitorexit
    //   43: new j/p
    //   46: dup
    //   47: invokespecial <init> : ()V
    //   50: areturn
    //   51: astore_0
    //   52: ldc j/q
    //   54: monitorexit
    //   55: aload_0
    //   56: athrow
    // Exception table:
    //   from	to	target	type
    //   3	38	51	finally
    //   40	43	51	finally
    //   52	55	51	finally
  }
  
  static void a(p paramp) {
    // Byte code:
    //   0: aload_0
    //   1: getfield f : Lj/p;
    //   4: ifnonnull -> 84
    //   7: aload_0
    //   8: getfield g : Lj/p;
    //   11: ifnonnull -> 84
    //   14: aload_0
    //   15: getfield d : Z
    //   18: ifeq -> 22
    //   21: return
    //   22: ldc j/q
    //   24: monitorenter
    //   25: getstatic j/q.b : J
    //   28: ldc2_w 8192
    //   31: ladd
    //   32: ldc2_w 65536
    //   35: lcmp
    //   36: ifle -> 43
    //   39: ldc j/q
    //   41: monitorexit
    //   42: return
    //   43: getstatic j/q.b : J
    //   46: ldc2_w 8192
    //   49: ladd
    //   50: putstatic j/q.b : J
    //   53: aload_0
    //   54: getstatic j/q.a : Lj/p;
    //   57: putfield f : Lj/p;
    //   60: aload_0
    //   61: iconst_0
    //   62: putfield c : I
    //   65: aload_0
    //   66: iconst_0
    //   67: putfield b : I
    //   70: aload_0
    //   71: putstatic j/q.a : Lj/p;
    //   74: ldc j/q
    //   76: monitorexit
    //   77: return
    //   78: astore_0
    //   79: ldc j/q
    //   81: monitorexit
    //   82: aload_0
    //   83: athrow
    //   84: new java/lang/IllegalArgumentException
    //   87: dup
    //   88: invokespecial <init> : ()V
    //   91: athrow
    // Exception table:
    //   from	to	target	type
    //   25	42	78	finally
    //   43	77	78	finally
    //   79	82	78	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/j/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */