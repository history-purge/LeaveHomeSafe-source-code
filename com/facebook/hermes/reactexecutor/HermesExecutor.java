package com.facebook.hermes.reactexecutor;

import com.facebook.jni.HybridData;
import com.facebook.react.bridge.JavaScriptExecutor;
import com.facebook.soloader.SoLoader;

public class HermesExecutor extends JavaScriptExecutor {
  private static String a;
  
  static {
    SoLoader.a("hermes");
    try {
      SoLoader.a("hermes-executor-debug");
      a = "Debug";
      return;
    } catch (UnsatisfiedLinkError unsatisfiedLinkError) {
      SoLoader.a("hermes-executor-release");
      a = "Release";
      return;
    } 
  }
  
  HermesExecutor(b paramb) {
    super(hybridData);
  }
  
  public static native boolean canLoadFile(String paramString);
  
  private static native HybridData initHybrid(long paramLong, boolean paramBoolean);
  
  private static native HybridData initHybridDefaultConfig();
  
  public String getName() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("HermesExecutor");
    stringBuilder.append(a);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/hermes/reactexecutor/HermesExecutor.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */