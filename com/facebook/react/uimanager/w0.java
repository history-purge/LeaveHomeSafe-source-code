package com.facebook.react.uimanager;

import java.util.Comparator;

public class w0 {
  public static Comparator<w0> c = new a();
  
  public final int a;
  
  public final int b;
  
  public w0(int paramInt1, int paramInt2) {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public boolean equals(Object paramObject) {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (paramObject != null) {
      if (paramObject.getClass() != w0.class)
        return false; 
      paramObject = paramObject;
      bool1 = bool2;
      if (this.b == ((w0)paramObject).b) {
        bool1 = bool2;
        if (this.a == ((w0)paramObject).a)
          bool1 = true; 
      } 
    } 
    return bool1;
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("[");
    stringBuilder.append(this.a);
    stringBuilder.append(", ");
    stringBuilder.append(this.b);
    stringBuilder.append("]");
    return stringBuilder.toString();
  }
  
  static final class a implements Comparator<w0> {
    public int a(w0 param1w01, w0 param1w02) {
      return param1w01.b - param1w02.b;
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/w0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */