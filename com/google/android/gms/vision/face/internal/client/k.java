package com.google.android.gms.vision.face.internal.client;

import android.os.IBinder;
import android.os.IInterface;
import e.f.a.e.i.n.a;

public abstract class k extends a implements h {
  public static h a(IBinder paramIBinder) {
    if (paramIBinder == null)
      return null; 
    IInterface iInterface = paramIBinder.queryLocalInterface("com.google.android.gms.vision.face.internal.client.INativeFaceDetectorCreator");
    return (iInterface instanceof h) ? (h)iInterface : new j(paramIBinder);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/face/internal/client/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */