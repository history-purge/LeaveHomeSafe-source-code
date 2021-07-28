package com.facebook.react.bridge;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface ReactMethod {
  boolean isBlockingSynchronousMethod() default false;
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ReactMethod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */