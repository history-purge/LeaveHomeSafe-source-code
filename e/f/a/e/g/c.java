package e.f.a.e.g;

public final class c {
  private static c b;
  
  private final b a = new b();
  
  static {
    // Byte code:
    //   0: new e/f/a/e/g/c
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_0
    //   8: ldc e/f/a/e/g/c
    //   10: monitorenter
    //   11: aload_0
    //   12: putstatic e/f/a/e/g/c.b : Le/f/a/e/g/c;
    //   15: ldc e/f/a/e/g/c
    //   17: monitorexit
    //   18: return
    //   19: astore_0
    //   20: ldc e/f/a/e/g/c
    //   22: monitorexit
    //   23: aload_0
    //   24: athrow
    // Exception table:
    //   from	to	target	type
    //   11	18	19	finally
    //   20	23	19	finally
  }
  
  private c() {
    new e();
  }
  
  public static b a() {
    return (b()).a;
  }
  
  private static c b() {
    // Byte code:
    //   0: ldc e/f/a/e/g/c
    //   2: monitorenter
    //   3: getstatic e/f/a/e/g/c.b : Le/f/a/e/g/c;
    //   6: astore_0
    //   7: ldc e/f/a/e/g/c
    //   9: monitorexit
    //   10: aload_0
    //   11: areturn
    //   12: astore_0
    //   13: ldc e/f/a/e/g/c
    //   15: monitorexit
    //   16: aload_0
    //   17: athrow
    // Exception table:
    //   from	to	target	type
    //   3	10	12	finally
    //   13	16	12	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/g/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */