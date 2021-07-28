package e.f.a.f.r;

import android.app.Dialog;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;

public class a implements View.OnTouchListener {
  private final Dialog c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  public a(Dialog paramDialog, Rect paramRect) {
    this.c = paramDialog;
    this.d = paramRect.left;
    this.e = paramRect.top;
    this.f = ViewConfiguration.get(paramDialog.getContext()).getScaledWindowTouchSlop();
  }
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent) {
    View view = paramView.findViewById(16908290);
    int i = this.d + view.getLeft();
    int j = view.getWidth();
    int k = this.e + view.getTop();
    int m = view.getHeight();
    if ((new RectF(i, k, (j + i), (m + k))).contains(paramMotionEvent.getX(), paramMotionEvent.getY()))
      return false; 
    paramMotionEvent = MotionEvent.obtain(paramMotionEvent);
    paramMotionEvent.setAction(4);
    if (Build.VERSION.SDK_INT < 28) {
      paramMotionEvent.setAction(0);
      i = this.f;
      paramMotionEvent.setLocation((-i - 1), (-i - 1));
    } 
    paramView.performClick();
    return this.c.onTouchEvent(paramMotionEvent);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/e/f/a/f/r/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */