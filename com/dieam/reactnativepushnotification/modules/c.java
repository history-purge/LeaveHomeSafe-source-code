package com.dieam.reactnativepushnotification.modules;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.Application;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import android.util.Log;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;

public class c {
  private Context a;
  
  private b b;
  
  private final SharedPreferences c;
  
  public c(Application paramApplication) {
    this.a = (Context)paramApplication;
    this.b = new b((Context)paramApplication);
    this.c = paramApplication.getSharedPreferences("rn_push_notification", 0);
  }
  
  private boolean a(NotificationManager paramNotificationManager, String paramString1, String paramString2, String paramString3, Uri paramUri, int paramInt, long[] paramArrayOflong) {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i < 26)
      return false; 
    if (paramNotificationManager == null)
      return false; 
    NotificationChannel notificationChannel = paramNotificationManager.getNotificationChannel(paramString1);
    String str = paramString2;
    if (paramString2 == null)
      str = this.b.b(paramString1); 
    paramString2 = paramString3;
    if (paramString3 == null)
      paramString2 = this.b.a(paramString1); 
    if (notificationChannel == null || !notificationChannel.getName().equals(str) || !notificationChannel.getDescription().equals(paramString2)) {
      NotificationChannel notificationChannel1 = new NotificationChannel(paramString1, str, paramInt);
      notificationChannel1.setDescription(paramString2);
      notificationChannel1.enableLights(true);
      if (paramArrayOflong != null)
        bool = true; 
      notificationChannel1.enableVibration(bool);
      notificationChannel1.setVibrationPattern(paramArrayOflong);
      if (paramUri != null) {
        notificationChannel1.setSound(paramUri, (new AudioAttributes.Builder()).setContentType(4).setUsage(5).build());
      } else {
        notificationChannel1.setSound(null, null);
      } 
      paramNotificationManager.createNotificationChannel(notificationChannel1);
      return true;
    } 
    return false;
  }
  
  private void d(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Cancelling notification: ");
    stringBuilder.append(paramString);
    Log.i("RNPushNotification", stringBuilder.toString());
    Bundle bundle = new Bundle();
    bundle.putString("id", paramString);
    PendingIntent pendingIntent = f(bundle);
    if (pendingIntent != null)
      i().cancel(pendingIntent); 
    if (this.c.contains(paramString)) {
      SharedPreferences.Editor editor = this.c.edit();
      editor.remove(paramString);
      editor.apply();
    } else {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Unable to find notification ");
      stringBuilder1.append(paramString);
      Log.w("RNPushNotification", stringBuilder1.toString());
    } 
    NotificationManager notificationManager = j();
    try {
      notificationManager.cancel(Integer.parseInt(paramString));
      return;
    } catch (Exception exception) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Unable to parse Notification ID ");
      stringBuilder1.append(paramString);
      Log.e("RNPushNotification", stringBuilder1.toString(), exception);
      return;
    } 
  }
  
  private Uri e(String paramString) {
    if (paramString == null || "default".equalsIgnoreCase(paramString))
      return RingtoneManager.getDefaultUri(2); 
    if (this.a.getResources().getIdentifier(paramString, "raw", this.a.getPackageName()) == 0)
      paramString = paramString.substring(0, paramString.lastIndexOf('.')); 
    int i = this.a.getResources().getIdentifier(paramString, "raw", this.a.getPackageName());
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("android.resource://");
    stringBuilder.append(this.a.getPackageName());
    stringBuilder.append("/");
    stringBuilder.append(i);
    return Uri.parse(stringBuilder.toString());
  }
  
  private void e(Bundle paramBundle) {
    String str = paramBundle.getString("repeatType");
    long l = (long)paramBundle.getDouble("repeatTime");
    if (str != null) {
      String str1;
      long l1 = (long)paramBundle.getDouble("fireDate");
      if (!Arrays.<String>asList(new String[] { "time", "month", "week", "day", "hour", "minute" }).contains(str)) {
        str1 = String.format("Invalid repeatType specified as %s", new Object[] { str });
      } else if ("time".equals(str) && l <= 0L) {
        str1 = "repeatType specified as time but no repeatTime has been mentioned";
      } else {
        int i = -1;
        switch (str.hashCode()) {
          case 104080000:
            if (str.equals("month"))
              i = 1; 
            break;
          case 3645428:
            if (str.equals("week"))
              i = 2; 
            break;
          case 3560141:
            if (str.equals("time"))
              i = 0; 
            break;
          case 3208676:
            if (str.equals("hour"))
              i = 4; 
            break;
          case 99228:
            if (str.equals("day"))
              i = 3; 
            break;
          case -1074026988:
            if (str.equals("minute"))
              i = 5; 
            break;
        } 
        if (i != 0) {
          if (i != 1) {
            if (i != 2) {
              if (i != 3) {
                if (i != 4) {
                  if (i != 5) {
                    l = 0L;
                  } else {
                    l = 60000L;
                    l += l1;
                  } 
                } else {
                  l = 3600000L;
                  l += l1;
                } 
              } else {
                l = 86400000L;
                l += l1;
              } 
            } else {
              l = 604800000L;
              l += l1;
            } 
          } else {
            byte b1;
            GregorianCalendar gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(new Date(l1));
            int j = gregorianCalendar.get(5);
            int k = gregorianCalendar.get(12);
            int m = gregorianCalendar.get(11);
            gregorianCalendar = new GregorianCalendar();
            gregorianCalendar.setTime(new Date());
            i = gregorianCalendar.get(2);
            if (i < 11) {
              i++;
            } else {
              i = 0;
            } 
            int n = gregorianCalendar.get(1);
            if (i == 0) {
              b1 = 1;
            } else {
              b1 = 0;
            } 
            gregorianCalendar.set(1, n + b1);
            gregorianCalendar.set(2, i);
            gregorianCalendar.set(5, Math.min(j, gregorianCalendar.getActualMaximum(5)));
            gregorianCalendar.set(11, m);
            gregorianCalendar.set(12, k);
            gregorianCalendar.set(13, 0);
            l = gregorianCalendar.getTimeInMillis();
          } 
        } else {
          l += l1;
        } 
        if (l != 0L) {
          Log.d("RNPushNotification", String.format("Repeating notification with id %s at time %s", new Object[] { str1.getString("id"), Long.toString(l) }));
          str1.putDouble("fireDate", l);
          b((Bundle)str1);
        } 
        return;
      } 
      Log.w("RNPushNotification", str1);
      return;
    } 
  }
  
  private PendingIntent f(Bundle paramBundle) {
    try {
      int i = Integer.parseInt(paramBundle.getString("id"));
      Intent intent = new Intent(this.a, RNPushNotificationPublisher.class);
      intent.putExtra("notificationId", i);
      intent.putExtras(paramBundle);
      return PendingIntent.getBroadcast(this.a, i, intent, 134217728);
    } catch (Exception exception) {
      Log.e("RNPushNotification", "Unable to parse Notification ID", exception);
      return null;
    } 
  }
  
  private AlarmManager i() {
    return (AlarmManager)this.a.getSystemService("alarm");
  }
  
  private NotificationManager j() {
    return (NotificationManager)this.a.getSystemService("notification");
  }
  
  public void a() {
    Log.i("RNPushNotification", "Cancelling all notifications");
    Iterator<String> iterator = this.c.getAll().keySet().iterator();
    while (iterator.hasNext())
      d(iterator.next()); 
  }
  
  public void a(Bundle paramBundle) {
    String str = this.a.getPackageName();
    str = this.a.getPackageManager().getLaunchIntentForPackage(str).getComponent().getClassName();
    try {
      Class<?> clazz = Class.forName(str);
      Intent intent = new Intent(this.a, clazz);
      if (paramBundle != null)
        intent.putExtra("notification", paramBundle); 
      intent.addFlags(268435456);
      this.a.startActivity(intent);
      return;
    } catch (Exception exception) {
      Log.e("RNPushNotification", "Class not found", exception);
      return;
    } 
  }
  
  public void a(Bundle paramBundle, Bitmap paramBitmap1, Bitmap paramBitmap2) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual e : ()Ljava/lang/Class;
    //   4: astore #19
    //   6: aload #19
    //   8: ifnonnull -> 21
    //   11: ldc 'RNPushNotification'
    //   13: ldc_w 'No activity class found for the notification'
    //   16: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   19: pop
    //   20: return
    //   21: aload_1
    //   22: ldc_w 'message'
    //   25: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   28: ifnonnull -> 64
    //   31: new java/lang/StringBuilder
    //   34: dup
    //   35: invokespecial <init> : ()V
    //   38: astore_2
    //   39: aload_2
    //   40: ldc_w 'Cannot send to notification centre because there is no 'message' field in: '
    //   43: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   46: pop
    //   47: aload_2
    //   48: aload_1
    //   49: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   52: pop
    //   53: ldc 'RNPushNotification'
    //   55: aload_2
    //   56: invokevirtual toString : ()Ljava/lang/String;
    //   59: invokestatic d : (Ljava/lang/String;Ljava/lang/String;)I
    //   62: pop
    //   63: return
    //   64: aload_1
    //   65: ldc 'id'
    //   67: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   70: astore #16
    //   72: aload #16
    //   74: ifnonnull -> 87
    //   77: ldc 'RNPushNotification'
    //   79: ldc_w 'No notification ID specified for the notification'
    //   82: invokestatic e : (Ljava/lang/String;Ljava/lang/String;)I
    //   85: pop
    //   86: return
    //   87: aload_0
    //   88: getfield a : Landroid/content/Context;
    //   91: invokevirtual getResources : ()Landroid/content/res/Resources;
    //   94: astore #15
    //   96: aload_0
    //   97: getfield a : Landroid/content/Context;
    //   100: invokevirtual getPackageName : ()Ljava/lang/String;
    //   103: astore #17
    //   105: aload_1
    //   106: ldc_w 'title'
    //   109: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   112: astore #12
    //   114: aload #12
    //   116: astore #13
    //   118: aload #12
    //   120: ifnonnull -> 151
    //   123: aload_0
    //   124: getfield a : Landroid/content/Context;
    //   127: invokevirtual getApplicationInfo : ()Landroid/content/pm/ApplicationInfo;
    //   130: astore #12
    //   132: aload_0
    //   133: getfield a : Landroid/content/Context;
    //   136: invokevirtual getPackageManager : ()Landroid/content/pm/PackageManager;
    //   139: aload #12
    //   141: invokevirtual getApplicationLabel : (Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
    //   144: invokeinterface toString : ()Ljava/lang/String;
    //   149: astore #13
    //   151: aload_1
    //   152: ldc_w 'priority'
    //   155: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   158: astore #12
    //   160: aload #12
    //   162: ifnull -> 2288
    //   165: aload #12
    //   167: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   170: astore #12
    //   172: aload #12
    //   174: invokevirtual hashCode : ()I
    //   177: lookupswitch default -> 2228, 107348 -> 295, 107876 -> 278, 108114 -> 261, 3202466 -> 244, 1544803905 -> 228
    //   228: aload #12
    //   230: ldc 'default'
    //   232: invokevirtual equals : (Ljava/lang/Object;)Z
    //   235: ifeq -> 2228
    //   238: iconst_4
    //   239: istore #4
    //   241: goto -> 2231
    //   244: aload #12
    //   246: ldc_w 'high'
    //   249: invokevirtual equals : (Ljava/lang/Object;)Z
    //   252: ifeq -> 2228
    //   255: iconst_1
    //   256: istore #4
    //   258: goto -> 2231
    //   261: aload #12
    //   263: ldc_w 'min'
    //   266: invokevirtual equals : (Ljava/lang/Object;)Z
    //   269: ifeq -> 2228
    //   272: iconst_3
    //   273: istore #4
    //   275: goto -> 2231
    //   278: aload #12
    //   280: ldc_w 'max'
    //   283: invokevirtual equals : (Ljava/lang/Object;)Z
    //   286: ifeq -> 2228
    //   289: iconst_0
    //   290: istore #4
    //   292: goto -> 2231
    //   295: aload #12
    //   297: ldc_w 'low'
    //   300: invokevirtual equals : (Ljava/lang/Object;)Z
    //   303: ifeq -> 2228
    //   306: iconst_2
    //   307: istore #4
    //   309: goto -> 2231
    //   312: getstatic android/os/Build$VERSION.SDK_INT : I
    //   315: istore #4
    //   317: iload #4
    //   319: bipush #24
    //   321: if_icmplt -> 2381
    //   324: aload_1
    //   325: ldc_w 'importance'
    //   328: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   331: astore #12
    //   333: aload #12
    //   335: ifnull -> 2381
    //   338: aload #12
    //   340: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   343: astore #12
    //   345: aload #12
    //   347: invokevirtual hashCode : ()I
    //   350: lookupswitch default -> 2294, -1626174665 -> 517, 107348 -> 500, 107876 -> 483, 108114 -> 466, 3202466 -> 449, 3387192 -> 432, 1544803905 -> 416
    //   416: aload #12
    //   418: ldc 'default'
    //   420: invokevirtual equals : (Ljava/lang/Object;)Z
    //   423: ifeq -> 2294
    //   426: iconst_0
    //   427: istore #4
    //   429: goto -> 2297
    //   432: aload #12
    //   434: ldc_w 'none'
    //   437: invokevirtual equals : (Ljava/lang/Object;)Z
    //   440: ifeq -> 2294
    //   443: iconst_5
    //   444: istore #4
    //   446: goto -> 2297
    //   449: aload #12
    //   451: ldc_w 'high'
    //   454: invokevirtual equals : (Ljava/lang/Object;)Z
    //   457: ifeq -> 2294
    //   460: iconst_2
    //   461: istore #4
    //   463: goto -> 2297
    //   466: aload #12
    //   468: ldc_w 'min'
    //   471: invokevirtual equals : (Ljava/lang/Object;)Z
    //   474: ifeq -> 2294
    //   477: iconst_4
    //   478: istore #4
    //   480: goto -> 2297
    //   483: aload #12
    //   485: ldc_w 'max'
    //   488: invokevirtual equals : (Ljava/lang/Object;)Z
    //   491: ifeq -> 2294
    //   494: iconst_1
    //   495: istore #4
    //   497: goto -> 2297
    //   500: aload #12
    //   502: ldc_w 'low'
    //   505: invokevirtual equals : (Ljava/lang/Object;)Z
    //   508: ifeq -> 2294
    //   511: iconst_3
    //   512: istore #4
    //   514: goto -> 2297
    //   517: aload #12
    //   519: ldc_w 'unspecified'
    //   522: invokevirtual equals : (Ljava/lang/Object;)Z
    //   525: ifeq -> 2294
    //   528: bipush #6
    //   530: istore #4
    //   532: goto -> 2297
    //   535: new java/lang/StringBuilder
    //   538: dup
    //   539: invokespecial <init> : ()V
    //   542: astore #12
    //   544: aload #12
    //   546: ldc_w 'rn-push-notification-channel-id'
    //   549: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   552: pop
    //   553: aload #12
    //   555: ldc_w '-'
    //   558: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   561: pop
    //   562: aload #12
    //   564: iload #4
    //   566: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   569: pop
    //   570: aload #12
    //   572: invokevirtual toString : ()Ljava/lang/String;
    //   575: astore #12
    //   577: aload_1
    //   578: ldc_w 'visibility'
    //   581: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   584: astore #14
    //   586: aload #14
    //   588: ifnull -> 2422
    //   591: aload #14
    //   593: invokevirtual toLowerCase : ()Ljava/lang/String;
    //   596: astore #14
    //   598: aload #14
    //   600: invokevirtual hashCode : ()I
    //   603: istore #6
    //   605: iload #6
    //   607: ldc_w -977423767
    //   610: if_icmpeq -> 666
    //   613: iload #6
    //   615: ldc_w -906277200
    //   618: if_icmpeq -> 649
    //   621: iload #6
    //   623: ldc_w -314497661
    //   626: if_icmpeq -> 632
    //   629: goto -> 2387
    //   632: aload #14
    //   634: ldc_w 'private'
    //   637: invokevirtual equals : (Ljava/lang/Object;)Z
    //   640: ifeq -> 2387
    //   643: iconst_0
    //   644: istore #6
    //   646: goto -> 2390
    //   649: aload #14
    //   651: ldc_w 'secret'
    //   654: invokevirtual equals : (Ljava/lang/Object;)Z
    //   657: ifeq -> 2387
    //   660: iconst_2
    //   661: istore #6
    //   663: goto -> 2390
    //   666: aload #14
    //   668: ldc_w 'public'
    //   671: invokevirtual equals : (Ljava/lang/Object;)Z
    //   674: ifeq -> 2387
    //   677: iconst_1
    //   678: istore #6
    //   680: goto -> 2390
    //   683: new androidx/core/app/i$e
    //   686: dup
    //   687: aload_0
    //   688: getfield a : Landroid/content/Context;
    //   691: aload #12
    //   693: invokespecial <init> : (Landroid/content/Context;Ljava/lang/String;)V
    //   696: astore #18
    //   698: aload #18
    //   700: aload #13
    //   702: invokevirtual b : (Ljava/lang/CharSequence;)Landroidx/core/app/i$e;
    //   705: pop
    //   706: aload #18
    //   708: aload_1
    //   709: ldc_w 'ticker'
    //   712: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   715: invokevirtual d : (Ljava/lang/CharSequence;)Landroidx/core/app/i$e;
    //   718: pop
    //   719: aload #18
    //   721: iload #6
    //   723: invokevirtual f : (I)Landroidx/core/app/i$e;
    //   726: pop
    //   727: aload #18
    //   729: iload #5
    //   731: invokevirtual d : (I)Landroidx/core/app/i$e;
    //   734: pop
    //   735: aload #18
    //   737: aload_1
    //   738: ldc_w 'autoCancel'
    //   741: iconst_1
    //   742: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   745: invokevirtual a : (Z)Landroidx/core/app/i$e;
    //   748: pop
    //   749: aload #18
    //   751: aload_1
    //   752: ldc_w 'onlyAlertOnce'
    //   755: iconst_0
    //   756: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   759: invokevirtual e : (Z)Landroidx/core/app/i$e;
    //   762: pop
    //   763: getstatic android/os/Build$VERSION.SDK_INT : I
    //   766: bipush #24
    //   768: if_icmplt -> 785
    //   771: aload #18
    //   773: aload_1
    //   774: ldc_w 'showWhen'
    //   777: iconst_1
    //   778: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   781: invokevirtual f : (Z)Landroidx/core/app/i$e;
    //   784: pop
    //   785: getstatic android/os/Build$VERSION.SDK_INT : I
    //   788: bipush #26
    //   790: if_icmplt -> 800
    //   793: aload #18
    //   795: iconst_4
    //   796: invokevirtual b : (I)Landroidx/core/app/i$e;
    //   799: pop
    //   800: getstatic android/os/Build$VERSION.SDK_INT : I
    //   803: bipush #20
    //   805: if_icmplt -> 863
    //   808: aload_1
    //   809: ldc_w 'group'
    //   812: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   815: astore #14
    //   817: aload #14
    //   819: ifnull -> 830
    //   822: aload #18
    //   824: aload #14
    //   826: invokevirtual c : (Ljava/lang/String;)Landroidx/core/app/i$e;
    //   829: pop
    //   830: aload_1
    //   831: ldc_w 'groupSummary'
    //   834: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   837: ifne -> 850
    //   840: aload_1
    //   841: ldc_w 'groupSummary'
    //   844: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   847: ifeq -> 863
    //   850: aload #18
    //   852: aload_1
    //   853: ldc_w 'groupSummary'
    //   856: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   859: invokevirtual b : (Z)Landroidx/core/app/i$e;
    //   862: pop
    //   863: aload_1
    //   864: ldc_w 'number'
    //   867: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   870: astore #14
    //   872: aload #14
    //   874: ifnull -> 888
    //   877: aload #18
    //   879: aload #14
    //   881: invokestatic parseInt : (Ljava/lang/String;)I
    //   884: invokevirtual c : (I)Landroidx/core/app/i$e;
    //   887: pop
    //   888: aload_1
    //   889: ldc_w 'smallIcon'
    //   892: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   895: astore #14
    //   897: aload #14
    //   899: ifnull -> 2428
    //   902: aload #14
    //   904: invokevirtual isEmpty : ()Z
    //   907: ifne -> 2428
    //   910: aload #15
    //   912: aload #14
    //   914: ldc_w 'mipmap'
    //   917: aload #17
    //   919: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   922: istore #6
    //   924: goto -> 927
    //   927: iload #6
    //   929: istore #5
    //   931: iload #6
    //   933: ifne -> 965
    //   936: aload #15
    //   938: ldc_w 'ic_launcher'
    //   941: ldc_w 'mipmap'
    //   944: aload #17
    //   946: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   949: istore #6
    //   951: iload #6
    //   953: istore #5
    //   955: iload #6
    //   957: ifne -> 965
    //   960: ldc_w 17301659
    //   963: istore #5
    //   965: aload #18
    //   967: iload #5
    //   969: invokevirtual e : (I)Landroidx/core/app/i$e;
    //   972: pop
    //   973: aload_2
    //   974: ifnonnull -> 2453
    //   977: aload_1
    //   978: ldc_w 'largeIcon'
    //   981: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   984: astore #14
    //   986: aload #14
    //   988: ifnull -> 1016
    //   991: aload #14
    //   993: invokevirtual isEmpty : ()Z
    //   996: ifne -> 1016
    //   999: aload #15
    //   1001: aload #14
    //   1003: ldc_w 'mipmap'
    //   1006: aload #17
    //   1008: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   1011: istore #5
    //   1013: goto -> 1039
    //   1016: aload #14
    //   1018: ifnonnull -> 2447
    //   1021: aload #15
    //   1023: ldc_w 'ic_launcher'
    //   1026: ldc_w 'mipmap'
    //   1029: aload #17
    //   1031: invokevirtual getIdentifier : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
    //   1034: istore #5
    //   1036: goto -> 1039
    //   1039: iload #5
    //   1041: ifeq -> 2453
    //   1044: aload #14
    //   1046: ifnonnull -> 1057
    //   1049: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1052: bipush #21
    //   1054: if_icmplt -> 2453
    //   1057: aload #15
    //   1059: iload #5
    //   1061: invokestatic decodeResource : (Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;
    //   1064: astore_2
    //   1065: goto -> 1068
    //   1068: aload_2
    //   1069: ifnull -> 1079
    //   1072: aload #18
    //   1074: aload_2
    //   1075: invokevirtual a : (Landroid/graphics/Bitmap;)Landroidx/core/app/i$e;
    //   1078: pop
    //   1079: aload_1
    //   1080: ldc_w 'message'
    //   1083: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1086: astore #14
    //   1088: aload #18
    //   1090: aload #14
    //   1092: invokevirtual a : (Ljava/lang/CharSequence;)Landroidx/core/app/i$e;
    //   1095: pop
    //   1096: aload_1
    //   1097: ldc_w 'subText'
    //   1100: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1103: astore_2
    //   1104: aload_2
    //   1105: ifnull -> 1115
    //   1108: aload #18
    //   1110: aload_2
    //   1111: invokevirtual c : (Ljava/lang/CharSequence;)Landroidx/core/app/i$e;
    //   1114: pop
    //   1115: aload_1
    //   1116: ldc_w 'bigText'
    //   1119: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1122: astore #15
    //   1124: aload #15
    //   1126: astore_2
    //   1127: aload #15
    //   1129: ifnonnull -> 1135
    //   1132: aload #14
    //   1134: astore_2
    //   1135: aload_3
    //   1136: ifnull -> 1170
    //   1139: new androidx/core/app/i$b
    //   1142: dup
    //   1143: invokespecial <init> : ()V
    //   1146: astore_2
    //   1147: aload_2
    //   1148: aload_3
    //   1149: invokevirtual b : (Landroid/graphics/Bitmap;)Landroidx/core/app/i$b;
    //   1152: pop
    //   1153: aload_2
    //   1154: aload #13
    //   1156: invokevirtual a : (Ljava/lang/CharSequence;)Landroidx/core/app/i$b;
    //   1159: pop
    //   1160: aload_2
    //   1161: aload #14
    //   1163: invokevirtual b : (Ljava/lang/CharSequence;)Landroidx/core/app/i$b;
    //   1166: pop
    //   1167: goto -> 1186
    //   1170: new androidx/core/app/i$c
    //   1173: dup
    //   1174: invokespecial <init> : ()V
    //   1177: astore_3
    //   1178: aload_3
    //   1179: aload_2
    //   1180: invokevirtual a : (Ljava/lang/CharSequence;)Landroidx/core/app/i$c;
    //   1183: pop
    //   1184: aload_3
    //   1185: astore_2
    //   1186: aload #18
    //   1188: aload_2
    //   1189: invokevirtual a : (Landroidx/core/app/i$f;)Landroidx/core/app/i$e;
    //   1192: pop
    //   1193: new android/content/Intent
    //   1196: dup
    //   1197: aload_0
    //   1198: getfield a : Landroid/content/Context;
    //   1201: aload #19
    //   1203: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1206: astore #14
    //   1208: aload #14
    //   1210: ldc_w 536870912
    //   1213: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   1216: pop
    //   1217: aload_1
    //   1218: ldc_w 'foreground'
    //   1221: aload_0
    //   1222: invokevirtual g : ()Z
    //   1225: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   1228: aload_1
    //   1229: ldc_w 'userInteraction'
    //   1232: iconst_1
    //   1233: invokevirtual putBoolean : (Ljava/lang/String;Z)V
    //   1236: aload #14
    //   1238: ldc_w 'notification'
    //   1241: aload_1
    //   1242: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //   1245: pop
    //   1246: aload_1
    //   1247: ldc_w 'messageId'
    //   1250: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1253: astore #15
    //   1255: aload #15
    //   1257: ifnull -> 1271
    //   1260: aload #14
    //   1262: ldc_w 'message_id'
    //   1265: aload #15
    //   1267: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   1270: pop
    //   1271: aload_1
    //   1272: ldc_w 'playSound'
    //   1275: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   1278: ifeq -> 1294
    //   1281: aload_1
    //   1282: ldc_w 'playSound'
    //   1285: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   1288: ifeq -> 2456
    //   1291: goto -> 1294
    //   1294: aload_1
    //   1295: ldc_w 'soundName'
    //   1298: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1301: astore_2
    //   1302: aload_2
    //   1303: astore_3
    //   1304: aload_2
    //   1305: ifnonnull -> 1311
    //   1308: ldc 'default'
    //   1310: astore_3
    //   1311: aload_0
    //   1312: aload_3
    //   1313: invokespecial e : (Ljava/lang/String;)Landroid/net/Uri;
    //   1316: astore #13
    //   1318: aload #12
    //   1320: astore_2
    //   1321: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1324: bipush #26
    //   1326: if_icmplt -> 1363
    //   1329: new java/lang/StringBuilder
    //   1332: dup
    //   1333: invokespecial <init> : ()V
    //   1336: astore_2
    //   1337: aload_2
    //   1338: aload #12
    //   1340: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1343: pop
    //   1344: aload_2
    //   1345: ldc_w '-'
    //   1348: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1351: pop
    //   1352: aload_2
    //   1353: aload_3
    //   1354: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1357: pop
    //   1358: aload_2
    //   1359: invokevirtual toString : ()Ljava/lang/String;
    //   1362: astore_2
    //   1363: aload #18
    //   1365: aload #13
    //   1367: invokevirtual a : (Landroid/net/Uri;)Landroidx/core/app/i$e;
    //   1370: pop
    //   1371: aload #13
    //   1373: astore_3
    //   1374: aload_3
    //   1375: ifnull -> 1386
    //   1378: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1381: bipush #26
    //   1383: if_icmplt -> 1393
    //   1386: aload #18
    //   1388: aconst_null
    //   1389: invokevirtual a : (Landroid/net/Uri;)Landroidx/core/app/i$e;
    //   1392: pop
    //   1393: aload_1
    //   1394: ldc_w 'ongoing'
    //   1397: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   1400: ifne -> 1413
    //   1403: aload_1
    //   1404: ldc_w 'ongoing'
    //   1407: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   1410: ifeq -> 1426
    //   1413: aload #18
    //   1415: aload_1
    //   1416: ldc_w 'ongoing'
    //   1419: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   1422: invokevirtual d : (Z)Landroidx/core/app/i$e;
    //   1425: pop
    //   1426: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1429: bipush #21
    //   1431: if_icmplt -> 1494
    //   1434: aload #18
    //   1436: ldc_w 'call'
    //   1439: invokevirtual a : (Ljava/lang/String;)Landroidx/core/app/i$e;
    //   1442: pop
    //   1443: aload_1
    //   1444: ldc_w 'color'
    //   1447: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1450: astore #12
    //   1452: aload_0
    //   1453: getfield b : Lcom/dieam/reactnativepushnotification/modules/b;
    //   1456: invokevirtual b : ()I
    //   1459: istore #5
    //   1461: aload #12
    //   1463: ifnull -> 1480
    //   1466: aload #18
    //   1468: aload #12
    //   1470: invokestatic parseColor : (Ljava/lang/String;)I
    //   1473: invokevirtual a : (I)Landroidx/core/app/i$e;
    //   1476: pop
    //   1477: goto -> 1494
    //   1480: iload #5
    //   1482: iconst_m1
    //   1483: if_icmpeq -> 1494
    //   1486: aload #18
    //   1488: iload #5
    //   1490: invokevirtual a : (I)Landroidx/core/app/i$e;
    //   1493: pop
    //   1494: aload #16
    //   1496: invokestatic parseInt : (Ljava/lang/String;)I
    //   1499: istore #5
    //   1501: aload_0
    //   1502: getfield a : Landroid/content/Context;
    //   1505: iload #5
    //   1507: aload #14
    //   1509: ldc_w 134217728
    //   1512: invokestatic getActivity : (Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   1515: astore #20
    //   1517: aload_0
    //   1518: invokespecial j : ()Landroid/app/NotificationManager;
    //   1521: astore #19
    //   1523: aload_1
    //   1524: ldc_w 'vibrate'
    //   1527: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   1530: ifeq -> 1546
    //   1533: aload_1
    //   1534: ldc_w 'vibrate'
    //   1537: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   1540: ifeq -> 2464
    //   1543: goto -> 1546
    //   1546: aload_1
    //   1547: ldc_w 'vibration'
    //   1550: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   1553: ifeq -> 2476
    //   1556: aload_1
    //   1557: ldc_w 'vibration'
    //   1560: invokevirtual getDouble : (Ljava/lang/String;)D
    //   1563: d2l
    //   1564: lstore #8
    //   1566: goto -> 2481
    //   1569: new java/lang/StringBuilder
    //   1572: dup
    //   1573: invokespecial <init> : ()V
    //   1576: astore #12
    //   1578: aload #12
    //   1580: aload_2
    //   1581: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1584: pop
    //   1585: aload #12
    //   1587: ldc_w '-'
    //   1590: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1593: pop
    //   1594: aload #12
    //   1596: lload #10
    //   1598: invokevirtual append : (J)Ljava/lang/StringBuilder;
    //   1601: pop
    //   1602: aload #12
    //   1604: invokevirtual toString : ()Ljava/lang/String;
    //   1607: astore_2
    //   1608: iconst_2
    //   1609: newarray long
    //   1611: astore #13
    //   1613: aload #13
    //   1615: iconst_0
    //   1616: lconst_0
    //   1617: lastore
    //   1618: aload #13
    //   1620: iconst_1
    //   1621: lload #10
    //   1623: lastore
    //   1624: aload #18
    //   1626: aload #13
    //   1628: invokevirtual a : ([J)Landroidx/core/app/i$e;
    //   1631: pop
    //   1632: aload #14
    //   1634: astore #12
    //   1636: getstatic android/os/Build$VERSION.SDK_INT : I
    //   1639: bipush #26
    //   1641: if_icmplt -> 2500
    //   1644: aload_1
    //   1645: ldc_w 'shortcutId'
    //   1648: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1651: astore #14
    //   1653: aload #14
    //   1655: ifnull -> 1666
    //   1658: aload #18
    //   1660: aload #14
    //   1662: invokevirtual d : (Ljava/lang/String;)Landroidx/core/app/i$e;
    //   1665: pop
    //   1666: aload_1
    //   1667: ldc_w 'timeoutAfter'
    //   1670: invokevirtual getDouble : (Ljava/lang/String;)D
    //   1673: d2l
    //   1674: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1677: astore #14
    //   1679: aload #14
    //   1681: ifnull -> 1708
    //   1684: aload #14
    //   1686: invokevirtual longValue : ()J
    //   1689: lconst_0
    //   1690: lcmp
    //   1691: iflt -> 1708
    //   1694: aload #18
    //   1696: aload #14
    //   1698: invokevirtual longValue : ()J
    //   1701: invokevirtual a : (J)Landroidx/core/app/i$e;
    //   1704: pop
    //   1705: goto -> 1708
    //   1708: aload_1
    //   1709: ldc_w 'when'
    //   1712: invokevirtual getDouble : (Ljava/lang/String;)D
    //   1715: d2l
    //   1716: invokestatic valueOf : (J)Ljava/lang/Long;
    //   1719: astore #14
    //   1721: aload #14
    //   1723: ifnull -> 1747
    //   1726: aload #14
    //   1728: invokevirtual longValue : ()J
    //   1731: lconst_0
    //   1732: lcmp
    //   1733: iflt -> 1747
    //   1736: aload #18
    //   1738: aload #14
    //   1740: invokevirtual longValue : ()J
    //   1743: invokevirtual b : (J)Landroidx/core/app/i$e;
    //   1746: pop
    //   1747: aload #18
    //   1749: aload_1
    //   1750: ldc_w 'usesChronometer'
    //   1753: iconst_0
    //   1754: invokevirtual getBoolean : (Ljava/lang/String;Z)Z
    //   1757: invokevirtual g : (Z)Landroidx/core/app/i$e;
    //   1760: pop
    //   1761: aload_1
    //   1762: ldc_w 'channelId'
    //   1765: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1768: astore #14
    //   1770: aload #14
    //   1772: ifnull -> 2503
    //   1775: aload #14
    //   1777: astore_2
    //   1778: goto -> 1781
    //   1781: aload_1
    //   1782: ldc_w 'channelName'
    //   1785: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1788: astore #14
    //   1790: aload_1
    //   1791: ldc_w 'channelDescription'
    //   1794: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1797: astore #21
    //   1799: aload_0
    //   1800: aload #19
    //   1802: aload_2
    //   1803: aload #14
    //   1805: aload #21
    //   1807: aload_3
    //   1808: iload #4
    //   1810: aload #13
    //   1812: invokespecial a : (Landroid/app/NotificationManager;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;I[J)Z
    //   1815: pop
    //   1816: aload #18
    //   1818: aload_2
    //   1819: invokevirtual b : (Ljava/lang/String;)Landroidx/core/app/i$e;
    //   1822: pop
    //   1823: aload #18
    //   1825: aload #20
    //   1827: invokevirtual a : (Landroid/app/PendingIntent;)Landroidx/core/app/i$e;
    //   1830: pop
    //   1831: aload_1
    //   1832: ldc_w 'actions'
    //   1835: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1838: ifnull -> 1859
    //   1841: new org/json/JSONArray
    //   1844: dup
    //   1845: aload_1
    //   1846: ldc_w 'actions'
    //   1849: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   1852: invokespecial <init> : (Ljava/lang/String;)V
    //   1855: astore_2
    //   1856: goto -> 1861
    //   1859: aconst_null
    //   1860: astore_2
    //   1861: goto -> 2506
    //   1864: astore_2
    //   1865: ldc 'RNPushNotification'
    //   1867: ldc_w 'Exception while converting actions to JSON object.'
    //   1870: aload_2
    //   1871: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1874: pop
    //   1875: aconst_null
    //   1876: astore_2
    //   1877: goto -> 2506
    //   1880: aload_2
    //   1881: invokevirtual length : ()I
    //   1884: istore #7
    //   1886: iload #5
    //   1888: istore #6
    //   1890: iload #4
    //   1892: iload #7
    //   1894: if_icmpge -> 2093
    //   1897: aload_2
    //   1898: iload #4
    //   1900: invokevirtual getString : (I)Ljava/lang/String;
    //   1903: astore_3
    //   1904: new android/content/Intent
    //   1907: dup
    //   1908: aload_0
    //   1909: getfield a : Landroid/content/Context;
    //   1912: ldc_w com/dieam/reactnativepushnotification/modules/RNPushNotificationActions
    //   1915: invokespecial <init> : (Landroid/content/Context;Ljava/lang/Class;)V
    //   1918: astore #13
    //   1920: new java/lang/StringBuilder
    //   1923: dup
    //   1924: invokespecial <init> : ()V
    //   1927: astore #14
    //   1929: aload #14
    //   1931: aload #17
    //   1933: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1936: pop
    //   1937: aload #14
    //   1939: ldc_w '.ACTION_'
    //   1942: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   1945: pop
    //   1946: aload #14
    //   1948: iload #4
    //   1950: invokevirtual append : (I)Ljava/lang/StringBuilder;
    //   1953: pop
    //   1954: aload #13
    //   1956: aload #14
    //   1958: invokevirtual toString : ()Ljava/lang/String;
    //   1961: invokevirtual setAction : (Ljava/lang/String;)Landroid/content/Intent;
    //   1964: pop
    //   1965: aload #13
    //   1967: ldc_w 536870912
    //   1970: invokevirtual addFlags : (I)Landroid/content/Intent;
    //   1973: pop
    //   1974: aload_1
    //   1975: ldc_w 'action'
    //   1978: aload_3
    //   1979: invokevirtual putString : (Ljava/lang/String;Ljava/lang/String;)V
    //   1982: aload #13
    //   1984: ldc_w 'notification'
    //   1987: aload_1
    //   1988: invokevirtual putExtra : (Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;
    //   1991: pop
    //   1992: aload #13
    //   1994: aload #17
    //   1996: invokevirtual setPackage : (Ljava/lang/String;)Landroid/content/Intent;
    //   1999: pop
    //   2000: aload #15
    //   2002: ifnull -> 2520
    //   2005: aload #12
    //   2007: ldc_w 'message_id'
    //   2010: aload #15
    //   2012: invokevirtual putExtra : (Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   2015: pop
    //   2016: goto -> 2019
    //   2019: aload_0
    //   2020: getfield a : Landroid/content/Context;
    //   2023: iload #5
    //   2025: aload #13
    //   2027: ldc_w 134217728
    //   2030: invokestatic getBroadcast : (Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;
    //   2033: astore #13
    //   2035: getstatic android/os/Build$VERSION.SDK_INT : I
    //   2038: bipush #23
    //   2040: if_icmplt -> 2066
    //   2043: aload #18
    //   2045: new androidx/core/app/i$a$a
    //   2048: dup
    //   2049: iconst_0
    //   2050: aload_3
    //   2051: aload #13
    //   2053: invokespecial <init> : (ILjava/lang/CharSequence;Landroid/app/PendingIntent;)V
    //   2056: invokevirtual a : ()Landroidx/core/app/i$a;
    //   2059: invokevirtual a : (Landroidx/core/app/i$a;)Landroidx/core/app/i$e;
    //   2062: pop
    //   2063: goto -> 2523
    //   2066: aload #18
    //   2068: iconst_0
    //   2069: aload_3
    //   2070: aload #13
    //   2072: invokevirtual a : (ILjava/lang/CharSequence;Landroid/app/PendingIntent;)Landroidx/core/app/i$e;
    //   2075: pop
    //   2076: goto -> 2523
    //   2079: astore_3
    //   2080: ldc 'RNPushNotification'
    //   2082: ldc_w 'Exception while getting action from actionsArray.'
    //   2085: aload_3
    //   2086: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   2089: pop
    //   2090: goto -> 2523
    //   2093: aload_0
    //   2094: getfield c : Landroid/content/SharedPreferences;
    //   2097: aload #16
    //   2099: aconst_null
    //   2100: invokeinterface getString : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   2105: ifnull -> 2133
    //   2108: aload_0
    //   2109: getfield c : Landroid/content/SharedPreferences;
    //   2112: invokeinterface edit : ()Landroid/content/SharedPreferences$Editor;
    //   2117: astore_2
    //   2118: aload_2
    //   2119: aload #16
    //   2121: invokeinterface remove : (Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;
    //   2126: pop
    //   2127: aload_2
    //   2128: invokeinterface apply : ()V
    //   2133: aload_0
    //   2134: invokevirtual g : ()Z
    //   2137: ifeq -> 2150
    //   2140: aload_1
    //   2141: ldc_w 'ignoreInForeground'
    //   2144: invokevirtual getBoolean : (Ljava/lang/String;)Z
    //   2147: ifne -> 2202
    //   2150: aload #18
    //   2152: invokevirtual a : ()Landroid/app/Notification;
    //   2155: astore_2
    //   2156: aload_2
    //   2157: aload_2
    //   2158: getfield defaults : I
    //   2161: iconst_4
    //   2162: ior
    //   2163: putfield defaults : I
    //   2166: aload_1
    //   2167: ldc_w 'tag'
    //   2170: invokevirtual containsKey : (Ljava/lang/String;)Z
    //   2173: ifeq -> 2194
    //   2176: aload #19
    //   2178: aload_1
    //   2179: ldc_w 'tag'
    //   2182: invokevirtual getString : (Ljava/lang/String;)Ljava/lang/String;
    //   2185: iload #6
    //   2187: aload_2
    //   2188: invokevirtual notify : (Ljava/lang/String;ILandroid/app/Notification;)V
    //   2191: goto -> 2202
    //   2194: aload #19
    //   2196: iload #6
    //   2198: aload_2
    //   2199: invokevirtual notify : (ILandroid/app/Notification;)V
    //   2202: aload_0
    //   2203: aload_1
    //   2204: invokespecial e : (Landroid/os/Bundle;)V
    //   2207: return
    //   2208: astore_1
    //   2209: goto -> 2217
    //   2212: astore_1
    //   2213: goto -> 2217
    //   2216: astore_1
    //   2217: ldc 'RNPushNotification'
    //   2219: ldc_w 'failed to send push notification'
    //   2222: aload_1
    //   2223: invokestatic e : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   2226: pop
    //   2227: return
    //   2228: iconst_m1
    //   2229: istore #4
    //   2231: iload #4
    //   2233: ifeq -> 2282
    //   2236: iload #4
    //   2238: iconst_1
    //   2239: if_icmpeq -> 2288
    //   2242: iload #4
    //   2244: iconst_2
    //   2245: if_icmpeq -> 2276
    //   2248: iload #4
    //   2250: iconst_3
    //   2251: if_icmpeq -> 2269
    //   2254: iload #4
    //   2256: iconst_4
    //   2257: if_icmpeq -> 2263
    //   2260: goto -> 2288
    //   2263: iconst_0
    //   2264: istore #5
    //   2266: goto -> 312
    //   2269: bipush #-2
    //   2271: istore #5
    //   2273: goto -> 312
    //   2276: iconst_m1
    //   2277: istore #5
    //   2279: goto -> 312
    //   2282: iconst_2
    //   2283: istore #5
    //   2285: goto -> 312
    //   2288: iconst_1
    //   2289: istore #5
    //   2291: goto -> 312
    //   2294: iconst_m1
    //   2295: istore #4
    //   2297: iload #4
    //   2299: tableswitch default -> 2340, 0 -> 2375, 1 -> 2369, 2 -> 2381, 3 -> 2363, 4 -> 2357, 5 -> 2351, 6 -> 2343
    //   2340: goto -> 2381
    //   2343: sipush #-1000
    //   2346: istore #4
    //   2348: goto -> 535
    //   2351: iconst_0
    //   2352: istore #4
    //   2354: goto -> 535
    //   2357: iconst_1
    //   2358: istore #4
    //   2360: goto -> 535
    //   2363: iconst_2
    //   2364: istore #4
    //   2366: goto -> 535
    //   2369: iconst_5
    //   2370: istore #4
    //   2372: goto -> 535
    //   2375: iconst_3
    //   2376: istore #4
    //   2378: goto -> 535
    //   2381: iconst_4
    //   2382: istore #4
    //   2384: goto -> 535
    //   2387: iconst_m1
    //   2388: istore #6
    //   2390: iload #6
    //   2392: ifeq -> 2422
    //   2395: iload #6
    //   2397: iconst_1
    //   2398: if_icmpeq -> 2416
    //   2401: iload #6
    //   2403: iconst_2
    //   2404: if_icmpeq -> 2410
    //   2407: goto -> 2422
    //   2410: iconst_m1
    //   2411: istore #6
    //   2413: goto -> 683
    //   2416: iconst_1
    //   2417: istore #6
    //   2419: goto -> 683
    //   2422: iconst_0
    //   2423: istore #6
    //   2425: goto -> 683
    //   2428: aload #14
    //   2430: ifnonnull -> 2441
    //   2433: ldc_w 'ic_notification'
    //   2436: astore #14
    //   2438: goto -> 910
    //   2441: iconst_0
    //   2442: istore #6
    //   2444: goto -> 927
    //   2447: iconst_0
    //   2448: istore #5
    //   2450: goto -> 1039
    //   2453: goto -> 1068
    //   2456: aload #12
    //   2458: astore_2
    //   2459: aconst_null
    //   2460: astore_3
    //   2461: goto -> 1374
    //   2464: iconst_1
    //   2465: newarray long
    //   2467: dup
    //   2468: iconst_0
    //   2469: lconst_0
    //   2470: lastore
    //   2471: astore #13
    //   2473: goto -> 1632
    //   2476: ldc2_w 300
    //   2479: lstore #8
    //   2481: lload #8
    //   2483: lstore #10
    //   2485: lload #8
    //   2487: lconst_0
    //   2488: lcmp
    //   2489: ifne -> 1569
    //   2492: ldc2_w 300
    //   2495: lstore #10
    //   2497: goto -> 1569
    //   2500: goto -> 1708
    //   2503: goto -> 1781
    //   2506: iload #5
    //   2508: istore #6
    //   2510: aload_2
    //   2511: ifnull -> 2093
    //   2514: iconst_0
    //   2515: istore #4
    //   2517: goto -> 1880
    //   2520: goto -> 2019
    //   2523: iload #4
    //   2525: iconst_1
    //   2526: iadd
    //   2527: istore #4
    //   2529: goto -> 1880
    // Exception table:
    //   from	to	target	type
    //   0	6	2216	java/lang/Exception
    //   11	20	2216	java/lang/Exception
    //   21	63	2216	java/lang/Exception
    //   64	72	2216	java/lang/Exception
    //   77	86	2216	java/lang/Exception
    //   87	114	2216	java/lang/Exception
    //   123	151	2216	java/lang/Exception
    //   151	160	2216	java/lang/Exception
    //   165	228	2216	java/lang/Exception
    //   228	238	2216	java/lang/Exception
    //   244	255	2216	java/lang/Exception
    //   261	272	2216	java/lang/Exception
    //   278	289	2216	java/lang/Exception
    //   295	306	2216	java/lang/Exception
    //   312	317	2216	java/lang/Exception
    //   324	333	2212	java/lang/Exception
    //   338	416	2212	java/lang/Exception
    //   416	426	2212	java/lang/Exception
    //   432	443	2212	java/lang/Exception
    //   449	460	2212	java/lang/Exception
    //   466	477	2212	java/lang/Exception
    //   483	494	2212	java/lang/Exception
    //   500	511	2212	java/lang/Exception
    //   517	528	2212	java/lang/Exception
    //   535	586	2212	java/lang/Exception
    //   591	605	2212	java/lang/Exception
    //   632	643	2212	java/lang/Exception
    //   649	660	2212	java/lang/Exception
    //   666	677	2212	java/lang/Exception
    //   683	785	2212	java/lang/Exception
    //   785	800	2212	java/lang/Exception
    //   800	817	2212	java/lang/Exception
    //   822	830	2212	java/lang/Exception
    //   830	850	2212	java/lang/Exception
    //   850	863	2212	java/lang/Exception
    //   863	872	2212	java/lang/Exception
    //   877	888	2212	java/lang/Exception
    //   888	897	2212	java/lang/Exception
    //   902	910	2212	java/lang/Exception
    //   910	924	2212	java/lang/Exception
    //   936	951	2212	java/lang/Exception
    //   965	973	2212	java/lang/Exception
    //   977	986	2212	java/lang/Exception
    //   991	1013	2212	java/lang/Exception
    //   1021	1036	2212	java/lang/Exception
    //   1049	1057	2212	java/lang/Exception
    //   1057	1065	2212	java/lang/Exception
    //   1072	1079	2212	java/lang/Exception
    //   1079	1104	2212	java/lang/Exception
    //   1108	1115	2212	java/lang/Exception
    //   1115	1124	2212	java/lang/Exception
    //   1139	1167	2212	java/lang/Exception
    //   1170	1184	2212	java/lang/Exception
    //   1186	1255	2212	java/lang/Exception
    //   1260	1271	2212	java/lang/Exception
    //   1271	1291	2212	java/lang/Exception
    //   1294	1302	2212	java/lang/Exception
    //   1311	1318	2212	java/lang/Exception
    //   1321	1363	2212	java/lang/Exception
    //   1363	1371	2212	java/lang/Exception
    //   1378	1386	2212	java/lang/Exception
    //   1386	1393	2212	java/lang/Exception
    //   1393	1413	2212	java/lang/Exception
    //   1413	1426	2212	java/lang/Exception
    //   1426	1461	2212	java/lang/Exception
    //   1466	1477	2212	java/lang/Exception
    //   1486	1494	2212	java/lang/Exception
    //   1494	1543	2212	java/lang/Exception
    //   1546	1566	2212	java/lang/Exception
    //   1569	1613	2212	java/lang/Exception
    //   1624	1632	2212	java/lang/Exception
    //   1636	1653	2212	java/lang/Exception
    //   1658	1666	2212	java/lang/Exception
    //   1666	1679	2212	java/lang/Exception
    //   1684	1705	2212	java/lang/Exception
    //   1708	1721	2212	java/lang/Exception
    //   1726	1747	2212	java/lang/Exception
    //   1747	1770	2212	java/lang/Exception
    //   1781	1799	2212	java/lang/Exception
    //   1799	1831	2212	java/lang/Exception
    //   1831	1856	1864	org/json/JSONException
    //   1831	1856	2212	java/lang/Exception
    //   1865	1875	2208	java/lang/Exception
    //   1880	1886	2208	java/lang/Exception
    //   1897	1904	2079	org/json/JSONException
    //   1897	1904	2208	java/lang/Exception
    //   1904	2000	2208	java/lang/Exception
    //   2005	2016	2208	java/lang/Exception
    //   2019	2063	2208	java/lang/Exception
    //   2066	2076	2208	java/lang/Exception
    //   2080	2090	2208	java/lang/Exception
    //   2093	2133	2208	java/lang/Exception
    //   2133	2150	2208	java/lang/Exception
    //   2150	2191	2208	java/lang/Exception
    //   2194	2202	2208	java/lang/Exception
    //   2202	2207	2208	java/lang/Exception
  }
  
  public void a(ReadableArray paramReadableArray) {
    NotificationManager notificationManager = j();
    for (int i = 0; i < paramReadableArray.size(); i++) {
      String str = paramReadableArray.getString(i);
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Removing notification with id ");
      stringBuilder.append(str);
      Log.i("RNPushNotification", stringBuilder.toString());
      notificationManager.cancel(Integer.parseInt(str));
    } 
  }
  
  public void a(ReadableMap paramReadableMap) {
    for (String str : this.c.getAll().keySet()) {
      try {
        String str1 = this.c.getString(str, null);
        if (str1 != null && a.a(str1).a(paramReadableMap))
          d(str); 
      } catch (JSONException jSONException) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Problem dealing with scheduled notification ");
        stringBuilder.append(str);
        Log.w("RNPushNotification", stringBuilder.toString(), (Throwable)jSONException);
      } 
    } 
  }
  
  public void a(String paramString, int paramInt) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Clearing notification: ");
    stringBuilder.append(paramInt);
    Log.i("RNPushNotification", stringBuilder.toString());
    NotificationManager notificationManager = j();
    if (paramString != null) {
      notificationManager.cancel(paramString, paramInt);
      return;
    } 
    notificationManager.cancel(paramInt);
  }
  
  public boolean a(String paramString) {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i < 26)
      return false; 
    NotificationManager notificationManager = j();
    if (notificationManager == null)
      return false; 
    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(paramString);
    if (notificationChannel == null)
      return false; 
    if (notificationChannel.getImportance() == 0)
      bool = true; 
    return bool;
  }
  
  public void b() {
    if (!this.b.a())
      return; 
    NotificationManager notificationManager = j();
    int i = Build.VERSION.SDK_INT;
    Uri uri = RingtoneManager.getDefaultUri(2);
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("rn-push-notification-channel-id-");
    stringBuilder.append(4);
    stringBuilder.append("-default-");
    stringBuilder.append(300L);
    a(notificationManager, stringBuilder.toString(), null, null, uri, 4, new long[] { 0L, 300L });
  }
  
  public void b(Bundle paramBundle) {
    String str;
    if (e() == null) {
      str = "No activity class found for the scheduled notification";
    } else if (str.getString("message") == null) {
      str = "No message specified for the scheduled notification";
    } else if (str.getString("id") == null) {
      str = "No notification ID specified for the scheduled notification";
    } else if (str.getDouble("fireDate") == 0.0D) {
      str = "No date specified for the scheduled notification";
    } else {
      a a = new a((Bundle)str);
      String str1 = a.b();
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Storing push notification with id ");
      stringBuilder.append(str1);
      Log.d("RNPushNotification", stringBuilder.toString());
      SharedPreferences.Editor editor = this.c.edit();
      editor.putString(str1, a.i().toString());
      editor.apply();
      if (!this.c.contains(str1)) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append("Failed to save ");
        stringBuilder1.append(str1);
        Log.e("RNPushNotification", stringBuilder1.toString());
      } 
      c((Bundle)str);
      return;
    } 
    Log.e("RNPushNotification", str);
  }
  
  public boolean b(ReadableMap paramReadableMap) {
    byte b1;
    boolean bool;
    String str1;
    String str2;
    if (Build.VERSION.SDK_INT < 26)
      return false; 
    String str3 = paramReadableMap.getString("channelId");
    String str4 = paramReadableMap.getString("channelName");
    if (paramReadableMap.hasKey("channelDescription")) {
      str1 = paramReadableMap.getString("channelDescription");
    } else {
      str1 = null;
    } 
    if (paramReadableMap.hasKey("soundName")) {
      str2 = paramReadableMap.getString("soundName");
    } else {
      str2 = "default";
    } 
    if (paramReadableMap.hasKey("importance")) {
      b1 = paramReadableMap.getInt("importance");
    } else {
      b1 = 4;
    } 
    if (paramReadableMap.hasKey("vibrate") && paramReadableMap.getBoolean("vibrate")) {
      bool = true;
    } else {
      bool = false;
    } 
    if (bool) {
      long[] arrayOfLong = { 300L };
    } else {
      paramReadableMap = null;
    } 
    return a(j(), str3, str4, str1, e(str2), b1, (long[])paramReadableMap);
  }
  
  public boolean b(String paramString) {
    int i = Build.VERSION.SDK_INT;
    boolean bool = false;
    if (i < 26)
      return false; 
    NotificationManager notificationManager = j();
    if (notificationManager == null)
      return false; 
    if (notificationManager.getNotificationChannel(paramString) != null)
      bool = true; 
    return bool;
  }
  
  public void c() {
    Log.i("RNPushNotification", "Clearing alerts from the notification centre");
    j().cancelAll();
  }
  
  public void c(Bundle paramBundle) {
    long l = (long)paramBundle.getDouble("fireDate");
    boolean bool = paramBundle.getBoolean("allowWhileIdle");
    PendingIntent pendingIntent = f(paramBundle);
    if (pendingIntent == null)
      return; 
    Log.d("RNPushNotification", String.format("Setting a notification with id %s at time %s", new Object[] { paramBundle.getString("id"), Long.toString(l) }));
    int i = Build.VERSION.SDK_INT;
    if (i >= 19) {
      if (bool && i >= 23) {
        i().setExactAndAllowWhileIdle(0, l, pendingIntent);
        return;
      } 
      i().setExact(0, l, pendingIntent);
      return;
    } 
    i().set(0, l, pendingIntent);
  }
  
  public void c(String paramString) {
    if (Build.VERSION.SDK_INT < 26)
      return; 
    NotificationManager notificationManager = j();
    if (notificationManager == null)
      return; 
    notificationManager.deleteNotificationChannel(paramString);
  }
  
  public WritableArray d() {
    StatusBarNotification[] arrayOfStatusBarNotification = j().getActiveNotifications();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Found ");
    stringBuilder.append(arrayOfStatusBarNotification.length);
    stringBuilder.append(" delivered notifications");
    Log.i("RNPushNotification", stringBuilder.toString());
    WritableArray writableArray = Arguments.createArray();
    int j = arrayOfStatusBarNotification.length;
    for (int i = 0; i < j; i++) {
      StatusBarNotification statusBarNotification = arrayOfStatusBarNotification[i];
      Notification notification = statusBarNotification.getNotification();
      Bundle bundle = notification.extras;
      WritableMap writableMap = Arguments.createMap();
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("");
      stringBuilder1.append(statusBarNotification.getId());
      writableMap.putString("identifier", stringBuilder1.toString());
      writableMap.putString("title", bundle.getString("android.title"));
      writableMap.putString("body", bundle.getString("android.text"));
      writableMap.putString("tag", statusBarNotification.getTag());
      writableMap.putString("group", notification.getGroup());
      writableArray.pushMap((ReadableMap)writableMap);
    } 
    return writableArray;
  }
  
  public void d(Bundle paramBundle) {
    e e = new e(new a(this, paramBundle));
    e.b(this.a, paramBundle.getString("largeIconUrl"));
    e.a(this.a, paramBundle.getString("bigPictureUrl"));
  }
  
  public Class e() {
    String str = this.a.getPackageName();
    str = this.a.getPackageManager().getLaunchIntentForPackage(str).getComponent().getClassName();
    try {
      return Class.forName(str);
    } catch (ClassNotFoundException classNotFoundException) {
      classNotFoundException.printStackTrace();
      return null;
    } 
  }
  
  public WritableArray f() {
    WritableArray writableArray = Arguments.createArray();
    for (Map.Entry entry : this.c.getAll().entrySet()) {
      try {
        a a = a.a(entry.getValue().toString());
        WritableMap writableMap = Arguments.createMap();
        writableMap.putString("title", a.g());
        writableMap.putString("message", a.c());
        writableMap.putString("number", a.d());
        writableMap.putDouble("date", a.a());
        writableMap.putString("id", a.b());
        writableMap.putString("repeatInterval", a.e());
        writableMap.putString("soundName", a.f());
        writableArray.pushMap((ReadableMap)writableMap);
      } catch (JSONException jSONException) {
        Log.e("RNPushNotification", jSONException.getMessage());
      } 
    } 
    return writableArray;
  }
  
  public boolean g() {
    List list = ((ActivityManager)this.a.getSystemService("activity")).getRunningAppProcesses();
    if (list != null)
      for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : list) {
        if (runningAppProcessInfo.processName.equals(this.a.getPackageName()) && runningAppProcessInfo.importance == 100 && runningAppProcessInfo.pkgList.length > 0)
          return true; 
      }  
    return false;
  }
  
  public List<String> h() {
    ArrayList<String> arrayList = new ArrayList();
    if (Build.VERSION.SDK_INT < 26)
      return arrayList; 
    NotificationManager notificationManager = j();
    if (notificationManager == null)
      return arrayList; 
    Iterator<NotificationChannel> iterator = notificationManager.getNotificationChannels().iterator();
    while (iterator.hasNext())
      arrayList.add(((NotificationChannel)iterator.next()).getId()); 
    return arrayList;
  }
  
  class a implements e.c {
    a(c this$0, Bundle param1Bundle) {}
    
    public void a(Bitmap param1Bitmap1, Bitmap param1Bitmap2) {
      this.b.a(this.a, param1Bitmap1, param1Bitmap2);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/dieam/reactnativepushnotification/modules/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */