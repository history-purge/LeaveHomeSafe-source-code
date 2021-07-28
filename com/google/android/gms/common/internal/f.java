package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.RecentlyNonNull;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.t.a;
import com.google.android.gms.common.internal.t.c;
import e.f.a.e.e.c;
import e.f.a.e.e.e;

public class f extends a {
  @RecentlyNonNull
  public static final Parcelable.Creator<f> CREATOR = new m0();
  
  private final int c = 5;
  
  private final int d;
  
  private int e;
  
  String f;
  
  IBinder g;
  
  Scope[] h;
  
  Bundle i;
  
  Account j;
  
  c[] k;
  
  c[] l;
  
  private boolean m;
  
  private int n;
  
  boolean o;
  
  public f(@RecentlyNonNull int paramInt) {
    this.e = e.a;
    this.d = paramInt;
    this.m = true;
  }
  
  f(int paramInt1, int paramInt2, int paramInt3, String paramString, IBinder paramIBinder, Scope[] paramArrayOfScope, Bundle paramBundle, Account paramAccount, c[] paramArrayOfc1, c[] paramArrayOfc2, boolean paramBoolean1, int paramInt4, boolean paramBoolean2) {
    this.d = paramInt2;
    this.e = paramInt3;
    if ("com.google.android.gms".equals(paramString)) {
      this.f = "com.google.android.gms";
    } else {
      this.f = paramString;
    } 
    if (paramInt1 < 2) {
      Account account;
      paramString = null;
      if (paramIBinder != null)
        account = a.a(j.a.a(paramIBinder)); 
      this.j = account;
    } else {
      this.g = paramIBinder;
      this.j = paramAccount;
    } 
    this.h = paramArrayOfScope;
    this.i = paramBundle;
    this.k = paramArrayOfc1;
    this.l = paramArrayOfc2;
    this.m = paramBoolean1;
    this.n = paramInt4;
    this.o = paramBoolean2;
  }
  
  public void writeToParcel(@RecentlyNonNull Parcel paramParcel, @RecentlyNonNull int paramInt) {
    int i = c.a(paramParcel);
    c.a(paramParcel, 1, this.c);
    c.a(paramParcel, 2, this.d);
    c.a(paramParcel, 3, this.e);
    c.a(paramParcel, 4, this.f, false);
    c.a(paramParcel, 5, this.g, false);
    c.a(paramParcel, 6, (Parcelable[])this.h, paramInt, false);
    c.a(paramParcel, 7, this.i, false);
    c.a(paramParcel, 8, (Parcelable)this.j, paramInt, false);
    c.a(paramParcel, 10, (Parcelable[])this.k, paramInt, false);
    c.a(paramParcel, 11, (Parcelable[])this.l, paramInt, false);
    c.a(paramParcel, 12, this.m);
    c.a(paramParcel, 13, this.n);
    c.a(paramParcel, 14, this.o);
    c.a(paramParcel, i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/gms/common/internal/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */