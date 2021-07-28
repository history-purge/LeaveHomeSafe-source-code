package com.facebook.react.bridge;

public interface UIManager extends JSIModule, PerformanceCounter {
  <T extends android.view.View> int addRootView(T paramT, WritableMap paramWritableMap, String paramString);
  
  void dispatchCommand(int paramInt1, int paramInt2, ReadableArray paramReadableArray);
  
  void dispatchCommand(int paramInt, String paramString, ReadableArray paramReadableArray);
  
  <T> T getEventDispatcher();
  
  void sendAccessibilityEvent(int paramInt1, int paramInt2);
  
  void synchronouslyUpdateViewOnUIThread(int paramInt, ReadableMap paramReadableMap);
  
  void updateRootLayoutSpecs(int paramInt1, int paramInt2, int paramInt3);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/UIManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */