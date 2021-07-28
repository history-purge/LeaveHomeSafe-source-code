package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e.f.a.e.f.a;
import e.f.a.e.i.n.c7;
import e.f.a.e.i.n.s;
import e.f.a.e.i.n.t;

public final class i extends s implements g {
  i(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
  }
  
  public final FaceParcel[] a(a parama1, a parama2, a parama3, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, c7 paramc7) {
    Parcel parcel2 = e();
    t.a(parcel2, (IInterface)parama1);
    t.a(parcel2, (IInterface)parama2);
    t.a(parcel2, (IInterface)parama3);
    parcel2.writeInt(paramInt1);
    parcel2.writeInt(paramInt2);
    parcel2.writeInt(paramInt3);
    parcel2.writeInt(paramInt4);
    parcel2.writeInt(paramInt5);
    parcel2.writeInt(paramInt6);
    t.a(parcel2, (Parcelable)paramc7);
    Parcel parcel1 = a(4, parcel2);
    FaceParcel[] arrayOfFaceParcel = (FaceParcel[])parcel1.createTypedArray(FaceParcel.CREATOR);
    parcel1.recycle();
    return arrayOfFaceParcel;
  }
  
  public final FaceParcel[] a(a parama, c7 paramc7) {
    Parcel parcel2 = e();
    t.a(parcel2, (IInterface)parama);
    t.a(parcel2, (Parcelable)paramc7);
    Parcel parcel1 = a(1, parcel2);
    FaceParcel[] arrayOfFaceParcel = (FaceParcel[])parcel1.createTypedArray(FaceParcel.CREATOR);
    parcel1.recycle();
    return arrayOfFaceParcel;
  }
  
  public final void zza() {
    b(3, e());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/face/internal/client/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */