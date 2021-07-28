package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import com.google.firebase.g;
import com.google.firebase.installations.h;
import com.google.firebase.k.a.a;
import com.google.firebase.messaging.f1.a;
import com.google.firebase.messaging.f1.b;
import e.f.a.c.b;
import e.f.a.c.c;
import e.f.a.c.f;
import e.f.a.c.g;
import e.f.a.e.m.o;
import java.util.concurrent.ExecutionException;

public class g0 {
  static a a(a.b paramb, Intent paramIntent) {
    if (paramIntent == null)
      return null; 
    Bundle bundle2 = paramIntent.getExtras();
    Bundle bundle1 = bundle2;
    if (bundle2 == null)
      bundle1 = Bundle.EMPTY; 
    a.a a = a.p();
    a.a(m(bundle1));
    a.a(paramb);
    a.d(d(bundle1));
    a.f(b());
    a.a(a.d.d);
    a.a(i(bundle1));
    String str = f(bundle1);
    if (str != null)
      a.e(str); 
    str = l(bundle1);
    if (str != null)
      a.g(str); 
    str = a(bundle1);
    if (str != null)
      a.b(str); 
    str = g(bundle1);
    if (str != null)
      a.a(str); 
    str = c(bundle1);
    if (str != null)
      a.c(str); 
    long l = k(bundle1);
    if (l > 0L)
      a.a(l); 
    return a.a();
  }
  
  static String a(Bundle paramBundle) {
    return paramBundle.getString("collapse_key");
  }
  
  private static void a(a.b paramb, Intent paramIntent, g paramg) {
    if (paramg == null) {
      Log.e("FirebaseMessaging", "TransportFactory is null. Skip exporting message delivery metrics to Big Query");
      return;
    } 
    a a = a(paramb, paramIntent);
    if (a == null)
      return; 
    try {
      f f = paramg.a("FCM_CLIENT_EVENT_LOGGING", b.class, b.a("proto"), f0.a);
      b.a a1 = b.c();
      a1.a(a);
      f.a(c.a(a1.a()));
      return;
    } catch (RuntimeException runtimeException) {
      Log.w("FirebaseMessaging", "Failed to send big query analytics payload.", runtimeException);
      return;
    } 
  }
  
  static void a(String paramString, Bundle paramBundle) {
    Bundle bundle = paramBundle;
    if (paramBundle == null)
      bundle = new Bundle(); 
    paramBundle = new Bundle();
    String str2 = b(bundle);
    if (str2 != null)
      paramBundle.putString("_nmid", str2); 
    str2 = c(bundle);
    if (str2 != null)
      paramBundle.putString("_nmn", str2); 
    str2 = g(bundle);
    if (!TextUtils.isEmpty(str2))
      paramBundle.putString("label", str2); 
    str2 = e(bundle);
    if (!TextUtils.isEmpty(str2))
      paramBundle.putString("message_channel", str2); 
    str2 = l(bundle);
    if (str2 != null)
      paramBundle.putString("_nt", str2); 
    str2 = h(bundle);
    if (str2 != null)
      try {
        paramBundle.putInt("_nmt", Integer.parseInt(str2));
      } catch (NumberFormatException numberFormatException) {
        Log.w("FirebaseMessaging", "Error while parsing timestamp in GCM event", numberFormatException);
      }  
    str2 = n(bundle);
    if (str2 != null)
      try {
        paramBundle.putInt("_ndt", Integer.parseInt(str2));
      } catch (NumberFormatException numberFormatException) {
        Log.w("FirebaseMessaging", "Error while parsing use_device_time in GCM event", numberFormatException);
      }  
    String str1 = j(bundle);
    if ("_nr".equals(paramString) || "_nf".equals(paramString))
      paramBundle.putString("_nmc", str1); 
    if (Log.isLoggable("FirebaseMessaging", 3)) {
      str1 = String.valueOf(paramBundle);
      StringBuilder stringBuilder = new StringBuilder(paramString.length() + 37 + String.valueOf(str1).length());
      stringBuilder.append("Logging to scion event=");
      stringBuilder.append(paramString);
      stringBuilder.append(" scionPayload=");
      stringBuilder.append(str1);
      Log.d("FirebaseMessaging", stringBuilder.toString());
    } 
    a a = (a)g.k().a(a.class);
    if (a != null) {
      a.a("fcm", paramString, paramBundle);
      return;
    } 
    Log.w("FirebaseMessaging", "Unable to log event: analytics library is missing");
  }
  
  static boolean a() {
    try {
      g.k();
      Context context = g.k().b();
      SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
      if (sharedPreferences.contains("export_to_big_query"))
        return sharedPreferences.getBoolean("export_to_big_query", false); 
      try {
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
          ApplicationInfo applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128);
          if (applicationInfo != null && applicationInfo.metaData != null && applicationInfo.metaData.containsKey("delivery_metrics_exported_to_big_query_enabled"))
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false); 
        } 
        return false;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        return false;
      } 
    } catch (IllegalStateException illegalStateException) {
      Log.i("FirebaseMessaging", "FirebaseApp has not being initialized. Device might be in direct boot mode. Skip exporting delivery metrics to Big Query");
      return false;
    } 
  }
  
  private static boolean a(Intent paramIntent) {
    return "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(paramIntent.getAction());
  }
  
  static String b() {
    return g.k().b().getPackageName();
  }
  
  static String b(Bundle paramBundle) {
    return paramBundle.getString("google.c.a.c_id");
  }
  
  public static void b(Intent paramIntent) {
    a("_nd", paramIntent.getExtras());
  }
  
  static String c(Bundle paramBundle) {
    return paramBundle.getString("google.c.a.c_l");
  }
  
  public static void c(Intent paramIntent) {
    a("_nf", paramIntent.getExtras());
  }
  
  static String d(Bundle paramBundle) {
    String str = paramBundle.getString("google.to");
    if (!TextUtils.isEmpty(str))
      return str; 
    try {
      return (String)o.a(h.a(g.k()).a());
    } catch (ExecutionException executionException) {
    
    } catch (InterruptedException interruptedException) {}
    throw new RuntimeException(interruptedException);
  }
  
  public static void d(Intent paramIntent) {
    if (f(paramIntent))
      a("_nr", paramIntent.getExtras()); 
    if (e(paramIntent))
      a(a.b.d, paramIntent, FirebaseMessaging.i()); 
  }
  
  static String e(Bundle paramBundle) {
    return paramBundle.getString("google.c.a.m_c");
  }
  
  public static boolean e(Intent paramIntent) {
    return (paramIntent == null || a(paramIntent)) ? false : a();
  }
  
  static String f(Bundle paramBundle) {
    String str = paramBundle.getString("google.message_id");
    return (str == null) ? paramBundle.getString("message_id") : str;
  }
  
  public static boolean f(Intent paramIntent) {
    return (paramIntent == null || a(paramIntent)) ? false : q(paramIntent.getExtras());
  }
  
  static String g(Bundle paramBundle) {
    return paramBundle.getString("google.c.a.m_l");
  }
  
  static String h(Bundle paramBundle) {
    return paramBundle.getString("google.c.a.ts");
  }
  
  static a.c i(Bundle paramBundle) {
    return (paramBundle != null && i0.a(paramBundle)) ? a.c.f : a.c.d;
  }
  
  static String j(Bundle paramBundle) {
    return (true != i0.a(paramBundle)) ? "data" : "display";
  }
  
  static long k(Bundle paramBundle) {
    if (paramBundle.containsKey("google.c.sender.id"))
      try {
        return Long.parseLong(paramBundle.getString("google.c.sender.id"));
      } catch (NumberFormatException null) {
        Log.w("FirebaseMessaging", "error parsing project number", numberFormatException);
      }  
    g g = g.k();
    String str3 = g.d().e();
    if (str3 != null)
      try {
        return Long.parseLong(str3);
      } catch (NumberFormatException numberFormatException1) {
        Log.w("FirebaseMessaging", "error parsing sender ID", numberFormatException1);
      }  
    String str2 = g.d().b();
    if (!str2.startsWith("1:"))
      try {
        return Long.parseLong(str2);
      } catch (NumberFormatException numberFormatException) {
        Log.w("FirebaseMessaging", "error parsing app ID", numberFormatException);
        return 0L;
      }  
    String[] arrayOfString = numberFormatException.split(":");
    if (arrayOfString.length < 2)
      return 0L; 
    String str1 = arrayOfString[1];
    return str1.isEmpty() ? 0L : Long.parseLong(str1);
  }
  
  static String l(Bundle paramBundle) {
    String str = paramBundle.getString("from");
    return (str != null && str.startsWith("/topics/")) ? str : null;
  }
  
  static int m(Bundle paramBundle) {
    Object object = paramBundle.get("google.ttl");
    if (object instanceof Integer)
      return ((Integer)object).intValue(); 
    if (object instanceof String)
      try {
        return Integer.parseInt((String)object);
      } catch (NumberFormatException numberFormatException) {
        object = String.valueOf(object);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(object).length() + 13);
        stringBuilder.append("Invalid TTL: ");
        stringBuilder.append((String)object);
        Log.w("FirebaseMessaging", stringBuilder.toString());
      }  
    return 0;
  }
  
  static String n(Bundle paramBundle) {
    return paramBundle.containsKey("google.c.a.udt") ? paramBundle.getString("google.c.a.udt") : null;
  }
  
  public static void o(Bundle paramBundle) {
    p(paramBundle);
    a("_no", paramBundle);
  }
  
  private static void p(Bundle paramBundle) {
    if (paramBundle == null)
      return; 
    if ("1".equals(paramBundle.getString("google.c.a.tc"))) {
      a a = (a)g.k().a(a.class);
      if (Log.isLoggable("FirebaseMessaging", 3))
        Log.d("FirebaseMessaging", "Received event with track-conversion=true. Setting user property and reengagement event"); 
      if (a != null) {
        String str = paramBundle.getString("google.c.a.c_id");
        a.a("fcm", "_ln", str);
        Bundle bundle = new Bundle();
        bundle.putString("source", "Firebase");
        bundle.putString("medium", "notification");
        bundle.putString("campaign", str);
        a.a("fcm", "_cmp", bundle);
        return;
      } 
      Log.w("FirebaseMessaging", "Unable to set user property for conversion tracking:  analytics library is missing");
      return;
    } 
    if (Log.isLoggable("FirebaseMessaging", 3))
      Log.d("FirebaseMessaging", "Received event with track-conversion=false. Do not set user property"); 
  }
  
  public static boolean q(Bundle paramBundle) {
    return (paramBundle == null) ? false : "1".equals(paramBundle.getString("google.c.a.e"));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */