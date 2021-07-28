package e.e.l.c;

import android.graphics.Bitmap;
import e.e.e.h.a;

public abstract class f {
  public a<Bitmap> a(int paramInt1, int paramInt2) {
    return a(paramInt1, paramInt2, Bitmap.Config.ARGB_8888);
  }
  
  public a<Bitmap> a(int paramInt1, int paramInt2, Bitmap.Config paramConfig) {
    return a(paramInt1, paramInt2, paramConfig, null);
  }
  
  public a<Bitmap> a(int paramInt1, int paramInt2, Bitmap.Config paramConfig, Object paramObject) {
    return b(paramInt1, paramInt2, paramConfig);
  }
  
  public abstract a<Bitmap> b(int paramInt1, int paramInt2, Bitmap.Config paramConfig);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/c/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */