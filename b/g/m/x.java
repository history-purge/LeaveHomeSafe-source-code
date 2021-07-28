package b.g.m;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import b.g.c;

public final class x {
  public static boolean a(ViewGroup paramViewGroup) {
    if (Build.VERSION.SDK_INT >= 21)
      return paramViewGroup.isTransitionGroup(); 
    Boolean bool = (Boolean)paramViewGroup.getTag(c.tag_transition_group);
    return ((bool != null && bool.booleanValue()) || paramViewGroup.getBackground() != null || v.x((View)paramViewGroup) != null);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/g/m/x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */