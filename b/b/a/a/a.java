package b.b.a.a;

import java.util.concurrent.Executor;

public class a extends c {
  private static volatile a c;
  
  private c a = this.b;
  
  private c b = new b();
  
  static {
    new a();
    new b();
  }
  
  public static a b() {
    // Byte code:
    //   0: getstatic b/b/a/a/a.c : Lb/b/a/a/a;
    //   3: ifnull -> 10
    //   6: getstatic b/b/a/a/a.c : Lb/b/a/a/a;
    //   9: areturn
    //   10: ldc b/b/a/a/a
    //   12: monitorenter
    //   13: getstatic b/b/a/a/a.c : Lb/b/a/a/a;
    //   16: ifnonnull -> 29
    //   19: new b/b/a/a/a
    //   22: dup
    //   23: invokespecial <init> : ()V
    //   26: putstatic b/b/a/a/a.c : Lb/b/a/a/a;
    //   29: ldc b/b/a/a/a
    //   31: monitorexit
    //   32: getstatic b/b/a/a/a.c : Lb/b/a/a/a;
    //   35: areturn
    //   36: astore_0
    //   37: ldc b/b/a/a/a
    //   39: monitorexit
    //   40: aload_0
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   13	29	36	finally
    //   29	32	36	finally
    //   37	40	36	finally
  }
  
  public void a(Runnable paramRunnable) {
    this.a.a(paramRunnable);
  }
  
  public boolean a() {
    return this.a.a();
  }
  
  public void b(Runnable paramRunnable) {
    this.a.b(paramRunnable);
  }
  
  static final class a implements Executor {
    public void execute(Runnable param1Runnable) {
      a.b().b(param1Runnable);
    }
  }
  
  static final class b implements Executor {
    public void execute(Runnable param1Runnable) {
      a.b().a(param1Runnable);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/b/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */