package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class LandmarkParcel extends a {
  @RecentlyNonNull
  public static final Parcelable.Creator<LandmarkParcel> CREATOR = new l();
  
  private final int c;
  
  public final float d;
  
  public final float e;
  
  public final int f;
  
  public LandmarkParcel(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2) {
    this.c = paramInt1;
    this.d = paramFloat1;
    this.e = paramFloat2;
    this.f = paramInt2;
  }
  
  public final void writeToParcel(@RecentlyNonNull Parcel paramParcel, int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, this.d);
    c.a(paramParcel, 3, this.e);
    c.a(paramParcel, 4, this.f);
    c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/face/internal/client/LandmarkParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */