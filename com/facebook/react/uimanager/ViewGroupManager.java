package com.facebook.react.uimanager;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.UiThreadUtil;
import java.util.List;
import java.util.WeakHashMap;

public abstract class ViewGroupManager<T extends ViewGroup> extends BaseViewManager<T, i> implements f {
  private static WeakHashMap<View, Integer> mZIndexHash = new WeakHashMap<View, Integer>();
  
  public static Integer getViewZIndex(View paramView) {
    return mZIndexHash.get(paramView);
  }
  
  public static void setViewZIndex(View paramView, int paramInt) {
    mZIndexHash.put(paramView, Integer.valueOf(paramInt));
  }
  
  public void addView(T paramT, View paramView, int paramInt) {
    paramT.addView(paramView, paramInt);
  }
  
  public void addViews(T paramT, List<View> paramList) {
    UiThreadUtil.assertOnUiThread();
    int j = paramList.size();
    for (int i = 0; i < j; i++)
      addView(paramT, paramList.get(i), i); 
  }
  
  public i createShadowNodeInstance() {
    return new i();
  }
  
  public View getChildAt(T paramT, int paramInt) {
    return paramT.getChildAt(paramInt);
  }
  
  public int getChildCount(T paramT) {
    return paramT.getChildCount();
  }
  
  public Class<? extends i> getShadowNodeClass() {
    return i.class;
  }
  
  public boolean needsCustomLayoutForChildren() {
    return false;
  }
  
  public void removeAllViews(T paramT) {
    UiThreadUtil.assertOnUiThread();
    for (int i = getChildCount(paramT) - 1; i >= 0; i--)
      removeViewAt(paramT, i); 
  }
  
  public void removeView(T paramT, View paramView) {
    UiThreadUtil.assertOnUiThread();
    for (int i = 0; i < getChildCount(paramT); i++) {
      if (getChildAt(paramT, i) == paramView) {
        removeViewAt(paramT, i);
        return;
      } 
    } 
  }
  
  public void removeViewAt(T paramT, int paramInt) {
    UiThreadUtil.assertOnUiThread();
    paramT.removeViewAt(paramInt);
  }
  
  public boolean shouldPromoteGrandchildren() {
    return false;
  }
  
  public void updateExtraData(T paramT, Object paramObject) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/ViewGroupManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */