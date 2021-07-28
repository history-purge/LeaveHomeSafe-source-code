package android.support.v4.media;

import a.a.a.a.b;
import android.os.Bundle;
import android.support.v4.media.session.MediaSessionCompat;
import android.util.Log;

class MediaBrowserCompat$CustomActionResultReceiver extends b {
  private final String e;
  
  private final Bundle f;
  
  private final a g;
  
  protected void a(int paramInt, Bundle paramBundle) {
    if (this.g == null)
      return; 
    MediaSessionCompat.a(paramBundle);
    if (paramInt != -1) {
      if (paramInt != 0) {
        if (paramInt != 1) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown result code: ");
          stringBuilder.append(paramInt);
          stringBuilder.append(" (extras=");
          stringBuilder.append(this.f);
          stringBuilder.append(", resultData=");
          stringBuilder.append(paramBundle);
          stringBuilder.append(")");
          Log.w("MediaBrowserCompat", stringBuilder.toString());
          return;
        } 
        this.g.b(this.e, this.f, paramBundle);
        return;
      } 
      this.g.c(this.e, this.f, paramBundle);
      return;
    } 
    this.g.a(this.e, this.f, paramBundle);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/MediaBrowserCompat$CustomActionResultReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */