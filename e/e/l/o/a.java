package e.e.l.o;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import com.facebook.imagepipeline.nativecode.Bitmaps;
import e.e.c.a.d;
import e.e.l.c.f;

public abstract class a implements e {
  public static final Bitmap.Config a = Bitmap.Config.ARGB_8888;
  
  private static void b(Bitmap paramBitmap1, Bitmap paramBitmap2) {
    if (paramBitmap1.getConfig() == paramBitmap2.getConfig()) {
      Bitmaps.a(paramBitmap1, paramBitmap2);
      return;
    } 
    (new Canvas(paramBitmap1)).drawBitmap(paramBitmap2, 0.0F, 0.0F, null);
  }
  
  public d a() {
    return null;
  }
  
  public e.e.e.h.a<Bitmap> a(Bitmap paramBitmap, f paramf) {
    Bitmap.Config config = paramBitmap.getConfig();
    int i = paramBitmap.getWidth();
    int j = paramBitmap.getHeight();
    if (config == null)
      config = a; 
    e.e.e.h.a a1 = paramf.b(i, j, config);
    try {
      a((Bitmap)a1.b(), paramBitmap);
      return e.e.e.h.a.a(a1);
    } finally {
      e.e.e.h.a.b(a1);
    } 
  }
  
  public void a(Bitmap paramBitmap) {}
  
  public void a(Bitmap paramBitmap1, Bitmap paramBitmap2) {
    b(paramBitmap1, paramBitmap2);
    a(paramBitmap1);
  }
  
  public String getName() {
    return "Unknown postprocessor";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/o/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */