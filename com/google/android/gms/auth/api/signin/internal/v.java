package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.a;
import com.google.android.gms.auth.api.signin.c;
import com.google.android.gms.common.util.n;

public final class v extends s {
  private final Context a;
  
  public v(Context paramContext) {
    this.a = paramContext;
  }
  
  private final void e() {
    if (n.a(this.a, Binder.getCallingUid()))
      return; 
    int i = Binder.getCallingUid();
    StringBuilder stringBuilder = new StringBuilder(52);
    stringBuilder.append("Calling UID ");
    stringBuilder.append(i);
    stringBuilder.append(" is not Google Play services.");
    throw new SecurityException(stringBuilder.toString());
  }
  
  public final void a() {
    e();
    c c1 = c.a(this.a);
    GoogleSignInAccount googleSignInAccount = c1.b();
    GoogleSignInOptions googleSignInOptions = GoogleSignInOptions.q;
    if (googleSignInAccount != null)
      googleSignInOptions = c1.c(); 
    c c = a.a(this.a, googleSignInOptions);
    if (googleSignInAccount != null) {
      c.g();
      return;
    } 
    c.h();
  }
  
  public final void b() {
    e();
    q.a(this.a).a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */