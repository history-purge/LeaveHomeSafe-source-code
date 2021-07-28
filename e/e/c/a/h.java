package e.e.c.a;

public class h implements c {
  private static h a;
  
  public static h b() {
    // Byte code:
    //   0: ldc e/e/c/a/h
    //   2: monitorenter
    //   3: getstatic e/e/c/a/h.a : Le/e/c/a/h;
    //   6: ifnonnull -> 19
    //   9: new e/e/c/a/h
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/e/c/a/h.a : Le/e/c/a/h;
    //   19: getstatic e/e/c/a/h.a : Le/e/c/a/h;
    //   22: astore_0
    //   23: ldc e/e/c/a/h
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/e/c/a/h
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
  
  public void a() {}
  
  public void a(b paramb) {}
  
  public void b(b paramb) {}
  
  public void c(b paramb) {}
  
  public void d(b paramb) {}
  
  public void e(b paramb) {}
  
  public void f(b paramb) {}
  
  public void g(b paramb) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/c/a/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */