package b.e.a.b;

import android.view.View;

public class a {
  public static String a(View paramView) {
    try {
      return paramView.getContext().getResources().getResourceEntryName(paramView.getId());
    } catch (Exception exception) {
      return "UNKNOWN";
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/b/e/a/b/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */