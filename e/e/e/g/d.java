package e.e.e.g;

public class d implements c {
  private static d a;
  
  public static d a() {
    // Byte code:
    //   0: ldc e/e/e/g/d
    //   2: monitorenter
    //   3: getstatic e/e/e/g/d.a : Le/e/e/g/d;
    //   6: ifnonnull -> 19
    //   9: new e/e/e/g/d
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/e/e/g/d.a : Le/e/e/g/d;
    //   19: getstatic e/e/e/g/d.a : Le/e/e/g/d;
    //   22: astore_0
    //   23: ldc e/e/e/g/d
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/e/e/g/d
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
  
  public void a(b paramb) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/e/g/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */