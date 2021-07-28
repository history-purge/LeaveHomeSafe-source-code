package org.reactnative.maskedview;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;
import e.e.o.v;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class b implements v {
  public List<NativeModule> createNativeModules(ReactApplicationContext paramReactApplicationContext) {
    return Collections.emptyList();
  }
  
  public List<ViewManager> createViewManagers(ReactApplicationContext paramReactApplicationContext) {
    return Arrays.asList(new ViewManager[] { (ViewManager)new RNCMaskedViewManager() });
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/org/reactnative/maskedview/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */