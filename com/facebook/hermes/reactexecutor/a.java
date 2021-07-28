package com.facebook.hermes.reactexecutor;

import com.facebook.hermes.instrumentation.HermesSamplingProfiler;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.react.bridge.JavaScriptExecutorFactory;

public class a implements JavaScriptExecutorFactory {
  private final b a;
  
  public a() {
    this(null);
  }
  
  public a(b paramb) {
    this.a = paramb;
  }
  
  public JavaScriptExecutor create() {
    return new HermesExecutor(this.a);
  }
  
  public void startSamplingProfiler() {
    HermesSamplingProfiler.enable();
  }
  
  public void stopSamplingProfiler(String paramString) {
    HermesSamplingProfiler.dumpSampledTraceToFile(paramString);
    HermesSamplingProfiler.disable();
  }
  
  public String toString() {
    return "JSIExecutor+HermesRuntime";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/hermes/reactexecutor/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */