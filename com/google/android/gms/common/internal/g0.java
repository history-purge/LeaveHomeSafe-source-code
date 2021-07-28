package com.google.android.gms.common.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import e.f.a.e.e.a;

public final class g0 extends a {
  public static final Parcelable.Creator<g0> CREATOR = new i0();
  
  private final int c;
  
  private IBinder d;
  
  private a e;
  
  private boolean f;
  
  private boolean g;
  
  g0(int paramInt, IBinder paramIBinder, a parama, boolean paramBoolean1, boolean paramBoolean2) {
    this.c = paramInt;
    this.d = paramIBinder;
    this.e = parama;
    this.f = paramBoolean1;
    this.g = paramBoolean2;
  }
  
  public final j b() {
    IBinder iBinder = this.d;
    return (iBinder == null) ? null : j.a.a(iBinder);
  }
  
  public final a c() {
    return this.e;
  }
  
  public final boolean equals(Object paramObject) {
    if (paramObject == null)
      return false; 
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof g0))
      return false; 
    paramObject = paramObject;
    return (this.e.equals(((g0)paramObject).e) && o.a(b(), paramObject.b()));
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, this.d, false);
    c.a(paramParcel, 3, (Parcelable)this.e, paramInt, false);
    c.a(paramParcel, 4, this.f);
    c.a(paramParcel, 5, this.g);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/g0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */