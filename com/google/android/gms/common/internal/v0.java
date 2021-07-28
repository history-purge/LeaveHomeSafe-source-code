package com.google.android.gms.common.internal;

import android.os.IInterface;
import android.os.Parcel;
import e.f.a.e.f.a;
import e.f.a.e.i.f.a;
import e.f.a.e.i.f.c;

public abstract class v0 extends a implements u0 {
  public v0() {
    super("com.google.android.gms.common.internal.ICertData");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2)
        return false; 
      paramInt1 = g();
      paramParcel2.writeNoException();
      paramParcel2.writeInt(paramInt1);
      return true;
    } 
    a a1 = zzb();
    paramParcel2.writeNoException();
    c.a(paramParcel2, (IInterface)a1);
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/v0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */