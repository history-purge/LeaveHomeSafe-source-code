package com.facebook.react.modules.core;

import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.WritableArray;
import e.e.n.a.a;

@a
public interface JSTimers extends JavaScriptModule {
  void callIdleCallbacks(double paramDouble);
  
  void callTimers(WritableArray paramWritableArray);
  
  void emitTimeDriftWarning(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/core/JSTimers.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */