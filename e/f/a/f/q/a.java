package e.f.a.f.q;

import android.content.Context;
import android.graphics.Color;
import android.util.TypedValue;
import android.view.View;
import e.f.a.f.x.b;

public class a {
  public static int a(int paramInt1, int paramInt2) {
    return b.g.f.a.b(paramInt2, paramInt1);
  }
  
  public static int a(int paramInt1, int paramInt2, float paramFloat) {
    return a(paramInt1, b.g.f.a.c(paramInt2, Math.round(Color.alpha(paramInt2) * paramFloat)));
  }
  
  public static int a(Context paramContext, int paramInt1, int paramInt2) {
    TypedValue typedValue = b.a(paramContext, paramInt1);
    return (typedValue != null) ? typedValue.data : paramInt2;
  }
  
  public static int a(Context paramContext, int paramInt, String paramString) {
    return b.a(paramContext, paramInt, paramString);
  }
  
  public static int a(View paramView, int paramInt) {
    return b.a(paramView, paramInt);
  }
  
  public static int a(View paramView, int paramInt1, int paramInt2) {
    return a(paramView.getContext(), paramInt1, paramInt2);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/q/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */