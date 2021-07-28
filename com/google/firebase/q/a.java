package com.google.firebase.q;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.firebase.n.c;

public class a {
  private final Context a;
  
  private final SharedPreferences b;
  
  private final c c;
  
  private boolean d;
  
  public a(Context paramContext, String paramString, c paramc) {
    this.a = a(paramContext);
    paramContext = this.a;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("com.google.firebase.common.prefs:");
    stringBuilder.append(paramString);
    this.b = paramContext.getSharedPreferences(stringBuilder.toString(), 0);
    this.c = paramc;
    this.d = b();
  }
  
  private static Context a(Context paramContext) {
    return (Build.VERSION.SDK_INT < 24) ? paramContext : b.g.e.a.a(paramContext);
  }
  
  private void a(boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Z
    //   6: iload_1
    //   7: if_icmpeq -> 41
    //   10: aload_0
    //   11: iload_1
    //   12: putfield d : Z
    //   15: aload_0
    //   16: getfield c : Lcom/google/firebase/n/c;
    //   19: new com/google/firebase/n/a
    //   22: dup
    //   23: ldc com/google/firebase/f
    //   25: new com/google/firebase/f
    //   28: dup
    //   29: iload_1
    //   30: invokespecial <init> : (Z)V
    //   33: invokespecial <init> : (Ljava/lang/Class;Ljava/lang/Object;)V
    //   36: invokeinterface a : (Lcom/google/firebase/n/a;)V
    //   41: aload_0
    //   42: monitorexit
    //   43: return
    //   44: astore_2
    //   45: aload_0
    //   46: monitorexit
    //   47: aload_2
    //   48: athrow
    // Exception table:
    //   from	to	target	type
    //   2	41	44	finally
  }
  
  private boolean b() {
    return this.b.contains("firebase_data_collection_default_enabled") ? this.b.getBoolean("firebase_data_collection_default_enabled", true) : c();
  }
  
  private boolean c() {
    try {
      PackageManager packageManager = this.a.getPackageManager();
      if (packageManager != null) {
        ApplicationInfo applicationInfo = packageManager.getApplicationInfo(this.a.getPackageName(), 128);
        if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("firebase_data_collection_default_enabled"))
          return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled"); 
      } 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {}
    return true;
  }
  
  public void a(Boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_1
    //   3: ifnonnull -> 40
    //   6: aload_0
    //   7: getfield b : Landroid/content/SharedPreferences;
    //   10: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   15: ldc 'firebase_data_collection_default_enabled'
    //   17: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   22: invokeinterface apply : ()V
    //   27: aload_0
    //   28: invokespecial c : ()Z
    //   31: istore_2
    //   32: aload_0
    //   33: iload_2
    //   34: invokespecial a : (Z)V
    //   37: goto -> 73
    //   40: getstatic java/lang/Boolean.TRUE : Ljava/lang/Boolean;
    //   43: aload_1
    //   44: invokevirtual equals : (Ljava/lang/Object;)Z
    //   47: istore_2
    //   48: aload_0
    //   49: getfield b : Landroid/content/SharedPreferences;
    //   52: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   57: ldc 'firebase_data_collection_default_enabled'
    //   59: iload_2
    //   60: invokeinterface putBoolean : (Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;
    //   65: invokeinterface apply : ()V
    //   70: goto -> 32
    //   73: aload_0
    //   74: monitorexit
    //   75: return
    //   76: astore_1
    //   77: aload_0
    //   78: monitorexit
    //   79: goto -> 84
    //   82: aload_1
    //   83: athrow
    //   84: goto -> 82
    // Exception table:
    //   from	to	target	type
    //   6	32	76	finally
    //   32	37	76	finally
    //   40	70	76	finally
  }
  
  public boolean a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : Z
    //   6: istore_1
    //   7: aload_0
    //   8: monitorexit
    //   9: iload_1
    //   10: ireturn
    //   11: astore_2
    //   12: aload_0
    //   13: monitorexit
    //   14: aload_2
    //   15: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	11	finally
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/q/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */