package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

public class g extends JSApplicationCausedNativeException {
  private View mView;
  
  public g(String paramString) {
    super(paramString);
  }
  
  public g(String paramString, View paramView, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.mView = paramView;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */