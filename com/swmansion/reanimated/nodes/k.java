package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;

public class k extends m {
  private final int a;
  
  public k(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = paramReadableMap.getInt("what");
  }
  
  protected Object evaluate() {
    return this.mNodesManager.a(this.a, m.class).value();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */