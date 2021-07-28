package com.facebook.react.bridge;

import android.content.Context;

public abstract class ContextBaseJavaModule extends BaseJavaModule {
  private final Context mContext;
  
  public ContextBaseJavaModule(Context paramContext) {
    this.mContext = paramContext;
  }
  
  protected final Context getContext() {
    return this.mContext;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ContextBaseJavaModule.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */