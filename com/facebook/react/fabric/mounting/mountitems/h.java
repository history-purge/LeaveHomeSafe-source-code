package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.c;
import com.facebook.react.fabric.e.b;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;
import e.e.e.e.a;

public class h implements g {
  private final String a;
  
  private final int b;
  
  private final int c;
  
  private final ReadableMap d;
  
  private final j0 e;
  
  private final k0 f;
  
  private final boolean g;
  
  public h(k0 paramk0, int paramInt1, int paramInt2, String paramString, ReadableMap paramReadableMap, j0 paramj0, boolean paramBoolean) {
    this.f = paramk0;
    this.a = paramString;
    this.b = paramInt1;
    this.d = paramReadableMap;
    this.e = paramj0;
    this.c = paramInt2;
    this.g = paramBoolean;
  }
  
  public void a(b paramb) {
    if (c.A) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("Executing pre-allocation of: ");
      stringBuilder.append(toString());
      a.a("FabricUIManager", stringBuilder.toString());
    } 
    paramb.b(this.f, this.a, this.c, this.d, this.e, this.g);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder("PreAllocateViewMountItem [");
    stringBuilder.append(this.c);
    stringBuilder.append("] - component: ");
    stringBuilder.append(this.a);
    stringBuilder.append(" rootTag: ");
    stringBuilder.append(this.b);
    stringBuilder.append(" isLayoutable: ");
    stringBuilder.append(this.g);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */