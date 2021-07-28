package com.facebook.imagepipeline.platform;

import android.annotation.TargetApi;
import android.graphics.BitmapFactory;
import androidx.core.util.e;
import com.facebook.imagepipeline.memory.d;

@TargetApi(21)
public class a extends b {
  public a(d paramd, int paramInt, e parame) {
    super(paramd, paramInt, parame);
  }
  
  public int a(int paramInt1, int paramInt2, BitmapFactory.Options paramOptions) {
    return com.facebook.imageutils.a.a(paramInt1, paramInt2, paramOptions.inPreferredConfig);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/platform/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */