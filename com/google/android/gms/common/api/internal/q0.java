package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import e.f.a.e.e.a;
import e.f.a.e.e.d;
import e.f.a.e.i.c.d;
import java.util.concurrent.atomic.AtomicReference;

public abstract class q0 extends LifecycleCallback implements DialogInterface.OnCancelListener {
  protected volatile boolean d;
  
  protected final AtomicReference<s0> e = new AtomicReference<s0>(null);
  
  private final Handler f = (Handler)new d(Looper.getMainLooper());
  
  protected final d g;
  
  protected q0(i parami) {
    this(parami, d.a());
  }
  
  q0(i parami, d paramd) {
    super(parami);
    this.g = paramd;
  }
  
  private static int a(s0 params0) {
    return (params0 == null) ? -1 : params0.a();
  }
  
  public void a(int paramInt1, int paramInt2, Intent paramIntent) {
    s0 s0 = this.e.get();
    int i = 1;
    boolean bool = true;
    if (paramInt1 != 1) {
      if (paramInt1 != 2) {
        s0 s01 = s0;
      } else {
        i = this.g.a((Context)a());
        if (i == 0) {
          paramInt1 = bool;
        } else {
          paramInt1 = 0;
        } 
        if (s0 == null)
          return; 
        s0 s01 = s0;
        paramInt2 = paramInt1;
        if (s0.b().b() == 18) {
          s01 = s0;
          paramInt2 = paramInt1;
          if (i == 18)
            return; 
        } 
        if (paramInt2 != 0) {
          g();
          return;
        } 
      } 
    } else {
      if (paramInt2 == -1) {
        s0 s01 = s0;
        paramInt2 = i;
      } else {
        s0 s01 = s0;
        if (paramInt2 == 0) {
          if (s0 == null)
            return; 
          paramInt1 = 13;
          if (paramIntent != null)
            paramInt1 = paramIntent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13); 
          s01 = new s0(new a(paramInt1, null, s0.b().toString()), a(s0));
          this.e.set(s01);
        } 
        paramInt2 = 0;
      } 
      if (paramInt2 != 0) {
        g();
        return;
      } 
    } 
    paramInt2 = 0;
  }
  
  public void a(Bundle paramBundle) {
    super.a(paramBundle);
    if (paramBundle != null) {
      AtomicReference<s0> atomicReference = this.e;
      if (paramBundle.getBoolean("resolving_error", false)) {
        s0 s0 = new s0(new a(paramBundle.getInt("failed_status"), (PendingIntent)paramBundle.getParcelable("failed_resolution")), paramBundle.getInt("failed_client_id", -1));
      } else {
        paramBundle = null;
      } 
      atomicReference.set(paramBundle);
    } 
  }
  
  protected abstract void a(a parama, int paramInt);
  
  public void b(Bundle paramBundle) {
    super.b(paramBundle);
    s0 s0 = this.e.get();
    if (s0 != null) {
      paramBundle.putBoolean("resolving_error", true);
      paramBundle.putInt("failed_client_id", s0.a());
      paramBundle.putInt("failed_status", s0.b().b());
      paramBundle.putParcelable("failed_resolution", (Parcelable)s0.b().d());
    } 
  }
  
  public final void b(a parama, int paramInt) {
    s0 s0 = new s0(parama, paramInt);
    if (this.e.compareAndSet(null, s0))
      this.f.post(new r0(this, s0)); 
  }
  
  public void d() {
    super.d();
    this.d = true;
  }
  
  public void e() {
    super.e();
    this.d = false;
  }
  
  protected abstract void f();
  
  protected final void g() {
    this.e.set(null);
    f();
  }
  
  public void onCancel(DialogInterface paramDialogInterface) {
    a(new a(13, null), a(this.e.get()));
    g();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/q0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */