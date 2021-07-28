package e.f.a.e.e;

import android.content.Context;

final class q {
  private static Context a;
  
  static void a(Context paramContext) {
    // Byte code:
    //   0: ldc e/f/a/e/e/q
    //   2: monitorenter
    //   3: getstatic e/f/a/e/e/q.a : Landroid/content/Context;
    //   6: ifnonnull -> 24
    //   9: aload_0
    //   10: ifnull -> 32
    //   13: aload_0
    //   14: invokevirtual getApplicationContext : ()Landroid/content/Context;
    //   17: putstatic e/f/a/e/e/q.a : Landroid/content/Context;
    //   20: ldc e/f/a/e/e/q
    //   22: monitorexit
    //   23: return
    //   24: ldc 'GoogleCertificates'
    //   26: ldc 'GoogleCertificates has been initialized already'
    //   28: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   31: pop
    //   32: ldc e/f/a/e/e/q
    //   34: monitorexit
    //   35: return
    //   36: astore_0
    //   37: ldc e/f/a/e/e/q
    //   39: monitorexit
    //   40: aload_0
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   3	9	36	finally
    //   13	20	36	finally
    //   24	32	36	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */