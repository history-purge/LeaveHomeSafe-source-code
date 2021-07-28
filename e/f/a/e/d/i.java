package e.f.a.e.d;

import android.content.Context;
import android.os.Bundle;
import e.f.a.e.m.l;
import java.util.concurrent.ScheduledExecutorService;

public final class i {
  private static i e;
  
  private final Context a;
  
  private final ScheduledExecutorService b;
  
  private j c = new j(this, null);
  
  private int d = 1;
  
  private i(Context paramContext, ScheduledExecutorService paramScheduledExecutorService) {
    this.b = paramScheduledExecutorService;
    this.a = paramContext.getApplicationContext();
  }
  
  private final int a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : I
    //   6: istore_1
    //   7: aload_0
    //   8: iload_1
    //   9: iconst_1
    //   10: iadd
    //   11: putfield d : I
    //   14: aload_0
    //   15: monitorexit
    //   16: iload_1
    //   17: ireturn
    //   18: astore_2
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_2
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	18	finally
  }
  
  public static i a(Context paramContext) {
    // Byte code:
    //   0: ldc e/f/a/e/d/i
    //   2: monitorenter
    //   3: getstatic e/f/a/e/d/i.e : Le/f/a/e/d/i;
    //   6: ifnonnull -> 41
    //   9: new e/f/a/e/d/i
    //   12: dup
    //   13: aload_0
    //   14: invokestatic a : ()Le/f/a/e/i/e/b;
    //   17: iconst_1
    //   18: new com/google/android/gms/common/util/p/a
    //   21: dup
    //   22: ldc 'MessengerIpcClient'
    //   24: invokespecial <init> : (Ljava/lang/String;)V
    //   27: getstatic e/f/a/e/i/e/f.b : I
    //   30: invokeinterface a : (ILjava/util/concurrent/ThreadFactory;I)Ljava/util/concurrent/ScheduledExecutorService;
    //   35: invokespecial <init> : (Landroid/content/Context;Ljava/util/concurrent/ScheduledExecutorService;)V
    //   38: putstatic e/f/a/e/d/i.e : Le/f/a/e/d/i;
    //   41: getstatic e/f/a/e/d/i.e : Le/f/a/e/d/i;
    //   44: astore_0
    //   45: ldc e/f/a/e/d/i
    //   47: monitorexit
    //   48: aload_0
    //   49: areturn
    //   50: astore_0
    //   51: ldc e/f/a/e/d/i
    //   53: monitorexit
    //   54: aload_0
    //   55: athrow
    // Exception table:
    //   from	to	target	type
    //   3	41	50	finally
    //   41	45	50	finally
  }
  
  private final <T> l<T> a(u<T> paramu) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: ldc 'MessengerIpcClient'
    //   4: iconst_3
    //   5: invokestatic isLoggable : (Ljava/lang/String;I)Z
    //   8: ifeq -> 57
    //   11: aload_1
    //   12: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   15: astore_2
    //   16: new java/lang/StringBuilder
    //   19: dup
    //   20: aload_2
    //   21: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   24: invokevirtual length : ()I
    //   27: bipush #9
    //   29: iadd
    //   30: invokespecial <init> : (I)V
    //   33: astore_3
    //   34: aload_3
    //   35: ldc 'Queueing '
    //   37: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   40: pop
    //   41: aload_3
    //   42: aload_2
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: ldc 'MessengerIpcClient'
    //   49: aload_3
    //   50: invokevirtual toString : ()Ljava/lang/String;
    //   53: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   56: pop
    //   57: aload_0
    //   58: getfield c : Le/f/a/e/d/j;
    //   61: aload_1
    //   62: invokevirtual a : (Le/f/a/e/d/u;)Z
    //   65: ifne -> 90
    //   68: aload_0
    //   69: new e/f/a/e/d/j
    //   72: dup
    //   73: aload_0
    //   74: aconst_null
    //   75: invokespecial <init> : (Le/f/a/e/d/i;Le/f/a/e/d/k;)V
    //   78: putfield c : Le/f/a/e/d/j;
    //   81: aload_0
    //   82: getfield c : Le/f/a/e/d/j;
    //   85: aload_1
    //   86: invokevirtual a : (Le/f/a/e/d/u;)Z
    //   89: pop
    //   90: aload_1
    //   91: getfield b : Le/f/a/e/m/m;
    //   94: invokevirtual a : ()Le/f/a/e/m/l;
    //   97: astore_1
    //   98: aload_0
    //   99: monitorexit
    //   100: aload_1
    //   101: areturn
    //   102: astore_1
    //   103: aload_0
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    // Exception table:
    //   from	to	target	type
    //   2	57	102	finally
    //   57	90	102	finally
    //   90	98	102	finally
  }
  
  public final l<Void> a(int paramInt, Bundle paramBundle) {
    return a(new r(a(), 2, paramBundle));
  }
  
  public final l<Bundle> b(int paramInt, Bundle paramBundle) {
    return a(new w(a(), 1, paramBundle));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */