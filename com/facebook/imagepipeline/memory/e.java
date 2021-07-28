package com.facebook.imagepipeline.memory;

import android.graphics.Bitmap;
import com.facebook.imageutils.a;
import e.e.e.e.a;

public class e extends t<Bitmap> {
  public int a(Bitmap paramBitmap) {
    return a.a(paramBitmap);
  }
  
  protected boolean b(Bitmap paramBitmap) {
    if (paramBitmap == null)
      return false; 
    if (paramBitmap.isRecycled()) {
      a.d("BitmapPoolBackend", "Cannot reuse a recycled bitmap: %s", new Object[] { paramBitmap });
      return false;
    } 
    if (!paramBitmap.isMutable()) {
      a.d("BitmapPoolBackend", "Cannot reuse an immutable bitmap: %s", new Object[] { paramBitmap });
      return false;
    } 
    return true;
  }
  
  public void c(Bitmap paramBitmap) {
    if (b(paramBitmap))
      super.b(paramBitmap); 
  }
  
  public Bitmap get(int paramInt) {
    Bitmap bitmap = super.get(paramInt);
    if (bitmap != null && b(bitmap)) {
      bitmap.eraseColor(0);
      return bitmap;
    } 
    return null;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/memory/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */