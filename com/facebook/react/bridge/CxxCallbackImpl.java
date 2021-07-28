package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import e.e.n.a.a;

@a
public class CxxCallbackImpl implements Callback {
  @a
  private final HybridData mHybridData;
  
  @a
  private CxxCallbackImpl(HybridData paramHybridData) {
    this.mHybridData = paramHybridData;
  }
  
  private native void nativeInvoke(NativeArray paramNativeArray);
  
  public void invoke(Object... paramVarArgs) {
    nativeInvoke(Arguments.fromJavaArgs(paramVarArgs));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/CxxCallbackImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */