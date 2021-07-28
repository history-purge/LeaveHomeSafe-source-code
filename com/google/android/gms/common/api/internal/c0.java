package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.b;
import e.f.a.e.e.a;
import e.f.a.e.m.l;
import e.f.a.e.m.m;
import java.util.concurrent.CancellationException;

public class c0 extends q0 {
  private m<Void> h = new m();
  
  private c0(i parami) {
    super(parami);
    this.c.a("GmsAvailabilityHelper", this);
  }
  
  public static c0 b(Activity paramActivity) {
    i i = LifecycleCallback.a(paramActivity);
    c0 c01 = i.<c0>a("GmsAvailabilityHelper", c0.class);
    if (c01 != null) {
      if (c01.h.a().d())
        c01.h = new m(); 
      return c01;
    } 
    return new c0(i);
  }
  
  protected final void a(a parama, int paramInt) {
    String str2 = parama.c();
    String str1 = str2;
    if (str2 == null)
      str1 = "Error connecting to Google Play services"; 
    this.h.a((Exception)new b(new Status(parama, str1, parama.b())));
  }
  
  public void b() {
    super.b();
    this.h.b(new CancellationException("Host activity was destroyed before Google Play services could be made available."));
  }
  
  protected final void f() {
    Activity activity = this.c.e();
    if (activity == null) {
      this.h.b((Exception)new b(new Status(8)));
      return;
    } 
    int i = this.g.a((Context)activity);
    if (i == 0) {
      this.h.b(null);
      return;
    } 
    if (!this.h.a().d())
      b(new a(i, null), 0); 
  }
  
  public final l<Void> h() {
    return this.h.a();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */