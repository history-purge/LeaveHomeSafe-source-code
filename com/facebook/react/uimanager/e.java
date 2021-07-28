package com.facebook.react.uimanager;

import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.a;

public abstract class e extends a.a {
  private final ReactContext b;
  
  protected e(ReactContext paramReactContext) {
    this.b = paramReactContext;
  }
  
  public final void a(long paramLong) {
    try {
      b(paramLong);
      return;
    } catch (RuntimeException runtimeException) {
      this.b.handleException(runtimeException);
      return;
    } 
  }
  
  protected abstract void b(long paramLong);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */