package com.facebook.react.bridge;

public interface WritableArray extends ReadableArray {
  void pushArray(ReadableArray paramReadableArray);
  
  void pushBoolean(boolean paramBoolean);
  
  void pushDouble(double paramDouble);
  
  void pushInt(int paramInt);
  
  void pushMap(ReadableMap paramReadableMap);
  
  void pushNull();
  
  void pushString(String paramString);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/WritableArray.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */