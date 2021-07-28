package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

public class f implements a.c {
  public static final Parcelable.Creator<f> CREATOR = new a();
  
  private final long c;
  
  private f(long paramLong) {
    this.c = paramLong;
  }
  
  public static f b(long paramLong) {
    return new f(paramLong);
  }
  
  public boolean a(long paramLong) {
    return (paramLong >= this.c);
  }
  
  public int describeContents() {
    return 0;
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof f))
      return false; 
    paramObject = paramObject;
    return (this.c == ((f)paramObject).c);
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { Long.valueOf(this.c) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeLong(this.c);
  }
  
  static final class a implements Parcelable.Creator<f> {
    public f createFromParcel(Parcel param1Parcel) {
      return new f(param1Parcel.readLong(), null);
    }
    
    public f[] newArray(int param1Int) {
      return new f[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/android/material/datepicker/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */