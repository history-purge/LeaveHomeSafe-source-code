package com.facebook.react.uimanager;

public class d {
  public static boolean a(float paramFloat1, float paramFloat2) {
    return (Float.isNaN(paramFloat1) || Float.isNaN(paramFloat2)) ? ((Float.isNaN(paramFloat1) && Float.isNaN(paramFloat2))) : ((Math.abs(paramFloat2 - paramFloat1) < 1.0E-5F));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */