package e.f.a.e.i.k;

public final class b8 {
  private static b8 a;
  
  public static b8 a() {
    // Byte code:
    //   0: ldc e/f/a/e/i/k/b8
    //   2: monitorenter
    //   3: getstatic e/f/a/e/i/k/b8.a : Le/f/a/e/i/k/b8;
    //   6: ifnonnull -> 19
    //   9: new e/f/a/e/i/k/b8
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/f/a/e/i/k/b8.a : Le/f/a/e/i/k/b8;
    //   19: getstatic e/f/a/e/i/k/b8.a : Le/f/a/e/i/k/b8;
    //   22: astore_0
    //   23: ldc e/f/a/e/i/k/b8
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/f/a/e/i/k/b8
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/k/b8.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */