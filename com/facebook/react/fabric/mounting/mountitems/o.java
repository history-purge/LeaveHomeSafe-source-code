package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.fabric.e.b;

public class o implements g {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private final int e;
  
  public o(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
  }
  
  public void a(b paramb) {
    paramb.b(this.a, this.b, this.c, this.d, this.e);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("UpdatePaddingMountItem [");
    stringBuilder.append(this.a);
    stringBuilder.append("] - left: ");
    stringBuilder.append(this.b);
    stringBuilder.append(" - top: ");
    stringBuilder.append(this.c);
    stringBuilder.append(" - right: ");
    stringBuilder.append(this.d);
    stringBuilder.append(" - bottom: ");
    stringBuilder.append(this.e);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */