package com.swmansion.reanimated.nodes;

import android.util.Log;
import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.a;
import com.swmansion.reanimated.b;

public class i extends m {
  private final String a;
  
  private final int b;
  
  public i(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.a = a.b(paramReadableMap, "message", "Reanimated: First argument passed to debug node is either of wrong type or is missing.");
    this.b = a.a(paramReadableMap, "value", "Reanimated: Second argument passed to debug node is either of wrong type or is missing.");
  }
  
  protected Object evaluate() {
    Object object = this.mNodesManager.a(this.b, m.class).value();
    Log.d("REANIMATED", String.format("%s %s", new Object[] { this.a, object }));
    return object;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */