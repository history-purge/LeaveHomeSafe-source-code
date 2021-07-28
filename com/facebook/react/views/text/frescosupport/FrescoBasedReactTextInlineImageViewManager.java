package com.facebook.react.views.text.frescosupport;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.k0;
import e.e.j.a.a.c;
import e.e.j.a.a.e;
import e.e.j.c.b;
import e.e.o.d0.a.a;

@a(name = "RCTTextInlineImage")
public class FrescoBasedReactTextInlineImageViewManager extends ViewManager<View, a> {
  public static final String REACT_CLASS = "RCTTextInlineImage";
  
  private final Object mCallerContext;
  
  private final b mDraweeControllerBuilder;
  
  public FrescoBasedReactTextInlineImageViewManager() {
    this(null, null);
  }
  
  public FrescoBasedReactTextInlineImageViewManager(b paramb, Object paramObject) {
    this.mDraweeControllerBuilder = paramb;
    this.mCallerContext = paramObject;
  }
  
  public a createShadowNodeInstance() {
    e e;
    b b1 = this.mDraweeControllerBuilder;
    if (b1 == null)
      e = c.d(); 
    return new a((b)e, this.mCallerContext);
  }
  
  public View createViewInstance(k0 paramk0) {
    throw new IllegalStateException("RCTTextInlineImage doesn't map into a native view");
  }
  
  public String getName() {
    return "RCTTextInlineImage";
  }
  
  public Class<a> getShadowNodeClass() {
    return a.class;
  }
  
  public void updateExtraData(View paramView, Object paramObject) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/frescosupport/FrescoBasedReactTextInlineImageViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */