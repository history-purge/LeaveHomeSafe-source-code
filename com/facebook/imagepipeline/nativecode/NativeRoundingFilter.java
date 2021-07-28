package com.facebook.imagepipeline.nativecode;

import android.graphics.Bitmap;
import e.e.e.d.d;

@d
public class NativeRoundingFilter {
  static {
    b.a();
  }
  
  @d
  private static native void nativeToCircleFilter(Bitmap paramBitmap, boolean paramBoolean);
  
  @d
  private static native void nativeToCircleWithBorderFilter(Bitmap paramBitmap, int paramInt1, int paramInt2, boolean paramBoolean);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/nativecode/NativeRoundingFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */