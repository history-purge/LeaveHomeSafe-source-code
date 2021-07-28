package e.h.a;

import android.os.Handler;
import android.view.MotionEvent;

public class o extends b<o> {
  private static float S = 1.4E-45F;
  
  private float B;
  
  private float C;
  
  private float D;
  
  private long E;
  
  private long F;
  
  private int G;
  
  private int H;
  
  private int I;
  
  private float J;
  
  private float K;
  
  private float L;
  
  private float M;
  
  private float N;
  
  private float O;
  
  private Handler P;
  
  private int Q;
  
  private final Runnable R;
  
  public o() {
    float f = S;
    this.B = f;
    this.C = f;
    this.D = f;
    this.E = 500L;
    this.F = 500L;
    this.G = 1;
    this.H = 1;
    this.I = 1;
    this.R = new a(this);
    b(true);
  }
  
  private void u() {
    Handler handler = this.P;
    if (handler == null) {
      this.P = new Handler();
    } else {
      handler.removeCallbacksAndMessages(null);
    } 
    int i = this.Q + 1;
    this.Q = i;
    if (i == this.G && this.I >= this.H) {
      a();
      d();
      return;
    } 
    this.P.postDelayed(this.R, this.F);
  }
  
  private boolean v() {
    float f1 = this.N - this.J + this.L;
    if (this.B != S && Math.abs(f1) > this.B)
      return true; 
    float f2 = this.O - this.K + this.M;
    if (this.C != S && Math.abs(f2) > this.C)
      return true; 
    float f3 = this.D;
    return (f3 != S && f2 * f2 + f1 * f1 > f3);
  }
  
  private void w() {
    Handler handler = this.P;
    if (handler == null) {
      this.P = new Handler();
    } else {
      handler.removeCallbacksAndMessages(null);
    } 
    this.P.postDelayed(this.R, this.E);
  }
  
  public o a(float paramFloat) {
    this.D = paramFloat * paramFloat;
    return this;
  }
  
  public o a(long paramLong) {
    this.F = paramLong;
    return this;
  }
  
  public o b(float paramFloat) {
    this.B = paramFloat;
    return this;
  }
  
  public o b(long paramLong) {
    this.E = paramLong;
    return this;
  }
  
  public o c(float paramFloat) {
    this.C = paramFloat;
    return this;
  }
  
  protected void c(MotionEvent paramMotionEvent) {
    int i = l();
    int j = paramMotionEvent.getActionMasked();
    if (i == 0) {
      this.L = 0.0F;
      this.M = 0.0F;
      this.J = paramMotionEvent.getRawX();
      this.K = paramMotionEvent.getRawY();
    } 
    if (j == 6 || j == 5) {
      this.L += this.N - this.J;
      this.M += this.O - this.K;
      this.N = f.a(paramMotionEvent, true);
      this.O = f.b(paramMotionEvent, true);
      this.J = this.N;
      this.K = this.O;
    } else {
      this.N = f.a(paramMotionEvent, true);
      this.O = f.b(paramMotionEvent, true);
    } 
    if (this.I < paramMotionEvent.getPointerCount())
      this.I = paramMotionEvent.getPointerCount(); 
    if (v()) {
      e();
      return;
    } 
    if (i == 0) {
      if (j == 0)
        b(); 
    } else {
      if (i == 2) {
        if (j == 1) {
          u();
          return;
        } 
        if (j == 0) {
          w();
          return;
        } 
      } 
      return;
    } 
    w();
  }
  
  public o d(int paramInt) {
    this.H = paramInt;
    return this;
  }
  
  public o e(int paramInt) {
    this.G = paramInt;
    return this;
  }
  
  protected void q() {
    Handler handler = this.P;
    if (handler != null)
      handler.removeCallbacksAndMessages(null); 
  }
  
  protected void r() {
    this.Q = 0;
    this.I = 0;
    Handler handler = this.P;
    if (handler != null)
      handler.removeCallbacksAndMessages(null); 
  }
  
  class a implements Runnable {
    a(o this$0) {}
    
    public void run() {
      this.c.e();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/h/a/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */