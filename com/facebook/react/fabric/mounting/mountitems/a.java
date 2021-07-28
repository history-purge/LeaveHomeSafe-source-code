package com.facebook.react.fabric.mounting.mountitems;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.fabric.e.b;
import com.facebook.react.uimanager.j0;
import com.facebook.react.uimanager.k0;

public class a implements g {
  private final String a;
  
  private final int b;
  
  private final int c;
  
  private final k0 d;
  
  private final ReadableMap e;
  
  private final j0 f;
  
  private final boolean g;
  
  public a(k0 paramk0, int paramInt1, int paramInt2, String paramString, ReadableMap paramReadableMap, j0 paramj0, boolean paramBoolean) {
    this.d = paramk0;
    this.a = paramString;
    this.b = paramInt1;
    this.c = paramInt2;
    this.e = paramReadableMap;
    this.f = paramj0;
    this.g = paramBoolean;
  }
  
  public void a(b paramb) {
    paramb.a(this.d, this.a, this.c, this.e, this.f, this.g);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("CreateMountItem [");
    stringBuilder.append(this.c);
    stringBuilder.append("] - component: ");
    stringBuilder.append(this.a);
    stringBuilder.append(" - rootTag: ");
    stringBuilder.append(this.b);
    stringBuilder.append(" - isLayoutable: ");
    stringBuilder.append(this.g);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */