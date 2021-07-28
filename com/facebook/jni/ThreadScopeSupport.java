package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.soloader.o.a;

@DoNotStrip
public class ThreadScopeSupport {
  static {
    a.a("fbjni");
  }
  
  @DoNotStrip
  private static void runStdFunction(long paramLong) {
    runStdFunctionImpl(paramLong);
  }
  
  private static native void runStdFunctionImpl(long paramLong);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/jni/ThreadScopeSupport.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */