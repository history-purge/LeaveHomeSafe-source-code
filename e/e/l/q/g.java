package e.e.l.q;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Build;
import e.e.e.e.a;
import e.e.k.b;
import e.e.k.c;
import e.e.l.e.e;
import e.e.l.e.f;
import e.e.l.k.d;
import java.io.OutputStream;

public class g implements c {
  private final boolean a;
  
  private final int b;
  
  public g(boolean paramBoolean, int paramInt) {
    this.a = paramBoolean;
    this.b = paramInt;
  }
  
  private int b(d paramd, f paramf, e parame) {
    return !this.a ? 1 : a.a(paramf, parame, paramd, this.b);
  }
  
  private static Bitmap.CompressFormat b(c paramc) {
    return (paramc == null) ? Bitmap.CompressFormat.JPEG : ((paramc == b.a) ? Bitmap.CompressFormat.JPEG : ((paramc == b.b) ? Bitmap.CompressFormat.PNG : ((Build.VERSION.SDK_INT >= 14 && b.a(paramc)) ? Bitmap.CompressFormat.WEBP : Bitmap.CompressFormat.JPEG)));
  }
  
  public b a(d paramd, OutputStream paramOutputStream, f paramf, e parame, c paramc, Integer paramInteger) {
    f f1;
    if (paramInteger == null)
      paramInteger = Integer.valueOf(85); 
    if (paramf == null) {
      f1 = f.e();
    } else {
      f1 = paramf;
    } 
    int i = b(paramd, f1, parame);
    BitmapFactory.Options options = new BitmapFactory.Options();
    options.inSampleSize = i;
    try {
      Bitmap bitmap1;
      Bitmap bitmap2;
      Bitmap bitmap3 = BitmapFactory.decodeStream(paramd.u(), null, options);
      if (bitmap3 == null) {
        a.b("SimpleImageTranscoder", "Couldn't decode the EncodedImage InputStream ! ");
        return new b(2);
      } 
      Matrix matrix = e.a(paramd, f1);
      if (matrix != null) {
        try {
          bitmap1 = Bitmap.createBitmap(bitmap3, 0, 0, bitmap3.getWidth(), bitmap3.getHeight(), matrix, false);
        } catch (OutOfMemoryError outOfMemoryError) {
        
        } finally {
          matrix = null;
        } 
      } else {
        bitmap1 = bitmap3;
      } 
      Bitmap bitmap4 = bitmap1;
      try {
        bitmap1.compress(b(paramc), paramInteger.intValue(), (OutputStream)bitmap2);
        boolean bool = true;
        if (i > 1)
          bool = false; 
        bitmap4 = bitmap1;
        b b1 = new b(bool);
        bitmap1.recycle();
        return b1;
      } catch (OutOfMemoryError outOfMemoryError) {
      
      } finally {
        bitmap1 = null;
      } 
      bitmap4 = bitmap1;
      a.b("SimpleImageTranscoder", "Out-Of-Memory during transcode", (Throwable)bitmap2);
      bitmap4 = bitmap1;
      b b = new b(2);
      bitmap1.recycle();
      bitmap3.recycle();
      return b;
    } catch (OutOfMemoryError outOfMemoryError) {
      a.b("SimpleImageTranscoder", "Out-Of-Memory during transcode", outOfMemoryError);
      return new b(2);
    } 
  }
  
  public String a() {
    return "SimpleImageTranscoder";
  }
  
  public boolean a(c paramc) {
    return (paramc == b.k || paramc == b.a);
  }
  
  public boolean a(d paramd, f paramf, e parame) {
    f f1 = paramf;
    if (paramf == null)
      f1 = f.e(); 
    return (this.a && a.a(f1, parame, paramd, this.b) > 1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/q/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */