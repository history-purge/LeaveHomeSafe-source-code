package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;

public class c extends m {
  private final int[] a;
  
  public c(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = e.a(paramReadableMap.getArray("block"));
  }
  
  protected Object evaluate() {
    Object object = null;
    int i = 0;
    while (true) {
      int[] arrayOfInt = this.a;
      if (i < arrayOfInt.length) {
        object = this.mNodesManager.a(arrayOfInt[i], m.class).value();
        i++;
        continue;
      } 
      return object;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */