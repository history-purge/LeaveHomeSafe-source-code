package com.facebook.jni;

import com.facebook.jni.annotations.DoNotStrip;

@DoNotStrip
public class CppSystemErrorException extends CppException {
  int errorCode;
  
  @DoNotStrip
  public CppSystemErrorException(String paramString, int paramInt) {
    super(paramString);
    this.errorCode = paramInt;
  }
  
  public int getErrorCode() {
    return this.errorCode;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/jni/CppSystemErrorException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */