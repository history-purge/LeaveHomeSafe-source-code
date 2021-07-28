package com.th3rdwave.safeareacontext;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.k0;
import java.util.Map;

public class SafeAreaProviderManager extends ViewGroupManager<e> {
  private final ReactApplicationContext mContext;
  
  public SafeAreaProviderManager(ReactApplicationContext paramReactApplicationContext) {
    this.mContext = paramReactApplicationContext;
  }
  
  private Map<String, Object> getInitialWindowMetrics() {
    Activity activity = this.mContext.getCurrentActivity();
    if (activity == null)
      return null; 
    ViewGroup viewGroup = (ViewGroup)activity.getWindow().getDecorView();
    if (viewGroup == null)
      return null; 
    View view = viewGroup.findViewById(16908290);
    a a = f.b((View)viewGroup);
    c c = f.a(viewGroup, view);
    return (a != null) ? ((c == null) ? null : f.a("insets", l.a(a), "frame", l.a(c))) : null;
  }
  
  protected void addEventEmitters(k0 paramk0, e parame) {
    parame.setOnInsetsChangeListener(new a(this, ((UIManagerModule)paramk0.getNativeModule(UIManagerModule.class)).getEventDispatcher()));
  }
  
  public e createViewInstance(k0 paramk0) {
    return new e((Context)paramk0);
  }
  
  public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
    f.b b = f.a();
    b.a("topInsetsChange", f.a("registrationName", "onInsetsChange"));
    return b.a();
  }
  
  public Map<String, Object> getExportedViewConstants() {
    return f.a("initialWindowMetrics", getInitialWindowMetrics());
  }
  
  public String getName() {
    return "RNCSafeAreaProvider";
  }
  
  class a implements e.a {
    a(SafeAreaProviderManager this$0, d param1d) {}
    
    public void a(e param1e, a param1a, c param1c) {
      this.a.a(new b(param1e.getId(), param1a, param1c));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/th3rdwave/safeareacontext/SafeAreaProviderManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */