package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.e.b;

public class k implements g {
  private final int a;
  
  private final int b;
  
  public k(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public void a(b paramb) {
    paramb.b(this.a, this.b);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("SendAccessibilityEvent [");
    stringBuilder.append(this.a);
    stringBuilder.append("] ");
    stringBuilder.append(this.b);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */