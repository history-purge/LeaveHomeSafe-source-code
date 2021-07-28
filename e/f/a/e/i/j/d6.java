package e.f.a.e.i.j;

public final class d6 {
  private static c6 a;
  
  public static v5 a(String paramString) {
    // Byte code:
    //   0: ldc e/f/a/e/i/j/d6
    //   2: monitorenter
    //   3: getstatic e/f/a/e/i/j/d6.a : Le/f/a/e/i/j/c6;
    //   6: ifnonnull -> 20
    //   9: new e/f/a/e/i/j/c6
    //   12: dup
    //   13: aconst_null
    //   14: invokespecial <init> : (Le/f/a/e/i/j/b6;)V
    //   17: putstatic e/f/a/e/i/j/d6.a : Le/f/a/e/i/j/c6;
    //   20: getstatic e/f/a/e/i/j/d6.a : Le/f/a/e/i/j/c6;
    //   23: ldc 'vision-common'
    //   25: invokevirtual b : (Ljava/lang/Object;)Ljava/lang/Object;
    //   28: checkcast e/f/a/e/i/j/v5
    //   31: astore_0
    //   32: ldc e/f/a/e/i/j/d6
    //   34: monitorexit
    //   35: aload_0
    //   36: areturn
    //   37: astore_0
    //   38: ldc e/f/a/e/i/j/d6
    //   40: monitorexit
    //   41: aload_0
    //   42: athrow
    // Exception table:
    //   from	to	target	type
    //   3	20	37	finally
    //   20	32	37	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/j/d6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */