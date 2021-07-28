package com.facebook.react.bridge;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public interface ReadableMap {
  ReadableArray getArray(String paramString);
  
  boolean getBoolean(String paramString);
  
  double getDouble(String paramString);
  
  Dynamic getDynamic(String paramString);
  
  Iterator<Map.Entry<String, Object>> getEntryIterator();
  
  int getInt(String paramString);
  
  ReadableMap getMap(String paramString);
  
  String getString(String paramString);
  
  ReadableType getType(String paramString);
  
  boolean hasKey(String paramString);
  
  boolean isNull(String paramString);
  
  ReadableMapKeySetIterator keySetIterator();
  
  HashMap<String, Object> toHashMap();
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/bridge/ReadableMap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */