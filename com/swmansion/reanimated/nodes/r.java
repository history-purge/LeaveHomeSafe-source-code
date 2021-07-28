package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.a;
import com.swmansion.reanimated.b;

public class r extends m {
  private int a;
  
  private int b;
  
  public r(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = a.a(paramReadableMap, "what", "Reanimated: First argument passed to set node is either of wrong type or is missing.");
    this.b = a.a(paramReadableMap, "value", "Reanimated: Second argument passed to set node is either of wrong type or is missing.");
  }
  
  protected Object evaluate() {
    Object object = this.mNodesManager.b(this.b);
    ((u)this.mNodesManager.a(this.a, u.class)).a(object);
    return object;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */