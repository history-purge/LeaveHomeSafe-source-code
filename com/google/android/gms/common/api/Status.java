package com.google.android.gms.common.api;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.o;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import e.f.a.e.e.a;

public final class Status extends a implements l, ReflectedParcelable {
  @RecentlyNonNull
  public static final Parcelable.Creator<Status> CREATOR;
  
  @RecentlyNonNull
  public static final Status h = new Status(0);
  
  @RecentlyNonNull
  public static final Status i = new Status(14);
  
  @RecentlyNonNull
  public static final Status j = new Status(8);
  
  @RecentlyNonNull
  public static final Status k = new Status(15);
  
  @RecentlyNonNull
  public static final Status l = new Status(16);
  
  private final int c;
  
  private final int d;
  
  private final String e;
  
  private final PendingIntent f;
  
  private final a g;
  
  static {
    new Status(17);
    new Status(18);
    CREATOR = new s();
  }
  
  public Status(@RecentlyNonNull int paramInt) {
    this(paramInt, (String)null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent) {
    this(paramInt1, paramInt2, paramString, paramPendingIntent, null);
  }
  
  Status(int paramInt1, int paramInt2, String paramString, PendingIntent paramPendingIntent, a parama) {
    this.c = paramInt1;
    this.d = paramInt2;
    this.e = paramString;
    this.f = paramPendingIntent;
    this.g = parama;
  }
  
  public Status(@RecentlyNonNull int paramInt, String paramString) {
    this(1, paramInt, paramString, null);
  }
  
  public Status(@RecentlyNonNull int paramInt, String paramString, PendingIntent paramPendingIntent) {
    this(1, paramInt, paramString, paramPendingIntent);
  }
  
  public Status(@RecentlyNonNull a parama, @RecentlyNonNull String paramString) {
    this(parama, paramString, 17);
  }
  
  @Deprecated
  public Status(@RecentlyNonNull a parama, @RecentlyNonNull String paramString, @RecentlyNonNull int paramInt) {
    this(1, paramInt, paramString, parama.d(), parama);
  }
  
  @RecentlyNonNull
  public final Status a() {
    return this;
  }
  
  @RecentlyNullable
  public final a b() {
    return this.g;
  }
  
  @RecentlyNonNull
  public final int c() {
    return this.d;
  }
  
  @RecentlyNullable
  public final String d() {
    return this.e;
  }
  
  @RecentlyNonNull
  public final boolean e() {
    return (this.f != null);
  }
  
  @RecentlyNonNull
  public final boolean equals(Object paramObject) {
    if (!(paramObject instanceof Status))
      return false; 
    paramObject = paramObject;
    return (this.c == ((Status)paramObject).c && this.d == ((Status)paramObject).d && o.a(this.e, ((Status)paramObject).e) && o.a(this.f, ((Status)paramObject).f) && o.a(this.g, ((Status)paramObject).g));
  }
  
  @RecentlyNonNull
  public final int hashCode() {
    return o.a(new Object[] { Integer.valueOf(this.c), Integer.valueOf(this.d), this.e, this.f, this.g });
  }
  
  @RecentlyNonNull
  public final boolean r() {
    return (this.d <= 0);
  }
  
  @RecentlyNonNull
  public final String t() {
    String str = this.e;
    return (str != null) ? str : d.a(this.d);
  }
  
  @RecentlyNonNull
  public final String toString() {
    o.a a1 = o.a(this);
    a1.a("statusCode", t());
    a1.a("resolution", this.f);
    return a1.toString();
  }
  
  public final void writeToParcel(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, c());
    c.a(paramParcel, 2, d(), false);
    c.a(paramParcel, 3, (Parcelable)this.f, paramInt, false);
    c.a(paramParcel, 4, (Parcelable)b(), paramInt, false);
    c.a(paramParcel, 1000, this.c);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/api/Status.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */