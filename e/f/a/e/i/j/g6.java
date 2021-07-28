package e.f.a.e.i.j;

public final class g6 {
  private static g6 a;
  
  public static g6 a() {
    // Byte code:
    //   0: ldc e/f/a/e/i/j/g6
    //   2: monitorenter
    //   3: getstatic e/f/a/e/i/j/g6.a : Le/f/a/e/i/j/g6;
    //   6: ifnonnull -> 19
    //   9: new e/f/a/e/i/j/g6
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/f/a/e/i/j/g6.a : Le/f/a/e/i/j/g6;
    //   19: getstatic e/f/a/e/i/j/g6.a : Le/f/a/e/i/j/g6;
    //   22: astore_0
    //   23: ldc e/f/a/e/i/j/g6
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/f/a/e/i/j/g6
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/j/g6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */