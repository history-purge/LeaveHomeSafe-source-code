package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import com.facebook.soloader.d;

@d
class PreverificationHelper {
  @TargetApi(26)
  @d
  boolean shouldUseHardwareBitmapConfig(Bitmap.Config paramConfig) {
    return (paramConfig == Bitmap.Config.HARDWARE);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/platform/PreverificationHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */