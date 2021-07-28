package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.fabric.e.b;

public class d extends c {
  private final int b;
  
  private final int c;
  
  private final ReadableArray d;
  
  public d(int paramInt1, int paramInt2, ReadableArray paramReadableArray) {
    this.b = paramInt1;
    this.c = paramInt2;
    this.d = paramReadableArray;
  }
  
  public void a(b paramb) {
    paramb.a(this.b, this.c, this.d);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DispatchIntCommandMountItem [");
    stringBuilder.append(this.b);
    stringBuilder.append("] ");
    stringBuilder.append(this.c);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */