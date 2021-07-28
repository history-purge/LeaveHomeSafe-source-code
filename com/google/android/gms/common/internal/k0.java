package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import e.f.a.e.e.c;

public final class k0 extends a {
  public static final Parcelable.Creator<k0> CREATOR = new j0();
  
  Bundle c;
  
  c[] d;
  
  private int e;
  
  public k0() {}
  
  k0(Bundle paramBundle, c[] paramArrayOfc, int paramInt, e parame) {
    this.c = paramBundle;
    this.d = paramArrayOfc;
    this.e = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, this.c, false);
    c.a(paramParcel, 2, (Parcelable[])this.d, paramInt, false);
    c.a(paramParcel, 3, this.e);
    c.a(paramParcel, 4, null, paramInt, false);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */