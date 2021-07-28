package com.facebook.react.uimanager;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.UiThreadUtil;
import e.e.o.g0.c;

public class l0 {
  private static final float[] a = new float[2];
  
  private static final PointF b = new PointF();
  
  private static final float[] c = new float[2];
  
  private static final Matrix d = new Matrix();
  
  public static int a(float paramFloat1, float paramFloat2, ViewGroup paramViewGroup) {
    return a(paramFloat1, paramFloat2, paramViewGroup, a, (int[])null);
  }
  
  public static int a(float paramFloat1, float paramFloat2, ViewGroup paramViewGroup, float[] paramArrayOffloat, int[] paramArrayOfint) {
    UiThreadUtil.assertOnUiThread();
    int j = paramViewGroup.getId();
    paramArrayOffloat[0] = paramFloat1;
    paramArrayOffloat[1] = paramFloat2;
    View view = a(paramArrayOffloat, paramViewGroup);
    int i = j;
    if (view != null) {
      view = a(view);
      i = j;
      if (view != null) {
        if (paramArrayOfint != null)
          paramArrayOfint[0] = view.getId(); 
        i = a(view, paramArrayOffloat[0], paramArrayOffloat[1]);
      } 
    } 
    return i;
  }
  
  private static int a(View paramView, float paramFloat1, float paramFloat2) {
    return (paramView instanceof v) ? ((v)paramView).a(paramFloat1, paramFloat2) : paramView.getId();
  }
  
  private static View a(View paramView) {
    while (paramView != null && paramView.getId() <= 0)
      paramView = (View)paramView.getParent(); 
    return paramView;
  }
  
  private static View a(float[] paramArrayOffloat, View paramView) {
    View view;
    r r2;
    if (paramView instanceof x) {
      r2 = ((x)paramView).getPointerEvents();
    } else {
      r2 = r.f;
    } 
    r r1 = r2;
    if (!paramView.isEnabled())
      if (r2 == r.f) {
        r1 = r.d;
      } else {
        r1 = r2;
        if (r2 == r.e)
          r1 = r.c; 
      }  
    if (r1 == r.c)
      return null; 
    if (r1 == r.e)
      return paramView; 
    if (r1 == r.d) {
      if (paramView instanceof ViewGroup) {
        view = a(paramArrayOffloat, (ViewGroup)paramView);
        if (view != paramView)
          return view; 
        if (paramView instanceof v && ((v)paramView).a(paramArrayOffloat[0], paramArrayOffloat[1]) != paramView.getId())
          return paramView; 
      } 
      return null;
    } 
    if (view == r.f)
      return (paramView instanceof w && ((w)paramView).b(paramArrayOffloat[0], paramArrayOffloat[1])) ? paramView : ((paramView instanceof ViewGroup) ? a(paramArrayOffloat, (ViewGroup)paramView) : paramView); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown pointer event type: ");
    stringBuilder.append(view.toString());
    throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
  }
  
  private static View a(float[] paramArrayOffloat, ViewGroup paramViewGroup) {
    e0 e0;
    int i = paramViewGroup.getChildCount();
    if (paramViewGroup instanceof e0) {
      e0 = (e0)paramViewGroup;
    } else {
      e0 = null;
    } 
    while (--i >= 0) {
      int j;
      if (e0 != null) {
        j = e0.a(i);
      } else {
        j = i;
      } 
      View view = paramViewGroup.getChildAt(j);
      PointF pointF = b;
      if (a(paramArrayOffloat[0], paramArrayOffloat[1], paramViewGroup, view, pointF)) {
        float f1 = paramArrayOffloat[0];
        float f2 = paramArrayOffloat[1];
        paramArrayOffloat[0] = pointF.x;
        paramArrayOffloat[1] = pointF.y;
        view = a(paramArrayOffloat, view);
        if (view != null)
          return view; 
        paramArrayOffloat[0] = f1;
        paramArrayOffloat[1] = f2;
      } 
      i--;
    } 
    return (View)paramViewGroup;
  }
  
  private static boolean a(float paramFloat1, float paramFloat2, ViewGroup paramViewGroup, View paramView, PointF paramPointF) {
    float f1 = paramFloat1 + paramViewGroup.getScrollX() - paramView.getLeft();
    float f2 = paramFloat2 + paramViewGroup.getScrollY() - paramView.getTop();
    Matrix matrix = paramView.getMatrix();
    paramFloat2 = f1;
    paramFloat1 = f2;
    if (!matrix.isIdentity()) {
      float[] arrayOfFloat = c;
      arrayOfFloat[0] = f1;
      arrayOfFloat[1] = f2;
      Matrix matrix1 = d;
      matrix.invert(matrix1);
      matrix1.mapPoints(arrayOfFloat);
      paramFloat2 = arrayOfFloat[0];
      paramFloat1 = arrayOfFloat[1];
    } 
    if (paramView instanceof c) {
      c c = (c)paramView;
      if (c.getHitSlopRect() != null) {
        Rect rect = c.getHitSlopRect();
        if (paramFloat2 >= -rect.left && paramFloat2 < (paramView.getRight() - paramView.getLeft() + rect.right) && paramFloat1 >= -rect.top && paramFloat1 < (paramView.getBottom() - paramView.getTop() + rect.bottom)) {
          paramPointF.set(paramFloat2, paramFloat1);
          return true;
        } 
        return false;
      } 
    } 
    if (paramFloat2 >= 0.0F && paramFloat2 < (paramView.getRight() - paramView.getLeft()) && paramFloat1 >= 0.0F && paramFloat1 < (paramView.getBottom() - paramView.getTop())) {
      paramPointF.set(paramFloat2, paramFloat1);
      return true;
    } 
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/l0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */