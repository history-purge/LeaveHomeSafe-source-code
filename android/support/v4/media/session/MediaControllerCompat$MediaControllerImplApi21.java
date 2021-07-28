package android.support.v4.media.session;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.ResultReceiver;
import android.support.v4.media.MediaMetadataCompat;
import android.util.Log;
import androidx.core.app.e;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

class MediaControllerCompat$MediaControllerImplApi21 implements d {
  final Object a;
  
  private final List<c> b;
  
  private HashMap<c, a> c;
  
  final MediaSessionCompat.Token d;
  
  void a() {
    if (this.d.e() == null)
      return; 
    Iterator<c> iterator = this.b.iterator();
    while (iterator.hasNext()) {
      c c = iterator.next();
      a a = new a(c);
      this.c.put(c, a);
      c.b = a;
      try {
        this.d.e().a(a);
        c.a(13, null, null);
      } catch (RemoteException remoteException) {
        Log.e("MediaControllerCompat", "Dead object in registerCallback.", (Throwable)remoteException);
        break;
      } 
    } 
    this.b.clear();
  }
  
  private static class ExtraBinderRequestResultReceiver extends ResultReceiver {
    private WeakReference<MediaControllerCompat$MediaControllerImplApi21> c;
    
    protected void onReceiveResult(int param1Int, Bundle param1Bundle) {
      MediaControllerCompat$MediaControllerImplApi21 mediaControllerCompat$MediaControllerImplApi21 = this.c.get();
      if (mediaControllerCompat$MediaControllerImplApi21 != null) {
        if (param1Bundle == null)
          return; 
        synchronized (mediaControllerCompat$MediaControllerImplApi21.a) {
          mediaControllerCompat$MediaControllerImplApi21.d.a(b.a.a(e.a(param1Bundle, "android.support.v4.media.session.EXTRA_BINDER")));
          mediaControllerCompat$MediaControllerImplApi21.d.a(param1Bundle.getBundle("android.support.v4.media.session.SESSION_TOKEN2_BUNDLE"));
          mediaControllerCompat$MediaControllerImplApi21.a();
          return;
        } 
      } 
    }
  }
  
  private static class a extends c.c {
    a(c param1c) {
      super(param1c);
    }
    
    public void a(Bundle param1Bundle) {
      throw new AssertionError();
    }
    
    public void a(MediaMetadataCompat param1MediaMetadataCompat) {
      throw new AssertionError();
    }
    
    public void a(ParcelableVolumeInfo param1ParcelableVolumeInfo) {
      throw new AssertionError();
    }
    
    public void a(CharSequence param1CharSequence) {
      throw new AssertionError();
    }
    
    public void a(List<MediaSessionCompat.QueueItem> param1List) {
      throw new AssertionError();
    }
    
    public void c() {
      throw new AssertionError();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/session/MediaControllerCompat$MediaControllerImplApi21.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */