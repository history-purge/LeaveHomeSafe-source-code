package com.google.firebase.messaging;

import android.app.Activity;
import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

class q implements Application.ActivityLifecycleCallbacks {
  private final Set<Intent> c = Collections.newSetFromMap(new WeakHashMap<Intent, Boolean>());
  
  public void onActivityCreated(Activity paramActivity, Bundle paramBundle) {
    Intent intent = paramActivity.getIntent();
    if (intent != null) {
      if (!this.c.add(intent))
        return; 
      Bundle bundle = intent.getExtras();
      if (bundle != null) {
        bundle = bundle.getBundle("gcm.n.analytics_data");
        if (g0.q(bundle))
          g0.o(bundle); 
      } 
    } 
  }
  
  public void onActivityDestroyed(Activity paramActivity) {}
  
  public void onActivityPaused(Activity paramActivity) {
    if (paramActivity.isFinishing())
      this.c.remove(paramActivity.getIntent()); 
  }
  
  public void onActivityResumed(Activity paramActivity) {}
  
  public void onActivitySaveInstanceState(Activity paramActivity, Bundle paramBundle) {}
  
  public void onActivityStarted(Activity paramActivity) {}
  
  public void onActivityStopped(Activity paramActivity) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */