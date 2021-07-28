package android.support.v4.media;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

public final class MediaMetadataCompat implements Parcelable {
  public static final Parcelable.Creator<MediaMetadataCompat> CREATOR;
  
  static final b.d.a<String, Integer> e = new b.d.a();
  
  final Bundle c;
  
  private Object d;
  
  static {
    b.d.a<String, Integer> a1 = e;
    Integer integer1 = Integer.valueOf(1);
    a1.put("android.media.metadata.TITLE", integer1);
    e.put("android.media.metadata.ARTIST", integer1);
    b.d.a<String, Integer> a2 = e;
    Integer integer2 = Integer.valueOf(0);
    a2.put("android.media.metadata.DURATION", integer2);
    e.put("android.media.metadata.ALBUM", integer1);
    e.put("android.media.metadata.AUTHOR", integer1);
    e.put("android.media.metadata.WRITER", integer1);
    e.put("android.media.metadata.COMPOSER", integer1);
    e.put("android.media.metadata.COMPILATION", integer1);
    e.put("android.media.metadata.DATE", integer1);
    e.put("android.media.metadata.YEAR", integer2);
    e.put("android.media.metadata.GENRE", integer1);
    e.put("android.media.metadata.TRACK_NUMBER", integer2);
    e.put("android.media.metadata.NUM_TRACKS", integer2);
    e.put("android.media.metadata.DISC_NUMBER", integer2);
    e.put("android.media.metadata.ALBUM_ARTIST", integer1);
    b.d.a<String, Integer> a3 = e;
    Integer integer3 = Integer.valueOf(2);
    a3.put("android.media.metadata.ART", integer3);
    e.put("android.media.metadata.ART_URI", integer1);
    e.put("android.media.metadata.ALBUM_ART", integer3);
    e.put("android.media.metadata.ALBUM_ART_URI", integer1);
    a3 = e;
    Integer integer4 = Integer.valueOf(3);
    a3.put("android.media.metadata.USER_RATING", integer4);
    e.put("android.media.metadata.RATING", integer4);
    e.put("android.media.metadata.DISPLAY_TITLE", integer1);
    e.put("android.media.metadata.DISPLAY_SUBTITLE", integer1);
    e.put("android.media.metadata.DISPLAY_DESCRIPTION", integer1);
    e.put("android.media.metadata.DISPLAY_ICON", integer3);
    e.put("android.media.metadata.DISPLAY_ICON_URI", integer1);
    e.put("android.media.metadata.MEDIA_ID", integer1);
    e.put("android.media.metadata.BT_FOLDER_TYPE", integer2);
    e.put("android.media.metadata.MEDIA_URI", integer1);
    e.put("android.media.metadata.ADVERTISEMENT", integer2);
    e.put("android.media.metadata.DOWNLOAD_STATUS", integer2);
    CREATOR = new a();
  }
  
  MediaMetadataCompat(Parcel paramParcel) {
    this.c = paramParcel.readBundle(MediaSessionCompat.class.getClassLoader());
  }
  
  public static MediaMetadataCompat a(Object paramObject) {
    if (paramObject != null && Build.VERSION.SDK_INT >= 21) {
      Parcel parcel = Parcel.obtain();
      f.a(paramObject, parcel, 0);
      parcel.setDataPosition(0);
      MediaMetadataCompat mediaMetadataCompat = (MediaMetadataCompat)CREATOR.createFromParcel(parcel);
      parcel.recycle();
      mediaMetadataCompat.d = paramObject;
      return mediaMetadataCompat;
    } 
    return null;
  }
  
  public int describeContents() {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt) {
    paramParcel.writeBundle(this.c);
  }
  
  static final class a implements Parcelable.Creator<MediaMetadataCompat> {
    public MediaMetadataCompat createFromParcel(Parcel param1Parcel) {
      return new MediaMetadataCompat(param1Parcel);
    }
    
    public MediaMetadataCompat[] newArray(int param1Int) {
      return new MediaMetadataCompat[param1Int];
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/MediaMetadataCompat.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */