package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.f.a.e.f.a;
import e.f.a.e.i.f.b;
import e.f.a.e.i.f.c;

public final class l extends b implements m {
  l(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
  }
  
  public final a a(a parama1, String paramString, int paramInt, a parama2) {
    Parcel parcel2 = e();
    c.a(parcel2, (IInterface)parama1);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramInt);
    c.a(parcel2, (IInterface)parama2);
    Parcel parcel1 = a(2, parcel2);
    a a1 = a.a.a(parcel1.readStrongBinder());
    parcel1.recycle();
    return a1;
  }
  
  public final a b(a parama1, String paramString, int paramInt, a parama2) {
    Parcel parcel2 = e();
    c.a(parcel2, (IInterface)parama1);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramInt);
    c.a(parcel2, (IInterface)parama2);
    Parcel parcel1 = a(3, parcel2);
    a a1 = a.a.a(parcel1.readStrongBinder());
    parcel1.recycle();
    return a1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/dynamite/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */