package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public final class RatingCompat implements Parcelable {
  public static final Parcelable.Creator<RatingCompat> CREATOR = new a();
  
  private final int c;
  
  private final float d;
  
  RatingCompat(int paramInt, float paramFloat) {
    this.c = paramInt;
    this.d = paramFloat;
  }
  
  public int describeContents() {
    return this.c;
  }
  
  public String toString() {
    String str;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Rating:style=");
    stringBuilder.append(this.c);
    stringBuilder.append(" rating=");
    float f = this.d;
    if (f < 0.0F) {
      str = "unrated";
    } else {
      str = String.valueOf(f);
    } 
    stringBuilder.append(str);
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.c);
    paramParcel.writeFloat(this.d);
  }
  
  static final class a implements Parcelable.Creator<RatingCompat> {
    public RatingCompat createFromParcel(Parcel param1Parcel) {
      return new RatingCompat(param1Parcel.readInt(), param1Parcel.readFloat());
    }
    
    public RatingCompat[] newArray(int param1Int) {
      return new RatingCompat[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/RatingCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */