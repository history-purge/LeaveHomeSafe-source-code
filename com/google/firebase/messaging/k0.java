package com.google.firebase.messaging;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.t.b;
import com.google.android.gms.common.internal.t.c;

public class k0 implements Parcelable.Creator<j0> {
  static void a(j0 paramj0, Parcel paramParcel, int paramInt) {
    paramInt = c.a(paramParcel);
    c.a(paramParcel, 2, paramj0.c, false);
    c.a(paramParcel, paramInt);
  }
  
  public j0 createFromParcel(Parcel paramParcel) {
    int i = b.b(paramParcel);
    Bundle bundle;
    for (bundle = null; paramParcel.dataPosition() < i; bundle = b.a(paramParcel, j)) {
      int j = b.a(paramParcel);
      if (b.a(j) != 2) {
        b.p(paramParcel, j);
        continue;
      } 
    } 
    b.h(paramParcel, i);
    return new j0(bundle);
  }
  
  public j0[] newArray(int paramInt) {
    return new j0[paramInt];
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/google/firebase/messaging/k0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */