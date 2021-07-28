package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import e.f.a.e.f.a;
import e.f.a.e.i.n.s;
import e.f.a.e.i.n.t;

public final class j extends s implements h {
  j(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
  }
  
  public final g a(a parama, f paramf) {
    g g;
    Parcel parcel2 = e();
    t.a(parcel2, (IInterface)parama);
    t.a(parcel2, (Parcelable)paramf);
    Parcel parcel1 = a(1, parcel2);
    IBinder iBinder = parcel1.readStrongBinder();
    if (iBinder == null) {
      iBinder = null;
    } else {
      IInterface iInterface = iBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetector");
      if (iInterface instanceof g) {
        g = (g)iInterface;
      } else {
        g = new i((IBinder)g);
      } 
    } 
    parcel1.recycle();
    return g;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/face/internal/client/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */