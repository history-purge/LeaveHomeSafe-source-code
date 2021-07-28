package b.r;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

class m0 implements n0 {
  private final ViewOverlay a;
  
  m0(View paramView) {
    this.a = paramView.getOverlay();
  }
  
  public void a(Drawable paramDrawable) {
    this.a.add(paramDrawable);
  }
  
  public void b(Drawable paramDrawable) {
    this.a.remove(paramDrawable);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */