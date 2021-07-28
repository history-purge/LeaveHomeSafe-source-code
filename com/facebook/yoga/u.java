package com.facebook.yoga;

public enum u {
  c(0),
  d(1),
  e(2),
  f(3);
  
  private final int mIntValue;
  
  u(int paramInt1) {
    this.mIntValue = paramInt1;
  }
  
  public static u f(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt == 3)
            return f; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unknown enum value: ");
          stringBuilder.append(paramInt);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        return e;
      } 
      return d;
    } 
    return c;
  }
  
  public int a() {
    return this.mIntValue;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/yoga/u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */