package e.f.a.f.a0;

import android.graphics.drawable.Drawable;
import android.view.View;

public class h {
  static d a() {
    return new j();
  }
  
  static d a(int paramInt) {
    return (paramInt != 0) ? ((paramInt != 1) ? a() : new e()) : new j();
  }
  
  public static void a(View paramView) {
    Drawable drawable = paramView.getBackground();
    if (drawable instanceof g)
      a(paramView, (g)drawable); 
  }
  
  public static void a(View paramView, float paramFloat) {
    Drawable drawable = paramView.getBackground();
    if (drawable instanceof g)
      ((g)drawable).a(paramFloat); 
  }
  
  public static void a(View paramView, g paramg) {
    if (paramg.q())
      paramg.c(com.google.android.material.internal.h.a(paramView)); 
  }
  
  static f b() {
    return new f();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/a0/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */