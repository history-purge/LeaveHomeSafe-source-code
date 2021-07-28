package com.facebook.yoga;

import e.e.n.a.a;

@a
public enum YogaLogLevel {
  c(0),
  d(1),
  e(2),
  f(3),
  g(4),
  h(5);
  
  private final int mIntValue;
  
  YogaLogLevel(int paramInt1) {
    this.mIntValue = paramInt1;
  }
  
  @a
  public static YogaLogLevel fromInt(int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt != 3) {
            if (paramInt != 4) {
              if (paramInt == 5)
                return h; 
              StringBuilder stringBuilder = new StringBuilder();
              stringBuilder.append("Unknown enum value: ");
              stringBuilder.append(paramInt);
              throw new IllegalArgumentException(stringBuilder.toString());
            } 
            return g;
          } 
          return f;
        } 
        return e;
      } 
      return d;
    } 
    return c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/yoga/YogaLogLevel.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */