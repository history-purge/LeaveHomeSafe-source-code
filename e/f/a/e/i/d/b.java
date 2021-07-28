package e.f.a.e.i.d;

import android.annotation.TargetApi;
import android.content.Context;
import android.os.Build;
import android.os.UserManager;

public class b {
  private static volatile UserManager a;
  
  private static volatile boolean b = a() ^ true;
  
  private static boolean a() {
    return (Build.VERSION.SDK_INT >= 24);
  }
  
  public static boolean a(Context paramContext) {
    return (a() && !b(paramContext));
  }
  
  @TargetApi(24)
  private static boolean b(Context paramContext) {
    // Byte code:
    //   0: getstatic e/f/a/e/i/d/b.b : Z
    //   3: istore_2
    //   4: iload_2
    //   5: istore_1
    //   6: iload_2
    //   7: ifne -> 99
    //   10: getstatic e/f/a/e/i/d/b.a : Landroid/os/UserManager;
    //   13: astore #4
    //   15: aload #4
    //   17: astore_3
    //   18: aload #4
    //   20: ifnonnull -> 78
    //   23: ldc e/f/a/e/i/d/b
    //   25: monitorenter
    //   26: getstatic e/f/a/e/i/d/b.a : Landroid/os/UserManager;
    //   29: astore #4
    //   31: aload #4
    //   33: astore_3
    //   34: aload #4
    //   36: ifnonnull -> 66
    //   39: aload_0
    //   40: ldc android/os/UserManager
    //   42: invokevirtual getSystemService : (Ljava/lang/Class;)Ljava/lang/Object;
    //   45: checkcast android/os/UserManager
    //   48: astore_3
    //   49: aload_3
    //   50: putstatic e/f/a/e/i/d/b.a : Landroid/os/UserManager;
    //   53: aload_3
    //   54: ifnonnull -> 101
    //   57: iconst_1
    //   58: putstatic e/f/a/e/i/d/b.b : Z
    //   61: ldc e/f/a/e/i/d/b
    //   63: monitorexit
    //   64: iconst_1
    //   65: ireturn
    //   66: ldc e/f/a/e/i/d/b
    //   68: monitorexit
    //   69: goto -> 78
    //   72: astore_0
    //   73: ldc e/f/a/e/i/d/b
    //   75: monitorexit
    //   76: aload_0
    //   77: athrow
    //   78: aload_3
    //   79: invokevirtual isUserUnlocked : ()Z
    //   82: istore_2
    //   83: iload_2
    //   84: putstatic e/f/a/e/i/d/b.b : Z
    //   87: iload_2
    //   88: istore_1
    //   89: iload_2
    //   90: ifeq -> 99
    //   93: aconst_null
    //   94: putstatic e/f/a/e/i/d/b.a : Landroid/os/UserManager;
    //   97: iload_2
    //   98: istore_1
    //   99: iload_1
    //   100: ireturn
    //   101: goto -> 66
    // Exception table:
    //   from	to	target	type
    //   26	31	72	finally
    //   39	53	72	finally
    //   57	64	72	finally
    //   66	69	72	finally
    //   73	76	72	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/i/d/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */