package b.r;

import android.view.View;
import android.view.WindowId;

class y0 implements z0 {
  private final WindowId a;
  
  y0(View paramView) {
    this.a = paramView.getWindowId();
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject instanceof y0 && ((y0)paramObject).a.equals(this.a));
  }
  
  public int hashCode() {
    return this.a.hashCode();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/y0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */