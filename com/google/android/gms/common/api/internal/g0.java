package com.google.android.gms.common.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.d;
import com.google.android.gms.common.internal.q;
import e.f.a.e.e.a;
import e.f.a.e.k.a;
import e.f.a.e.k.b.d;
import e.f.a.e.k.b.e;
import e.f.a.e.k.b.n;
import e.f.a.e.k.c;
import e.f.a.e.k.f;
import java.util.Set;

public final class g0 extends e implements f.a, f.b {
  private static a.a<? extends f, a> h = c.c;
  
  private final Context a;
  
  private final Handler b;
  
  private final a.a<? extends f, a> c;
  
  private Set<Scope> d;
  
  private d e;
  
  private f f;
  
  private j0 g;
  
  public g0(Context paramContext, Handler paramHandler, d paramd) {
    this(paramContext, paramHandler, paramd, h);
  }
  
  private g0(Context paramContext, Handler paramHandler, d paramd, a.a<? extends f, a> parama) {
    this.a = paramContext;
    this.b = paramHandler;
    q.a(paramd, "ClientSettings must not be null");
    this.e = paramd;
    this.d = paramd.f();
    this.c = parama;
  }
  
  private final void b(n paramn) {
    a a2 = paramn.b();
    a a1 = a2;
    if (a2.r()) {
      String str;
      com.google.android.gms.common.internal.g0 g01 = paramn.c();
      q.a(g01);
      g01 = g01;
      a1 = g01.c();
      if (!a1.r()) {
        str = String.valueOf(a1);
        StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 48);
        stringBuilder.append("Sign-in succeeded with resolve account failure: ");
        stringBuilder.append(str);
        Log.wtf("SignInCoordinator", stringBuilder.toString(), new Exception());
      } else {
        this.g.a(str.b(), this.d);
        this.f.i();
      } 
    } 
    this.g.b(a1);
    this.f.i();
  }
  
  public final void a(j0 paramj0) {
    f f1 = this.f;
    if (f1 != null)
      f1.i(); 
    this.e.a(Integer.valueOf(System.identityHashCode(this)));
    a.a<? extends f, a> a1 = this.c;
    Context context = this.a;
    Looper looper = this.b.getLooper();
    d d1 = this.e;
    this.f = (f)a1.a(context, looper, d1, d1.h(), this, this);
    this.g = paramj0;
    Set<Scope> set = this.d;
    if (set == null || set.isEmpty()) {
      this.b.post(new i0(this));
      return;
    } 
    this.f.k();
  }
  
  public final void a(n paramn) {
    this.b.post(new h0(this, paramn));
  }
  
  public final void e() {
    f f1 = this.f;
    if (f1 != null)
      f1.i(); 
  }
  
  public final void onConnected(Bundle paramBundle) {
    this.f.a((d)this);
  }
  
  public final void onConnectionFailed(a parama) {
    this.g.b(parama);
  }
  
  public final void onConnectionSuspended(int paramInt) {
    this.f.i();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */