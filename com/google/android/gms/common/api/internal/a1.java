package com.google.android.gms.common.api.internal;

import android.os.Bundle;

final class a1 implements Runnable {
  a1(b1 paramb1, LifecycleCallback paramLifecycleCallback, String paramString) {}
  
  public final void run() {
    if (b1.a(this.e) > 0) {
      Bundle bundle;
      LifecycleCallback lifecycleCallback = this.c;
      if (b1.b(this.e) != null) {
        bundle = b1.b(this.e).getBundle(this.d);
      } else {
        bundle = null;
      } 
      lifecycleCallback.a(bundle);
    } 
    if (b1.a(this.e) >= 2)
      this.c.d(); 
    if (b1.a(this.e) >= 3)
      this.c.c(); 
    if (b1.a(this.e) >= 4)
      this.c.e(); 
    if (b1.a(this.e) >= 5)
      this.c.b(); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/internal/a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */