package com.facebook.react.jscexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.soloader.SoLoader;
import e.e.n.a.a;

@a
class JSCExecutor extends JavaScriptExecutor {
  static {
    SoLoader.a("jscexecutor");
  }
  
  JSCExecutor(ReadableNativeMap paramReadableNativeMap) {
    super(initHybrid(paramReadableNativeMap));
  }
  
  private static native HybridData initHybrid(ReadableNativeMap paramReadableNativeMap);
  
  public String getName() {
    return "JSCExecutor";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/jscexecutor/JSCExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */