package e.f.a.e.e.l;

import androidx.annotation.RecentlyNonNull;
import java.util.concurrent.ScheduledExecutorService;

@Deprecated
public class a {
  private static a a;
  
  @Deprecated
  @RecentlyNonNull
  public static a a() {
    // Byte code:
    //   0: ldc e/f/a/e/e/l/a
    //   2: monitorenter
    //   3: getstatic e/f/a/e/e/l/a.a : Le/f/a/e/e/l/a$a;
    //   6: ifnonnull -> 19
    //   9: new e/f/a/e/e/l/b
    //   12: dup
    //   13: invokespecial <init> : ()V
    //   16: putstatic e/f/a/e/e/l/a.a : Le/f/a/e/e/l/a$a;
    //   19: getstatic e/f/a/e/e/l/a.a : Le/f/a/e/e/l/a$a;
    //   22: astore_0
    //   23: ldc e/f/a/e/e/l/a
    //   25: monitorexit
    //   26: aload_0
    //   27: areturn
    //   28: astore_0
    //   29: ldc e/f/a/e/e/l/a
    //   31: monitorexit
    //   32: aload_0
    //   33: athrow
    // Exception table:
    //   from	to	target	type
    //   3	19	28	finally
    //   19	23	28	finally
  }
  
  public static interface a {
    @Deprecated
    @RecentlyNonNull
    ScheduledExecutorService a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */