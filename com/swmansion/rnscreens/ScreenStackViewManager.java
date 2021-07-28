package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import e.e.o.d0.a.a;

@a(name = "RNSScreenStack")
public class ScreenStackViewManager extends ViewGroupManager<g> {
  protected static final String REACT_CLASS = "RNSScreenStack";
  
  private void prepareOutTransition(b paramb) {
    startTransitionRecursive(paramb);
  }
  
  private void startTransitionRecursive(ViewGroup paramViewGroup) {
    int j = paramViewGroup.getChildCount();
    for (int i = 0; i < j; i++) {
      View view = paramViewGroup.getChildAt(i);
      paramViewGroup.startViewTransition(view);
      if (view instanceof ViewGroup)
        startTransitionRecursive((ViewGroup)view); 
    } 
  }
  
  public void addView(g paramg, View paramView, int paramInt) {
    if (paramView instanceof b) {
      paramg.a((b)paramView, paramInt);
      return;
    } 
    throw new IllegalArgumentException("Attempt attach child that is not of type RNScreen");
  }
  
  protected g createViewInstance(k0 paramk0) {
    return new g((Context)paramk0);
  }
  
  public View getChildAt(g paramg, int paramInt) {
    return (View)paramg.a(paramInt);
  }
  
  public int getChildCount(g paramg) {
    return paramg.getScreenCount();
  }
  
  public String getName() {
    return "RNSScreenStack";
  }
  
  public boolean needsCustomLayoutForChildren() {
    return true;
  }
  
  public void removeViewAt(g paramg, int paramInt) {
    prepareOutTransition(paramg.a(paramInt));
    paramg.b(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/ScreenStackViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */