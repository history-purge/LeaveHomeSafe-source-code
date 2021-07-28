package com.th3rdwave.safeareacontext;

import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;

class f {
  private static a a(View paramView) {
    WindowInsets windowInsets;
    if (Build.VERSION.SDK_INT >= 23) {
      windowInsets = paramView.getRootWindowInsets();
      return (windowInsets == null) ? null : new a(windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getStableInsetBottom(), windowInsets.getSystemWindowInsetLeft());
    } 
    Rect rect = new Rect();
    windowInsets.getWindowVisibleDisplayFrame(rect);
    return new a(rect.top, (windowInsets.getWidth() - rect.right), (windowInsets.getHeight() - rect.bottom), rect.left);
  }
  
  static c a(ViewGroup paramViewGroup, View paramView) {
    if (paramView.getParent() == null)
      return null; 
    Rect rect = new Rect();
    paramView.getDrawingRect(rect);
    try {
      paramViewGroup.offsetDescendantRectToMyCoords(paramView, rect);
      return new c(rect.left, rect.top, paramView.getWidth(), paramView.getHeight());
    } catch (IllegalArgumentException illegalArgumentException) {
      illegalArgumentException.printStackTrace();
      return null;
    } 
  }
  
  static a b(View paramView) {
    if (paramView.getHeight() == 0)
      return null; 
    View view = paramView.getRootView();
    a a = a(view);
    if (a == null)
      return null; 
    float f1 = view.getWidth();
    float f2 = view.getHeight();
    Rect rect = new Rect();
    paramView.getGlobalVisibleRect(rect);
    a.a = Math.max(a.a - rect.top, 0.0F);
    a.d = Math.max(a.d - rect.left, 0.0F);
    a.c = Math.max((rect.top + paramView.getHeight()) + a.c - f2, 0.0F);
    a.b = Math.max((rect.left + paramView.getWidth()) + a.b - f1, 0.0F);
    return a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/th3rdwave/safeareacontext/f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */