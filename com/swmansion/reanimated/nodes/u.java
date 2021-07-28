package com.swmansion.reanimated.nodes;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.swmansion.reanimated.b;

public class u extends m {
  private Object a;
  
  public u(int paramInt, ReadableMap paramReadableMap, b paramb) {
    super(paramInt, paramReadableMap, paramb);
    String str;
    b b1;
    paramb = null;
    if (paramReadableMap == null || !paramReadableMap.hasKey("value")) {
      this.a = null;
      return;
    } 
    ReadableType readableType = paramReadableMap.getType("value");
    if (readableType == ReadableType.String) {
      str = paramReadableMap.getString("value");
    } else if (readableType == ReadableType.Number) {
      Double double_ = Double.valueOf(str.getDouble("value"));
    } else if (readableType == ReadableType.Null) {
      b1 = paramb;
    } else {
      throw new IllegalStateException("Not supported value type. Must be boolean, number or string");
    } 
    this.a = b1;
  }
  
  public void a(Object paramObject) {
    this.a = paramObject;
    forceUpdateMemoizedValue(this.a);
  }
  
  protected Object evaluate() {
    return this.a;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/swmansion/reanimated/nodes/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */