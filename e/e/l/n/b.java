package e.e.l.n;

import e.e.e.e.a;

public abstract class b<T> implements k<T> {
  private boolean a = false;
  
  public static int a(boolean paramBoolean) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static boolean a(int paramInt) {
    return ((paramInt & 0x1) == 1);
  }
  
  public static boolean a(int paramInt1, int paramInt2) {
    return ((paramInt1 & paramInt2) != 0);
  }
  
  public static boolean b(int paramInt) {
    return a(paramInt) ^ true;
  }
  
  public static boolean b(int paramInt1, int paramInt2) {
    return ((paramInt1 & paramInt2) == paramInt2);
  }
  
  public static int c(int paramInt1, int paramInt2) {
    return paramInt1 & (paramInt2 ^ 0xFFFFFFFF);
  }
  
  public void a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield a : Z
    //   19: aload_0
    //   20: invokevirtual b : ()V
    //   23: goto -> 32
    //   26: astore_2
    //   27: aload_0
    //   28: aload_2
    //   29: invokevirtual a : (Ljava/lang/Exception;)V
    //   32: aload_0
    //   33: monitorexit
    //   34: return
    //   35: astore_2
    //   36: aload_0
    //   37: monitorexit
    //   38: aload_2
    //   39: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	35	finally
    //   14	19	35	finally
    //   19	23	26	java/lang/Exception
    //   19	23	35	finally
    //   27	32	35	finally
  }
  
  public void a(float paramFloat) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: fload_1
    //   16: invokevirtual b : (F)V
    //   19: goto -> 28
    //   22: astore_3
    //   23: aload_0
    //   24: aload_3
    //   25: invokevirtual a : (Ljava/lang/Exception;)V
    //   28: aload_0
    //   29: monitorexit
    //   30: return
    //   31: astore_3
    //   32: aload_0
    //   33: monitorexit
    //   34: aload_3
    //   35: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	31	finally
    //   14	19	22	java/lang/Exception
    //   14	19	31	finally
    //   23	28	31	finally
  }
  
  protected void a(Exception paramException) {
    a.c(getClass(), "unhandled exception", paramException);
  }
  
  public void a(T paramT, int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: istore_3
    //   7: iload_3
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iload_2
    //   16: invokestatic a : (I)Z
    //   19: putfield a : Z
    //   22: aload_0
    //   23: aload_1
    //   24: iload_2
    //   25: invokevirtual b : (Ljava/lang/Object;I)V
    //   28: goto -> 37
    //   31: astore_1
    //   32: aload_0
    //   33: aload_1
    //   34: invokevirtual a : (Ljava/lang/Exception;)V
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: astore_1
    //   41: aload_0
    //   42: monitorexit
    //   43: aload_1
    //   44: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	40	finally
    //   14	22	40	finally
    //   22	28	31	java/lang/Exception
    //   22	28	40	finally
    //   32	37	40	finally
  }
  
  public void a(Throwable paramThrowable) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifeq -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: iconst_1
    //   16: putfield a : Z
    //   19: aload_0
    //   20: aload_1
    //   21: invokevirtual b : (Ljava/lang/Throwable;)V
    //   24: goto -> 33
    //   27: astore_1
    //   28: aload_0
    //   29: aload_1
    //   30: invokevirtual a : (Ljava/lang/Exception;)V
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
    //   2	7	36	finally
    //   14	19	36	finally
    //   19	24	27	java/lang/Exception
    //   19	24	36	finally
    //   28	33	36	finally
  }
  
  protected abstract void b();
  
  protected abstract void b(float paramFloat);
  
  protected abstract void b(T paramT, int paramInt);
  
  protected abstract void b(Throwable paramThrowable);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */