package e.e.l.n;

import android.content.ContentResolver;
import android.media.ExifInterface;
import android.net.Uri;
import android.util.Pair;
import com.facebook.imageutils.c;
import e.e.e.d.f;
import e.e.e.g.g;
import e.e.e.g.h;
import e.e.e.g.i;
import e.e.e.k.f;
import e.e.l.e.e;
import e.e.l.k.d;
import e.e.l.o.c;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.Executor;

public class y implements w0<d> {
  private final Executor a;
  
  private final h b;
  
  private final ContentResolver c;
  
  public y(Executor paramExecutor, h paramh, ContentResolver paramContentResolver) {
    this.a = paramExecutor;
    this.b = paramh;
    this.c = paramContentResolver;
  }
  
  private int a(ExifInterface paramExifInterface) {
    return c.a(Integer.parseInt(paramExifInterface.getAttribute("Orientation")));
  }
  
  private d a(g paramg, ExifInterface paramExifInterface) {
    byte b;
    Pair pair = com.facebook.imageutils.a.a((InputStream)new i(paramg));
    int j = a(paramExifInterface);
    int i = -1;
    if (pair != null) {
      b = ((Integer)pair.first).intValue();
    } else {
      b = -1;
    } 
    if (pair != null)
      i = ((Integer)pair.second).intValue(); 
    e.e.e.h.a a = e.e.e.h.a.a((Closeable)paramg);
    try {
      d d = new d(a);
      e.e.e.h.a.b(a);
      d.a(e.e.k.b.a);
      d.f(j);
      d.h(b);
      return d;
    } finally {
      e.e.e.h.a.b(a);
    } 
  }
  
  ExifInterface a(Uri paramUri) {
    String str = f.a(this.c, paramUri);
    try {
      if (a(str))
        return new ExifInterface(str); 
    } catch (IOException iOException) {
    
    } catch (StackOverflowError stackOverflowError) {
      e.e.e.e.a.a(y.class, "StackOverflowError in ExifInterface constructor");
    } 
    return null;
  }
  
  public void a(k<d> paramk, k0 paramk0) {
    a a = new a(this, paramk, paramk0.e(), "LocalExifThumbnailProducer", paramk0.a(), paramk0.f());
    paramk0.a(new b(this, a));
    this.a.execute((Runnable)a);
  }
  
  public boolean a(e parame) {
    return x0.a(512, 512, parame);
  }
  
  boolean a(String paramString) {
    boolean bool2 = false;
    if (paramString == null)
      return false; 
    File file = new File(paramString);
    boolean bool1 = bool2;
    if (file.exists()) {
      bool1 = bool2;
      if (file.canRead())
        bool1 = true; 
    } 
    return bool1;
  }
  
  class a extends q0<d> {
    a(y this$0, k<d> param1k, m0 param1m0, String param1String1, String param1String2, c param1c) {
      super(param1k, param1m0, param1String1, param1String2);
    }
    
    protected void a(d param1d) {
      d.c(param1d);
    }
    
    protected d b() {
      Uri uri = this.h.p();
      ExifInterface exifInterface = this.i.a(uri);
      if (exifInterface == null || !exifInterface.hasThumbnail())
        return null; 
      byte[] arrayOfByte = exifInterface.getThumbnail();
      g g = y.a(this.i).a(arrayOfByte);
      return y.a(this.i, g, exifInterface);
    }
    
    protected Map<String, String> b(d param1d) {
      boolean bool;
      if (param1d != null) {
        bool = true;
      } else {
        bool = false;
      } 
      return f.of("createdThumbnail", Boolean.toString(bool));
    }
  }
  
  class b extends e {
    b(y this$0, q0 param1q0) {}
    
    public void a() {
      this.a.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/n/y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */