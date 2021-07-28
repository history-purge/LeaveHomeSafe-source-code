package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import e.f.a.e.i.f.c;

public interface k extends IInterface {
  void a(@RecentlyNonNull int paramInt, @RecentlyNonNull IBinder paramIBinder, @RecentlyNonNull Bundle paramBundle);
  
  void a(int paramInt, IBinder paramIBinder, k0 paramk0);
  
  void b(@RecentlyNonNull int paramInt, @RecentlyNonNull Bundle paramBundle);
  
  public static abstract class a extends e.f.a.e.i.f.a implements k {
    public a() {
      super("com.google.android.gms.common.internal.IGmsCallbacks");
    }
    
    protected final boolean a(int param1Int1, Parcel param1Parcel1, Parcel param1Parcel2, int param1Int2) {
      if (param1Int1 != 1) {
        if (param1Int1 != 2) {
          if (param1Int1 != 3)
            return false; 
          a(param1Parcel1.readInt(), param1Parcel1.readStrongBinder(), (k0)c.a(param1Parcel1, k0.CREATOR));
        } else {
          b(param1Parcel1.readInt(), (Bundle)c.a(param1Parcel1, Bundle.CREATOR));
        } 
      } else {
        a(param1Parcel1.readInt(), param1Parcel1.readStrongBinder(), (Bundle)c.a(param1Parcel1, Bundle.CREATOR));
      } 
      param1Parcel2.writeNoException();
      return true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */