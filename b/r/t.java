package b.r;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

class t implements TypeEvaluator<Rect> {
  private Rect a;
  
  public Rect a(float paramFloat, Rect paramRect1, Rect paramRect2) {
    int i = paramRect1.left;
    i += (int)((paramRect2.left - i) * paramFloat);
    int j = paramRect1.top;
    j += (int)((paramRect2.top - j) * paramFloat);
    int k = paramRect1.right;
    k += (int)((paramRect2.right - k) * paramFloat);
    int m = paramRect1.bottom;
    m += (int)((paramRect2.bottom - m) * paramFloat);
    paramRect1 = this.a;
    if (paramRect1 == null)
      return new Rect(i, j, k, m); 
    paramRect1.set(i, j, k, m);
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */