package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Dialog;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.internal.q;
import e.f.a.e.e.a;
import e.f.a.e.e.d;

final class r0 implements Runnable {
  private final s0 c;
  
  r0(q0 paramq0, s0 params0) {
    this.c = params0;
  }
  
  public final void run() {
    PendingIntent pendingIntent;
    Dialog dialog;
    if (!this.d.d)
      return; 
    a a = this.c.b();
    if (a.e()) {
      q0 q02 = this.d;
      i i = q02.c;
      Activity activity = q02.a();
      pendingIntent = a.d();
      q.a(pendingIntent);
      i.startActivityForResult(GoogleApiActivity.a((Context)activity, pendingIntent, this.c.a(), false), 1);
      return;
    } 
    q0 q01 = this.d;
    if (q01.g.a((Context)q01.a(), pendingIntent.b(), null) != null) {
      q01 = this.d;
      q01.g.a(q01.a(), this.d.c, pendingIntent.b(), 2, this.d);
      return;
    } 
    if (pendingIntent.b() == 18) {
      dialog = d.a(this.d.a(), this.d);
      q01 = this.d;
      q01.g.a(q01.a().getApplicationContext(), new t0(this, dialog));
      return;
    } 
    this.d.a((a)dialog, this.c.a());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/r0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */