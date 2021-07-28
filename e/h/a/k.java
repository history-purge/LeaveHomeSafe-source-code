package e.h.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.ViewConfiguration;

public class k extends b<k> {
  private ScaleGestureDetector B;
  
  private double C;
  
  private double D;
  
  private float E;
  
  private float F;
  
  private ScaleGestureDetector.OnScaleGestureListener G = new a(this);
  
  public k() {
    b(false);
  }
  
  protected void c(MotionEvent paramMotionEvent) {
    if (l() == 0) {
      Context context = n().getContext();
      this.D = 0.0D;
      this.C = 1.0D;
      this.B = new ScaleGestureDetector(context, this.G);
      this.F = ViewConfiguration.get(context).getScaledTouchSlop();
      b();
    } 
    ScaleGestureDetector scaleGestureDetector = this.B;
    if (scaleGestureDetector != null)
      scaleGestureDetector.onTouchEvent(paramMotionEvent); 
    int j = paramMotionEvent.getPointerCount();
    int i = j;
    if (paramMotionEvent.getActionMasked() == 6)
      i = j - 1; 
    if (l() == 4 && i < 2) {
      d();
      return;
    } 
    if (paramMotionEvent.getActionMasked() == 1)
      e(); 
  }
  
  protected void r() {
    this.B = null;
    this.D = 0.0D;
    this.C = 1.0D;
  }
  
  public float u() {
    ScaleGestureDetector scaleGestureDetector = this.B;
    return (scaleGestureDetector == null) ? Float.NaN : scaleGestureDetector.getFocusX();
  }
  
  public float v() {
    ScaleGestureDetector scaleGestureDetector = this.B;
    return (scaleGestureDetector == null) ? Float.NaN : scaleGestureDetector.getFocusY();
  }
  
  public double w() {
    return this.C;
  }
  
  public double x() {
    return this.D;
  }
  
  class a implements ScaleGestureDetector.OnScaleGestureListener {
    a(k this$0) {}
    
    public boolean onScale(ScaleGestureDetector param1ScaleGestureDetector) {
      double d = k.a(this.a);
      k.a(this.a, param1ScaleGestureDetector.getScaleFactor());
      long l = param1ScaleGestureDetector.getTimeDelta();
      if (l > 0L) {
        k k1 = this.a;
        double d1 = k.a(k1);
        double d2 = l;
        Double.isNaN(d2);
        k.b(k1, (d1 - d) / d2);
      } 
      if (Math.abs(k.b(this.a) - param1ScaleGestureDetector.getCurrentSpan()) >= k.c(this.a) && this.a.l() == 2)
        this.a.a(); 
      return true;
    }
    
    public boolean onScaleBegin(ScaleGestureDetector param1ScaleGestureDetector) {
      k.a(this.a, param1ScaleGestureDetector.getCurrentSpan());
      return true;
    }
    
    public void onScaleEnd(ScaleGestureDetector param1ScaleGestureDetector) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/h/a/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */