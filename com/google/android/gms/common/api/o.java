package com.google.android.gms.common.api;

import androidx.annotation.RecentlyNonNull;
import e.f.a.e.e.c;

public final class o extends UnsupportedOperationException {
  private final c zza;
  
  public o(@RecentlyNonNull c paramc) {
    this.zza = paramc;
  }
  
  @RecentlyNonNull
  public final String getMessage() {
    String str = String.valueOf(this.zza);
    StringBuilder stringBuilder = new StringBuilder(String.valueOf(str).length() + 8);
    stringBuilder.append("Missing ");
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */