package e.e.l.n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import android.media.ThumbnailUtils;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.provider.DocumentsContract;
import android.provider.MediaStore;
import e.e.e.d.f;
import e.e.e.h.a;
import e.e.e.h.c;
import e.e.e.k.f;
import e.e.l.c.h;
import e.e.l.k.b;
import e.e.l.k.c;
import e.e.l.k.f;
import e.e.l.o.c;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.concurrent.Executor;

public class c0 implements j0<a<b>> {
  private final Executor a;
  
  private final ContentResolver b;
  
  public c0(Executor paramExecutor, ContentResolver paramContentResolver) {
    this.a = paramExecutor;
    this.b = paramContentResolver;
  }
  
  private static int b(c paramc) {
    return (paramc.h() > 96 || paramc.g() > 96) ? 1 : 3;
  }
  
  private static Bitmap b(ContentResolver paramContentResolver, Uri paramUri) {
    if (Build.VERSION.SDK_INT >= 10)
      try {
        ParcelFileDescriptor parcelFileDescriptor = paramContentResolver.openFileDescriptor(paramUri, "r");
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        return mediaMetadataRetriever.getFrameAtTime(-1L);
      } catch (FileNotFoundException fileNotFoundException) {
        return null;
      }  
    return null;
  }
  
  private String c(c paramc) {
    Uri uri = paramc.p();
    if (f.g(uri))
      return paramc.o().getPath(); 
    if (f.f(uri)) {
      String str1;
      String str2;
      String str3;
      if (Build.VERSION.SDK_INT >= 19 && "com.android.providers.media.documents".equals(uri.getAuthority())) {
        str2 = DocumentsContract.getDocumentId(uri);
        Uri uri1 = MediaStore.Video.Media.EXTERNAL_CONTENT_URI;
        String str = str2.split(":")[1];
        str2 = "_id=?";
        String[] arrayOfString = { str };
      } else {
        str1 = str2;
        str2 = null;
        str3 = str2;
      } 
      Cursor cursor = this.b.query((Uri)str1, new String[] { "_data" }, str2, (String[])str3, null);
      if (cursor != null)
        try {
          if (cursor.moveToFirst()) {
            str2 = cursor.getString(cursor.getColumnIndexOrThrow("_data"));
            return str2;
          } 
        } finally {
          if (cursor != null)
            cursor.close(); 
        }  
      if (cursor != null)
        cursor.close(); 
    } 
    return null;
  }
  
  public void a(k<a<b>> paramk, k0 paramk0) {
    m0 m0 = paramk0.e();
    String str = paramk0.a();
    a a = new a(this, paramk, m0, "VideoThumbnailProducer", str, m0, str, paramk0.f());
    paramk0.a(new b(this, a));
    this.a.execute((Runnable)a);
  }
  
  class a extends q0<a<b>> {
    a(c0 this$0, k<a<b>> param1k, m0 param1m01, String param1String1, String param1String2, m0 param1m02, String param1String3, c param1c) {
      super(param1k, param1m01, param1String1, param1String2);
    }
    
    protected void a(a<b> param1a) {
      a.b(param1a);
    }
    
    protected void a(Exception param1Exception) {
      super.a(param1Exception);
      this.h.a(this.i, "VideoThumbnailProducer", false);
    }
    
    protected a<b> b() {
      Bitmap bitmap;
      try {
        String str = c0.a(this.k, this.j);
      } catch (IllegalArgumentException illegalArgumentException) {
        illegalArgumentException = null;
      } 
      if (illegalArgumentException != null) {
        bitmap = ThumbnailUtils.createVideoThumbnail((String)illegalArgumentException, c0.a(this.j));
      } else {
        bitmap = c0.a(c0.a(this.k), this.j.p());
      } 
      return (bitmap == null) ? null : a.a((Closeable)new c(bitmap, (c)h.a(), f.d, 0));
    }
    
    protected Map<String, String> b(a<b> param1a) {
      boolean bool;
      if (param1a != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return f.of("createdThumbnail", String.valueOf(bool));
    }
    
    protected void c(a<b> param1a) {
      boolean bool;
      super.b(param1a);
      m0 m01 = this.h;
      String str = this.i;
      if (param1a != null) {
        bool = true;
      } else {
        bool = false;
      } 
      m01.a(str, "VideoThumbnailProducer", bool);
    }
  }
  
  class b extends e {
    b(c0 this$0, q0 param1q0) {}
    
    public void a() {
      this.a.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */