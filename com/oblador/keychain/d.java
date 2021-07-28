package com.oblador.keychain;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.Collections;
import java.util.List;

public class d implements v {
  private final c a;
  
  public d() {
    this(new c());
  }
  
  public d(c paramc) {
    this.a = paramc;
  }
  
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    c c1 = this.a;
    c1.a(paramReactApplicationContext);
    return (List)Collections.singletonList(c1.a());
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Collections.emptyList();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/oblador/keychain/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */