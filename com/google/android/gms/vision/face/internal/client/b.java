package com.google.android.gms.vision.face.internal.client;

import android.content.Context;
import android.graphics.PointF;
import android.media.Image;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.dynamite.DynamiteModule;
import e.f.a.e.f.a;
import e.f.a.e.i.n.c7;
import e.f.a.e.i.n.d7;
import e.f.a.e.i.n.e7;
import e.f.a.e.n.e.a;
import e.f.a.e.n.e.d;
import java.nio.ByteBuffer;

public final class b extends d7<g> {
  private final f i;
  
  public b(Context paramContext, f paramf) {
    super(paramContext, "FaceNativeHandle", "face");
    this.i = paramf;
    d();
  }
  
  private static e.f.a.e.n.e.b a(FaceParcel paramFaceParcel) {
    d[] arrayOfD;
    a[] arrayOfA;
    int j = paramFaceParcel.d;
    PointF pointF = new PointF(paramFaceParcel.e, paramFaceParcel.f);
    float f1 = paramFaceParcel.g;
    float f2 = paramFaceParcel.h;
    float f3 = paramFaceParcel.i;
    float f4 = paramFaceParcel.j;
    float f5 = paramFaceParcel.k;
    LandmarkParcel[] arrayOfLandmarkParcel = paramFaceParcel.l;
    if (arrayOfLandmarkParcel == null) {
      arrayOfD = new d[0];
    } else {
      d[] arrayOfD1 = new d[arrayOfD.length];
      int k;
      for (k = 0; k < arrayOfD.length; k++) {
        d d = arrayOfD[k];
        arrayOfD1[k] = new d(new PointF(((LandmarkParcel)d).d, ((LandmarkParcel)d).e), ((LandmarkParcel)d).f);
      } 
      arrayOfD = arrayOfD1;
    } 
    a[] arrayOfA1 = paramFaceParcel.p;
    int i = 0;
    if (arrayOfA1 == null) {
      arrayOfA = new a[0];
    } else {
      arrayOfA = new a[arrayOfA1.length];
      while (i < arrayOfA1.length) {
        a a = arrayOfA1[i];
        arrayOfA[i] = new a(a.c, a.d);
        i++;
      } 
    } 
    return new e.f.a.e.n.e.b(j, pointF, f1, f2, f3, f4, f5, arrayOfD, arrayOfA, paramFaceParcel.m, paramFaceParcel.n, paramFaceParcel.o, paramFaceParcel.q);
  }
  
  protected final void a() {
    g g = (g)d();
    q.a(g);
    g.zza();
  }
  
  public final e.f.a.e.n.e.b[] a(ByteBuffer paramByteBuffer, c7 paramc7) {
    boolean bool = b();
    int i = 0;
    if (!bool)
      return new e.f.a.e.n.e.b[0]; 
    try {
      a a = e.f.a.e.f.b.a(paramByteBuffer);
      g g = (g)d();
      q.a(g);
      FaceParcel[] arrayOfFaceParcel = g.a(a, paramc7);
      e.f.a.e.n.e.b[] arrayOfB = new e.f.a.e.n.e.b[arrayOfFaceParcel.length];
      while (i < arrayOfFaceParcel.length) {
        arrayOfB[i] = a(arrayOfFaceParcel[i]);
        i++;
      } 
      return arrayOfB;
    } catch (RemoteException remoteException) {
      Log.e("FaceNativeHandle", "Could not call native face detector", (Throwable)remoteException);
      return new e.f.a.e.n.e.b[0];
    } 
  }
  
  public final e.f.a.e.n.e.b[] a(Image.Plane[] paramArrayOfPlane, c7 paramc7) {
    boolean bool = b();
    int i = 0;
    if (!bool) {
      Log.e("FaceNativeHandle", "Native handle is not ready to be used.");
      return new e.f.a.e.n.e.b[0];
    } 
    if (paramArrayOfPlane == null || paramArrayOfPlane.length == 3) {
      try {
        g g = (g)d();
        q.a(g);
        FaceParcel[] arrayOfFaceParcel = g.a(e.f.a.e.f.b.a(paramArrayOfPlane[0].getBuffer()), e.f.a.e.f.b.a(paramArrayOfPlane[1].getBuffer()), e.f.a.e.f.b.a(paramArrayOfPlane[2].getBuffer()), paramArrayOfPlane[0].getPixelStride(), paramArrayOfPlane[1].getPixelStride(), paramArrayOfPlane[2].getPixelStride(), paramArrayOfPlane[0].getRowStride(), paramArrayOfPlane[1].getRowStride(), paramArrayOfPlane[2].getRowStride(), paramc7);
        e.f.a.e.n.e.b[] arrayOfB = new e.f.a.e.n.e.b[arrayOfFaceParcel.length];
        while (i < arrayOfFaceParcel.length) {
          arrayOfB[i] = a(arrayOfFaceParcel[i]);
          i++;
        } 
        return arrayOfB;
      } catch (RemoteException remoteException) {
        Log.e("FaceNativeHandle", "Could not call native face detector", (Throwable)remoteException);
      } 
      return new e.f.a.e.n.e.b[0];
    } 
    throw new IllegalArgumentException("Only android.graphics.ImageFormat#YUV_420_888 is supported which should have 3 planes.");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/vision/face/internal/client/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */