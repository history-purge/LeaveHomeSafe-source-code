package com.facebook.react.bridge;

import android.os.Handler;
import android.os.Looper;

public class UiThreadUtil {
  private static Handler sMainHandler;
  
  public static void assertNotOnUiThread() {
    SoftAssertions.assertCondition(isOnUiThread() ^ true, "Expected not to run on UI thread!");
  }
  
  public static void assertOnUiThread() {
    SoftAssertions.assertCondition(isOnUiThread(), "Expected to run on UI thread!");
  }
  
  public static boolean isOnUiThread() {
    return (Looper.getMainLooper().getThread() == Thread.currentThread());
  }
  
  public static void runOnUiThread(Runnable paramRunnable) {
    runOnUiThread(paramRunnable, 0L);
  }
  
  public static void runOnUiThread(Runnable paramRunnable, long paramLong) {
    // Byte code:
    //   0: ldc com/facebook/react/bridge/UiThreadUtil
    //   2: monitorenter
    //   3: getstatic com/facebook/react/bridge/UiThreadUtil.sMainHandler : Landroid/os/Handler;
    //   6: ifnonnull -> 22
    //   9: new android/os/Handler
    //   12: dup
    //   13: invokestatic getMainLooper : ()Landroid/os/Looper;
    //   16: invokespecial <init> : (Landroid/os/Looper;)V
    //   19: putstatic com/facebook/react/bridge/UiThreadUtil.sMainHandler : Landroid/os/Handler;
    //   22: ldc com/facebook/react/bridge/UiThreadUtil
    //   24: monitorexit
    //   25: getstatic com/facebook/react/bridge/UiThreadUtil.sMainHandler : Landroid/os/Handler;
    //   28: aload_0
    //   29: lload_1
    //   30: invokevirtual postDelayed : (Ljava/lang/Runnable;J)Z
    //   33: pop
    //   34: return
    //   35: astore_0
    //   36: ldc com/facebook/react/bridge/UiThreadUtil
    //   38: monitorexit
    //   39: aload_0
    //   40: athrow
    // Exception table:
    //   from	to	target	type
    //   3	22	35	finally
    //   22	25	35	finally
    //   36	39	35	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/UiThreadUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */