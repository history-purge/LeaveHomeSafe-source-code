package e.f.a.f.a0;

import android.graphics.RectF;
import java.util.Arrays;

public final class i implements c {
  private final float a;
  
  public i(float paramFloat) {
    this.a = paramFloat;
  }
  
  public float a(RectF paramRectF) {
    return this.a * paramRectF.height();
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof i))
      return false; 
    paramObject = paramObject;
    return (this.a == ((i)paramObject).a);
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { Float.valueOf(this.a) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/a0/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */