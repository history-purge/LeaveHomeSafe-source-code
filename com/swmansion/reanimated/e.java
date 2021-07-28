package com.swmansion.reanimated;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

public class e {
  public static Map<String, Integer> a(ReadableMap paramReadableMap) {
    ReadableMapKeySetIterator readableMapKeySetIterator = paramReadableMap.keySetIterator();
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    while (readableMapKeySetIterator.hasNextKey()) {
      String str = readableMapKeySetIterator.nextKey();
      hashMap.put(str, Integer.valueOf(paramReadableMap.getInt(str)));
    } 
    return (Map)hashMap;
  }
  
  public static int[] a(ReadableArray paramReadableArray) {
    int j = paramReadableArray.size();
    int[] arrayOfInt = new int[j];
    for (int i = 0; i < j; i++)
      arrayOfInt[i] = paramReadableArray.getInt(i); 
    return arrayOfInt;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */