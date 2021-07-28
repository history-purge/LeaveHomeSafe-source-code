package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.swmansion.reanimated.b;
import com.swmansion.reanimated.e;

public class d extends m {
  private String a;
  
  private final int b;
  
  private final int[] c;
  
  private final int[] d;
  
  public d(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    this.b = paramReadableMap.getInt("what");
    this.d = e.a(paramReadableMap.getArray("params"));
    this.c = e.a(paramReadableMap.getArray("args"));
  }
  
  private void c() {
    com.swmansion.reanimated.d d1 = this.mNodesManager.p;
    this.a = d1.b;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.mNodesManager.p.b);
    stringBuilder.append('/');
    stringBuilder.append(String.valueOf(this.mNodeID));
    d1.b = stringBuilder.toString();
    int i = 0;
    while (true) {
      int[] arrayOfInt = this.d;
      if (i < arrayOfInt.length) {
        int j = arrayOfInt[i];
        ((p)this.mNodesManager.a(j, p.class)).a(Integer.valueOf(this.c[i]), this.a);
        i++;
        continue;
      } 
      break;
    } 
  }
  
  private void d() {
    int i = 0;
    while (true) {
      int[] arrayOfInt = this.d;
      if (i < arrayOfInt.length) {
        int j = arrayOfInt[i];
        ((p)this.mNodesManager.a(j, p.class)).c();
        i++;
        continue;
      } 
      this.mNodesManager.p.b = this.a;
      return;
    } 
  }
  
  protected Object evaluate() {
    c();
    Object object = this.mNodesManager.a(this.b, m.class).value();
    d();
    return object;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */