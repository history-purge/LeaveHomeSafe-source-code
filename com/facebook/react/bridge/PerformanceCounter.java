package com.facebook.react.bridge;

import java.util.Map;

public interface PerformanceCounter {
  Map<String, Long> getPerformanceCounters();
  
  void profileNextBatch();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/PerformanceCounter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */