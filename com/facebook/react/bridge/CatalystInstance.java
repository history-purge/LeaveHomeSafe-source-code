package com.facebook.react.bridge;

import com.facebook.react.bridge.queue.ReactQueueConfiguration;
import com.facebook.react.turbomodule.core.interfaces.CallInvokerHolder;
import e.e.n.a.a;
import java.util.Collection;
import java.util.List;

@a
public interface CatalystInstance extends MemoryPressureListener, JSInstance, JSBundleLoaderDelegate {
  void addBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener paramNotThreadSafeBridgeIdleDebugListener);
  
  void addJSIModules(List<JSIModuleSpec> paramList);
  
  @a
  void callFunction(String paramString1, String paramString2, NativeArray paramNativeArray);
  
  void destroy();
  
  void extendNativeModules(NativeModuleRegistry paramNativeModuleRegistry);
  
  CallInvokerHolder getJSCallInvokerHolder();
  
  JSIModule getJSIModule(JSIModuleType paramJSIModuleType);
  
  <T extends JavaScriptModule> T getJSModule(Class<T> paramClass);
  
  JavaScriptContextHolder getJavaScriptContextHolder();
  
  CallInvokerHolder getNativeCallInvokerHolder();
  
  <T extends NativeModule> T getNativeModule(Class<T> paramClass);
  
  NativeModule getNativeModule(String paramString);
  
  Collection<NativeModule> getNativeModules();
  
  ReactQueueConfiguration getReactQueueConfiguration();
  
  String getSourceURL();
  
  <T extends NativeModule> boolean hasNativeModule(Class<T> paramClass);
  
  boolean hasRunJSBundle();
  
  void initialize();
  
  @a
  void invokeCallback(int paramInt, NativeArrayInterface paramNativeArrayInterface);
  
  boolean isDestroyed();
  
  void registerSegment(int paramInt, String paramString);
  
  void removeBridgeIdleDebugListener(NotThreadSafeBridgeIdleDebugListener paramNotThreadSafeBridgeIdleDebugListener);
  
  void runJSBundle();
  
  void setGlobalVariable(String paramString1, String paramString2);
  
  void setTurboModuleManager(JSIModule paramJSIModule);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/CatalystInstance.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */