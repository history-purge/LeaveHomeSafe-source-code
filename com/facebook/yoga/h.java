package com.facebook.yoga;

public enum h {
  c(0),
  d(1),
  e(2);
  
  private final int mIntValue;
  
  h(int paramInt1) {
    this.mIntValue = paramInt1;
  }
  
  public static h f(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt == 2)
          return e; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown enum value: ");
        stringBuilder.append(paramInt);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      return d;
    } 
    return c;
  }
  
  public int a() {
    return this.mIntValue;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/yoga/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */