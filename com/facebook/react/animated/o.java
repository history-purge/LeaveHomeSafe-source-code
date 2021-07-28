package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import java.util.HashMap;
import java.util.Map;

class o extends b {
  private final l e;
  
  private final Map<String, Integer> f;
  
  o(ReadableMap paramReadableMap, l paraml) {
    paramReadableMap = paramReadableMap.getMap("style");
    ReadableMapKeySetIterator readableMapKeySetIterator = paramReadableMap.keySetIterator();
    this.f = new HashMap<String, Integer>();
    while (readableMapKeySetIterator.hasNextKey()) {
      String str = readableMapKeySetIterator.nextKey();
      int i = paramReadableMap.getInt(str);
      this.f.put(str, Integer.valueOf(i));
    } 
    this.e = paraml;
  }
  
  public void a(JavaOnlyMap paramJavaOnlyMap) {
    for (Map.Entry<String, Integer> entry : this.f.entrySet()) {
      b b1 = this.e.d(((Integer)entry.getValue()).intValue());
      if (b1 != null) {
        if (b1 instanceof r) {
          ((r)b1).a(paramJavaOnlyMap);
          continue;
        } 
        if (b1 instanceof s) {
          paramJavaOnlyMap.putDouble((String)entry.getKey(), ((s)b1).e());
          continue;
        } 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported type of node used in property node ");
        stringBuilder.append(b1.getClass());
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      throw new IllegalArgumentException("Mapped style node does not exists");
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */