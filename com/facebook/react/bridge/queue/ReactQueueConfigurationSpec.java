package com.facebook.react.bridge.queue;

import android.os.Build;
import e.e.m.a.a;

public class ReactQueueConfigurationSpec {
  private static final long LEGACY_STACK_SIZE_BYTES = 2000000L;
  
  private final MessageQueueThreadSpec mJSQueueThreadSpec;
  
  private final MessageQueueThreadSpec mNativeModulesQueueThreadSpec;
  
  private ReactQueueConfigurationSpec(MessageQueueThreadSpec paramMessageQueueThreadSpec1, MessageQueueThreadSpec paramMessageQueueThreadSpec2) {
    this.mNativeModulesQueueThreadSpec = paramMessageQueueThreadSpec1;
    this.mJSQueueThreadSpec = paramMessageQueueThreadSpec2;
  }
  
  public static Builder builder() {
    return new Builder();
  }
  
  public static ReactQueueConfigurationSpec createDefault() {
    MessageQueueThreadSpec messageQueueThreadSpec;
    if (Build.VERSION.SDK_INT < 21) {
      messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules", 2000000L);
    } else {
      messageQueueThreadSpec = MessageQueueThreadSpec.newBackgroundThreadSpec("native_modules");
    } 
    return builder().setJSQueueThreadSpec(MessageQueueThreadSpec.newBackgroundThreadSpec("js")).setNativeModulesQueueThreadSpec(messageQueueThreadSpec).build();
  }
  
  public MessageQueueThreadSpec getJSQueueThreadSpec() {
    return this.mJSQueueThreadSpec;
  }
  
  public MessageQueueThreadSpec getNativeModulesQueueThreadSpec() {
    return this.mNativeModulesQueueThreadSpec;
  }
  
  public static class Builder {
    private MessageQueueThreadSpec mJSQueueSpec;
    
    private MessageQueueThreadSpec mNativeModulesQueueSpec;
    
    public ReactQueueConfigurationSpec build() {
      MessageQueueThreadSpec messageQueueThreadSpec1 = this.mNativeModulesQueueSpec;
      a.a(messageQueueThreadSpec1);
      messageQueueThreadSpec1 = messageQueueThreadSpec1;
      MessageQueueThreadSpec messageQueueThreadSpec2 = this.mJSQueueSpec;
      a.a(messageQueueThreadSpec2);
      return new ReactQueueConfigurationSpec(messageQueueThreadSpec1, messageQueueThreadSpec2);
    }
    
    public Builder setJSQueueThreadSpec(MessageQueueThreadSpec param1MessageQueueThreadSpec) {
      boolean bool;
      if (this.mJSQueueSpec == null) {
        bool = true;
      } else {
        bool = false;
      } 
      a.a(bool, "Setting JS queue multiple times!");
      this.mJSQueueSpec = param1MessageQueueThreadSpec;
      return this;
    }
    
    public Builder setNativeModulesQueueThreadSpec(MessageQueueThreadSpec param1MessageQueueThreadSpec) {
      boolean bool;
      if (this.mNativeModulesQueueSpec == null) {
        bool = true;
      } else {
        bool = false;
      } 
      a.a(bool, "Setting native modules queue spec multiple times!");
      this.mNativeModulesQueueSpec = param1MessageQueueThreadSpec;
      return this;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/queue/ReactQueueConfigurationSpec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */