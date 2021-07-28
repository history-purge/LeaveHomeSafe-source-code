package com.google.android.gms.auth.api.signin;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public class SignInAccount extends a implements ReflectedParcelable {
  public static final Parcelable.Creator<SignInAccount> CREATOR = new j();
  
  @Deprecated
  private String c;
  
  private GoogleSignInAccount d;
  
  @Deprecated
  private String e;
  
  SignInAccount(String paramString1, GoogleSignInAccount paramGoogleSignInAccount, String paramString2) {
    this.d = paramGoogleSignInAccount;
    q.a(paramString1, "8.3 and 8.4 SDKs require non-null email");
    this.c = paramString1;
    q.a(paramString2, "8.3 and 8.4 SDKs require non-null userId");
    this.e = paramString2;
  }
  
  public final GoogleSignInAccount b() {
    return this.d;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 4, this.c, false);
    c.a(paramParcel, 7, (Parcelable)this.d, paramInt, false);
    c.a(paramParcel, 8, this.e, false);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/SignInAccount.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */