package e.e.l.c;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.imagepipeline.memory.d;
import e.e.e.d.i;
import e.e.e.h.c;

@TargetApi(21)
public class a extends f {
  private final d a;
  
  private final e.e.l.f.a b;
  
  public a(d paramd, e.e.l.f.a parama) {
    this.a = paramd;
    this.b = parama;
  }
  
  public e.e.e.h.a<Bitmap> b(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    boolean bool;
    int i = com.facebook.imageutils.a.a(paramInt1, paramInt2, paramConfig);
    Bitmap bitmap = (Bitmap)this.a.get(i);
    if (bitmap.getAllocationByteCount() >= paramInt1 * paramInt2 * com.facebook.imageutils.a.a(paramConfig)) {
      bool = true;
    } else {
      bool = false;
    } 
    i.a(bool);
    bitmap.reconfigure(paramInt1, paramInt2, paramConfig);
    return this.b.a(bitmap, (c)this.a);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/c/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */