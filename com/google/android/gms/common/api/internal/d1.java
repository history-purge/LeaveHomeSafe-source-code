package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class d1 implements Runnable {
  d1(c1 paramc1, LifecycleCallback paramLifecycleCallback, String paramString) {}
  
  public final void run() {
    if (c1.a(this.e) > 0) {
      Bundle bundle;
      LifecycleCallback lifecycleCallback = this.c;
      if (c1.b(this.e) != null) {
        bundle = c1.b(this.e).getBundle(this.d);
      } else {
        bundle = null;
      } 
      lifecycleCallback.a(bundle);
    } 
    if (c1.a(this.e) >= 2)
      this.c.d(); 
    if (c1.a(this.e) >= 3)
      this.c.c(); 
    if (c1.a(this.e) >= 4)
      this.c.e(); 
    if (c1.a(this.e) >= 5)
      this.c.b(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/d1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */