package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;
import e.f.a.e.i.a.c;
import e.f.a.e.i.a.e;

public abstract class u extends c implements r {
  public u() {
    super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    switch (paramInt1) {
      default:
        return false;
      case 103:
        d((Status)e.a(paramParcel1, Status.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 102:
        b((Status)e.a(paramParcel1, Status.CREATOR));
        paramParcel2.writeNoException();
        return true;
      case 101:
        break;
    } 
    a((GoogleSignInAccount)e.a(paramParcel1, GoogleSignInAccount.CREATOR), (Status)e.a(paramParcel1, Status.CREATOR));
    throw null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */