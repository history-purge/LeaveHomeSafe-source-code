package com.google.firebase.o;

import android.content.Context;
import android.content.SharedPreferences;
import java.text.SimpleDateFormat;
import java.util.Date;

class g {
  private static g b;
  
  private static final SimpleDateFormat c = new SimpleDateFormat("dd/MM/yyyy z");
  
  private final SharedPreferences a;
  
  private g(Context paramContext) {
    this.a = paramContext.getSharedPreferences("FirebaseAppHeartBeat", 0);
    paramContext.getSharedPreferences("FirebaseAppHeartBeatStorage", 0);
  }
  
  static g a(Context paramContext) {
    // Byte code:
    //   0: ldc com/google/firebase/o/g
    //   2: monitorenter
    //   3: getstatic com/google/firebase/o/g.b : Lcom/google/firebase/o/g;
    //   6: ifnonnull -> 20
    //   9: new com/google/firebase/o/g
    //   12: dup
    //   13: aload_0
    //   14: invokespecial <init> : (Landroid/content/Context;)V
    //   17: putstatic com/google/firebase/o/g.b : Lcom/google/firebase/o/g;
    //   20: getstatic com/google/firebase/o/g.b : Lcom/google/firebase/o/g;
    //   23: astore_0
    //   24: ldc com/google/firebase/o/g
    //   26: monitorexit
    //   27: aload_0
    //   28: areturn
    //   29: astore_0
    //   30: ldc com/google/firebase/o/g
    //   32: monitorexit
    //   33: aload_0
    //   34: athrow
    // Exception table:
    //   from	to	target	type
    //   3	20	29	finally
    //   20	24	29	finally
  }
  
  static boolean a(long paramLong1, long paramLong2) {
    Date date1 = new Date(paramLong1);
    Date date2 = new Date(paramLong2);
    return c.format(date1).equals(c.format(date2)) ^ true;
  }
  
  boolean a(long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: ldc 'fire-global'
    //   5: lload_1
    //   6: invokevirtual a : (Ljava/lang/String;J)Z
    //   9: istore_3
    //   10: aload_0
    //   11: monitorexit
    //   12: iload_3
    //   13: ireturn
    //   14: astore #4
    //   16: aload_0
    //   17: monitorexit
    //   18: aload #4
    //   20: athrow
    // Exception table:
    //   from	to	target	type
    //   2	10	14	finally
  }
  
  boolean a(String paramString, long paramLong) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield a : Landroid/content/SharedPreferences;
    //   6: aload_1
    //   7: invokeinterface contains : (Ljava/lang/String;)Z
    //   12: ifeq -> 64
    //   15: aload_0
    //   16: getfield a : Landroid/content/SharedPreferences;
    //   19: aload_1
    //   20: ldc2_w -1
    //   23: invokeinterface getLong : (Ljava/lang/String;J)J
    //   28: lload_2
    //   29: invokestatic a : (JJ)Z
    //   32: ifeq -> 60
    //   35: aload_0
    //   36: getfield a : Landroid/content/SharedPreferences;
    //   39: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   44: aload_1
    //   45: lload_2
    //   46: invokeinterface putLong : (Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    //   51: invokeinterface apply : ()V
    //   56: aload_0
    //   57: monitorexit
    //   58: iconst_1
    //   59: ireturn
    //   60: aload_0
    //   61: monitorexit
    //   62: iconst_0
    //   63: ireturn
    //   64: aload_0
    //   65: getfield a : Landroid/content/SharedPreferences;
    //   68: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   73: aload_1
    //   74: lload_2
    //   75: invokeinterface putLong : (Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;
    //   80: invokeinterface apply : ()V
    //   85: aload_0
    //   86: monitorexit
    //   87: iconst_1
    //   88: ireturn
    //   89: astore_1
    //   90: aload_0
    //   91: monitorexit
    //   92: aload_1
    //   93: athrow
    // Exception table:
    //   from	to	target	type
    //   2	56	89	finally
    //   64	85	89	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/o/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */