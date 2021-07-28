package com.facebook.react.views.art;

import android.view.View;
import com.facebook.react.uimanager.ViewManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.k0;

public class ARTRenderableViewManager extends ViewManager<View, a0> {
  public static final String CLASS_GROUP = "ARTGroup";
  
  public static final String CLASS_SHAPE = "ARTShape";
  
  public static final String CLASS_TEXT = "ARTText";
  
  private final String mClassName;
  
  ARTRenderableViewManager(String paramString) {
    this.mClassName = paramString;
  }
  
  public static ARTRenderableViewManager createARTGroupViewManager() {
    return new ARTGroupViewManager();
  }
  
  public static ARTRenderableViewManager createARTShapeViewManager() {
    return new ARTShapeViewManager();
  }
  
  public static ARTRenderableViewManager createARTTextViewManager() {
    return new ARTTextViewManager();
  }
  
  public a0 createShadowNodeInstance() {
    if ("ARTGroup".equals(this.mClassName))
      return (a0)new a(); 
    if ("ARTShape".equals(this.mClassName))
      return (a0)new b(); 
    if ("ARTText".equals(this.mClassName))
      return (a0)new e(); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unexpected type ");
    stringBuilder.append(this.mClassName);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  protected View createViewInstance(k0 paramk0) {
    throw new IllegalStateException("ARTShape does not map into a native view");
  }
  
  public String getName() {
    return this.mClassName;
  }
  
  public Class<? extends a0> getShadowNodeClass() {
    if ("ARTGroup".equals(this.mClassName))
      return (Class)a.class; 
    if ("ARTShape".equals(this.mClassName))
      return (Class)b.class; 
    if ("ARTText".equals(this.mClassName))
      return (Class)e.class; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unexpected type ");
    stringBuilder.append(this.mClassName);
    throw new IllegalStateException(stringBuilder.toString());
  }
  
  public void updateExtraData(View paramView, Object paramObject) {
    throw new IllegalStateException("ARTShape does not map into a native view");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/art/ARTRenderableViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */