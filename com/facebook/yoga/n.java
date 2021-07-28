package com.facebook.yoga;

public enum n {
  c(0),
  d(1),
  e(2);
  
  private final int mIntValue;
  
  n(int paramInt1) {
    this.mIntValue = paramInt1;
  }
  
  public static n f(int paramInt) {
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
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/yoga/n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */