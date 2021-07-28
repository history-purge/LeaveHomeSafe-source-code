package e.e.l.p;

public class b {
  private static volatile d a = null;
  
  public static void a() {
    b().a();
  }
  
  public static void a(String paramString) {
    b().a(paramString);
  }
  
  private static d b() {
    // Byte code:
    //   0: getstatic e/e/l/p/b.a : Le/e/l/p/b$d;
    //   3: ifnonnull -> 37
    //   6: ldc e/e/l/p/b
    //   8: monitorenter
    //   9: getstatic e/e/l/p/b.a : Le/e/l/p/b$d;
    //   12: ifnonnull -> 25
    //   15: new e/e/l/p/a
    //   18: dup
    //   19: invokespecial <init> : ()V
    //   22: putstatic e/e/l/p/b.a : Le/e/l/p/b$d;
    //   25: ldc e/e/l/p/b
    //   27: monitorexit
    //   28: goto -> 37
    //   31: astore_0
    //   32: ldc e/e/l/p/b
    //   34: monitorexit
    //   35: aload_0
    //   36: athrow
    //   37: getstatic e/e/l/p/b.a : Le/e/l/p/b$d;
    //   40: areturn
    // Exception table:
    //   from	to	target	type
    //   9	25	31	finally
    //   25	28	31	finally
    //   32	35	31	finally
  }
  
  public static boolean c() {
    return b().b();
  }
  
  static {
    new c(null);
  }
  
  public static interface b {}
  
  private static final class c implements b {
    private c() {}
  }
  
  public static interface d {
    void a();
    
    void a(String param1String);
    
    boolean b();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/p/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */