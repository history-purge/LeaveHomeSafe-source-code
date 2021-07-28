package e.e.e.a;

public class c implements b {
  private static c a;
  
  public static c a() {
    // Byte code:
    //   0: ldc e/e/e/a/c
    //   2: monitorenter
    //   3: getstatic e/e/e/a/c.a : Le/e/e/a/c;
    //   6: ifnonnull -> 19
    //   9: new e/e/e/a/c
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/e/e/a/c.a : Le/e/e/a/c;
    //   19: getstatic e/e/e/a/c.a : Le/e/e/a/c;
    //   22: astore_0
    //   23: ldc e/e/e/a/c
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/e/e/a/c
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
  
  public void a(a parama) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */