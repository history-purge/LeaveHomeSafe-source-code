package com.facebook.react.modules.debug;

import com.facebook.fbreact.specs.NativeDevSettingsSpec;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.devsupport.h.c;
import e.e.o.d0.a.a;

@a(name = "DevSettings")
public class DevSettingsModule extends NativeDevSettingsSpec {
  public static final String NAME = "DevSettings";
  
  private final c mDevSupportManager;
  
  public DevSettingsModule(ReactApplicationContext paramReactApplicationContext, c paramc) {
    super(paramReactApplicationContext);
    this.mDevSupportManager = paramc;
  }
  
  public void addListener(String paramString) {}
  
  public void addMenuItem(String paramString) {
    this.mDevSupportManager.a(paramString, new b(this, paramString));
  }
  
  public String getName() {
    return "DevSettings";
  }
  
  public void onFastRefresh() {}
  
  public void reload() {
    if (this.mDevSupportManager.a())
      UiThreadUtil.runOnUiThread(new a(this)); 
  }
  
  public void reloadWithReason(String paramString) {
    reload();
  }
  
  public void removeListeners(double paramDouble) {}
  
  public void setHotLoadingEnabled(boolean paramBoolean) {
    this.mDevSupportManager.c(paramBoolean);
  }
  
  public void setIsDebuggingRemotely(boolean paramBoolean) {
    this.mDevSupportManager.b(paramBoolean);
  }
  
  public void setIsShakeToShowDevMenuEnabled(boolean paramBoolean) {}
  
  public void setProfilingEnabled(boolean paramBoolean) {
    this.mDevSupportManager.a(paramBoolean);
  }
  
  public void toggleElementInspector() {
    this.mDevSupportManager.e();
  }
  
  class a implements Runnable {
    a(DevSettingsModule this$0) {}
    
    public void run() {
      this.c.mDevSupportManager.d();
    }
  }
  
  class b implements com.facebook.react.devsupport.h.b {
    b(DevSettingsModule this$0, String param1String) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/debug/DevSettingsModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */