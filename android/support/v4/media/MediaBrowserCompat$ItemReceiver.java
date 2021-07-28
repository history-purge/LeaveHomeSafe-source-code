package android.support.v4.media;

import a.a.a.a.b;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;

class MediaBrowserCompat$ItemReceiver extends b {
  private final String e;
  
  private final b f;
  
  protected void a(int paramInt, Bundle paramBundle) {
    MediaSessionCompat.a(paramBundle);
    if (paramInt != 0 || paramBundle == null || !paramBundle.containsKey("media_item")) {
      this.f.a(this.e);
      return;
    } 
    Parcelable parcelable = paramBundle.getParcelable("media_item");
    if (parcelable == null || parcelable instanceof MediaBrowserCompat$MediaItem) {
      this.f.a((MediaBrowserCompat$MediaItem)parcelable);
      return;
    } 
    this.f.a(this.e);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/MediaBrowserCompat$ItemReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */