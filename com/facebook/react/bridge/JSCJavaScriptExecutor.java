package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import e.e.n.a.a;

@a
class JSCJavaScriptExecutor extends JavaScriptExecutor {
  static {
    ReactBridge.staticInit();
  }
  
  JSCJavaScriptExecutor(ReadableNativeMap paramReadableNativeMap) {
    super(initHybrid(paramReadableNativeMap));
  }
  
  private static native HybridData initHybrid(ReadableNativeMap paramReadableNativeMap);
  
  public String getName() {
    return "JSCJavaScriptExecutor";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JSCJavaScriptExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */