package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import androidx.fragment.app.e;
import b.n.b.b;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.f;

@KeepName
public class SignInHubActivity extends e {
  private static boolean v = false;
  
  private boolean q = false;
  
  private SignInConfiguration r;
  
  private boolean s;
  
  private int t;
  
  private Intent u;
  
  private final void b(int paramInt) {
    Status status = new Status(paramInt);
    Intent intent = new Intent();
    intent.putExtra("googleSignInStatus", (Parcelable)status);
    setResult(0, intent);
    finish();
    v = false;
  }
  
  private final void p() {
    l().a(0, null, new a(null));
    v = false;
  }
  
  public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent) {
    return true;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent) {
    if (this.q)
      return; 
    setResult(0);
    if (paramInt1 != 40962)
      return; 
    if (paramIntent != null) {
      SignInAccount signInAccount = (SignInAccount)paramIntent.getParcelableExtra("signInAccount");
      if (signInAccount != null && signInAccount.b() != null) {
        GoogleSignInAccount googleSignInAccount = signInAccount.b();
        q q = q.a((Context)this);
        GoogleSignInOptions googleSignInOptions = this.r.b();
        e.f.a.e.i.a.a.a(googleSignInAccount);
        q.a(googleSignInOptions, googleSignInAccount);
        paramIntent.removeExtra("signInAccount");
        paramIntent.putExtra("googleSignInAccount", (Parcelable)googleSignInAccount);
        this.s = true;
        this.t = paramInt2;
        this.u = paramIntent;
        p();
        return;
      } 
      if (paramIntent.hasExtra("errorCode")) {
        paramInt2 = paramIntent.getIntExtra("errorCode", 8);
        paramInt1 = paramInt2;
        if (paramInt2 == 13)
          paramInt1 = 12501; 
        b(paramInt1);
        return;
      } 
    } 
    b(8);
  }
  
  protected void onCreate(Bundle paramBundle) {
    String str1;
    super.onCreate(paramBundle);
    Intent intent = getIntent();
    String str2 = intent.getAction();
    e.f.a.e.i.a.a.a(str2);
    str2 = str2;
    if ("com.google.android.gms.auth.NO_IMPL".equals(str2)) {
      b(12500);
      return;
    } 
    if (!str2.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !str2.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
      str1 = String.valueOf(intent.getAction());
      if (str1.length() != 0) {
        str1 = "Unknown action: ".concat(str1);
      } else {
        str1 = new String("Unknown action: ");
      } 
      Log.e("AuthSignInClient", str1);
      finish();
      return;
    } 
    Bundle bundle = intent.getBundleExtra("config");
    e.f.a.e.i.a.a.a(bundle);
    SignInConfiguration signInConfiguration = (SignInConfiguration)bundle.getParcelable("config");
    if (signInConfiguration == null) {
      Log.e("AuthSignInClient", "Activity started with invalid configuration.");
      setResult(0);
      finish();
      return;
    } 
    this.r = signInConfiguration;
    if (str1 == null) {
      if (v) {
        setResult(0);
        b(12502);
        return;
      } 
      v = true;
      Intent intent1 = new Intent(str2);
      if (str2.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
        str1 = "com.google.android.gms";
      } else {
        str1 = getPackageName();
      } 
      intent1.setPackage(str1);
      intent1.putExtra("config", (Parcelable)this.r);
      try {
        startActivityForResult(intent1, 40962);
        return;
      } catch (ActivityNotFoundException activityNotFoundException) {
        this.q = true;
        Log.w("AuthSignInClient", "Could not launch sign in Intent. Google Play Service is probably being updated...");
        b(17);
        return;
      } 
    } 
    this.s = activityNotFoundException.getBoolean("signingInGoogleApiClients");
    if (this.s) {
      this.t = activityNotFoundException.getInt("signInResultCode");
      Intent intent1 = (Intent)activityNotFoundException.getParcelable("signInResultData");
      e.f.a.e.i.a.a.a(intent1);
      this.u = intent1;
      p();
    } 
  }
  
  protected void onSaveInstanceState(Bundle paramBundle) {
    super.onSaveInstanceState(paramBundle);
    paramBundle.putBoolean("signingInGoogleApiClients", this.s);
    if (this.s) {
      paramBundle.putInt("signInResultCode", this.t);
      paramBundle.putParcelable("signInResultData", (Parcelable)this.u);
    } 
  }
  
  private final class a implements b.n.a.a.a<Void> {
    private a(SignInHubActivity this$0) {}
    
    public final b<Void> a(int param1Int, Bundle param1Bundle) {
      return (b<Void>)new f((Context)this.a, f.c());
    }
    
    public final void a(b<Void> param1b) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/SignInHubActivity.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */