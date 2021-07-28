package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class SignInConfiguration extends a implements ReflectedParcelable {
  public static final Parcelable.Creator<SignInConfiguration> CREATOR = new x();
  
  private final String c;
  
  private GoogleSignInOptions d;
  
  public SignInConfiguration(String paramString, GoogleSignInOptions paramGoogleSignInOptions) {
    q.b(paramString);
    this.c = paramString;
    this.d = paramGoogleSignInOptions;
  }
  
  public final GoogleSignInOptions b() {
    return this.d;
  }
  
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof SignInConfiguration))
      return false; 
    SignInConfiguration signInConfiguration = (SignInConfiguration)paramObject;
    if (this.c.equals(signInConfiguration.c)) {
      paramObject = this.d;
      GoogleSignInOptions googleSignInOptions = signInConfiguration.d;
      if ((paramObject == null) ? (googleSignInOptions == null) : paramObject.equals(googleSignInOptions))
        return true; 
    } 
    return false;
  }
  
  public final int hashCode() {
    b b = new b();
    b.a(this.c);
    b.a(this.d);
    return b.a();
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 2, this.c, false);
    c.a(paramParcel, 5, (Parcelable)this.d, paramInt, false);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/auth/api/signin/internal/SignInConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */