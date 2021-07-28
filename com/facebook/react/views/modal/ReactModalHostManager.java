package com.facebook.react.views.modal;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Point;
import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.f;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.a0;
import com.facebook.react.uimanager.c0;
import com.facebook.react.uimanager.events.d;
import com.facebook.react.uimanager.i;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import com.facebook.react.uimanager.y0;
import e.e.o.d0.a.a;
import e.e.o.h0.o;
import e.e.o.h0.p;
import java.util.Map;

@a(name = "RCTModalHostView")
public class ReactModalHostManager extends ViewGroupManager<d> implements p<d> {
  public static final String REACT_CLASS = "RCTModalHostView";
  
  private final y0<d> mDelegate = (y0<d>)new o((com.facebook.react.uimanager.b)this);
  
  protected void addEventEmitters(k0 paramk0, d paramd) {
    d d1 = ((UIManagerModule)paramk0.getNativeModule(UIManagerModule.class)).getEventDispatcher();
    paramd.setOnRequestCloseListener(new a(this, d1, paramd));
    paramd.setOnShowListener(new b(this, d1, paramd));
  }
  
  public i createShadowNodeInstance() {
    return new b();
  }
  
  protected d createViewInstance(k0 paramk0) {
    return new d((Context)paramk0);
  }
  
  public y0<d> getDelegate() {
    return this.mDelegate;
  }
  
  public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
    f.b b = f.a();
    b.a("topRequestClose", f.a("registrationName", "onRequestClose"));
    b.a("topShow", f.a("registrationName", "onShow"));
    return b.a();
  }
  
  public String getName() {
    return "RCTModalHostView";
  }
  
  public Class<? extends i> getShadowNodeClass() {
    return (Class)b.class;
  }
  
  protected void onAfterUpdateTransaction(d paramd) {
    super.onAfterUpdateTransaction((View)paramd);
    paramd.b();
  }
  
  public void onDropViewInstance(d paramd) {
    super.onDropViewInstance((View)paramd);
    paramd.a();
  }
  
  public void setAnimated(d paramd, boolean paramBoolean) {}
  
  @com.facebook.react.uimanager.e1.a(name = "animationType")
  public void setAnimationType(d paramd, String paramString) {
    if (paramString != null)
      paramd.setAnimationType(paramString); 
  }
  
  @com.facebook.react.uimanager.e1.a(name = "hardwareAccelerated")
  public void setHardwareAccelerated(d paramd, boolean paramBoolean) {
    paramd.setHardwareAccelerated(paramBoolean);
  }
  
  public void setIdentifier(d paramd, int paramInt) {}
  
  public void setPresentationStyle(d paramd, String paramString) {}
  
  @com.facebook.react.uimanager.e1.a(name = "statusBarTranslucent")
  public void setStatusBarTranslucent(d paramd, boolean paramBoolean) {
    paramd.setStatusBarTranslucent(paramBoolean);
  }
  
  public void setSupportedOrientations(d paramd, ReadableArray paramReadableArray) {}
  
  @com.facebook.react.uimanager.e1.a(name = "transparent")
  public void setTransparent(d paramd, boolean paramBoolean) {
    paramd.setTransparent(paramBoolean);
  }
  
  public Object updateState(d paramd, c0 paramc0, j0 paramj0) {
    Point point = a.a(paramd.getContext());
    paramd.a(paramj0, point.x, point.y);
    return null;
  }
  
  class a implements d.c {
    a(ReactModalHostManager this$0, d param1d, d param1d1) {}
    
    public void a(DialogInterface param1DialogInterface) {
      this.a.a(new e(this.b.getId()));
    }
  }
  
  class b implements DialogInterface.OnShowListener {
    b(ReactModalHostManager this$0, d param1d, d param1d1) {}
    
    public void onShow(DialogInterface param1DialogInterface) {
      this.a.a(new f(this.b.getId()));
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/modal/ReactModalHostManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */