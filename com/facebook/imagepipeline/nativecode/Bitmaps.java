package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import e.e.e.d.d;
import e.e.e.d.i;

@d
public class Bitmaps {
  static {
    a.a();
  }
  
  public static void a(Bitmap paramBitmap1, Bitmap paramBitmap2) {
    boolean bool1;
    Bitmap.Config config1 = paramBitmap2.getConfig();
    Bitmap.Config config2 = paramBitmap1.getConfig();
    boolean bool2 = true;
    if (config1 == config2) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    i.a(paramBitmap1.isMutable());
    if (paramBitmap1.getWidth() == paramBitmap2.getWidth()) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    if (paramBitmap1.getHeight() == paramBitmap2.getHeight()) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    nativeCopyBitmap(paramBitmap1, paramBitmap1.getRowBytes(), paramBitmap2, paramBitmap2.getRowBytes(), paramBitmap1.getHeight());
  }
  
  @d
  private static native void nativeCopyBitmap(Bitmap paramBitmap1, int paramInt1, Bitmap paramBitmap2, int paramInt2, int paramInt3);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/nativecode/Bitmaps.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */