package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public class FaceParcel extends a {
  @RecentlyNonNull
  public static final Parcelable.Creator<FaceParcel> CREATOR = new d();
  
  private final int c;
  
  public final int d;
  
  public final float e;
  
  public final float f;
  
  public final float g;
  
  public final float h;
  
  public final float i;
  
  public final float j;
  
  public final float k;
  
  @RecentlyNonNull
  public final LandmarkParcel[] l;
  
  public final float m;
  
  public final float n;
  
  public final float o;
  
  public final a[] p;
  
  public final float q;
  
  public FaceParcel(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float paramFloat7, LandmarkParcel[] paramArrayOfLandmarkParcel, float paramFloat8, float paramFloat9, float paramFloat10, a[] paramArrayOfa, float paramFloat11) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramFloat1;
    this.f = paramFloat2;
    this.g = paramFloat3;
    this.h = paramFloat4;
    this.i = paramFloat5;
    this.j = paramFloat6;
    this.k = paramFloat7;
    this.l = paramArrayOfLandmarkParcel;
    this.m = paramFloat8;
    this.n = paramFloat9;
    this.o = paramFloat10;
    this.p = paramArrayOfa;
    this.q = paramFloat11;
  }
  
  public FaceParcel(int paramInt1, int paramInt2, float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, @RecentlyNonNull LandmarkParcel[] paramArrayOfLandmarkParcel, float paramFloat7, float paramFloat8, float paramFloat9) {
    this(paramInt1, paramInt2, paramFloat1, paramFloat2, paramFloat3, paramFloat4, paramFloat5, paramFloat6, 0.0F, paramArrayOfLandmarkParcel, paramFloat7, paramFloat8, paramFloat9, new a[0], -1.0F);
  }
  
  public void writeToParcel(@RecentlyNonNull Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, this.d);
    c.a(paramParcel, 3, this.e);
    c.a(paramParcel, 4, this.f);
    c.a(paramParcel, 5, this.g);
    c.a(paramParcel, 6, this.h);
    c.a(paramParcel, 7, this.i);
    c.a(paramParcel, 8, this.j);
    c.a(paramParcel, 9, (Parcelable[])this.l, paramInt, false);
    c.a(paramParcel, 10, this.m);
    c.a(paramParcel, 11, this.n);
    c.a(paramParcel, 12, this.o);
    c.a(paramParcel, 13, (Parcelable[])this.p, paramInt, false);
    c.a(paramParcel, 14, this.k);
    c.a(paramParcel, 15, this.q);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/face/internal/client/FaceParcel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */