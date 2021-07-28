package com.google.android.gms.vision.face.internal.client;

import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class a extends a {
  public static final Parcelable.Creator<a> CREATOR = new c();
  
  public final PointF[] c;
  
  public final int d;
  
  public a(PointF[] paramArrayOfPointF, int paramInt) {
    this.c = paramArrayOfPointF;
    this.d = paramInt;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 2, (Parcelable[])this.c, paramInt, false);
    c.a(paramParcel, 3, this.d);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/face/internal/client/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */