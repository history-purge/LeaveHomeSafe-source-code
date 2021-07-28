package com.facebook.imagepipeline.platform;

import android.os.Build;
import androidx.core.util.e;
import com.facebook.imagepipeline.memory.f0;

public class g {
  public static f a(f0 paramf0, boolean paramBoolean) {
    int i = Build.VERSION.SDK_INT;
    if (i >= 26) {
      i = paramf0.d();
      return new e(paramf0.a(), i, new e(i));
    } 
    if (i >= 21) {
      i = paramf0.d();
      return new a(paramf0.a(), i, new e(i));
    } 
    return (f)((paramBoolean && i < 19) ? new c() : new d(paramf0.c()));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/imagepipeline/platform/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */