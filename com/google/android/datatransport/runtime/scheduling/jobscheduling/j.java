package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Base64;
import e.f.a.c.i.a0.a;
import e.f.a.c.i.n;
import e.f.a.c.i.v.a;
import e.f.a.c.i.x.j.y;
import e.f.a.c.i.z.a;

public class j implements s {
  private final Context a;
  
  private final y b;
  
  private AlarmManager c;
  
  private final n d;
  
  private final a e;
  
  j(Context paramContext, y paramy, AlarmManager paramAlarmManager, a parama, n paramn) {
    this.a = paramContext;
    this.b = paramy;
    this.c = paramAlarmManager;
    this.e = parama;
    this.d = paramn;
  }
  
  public j(Context paramContext, y paramy, a parama, n paramn) {
    this(paramContext, paramy, (AlarmManager)paramContext.getSystemService("alarm"), parama, paramn);
  }
  
  public void a(n paramn, int paramInt) {
    a(paramn, paramInt, false);
  }
  
  public void a(n paramn, int paramInt, boolean paramBoolean) {
    Uri.Builder builder = new Uri.Builder();
    builder.appendQueryParameter("backendName", paramn.a());
    builder.appendQueryParameter("priority", String.valueOf(a.a(paramn.c())));
    if (paramn.b() != null)
      builder.appendQueryParameter("extras", Base64.encodeToString(paramn.b(), 0)); 
    Intent intent = new Intent(this.a, AlarmManagerSchedulerBroadcastReceiver.class);
    intent.setData(builder.build());
    intent.putExtra("attemptNumber", paramInt);
    if (!paramBoolean && a(intent)) {
      a.a("AlarmManagerScheduler", "Upload for context %s is already scheduled. Returning...", paramn);
      return;
    } 
    long l1 = this.b.b(paramn);
    long l2 = this.d.a(paramn.c(), l1, paramInt);
    a.a("AlarmManagerScheduler", "Scheduling upload for context %s in %dms(Backend next call timestamp %d). Attempt %d", new Object[] { paramn, Long.valueOf(l2), Long.valueOf(l1), Integer.valueOf(paramInt) });
    PendingIntent pendingIntent = PendingIntent.getBroadcast(this.a, 0, intent, 0);
    this.c.set(3, this.e.a() + l2, pendingIntent);
  }
  
  boolean a(Intent paramIntent) {
    Context context = this.a;
    boolean bool = false;
    if (PendingIntent.getBroadcast(context, 0, paramIntent, 536870912) != null)
      bool = true; 
    return bool;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/datatransport/runtime/scheduling/jobscheduling/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */