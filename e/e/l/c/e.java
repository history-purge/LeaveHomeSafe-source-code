package e.e.l.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.platform.f;
import e.e.e.g.g;
import e.e.e.h.a;
import e.e.k.b;
import e.e.l.f.a;
import e.e.l.k.d;

@TargetApi(11)
public class e extends f {
  private static final String e = "e";
  
  private final b a;
  
  private final f b;
  
  private final a c;
  
  private boolean d;
  
  public e(b paramb, f paramf, a parama) {
    this.a = paramb;
    this.b = paramf;
    this.c = parama;
  }
  
  private a<Bitmap> c(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    return this.c.a(Bitmap.createBitmap(paramInt1, paramInt2, paramConfig), h.a());
  }
  
  @TargetApi(12)
  public a<Bitmap> b(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    if (this.d)
      return c(paramInt1, paramInt2, paramConfig); 
    a<g> a1 = this.a.a((short)paramInt1, (short)paramInt2);
    try {
      d d = new d(a1);
      d.a(b.a);
    } finally {
      a1.close();
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/c/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */