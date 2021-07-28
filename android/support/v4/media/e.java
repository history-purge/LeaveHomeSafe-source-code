package android.support.v4.media;

import android.media.MediaDescription;
import android.net.Uri;

class e {
  public static Uri a(Object paramObject) {
    return ((MediaDescription)paramObject).getMediaUri();
  }
  
  static class a {
    public static void a(Object param1Object, Uri param1Uri) {
      ((MediaDescription.Builder)param1Object).setMediaUri(param1Uri);
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */