package com.google.firebase.iid;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import com.google.firebase.g;

public class n {
  private final Context a;
  
  private String b;
  
  private String c;
  
  private int d;
  
  private int e = 0;
  
  public n(Context paramContext) {
    this.a = paramContext;
  }
  
  private PackageInfo a(String paramString) {
    try {
      return this.a.getPackageManager().getPackageInfo(paramString, 0);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      String str = String.valueOf(nameNotFoundException);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
      stringBuilder.append("Failed to find package ");
      stringBuilder.append(str);
      Log.w("FirebaseInstanceId", stringBuilder.toString());
      return null;
    } 
  }
  
  public static String a(g paramg) {
    String str3 = paramg.d().e();
    if (str3 != null)
      return str3; 
    String str2 = paramg.d().b();
    if (!str2.startsWith("1:"))
      return str2; 
    String[] arrayOfString = str2.split(":");
    if (arrayOfString.length < 2)
      return null; 
    String str1 = arrayOfString[1];
    return str1.isEmpty() ? null : str1;
  }
  
  private void f() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: aload_0
    //   4: getfield a : Landroid/content/Context;
    //   7: invokevirtual getPackageName : ()Ljava/lang/String;
    //   10: invokespecial a : (Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    //   13: astore_1
    //   14: aload_1
    //   15: ifnull -> 40
    //   18: aload_0
    //   19: aload_1
    //   20: getfield versionCode : I
    //   23: invokestatic toString : (I)Ljava/lang/String;
    //   26: putfield b : Ljava/lang/String;
    //   29: aload_0
    //   30: aload_1
    //   31: getfield versionName : Ljava/lang/String;
    //   34: putfield c : Ljava/lang/String;
    //   37: aload_0
    //   38: monitorexit
    //   39: return
    //   40: aload_0
    //   41: monitorexit
    //   42: return
    //   43: astore_1
    //   44: aload_0
    //   45: monitorexit
    //   46: aload_1
    //   47: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	43	finally
    //   18	37	43	finally
  }
  
  public String a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : Ljava/lang/String;
    //   6: ifnonnull -> 13
    //   9: aload_0
    //   10: invokespecial f : ()V
    //   13: aload_0
    //   14: getfield b : Ljava/lang/String;
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: areturn
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	22	finally
    //   13	18	22	finally
  }
  
  public String b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : Ljava/lang/String;
    //   6: ifnonnull -> 13
    //   9: aload_0
    //   10: invokespecial f : ()V
    //   13: aload_0
    //   14: getfield c : Ljava/lang/String;
    //   17: astore_1
    //   18: aload_0
    //   19: monitorexit
    //   20: aload_1
    //   21: areturn
    //   22: astore_1
    //   23: aload_0
    //   24: monitorexit
    //   25: aload_1
    //   26: athrow
    // Exception table:
    //   from	to	target	type
    //   2	13	22	finally
    //   13	18	22	finally
  }
  
  public int c() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield d : I
    //   6: ifne -> 28
    //   9: aload_0
    //   10: ldc 'com.google.android.gms'
    //   12: invokespecial a : (Ljava/lang/String;)Landroid/content/pm/PackageInfo;
    //   15: astore_2
    //   16: aload_2
    //   17: ifnull -> 28
    //   20: aload_0
    //   21: aload_2
    //   22: getfield versionCode : I
    //   25: putfield d : I
    //   28: aload_0
    //   29: getfield d : I
    //   32: istore_1
    //   33: aload_0
    //   34: monitorexit
    //   35: iload_1
    //   36: ireturn
    //   37: astore_2
    //   38: aload_0
    //   39: monitorexit
    //   40: aload_2
    //   41: athrow
    // Exception table:
    //   from	to	target	type
    //   2	16	37	finally
    //   20	28	37	finally
    //   28	33	37	finally
  }
  
  public int d() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield e : I
    //   6: istore_1
    //   7: iload_1
    //   8: ifeq -> 15
    //   11: aload_0
    //   12: monitorexit
    //   13: iload_1
    //   14: ireturn
    //   15: aload_0
    //   16: getfield a : Landroid/content/Context;
    //   19: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   22: astore_2
    //   23: aload_2
    //   24: ldc 'com.google.android.c2dm.permission.SEND'
    //   26: ldc 'com.google.android.gms'
    //   28: invokevirtual checkPermission : (Ljava/lang/String;Ljava/lang/String;)I
    //   31: iconst_m1
    //   32: if_icmpne -> 47
    //   35: ldc 'FirebaseInstanceId'
    //   37: ldc 'Google Play services missing or without correct permission.'
    //   39: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   42: pop
    //   43: aload_0
    //   44: monitorexit
    //   45: iconst_0
    //   46: ireturn
    //   47: invokestatic h : ()Z
    //   50: ifne -> 102
    //   53: new android/content/Intent
    //   56: dup
    //   57: ldc 'com.google.android.c2dm.intent.REGISTER'
    //   59: invokespecial <init> : (Ljava/lang/String;)V
    //   62: astore_3
    //   63: aload_3
    //   64: ldc 'com.google.android.gms'
    //   66: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   69: pop
    //   70: aload_2
    //   71: aload_3
    //   72: iconst_0
    //   73: invokevirtual queryIntentServices : (Landroid/content/Intent;I)Ljava/util/List;
    //   76: astore_3
    //   77: aload_3
    //   78: ifnull -> 102
    //   81: aload_3
    //   82: invokeinterface size : ()I
    //   87: ifgt -> 93
    //   90: goto -> 102
    //   93: aload_0
    //   94: iconst_1
    //   95: putfield e : I
    //   98: aload_0
    //   99: monitorexit
    //   100: iconst_1
    //   101: ireturn
    //   102: new android/content/Intent
    //   105: dup
    //   106: ldc 'com.google.iid.TOKEN_REQUEST'
    //   108: invokespecial <init> : (Ljava/lang/String;)V
    //   111: astore_3
    //   112: aload_3
    //   113: ldc 'com.google.android.gms'
    //   115: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   118: pop
    //   119: aload_2
    //   120: aload_3
    //   121: iconst_0
    //   122: invokevirtual queryBroadcastReceivers : (Landroid/content/Intent;I)Ljava/util/List;
    //   125: astore_2
    //   126: iconst_2
    //   127: istore_1
    //   128: aload_2
    //   129: ifnull -> 153
    //   132: aload_2
    //   133: invokeinterface size : ()I
    //   138: ifgt -> 144
    //   141: goto -> 153
    //   144: aload_0
    //   145: iconst_2
    //   146: putfield e : I
    //   149: aload_0
    //   150: monitorexit
    //   151: iconst_2
    //   152: ireturn
    //   153: ldc 'FirebaseInstanceId'
    //   155: ldc 'Failed to resolve IID implementation package, falling back'
    //   157: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   160: pop
    //   161: invokestatic h : ()Z
    //   164: ifeq -> 175
    //   167: aload_0
    //   168: iconst_2
    //   169: putfield e : I
    //   172: goto -> 182
    //   175: aload_0
    //   176: iconst_1
    //   177: putfield e : I
    //   180: iconst_1
    //   181: istore_1
    //   182: aload_0
    //   183: monitorexit
    //   184: iload_1
    //   185: ireturn
    //   186: astore_2
    //   187: aload_0
    //   188: monitorexit
    //   189: aload_2
    //   190: athrow
    // Exception table:
    //   from	to	target	type
    //   2	7	186	finally
    //   15	43	186	finally
    //   47	77	186	finally
    //   81	90	186	finally
    //   93	98	186	finally
    //   102	126	186	finally
    //   132	141	186	finally
    //   144	149	186	finally
    //   153	172	186	finally
    //   175	180	186	finally
  }
  
  public boolean e() {
    return (d() != 0);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/iid/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */