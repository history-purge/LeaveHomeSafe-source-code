package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;

public class l extends m {
  private final int[] a;
  
  public l(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = e.a(paramReadableMap.getArray("input"));
  }
  
  protected Double evaluate() {
    WritableArray writableArray = Arguments.createArray();
    int i = 0;
    while (true) {
      int[] arrayOfInt = this.a;
      if (i < arrayOfInt.length) {
        m m1 = this.mNodesManager.a(arrayOfInt[i], m.class);
        if (m1.value() == null) {
          writableArray.pushNull();
        } else {
          Object object = m1.value();
          if (object instanceof String) {
            writableArray.pushString((String)object);
          } else {
            writableArray.pushDouble(m1.doubleValue().doubleValue());
          } 
        } 
        i++;
        continue;
      } 
      WritableMap writableMap = Arguments.createMap();
      writableMap.putInt("id", this.mNodeID);
      writableMap.putArray("args", (ReadableArray)writableArray);
      this.mNodesManager.a("onReanimatedCall", writableMap);
      return m.ZERO;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */