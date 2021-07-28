package com.dieam.reactnativepushnotification.modules;

import android.app.Application;
import android.app.NotificationManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.facebook.react.bridge.ReactContext;
import e.e.o.p;
import e.e.o.r;

public class RNPushNotificationActions extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramContext.getPackageName());
    stringBuilder.append(".ACTION_");
    String str = stringBuilder.toString();
    Log.i("RNPushNotification", "RNPushNotificationBootEventReceiver loading scheduled notifications");
    if (paramIntent.getAction() != null) {
      if (!paramIntent.getAction().startsWith(str))
        return; 
      Bundle bundle = paramIntent.getBundleExtra("notification");
      NotificationManager notificationManager = (NotificationManager)paramContext.getSystemService("notification");
      int i = Integer.parseInt(bundle.getString("id"));
      if (bundle.getBoolean("autoCancel", true))
        if (bundle.containsKey("tag")) {
          notificationManager.cancel(bundle.getString("tag"), i);
        } else {
          notificationManager.cancel(i);
        }  
      if (bundle.getBoolean("invokeApp", true)) {
        (new c((Application)paramContext.getApplicationContext())).a(bundle);
        return;
      } 
      (new Handler(Looper.getMainLooper())).post(new a(this, paramContext, bundle));
    } 
  }
  
  class a implements Runnable {
    a(RNPushNotificationActions this$0, Context param1Context, Bundle param1Bundle) {}
    
    public void run() {
      r r = ((p)this.c.getApplicationContext()).a().h();
      ReactContext reactContext = r.b();
      if (reactContext != null) {
        (new d(reactContext)).c(this.d);
        return;
      } 
      r.a(new a(this, r));
      if (!r.e())
        r.a(); 
    }
    
    class a implements r.k {
      a(RNPushNotificationActions.a this$0, r param2r) {}
      
      public void a(ReactContext param2ReactContext) {
        (new d(param2ReactContext)).c(this.b.d);
        this.a.b(this);
      }
    }
  }
  
  class a implements r.k {
    a(RNPushNotificationActions this$0, r param1r) {}
    
    public void a(ReactContext param1ReactContext) {
      (new d(param1ReactContext)).c(this.b.d);
      this.a.b(this);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/dieam/reactnativepushnotification/modules/RNPushNotificationActions.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */