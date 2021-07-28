package com.facebook.react.uimanager;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewParent;

public class u {
  private static final Rect a = new Rect();
  
  public static void a(View paramView, Rect paramRect) {
    ViewParent viewParent = paramView.getParent();
    if (viewParent == null) {
      paramRect.setEmpty();
      return;
    } 
    if (viewParent instanceof t) {
      t t = (t)viewParent;
      if (t.getRemoveClippedSubviews()) {
        t.a(a);
        if (!a.intersect(paramView.getLeft(), paramView.getTop(), paramView.getRight(), paramView.getBottom())) {
          paramRect.setEmpty();
          return;
        } 
        a.offset(-paramView.getLeft(), -paramView.getTop());
        a.offset(paramView.getScrollX(), paramView.getScrollY());
        paramRect.set(a);
        return;
      } 
    } 
    paramView.getDrawingRect(paramRect);
  }
  
  public static boolean a(View paramView1, Rect paramRect, Point paramPoint, View paramView2, String paramString) {
    RectF rectF = new RectF();
    rectF.set(paramRect);
    paramView1.getMatrix().mapRect(rectF);
    int i = paramView1.getLeft() - paramView2.getScrollX();
    int j = paramView1.getTop() - paramView2.getScrollY();
    rectF.offset(i, j);
    boolean bool1 = true;
    if (paramPoint != null) {
      float[] arrayOfFloat = new float[2];
      arrayOfFloat[0] = paramPoint.x;
      arrayOfFloat[1] = paramPoint.y;
      paramView1.getMatrix().mapPoints(arrayOfFloat);
      paramPoint.x = Math.round(arrayOfFloat[0]) + i;
      paramPoint.y = Math.round(arrayOfFloat[1]) + j;
    } 
    i = paramView2.getRight();
    j = paramView2.getLeft();
    int k = paramView2.getBottom();
    int m = paramView2.getTop();
    ViewParent viewParent = paramView2.getParent();
    if (viewParent == null || "hidden".equals(paramString))
      bool1 = rectF.intersect(0.0F, 0.0F, (i - j), (k - m)); 
    paramRect.set((int)Math.floor(rectF.left), (int)Math.floor(rectF.top), (int)Math.ceil(rectF.right), (int)Math.ceil(rectF.bottom));
    boolean bool2 = bool1;
    if (bool1) {
      bool2 = bool1;
      if (viewParent != null)
        bool2 = viewParent.getChildVisibleRect(paramView2, paramRect, paramPoint); 
    } 
    return bool2;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */