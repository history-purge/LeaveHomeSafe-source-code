package e.f.a.e.d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.util.Log;
import e.f.a.e.e.n.b;

public final class v {
  private final Context a;
  
  private int b;
  
  private int c = 0;
  
  public v(Context paramContext) {
    this.a = paramContext;
  }
  
  private final PackageInfo a(String paramString) {
    try {
      return b.a(this.a).b(paramString, 0);
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      String str = String.valueOf(nameNotFoundException);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 23);
      stringBuilder.append("Failed to find package ");
      stringBuilder.append(str);
      Log.w("Metadata", stringBuilder.toString());
      return null;
    } 
  }
  
  public final int a() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield c : I
    //   6: ifeq -> 18
    //   9: aload_0
    //   10: getfield c : I
    //   13: istore_1
    //   14: aload_0
    //   15: monitorexit
    //   16: iload_1
    //   17: ireturn
    //   18: aload_0
    //   19: getfield a : Landroid/content/Context;
    //   22: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   25: astore_2
    //   26: aload_0
    //   27: getfield a : Landroid/content/Context;
    //   30: invokestatic a : (Landroid/content/Context;)Le/f/a/e/e/n/a;
    //   33: ldc 'com.google.android.c2dm.permission.SEND'
    //   35: ldc 'com.google.android.gms'
    //   37: invokevirtual a : (Ljava/lang/String;Ljava/lang/String;)I
    //   40: iconst_m1
    //   41: if_icmpne -> 56
    //   44: ldc 'Metadata'
    //   46: ldc 'Google Play services missing or without correct permission.'
    //   48: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   51: pop
    //   52: aload_0
    //   53: monitorexit
    //   54: iconst_0
    //   55: ireturn
    //   56: invokestatic h : ()Z
    //   59: ifne -> 113
    //   62: new android/content/Intent
    //   65: dup
    //   66: ldc 'com.google.android.c2dm.intent.REGISTER'
    //   68: invokespecial <init> : (Ljava/lang/String;)V
    //   71: astore_3
    //   72: aload_3
    //   73: ldc 'com.google.android.gms'
    //   75: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   78: pop
    //   79: aload_2
    //   80: aload_3
    //   81: iconst_0
    //   82: invokevirtual queryIntentServices : (Landroid/content/Intent;I)Ljava/util/List;
    //   85: astore_3
    //   86: aload_3
    //   87: ifnull -> 113
    //   90: aload_3
    //   91: invokeinterface size : ()I
    //   96: ifle -> 113
    //   99: aload_0
    //   100: iconst_1
    //   101: putfield c : I
    //   104: aload_0
    //   105: getfield c : I
    //   108: istore_1
    //   109: aload_0
    //   110: monitorexit
    //   111: iload_1
    //   112: ireturn
    //   113: new android/content/Intent
    //   116: dup
    //   117: ldc 'com.google.iid.TOKEN_REQUEST'
    //   119: invokespecial <init> : (Ljava/lang/String;)V
    //   122: astore_3
    //   123: aload_3
    //   124: ldc 'com.google.android.gms'
    //   126: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   129: pop
    //   130: aload_2
    //   131: aload_3
    //   132: iconst_0
    //   133: invokevirtual queryBroadcastReceivers : (Landroid/content/Intent;I)Ljava/util/List;
    //   136: astore_2
    //   137: aload_2
    //   138: ifnull -> 164
    //   141: aload_2
    //   142: invokeinterface size : ()I
    //   147: ifle -> 164
    //   150: aload_0
    //   151: iconst_2
    //   152: putfield c : I
    //   155: aload_0
    //   156: getfield c : I
    //   159: istore_1
    //   160: aload_0
    //   161: monitorexit
    //   162: iload_1
    //   163: ireturn
    //   164: ldc 'Metadata'
    //   166: ldc 'Failed to resolve IID implementation package, falling back'
    //   168: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   171: pop
    //   172: invokestatic h : ()Z
    //   175: ifeq -> 186
    //   178: aload_0
    //   179: iconst_2
    //   180: putfield c : I
    //   183: goto -> 191
    //   186: aload_0
    //   187: iconst_1
    //   188: putfield c : I
    //   191: aload_0
    //   192: getfield c : I
    //   195: istore_1
    //   196: aload_0
    //   197: monitorexit
    //   198: iload_1
    //   199: ireturn
    //   200: astore_2
    //   201: aload_0
    //   202: monitorexit
    //   203: aload_2
    //   204: athrow
    // Exception table:
    //   from	to	target	type
    //   2	14	200	finally
    //   18	52	200	finally
    //   56	86	200	finally
    //   90	109	200	finally
    //   113	137	200	finally
    //   141	160	200	finally
    //   164	183	200	finally
    //   186	191	200	finally
    //   191	196	200	finally
  }
  
  public final int b() {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield b : I
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
    //   25: putfield b : I
    //   28: aload_0
    //   29: getfield b : I
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
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/d/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */