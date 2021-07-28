package com.facebook.react.bridge.queue;

import android.os.Looper;
import com.facebook.react.common.f;
import java.util.HashMap;

public class ReactQueueConfigurationImpl implements ReactQueueConfiguration {
  private final MessageQueueThreadImpl mJSQueueThread;
  
  private final MessageQueueThreadImpl mNativeModulesQueueThread;
  
  private final MessageQueueThreadImpl mUIQueueThread;
  
  private ReactQueueConfigurationImpl(MessageQueueThreadImpl paramMessageQueueThreadImpl1, MessageQueueThreadImpl paramMessageQueueThreadImpl2, MessageQueueThreadImpl paramMessageQueueThreadImpl3) {
    this.mUIQueueThread = paramMessageQueueThreadImpl1;
    this.mNativeModulesQueueThread = paramMessageQueueThreadImpl2;
    this.mJSQueueThread = paramMessageQueueThreadImpl3;
  }
  
  public static ReactQueueConfigurationImpl create(ReactQueueConfigurationSpec paramReactQueueConfigurationSpec, QueueThreadExceptionHandler paramQueueThreadExceptionHandler) {
    HashMap<MessageQueueThreadSpec, MessageQueueThreadImpl> hashMap = f.b();
    MessageQueueThreadSpec messageQueueThreadSpec = MessageQueueThreadSpec.mainThreadSpec();
    MessageQueueThreadImpl messageQueueThreadImpl4 = MessageQueueThreadImpl.create(messageQueueThreadSpec, paramQueueThreadExceptionHandler);
    hashMap.put(messageQueueThreadSpec, messageQueueThreadImpl4);
    MessageQueueThreadImpl messageQueueThreadImpl2 = hashMap.get(paramReactQueueConfigurationSpec.getJSQueueThreadSpec());
    MessageQueueThreadImpl messageQueueThreadImpl1 = messageQueueThreadImpl2;
    if (messageQueueThreadImpl2 == null)
      messageQueueThreadImpl1 = MessageQueueThreadImpl.create(paramReactQueueConfigurationSpec.getJSQueueThreadSpec(), paramQueueThreadExceptionHandler); 
    MessageQueueThreadImpl messageQueueThreadImpl3 = hashMap.get(paramReactQueueConfigurationSpec.getNativeModulesQueueThreadSpec());
    messageQueueThreadImpl2 = messageQueueThreadImpl3;
    if (messageQueueThreadImpl3 == null)
      messageQueueThreadImpl2 = MessageQueueThreadImpl.create(paramReactQueueConfigurationSpec.getNativeModulesQueueThreadSpec(), paramQueueThreadExceptionHandler); 
    return new ReactQueueConfigurationImpl(messageQueueThreadImpl4, messageQueueThreadImpl2, messageQueueThreadImpl1);
  }
  
  public void destroy() {
    if (this.mNativeModulesQueueThread.getLooper() != Looper.getMainLooper())
      this.mNativeModulesQueueThread.quitSynchronous(); 
    if (this.mJSQueueThread.getLooper() != Looper.getMainLooper())
      this.mJSQueueThread.quitSynchronous(); 
  }
  
  public MessageQueueThread getJSQueueThread() {
    return this.mJSQueueThread;
  }
  
  public MessageQueueThread getNativeModulesQueueThread() {
    return this.mNativeModulesQueueThread;
  }
  
  public MessageQueueThread getUIQueueThread() {
    return this.mUIQueueThread;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/queue/ReactQueueConfigurationImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */