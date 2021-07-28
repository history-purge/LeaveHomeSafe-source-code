package b.r;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

class q<T> extends Property<T, Float> {
  private final Property<T, PointF> a;
  
  private final PathMeasure b;
  
  private final float c;
  
  private final float[] d = new float[2];
  
  private final PointF e = new PointF();
  
  private float f;
  
  q(Property<T, PointF> paramProperty, Path paramPath) {
    super(Float.class, paramProperty.getName());
    this.a = paramProperty;
    this.b = new PathMeasure(paramPath, false);
    this.c = this.b.getLength();
  }
  
  public void a(T paramT, Float paramFloat) {
    this.f = paramFloat.floatValue();
    this.b.getPosTan(this.c * paramFloat.floatValue(), this.d, null);
    PointF pointF = this.e;
    float[] arrayOfFloat = this.d;
    pointF.x = arrayOfFloat[0];
    pointF.y = arrayOfFloat[1];
    this.a.set(paramT, pointF);
  }
  
  public Float get(T paramT) {
    return Float.valueOf(this.f);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */