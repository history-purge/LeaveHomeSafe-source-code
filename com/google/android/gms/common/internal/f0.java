package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class f0 extends a {
  public static final Parcelable.Creator<f0> CREATOR = new h0();
  
  private final int c;
  
  private final Account d;
  
  private final int e;
  
  private final GoogleSignInAccount f;
  
  f0(int paramInt1, Account paramAccount, int paramInt2, GoogleSignInAccount paramGoogleSignInAccount) {
    this.c = paramInt1;
    this.d = paramAccount;
    this.e = paramInt2;
    this.f = paramGoogleSignInAccount;
  }
  
  public f0(Account paramAccount, int paramInt, GoogleSignInAccount paramGoogleSignInAccount) {
    this(2, paramAccount, paramInt, paramGoogleSignInAccount);
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, (Parcelable)this.d, paramInt, false);
    c.a(paramParcel, 3, this.e);
    c.a(paramParcel, 4, (Parcelable)this.f, paramInt, false);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/f0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */