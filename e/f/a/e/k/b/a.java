package e.f.a.e.k.b;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.c;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.c;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.f0;
import com.google.android.gms.common.internal.g;
import com.google.android.gms.common.internal.q;
import e.f.a.e.k.f;

public class a extends g<f> implements f {
  private final d A;
  
  private final Bundle B;
  
  private final Integer C;
  
  private final boolean z;
  
  public a(@RecentlyNonNull Context paramContext, @RecentlyNonNull Looper paramLooper, @RecentlyNonNull boolean paramBoolean, @RecentlyNonNull d paramd, @RecentlyNonNull Bundle paramBundle, @RecentlyNonNull f.a parama, @RecentlyNonNull f.b paramb) {
    super(paramContext, paramLooper, 44, paramd, parama, paramb);
    this.z = paramBoolean;
    this.A = paramd;
    this.B = paramBundle;
    this.C = paramd.i();
  }
  
  public a(@RecentlyNonNull Context paramContext, @RecentlyNonNull Looper paramLooper, @RecentlyNonNull boolean paramBoolean, @RecentlyNonNull d paramd, @RecentlyNonNull e.f.a.e.k.a parama, @RecentlyNonNull f.a parama1, @RecentlyNonNull f.b paramb) {
    this(paramContext, paramLooper, true, paramd, a(paramd), parama1, paramb);
  }
  
  @RecentlyNonNull
  public static Bundle a(@RecentlyNonNull d paramd) {
    e.f.a.e.k.a a1 = paramd.h();
    Integer integer = paramd.i();
    Bundle bundle = new Bundle();
    bundle.putParcelable("com.google.android.gms.signin.internal.clientRequestedAccount", (Parcelable)paramd.a());
    if (integer != null)
      bundle.putInt("com.google.android.gms.common.internal.ClientSettings.sessionId", integer.intValue()); 
    if (a1 != null) {
      bundle.putBoolean("com.google.android.gms.signin.internal.offlineAccessRequested", false);
      bundle.putBoolean("com.google.android.gms.signin.internal.idTokenRequested", false);
      bundle.putString("com.google.android.gms.signin.internal.serverClientId", null);
      bundle.putBoolean("com.google.android.gms.signin.internal.usePromptModeForAuthCode", true);
      bundle.putBoolean("com.google.android.gms.signin.internal.forceCodeForRefreshToken", false);
      bundle.putString("com.google.android.gms.signin.internal.hostedDomain", null);
      bundle.putString("com.google.android.gms.signin.internal.logSessionId", null);
      bundle.putBoolean("com.google.android.gms.signin.internal.waitForAccessTokenRefresh", false);
    } 
    return bundle;
  }
  
  public final void a(d paramd) {
    q.a(paramd, "Expecting a valid ISignInCallbacks");
    try {
      Account account = this.A.c();
      GoogleSignInAccount googleSignInAccount = null;
      if ("<<default account>>".equals(account.name))
        googleSignInAccount = c.a(q()).b(); 
      Integer integer = this.C;
      q.a(integer);
      f0 f0 = new f0(account, integer.intValue(), googleSignInAccount);
      ((f)u()).a(new l(f0), paramd);
      return;
    } catch (RemoteException remoteException) {
      Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
      try {
        paramd.a(new n(8));
        return;
      } catch (RemoteException remoteException1) {
        Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", (Throwable)remoteException);
        return;
      } 
    } 
  }
  
  @RecentlyNonNull
  public int d() {
    return 12451000;
  }
  
  @RecentlyNonNull
  public boolean j() {
    return this.z;
  }
  
  public final void k() {
    a((c.c)new c.d((c)this));
  }
  
  @RecentlyNonNull
  protected Bundle r() {
    String str = this.A.e();
    if (!q().getPackageName().equals(str))
      this.B.putString("com.google.android.gms.signin.internal.realClientPackageName", this.A.e()); 
    return this.B;
  }
  
  @RecentlyNonNull
  protected String v() {
    return "com.google.android.gms.signin.internal.ISignInService";
  }
  
  @RecentlyNonNull
  protected String w() {
    return "com.google.android.gms.signin.service.START";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/e/k/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */