package e.f.a.f.l;

import android.animation.TimeInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import b.m.a.a.b;
import b.m.a.a.c;

public class a {
  public static final TimeInterpolator a = (TimeInterpolator)new LinearInterpolator();
  
  public static final TimeInterpolator b = (TimeInterpolator)new b();
  
  public static final TimeInterpolator c = (TimeInterpolator)new b.m.a.a.a();
  
  public static final TimeInterpolator d = (TimeInterpolator)new c();
  
  public static final TimeInterpolator e = (TimeInterpolator)new DecelerateInterpolator();
  
  public static float a(float paramFloat1, float paramFloat2, float paramFloat3) {
    return paramFloat1 + paramFloat3 * (paramFloat2 - paramFloat1);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/l/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */