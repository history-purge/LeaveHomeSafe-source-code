package e.e.j.i;

import android.view.View;
import android.view.ViewGroup;

public class a {
  public static void a(a parama, float paramFloat, ViewGroup.LayoutParams paramLayoutParams, int paramInt1, int paramInt2) {
    if (paramFloat > 0.0F) {
      if (paramLayoutParams == null)
        return; 
      if (a(paramLayoutParams.height)) {
        parama.b = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int)((View.MeasureSpec.getSize(parama.a) - paramInt1) / paramFloat + paramInt2), parama.b), 1073741824);
        return;
      } 
      if (a(paramLayoutParams.width))
        parama.a = View.MeasureSpec.makeMeasureSpec(View.resolveSize((int)((View.MeasureSpec.getSize(parama.b) - paramInt2) * paramFloat + paramInt1), parama.a), 1073741824); 
    } 
  }
  
  private static boolean a(int paramInt) {
    return (paramInt == 0 || paramInt == -2);
  }
  
  public static class a {
    public int a;
    
    public int b;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/e/j/i/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */