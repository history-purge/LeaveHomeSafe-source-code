package com.facebook.react.views.view;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.e1.a;

public abstract class ReactClippingViewManager<T extends f> extends ViewGroupManager<T> {
  public void addView(T paramT, View paramView, int paramInt) {
    UiThreadUtil.assertOnUiThread();
    if (paramT.getRemoveClippedSubviews()) {
      paramT.a(paramView, paramInt);
      return;
    } 
    paramT.addView(paramView, paramInt);
  }
  
  public View getChildAt(T paramT, int paramInt) {
    return paramT.getRemoveClippedSubviews() ? paramT.b(paramInt) : paramT.getChildAt(paramInt);
  }
  
  public int getChildCount(T paramT) {
    return paramT.getRemoveClippedSubviews() ? paramT.getAllChildrenCount() : paramT.getChildCount();
  }
  
  public void removeAllViews(T paramT) {
    UiThreadUtil.assertOnUiThread();
    if (paramT.getRemoveClippedSubviews()) {
      paramT.c();
      return;
    } 
    paramT.removeAllViews();
  }
  
  public void removeViewAt(T paramT, int paramInt) {
    UiThreadUtil.assertOnUiThread();
    if (paramT.getRemoveClippedSubviews()) {
      View view = getChildAt(paramT, paramInt);
      if (view.getParent() != null)
        paramT.removeView(view); 
      paramT.a(view);
      return;
    } 
    paramT.removeViewAt(paramInt);
  }
  
  @a(name = "removeClippedSubviews")
  public void setRemoveClippedSubviews(T paramT, boolean paramBoolean) {
    UiThreadUtil.assertOnUiThread();
    paramT.setRemoveClippedSubviews(paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/view/ReactClippingViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */