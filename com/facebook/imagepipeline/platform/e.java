package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.ColorSpace;
import com.facebook.imagepipeline.memory.d;
import com.facebook.imageutils.a;

@TargetApi(26)
public class e extends b {
  public e(d paramd, int paramInt, androidx.core.util.e parame) {
    super(paramd, paramInt, parame);
  }
  
  private static boolean a(BitmapFactory.Options paramOptions) {
    ColorSpace colorSpace = paramOptions.outColorSpace;
    return (colorSpace != null && colorSpace.isWideGamut() && paramOptions.inPreferredConfig != Bitmap.Config.RGBA_F16);
  }
  
  public int a(int paramInt1, int paramInt2, BitmapFactory.Options paramOptions) {
    return a(paramOptions) ? (paramInt1 * paramInt2 * 8) : a.a(paramInt1, paramInt2, paramOptions.inPreferredConfig);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/platform/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */