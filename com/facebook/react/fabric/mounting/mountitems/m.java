package com.facebook.react.fabric.mounting.mountitems;

import android.annotation.TargetApi;
import com.facebook.react.fabric.e.b;

public class m implements g {
  private final int a;
  
  private final int b;
  
  private final int c;
  
  private final int d;
  
  private final int e;
  
  private final int f;
  
  public m(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6) {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.e = paramInt5;
    this.f = a(paramInt6);
  }
  
  @TargetApi(19)
  private static int a(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt == 2)
          return 1; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported layout direction: ");
        stringBuilder.append(paramInt);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      return 0;
    } 
    return 2;
  }
  
  public void a(b paramb) {
    paramb.a(this.a, this.b, this.c, this.d, this.e);
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("UpdateLayoutMountItem [");
    stringBuilder.append(this.a);
    stringBuilder.append("] - x: ");
    stringBuilder.append(this.b);
    stringBuilder.append(" - y: ");
    stringBuilder.append(this.c);
    stringBuilder.append(" - height: ");
    stringBuilder.append(this.e);
    stringBuilder.append(" - width: ");
    stringBuilder.append(this.d);
    stringBuilder.append(" - layoutDirection: ");
    stringBuilder.append(this.f);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/fabric/mounting/mountitems/m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */