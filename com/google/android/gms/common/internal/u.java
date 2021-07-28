package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import com.google.android.gms.common.api.internal.i;

public abstract class u implements DialogInterface.OnClickListener {
  public static u a(Activity paramActivity, Intent paramIntent, int paramInt) {
    return new w(paramIntent, paramActivity, paramInt);
  }
  
  public static u a(i parami, Intent paramIntent, int paramInt) {
    return new x(paramIntent, parami, 2);
  }
  
  protected abstract void a();
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt) {
    Exception exception;
    try {
      a();
      paramDialogInterface.dismiss();
      return;
    } catch (ActivityNotFoundException activityNotFoundException) {
      String str = "Failed to start resolution intent.";
      if (Build.FINGERPRINT.contains("generic"))
        str = "Failed to start resolution intent.".concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store."); 
      Log.e("DialogRedirect", str, (Throwable)activityNotFoundException);
      paramDialogInterface.dismiss();
      return;
    } finally {}
    paramDialogInterface.dismiss();
    throw exception;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */