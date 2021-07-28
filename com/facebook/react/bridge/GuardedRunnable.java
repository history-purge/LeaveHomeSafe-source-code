package com.facebook.react.bridge;

public abstract class GuardedRunnable implements Runnable {
  private final NativeModuleCallExceptionHandler mExceptionHandler;
  
  public GuardedRunnable(NativeModuleCallExceptionHandler paramNativeModuleCallExceptionHandler) {
    this.mExceptionHandler = paramNativeModuleCallExceptionHandler;
  }
  
  @Deprecated
  public GuardedRunnable(ReactContext paramReactContext) {
    this(paramReactContext.getExceptionHandler());
  }
  
  public final void run() {
    try {
      runGuarded();
      return;
    } catch (RuntimeException runtimeException) {
      this.mExceptionHandler.handleException(runtimeException);
      return;
    } 
  }
  
  public abstract void runGuarded();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/GuardedRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */