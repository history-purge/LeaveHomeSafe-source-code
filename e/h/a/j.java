package e.h.a;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;

public class j extends b<j> {
  private static float Z = 3.4028235E38F;
  
  private static float a0 = 1.4E-45F;
  
  private static int b0 = 1;
  
  private static int c0 = 10;
  
  private float B;
  
  private float C;
  
  private float D;
  
  private float E;
  
  private float F;
  
  private float G;
  
  private float H;
  
  private float I;
  
  private float J;
  
  private float K;
  
  private float L;
  
  private float M;
  
  private int N;
  
  private int O;
  
  private float P;
  
  private float Q;
  
  private float R;
  
  private float S;
  
  private float T;
  
  private float U;
  
  private float V;
  
  private float W;
  
  private VelocityTracker X;
  
  private boolean Y;
  
  public j(Context paramContext) {
    float f1 = a0;
    this.B = f1;
    float f2 = Z;
    this.C = f2;
    this.D = f1;
    this.E = f1;
    this.F = f2;
    this.G = f2;
    this.H = f1;
    this.I = f1;
    this.J = f2;
    this.K = f2;
    this.L = f2;
    this.M = f2;
    this.N = b0;
    this.O = c0;
    int i = ViewConfiguration.get(paramContext).getScaledTouchSlop();
    this.B = (i * i);
  }
  
  private static void a(VelocityTracker paramVelocityTracker, MotionEvent paramMotionEvent) {
    float f1 = paramMotionEvent.getRawX() - paramMotionEvent.getX();
    float f2 = paramMotionEvent.getRawY() - paramMotionEvent.getY();
    paramMotionEvent.offsetLocation(f1, f2);
    paramVelocityTracker.addMovement(paramMotionEvent);
    paramMotionEvent.offsetLocation(-f1, -f2);
  }
  
  private boolean y() {
    float f1 = this.T - this.P + this.R;
    float f2 = this.C;
    if (f2 != Z && f1 < f2)
      return true; 
    f2 = this.D;
    if (f2 != a0 && f1 > f2)
      return true; 
    f2 = this.U - this.Q + this.S;
    float f3 = this.G;
    if (f3 != Z && f2 < f3)
      return true; 
    f3 = this.H;
    if (f3 != a0 && f2 > f3)
      return true; 
    f3 = this.B;
    if (f3 != Z && f1 * f1 + f2 * f2 >= f3)
      return true; 
    f1 = this.V;
    f2 = this.K;
    if (f2 != Z)
      if (f2 >= 0.0F || f1 > f2) {
        f2 = this.K;
        if (f2 >= 0.0F && f1 >= f2)
          return true; 
      } else {
        return true;
      }  
    f2 = this.W;
    f3 = this.L;
    if (f3 != Z)
      if (f3 >= 0.0F || f1 > f3) {
        f3 = this.L;
        if (f3 >= 0.0F && f1 >= f3)
          return true; 
      } else {
        return true;
      }  
    f3 = this.M;
    return (f3 != Z && f1 * f1 + f2 * f2 >= f3);
  }
  
  private boolean z() {
    float f1 = this.T - this.P + this.R;
    float f2 = this.E;
    if (f2 != a0 && f1 < f2)
      return true; 
    f2 = this.F;
    if (f2 != Z && f1 > f2)
      return true; 
    f1 = this.U - this.Q + this.S;
    f2 = this.I;
    if (f2 != a0 && f1 < f2)
      return true; 
    f2 = this.J;
    return (f2 != Z && f1 > f2);
  }
  
  public j a(float paramFloat) {
    this.D = paramFloat;
    return this;
  }
  
  public j b(float paramFloat) {
    this.C = paramFloat;
    return this;
  }
  
  public j c(float paramFloat) {
    this.H = paramFloat;
    return this;
  }
  
  public j c(boolean paramBoolean) {
    this.Y = paramBoolean;
    return this;
  }
  
  protected void c(MotionEvent paramMotionEvent) {
    int i = l();
    int k = paramMotionEvent.getActionMasked();
    if (k == 6 || k == 5) {
      this.R += this.T - this.P;
      this.S += this.U - this.Q;
      this.T = f.a(paramMotionEvent, this.Y);
      this.U = f.b(paramMotionEvent, this.Y);
      this.P = this.T;
      this.Q = this.U;
    } else {
      this.T = f.a(paramMotionEvent, this.Y);
      this.U = f.b(paramMotionEvent, this.Y);
    } 
    if (i == 0 && paramMotionEvent.getPointerCount() >= this.N) {
      this.P = this.T;
      this.Q = this.U;
      this.R = 0.0F;
      this.S = 0.0F;
      this.X = VelocityTracker.obtain();
      a(this.X, paramMotionEvent);
      b();
    } else {
      VelocityTracker velocityTracker = this.X;
      if (velocityTracker != null) {
        a(velocityTracker, paramMotionEvent);
        this.X.computeCurrentVelocity(1000);
        this.V = this.X.getXVelocity();
        this.W = this.X.getYVelocity();
      } 
    } 
    if (k == 1) {
      if (i == 4 || i == 2) {
        d();
        return;
      } 
    } else if (k == 5 && paramMotionEvent.getPointerCount() > this.O) {
      if (i == 4) {
        c();
        return;
      } 
    } else if (k != 6 || i != 4 || paramMotionEvent.getPointerCount() >= this.N) {
      if (i == 2) {
        if (z()) {
          e();
          return;
        } 
        if (y()) {
          this.P = this.T;
          this.Q = this.U;
          a();
        } 
      } 
      return;
    } 
    e();
  }
  
  public j d(float paramFloat) {
    this.G = paramFloat;
    return this;
  }
  
  public j d(int paramInt) {
    this.O = paramInt;
    return this;
  }
  
  public j e(float paramFloat) {
    this.F = paramFloat;
    return this;
  }
  
  public j e(int paramInt) {
    this.N = paramInt;
    return this;
  }
  
  public j f(float paramFloat) {
    this.E = paramFloat;
    return this;
  }
  
  public j g(float paramFloat) {
    this.J = paramFloat;
    return this;
  }
  
  public j h(float paramFloat) {
    this.I = paramFloat;
    return this;
  }
  
  public j i(float paramFloat) {
    this.B = paramFloat * paramFloat;
    return this;
  }
  
  public j j(float paramFloat) {
    this.M = paramFloat * paramFloat;
    return this;
  }
  
  public j k(float paramFloat) {
    this.K = paramFloat;
    return this;
  }
  
  public j l(float paramFloat) {
    this.L = paramFloat;
    return this;
  }
  
  protected void r() {
    VelocityTracker velocityTracker = this.X;
    if (velocityTracker != null) {
      velocityTracker.recycle();
      this.X = null;
    } 
  }
  
  public float u() {
    return this.T - this.P + this.R;
  }
  
  public float v() {
    return this.U - this.Q + this.S;
  }
  
  public float w() {
    return this.V;
  }
  
  public float x() {
    return this.W;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/h/a/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */