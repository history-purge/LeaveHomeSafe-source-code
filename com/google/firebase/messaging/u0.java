package com.google.firebase.messaging;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

final class u0 {
  private static WeakReference<u0> d;
  
  private final SharedPreferences a;
  
  private q0 b;
  
  private final Executor c;
  
  private u0(SharedPreferences paramSharedPreferences, Executor paramExecutor) {
    this.c = paramExecutor;
    this.a = paramSharedPreferences;
  }
  
  public static u0 a(Context paramContext, Executor paramExecutor) {
    // Byte code:
    //   0: ldc com/google/firebase/messaging/u0
    //   2: monitorenter
    //   3: getstatic com/google/firebase/messaging/u0.d : Ljava/lang/ref/WeakReference;
    //   6: ifnull -> 73
    //   9: getstatic com/google/firebase/messaging/u0.d : Ljava/lang/ref/WeakReference;
    //   12: invokevirtual get : ()Ljava/lang/Object;
    //   15: checkcast com/google/firebase/messaging/u0
    //   18: astore_2
    //   19: goto -> 22
    //   22: aload_2
    //   23: ifnonnull -> 62
    //   26: new com/google/firebase/messaging/u0
    //   29: dup
    //   30: aload_0
    //   31: ldc 'com.google.android.gms.appid'
    //   33: iconst_0
    //   34: invokevirtual getSharedPreferences : (Ljava/lang/String;I)Landroid/content/SharedPreferences;
    //   37: aload_1
    //   38: invokespecial <init> : (Landroid/content/SharedPreferences;Ljava/util/concurrent/Executor;)V
    //   41: astore_0
    //   42: aload_0
    //   43: invokespecial b : ()V
    //   46: new java/lang/ref/WeakReference
    //   49: dup
    //   50: aload_0
    //   51: invokespecial <init> : (Ljava/lang/Object;)V
    //   54: putstatic com/google/firebase/messaging/u0.d : Ljava/lang/ref/WeakReference;
    //   57: ldc com/google/firebase/messaging/u0
    //   59: monitorexit
    //   60: aload_0
    //   61: areturn
    //   62: ldc com/google/firebase/messaging/u0
    //   64: monitorexit
    //   65: aload_2
    //   66: areturn
    //   67: astore_0
    //   68: ldc com/google/firebase/messaging/u0
    //   70: monitorexit
    //   71: aload_0
    //   72: athrow
    //   73: aconst_null
    //   74: astore_2
    //   75: goto -> 22
    // Exception table:
    //   from	to	target	type
    //   3	19	67	finally
    //   26	57	67	finally
  }
  
  private void b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield a : Landroid/content/SharedPreferences;
    //   7: ldc 'topic_operation_queue'
    //   9: ldc ','
    //   11: aload_0
    //   12: getfield c : Ljava/util/concurrent/Executor;
    //   15: invokestatic a : (Landroid/content/SharedPreferences;Ljava/lang/String;Ljava/lang/String;Ljava/util/concurrent/Executor;)Lcom/google/firebase/messaging/q0;
    //   18: putfield b : Lcom/google/firebase/messaging/q0;
    //   21: aload_0
    //   22: monitorexit
    //   23: return
    //   24: astore_1
    //   25: aload_0
    //   26: monitorexit
    //   27: aload_1
    //   28: athrow
    // Exception table:
    //   from	to	target	type
    //   2	21	24	finally
  }
  
  t0 a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/google/firebase/messaging/q0;
    //   6: invokevirtual b : ()Ljava/lang/String;
    //   9: invokestatic a : (Ljava/lang/String;)Lcom/google/firebase/messaging/t0;
    //   12: astore_1
    //   13: aload_0
    //   14: monitorexit
    //   15: aload_1
    //   16: areturn
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	17	finally
  }
  
  boolean a(t0 paramt0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/google/firebase/messaging/q0;
    //   6: aload_1
    //   7: invokevirtual c : ()Ljava/lang/String;
    //   10: invokevirtual a : (Ljava/lang/String;)Z
    //   13: istore_2
    //   14: aload_0
    //   15: monitorexit
    //   16: iload_2
    //   17: ireturn
    //   18: astore_1
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_1
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	18	finally
  }
  
  boolean b(t0 paramt0) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Lcom/google/firebase/messaging/q0;
    //   6: aload_1
    //   7: invokevirtual c : ()Ljava/lang/String;
    //   10: invokevirtual a : (Ljava/lang/Object;)Z
    //   13: istore_2
    //   14: aload_0
    //   15: monitorexit
    //   16: iload_2
    //   17: ireturn
    //   18: astore_1
    //   19: aload_0
    //   20: monitorexit
    //   21: aload_1
    //   22: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	18	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/u0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */