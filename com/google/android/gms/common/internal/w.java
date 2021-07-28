package com.google.android.gms.common.internal;

import android.app.Activity;
import android.content.Intent;

final class w extends u {
  w(Intent paramIntent, Activity paramActivity, int paramInt) {}
  
  public final void a() {
    Intent intent = this.c;
    if (intent != null)
      this.d.startActivityForResult(intent, this.e); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */