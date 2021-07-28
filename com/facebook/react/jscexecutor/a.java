package com.facebook.react.jscexecutor;

import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;
import com.facebook.react.bridge.ReadableNativeMap;
import com.facebook.react.bridge.WritableNativeMap;

public class a implements JavaScriptExecutorFactory {
  private final String a;
  
  private final String b;
  
  public a(String paramString1, String paramString2) {
    this.a = paramString1;
    this.b = paramString2;
  }
  
  public JavaScriptExecutor create() {
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    writableNativeMap.putString("OwnerIdentity", "ReactNative");
    writableNativeMap.putString("AppIdentity", this.a);
    writableNativeMap.putString("DeviceIdentity", this.b);
    return new JSCExecutor((ReadableNativeMap)writableNativeMap);
  }
  
  public void startSamplingProfiler() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Starting sampling profiler not supported on ");
    stringBuilder.append(toString());
    throw new UnsupportedOperationException(stringBuilder.toString());
  }
  
  public void stopSamplingProfiler(String paramString) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Stopping sampling profiler not supported on ");
    stringBuilder.append(toString());
    throw new UnsupportedOperationException(stringBuilder.toString());
  }
  
  public String toString() {
    return "JSIExecutor+JSCRuntime";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/jscexecutor/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */