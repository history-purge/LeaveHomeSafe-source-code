package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import com.facebook.soloader.SoLoader;
import e.e.n.a.a;

@a
public class CxxModuleWrapper extends CxxModuleWrapperBase {
  protected CxxModuleWrapper(HybridData paramHybridData) {
    super(paramHybridData);
  }
  
  public static CxxModuleWrapper makeDso(String paramString1, String paramString2) {
    SoLoader.a(paramString1);
    return makeDsoNative(SoLoader.c(paramString1).getAbsolutePath(), paramString2);
  }
  
  private static native CxxModuleWrapper makeDsoNative(String paramString1, String paramString2);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/CxxModuleWrapper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */