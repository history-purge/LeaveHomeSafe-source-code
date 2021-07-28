package e.f.a.f.a0;

import android.graphics.RectF;
import java.util.Arrays;

public final class b implements c {
  private final c a;
  
  private final float b;
  
  public b(float paramFloat, c paramc) {
    while (paramc instanceof b) {
      paramc = ((b)paramc).a;
      paramFloat += ((b)paramc).b;
    } 
    this.a = paramc;
    this.b = paramFloat;
  }
  
  public float a(RectF paramRectF) {
    return Math.max(0.0F, this.a.a(paramRectF) + this.b);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (!(paramObject instanceof b))
      return false; 
    paramObject = paramObject;
    return (this.a.equals(((b)paramObject).a) && this.b == ((b)paramObject).b);
  }
  
  public int hashCode() {
    return Arrays.hashCode(new Object[] { this.a, Float.valueOf(this.b) });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/a0/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */