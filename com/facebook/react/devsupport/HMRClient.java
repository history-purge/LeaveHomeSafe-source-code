package com.facebook.react.devsupport;

import com.facebook.react.bridge.JavaScriptModule;

public interface HMRClient extends JavaScriptModule {
  void disable();
  
  void enable();
  
  void setup(String paramString1, String paramString2, String paramString3, int paramInt, boolean paramBoolean);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/devsupport/HMRClient.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */