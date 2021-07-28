package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Binder;
import android.os.RemoteException;
import android.util.Log;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;

public class a extends j.a {
  @RecentlyNullable
  public static Account a(@RecentlyNonNull j paramj) {
    if (paramj != null) {
      long l = Binder.clearCallingIdentity();
      try {
        return paramj.zza();
      } catch (RemoteException remoteException) {
        Log.w("AccountAccessor", "Remote account accessor probably died");
      } finally {
        Binder.restoreCallingIdentity(l);
      } 
    } 
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */