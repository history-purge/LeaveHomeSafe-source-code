package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import java.util.Set;

public class RNPushNotificationBootEventReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    Log.i("RNPushNotification", "RNPushNotificationBootEventReceiver loading scheduled notifications");
    if ("android.intent.action.BOOT_COMPLETED".equals(paramIntent.getAction())) {
      SharedPreferences sharedPreferences = paramContext.getSharedPreferences("rn_push_notification", 0);
      Set set = sharedPreferences.getAll().keySet();
      c c = new c((Application)paramContext.getApplicationContext());
      for (String str : set) {
        try {
          String str1 = sharedPreferences.getString(str, null);
          if (str1 != null) {
            a a = a.a(str1);
            if (a.a() < System.currentTimeMillis()) {
              StringBuilder stringBuilder1 = new StringBuilder();
              stringBuilder1.append("RNPushNotificationBootEventReceiver: Showing notification for ");
              stringBuilder1.append(a.b());
              Log.i("RNPushNotification", stringBuilder1.toString());
              c.d(a.h());
              continue;
            } 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("RNPushNotificationBootEventReceiver: Scheduling notification for ");
            stringBuilder.append(a.b());
            Log.i("RNPushNotification", stringBuilder.toString());
            c.c(a.h());
          } 
        } catch (Exception exception) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Problem with boot receiver loading notification ");
          stringBuilder.append(str);
          Log.e("RNPushNotification", stringBuilder.toString(), exception);
        } 
      } 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/dieam/reactnativepushnotification/modules/RNPushNotificationBootEventReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */