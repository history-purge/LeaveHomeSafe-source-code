package com.facebook.react.bridge;

public final class CallbackImpl implements Callback {
  private final int mCallbackId;
  
  private boolean mInvoked;
  
  private final JSInstance mJSInstance;
  
  public CallbackImpl(JSInstance paramJSInstance, int paramInt) {
    this.mJSInstance = paramJSInstance;
    this.mCallbackId = paramInt;
    this.mInvoked = false;
  }
  
  public void invoke(Object... paramVarArgs) {
    if (!this.mInvoked) {
      this.mJSInstance.invokeCallback(this.mCallbackId, Arguments.fromJavaArgs(paramVarArgs));
      this.mInvoked = true;
      return;
    } 
    throw new RuntimeException("Illegal callback invocation from native module. This callback type only permits a single invocation from native code.");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/CallbackImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */