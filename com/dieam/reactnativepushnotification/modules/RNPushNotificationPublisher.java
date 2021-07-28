package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import java.security.SecureRandom;

public class RNPushNotificationPublisher extends BroadcastReceiver {
  private void a(Context paramContext, Bundle paramBundle) {
    if (paramBundle.getString("id") == null)
      paramBundle.putString("id", String.valueOf((new SecureRandom()).nextInt())); 
    c c = new c((Application)paramContext.getApplicationContext());
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("sendNotification: ");
    stringBuilder.append(paramBundle);
    Log.v("RNPushNotification", stringBuilder.toString());
    c.d(paramBundle);
  }
  
  public void onReceive(Context paramContext, Intent paramIntent) {
    int i = paramIntent.getIntExtra("notificationId", 0);
    long l = System.currentTimeMillis();
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("NotificationPublisher: Prepare To Publish: ");
    stringBuilder.append(i);
    stringBuilder.append(", Now Time: ");
    stringBuilder.append(l);
    Log.i("RNPushNotification", stringBuilder.toString());
    Bundle bundle = paramIntent.getExtras();
    stringBuilder = new StringBuilder();
    stringBuilder.append("onMessageReceived: ");
    stringBuilder.append(bundle);
    Log.v("RNPushNotification", stringBuilder.toString());
    a(paramContext, bundle);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/dieam/reactnativepushnotification/modules/RNPushNotificationPublisher.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */