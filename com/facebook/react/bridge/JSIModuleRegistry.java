package com.facebook.react.bridge;

import e.e.m.a.a;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JSIModuleRegistry {
  private final Map<JSIModuleType, JSIModuleHolder> mModules = new HashMap<JSIModuleType, JSIModuleHolder>();
  
  public JSIModule getModule(JSIModuleType paramJSIModuleType) {
    JSIModule jSIModule;
    JSIModuleHolder jSIModuleHolder = this.mModules.get(paramJSIModuleType);
    if (jSIModuleHolder != null) {
      jSIModule = jSIModuleHolder.getJSIModule();
      a.a(jSIModule);
      return jSIModule;
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unable to find JSIModule for class ");
    stringBuilder.append(jSIModule);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public void notifyJSInstanceDestroy() {
    for (Map.Entry<JSIModuleType, JSIModuleHolder> entry : this.mModules.entrySet()) {
      if ((JSIModuleType)entry.getKey() == JSIModuleType.TurboModuleManager)
        continue; 
      ((JSIModuleHolder)entry.getValue()).notifyJSInstanceDestroy();
    } 
  }
  
  public void registerModules(List<JSIModuleSpec> paramList) {
    for (JSIModuleSpec jSIModuleSpec : paramList)
      this.mModules.put(jSIModuleSpec.getJSIModuleType(), new JSIModuleHolder(jSIModuleSpec)); 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JSIModuleRegistry.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */