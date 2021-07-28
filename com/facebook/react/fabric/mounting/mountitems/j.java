package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.e.b;

public class j implements g {
  private int a;
  
  private int b;
  
  private int c;
  
  public j(int paramInt1, int paramInt2, int paramInt3) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
  }
  
  public void a(b paramb) {
    paramb.a(this.b, this.c);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("RemoveMountItem [");
    stringBuilder.append(this.a);
    stringBuilder.append("] - parentTag: ");
    stringBuilder.append(this.b);
    stringBuilder.append(" - index: ");
    stringBuilder.append(this.c);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */