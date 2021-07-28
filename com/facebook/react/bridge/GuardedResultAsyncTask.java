package com.facebook.react.bridge;

import android.os.AsyncTask;

public abstract class GuardedResultAsyncTask<Result> extends AsyncTask<Void, Void, Result> {
  private final NativeModuleCallExceptionHandler mExceptionHandler;
  
  protected GuardedResultAsyncTask(NativeModuleCallExceptionHandler paramNativeModuleCallExceptionHandler) {
    this.mExceptionHandler = paramNativeModuleCallExceptionHandler;
  }
  
  @Deprecated
  protected GuardedResultAsyncTask(ReactContext paramReactContext) {
    this(paramReactContext.getExceptionHandler());
  }
  
  protected final Result doInBackground(Void... paramVarArgs) {
    try {
      return doInBackgroundGuarded();
    } catch (RuntimeException runtimeException) {
      this.mExceptionHandler.handleException(runtimeException);
      throw runtimeException;
    } 
  }
  
  protected abstract Result doInBackgroundGuarded();
  
  protected final void onPostExecute(Result paramResult) {
    try {
      onPostExecuteGuarded(paramResult);
      return;
    } catch (RuntimeException runtimeException) {
      this.mExceptionHandler.handleException(runtimeException);
      return;
    } 
  }
  
  protected abstract void onPostExecuteGuarded(Result paramResult);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/GuardedResultAsyncTask.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */