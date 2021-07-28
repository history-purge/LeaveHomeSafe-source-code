package com.swmansion.rnscreens;

import android.view.View;
import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;
import e.e.o.d0.a.a;
import java.util.Map;

@a(name = "RNSScreen")
public class ScreenViewManager extends ViewGroupManager<b> {
  protected static final String REACT_CLASS = "RNSScreen";
  
  protected b createViewInstance(k0 paramk0) {
    return new b((ReactContext)paramk0);
  }
  
  public Map getExportedCustomDirectEventTypeConstants() {
    return f.a("topDismissed", f.a("registrationName", "onDismissed"), "topAppear", f.a("registrationName", "onAppear"), "topFinishTransitioning", f.a("registrationName", "onFinishTransitioning"));
  }
  
  public String getName() {
    return "RNSScreen";
  }
  
  @a(defaultFloat = 0.0F, name = "active")
  public void setActive(b paramb, float paramFloat) {
    boolean bool;
    if (paramFloat != 0.0F) {
      bool = true;
    } else {
      bool = false;
    } 
    paramb.setActive(bool);
  }
  
  @a(defaultBoolean = true, name = "gestureEnabled")
  public void setGestureEnabled(b paramb, boolean paramBoolean) {
    paramb.setGestureEnabled(paramBoolean);
  }
  
  @a(name = "stackAnimation")
  public void setStackAnimation(b paramb, String paramString) {
    b.c c;
    if (paramString == null || "default".equals(paramString)) {
      c = b.c.c;
    } else if ("none".equals(c)) {
      c = b.c.d;
    } else if ("fade".equals(c)) {
      c = b.c.e;
    } else {
      return;
    } 
    paramb.setStackAnimation(c);
  }
  
  @a(name = "stackPresentation")
  public void setStackPresentation(b paramb, String paramString) {
    StringBuilder stringBuilder;
    b.d d;
    if ("push".equals(paramString)) {
      d = b.d.c;
    } else if ("modal".equals(d) || "containedModal".equals(d) || "fullScreenModal".equals(d) || "formSheet".equals(d)) {
      d = b.d.d;
    } else if ("transparentModal".equals(d) || "containedTransparentModal".equals(d)) {
      d = b.d.e;
    } else {
      stringBuilder = new StringBuilder();
      stringBuilder.append("Unknown presentation type ");
      stringBuilder.append((String)d);
      throw new JSApplicationIllegalArgumentException(stringBuilder.toString());
    } 
    stringBuilder.setStackPresentation(d);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/ScreenViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */