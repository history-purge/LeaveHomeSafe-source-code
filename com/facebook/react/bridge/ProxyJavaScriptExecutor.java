package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import e.e.n.a.a;

@a
public class ProxyJavaScriptExecutor extends JavaScriptExecutor {
  private JavaJSExecutor mJavaJSExecutor;
  
  static {
    ReactBridge.staticInit();
  }
  
  public ProxyJavaScriptExecutor(JavaJSExecutor paramJavaJSExecutor) {
    super(initHybrid(paramJavaJSExecutor));
    this.mJavaJSExecutor = paramJavaJSExecutor;
  }
  
  private static native HybridData initHybrid(JavaJSExecutor paramJavaJSExecutor);
  
  public void close() {
    JavaJSExecutor javaJSExecutor = this.mJavaJSExecutor;
    if (javaJSExecutor != null) {
      javaJSExecutor.close();
      this.mJavaJSExecutor = null;
    } 
  }
  
  public String getName() {
    return "ProxyJavaScriptExecutor";
  }
  
  public static class Factory implements JavaScriptExecutorFactory {
    private final JavaJSExecutor.Factory mJavaJSExecutorFactory;
    
    public Factory(JavaJSExecutor.Factory param1Factory) {
      this.mJavaJSExecutorFactory = param1Factory;
    }
    
    public JavaScriptExecutor create() {
      return new ProxyJavaScriptExecutor(this.mJavaJSExecutorFactory.create());
    }
    
    public void startSamplingProfiler() {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Starting sampling profiler not supported on ");
      stringBuilder.append(toString());
      throw new UnsupportedOperationException(stringBuilder.toString());
    }
    
    public void stopSamplingProfiler(String param1String) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Stopping sampling profiler not supported on ");
      stringBuilder.append(toString());
      throw new UnsupportedOperationException(stringBuilder.toString());
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ProxyJavaScriptExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */