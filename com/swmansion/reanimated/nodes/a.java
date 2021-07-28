package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;

public class a extends m implements j {
  private int a;
  
  public a(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = com.swmansion.reanimated.a.a(paramReadableMap, "what", "Reanimated: Argument passed to always node is either of wrong type or is missing.");
  }
  
  public void a() {
    value();
  }
  
  protected Double evaluate() {
    this.mNodesManager.a(this.a, m.class).value();
    return m.ZERO;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */