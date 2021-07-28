package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public final class a implements Parcelable {
  public static final Parcelable.Creator<a> CREATOR = new a();
  
  private final l c;
  
  private final l d;
  
  private final l e;
  
  private final c f;
  
  private final int g;
  
  private final int h;
  
  private a(l paraml1, l paraml2, l paraml3, c paramc) {
    this.c = paraml1;
    this.d = paraml2;
    this.e = paraml3;
    this.f = paramc;
    if (paraml1.a(paraml3) <= 0) {
      if (paraml3.a(paraml2) <= 0) {
        this.h = paraml1.b(paraml2) + 1;
        this.g = paraml2.f - paraml1.f + 1;
        return;
      } 
      throw new IllegalArgumentException("current Month cannot be after end Month");
    } 
    throw new IllegalArgumentException("start Month cannot be after current Month");
  }
  
  public int describeContents() {
    return 0;
  }
  
  public c e() {
    return this.f;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof a))
      return false; 
    paramObject = paramObject;
    return (this.c.equals(((a)paramObject).c) && this.d.equals(((a)paramObject).d) && this.e.equals(((a)paramObject).e) && this.f.equals(((a)paramObject).f));
  }
  
  l f() {
    return this.d;
  }
  
  int g() {
    return this.h;
  }
  
  l h() {
    return this.e;
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { this.c, this.d, this.e, this.f });
  }
  
  l i() {
    return this.c;
  }
  
  int j() {
    return this.g;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeParcelable(this.c, 0);
    paramParcel.writeParcelable(this.d, 0);
    paramParcel.writeParcelable(this.e, 0);
    paramParcel.writeParcelable(this.f, 0);
  }
  
  static final class a implements Parcelable.Creator<a> {
    public a createFromParcel(Parcel param1Parcel) {
      return new a((l)param1Parcel.readParcelable(l.class.getClassLoader()), (l)param1Parcel.readParcelable(l.class.getClassLoader()), (l)param1Parcel.readParcelable(l.class.getClassLoader()), (a.c)param1Parcel.readParcelable(a.c.class.getClassLoader()), null);
    }
    
    public a[] newArray(int param1Int) {
      return new a[param1Int];
    }
  }
  
  public static final class b {
    static final long e = r.a((l.a(1900, 0)).i);
    
    static final long f = r.a((l.a(2100, 11)).i);
    
    private long a = e;
    
    private long b = f;
    
    private Long c;
    
    private a.c d = f.b(Long.MIN_VALUE);
    
    b(a param1a) {
      this.a = (a.a(param1a)).i;
      this.b = (a.b(param1a)).i;
      this.c = Long.valueOf((a.c(param1a)).i);
      this.d = a.d(param1a);
    }
    
    public b a(long param1Long) {
      this.c = Long.valueOf(param1Long);
      return this;
    }
    
    public a a() {
      if (this.c == null) {
        long l = i.F0();
        if (this.a > l || l > this.b)
          l = this.a; 
        this.c = Long.valueOf(l);
      } 
      Bundle bundle = new Bundle();
      bundle.putParcelable("DEEP_COPY_VALIDATOR_KEY", this.d);
      return new a(l.c(this.a), l.c(this.b), l.c(this.c.longValue()), (a.c)bundle.getParcelable("DEEP_COPY_VALIDATOR_KEY"), null);
    }
  }
  
  public static interface c extends Parcelable {
    boolean a(long param1Long);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */