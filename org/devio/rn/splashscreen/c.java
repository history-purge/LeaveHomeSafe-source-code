package org.devio.rn.splashscreen;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.os.Build;
import java.lang.ref.WeakReference;

public class c {
  private static Dialog a;
  
  private static WeakReference<Activity> b;
  
  public static void a(Activity paramActivity) {
    Activity activity = paramActivity;
    if (paramActivity == null) {
      WeakReference<Activity> weakReference = b;
      if (weakReference == null)
        return; 
      activity = weakReference.get();
    } 
    if (activity == null)
      return; 
    activity.runOnUiThread(new b(activity));
  }
  
  public static void a(Activity paramActivity, int paramInt) {
    if (paramActivity == null)
      return; 
    b = new WeakReference<Activity>(paramActivity);
    paramActivity.runOnUiThread(new a(paramActivity, paramInt));
  }
  
  public static void a(Activity paramActivity, boolean paramBoolean) {
    int i;
    if (paramBoolean) {
      i = b.SplashScreen_Fullscreen;
    } else {
      i = b.SplashScreen_SplashTheme;
    } 
    a(paramActivity, i);
  }
  
  public static void b(Activity paramActivity) {
    a(paramActivity, false);
  }
  
  class a implements Runnable {
    a(c this$0, int param1Int) {}
    
    public void run() {
      if (!this.c.isFinishing()) {
        c.a(new Dialog((Context)this.c, this.d));
        c.a().setContentView(a.launch_screen);
        c.a().setCancelable(false);
        if (!c.a().isShowing())
          c.a().show(); 
      } 
    }
  }
  
  class b implements Runnable {
    b(c this$0) {}
    
    public void run() {
      if (c.a() != null && c.a().isShowing()) {
        boolean bool = false;
        if (Build.VERSION.SDK_INT >= 17)
          bool = this.c.isDestroyed(); 
        if (!this.c.isFinishing() && !bool)
          c.a().dismiss(); 
        c.a((Dialog)null);
      } 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/devio/rn/splashscreen/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */