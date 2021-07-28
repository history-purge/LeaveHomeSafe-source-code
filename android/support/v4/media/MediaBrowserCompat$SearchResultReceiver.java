package android.support.v4.media;

import a.a.a.a.b;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.media.session.MediaSessionCompat;
import java.util.ArrayList;

class MediaBrowserCompat$SearchResultReceiver extends b {
  private final String e;
  
  private final Bundle f;
  
  private final c g;
  
  protected void a(int paramInt, Bundle paramBundle) {
    ArrayList<MediaBrowserCompat$MediaItem> arrayList;
    MediaSessionCompat.a(paramBundle);
    if (paramInt != 0 || paramBundle == null || !paramBundle.containsKey("search_results")) {
      this.g.a(this.e, this.f);
      return;
    } 
    Parcelable[] arrayOfParcelable = paramBundle.getParcelableArray("search_results");
    paramBundle = null;
    if (arrayOfParcelable != null) {
      ArrayList<MediaBrowserCompat$MediaItem> arrayList1 = new ArrayList();
      int i = arrayOfParcelable.length;
      paramInt = 0;
      while (true) {
        arrayList = arrayList1;
        if (paramInt < i) {
          arrayList1.add((MediaBrowserCompat$MediaItem)arrayOfParcelable[paramInt]);
          paramInt++;
          continue;
        } 
        break;
      } 
    } 
    this.g.a(this.e, this.f, arrayList);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/MediaBrowserCompat$SearchResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */