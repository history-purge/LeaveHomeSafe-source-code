package com.facebook.react.views.unimplementedview;

import android.content.Context;
import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.e1.a;
import com.facebook.react.uimanager.k0;
import e.e.o.d0.a.a;

@a(name = "UnimplementedNativeView")
public class ReactUnimplementedViewManager extends ViewGroupManager<a> {
  public static final String REACT_CLASS = "UnimplementedNativeView";
  
  protected a createViewInstance(k0 paramk0) {
    return new a((Context)paramk0);
  }
  
  public String getName() {
    return "UnimplementedNativeView";
  }
  
  @a(name = "name")
  public void setName(a parama, String paramString) {
    parama.setName(paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/unimplementedview/ReactUnimplementedViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */