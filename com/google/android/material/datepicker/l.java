package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Calendar;

final class l implements Comparable<l>, Parcelable {
  public static final Parcelable.Creator<l> CREATOR = new a();
  
  private final Calendar c;
  
  private final String d;
  
  final int e;
  
  final int f;
  
  final int g;
  
  final int h;
  
  final long i;
  
  private l(Calendar paramCalendar) {
    paramCalendar.set(5, 1);
    this.c = r.a(paramCalendar);
    this.e = this.c.get(2);
    this.f = this.c.get(1);
    this.g = this.c.getMaximum(7);
    this.h = this.c.getActualMaximum(5);
    this.d = r.e().format(this.c.getTime());
    this.i = this.c.getTimeInMillis();
  }
  
  static l a(int paramInt1, int paramInt2) {
    Calendar calendar = r.d();
    calendar.set(1, paramInt1);
    calendar.set(2, paramInt2);
    return new l(calendar);
  }
  
  static l c(long paramLong) {
    Calendar calendar = r.d();
    calendar.setTimeInMillis(paramLong);
    return new l(calendar);
  }
  
  static l t() {
    return new l(r.b());
  }
  
  public int a(l paraml) {
    return this.c.compareTo(paraml.c);
  }
  
  int b(l paraml) {
    if (this.c instanceof java.util.GregorianCalendar)
      return (paraml.f - this.f) * 12 + paraml.e - this.e; 
    throw new IllegalArgumentException("Only Gregorian calendars are supported.");
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof l))
      return false; 
    paramObject = paramObject;
    return (this.e == ((l)paramObject).e && this.f == ((l)paramObject).f);
  }
  
  long f(int paramInt) {
    Calendar calendar = r.a(this.c);
    calendar.set(5, paramInt);
    return calendar.getTimeInMillis();
  }
  
  l g(int paramInt) {
    Calendar calendar = r.a(this.c);
    calendar.add(2, paramInt);
    return new l(calendar);
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { Integer.valueOf(this.e), Integer.valueOf(this.f) });
  }
  
  int q() {
    int j = this.c.get(7) - this.c.getFirstDayOfWeek();
    int i = j;
    if (j < 0)
      i = j + this.g; 
    return i;
  }
  
  String r() {
    return this.d;
  }
  
  long s() {
    return this.c.getTimeInMillis();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.f);
    paramParcel.writeInt(this.e);
  }
  
  static final class a implements Parcelable.Creator<l> {
    public l createFromParcel(Parcel param1Parcel) {
      return l.a(param1Parcel.readInt(), param1Parcel.readInt());
    }
    
    public l[] newArray(int param1Int) {
      return new l[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */