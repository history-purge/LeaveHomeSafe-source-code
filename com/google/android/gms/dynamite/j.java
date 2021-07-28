package com.google.android.gms.dynamite;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.f.a.e.f.a;
import e.f.a.e.i.f.b;
import e.f.a.e.i.f.c;

public final class j extends b implements k {
  j(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
  }
  
  public final int a(a parama, String paramString, boolean paramBoolean) {
    Parcel parcel2 = e();
    c.a(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    c.a(parcel2, paramBoolean);
    Parcel parcel1 = a(5, parcel2);
    int i = parcel1.readInt();
    parcel1.recycle();
    return i;
  }
  
  public final a a(a parama, String paramString, int paramInt) {
    Parcel parcel2 = e();
    c.a(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = a(4, parcel2);
    a a1 = a.a.a(parcel1.readStrongBinder());
    parcel1.recycle();
    return a1;
  }
  
  public final a a(a parama1, String paramString, int paramInt, a parama2) {
    Parcel parcel2 = e();
    c.a(parcel2, (IInterface)parama1);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramInt);
    c.a(parcel2, (IInterface)parama2);
    Parcel parcel1 = a(8, parcel2);
    a a1 = a.a.a(parcel1.readStrongBinder());
    parcel1.recycle();
    return a1;
  }
  
  public final a b(a parama, String paramString, int paramInt) {
    Parcel parcel2 = e();
    c.a(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    parcel2.writeInt(paramInt);
    Parcel parcel1 = a(2, parcel2);
    a a1 = a.a.a(parcel1.readStrongBinder());
    parcel1.recycle();
    return a1;
  }
  
  public final a b(a parama, String paramString, boolean paramBoolean) {
    Parcel parcel2 = e();
    c.a(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    c.a(parcel2, paramBoolean);
    Parcel parcel1 = a(7, parcel2);
    a a1 = a.a.a(parcel1.readStrongBinder());
    parcel1.recycle();
    return a1;
  }
  
  public final int c(a parama, String paramString, boolean paramBoolean) {
    Parcel parcel2 = e();
    c.a(parcel2, (IInterface)parama);
    parcel2.writeString(paramString);
    c.a(parcel2, paramBoolean);
    Parcel parcel1 = a(3, parcel2);
    int i = parcel1.readInt();
    parcel1.recycle();
    return i;
  }
  
  public final int zzb() {
    Parcel parcel = a(6, e());
    int i = parcel.readInt();
    parcel.recycle();
    return i;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/dynamite/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */