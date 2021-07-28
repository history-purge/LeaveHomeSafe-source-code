package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.fabric.e.b;

public class e extends c {
  private final int b;
  
  private final String c;
  
  private final ReadableArray d;
  
  public e(int paramInt, String paramString, ReadableArray paramReadableArray) {
    this.b = paramInt;
    this.c = paramString;
    this.d = paramReadableArray;
  }
  
  public void a(b paramb) {
    paramb.a(this.b, this.c, this.d);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("DispatchStringCommandMountItem [");
    stringBuilder.append(this.b);
    stringBuilder.append("] ");
    stringBuilder.append(this.c);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */