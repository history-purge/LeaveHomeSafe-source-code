package com.facebook.react.bridge.queue;

import e.e.n.a.a;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@a
public interface MessageQueueThread {
  @a
  void assertIsOnThread();
  
  @a
  void assertIsOnThread(String paramString);
  
  @a
  <T> Future<T> callOnQueue(Callable<T> paramCallable);
  
  @a
  MessageQueueThreadPerfStats getPerfStats();
  
  @a
  boolean isOnThread();
  
  @a
  void quitSynchronous();
  
  @a
  void resetPerfStats();
  
  @a
  void runOnQueue(Runnable paramRunnable);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/queue/MessageQueueThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */