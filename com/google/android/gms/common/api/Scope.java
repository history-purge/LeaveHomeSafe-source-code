package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.q;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;

public final class Scope extends a implements ReflectedParcelable {
  @RecentlyNonNull
  public static final Parcelable.Creator<Scope> CREATOR = new r();
  
  private final int c;
  
  private final String d;
  
  Scope(int paramInt, String paramString) {
    q.a(paramString, "scopeUri must not be null or empty");
    this.c = paramInt;
    this.d = paramString;
  }
  
  public Scope(@RecentlyNonNull String paramString) {
    this(1, paramString);
  }
  
  @RecentlyNonNull
  public final String b() {
    return this.d;
  }
  
  @RecentlyNonNull
  public final boolean equals(Object paramObject) {
    return (this == paramObject) ? true : (!(paramObject instanceof Scope) ? false : this.d.equals(((Scope)paramObject).d));
  }
  
  @RecentlyNonNull
  public final int hashCode() {
    return this.d.hashCode();
  }
  
  @RecentlyNonNull
  public final String toString() {
    return this.d;
  }
  
  public final void writeToParcel(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, b(), false);
    c.a(paramParcel, paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/Scope.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */