package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.k0;
import e.e.o.d0.a.a;

@a(name = "RCTVirtualText")
public class ReactVirtualTextViewManager extends BaseViewManager<View, v> {
  public static final String REACT_CLASS = "RCTVirtualText";
  
  public v createShadowNodeInstance() {
    return new v();
  }
  
  public View createViewInstance(k0 paramk0) {
    throw new IllegalStateException("Attempt to create a native view for RCTVirtualText");
  }
  
  public String getName() {
    return "RCTVirtualText";
  }
  
  public Class<v> getShadowNodeClass() {
    return v.class;
  }
  
  public void updateExtraData(View paramView, Object paramObject) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/ReactVirtualTextViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */