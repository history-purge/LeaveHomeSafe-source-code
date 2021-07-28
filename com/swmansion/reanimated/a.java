package com.swmansion.reanimated;

import com.facebook.react.bridge.JSApplicationCausedNativeException;
import com.facebook.react.bridge.NoSuchKeyException;
import com.facebook.react.bridge.ReadableMap;

public class a {
  public static int a(ReadableMap paramReadableMap, String paramString1, String paramString2) {
    try {
      return paramReadableMap.getInt(paramString1);
    } catch (NoSuchKeyException noSuchKeyException) {
      throw new JSApplicationCausedNativeException(paramString2);
    } 
  }
  
  public static String b(ReadableMap paramReadableMap, String paramString1, String paramString2) {
    try {
      return paramReadableMap.getString(paramString1);
    } catch (NoSuchKeyException noSuchKeyException) {
      throw new JSApplicationCausedNativeException(paramString2);
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */