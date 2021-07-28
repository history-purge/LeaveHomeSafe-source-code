package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;

@DoNotStrip
public class UnknownCppException extends CppException {
  @DoNotStrip
  public UnknownCppException() {
    super("Unknown");
  }
  
  @DoNotStrip
  public UnknownCppException(String paramString) {
    super(paramString);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/jni/UnknownCppException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */