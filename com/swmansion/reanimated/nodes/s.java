package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;
import java.util.Map;

public class s extends m {
  private final Map<String, Integer> a;
  
  public s(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = e.a(paramReadableMap.getMap("style"));
  }
  
  protected WritableMap evaluate() {
    JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
    for (Map.Entry<String, Integer> entry : this.a.entrySet()) {
      m m1 = this.mNodesManager.a(((Integer)entry.getValue()).intValue(), m.class);
      if (m1 instanceof t) {
        javaOnlyMap.putArray((String)entry.getKey(), (ReadableArray)m1.value());
        continue;
      } 
      Object object = m1.value();
      if (object instanceof Double) {
        javaOnlyMap.putDouble((String)entry.getKey(), ((Double)object).doubleValue());
        continue;
      } 
      if (object instanceof String) {
        javaOnlyMap.putString((String)entry.getKey(), (String)object);
        continue;
      } 
      throw new IllegalStateException("Wrong style form");
    } 
    return (WritableMap)javaOnlyMap;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */