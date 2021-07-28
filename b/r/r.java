package b.r;

import android.animation.PropertyValuesHolder;
import android.graphics.Path;
import android.graphics.PointF;
import android.os.Build;
import android.util.Property;

class r {
  static PropertyValuesHolder a(Property<?, PointF> paramProperty, Path paramPath) {
    return (Build.VERSION.SDK_INT >= 21) ? PropertyValuesHolder.ofObject(paramProperty, null, paramPath) : PropertyValuesHolder.ofFloat(new q(paramProperty, paramPath), new float[] { 0.0F, 1.0F });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */