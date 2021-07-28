package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.g;
import e.f.a.e.i.a.b;
import java.util.Iterator;

public final class h extends g<t> {
  private final GoogleSignInOptions z;
  
  public h(Context paramContext, Looper paramLooper, d paramd, GoogleSignInOptions paramGoogleSignInOptions, f.a parama, f.b paramb) {
    super(paramContext, paramLooper, 91, paramd, parama, paramb);
    GoogleSignInOptions.a a1;
    if (paramGoogleSignInOptions != null) {
      a1 = new GoogleSignInOptions.a(paramGoogleSignInOptions);
    } else {
      a1 = new GoogleSignInOptions.a();
    } 
    a1.a(b.a());
    if (!paramd.d().isEmpty()) {
      Iterator<Scope> iterator = paramd.d().iterator();
      while (iterator.hasNext())
        a1.a(iterator.next(), new Scope[0]); 
    } 
    this.z = a1.a();
  }
  
  public final GoogleSignInOptions C() {
    return this.z;
  }
  
  public final int d() {
    return 12451000;
  }
  
  protected final String v() {
    return "com.google.android.gms.auth.api.signin.internal.ISignInService";
  }
  
  protected final String w() {
    return "com.google.android.gms.auth.api.signin.service.START";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */