package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;

public class e extends m implements b.d {
  public boolean a;
  
  public e(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
  }
  
  public void b() {
    if (this.a) {
      markUpdated();
      this.mNodesManager.a(this);
    } 
  }
  
  public void c() {
    if (this.a)
      return; 
    this.a = true;
    this.mNodesManager.a(this);
  }
  
  public void d() {
    this.a = false;
  }
  
  protected Double evaluate() {
    return Double.valueOf(this.mNodesManager.o);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */