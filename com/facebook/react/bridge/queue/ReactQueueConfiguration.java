package com.facebook.react.bridge.queue;

public interface ReactQueueConfiguration {
  void destroy();
  
  MessageQueueThread getJSQueueThread();
  
  MessageQueueThread getNativeModulesQueueThread();
  
  MessageQueueThread getUIQueueThread();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/queue/ReactQueueConfiguration.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */