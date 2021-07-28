package com.google.android.gms.common.internal;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import e.f.a.e.m.m;
import java.util.concurrent.TimeUnit;

final class d0 implements h.a {
  d0(h paramh, m paramm, p.a parama, p.b paramb) {}
  
  public final void a(Status paramStatus) {
    l l;
    if (paramStatus.r()) {
      l = this.a.a(0L, TimeUnit.MILLISECONDS);
      this.b.a(this.c.a(l));
      return;
    } 
    this.b.a((Exception)this.d.a((Status)l));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/d0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */