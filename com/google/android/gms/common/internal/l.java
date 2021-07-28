package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;

final class l implements m {
  private final IBinder a;
  
  l(IBinder paramIBinder) {
    this.a = paramIBinder;
  }
  
  public final void a(k paramk, f paramf) {
    Parcel parcel1 = Parcel.obtain();
    Parcel parcel2 = Parcel.obtain();
    try {
      parcel1.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
      if (paramk != null) {
        IBinder iBinder = paramk.asBinder();
      } else {
        paramk = null;
      } 
      parcel1.writeStrongBinder((IBinder)paramk);
      if (paramf != null) {
        parcel1.writeInt(1);
        paramf.writeToParcel(parcel1, 0);
      } else {
        parcel1.writeInt(0);
      } 
      this.a.transact(46, parcel1, parcel2, 0);
      parcel2.readException();
      return;
    } finally {
      parcel2.recycle();
      parcel1.recycle();
    } 
  }
  
  public final IBinder asBinder() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */