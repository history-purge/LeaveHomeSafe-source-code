package com.facebook.react.uimanager;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

public class RootViewManager extends ViewGroupManager<ViewGroup> {
  public static final String REACT_CLASS = "RootView";
  
  protected ViewGroup createViewInstance(k0 paramk0) {
    return (ViewGroup)new FrameLayout((Context)paramk0);
  }
  
  public String getName() {
    return "RootView";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/RootViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */