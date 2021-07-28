package com.facebook.react.uimanager;

import android.view.View;

public abstract class SimpleViewManager<T extends View> extends BaseViewManager<T, i> {
  public i createShadowNodeInstance() {
    return new i();
  }
  
  public Class<i> getShadowNodeClass() {
    return i.class;
  }
  
  public void updateExtraData(T paramT, Object paramObject) {}
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/SimpleViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */