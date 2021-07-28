package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableMap;

class q extends b {
  private final l e;
  
  private final int f;
  
  private final int g;
  
  private final int h;
  
  private final JavaOnlyMap i;
  
  q(ReadableMap paramReadableMap, l paraml) {
    this.e = paraml;
    this.f = paramReadableMap.getInt("animationId");
    this.g = paramReadableMap.getInt("toValue");
    this.h = paramReadableMap.getInt("value");
    this.i = JavaOnlyMap.deepClone(paramReadableMap.getMap("animationConfig"));
  }
  
  public void a() {
    b b1 = this.e.d(this.g);
    this.i.putDouble("toValue", ((s)b1).e());
    this.e.a(this.f, this.h, (ReadableMap)this.i, null);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/animated/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */