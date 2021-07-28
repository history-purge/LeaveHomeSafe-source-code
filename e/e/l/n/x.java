package e.e.l.n;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imageutils.c;
import e.e.e.e.a;
import e.e.e.g.h;
import e.e.e.k.f;
import e.e.l.e.e;
import e.e.l.k.d;
import e.e.l.o.c;
import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executor;

public class x extends z implements w0<d> {
  private static final Class<?> d = x.class;
  
  private static final String[] e = new String[] { "_id", "_data" };
  
  private static final String[] f = new String[] { "_data" };
  
  private static final Rect g = new Rect(0, 0, 512, 384);
  
  private static final Rect h = new Rect(0, 0, 96, 96);
  
  private final ContentResolver c;
  
  public x(Executor paramExecutor, h paramh, ContentResolver paramContentResolver) {
    super(paramExecutor, paramh);
    this.c = paramContentResolver;
  }
  
  private static int a(String paramString) {
    return (paramString == null) ? -1 : (int)(new File(paramString)).length();
  }
  
  private d a(Uri paramUri, e parame) {
    Cursor cursor = this.c.query(paramUri, e, null, null, null);
    if (cursor == null)
      return null; 
    try {
      int i = cursor.getCount();
      if (i == 0)
        return null; 
      cursor.moveToFirst();
      String str = cursor.getString(cursor.getColumnIndex("_data"));
      if (parame != null) {
        d d = a(parame, cursor.getInt(cursor.getColumnIndex("_id")));
        if (d != null) {
          d.f(b(str));
          return d;
        } 
      } 
      return null;
    } finally {
      cursor.close();
    } 
  }
  
  private d a(e parame, int paramInt) {
    Exception exception;
    int i = b(parame);
    if (i == 0)
      return null; 
    try {
      Cursor cursor = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.c, paramInt, i, f);
      if (cursor == null)
        return null; 
    } finally {
      exception = null;
    } 
    if (parame != null)
      parame.close(); 
    throw exception;
  }
  
  private static int b(e parame) {
    return x0.a(h.width(), h.height(), parame) ? 3 : (x0.a(g.width(), g.height(), parame) ? 1 : 0);
  }
  
  private static int b(String paramString) {
    if (paramString != null)
      try {
        return c.a((new ExifInterface(paramString)).getAttributeInt("Orientation", 1));
      } catch (IOException iOException) {
        a.a(d, iOException, "Unable to retrieve thumbnail rotation for %s", new Object[] { paramString });
      }  
    return 0;
  }
  
  protected d a(c paramc) {
    Uri uri = paramc.p();
    if (f.d(uri)) {
      d d = a(uri, paramc.l());
      if (d != null)
        return d; 
    } 
    return null;
  }
  
  protected String a() {
    return "LocalContentUriThumbnailFetchProducer";
  }
  
  public boolean a(e parame) {
    return x0.a(g.width(), g.height(), parame);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */