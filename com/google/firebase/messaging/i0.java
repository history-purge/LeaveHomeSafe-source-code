package com.google.firebase.messaging;

import android.content.res.Resources;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;

public class i0 {
  private final Bundle a;
  
  public i0(Bundle paramBundle) {
    if (paramBundle != null) {
      this.a = new Bundle(paramBundle);
      return;
    } 
    throw new NullPointerException("data");
  }
  
  public static boolean a(Bundle paramBundle) {
    return ("1".equals(paramBundle.getString("gcm.n.e")) || "1".equals(paramBundle.getString(k("gcm.n.e"))));
  }
  
  private static int h(String paramString) {
    int i = Color.parseColor(paramString);
    if (i != -16777216)
      return i; 
    throw new IllegalArgumentException("Transparent color is invalid");
  }
  
  private static boolean i(String paramString) {
    return (paramString.startsWith("google.c.a.") || paramString.equals("from"));
  }
  
  private static boolean j(String paramString) {
    return (paramString.startsWith("google.c.") || paramString.startsWith("gcm.n.") || paramString.startsWith("gcm.notification."));
  }
  
  private static String k(String paramString) {
    return !paramString.startsWith("gcm.n.") ? paramString : paramString.replace("gcm.n.", "gcm.notification.");
  }
  
  private String l(String paramString) {
    if (!this.a.containsKey(paramString) && paramString.startsWith("gcm.n.")) {
      String str = k(paramString);
      if (this.a.containsKey(str))
        return str; 
    } 
    return paramString;
  }
  
  private static String m(String paramString) {
    String str = paramString;
    if (paramString.startsWith("gcm.n."))
      str = paramString.substring(6); 
    return str;
  }
  
  public String a(Resources paramResources, String paramString1, String paramString2) {
    String str1;
    String str2 = e(paramString2);
    if (TextUtils.isEmpty(str2))
      return null; 
    int i = paramResources.getIdentifier(str2, "string", paramString1);
    if (i == 0) {
      str1 = m(String.valueOf(paramString2).concat("_loc_key"));
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str1).length() + 49 + String.valueOf(paramString2).length());
      stringBuilder.append(str1);
      stringBuilder.append(" resource not found: ");
      stringBuilder.append(paramString2);
      stringBuilder.append(" Default value will be used.");
      Log.w("NotificationParams", stringBuilder.toString());
      return null;
    } 
    Object[] arrayOfObject = d(paramString2);
    if (arrayOfObject == null)
      return str1.getString(i); 
    try {
      return str1.getString(i, arrayOfObject);
    } catch (MissingFormatArgumentException missingFormatArgumentException) {
      paramString2 = m(paramString2);
      String str = Arrays.toString(arrayOfObject);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString2).length() + 58 + String.valueOf(str).length());
      stringBuilder.append("Missing format argument for ");
      stringBuilder.append(paramString2);
      stringBuilder.append(": ");
      stringBuilder.append(str);
      stringBuilder.append(" Default value will be used.");
      Log.w("NotificationParams", stringBuilder.toString(), missingFormatArgumentException);
      return null;
    } 
  }
  
  public boolean a(String paramString) {
    paramString = g(paramString);
    return ("1".equals(paramString) || Boolean.parseBoolean(paramString));
  }
  
  int[] a() {
    String str;
    JSONArray jSONArray = c("gcm.n.light_settings");
    if (jSONArray == null)
      return null; 
    try {
      if (jSONArray.length() == 3)
        return new int[] { h(jSONArray.optString(0)), jSONArray.optInt(1), jSONArray.optInt(2) }; 
      throw new JSONException("lightSettings don't have all three fields");
    } catch (JSONException jSONException) {
      str = String.valueOf(jSONArray);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 58);
      stringBuilder.append("LightSettings is invalid: ");
      stringBuilder.append(str);
      stringBuilder.append(". Skipping setting LightSettings");
      str = stringBuilder.toString();
    } catch (IllegalArgumentException illegalArgumentException) {
      str = String.valueOf(str);
      String str1 = illegalArgumentException.getMessage();
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 60 + String.valueOf(str1).length());
      stringBuilder.append("LightSettings is invalid: ");
      stringBuilder.append(str);
      stringBuilder.append(". ");
      stringBuilder.append(str1);
      stringBuilder.append(". Skipping setting LightSettings");
      str = stringBuilder.toString();
    } 
    Log.w("NotificationParams", str);
    return null;
  }
  
  public Uri b() {
    String str2 = g("gcm.n.link_android");
    String str1 = str2;
    if (TextUtils.isEmpty(str2))
      str1 = g("gcm.n.link"); 
    return !TextUtils.isEmpty(str1) ? Uri.parse(str1) : null;
  }
  
  public Integer b(String paramString) {
    String str = g(paramString);
    if (!TextUtils.isEmpty(str))
      try {
        int i = Integer.parseInt(str);
        return Integer.valueOf(i);
      } catch (NumberFormatException numberFormatException) {
        paramString = m(paramString);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 38 + String.valueOf(str).length());
        stringBuilder.append("Couldn't parse value of ");
        stringBuilder.append(paramString);
        stringBuilder.append("(");
        stringBuilder.append(str);
        stringBuilder.append(") into an int");
        Log.w("NotificationParams", stringBuilder.toString());
      }  
    return null;
  }
  
  public String b(Resources paramResources, String paramString1, String paramString2) {
    String str = g(paramString2);
    return !TextUtils.isEmpty(str) ? str : a(paramResources, paramString1, paramString2);
  }
  
  public String c() {
    return g("gcm.n.android_channel_id");
  }
  
  public JSONArray c(String paramString) {
    String str = g(paramString);
    if (!TextUtils.isEmpty(str))
      try {
        return new JSONArray(str);
      } catch (JSONException jSONException) {
        paramString = m(paramString);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 50 + String.valueOf(str).length());
        stringBuilder.append("Malformed JSON for key ");
        stringBuilder.append(paramString);
        stringBuilder.append(": ");
        stringBuilder.append(str);
        stringBuilder.append(", falling back to default");
        Log.w("NotificationParams", stringBuilder.toString());
      }  
    return null;
  }
  
  Integer d() {
    String str;
    Integer integer = b("gcm.n.notification_count");
    if (integer == null)
      return null; 
    if (integer.intValue() < 0) {
      str = String.valueOf(integer);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 67);
      stringBuilder.append("notificationCount is invalid: ");
      stringBuilder.append(str);
      stringBuilder.append(". Skipping setting notificationCount.");
      Log.w("FirebaseMessaging", stringBuilder.toString());
      return null;
    } 
    return (Integer)str;
  }
  
  public Object[] d(String paramString) {
    JSONArray jSONArray = c(String.valueOf(paramString).concat("_loc_args"));
    if (jSONArray == null)
      return null; 
    String[] arrayOfString = new String[jSONArray.length()];
    for (int i = 0; i < arrayOfString.length; i++)
      arrayOfString[i] = jSONArray.optString(i); 
    return (Object[])arrayOfString;
  }
  
  Integer e() {
    String str;
    Integer integer = b("gcm.n.notification_priority");
    if (integer == null)
      return null; 
    if (integer.intValue() < -2 || integer.intValue() > 2) {
      str = String.valueOf(integer);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 72);
      stringBuilder.append("notificationPriority is invalid ");
      stringBuilder.append(str);
      stringBuilder.append(". Skipping setting notificationPriority.");
      Log.w("FirebaseMessaging", stringBuilder.toString());
      return null;
    } 
    return (Integer)str;
  }
  
  public String e(String paramString) {
    return g(String.valueOf(paramString).concat("_loc_key"));
  }
  
  public Long f(String paramString) {
    String str = g(paramString);
    if (!TextUtils.isEmpty(str))
      try {
        long l = Long.parseLong(str);
        return Long.valueOf(l);
      } catch (NumberFormatException numberFormatException) {
        paramString = m(paramString);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(paramString).length() + 38 + String.valueOf(str).length());
        stringBuilder.append("Couldn't parse value of ");
        stringBuilder.append(paramString);
        stringBuilder.append("(");
        stringBuilder.append(str);
        stringBuilder.append(") into a long");
        Log.w("NotificationParams", stringBuilder.toString());
      }  
    return null;
  }
  
  public String f() {
    String str2 = g("gcm.n.sound2");
    String str1 = str2;
    if (TextUtils.isEmpty(str2))
      str1 = g("gcm.n.sound"); 
    return str1;
  }
  
  public String g(String paramString) {
    return this.a.getString(l(paramString));
  }
  
  public long[] g() {
    StringBuilder stringBuilder;
    JSONArray jSONArray = c("gcm.n.vibrate_timings");
    if (jSONArray == null)
      return null; 
    try {
      if (jSONArray.length() > 1) {
        long[] arrayOfLong = new long[jSONArray.length()];
        for (int i = 0; i < arrayOfLong.length; i++)
          arrayOfLong[i] = jSONArray.optLong(i); 
      } else {
        throw new JSONException("vibrateTimings have invalid length");
      } 
    } catch (JSONException|NumberFormatException jSONException) {
      String str = String.valueOf(jSONArray);
      stringBuilder = new StringBuilder(String.valueOf(str).length() + 74);
      stringBuilder.append("User defined vibrateTimings is invalid: ");
      stringBuilder.append(str);
      stringBuilder.append(". Skipping setting vibrateTimings.");
      Log.w("NotificationParams", stringBuilder.toString());
      return null;
    } 
    return (long[])stringBuilder;
  }
  
  Integer h() {
    String str;
    Integer integer = b("gcm.n.visibility");
    if (integer == null)
      return null; 
    if (integer.intValue() < -1 || integer.intValue() > 1) {
      str = String.valueOf(integer);
      StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 53);
      stringBuilder.append("visibility is invalid: ");
      stringBuilder.append(str);
      stringBuilder.append(". Skipping setting visibility.");
      Log.w("NotificationParams", stringBuilder.toString());
      return null;
    } 
    return (Integer)str;
  }
  
  public Bundle i() {
    Bundle bundle = new Bundle(this.a);
    for (String str : this.a.keySet()) {
      if (!i(str))
        bundle.remove(str); 
    } 
    return bundle;
  }
  
  public Bundle j() {
    Bundle bundle = new Bundle(this.a);
    for (String str : this.a.keySet()) {
      if (j(str))
        bundle.remove(str); 
    } 
    return bundle;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/i0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */