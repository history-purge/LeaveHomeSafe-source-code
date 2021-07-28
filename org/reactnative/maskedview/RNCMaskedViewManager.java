package org.reactnative.maskedview;

import android.content.Context;
import android.view.View;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.k0;

public class RNCMaskedViewManager extends ViewGroupManager<a> {
  private static final String REACT_CLASS = "RNCMaskedView";
  
  protected a createViewInstance(k0 paramk0) {
    return new a((Context)paramk0);
  }
  
  public String getName() {
    return "RNCMaskedView";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/maskedview/RNCMaskedViewManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */