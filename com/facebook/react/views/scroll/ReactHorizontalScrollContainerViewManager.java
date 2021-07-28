package com.facebook.react.views.scroll;

import android.content.Context;
import android.view.View;
import com.facebook.react.uimanager.k0;
import com.facebook.react.views.view.ReactClippingViewManager;
import e.e.o.d0.a.a;

@a(name = "AndroidHorizontalScrollContentView")
public class ReactHorizontalScrollContainerViewManager extends ReactClippingViewManager<c> {
  public static final String REACT_CLASS = "AndroidHorizontalScrollContentView";
  
  public c createViewInstance(k0 paramk0) {
    return new c((Context)paramk0);
  }
  
  public String getName() {
    return "AndroidHorizontalScrollContentView";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/ReactHorizontalScrollContainerViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */