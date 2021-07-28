package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import e.f.a.e.l.a;
import java.util.concurrent.TimeUnit;

final class y0 {
  private static final long a = TimeUnit.MINUTES.toMillis(1L);
  
  private static final Object b = new Object();
  
  private static a c;
  
  static ComponentName a(Context paramContext, Intent paramIntent) {
    synchronized (b) {
      a(paramContext);
      boolean bool = b(paramIntent);
      a(paramIntent, true);
      ComponentName componentName = paramContext.startService(paramIntent);
      if (componentName == null)
        return null; 
      if (!bool)
        c.a(a); 
      return componentName;
    } 
  }
  
  private static void a(Context paramContext) {
    if (c == null) {
      c = new a(paramContext, 1, "wake:com.google.firebase.iid.WakeLockHolder");
      c.a(true);
    } 
  }
  
  static void a(Intent paramIntent) {
    synchronized (b) {
      if (c != null && b(paramIntent)) {
        a(paramIntent, false);
        c.a();
      } 
      return;
    } 
  }
  
  private static void a(Intent paramIntent, boolean paramBoolean) {
    paramIntent.putExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", paramBoolean);
  }
  
  static boolean b(Intent paramIntent) {
    return paramIntent.getBooleanExtra("com.google.firebase.iid.WakeLockHolder.wakefulintent", false);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/y0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */