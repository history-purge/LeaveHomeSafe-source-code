package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public class e extends a {
  @RecentlyNonNull
  public static final Parcelable.Creator<e> CREATOR = new l0();
  
  private final r c;
  
  private final boolean d;
  
  private final boolean e;
  
  private final int[] f;
  
  private final int g;
  
  e(r paramr, boolean paramBoolean1, boolean paramBoolean2, int[] paramArrayOfint, int paramInt) {
    this.c = paramr;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramArrayOfint;
    this.g = paramInt;
  }
  
  public void writeToParcel(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, (Parcelable)this.c, paramInt, false);
    c.a(paramParcel, 2, this.d);
    c.a(paramParcel, 3, this.e);
    c.a(paramParcel, 4, this.f, false);
    c.a(paramParcel, 5, this.g);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */