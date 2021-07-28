package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import e.e.e.d.d;
import e.e.e.d.i;

@d
public class NativeBlurFilter {
  static {
    b.a();
  }
  
  public static void a(Bitmap paramBitmap, int paramInt1, int paramInt2) {
    boolean bool1;
    i.a(paramBitmap);
    boolean bool2 = true;
    if (paramInt1 > 0) {
      bool1 = true;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    if (paramInt2 > 0) {
      bool1 = bool2;
    } else {
      bool1 = false;
    } 
    i.a(bool1);
    nativeIterativeBoxBlur(paramBitmap, paramInt1, paramInt2);
  }
  
  @d
  private static native void nativeIterativeBoxBlur(Bitmap paramBitmap, int paramInt1, int paramInt2);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/nativecode/NativeBlurFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */