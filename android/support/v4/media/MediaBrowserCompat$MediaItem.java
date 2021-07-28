package android.support.v4.media;

import android.os.Parcel;
import android.os.Parcelable;

public class MediaBrowserCompat$MediaItem implements Parcelable {
  public static final Parcelable.Creator<MediaBrowserCompat$MediaItem> CREATOR = new a();
  
  private final int c;
  
  private final MediaDescriptionCompat d;
  
  MediaBrowserCompat$MediaItem(Parcel paramParcel) {
    this.c = paramParcel.readInt();
    this.d = (MediaDescriptionCompat)MediaDescriptionCompat.CREATOR.createFromParcel(paramParcel);
  }
  
  public int describeContents() {
    return 0;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("MediaItem{");
    stringBuilder.append("mFlags=");
    stringBuilder.append(this.c);
    stringBuilder.append(", mDescription=");
    stringBuilder.append(this.d);
    stringBuilder.append('}');
    return stringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeInt(this.c);
    this.d.writeToParcel(paramParcel, paramInt);
  }
  
  static final class a implements Parcelable.Creator<MediaBrowserCompat$MediaItem> {
    public MediaBrowserCompat$MediaItem createFromParcel(Parcel param1Parcel) {
      return new MediaBrowserCompat$MediaItem(param1Parcel);
    }
    
    public MediaBrowserCompat$MediaItem[] newArray(int param1Int) {
      return new MediaBrowserCompat$MediaItem[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/MediaBrowserCompat$MediaItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */