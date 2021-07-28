package com.facebook.react.animated;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.ReadableMap;

abstract class d {
  boolean a = false;
  
  s b;
  
  Callback c;
  
  int d;
  
  public abstract void a(long paramLong);
  
  public void a(ReadableMap paramReadableMap) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Animation config for ");
    stringBuilder.append(getClass().getSimpleName());
    stringBuilder.append(" cannot be reset");
    throw new JSApplicationCausedNativeException(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */