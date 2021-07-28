package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;
import e.e.o.d0.a.a;

@a(name = "RNSScreenStackHeaderConfig")
public class ScreenStackHeaderConfigViewManager extends ViewGroupManager<i> {
  protected static final String REACT_CLASS = "RNSScreenStackHeaderConfig";
  
  public void addView(i parami, View paramView, int paramInt) {
    if (paramView instanceof j) {
      parami.a((j)paramView, paramInt);
      return;
    } 
    throw new JSApplicationCausedNativeException("Config children should be of type RNSScreenStackHeaderSubview");
  }
  
  protected i createViewInstance(k0 paramk0) {
    return new i((Context)paramk0);
  }
  
  public View getChildAt(i parami, int paramInt) {
    return (View)parami.a(paramInt);
  }
  
  public int getChildCount(i parami) {
    return parami.getConfigSubviewsCount();
  }
  
  public String getName() {
    return "RNSScreenStackHeaderConfig";
  }
  
  public boolean needsCustomLayoutForChildren() {
    return true;
  }
  
  protected void onAfterUpdateTransaction(i parami) {
    super.onAfterUpdateTransaction((View)parami);
    parami.b();
  }
  
  public void onDropViewInstance(i parami) {
    parami.a();
  }
  
  public void removeAllViews(i parami) {
    parami.c();
  }
  
  public void removeViewAt(i parami, int paramInt) {
    parami.b(paramInt);
  }
  
  @a(name = "backButtonInCustomView")
  public void setBackButtonInCustomView(i parami, boolean paramBoolean) {
    parami.setBackButtonInCustomView(paramBoolean);
  }
  
  @a(customType = "Color", name = "backgroundColor")
  public void setBackgroundColor(i parami, int paramInt) {
    parami.setBackgroundColor(paramInt);
  }
  
  @a(customType = "Color", name = "color")
  public void setColor(i parami, int paramInt) {
    parami.setTintColor(paramInt);
  }
  
  @a(name = "hidden")
  public void setHidden(i parami, boolean paramBoolean) {
    parami.setHidden(paramBoolean);
  }
  
  @a(name = "hideBackButton")
  public void setHideBackButton(i parami, boolean paramBoolean) {
    parami.setHideBackButton(paramBoolean);
  }
  
  @a(name = "hideShadow")
  public void setHideShadow(i parami, boolean paramBoolean) {
    parami.setHideShadow(paramBoolean);
  }
  
  @a(name = "title")
  public void setTitle(i parami, String paramString) {
    parami.setTitle(paramString);
  }
  
  @a(customType = "Color", name = "titleColor")
  public void setTitleColor(i parami, int paramInt) {
    parami.setTitleColor(paramInt);
  }
  
  @a(name = "titleFontFamily")
  public void setTitleFontFamily(i parami, String paramString) {
    parami.setTitleFontFamily(paramString);
  }
  
  @a(name = "titleFontSize")
  public void setTitleFontSize(i parami, float paramFloat) {
    parami.setTitleFontSize(paramFloat);
  }
  
  @a(name = "topInsetEnabled")
  public void setTopInsetEnabled(i parami, boolean paramBoolean) {
    parami.setTopInsetEnabled(paramBoolean);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/rnscreens/ScreenStackHeaderConfigViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */