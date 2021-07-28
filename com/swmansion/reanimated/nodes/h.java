package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.a;
import com.swmansion.reanimated.b;

public class h extends m {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  public h(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = a.a(paramReadableMap, "cond", "Reanimated: First argument passed to cond node is either of wrong type or is missing.");
    this.b = a.a(paramReadableMap, "ifBlock", "Reanimated: Second argument passed to cond node is either of wrong type or is missing.");
    if (paramReadableMap.hasKey("elseBlock")) {
      paramInt = a.a(paramReadableMap, "elseBlock", "Reanimated: Second argument passed to cond node is either of wrong type or is missing.");
    } else {
      paramInt = -1;
    } 
    this.c = paramInt;
  }
  
  protected Object evaluate() {
    Object object = this.mNodesManager.b(this.a);
    if (object instanceof Number && ((Number)object).doubleValue() != 0.0D) {
      int j = this.b;
      return (j != -1) ? this.mNodesManager.b(j) : m.ZERO;
    } 
    int i = this.c;
    return (i != -1) ? this.mNodesManager.b(i) : m.ZERO;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */