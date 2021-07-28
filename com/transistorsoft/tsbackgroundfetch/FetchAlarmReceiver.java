package com.transistorsoft.tsbackgroundfetch;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.PowerManager;
import android.util.Log;

public class FetchAlarmReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    PowerManager powerManager = (PowerManager)paramContext.getSystemService("power");
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("TSBackgroundFetch::");
    stringBuilder.append(paramIntent.getAction());
    PowerManager.WakeLock wakeLock = powerManager.newWakeLock(1, stringBuilder.toString());
    wakeLock.acquire((a.f + 4000));
    a a = new a(paramContext, paramIntent.getAction(), new a(this, wakeLock), 0);
    b.a(paramContext.getApplicationContext()).a(a);
  }
  
  class a implements FetchJobService.b {
    a(FetchAlarmReceiver this$0, PowerManager.WakeLock param1WakeLock) {}
    
    public void finish() {
      if (this.a.isHeld()) {
        this.a.release();
        Log.d("TSBackgroundFetch", "- FetchAlarmReceiver finish");
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/transistorsoft/tsbackgroundfetch/FetchAlarmReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */