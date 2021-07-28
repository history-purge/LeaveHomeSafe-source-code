package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import b.g.e.a;

public class a extends a {
  private static c c;
  
  public static void a(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramActivity.finishAffinity();
      return;
    } 
    paramActivity.finish();
  }
  
  public static void a(Activity paramActivity, Intent paramIntent, int paramInt, Bundle paramBundle) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramActivity.startActivityForResult(paramIntent, paramInt, paramBundle);
      return;
    } 
    paramActivity.startActivityForResult(paramIntent, paramInt);
  }
  
  public static void a(Activity paramActivity, IntentSender paramIntentSender, int paramInt1, Intent paramIntent, int paramInt2, int paramInt3, int paramInt4, Bundle paramBundle) {
    if (Build.VERSION.SDK_INT >= 16) {
      paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4, paramBundle);
      return;
    } 
    paramActivity.startIntentSenderForResult(paramIntentSender, paramInt1, paramIntent, paramInt2, paramInt3, paramInt4);
  }
  
  public static void a(Activity paramActivity, String[] paramArrayOfString, int paramInt) {
    c c1 = c;
    if (c1 != null && c1.a(paramActivity, paramArrayOfString, paramInt))
      return; 
    if (Build.VERSION.SDK_INT >= 23) {
      if (paramActivity instanceof d)
        ((d)paramActivity).a(paramInt); 
      paramActivity.requestPermissions(paramArrayOfString, paramInt);
      return;
    } 
    if (paramActivity instanceof b)
      (new Handler(Looper.getMainLooper())).post(new a(paramArrayOfString, paramActivity, paramInt)); 
  }
  
  public static void b(Activity paramActivity) {
    if (Build.VERSION.SDK_INT >= 28 || !c.a(paramActivity)) {
      paramActivity.recreate();
      return;
    } 
  }
  
  class a implements Runnable {
    a(a this$0, Activity param1Activity, int param1Int) {}
    
    public void run() {
      int[] arrayOfInt = new int[this.c.length];
      PackageManager packageManager = this.d.getPackageManager();
      String str = this.d.getPackageName();
      int j = this.c.length;
      for (int i = 0; i < j; i++)
        arrayOfInt[i] = packageManager.checkPermission(this.c[i], str); 
      ((a.b)this.d).onRequestPermissionsResult(this.e, this.c, arrayOfInt);
    }
  }
  
  public static interface b {
    void onRequestPermissionsResult(int param1Int, String[] param1ArrayOfString, int[] param1ArrayOfint);
  }
  
  public static interface c {
    boolean a(Activity param1Activity, String[] param1ArrayOfString, int param1Int);
  }
  
  public static interface d {
    void a(int param1Int);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/core/app/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */