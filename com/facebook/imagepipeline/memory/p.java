package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import e.e.e.d.i;
import e.e.e.d.k;
import java.util.Set;

public class p implements d {
  private final Set<Bitmap> a = k.b();
  
  public void a(Bitmap paramBitmap) {
    i.a(paramBitmap);
    this.a.remove(paramBitmap);
    paramBitmap.recycle();
  }
  
  public Bitmap get(int paramInt) {
    double d1 = paramInt;
    Double.isNaN(d1);
    Bitmap bitmap = Bitmap.createBitmap(1, (int)Math.ceil(d1 / 2.0D), Bitmap.Config.RGB_565);
    this.a.add(bitmap);
    return bitmap;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */