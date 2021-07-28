package b.r;

import android.view.ViewGroup;

public class u {
  private ViewGroup a;
  
  private Runnable b;
  
  public static u a(ViewGroup paramViewGroup) {
    return (u)paramViewGroup.getTag(s.transition_current_scene);
  }
  
  static void a(ViewGroup paramViewGroup, u paramu) {
    paramViewGroup.setTag(s.transition_current_scene, paramu);
  }
  
  public void a() {
    if (a(this.a) == this) {
      Runnable runnable = this.b;
      if (runnable != null)
        runnable.run(); 
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/r/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */