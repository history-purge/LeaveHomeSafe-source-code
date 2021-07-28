package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;
import com.facebook.react.views.view.ReactViewManager;
import com.facebook.react.views.view.f;
import e.e.o.d0.a.a;

@a(name = "RNSScreenStackHeaderSubview")
public class ScreenStackHeaderSubviewManager extends ReactViewManager {
  protected static final String REACT_CLASS = "RNSScreenStackHeaderSubview";
  
  public f createViewInstance(k0 paramk0) {
    return new j((ReactContext)paramk0);
  }
  
  public String getName() {
    return "RNSScreenStackHeaderSubview";
  }
  
  @a(name = "type")
  public void setType(j paramj, String paramString) {
    j.a a;
    if ("left".equals(paramString)) {
      a = j.a.c;
    } else if ("center".equals(a)) {
      a = j.a.d;
    } else if ("right".equals(a)) {
      a = j.a.e;
    } else if ("back".equals(a)) {
      a = j.a.f;
    } else {
      return;
    } 
    paramj.setType(a);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/ScreenStackHeaderSubviewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */