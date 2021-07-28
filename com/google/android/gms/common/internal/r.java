package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public class r extends a {
  @RecentlyNonNull
  public static final Parcelable.Creator<r> CREATOR = new y0();
  
  private final int c;
  
  private final boolean d;
  
  private final boolean e;
  
  private final int f;
  
  private final int g;
  
  public r(@RecentlyNonNull int paramInt1, @RecentlyNonNull boolean paramBoolean1, @RecentlyNonNull boolean paramBoolean2, @RecentlyNonNull int paramInt2, @RecentlyNonNull int paramInt3) {
    this.c = paramInt1;
    this.d = paramBoolean1;
    this.e = paramBoolean2;
    this.f = paramInt2;
    this.g = paramInt3;
  }
  
  public void writeToParcel(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, this.d);
    c.a(paramParcel, 3, this.e);
    c.a(paramParcel, 4, this.f);
    c.a(paramParcel, 5, this.g);
    c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */