package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.e.b;
import com.facebook.react.uimanager.j0;

public class q implements g {
  private final int a;
  
  private final j0 b;
  
  public q(int paramInt, j0 paramj0) {
    this.a = paramInt;
    this.b = paramj0;
  }
  
  public void a(b paramb) {
    paramb.a(this.a, this.b);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("UpdateStateMountItem [");
    stringBuilder.append(this.a);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */