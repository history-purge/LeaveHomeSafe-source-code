package com.facebook.react.bridge;

public interface WritableMap extends ReadableMap {
  WritableMap copy();
  
  void merge(ReadableMap paramReadableMap);
  
  void putArray(String paramString, ReadableArray paramReadableArray);
  
  void putBoolean(String paramString, boolean paramBoolean);
  
  void putDouble(String paramString, double paramDouble);
  
  void putInt(String paramString, int paramInt);
  
  void putMap(String paramString, ReadableMap paramReadableMap);
  
  void putNull(String paramString);
  
  void putString(String paramString1, String paramString2);
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/WritableMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */