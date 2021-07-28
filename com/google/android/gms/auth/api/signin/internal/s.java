package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import e.f.a.e.i.a.c;

public abstract class s extends c implements p {
  public s() {
    super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
  }
  
  protected final boolean a(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
    if (paramInt1 != 1) {
      if (paramInt1 != 2)
        return false; 
      b();
      return true;
    } 
    a();
    return true;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */