package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Base64;
import e.f.a.c.i.a0.a;
import e.f.a.c.i.n;
import e.f.a.c.i.r;

public class AlarmManagerSchedulerBroadcastReceiver extends BroadcastReceiver {
  public void onReceive(Context paramContext, Intent paramIntent) {
    String str1 = paramIntent.getData().getQueryParameter("backendName");
    String str2 = paramIntent.getData().getQueryParameter("extras");
    int i = Integer.valueOf(paramIntent.getData().getQueryParameter("priority")).intValue();
    int j = paramIntent.getExtras().getInt("attemptNumber");
    r.a(paramContext);
    n.a a = n.d();
    a.a(str1);
    a.a(a.a(i));
    if (str2 != null)
      a.a(Base64.decode(str2, 0)); 
    r.b().a().b(a.a(), j, b.c);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/AlarmManagerSchedulerBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */