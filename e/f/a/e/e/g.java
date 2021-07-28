package e.f.a.e.e;

import android.annotation.TargetApi;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.UserManager;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.util.h;
import com.google.android.gms.common.util.k;
import e.f.a.e.e.n.b;
import java.util.concurrent.atomic.AtomicBoolean;

public class g {
  @Deprecated
  @RecentlyNonNull
  public static final int a = 12451000;
  
  private static boolean b = false;
  
  private static boolean c = false;
  
  static final AtomicBoolean d = new AtomicBoolean();
  
  private static final AtomicBoolean e = new AtomicBoolean();
  
  @Deprecated
  @RecentlyNonNull
  public static int a(@RecentlyNonNull Context paramContext, @RecentlyNonNull int paramInt) {
    StringBuilder stringBuilder;
    boolean bool;
    try {
      paramContext.getResources().getString(i.common_google_play_services_unknown_issue);
    } finally {
      Exception exception = null;
    } 
    if (!h.c((Context)stringBuilder) && !h.d((Context)stringBuilder)) {
      bool = true;
    } else {
      bool = false;
    } 
    return a((Context)stringBuilder, bool, paramInt);
  }
  
  private static int a(Context paramContext, boolean paramBoolean, int paramInt) {
    // Byte code:
    //   0: iload_2
    //   1: iflt -> 10
    //   4: iconst_1
    //   5: istore #4
    //   7: goto -> 13
    //   10: iconst_0
    //   11: istore #4
    //   13: iload #4
    //   15: invokestatic a : (Z)V
    //   18: aload_0
    //   19: invokevirtual getPackageName : ()Ljava/lang/String;
    //   22: astore #6
    //   24: aload_0
    //   25: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   28: astore #7
    //   30: aconst_null
    //   31: astore #5
    //   33: iload_1
    //   34: ifeq -> 77
    //   37: aload #7
    //   39: ldc 'com.android.vending'
    //   41: sipush #8256
    //   44: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   47: astore #5
    //   49: goto -> 77
    //   52: aload #6
    //   54: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   57: astore_0
    //   58: ldc ' requires the Google Play Store, but it is missing.'
    //   60: astore #5
    //   62: ldc 'GooglePlayServicesUtil'
    //   64: aload_0
    //   65: aload #5
    //   67: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   70: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   73: pop
    //   74: bipush #9
    //   76: ireturn
    //   77: aload #7
    //   79: ldc 'com.google.android.gms'
    //   81: bipush #64
    //   83: invokevirtual getPackageInfo : (Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   86: astore #8
    //   88: aload_0
    //   89: invokestatic a : (Landroid/content/Context;)Le/f/a/e/e/h;
    //   92: pop
    //   93: aload #8
    //   95: iconst_1
    //   96: invokestatic a : (Landroid/content/pm/PackageInfo;Z)Z
    //   99: ifne -> 115
    //   102: aload #6
    //   104: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   107: astore_0
    //   108: ldc ' requires Google Play services, but their signature is invalid.'
    //   110: astore #5
    //   112: goto -> 62
    //   115: iload_1
    //   116: ifeq -> 170
    //   119: aload #5
    //   121: invokestatic a : (Ljava/lang/Object;)Ljava/lang/Object;
    //   124: pop
    //   125: aload #5
    //   127: checkcast android/content/pm/PackageInfo
    //   130: iconst_1
    //   131: invokestatic a : (Landroid/content/pm/PackageInfo;Z)Z
    //   134: ifeq -> 157
    //   137: aload #5
    //   139: getfield signatures : [Landroid/content/pm/Signature;
    //   142: iconst_0
    //   143: aaload
    //   144: aload #8
    //   146: getfield signatures : [Landroid/content/pm/Signature;
    //   149: iconst_0
    //   150: aaload
    //   151: invokevirtual equals : (Ljava/lang/Object;)Z
    //   154: ifne -> 170
    //   157: aload #6
    //   159: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   162: astore_0
    //   163: ldc ' requires Google Play Store, but its signature is invalid.'
    //   165: astore #5
    //   167: goto -> 62
    //   170: aload #8
    //   172: getfield versionCode : I
    //   175: invokestatic a : (I)I
    //   178: iload_2
    //   179: invokestatic a : (I)I
    //   182: if_icmpge -> 262
    //   185: aload #8
    //   187: getfield versionCode : I
    //   190: istore_3
    //   191: new java/lang/StringBuilder
    //   194: dup
    //   195: aload #6
    //   197: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   200: invokevirtual length : ()I
    //   203: bipush #82
    //   205: iadd
    //   206: invokespecial <init> : (I)V
    //   209: astore_0
    //   210: aload_0
    //   211: ldc 'Google Play services out of date for '
    //   213: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   216: pop
    //   217: aload_0
    //   218: aload #6
    //   220: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   223: pop
    //   224: aload_0
    //   225: ldc '.  Requires '
    //   227: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   230: pop
    //   231: aload_0
    //   232: iload_2
    //   233: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   236: pop
    //   237: aload_0
    //   238: ldc ' but found '
    //   240: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   243: pop
    //   244: aload_0
    //   245: iload_3
    //   246: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   249: pop
    //   250: ldc 'GooglePlayServicesUtil'
    //   252: aload_0
    //   253: invokevirtual toString : ()Ljava/lang/String;
    //   256: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   259: pop
    //   260: iconst_2
    //   261: ireturn
    //   262: aload #8
    //   264: getfield applicationInfo : Landroid/content/pm/ApplicationInfo;
    //   267: astore #5
    //   269: aload #5
    //   271: astore_0
    //   272: aload #5
    //   274: ifnonnull -> 309
    //   277: aload #7
    //   279: ldc 'com.google.android.gms'
    //   281: iconst_0
    //   282: invokevirtual getApplicationInfo : (Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   285: astore_0
    //   286: goto -> 309
    //   289: astore_0
    //   290: ldc 'GooglePlayServicesUtil'
    //   292: aload #6
    //   294: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   297: ldc ' requires Google Play services, but they're missing when getting application info.'
    //   299: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   302: aload_0
    //   303: invokestatic wtf : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   306: pop
    //   307: iconst_1
    //   308: ireturn
    //   309: aload_0
    //   310: getfield enabled : Z
    //   313: ifne -> 318
    //   316: iconst_3
    //   317: ireturn
    //   318: iconst_0
    //   319: ireturn
    //   320: ldc 'GooglePlayServicesUtil'
    //   322: aload #6
    //   324: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   327: ldc ' requires Google Play services, but they are missing.'
    //   329: invokevirtual concat : (Ljava/lang/String;)Ljava/lang/String;
    //   332: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   335: pop
    //   336: iconst_1
    //   337: ireturn
    //   338: astore_0
    //   339: goto -> 52
    //   342: astore_0
    //   343: goto -> 320
    // Exception table:
    //   from	to	target	type
    //   37	49	338	android/content/pm/PackageManager$NameNotFoundException
    //   77	88	342	android/content/pm/PackageManager$NameNotFoundException
    //   277	286	289	android/content/pm/PackageManager$NameNotFoundException
  }
  
  @RecentlyNullable
  public static Resources a(@RecentlyNonNull Context paramContext) {
    try {
      return paramContext.getPackageManager().getResourcesForApplication("com.google.android.gms");
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return null;
    } 
  }
  
  @Deprecated
  public static String a(@RecentlyNonNull int paramInt) {
    return a.b(paramInt);
  }
  
  @TargetApi(21)
  static boolean a(Context paramContext, String paramString) {
    // Byte code:
    //   0: aload_1
    //   1: ldc 'com.google.android.gms'
    //   3: invokevirtual equals : (Ljava/lang/Object;)Z
    //   6: istore_2
    //   7: invokestatic f : ()Z
    //   10: ifeq -> 61
    //   13: aload_0
    //   14: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   17: invokevirtual getPackageInstaller : ()Landroid/content/pm/PackageInstaller;
    //   20: invokevirtual getAllSessions : ()Ljava/util/List;
    //   23: astore_3
    //   24: aload_3
    //   25: invokeinterface iterator : ()Ljava/util/Iterator;
    //   30: astore_3
    //   31: aload_3
    //   32: invokeinterface hasNext : ()Z
    //   37: ifeq -> 61
    //   40: aload_1
    //   41: aload_3
    //   42: invokeinterface next : ()Ljava/lang/Object;
    //   47: checkcast android/content/pm/PackageInstaller$SessionInfo
    //   50: invokevirtual getAppPackageName : ()Ljava/lang/String;
    //   53: invokevirtual equals : (Ljava/lang/Object;)Z
    //   56: ifeq -> 31
    //   59: iconst_1
    //   60: ireturn
    //   61: aload_0
    //   62: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   65: astore_3
    //   66: aload_3
    //   67: aload_1
    //   68: sipush #8192
    //   71: invokevirtual getApplicationInfo : (Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   74: astore_1
    //   75: iload_2
    //   76: ifeq -> 84
    //   79: aload_1
    //   80: getfield enabled : Z
    //   83: ireturn
    //   84: aload_1
    //   85: getfield enabled : Z
    //   88: ifeq -> 102
    //   91: aload_0
    //   92: invokestatic c : (Landroid/content/Context;)Z
    //   95: istore_2
    //   96: iload_2
    //   97: ifne -> 102
    //   100: iconst_1
    //   101: ireturn
    //   102: iconst_0
    //   103: ireturn
    //   104: astore_0
    //   105: iconst_0
    //   106: ireturn
    //   107: astore_0
    //   108: iconst_0
    //   109: ireturn
    // Exception table:
    //   from	to	target	type
    //   13	24	104	java/lang/Exception
    //   66	75	107	android/content/pm/PackageManager$NameNotFoundException
    //   79	84	107	android/content/pm/PackageManager$NameNotFoundException
    //   84	96	107	android/content/pm/PackageManager$NameNotFoundException
  }
  
  @Deprecated
  @RecentlyNonNull
  public static boolean b(@RecentlyNonNull int paramInt) {
    return !(paramInt != 1 && paramInt != 2 && paramInt != 3 && paramInt != 9);
  }
  
  @RecentlyNonNull
  public static boolean b(@RecentlyNonNull Context paramContext) {
    if (!c) {
      try {
        PackageInfo packageInfo = b.a(paramContext).b("com.google.android.gms", 64);
        h.a(paramContext);
        if (packageInfo != null && !h.a(packageInfo, false) && h.a(packageInfo, true)) {
          b = true;
        } else {
          b = false;
        } 
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        Log.w("GooglePlayServicesUtil", "Cannot find Google Play services package name.", (Throwable)nameNotFoundException);
      } finally {}
      c = true;
    } 
    return !b ? (!h.a()) : true;
  }
  
  @Deprecated
  @RecentlyNonNull
  public static boolean b(@RecentlyNonNull Context paramContext, @RecentlyNonNull int paramInt) {
    return (paramInt == 18) ? true : ((paramInt == 1) ? a(paramContext, "com.google.android.gms") : false);
  }
  
  @TargetApi(18)
  @RecentlyNonNull
  public static boolean c(@RecentlyNonNull Context paramContext) {
    if (k.c()) {
      Object object = paramContext.getSystemService("user");
      q.a(object);
      Bundle bundle = ((UserManager)object).getApplicationRestrictions(paramContext.getPackageName());
      if (bundle != null && "true".equals(bundle.getString("restricted_profile")))
        return true; 
    } 
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/e/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */