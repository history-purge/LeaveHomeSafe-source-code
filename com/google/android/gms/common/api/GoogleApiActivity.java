package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.internal.g;
import com.google.android.gms.common.internal.q;
import e.f.a.e.e.a;
import e.f.a.e.e.d;

@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {
  private int c = 0;
  
  @RecentlyNonNull
  public static PendingIntent a(@RecentlyNonNull Context paramContext, @RecentlyNonNull PendingIntent paramPendingIntent, @RecentlyNonNull int paramInt) {
    return PendingIntent.getActivity(paramContext, 0, a(paramContext, paramPendingIntent, paramInt, true), 134217728);
  }
  
  @RecentlyNonNull
  public static Intent a(@RecentlyNonNull Context paramContext, @RecentlyNonNull PendingIntent paramPendingIntent, @RecentlyNonNull int paramInt, @RecentlyNonNull boolean paramBoolean) {
    Intent intent = new Intent(paramContext, GoogleApiActivity.class);
    intent.putExtra("pending_intent", (Parcelable)paramPendingIntent);
    intent.putExtra("failing_client_id", paramInt);
    intent.putExtra("notify_manager", paramBoolean);
    return intent;
  }
  
  protected void onActivityResult(@RecentlyNonNull int paramInt1, @RecentlyNonNull int paramInt2, @RecentlyNonNull Intent paramIntent) {
    g g;
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt1 == 1) {
      boolean bool = getIntent().getBooleanExtra("notify_manager", true);
      this.c = 0;
      setResult(paramInt2, paramIntent);
      if (bool) {
        g = g.a((Context)this);
        if (paramInt2 != -1) {
          if (paramInt2 == 0)
            g.b(new a(13, null), getIntent().getIntExtra("failing_client_id", -1)); 
        } else {
          g.b();
        } 
      } 
    } else if (paramInt1 == 2) {
      this.c = 0;
      setResult(paramInt2, (Intent)g);
    } 
    finish();
  }
  
  public void onCancel(@RecentlyNonNull DialogInterface paramDialogInterface) {
    this.c = 0;
    setResult(0);
    finish();
  }
  
  protected void onCreate(Bundle paramBundle) {
    super.onCreate(paramBundle);
    if (paramBundle != null)
      this.c = paramBundle.getInt("resolution"); 
    if (this.c != 1) {
      String str;
      paramBundle = getIntent().getExtras();
      if (paramBundle == null) {
        str = "Activity started without extras";
      } else {
        PendingIntent pendingIntent = (PendingIntent)str.get("pending_intent");
        Integer integer = (Integer)str.get("error_code");
        if (pendingIntent == null && integer == null) {
          str = "Activity started without resolution";
        } else {
          if (pendingIntent != null) {
            try {
              startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
              this.c = 1;
              return;
            } catch (ActivityNotFoundException activityNotFoundException) {
            
            } catch (android.content.IntentSender.SendIntentException sendIntentException) {
              Log.e("GoogleApiActivity", "Failed to launch pendingIntent", (Throwable)sendIntentException);
            } 
          } else {
            q.a(activityNotFoundException);
            int i = ((Integer)activityNotFoundException).intValue();
            d.a().b(this, i, 2, this);
            this.c = 1;
            return;
          } 
          finish();
        } 
      } 
      Log.e("GoogleApiActivity", (String)sendIntentException);
    } else {
      return;
    } 
    finish();
  }
  
  protected void onSaveInstanceState(@RecentlyNonNull Bundle paramBundle) {
    paramBundle.putInt("resolution", this.c);
    super.onSaveInstanceState(paramBundle);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/GoogleApiActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */