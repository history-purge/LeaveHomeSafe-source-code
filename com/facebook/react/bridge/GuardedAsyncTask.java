package com.facebook.react.bridge;

import android.os.AsyncTask;

public abstract class GuardedAsyncTask<Params, Progress> extends AsyncTask<Params, Progress, Void> {
  private final NativeModuleCallExceptionHandler mExceptionHandler;
  
  protected GuardedAsyncTask(NativeModuleCallExceptionHandler paramNativeModuleCallExceptionHandler) {
    this.mExceptionHandler = paramNativeModuleCallExceptionHandler;
  }
  
  @Deprecated
  protected GuardedAsyncTask(ReactContext paramReactContext) {
    this(paramReactContext.getExceptionHandler());
  }
  
  protected final Void doInBackground(Params... paramVarArgs) {
    try {
      doInBackgroundGuarded(paramVarArgs);
    } catch (RuntimeException runtimeException) {
      this.mExceptionHandler.handleException(runtimeException);
    } 
    return null;
  }
  
  protected abstract void doInBackgroundGuarded(Params... paramVarArgs);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/GuardedAsyncTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */