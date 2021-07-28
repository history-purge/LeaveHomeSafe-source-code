package com.google.android.gms.auth.api.signin.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import e.f.a.e.i.a.d;
import e.f.a.e.i.a.e;

public final class w extends d implements t {
  w(IBinder paramIBinder) {
    super(paramIBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
  }
  
  public final void a(r paramr, GoogleSignInOptions paramGoogleSignInOptions) {
    Parcel parcel = g();
    e.a(parcel, paramr);
    e.a(parcel, (Parcelable)paramGoogleSignInOptions);
    a(103, parcel);
  }
  
  public final void b(r paramr, GoogleSignInOptions paramGoogleSignInOptions) {
    Parcel parcel = g();
    e.a(parcel, paramr);
    e.a(parcel, (Parcelable)paramGoogleSignInOptions);
    a(102, parcel);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */