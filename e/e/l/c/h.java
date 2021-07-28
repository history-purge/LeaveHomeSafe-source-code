package e.e.l.c;

import android.graphics.Bitmap;
import e.e.e.h.c;

public class h implements c<Bitmap> {
  private static h a;
  
  public static h a() {
    if (a == null)
      a = new h(); 
    return a;
  }
  
  public void a(Bitmap paramBitmap) {
    paramBitmap.recycle();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/l/c/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */