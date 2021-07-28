package com.facebook.react.uimanager;

import com.facebook.react.common.a;
import com.facebook.yoga.p;

public class d1 {
  private static final Object a = new Object();
  
  private static a<p> b;
  
  public static a<p> a() {
    a<p> a1 = b;
    if (a1 != null)
      return a1; 
    synchronized (a) {
      if (b == null)
        b = new a(1024); 
      return b;
    } 
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/d1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */