package h.a.a;

import android.content.ComponentName;
import android.content.Context;
import android.util.Log;
import java.util.LinkedList;
import java.util.List;
import me.leolin.shortcutbadger.impl.AdwHomeBadger;
import me.leolin.shortcutbadger.impl.ApexHomeBadger;
import me.leolin.shortcutbadger.impl.DefaultBadger;
import me.leolin.shortcutbadger.impl.NewHtcHomeBadger;
import me.leolin.shortcutbadger.impl.NovaHomeBadger;
import me.leolin.shortcutbadger.impl.SonyHomeBadger;
import me.leolin.shortcutbadger.impl.a;
import me.leolin.shortcutbadger.impl.b;
import me.leolin.shortcutbadger.impl.d;
import me.leolin.shortcutbadger.impl.e;
import me.leolin.shortcutbadger.impl.f;
import me.leolin.shortcutbadger.impl.g;
import me.leolin.shortcutbadger.impl.h;

public final class c {
  private static final List<Class<? extends a>> a = new LinkedList<Class<? extends a>>();
  
  private static a b;
  
  private static ComponentName c;
  
  static {
    a.add(AdwHomeBadger.class);
    a.add(ApexHomeBadger.class);
    a.add(DefaultBadger.class);
    a.add(NewHtcHomeBadger.class);
    a.add(NovaHomeBadger.class);
    a.add(SonyHomeBadger.class);
    a.add(a.class);
    a.add(me.leolin.shortcutbadger.impl.c.class);
    a.add(d.class);
    a.add(e.class);
    a.add(h.class);
    a.add(f.class);
    a.add(g.class);
    a.add(b.class);
  }
  
  private static boolean a(Context paramContext) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   4: aload_0
    //   5: invokevirtual getPackageName : ()Ljava/lang/String;
    //   8: invokevirtual getLaunchIntentForPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   11: astore_1
    //   12: aload_1
    //   13: ifnonnull -> 52
    //   16: new java/lang/StringBuilder
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore_1
    //   24: aload_1
    //   25: ldc 'Unable to find launch intent for package '
    //   27: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   30: pop
    //   31: aload_1
    //   32: aload_0
    //   33: invokevirtual getPackageName : ()Ljava/lang/String;
    //   36: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: pop
    //   40: ldc 'ShortcutBadger'
    //   42: aload_1
    //   43: invokevirtual toString : ()Ljava/lang/String;
    //   46: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   49: pop
    //   50: iconst_0
    //   51: ireturn
    //   52: aload_1
    //   53: invokevirtual getComponent : ()Landroid/content/ComponentName;
    //   56: putstatic h/a/a/c.c : Landroid/content/ComponentName;
    //   59: new android/content/Intent
    //   62: dup
    //   63: ldc 'android.intent.action.MAIN'
    //   65: invokespecial <init> : (Ljava/lang/String;)V
    //   68: astore_1
    //   69: aload_1
    //   70: ldc 'android.intent.category.HOME'
    //   72: invokevirtual addCategory : (Ljava/lang/String;)Landroid/content/Intent;
    //   75: pop
    //   76: aload_0
    //   77: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   80: aload_1
    //   81: ldc 65536
    //   83: invokevirtual queryIntentActivities : (Landroid/content/Intent;I)Ljava/util/List;
    //   86: invokeinterface iterator : ()Ljava/util/Iterator;
    //   91: astore_1
    //   92: aload_1
    //   93: invokeinterface hasNext : ()Z
    //   98: ifeq -> 187
    //   101: aload_1
    //   102: invokeinterface next : ()Ljava/lang/Object;
    //   107: checkcast android/content/pm/ResolveInfo
    //   110: getfield activityInfo : Landroid/content/pm/ActivityInfo;
    //   113: getfield packageName : Ljava/lang/String;
    //   116: astore_2
    //   117: getstatic h/a/a/c.a : Ljava/util/List;
    //   120: invokeinterface iterator : ()Ljava/util/Iterator;
    //   125: astore_3
    //   126: aload_3
    //   127: invokeinterface hasNext : ()Z
    //   132: ifeq -> 181
    //   135: aload_3
    //   136: invokeinterface next : ()Ljava/lang/Object;
    //   141: checkcast java/lang/Class
    //   144: astore_0
    //   145: aload_0
    //   146: invokevirtual newInstance : ()Ljava/lang/Object;
    //   149: checkcast h/a/a/a
    //   152: astore_0
    //   153: goto -> 158
    //   156: aconst_null
    //   157: astore_0
    //   158: aload_0
    //   159: ifnull -> 126
    //   162: aload_0
    //   163: invokeinterface a : ()Ljava/util/List;
    //   168: aload_2
    //   169: invokeinterface contains : (Ljava/lang/Object;)Z
    //   174: ifeq -> 126
    //   177: aload_0
    //   178: putstatic h/a/a/c.b : Lh/a/a/a;
    //   181: getstatic h/a/a/c.b : Lh/a/a/a;
    //   184: ifnull -> 92
    //   187: getstatic h/a/a/c.b : Lh/a/a/a;
    //   190: ifnonnull -> 296
    //   193: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   196: ldc 'ZUK'
    //   198: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   201: ifeq -> 219
    //   204: new me/leolin/shortcutbadger/impl/h
    //   207: dup
    //   208: invokespecial <init> : ()V
    //   211: astore_0
    //   212: aload_0
    //   213: putstatic h/a/a/c.b : Lh/a/a/a;
    //   216: goto -> 296
    //   219: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   222: ldc 'OPPO'
    //   224: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   227: ifeq -> 241
    //   230: new me/leolin/shortcutbadger/impl/d
    //   233: dup
    //   234: invokespecial <init> : ()V
    //   237: astore_0
    //   238: goto -> 212
    //   241: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   244: ldc 'VIVO'
    //   246: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   249: ifeq -> 263
    //   252: new me/leolin/shortcutbadger/impl/f
    //   255: dup
    //   256: invokespecial <init> : ()V
    //   259: astore_0
    //   260: goto -> 212
    //   263: getstatic android/os/Build.MANUFACTURER : Ljava/lang/String;
    //   266: ldc 'ZTE'
    //   268: invokevirtual equalsIgnoreCase : (Ljava/lang/String;)Z
    //   271: ifeq -> 285
    //   274: new me/leolin/shortcutbadger/impl/g
    //   277: dup
    //   278: invokespecial <init> : ()V
    //   281: astore_0
    //   282: goto -> 212
    //   285: new me/leolin/shortcutbadger/impl/DefaultBadger
    //   288: dup
    //   289: invokespecial <init> : ()V
    //   292: astore_0
    //   293: goto -> 212
    //   296: iconst_1
    //   297: ireturn
    //   298: astore_0
    //   299: goto -> 156
    // Exception table:
    //   from	to	target	type
    //   145	153	298	java/lang/Exception
  }
  
  public static boolean a(Context paramContext, int paramInt) {
    try {
      b(paramContext, paramInt);
      return true;
    } catch (b b) {
      if (Log.isLoggable("ShortcutBadger", 3))
        Log.d("ShortcutBadger", "Unable to execute badge", b); 
      return false;
    } 
  }
  
  public static void b(Context paramContext, int paramInt) {
    if (b != null || a(paramContext))
      try {
        b.a(paramContext, c, paramInt);
        return;
      } catch (Exception exception) {
        throw new b("Unable to execute badge", exception);
      }  
    throw new b("No default launcher available");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/h/a/a/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */