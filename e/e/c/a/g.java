package e.e.c.a;

public class g implements a {
  private static g a;
  
  public static g a() {
    // Byte code:
    //   0: ldc e/e/c/a/g
    //   2: monitorenter
    //   3: getstatic e/e/c/a/g.a : Le/e/c/a/g;
    //   6: ifnonnull -> 19
    //   9: new e/e/c/a/g
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/e/c/a/g.a : Le/e/c/a/g;
    //   19: getstatic e/e/c/a/g.a : Le/e/c/a/g;
    //   22: astore_0
    //   23: ldc e/e/c/a/g
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/e/c/a/g
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
  
  public void a(a.a parama, Class<?> paramClass, String paramString, Throwable paramThrowable) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/c/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */