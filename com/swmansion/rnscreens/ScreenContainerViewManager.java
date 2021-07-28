package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;
import e.e.o.d0.a.a;

@a(name = "RNSScreenContainer")
public class ScreenContainerViewManager extends ViewGroupManager<d> {
  protected static final String REACT_CLASS = "RNSScreenContainer";
  
  public void addView(d paramd, View paramView, int paramInt) {
    if (paramView instanceof b) {
      paramd.a((b)paramView, paramInt);
      return;
    } 
    throw new IllegalArgumentException("Attempt attach child that is not of type RNScreens");
  }
  
  protected d createViewInstance(k0 paramk0) {
    return new d<f>((Context)paramk0);
  }
  
  public View getChildAt(d paramd, int paramInt) {
    return (View)paramd.a(paramInt);
  }
  
  public int getChildCount(d paramd) {
    return paramd.getScreenCount();
  }
  
  public String getName() {
    return "RNSScreenContainer";
  }
  
  public boolean needsCustomLayoutForChildren() {
    return true;
  }
  
  public void removeAllViews(d paramd) {
    paramd.d();
  }
  
  public void removeViewAt(d paramd, int paramInt) {
    paramd.b(paramInt);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/ScreenContainerViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */