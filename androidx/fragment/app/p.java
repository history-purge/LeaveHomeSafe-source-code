package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
final class p implements Parcelable {
  public static final Parcelable.Creator<p> CREATOR = new a();
  
  ArrayList<u> c;
  
  ArrayList<String> d;
  
  b[] e;
  
  int f;
  
  String g = null;
  
  ArrayList<String> h = new ArrayList<String>();
  
  ArrayList<Bundle> i = new ArrayList<Bundle>();
  
  ArrayList<n.n> j;
  
  public p() {}
  
  public p(Parcel paramParcel) {
    this.c = paramParcel.createTypedArrayList(u.CREATOR);
    this.d = paramParcel.createStringArrayList();
    this.e = (b[])paramParcel.createTypedArray(b.CREATOR);
    this.f = paramParcel.readInt();
    this.g = paramParcel.readString();
    this.h = paramParcel.createStringArrayList();
    this.i = paramParcel.createTypedArrayList(Bundle.CREATOR);
    this.j = paramParcel.createTypedArrayList(n.n.CREATOR);
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeTypedList(this.c);
    paramParcel.writeStringList(this.d);
    paramParcel.writeTypedArray((Parcelable[])this.e, paramInt);
    paramParcel.writeInt(this.f);
    paramParcel.writeString(this.g);
    paramParcel.writeStringList(this.h);
    paramParcel.writeTypedList(this.i);
    paramParcel.writeTypedList(this.j);
  }
  
  class a implements Parcelable.Creator<p> {
    public p createFromParcel(Parcel param1Parcel) {
      return new p(param1Parcel);
    }
    
    public p[] newArray(int param1Int) {
      return new p[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/fragment/app/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */