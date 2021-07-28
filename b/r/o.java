package b.r;

import android.animation.ObjectAnimator;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

class o {
  static <T> ObjectAnimator a(T paramT, Property<T, PointF> paramProperty, Path paramPath) {
    return (Build.VERSION.SDK_INT >= 21) ? ObjectAnimator.ofObject(paramT, paramProperty, null, paramPath) : ObjectAnimator.ofFloat(paramT, new q<T>(paramProperty, paramPath), new float[] { 0.0F, 1.0F });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */