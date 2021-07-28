package b.r;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroupOverlay;

class h0 implements i0 {
  private final ViewGroupOverlay a;
  
  h0(ViewGroup paramViewGroup) {
    this.a = paramViewGroup.getOverlay();
  }
  
  public void a(Drawable paramDrawable) {
    this.a.add(paramDrawable);
  }
  
  public void a(View paramView) {
    this.a.add(paramView);
  }
  
  public void b(Drawable paramDrawable) {
    this.a.remove(paramDrawable);
  }
  
  public void b(View paramView) {
    this.a.remove(paramView);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/h0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */