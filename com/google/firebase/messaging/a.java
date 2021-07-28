package com.google.firebase.messaging;

import android.annotation.TargetApi;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import androidx.core.app.i;
import java.util.concurrent.atomic.AtomicInteger;

public final class a {
  private static final AtomicInteger a = new AtomicInteger((int)SystemClock.elapsedRealtime());
  
  private static int a() {
    return a.incrementAndGet();
  }
  
  private static int a(int paramInt) {
    return (Build.VERSION.SDK_INT >= 23) ? 1140850688 : 1073741824;
  }
  
  private static int a(PackageManager paramPackageManager, Resources paramResources, String paramString1, String paramString2, Bundle paramBundle) {
    // Byte code:
    //   0: aload_3
    //   1: invokestatic isEmpty : (Ljava/lang/CharSequence;)Z
    //   4: ifne -> 120
    //   7: aload_1
    //   8: aload_3
    //   9: ldc 'drawable'
    //   11: aload_2
    //   12: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   15: istore #5
    //   17: iload #5
    //   19: ifeq -> 37
    //   22: aload_1
    //   23: iload #5
    //   25: invokestatic a : (Landroid/content/res/Resources;I)Z
    //   28: ifne -> 34
    //   31: goto -> 37
    //   34: iload #5
    //   36: ireturn
    //   37: aload_1
    //   38: aload_3
    //   39: ldc 'mipmap'
    //   41: aload_2
    //   42: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   45: istore #5
    //   47: iload #5
    //   49: ifeq -> 67
    //   52: aload_1
    //   53: iload #5
    //   55: invokestatic a : (Landroid/content/res/Resources;I)Z
    //   58: ifne -> 64
    //   61: goto -> 67
    //   64: iload #5
    //   66: ireturn
    //   67: new java/lang/StringBuilder
    //   70: dup
    //   71: aload_3
    //   72: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   75: invokevirtual length : ()I
    //   78: bipush #61
    //   80: iadd
    //   81: invokespecial <init> : (I)V
    //   84: astore #7
    //   86: aload #7
    //   88: ldc 'Icon resource '
    //   90: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   93: pop
    //   94: aload #7
    //   96: aload_3
    //   97: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   100: pop
    //   101: aload #7
    //   103: ldc ' not found. Notification will use default icon.'
    //   105: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   108: pop
    //   109: ldc 'FirebaseMessaging'
    //   111: aload #7
    //   113: invokevirtual toString : ()Ljava/lang/String;
    //   116: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   119: pop
    //   120: aload #4
    //   122: ldc 'com.google.firebase.messaging.default_notification_icon'
    //   124: iconst_0
    //   125: invokevirtual getInt : (Ljava/lang/String;I)I
    //   128: istore #6
    //   130: iload #6
    //   132: ifeq -> 148
    //   135: iload #6
    //   137: istore #5
    //   139: aload_1
    //   140: iload #6
    //   142: invokestatic a : (Landroid/content/res/Resources;I)Z
    //   145: ifne -> 213
    //   148: aload_0
    //   149: aload_2
    //   150: iconst_0
    //   151: invokevirtual getApplicationInfo : (Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
    //   154: getfield icon : I
    //   157: istore #5
    //   159: goto -> 213
    //   162: astore_0
    //   163: aload_0
    //   164: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   167: astore_0
    //   168: new java/lang/StringBuilder
    //   171: dup
    //   172: aload_0
    //   173: invokestatic valueOf : (Ljava/lang/Object;)Ljava/lang/String;
    //   176: invokevirtual length : ()I
    //   179: bipush #35
    //   181: iadd
    //   182: invokespecial <init> : (I)V
    //   185: astore_2
    //   186: aload_2
    //   187: ldc 'Couldn't get own application info: '
    //   189: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   192: pop
    //   193: aload_2
    //   194: aload_0
    //   195: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   198: pop
    //   199: ldc 'FirebaseMessaging'
    //   201: aload_2
    //   202: invokevirtual toString : ()Ljava/lang/String;
    //   205: invokestatic w : (Ljava/lang/String;Ljava/lang/String;)I
    //   208: pop
    //   209: iload #6
    //   211: istore #5
    //   213: ldc 17301651
    //   215: istore #6
    //   217: iload #5
    //   219: ifeq -> 238
    //   222: aload_1
    //   223: iload #5
    //   225: invokestatic a : (Landroid/content/res/Resources;I)Z
    //   228: ifne -> 234
    //   231: ldc 17301651
    //   233: ireturn
    //   234: iload #5
    //   236: istore #6
    //   238: iload #6
    //   240: ireturn
    // Exception table:
    //   from	to	target	type
    //   148	159	162	android/content/pm/PackageManager$NameNotFoundException
  }
  
  private static int a(i0 parami0) {
    throw new RuntimeException("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  private static PendingIntent a(Context paramContext, Intent paramIntent) {
    return PendingIntent.getBroadcast(paramContext, a(), (new Intent("com.google.firebase.MESSAGING_EVENT")).setComponent(new ComponentName(paramContext, "com.google.firebase.iid.FirebaseInstanceIdReceiver")).putExtra("wrapped_intent", (Parcelable)paramIntent), a(1073741824));
  }
  
  private static PendingIntent a(Context paramContext, i0 parami0) {
    return !c(parami0) ? null : a(paramContext, (new Intent("com.google.firebase.messaging.NOTIFICATION_DISMISS")).putExtras(parami0.i()));
  }
  
  private static PendingIntent a(Context paramContext, i0 parami0, String paramString, PackageManager paramPackageManager) {
    Intent intent = a(paramString, parami0, paramPackageManager);
    if (intent == null)
      return null; 
    intent.addFlags(67108864);
    intent.putExtras(parami0.j());
    if (c(parami0))
      intent.putExtra("gcm.n.analytics_data", parami0.i()); 
    return PendingIntent.getActivity(paramContext, a(), intent, a(1073741824));
  }
  
  private static Intent a(String paramString, i0 parami0, PackageManager paramPackageManager) {
    Intent intent2;
    Intent intent3;
    String str = parami0.g("gcm.n.click_action");
    if (!TextUtils.isEmpty(str)) {
      intent2 = new Intent(str);
      intent2.setPackage(paramString);
      intent2.setFlags(268435456);
      return intent2;
    } 
    Uri uri = intent2.b();
    if (uri != null) {
      intent3 = new Intent("android.intent.action.VIEW");
      intent3.setPackage(paramString);
      intent3.setData(uri);
      return intent3;
    } 
    Intent intent1 = intent3.getLaunchIntentForPackage(paramString);
    if (intent1 == null)
      Log.w("FirebaseMessaging", "No activity found to launch app"); 
    return intent1;
  }
  
  private static Uri a(String paramString, i0 parami0, Resources paramResources) {
    String str = parami0.f();
    if (TextUtils.isEmpty(str))
      return null; 
    if (!"default".equals(str) && paramResources.getIdentifier(str, "raw", paramString) != 0) {
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 24 + String.valueOf(str).length());
      stringBuilder.append("android.resource://");
      stringBuilder.append(paramString);
      stringBuilder.append("/raw/");
      stringBuilder.append(str);
      return Uri.parse(stringBuilder.toString());
    } 
    return RingtoneManager.getDefaultUri(2);
  }
  
  private static Bundle a(PackageManager paramPackageManager, String paramString) {
    try {
      ApplicationInfo applicationInfo = paramPackageManager.getApplicationInfo(paramString, 128);
      if (applicationInfo != null && applicationInfo.metaData != null)
        return applicationInfo.metaData; 
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      String str = String.valueOf(nameNotFoundException);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 35);
      stringBuilder.append("Couldn't get own application info: ");
      stringBuilder.append(str);
      Log.w("FirebaseMessaging", stringBuilder.toString());
    } 
    return Bundle.EMPTY;
  }
  
  public static a a(Context paramContext, String paramString1, i0 parami0, String paramString2, Resources paramResources, PackageManager paramPackageManager, Bundle paramBundle) {
    i.e e = new i.e(paramContext, paramString2);
    String str2 = parami0.b(paramResources, paramString1, "gcm.n.title");
    if (!TextUtils.isEmpty(str2))
      e.b(str2); 
    str2 = parami0.b(paramResources, paramString1, "gcm.n.body");
    if (!TextUtils.isEmpty(str2)) {
      e.a(str2);
      i.c c = new i.c();
      c.a(str2);
      e.a((i.f)c);
    } 
    e.e(a(paramPackageManager, paramResources, paramString1, parami0.g("gcm.n.icon"), paramBundle));
    Uri uri = a(paramString1, parami0, paramResources);
    if (uri != null)
      e.a(uri); 
    e.a(a(paramContext, parami0, paramString1, paramPackageManager));
    PendingIntent pendingIntent = a(paramContext, parami0);
    if (pendingIntent != null)
      e.b(pendingIntent); 
    Integer integer2 = a(paramContext, parami0.g("gcm.n.color"), paramBundle);
    if (integer2 != null)
      e.a(integer2.intValue()); 
    e.a(parami0.a("gcm.n.sticky") ^ true);
    e.c(parami0.a("gcm.n.local_only"));
    String str1 = parami0.g("gcm.n.ticker");
    if (str1 != null)
      e.d(str1); 
    Integer integer1 = parami0.e();
    if (integer1 != null)
      e.d(integer1.intValue()); 
    integer1 = parami0.h();
    if (integer1 != null)
      e.f(integer1.intValue()); 
    integer1 = parami0.d();
    if (integer1 != null)
      e.c(integer1.intValue()); 
    Long long_ = parami0.f("gcm.n.event_time");
    if (long_ != null) {
      e.f(true);
      e.b(long_.longValue());
    } 
    long[] arrayOfLong = parami0.g();
    if (arrayOfLong != null)
      e.a(arrayOfLong); 
    int[] arrayOfInt = parami0.a();
    if (arrayOfInt != null)
      e.a(arrayOfInt[0], arrayOfInt[1], arrayOfInt[2]); 
    e.b(a(parami0));
    return new a(e, b(parami0), 0);
  }
  
  private static Integer a(Context paramContext, String paramString, Bundle paramBundle) {
    if (Build.VERSION.SDK_INT < 21)
      return null; 
    if (!TextUtils.isEmpty(paramString))
      try {
        int j = Color.parseColor(paramString);
        return Integer.valueOf(j);
      } catch (IllegalArgumentException illegalArgumentException) {
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 56);
        stringBuilder.append("Color is invalid: ");
        stringBuilder.append(paramString);
        stringBuilder.append(". Notification will use default color.");
        Log.w("FirebaseMessaging", stringBuilder.toString());
      }  
    int i = paramBundle.getInt("com.google.firebase.messaging.default_notification_color", 0);
    if (i != 0)
      try {
        i = b.g.e.a.a(paramContext, i);
        return Integer.valueOf(i);
      } catch (android.content.res.Resources.NotFoundException notFoundException) {
        Log.w("FirebaseMessaging", "Cannot find the color resource referenced in AndroidManifest.");
      }  
    return null;
  }
  
  @TargetApi(26)
  private static boolean a(Resources paramResources, int paramInt) {
    if (Build.VERSION.SDK_INT != 26)
      return true; 
    try {
      if (paramResources.getDrawable(paramInt, null) instanceof android.graphics.drawable.AdaptiveIconDrawable) {
        StringBuilder stringBuilder = new StringBuilder(77);
        stringBuilder.append("Adaptive icons cannot be used in notifications. Ignoring icon id: ");
        stringBuilder.append(paramInt);
        Log.e("FirebaseMessaging", stringBuilder.toString());
        return false;
      } 
      return true;
    } catch (android.content.res.Resources.NotFoundException notFoundException) {
      StringBuilder stringBuilder = new StringBuilder(66);
      stringBuilder.append("Couldn't find resource ");
      stringBuilder.append(paramInt);
      stringBuilder.append(", treating it as an invalid icon");
      Log.e("FirebaseMessaging", stringBuilder.toString());
      return false;
    } 
  }
  
  static a b(Context paramContext, i0 parami0) {
    Bundle bundle = a(paramContext.getPackageManager(), paramContext.getPackageName());
    return a(paramContext, paramContext.getPackageName(), parami0, b(paramContext, parami0.c(), bundle), paramContext.getResources(), paramContext.getPackageManager(), bundle);
  }
  
  @TargetApi(26)
  public static String b(Context paramContext, String paramString, Bundle paramBundle) {
    if (Build.VERSION.SDK_INT < 26)
      return null; 
    try {
      int i = (paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 0)).targetSdkVersion;
      if (i >= 26) {
        NotificationManager notificationManager = (NotificationManager)paramContext.getSystemService(NotificationManager.class);
        if (!TextUtils.isEmpty(paramString)) {
          if (notificationManager.getNotificationChannel(paramString) != null)
            return paramString; 
          StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 122);
          stringBuilder.append("Notification Channel requested (");
          stringBuilder.append(paramString);
          stringBuilder.append(") has not been created by the app. Manifest configuration, or default, value will be used.");
          Log.w("FirebaseMessaging", stringBuilder.toString());
        } 
        paramString = paramBundle.getString("com.google.firebase.messaging.default_notification_channel_id");
        if (!TextUtils.isEmpty(paramString)) {
          if (notificationManager.getNotificationChannel(paramString) != null)
            return paramString; 
          paramString = "Notification Channel set in AndroidManifest.xml has not been created by the app. Default value will be used.";
        } else {
          paramString = "Missing Default Notification Channel metadata in AndroidManifest. Default value will be used.";
        } 
        Log.w("FirebaseMessaging", paramString);
        if (notificationManager.getNotificationChannel("fcm_fallback_notification_channel") == null) {
          String str;
          i = paramContext.getResources().getIdentifier("fcm_fallback_notification_channel_label", "string", paramContext.getPackageName());
          if (i == 0) {
            Log.e("FirebaseMessaging", "String resource \"fcm_fallback_notification_channel_label\" is not found. Using default string channel name.");
            str = "Misc";
          } else {
            str = str.getString(i);
          } 
          notificationManager.createNotificationChannel(new NotificationChannel("fcm_fallback_notification_channel", str, 3));
        } 
        return "fcm_fallback_notification_channel";
      } 
      return null;
    } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
      return null;
    } 
  }
  
  private static String b(i0 parami0) {
    String str = parami0.g("gcm.n.tag");
    if (!TextUtils.isEmpty(str))
      return str; 
    long l = SystemClock.uptimeMillis();
    StringBuilder stringBuilder = new StringBuilder(37);
    stringBuilder.append("FCM-Notification:");
    stringBuilder.append(l);
    return stringBuilder.toString();
  }
  
  static boolean c(i0 parami0) {
    return parami0.a("google.c.a.e");
  }
  
  public static class a {
    public final i.e a;
    
    public final String b;
    
    public final int c;
    
    a(i.e param1e, String param1String, int param1Int) {
      this.a = param1e;
      this.b = param1String;
      this.c = 0;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */