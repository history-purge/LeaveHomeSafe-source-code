package com.facebook.react.bridge;

public interface NotThreadSafeBridgeIdleDebugListener {
  void onBridgeDestroyed();
  
  void onTransitionToBridgeBusy();
  
  void onTransitionToBridgeIdle();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/NotThreadSafeBridgeIdleDebugListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */