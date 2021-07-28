package com.facebook.react.bridge;

public class JSCJavaScriptExecutorFactory implements JavaScriptExecutorFactory {
  private final String mAppName;
  
  private final String mDeviceName;
  
  public JSCJavaScriptExecutorFactory(String paramString1, String paramString2) {
    this.mAppName = paramString1;
    this.mDeviceName = paramString2;
  }
  
  public JavaScriptExecutor create() {
    WritableNativeMap writableNativeMap = new WritableNativeMap();
    writableNativeMap.putString("OwnerIdentity", "ReactNative");
    writableNativeMap.putString("AppIdentity", this.mAppName);
    writableNativeMap.putString("DeviceIdentity", this.mDeviceName);
    return new JSCJavaScriptExecutor(writableNativeMap);
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
    return "JSCExecutor";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/JSCJavaScriptExecutorFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */