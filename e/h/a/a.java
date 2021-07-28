package e.h.a;

import android.os.Handler;
import android.view.MotionEvent;

public class a extends b<a> {
  private long B = 800L;
  
  private long C = 160L;
  
  private int D = 1;
  
  private int E = 1;
  
  private float F;
  
  private float G;
  
  private Handler H;
  
  private int I;
  
  private final Runnable J = new a(this);
  
  private void d(MotionEvent paramMotionEvent) {
    if (!f(paramMotionEvent))
      e(); 
  }
  
  private void e(MotionEvent paramMotionEvent) {
    this.F = paramMotionEvent.getRawX();
    this.G = paramMotionEvent.getRawY();
    b();
    this.I = 1;
    Handler handler = this.H;
    if (handler == null) {
      this.H = new Handler();
    } else {
      handler.removeCallbacksAndMessages(null);
    } 
    this.H.postDelayed(this.J, this.B);
  }
  
  private boolean f(MotionEvent paramMotionEvent) {
    if (this.I == this.E && (((this.D & 0x1) != 0 && paramMotionEvent.getRawX() - this.F > (float)this.C) || ((this.D & 0x2) != 0 && this.F - paramMotionEvent.getRawX() > (float)this.C) || ((this.D & 0x4) != 0 && this.G - paramMotionEvent.getRawY() > (float)this.C) || ((this.D & 0x8) != 0 && paramMotionEvent.getRawY() - this.G > (float)this.C))) {
      this.H.removeCallbacksAndMessages(null);
      a();
      d();
      return true;
    } 
    return false;
  }
  
  protected void c(MotionEvent paramMotionEvent) {
    int i = l();
    if (i == 0)
      e(paramMotionEvent); 
    if (i == 2) {
      f(paramMotionEvent);
      if (paramMotionEvent.getPointerCount() > this.I)
        this.I = paramMotionEvent.getPointerCount(); 
      if (paramMotionEvent.getActionMasked() == 1)
        d(paramMotionEvent); 
    } 
  }
  
  public void d(int paramInt) {
    this.D = paramInt;
  }
  
  public void e(int paramInt) {
    this.E = paramInt;
  }
  
  protected void q() {
    Handler handler = this.H;
    if (handler != null)
      handler.removeCallbacksAndMessages(null); 
  }
  
  protected void r() {
    Handler handler = this.H;
    if (handler != null)
      handler.removeCallbacksAndMessages(null); 
  }
  
  class a implements Runnable {
    a(a this$0) {}
    
    public void run() {
      this.c.e();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/h/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */