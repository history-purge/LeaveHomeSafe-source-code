package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class f extends a {
  public static final Parcelable.Creator<f> CREATOR = new e();
  
  public int c;
  
  public int d;
  
  public int e;
  
  public boolean f;
  
  public boolean g;
  
  public float h;
  
  public f() {}
  
  public f(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean1, boolean paramBoolean2, float paramFloat) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramInt3;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
    this.h = paramFloat;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 2, this.c);
    c.a(paramParcel, 3, this.d);
    c.a(paramParcel, 4, this.e);
    c.a(paramParcel, 5, this.f);
    c.a(paramParcel, 6, this.g);
    c.a(paramParcel, 7, this.h);
    c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/face/internal/client/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */