package com.facebook.react.views.modal;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Point;
import android.view.Display;
import android.view.WindowManager;

class a {
  private static final Point a = new Point();
  
  private static final Point b = new Point();
  
  private static final Point c = new Point();
  
  public static Point a(Context paramContext) {
    WindowManager windowManager = (WindowManager)paramContext.getSystemService("window");
    e.e.m.a.a.a(windowManager);
    Display display = windowManager.getDefaultDisplay();
    display.getCurrentSizeRange(a, b);
    display.getSize(c);
    byte b = 0;
    boolean bool = paramContext.getTheme().obtainStyledAttributes(new int[] { 16843277 }).getBoolean(0, false);
    Resources resources = paramContext.getResources();
    int j = resources.getIdentifier("status_bar_height", "dimen", "android");
    int i = b;
    if (bool) {
      i = b;
      if (j > 0)
        i = (int)resources.getDimension(j); 
    } 
    Point point = c;
    return (point.x < point.y) ? new Point(a.x, b.y + i) : new Point(b.x, a.y + i);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/modal/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */