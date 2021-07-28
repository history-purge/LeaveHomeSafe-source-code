package e.h.a;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;

public class g extends b<g> {
  private static float G = 10.0F;
  
  private long B = 500L;
  
  private float C;
  
  private float D;
  
  private float E;
  
  private Handler F;
  
  public g(Context paramContext) {
    b(true);
    this.C = G * (paramContext.getResources().getDisplayMetrics()).density;
  }
  
  public g a(float paramFloat) {
    this.C = paramFloat * paramFloat;
    return this;
  }
  
  public void a(long paramLong) {
    this.B = paramLong;
  }
  
  protected void b(int paramInt1, int paramInt2) {
    Handler handler = this.F;
    if (handler != null) {
      handler.removeCallbacksAndMessages(null);
      this.F = null;
    } 
  }
  
  protected void c(MotionEvent paramMotionEvent) {
    Handler handler;
    if (l() == 0) {
      b();
      this.D = paramMotionEvent.getRawX();
      this.E = paramMotionEvent.getRawY();
      this.F = new Handler();
      this.F.postDelayed(new a(this), this.B);
    } 
    if (paramMotionEvent.getActionMasked() == 1) {
      handler = this.F;
      if (handler != null) {
        handler.removeCallbacksAndMessages(null);
        this.F = null;
      } 
      if (l() == 4) {
        d();
        return;
      } 
    } else {
      float f1 = handler.getRawX() - this.D;
      float f2 = handler.getRawY() - this.E;
      if (f1 * f1 + f2 * f2 > this.C) {
        if (l() == 4) {
          c();
          return;
        } 
      } else {
        return;
      } 
    } 
    e();
  }
  
  class a implements Runnable {
    a(g this$0) {}
    
    public void run() {
      this.c.a();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/h/a/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */