package com.google.android.gms.auth.api.signin.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public class a extends a {
  @RecentlyNonNull
  public static final Parcelable.Creator<a> CREATOR = new d();
  
  private final int c;
  
  private int d;
  
  private Bundle e;
  
  a(int paramInt1, int paramInt2, Bundle paramBundle) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramBundle;
  }
  
  @RecentlyNonNull
  public int b() {
    return this.d;
  }
  
  public void writeToParcel(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, b());
    c.a(paramParcel, 3, this.e, false);
    c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */