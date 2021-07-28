package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import e.e.e.d.i;

public class o implements d {
  public void a(Bitmap paramBitmap) {
    i.a(paramBitmap);
    paramBitmap.recycle();
  }
  
  public Bitmap get(int paramInt) {
    double d1 = paramInt;
    Double.isNaN(d1);
    return Bitmap.createBitmap(1, (int)Math.ceil(d1 / 2.0D), Bitmap.Config.RGB_565);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */