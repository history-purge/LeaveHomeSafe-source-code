package com.facebook.imagepipeline.memory;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import e.e.e.d.i;
import e.e.e.g.c;

@TargetApi(21)
public class h extends a<Bitmap> implements d {
  public h(c paramc, g0 paramg0, h0 paramh0) {
    super(paramc, paramg0, paramh0);
    a();
  }
  
  protected Bitmap a(int paramInt) {
    double d1 = paramInt;
    Double.isNaN(d1);
    return Bitmap.createBitmap(1, (int)Math.ceil(d1 / 2.0D), Bitmap.Config.RGB_565);
  }
  
  protected Bitmap a(f<Bitmap> paramf) {
    Bitmap bitmap = super.a(paramf);
    if (bitmap != null)
      bitmap.eraseColor(0); 
    return bitmap;
  }
  
  protected void a(Bitmap paramBitmap) {
    i.a(paramBitmap);
    paramBitmap.recycle();
  }
  
  protected int b(Bitmap paramBitmap) {
    i.a(paramBitmap);
    return paramBitmap.getAllocationByteCount();
  }
  
  protected boolean c(Bitmap paramBitmap) {
    i.a(paramBitmap);
    return (!paramBitmap.isRecycled() && paramBitmap.isMutable());
  }
  
  protected int d(int paramInt) {
    return paramInt;
  }
  
  protected int e(int paramInt) {
    return paramInt;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */