package e.e.a.a.a;

import e.e.f.b;
import e.e.f.k.b;
import e.e.f.k.c;

public class a extends b {
  private static a b;
  
  private a() {
    super((b)new c(), new b());
  }
  
  public static a a() {
    // Byte code:
    //   0: ldc e/e/a/a/a/a
    //   2: monitorenter
    //   3: getstatic e/e/a/a/a/a.b : Le/e/a/a/a/a;
    //   6: ifnonnull -> 19
    //   9: new e/e/a/a/a/a
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/e/a/a/a/a.b : Le/e/a/a/a/a;
    //   19: getstatic e/e/a/a/a/a.b : Le/e/a/a/a/a;
    //   22: astore_0
    //   23: ldc e/e/a/a/a/a
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/e/a/a/a/a
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */