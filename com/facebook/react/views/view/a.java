package com.facebook.react.views.view;

public class a {
  public static int a(int paramInt) {
    paramInt >>>= 24;
    return (paramInt == 255) ? -1 : ((paramInt == 0) ? -2 : -3);
  }
  
  public static int a(int paramInt1, int paramInt2) {
    return (paramInt2 == 255) ? paramInt1 : ((paramInt2 == 0) ? (paramInt1 & 0xFFFFFF) : (paramInt1 & 0xFFFFFF | (paramInt1 >>> 24) * (paramInt2 + (paramInt2 >> 7)) >> 8 << 24));
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/view/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */