package com.facebook.react.uimanager;

import com.facebook.react.common.f;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class a1 {
  private final Map<String, ViewManager> a;
  
  private final UIManagerModule.g b;
  
  public a1(UIManagerModule.g paramg) {
    this.a = f.b();
    this.b = paramg;
  }
  
  public a1(List<ViewManager> paramList) {
    HashMap<String, ViewManager> hashMap = f.b();
    for (ViewManager viewManager : paramList)
      hashMap.put(viewManager.getName(), viewManager); 
    this.a = hashMap;
    this.b = null;
  }
  
  private ViewManager c(String paramString) {
    ViewManager viewManager = this.b.a(paramString);
    if (viewManager != null)
      this.a.put(paramString, viewManager); 
    return viewManager;
  }
  
  public ViewManager a(String paramString) {
    ViewManager viewManager = this.a.get(paramString);
    if (viewManager != null)
      return viewManager; 
    if (this.b != null) {
      viewManager = c(paramString);
      if (viewManager != null)
        return viewManager; 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("ViewManagerResolver returned null for ");
      stringBuilder1.append(paramString);
      throw new g(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("No ViewManager found for class ");
    stringBuilder.append(paramString);
    throw new g(stringBuilder.toString());
  }
  
  ViewManager b(String paramString) {
    ViewManager viewManager = this.a.get(paramString);
    return (viewManager != null) ? viewManager : ((this.b != null) ? c(paramString) : null);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/a1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */