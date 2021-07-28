package android.support.v4.media.session;

import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableVolumeInfo implements Parcelable {
  public static final Parcelable.Creator<ParcelableVolumeInfo> CREATOR = new a();
  
  public int c;
  
  public int d;
  
  public int e;
  
  public int f;
  
  public int g;
  
  public ParcelableVolumeInfo(Parcel paramParcel) {
    this.c = paramParcel.readInt();
    this.e = paramParcel.readInt();
    this.f = paramParcel.readInt();
    this.g = paramParcel.readInt();
    this.d = paramParcel.readInt();
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.c);
    paramParcel.writeInt(this.e);
    paramParcel.writeInt(this.f);
    paramParcel.writeInt(this.g);
    paramParcel.writeInt(this.d);
  }
  
  static final class a implements Parcelable.Creator<ParcelableVolumeInfo> {
    public ParcelableVolumeInfo createFromParcel(Parcel param1Parcel) {
      return new ParcelableVolumeInfo(param1Parcel);
    }
    
    public ParcelableVolumeInfo[] newArray(int param1Int) {
      return new ParcelableVolumeInfo[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/session/ParcelableVolumeInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */