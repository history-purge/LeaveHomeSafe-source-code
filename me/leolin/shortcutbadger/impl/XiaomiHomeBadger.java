package me.leolin.shortcutbadger.impl;

import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Build;
import h.a.a.a;
import h.a.a.b;
import h.a.a.d.a;
import java.lang.reflect.Field;
import java.util.Arrays;
import java.util.List;

@Deprecated
public class XiaomiHomeBadger implements a {
  private ResolveInfo a;
  
  @TargetApi(16)
  private void a(Context paramContext, int paramInt) {
    if (this.a == null) {
      Intent intent = new Intent("android.intent.action.MAIN");
      intent.addCategory("android.intent.category.HOME");
      this.a = paramContext.getPackageManager().resolveActivity(intent, 65536);
    } 
    if (this.a != null) {
      NotificationManager notificationManager = (NotificationManager)paramContext.getSystemService("notification");
      Notification notification = (new Notification.Builder(paramContext)).setContentTitle("").setContentText("").setSmallIcon(this.a.getIconResource()).build();
      try {
        Object object = notification.getClass().getDeclaredField("extraNotification").get(notification);
        object.getClass().getDeclaredMethod("setMessageCount", new Class[] { int.class }).invoke(object, new Object[] { Integer.valueOf(paramInt) });
        notificationManager.notify(0, notification);
        return;
      } catch (Exception exception) {
        throw new b("not able to set badge", exception);
      } 
    } 
  }
  
  public List<String> a() {
    return Arrays.asList(new String[] { "com.miui.miuilite", "com.miui.home", "com.miui.miuihome", "com.miui.miuihome2", "com.miui.mihome", "com.miui.mihome2", "com.i.miui.launcher" });
  }
  
  public void a(Context paramContext, ComponentName paramComponentName, int paramInt) {
    String str = "";
    try {
      Object object = Class.forName("android.app.MiuiNotification").newInstance();
      Field field = object.getClass().getDeclaredField("messageCount");
      field.setAccessible(true);
      if (paramInt == 0) {
        String str1 = "";
      } else {
        try {
          Integer integer = Integer.valueOf(paramInt);
          field.set(object, String.valueOf(integer));
        } catch (Exception exception) {
          field.set(object, Integer.valueOf(paramInt));
        } 
        if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi"))
          a(paramContext, paramInt); 
      } 
      field.set(object, String.valueOf(exception));
    } catch (Exception exception) {
      Integer integer;
      Intent intent = new Intent("android.intent.action.APPLICATION_MESSAGE_UPDATE");
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramComponentName.getPackageName());
      stringBuilder.append("/");
      stringBuilder.append(paramComponentName.getClassName());
      intent.putExtra("android.intent.extra.update_application_component_name", stringBuilder.toString());
      if (paramInt == 0) {
        String str1 = str;
      } else {
        integer = Integer.valueOf(paramInt);
      } 
      intent.putExtra("android.intent.extra.update_application_message_text", String.valueOf(integer));
      try {
        a.c(paramContext, intent);
      } catch (b b) {}
    } 
    if (Build.MANUFACTURER.equalsIgnoreCase("Xiaomi"))
      a(paramContext, paramInt); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/me/leolin/shortcutbadger/impl/XiaomiHomeBadger.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */