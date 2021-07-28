package android.support.v4.media.session;

import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.support.v4.media.MediaMetadataCompat;
import java.lang.ref.WeakReference;
import java.util.List;

public abstract class c implements IBinder.DeathRecipient {
  a a;
  
  a b;
  
  public c() {
    if (Build.VERSION.SDK_INT >= 21) {
      f.a(new b(this));
      return;
    } 
    this.b = new c(this);
  }
  
  public void a() {}
  
  void a(int paramInt, Object paramObject, Bundle paramBundle) {
    a a1 = this.a;
    if (a1 != null) {
      paramObject = a1.obtainMessage(paramInt, paramObject);
      paramObject.setData(paramBundle);
      paramObject.sendToTarget();
    } 
  }
  
  public void a(Bundle paramBundle) {}
  
  public void a(MediaMetadataCompat paramMediaMetadataCompat) {}
  
  public void a(PlaybackStateCompat paramPlaybackStateCompat) {}
  
  public void a(e parame) {}
  
  public void a(CharSequence paramCharSequence) {}
  
  public void a(String paramString, Bundle paramBundle) {}
  
  public void a(List<MediaSessionCompat.QueueItem> paramList) {}
  
  public void binderDied() {
    a(8, null, null);
  }
  
  private class a extends Handler {}
  
  private static class b implements f.a {
    private final WeakReference<c> a;
    
    b(c param1c) {
      this.a = new WeakReference<c>(param1c);
    }
    
    public void a(int param1Int1, int param1Int2, int param1Int3, int param1Int4, int param1Int5) {
      c c = this.a.get();
      if (c != null)
        c.a(new e(param1Int1, param1Int2, param1Int3, param1Int4, param1Int5)); 
    }
    
    public void a(Bundle param1Bundle) {
      c c = this.a.get();
      if (c != null)
        c.a(param1Bundle); 
    }
    
    public void a(CharSequence param1CharSequence) {
      c c = this.a.get();
      if (c != null)
        c.a(param1CharSequence); 
    }
    
    public void a(Object param1Object) {
      c c = this.a.get();
      if (c != null)
        c.a(MediaMetadataCompat.a(param1Object)); 
    }
    
    public void a(String param1String, Bundle param1Bundle) {
      c c = this.a.get();
      if (c != null) {
        if (c.b != null && Build.VERSION.SDK_INT < 23)
          return; 
        c.a(param1String, param1Bundle);
      } 
    }
    
    public void a(List<?> param1List) {
      c c = this.a.get();
      if (c != null)
        c.a(MediaSessionCompat.QueueItem.a(param1List)); 
    }
    
    public void b(Object param1Object) {
      c c = this.a.get();
      if (c != null) {
        if (c.b != null)
          return; 
        c.a(PlaybackStateCompat.a(param1Object));
      } 
    }
    
    public void c() {
      c c = this.a.get();
      if (c != null)
        c.a(); 
    }
  }
  
  private static class c extends a.a {
    private final WeakReference<c> a;
    
    c(c param1c) {
      this.a = new WeakReference<c>(param1c);
    }
    
    public void a(int param1Int) {
      c c1 = this.a.get();
      if (c1 != null)
        c1.a(9, Integer.valueOf(param1Int), null); 
    }
    
    public void a(Bundle param1Bundle) {
      c c1 = this.a.get();
      if (c1 != null)
        c1.a(7, param1Bundle, null); 
    }
    
    public void a(MediaMetadataCompat param1MediaMetadataCompat) {
      c c1 = this.a.get();
      if (c1 != null)
        c1.a(3, param1MediaMetadataCompat, null); 
    }
    
    public void a(ParcelableVolumeInfo param1ParcelableVolumeInfo) {
      c c1 = this.a.get();
      if (c1 != null) {
        if (param1ParcelableVolumeInfo != null) {
          e e = new e(param1ParcelableVolumeInfo.c, param1ParcelableVolumeInfo.d, param1ParcelableVolumeInfo.e, param1ParcelableVolumeInfo.f, param1ParcelableVolumeInfo.g);
        } else {
          param1ParcelableVolumeInfo = null;
        } 
        c1.a(4, param1ParcelableVolumeInfo, null);
      } 
    }
    
    public void a(PlaybackStateCompat param1PlaybackStateCompat) {
      c c1 = this.a.get();
      if (c1 != null)
        c1.a(2, param1PlaybackStateCompat, null); 
    }
    
    public void a(CharSequence param1CharSequence) {
      c c1 = this.a.get();
      if (c1 != null)
        c1.a(6, param1CharSequence, null); 
    }
    
    public void a(String param1String, Bundle param1Bundle) {
      c c1 = this.a.get();
      if (c1 != null)
        c1.a(1, param1String, param1Bundle); 
    }
    
    public void a(List<MediaSessionCompat.QueueItem> param1List) {
      c c1 = this.a.get();
      if (c1 != null)
        c1.a(5, param1List, null); 
    }
    
    public void a(boolean param1Boolean) {}
    
    public void b(int param1Int) {
      c c1 = this.a.get();
      if (c1 != null)
        c1.a(12, Integer.valueOf(param1Int), null); 
    }
    
    public void b(boolean param1Boolean) {
      c c1 = this.a.get();
      if (c1 != null)
        c1.a(11, Boolean.valueOf(param1Boolean), null); 
    }
    
    public void c() {
      c c1 = this.a.get();
      if (c1 != null)
        c1.a(8, null, null); 
    }
    
    public void d() {
      c c1 = this.a.get();
      if (c1 != null)
        c1.a(13, null, null); 
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/android/support/v4/media/session/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */