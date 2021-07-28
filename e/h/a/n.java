package e.h.a;

import android.view.MotionEvent;

public class n extends b<n> {
  private m B;
  
  private double C;
  
  private double D;
  
  private m.a E = new a(this);
  
  public n() {
    b(false);
  }
  
  protected void c(MotionEvent paramMotionEvent) {
    int i = l();
    if (i == 0) {
      this.D = 0.0D;
      this.C = 0.0D;
      this.B = new m(this.E);
      b();
    } 
    m m1 = this.B;
    if (m1 != null)
      m1.a(paramMotionEvent); 
    if (paramMotionEvent.getActionMasked() == 1) {
      if (i == 4) {
        d();
        return;
      } 
      e();
    } 
  }
  
  protected void r() {
    this.B = null;
    this.D = 0.0D;
    this.C = 0.0D;
  }
  
  public float u() {
    m m1 = this.B;
    return (m1 == null) ? Float.NaN : m1.a();
  }
  
  public float v() {
    m m1 = this.B;
    return (m1 == null) ? Float.NaN : m1.b();
  }
  
  public double w() {
    return this.C;
  }
  
  public double x() {
    return this.D;
  }
  
  class a implements m.a {
    a(n this$0) {}
    
    public boolean a(m param1m) {
      double d = n.a(this.a);
      n.a(this.a, param1m.c());
      long l = param1m.d();
      if (l > 0L) {
        n n1 = this.a;
        double d1 = n.a(n1);
        double d2 = l;
        Double.isNaN(d2);
        n.b(n1, (d1 - d) / d2);
      } 
      if (Math.abs(n.a(this.a)) >= 0.08726646259971647D && this.a.l() == 2)
        this.a.a(); 
      return true;
    }
    
    public void b(m param1m) {
      this.a.d();
    }
    
    public boolean c(m param1m) {
      return true;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/h/a/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */