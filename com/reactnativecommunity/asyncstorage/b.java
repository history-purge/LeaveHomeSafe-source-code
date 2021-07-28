package com.reactnativecommunity.asyncstorage;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;

public class b {
  static WritableMap a(String paramString) {
    return a(paramString, "Database Error");
  }
  
  static WritableMap a(String paramString1, String paramString2) {
    WritableMap writableMap = Arguments.createMap();
    writableMap.putString("message", paramString2);
    if (paramString1 != null)
      writableMap.putString("key", paramString1); 
    return writableMap;
  }
  
  static WritableMap b(String paramString) {
    return a(paramString, "Invalid key");
  }
  
  static WritableMap c(String paramString) {
    return a(paramString, "Invalid Value");
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/reactnativecommunity/asyncstorage/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */