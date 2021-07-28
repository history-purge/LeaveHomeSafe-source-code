package androidx.versionedparcelable;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;

@SuppressLint({"BanParcelableUsage"})
public class ParcelImpl implements Parcelable {
  public static final Parcelable.Creator<ParcelImpl> CREATOR = new a();
  
  private final c c;
  
  protected ParcelImpl(Parcel paramParcel) {
    this.c = (new b(paramParcel)).j();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    (new b(paramParcel)).a(this.c);
  }
  
  static final class a implements Parcelable.Creator<ParcelImpl> {
    public ParcelImpl createFromParcel(Parcel param1Parcel) {
      return new ParcelImpl(param1Parcel);
    }
    
    public ParcelImpl[] newArray(int param1Int) {
      return new ParcelImpl[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/androidx/versionedparcelable/ParcelImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */