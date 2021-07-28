package androidx.activity.result;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public final class a implements Parcelable {
  public static final Parcelable.Creator<a> CREATOR = new a();
  
  private final int c;
  
  private final Intent d;
  
  public a(int paramInt, Intent paramIntent) {
    this.c = paramInt;
    this.d = paramIntent;
  }
  
  a(Parcel paramParcel) {
    Intent intent;
    this.c = paramParcel.readInt();
    if (paramParcel.readInt() == 0) {
      paramParcel = null;
    } else {
      intent = (Intent)Intent.CREATOR.createFromParcel(paramParcel);
    } 
    this.d = intent;
  }
  
  public static String a(int paramInt) {
    return (paramInt != -1) ? ((paramInt != 0) ? String.valueOf(paramInt) : "RESULT_CANCELED") : "RESULT_OK";
  }
  
  public int describeContents() {
    return 0;
  }
  
  public Intent e() {
    return this.d;
  }
  
  public int f() {
    return this.c;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("ActivityResult{resultCode=");
    stringBuilder.append(a(this.c));
    stringBuilder.append(", data=");
    stringBuilder.append(this.d);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    boolean bool;
    paramParcel.writeInt(this.c);
    if (this.d == null) {
      bool = false;
    } else {
      bool = true;
    } 
    paramParcel.writeInt(bool);
    Intent intent = this.d;
    if (intent != null)
      intent.writeToParcel(paramParcel, paramInt); 
  }
  
  class a implements Parcelable.Creator<a> {
    public a createFromParcel(Parcel param1Parcel) {
      return new a(param1Parcel);
    }
    
    public a[] newArray(int param1Int) {
      return new a[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/activity/result/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */