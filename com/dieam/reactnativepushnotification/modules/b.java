package com.dieam.reactnativepushnotification.modules;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import b.g.e.d.f;

class b {
  private static Bundle b;
  
  private Context a;
  
  public b(Context paramContext) {
    this.a = paramContext;
    if (b == null)
      try {
        b = (paramContext.getPackageManager().getApplicationInfo(paramContext.getPackageName(), 128)).metaData;
        return;
      } catch (android.content.pm.PackageManager.NameNotFoundException nameNotFoundException) {
        nameNotFoundException.printStackTrace();
        Log.e("RNPushNotification", "Error reading application meta, falling back to defaults");
        b = new Bundle();
      }  
  }
  
  private String a(String paramString1, String paramString2) {
    try {
      String str = b.getString(paramString1);
      if (str != null) {
        int i = str.length();
        if (i > 0)
          return str; 
      } 
    } catch (Exception exception) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Unable to find ");
      stringBuilder.append(paramString1);
      stringBuilder.append(" in manifest. Falling back to default");
      Log.w("RNPushNotification", stringBuilder.toString());
    } 
    return paramString2;
  }
  
  public String a(String paramString) {
    String str = a("com.dieam.reactnativepushnotification.notification_channel_description", "");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("com.dieam.reactnativepushnotification.notification_channel_description.");
    stringBuilder.append(paramString);
    return a(stringBuilder.toString(), str);
  }
  
  public boolean a() {
    try {
      return b.getBoolean("com.dieam.reactnativepushnotification.channel_create_default", true);
    } catch (Exception exception) {
      Log.w("RNPushNotification", "Unable to find com.dieam.reactnativepushnotification.channel_create_default in manifest. Falling back to default");
      return true;
    } 
  }
  
  public int b() {
    try {
      null = b.getInt("com.dieam.reactnativepushnotification.notification_color");
      return f.a(this.a.getResources(), null, null);
    } catch (Exception exception) {
      Log.w("RNPushNotification", "Unable to find com.dieam.reactnativepushnotification.notification_color in manifest. Falling back to default");
      return -1;
    } 
  }
  
  public String b(String paramString) {
    String str = a("com.dieam.reactnativepushnotification.notification_channel_name", "rn-push-notification-channel");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("com.dieam.reactnativepushnotification.notification_channel_name.");
    stringBuilder.append(paramString);
    return a(stringBuilder.toString(), str);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/dieam/reactnativepushnotification/modules/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */