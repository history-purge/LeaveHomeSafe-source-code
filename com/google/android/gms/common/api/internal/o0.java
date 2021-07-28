package com.google.android.gms.common.api.internal;

import e.f.a.e.e.c;
import e.f.a.e.m.m;

public final class o0 extends n0<Boolean> {
  private final j<?> c;
  
  public o0(j<?> paramj, m<Boolean> paramm) {
    super(4, paramm);
    this.c = paramj;
  }
  
  public final c[] b(g.a<?> parama) {
    e0 e0 = parama.c().get(this.c);
    return (e0 == null) ? null : e0.a.b();
  }
  
  public final boolean c(g.a<?> parama) {
    e0 e0 = parama.c().get(this.c);
    return (e0 != null && e0.a.c());
  }
  
  public final void d(g.a<?> parama) {
    e0 e0 = parama.c().remove(this.c);
    if (e0 != null) {
      e0.b.a(parama.b(), (m)this.b);
      e0.a.a();
      return;
    } 
    this.b.b(Boolean.valueOf(false));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */