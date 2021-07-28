package com.google.android.gms.common.api.internal;

import android.util.Log;
import e.f.a.e.e.a;

final class y implements Runnable {
  y(g.c paramc, a parama) {}
  
  public final void run() {
    g.a a1 = (g.a)g.k(this.d.f).get(g.c.a(this.d));
    if (a1 == null)
      return; 
    if (this.c.r()) {
      g.c.a(this.d, true);
      if (g.c.b(this.d).j()) {
        g.c.c(this.d);
        return;
      } 
      try {
        g.c.b(this.d).a(null, g.c.b(this.d).b());
        return;
      } catch (SecurityException securityException) {
        Log.e("GoogleApiManager", "Failed to get service from broker. ", securityException);
        g.c.b(this.d).a("Failed to get service from broker.");
        a1.onConnectionFailed(new a(10));
        return;
      } 
    } 
    a1.onConnectionFailed(this.c);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */