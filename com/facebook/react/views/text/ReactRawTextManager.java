package com.facebook.react.views.text;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.k0;
import e.e.o.d0.a.a;

@a(name = "RCTRawText")
public class ReactRawTextManager extends ViewManager<View, k> {
  public static final String REACT_CLASS = "RCTRawText";
  
  public k createShadowNodeInstance() {
    return new k();
  }
  
  public r createViewInstance(k0 paramk0) {
    throw new IllegalStateException("Attempt to create a native view for RCTRawText");
  }
  
  public String getName() {
    return "RCTRawText";
  }
  
  public Class<k> getShadowNodeClass() {
    return k.class;
  }
  
  public void updateExtraData(View paramView, Object paramObject) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/ReactRawTextManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */