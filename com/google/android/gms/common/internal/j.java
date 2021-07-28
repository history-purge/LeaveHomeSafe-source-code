package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import androidx.annotation.RecentlyNonNull;
import e.f.a.e.i.f.b;
import e.f.a.e.i.f.c;

public interface j extends IInterface {
  @RecentlyNonNull
  Account zza();
  
  public static abstract class a extends e.f.a.e.i.f.a implements j {
    @RecentlyNonNull
    public static j a(@RecentlyNonNull IBinder param1IBinder) {
      if (param1IBinder == null)
        return null; 
      IInterface iInterface = param1IBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
      return (iInterface instanceof j) ? (j)iInterface : new a(param1IBinder);
    }
    
    public static final class a extends b implements j {
      a(IBinder param2IBinder) {
        super(param2IBinder, "com.google.android.gms.common.internal.IAccountAccessor");
      }
      
      public final Account zza() {
        Parcel parcel = a(2, e());
        Account account = (Account)c.a(parcel, Account.CREATOR);
        parcel.recycle();
        return account;
      }
    }
  }
  
  public static final class a extends b implements j {
    a(IBinder param1IBinder) {
      super(param1IBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }
    
    public final Account zza() {
      Parcel parcel = a(2, e());
      Account account = (Account)c.a(parcel, Account.CREATOR);
      parcel.recycle();
      return account;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */