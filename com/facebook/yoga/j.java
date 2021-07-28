package com.facebook.yoga;

public enum j {
  c(0),
  d(1),
  e(2),
  f(3),
  g(4),
  h(5),
  i(6),
  j(7),
  k(8);
  
  private final int mIntValue;
  
  j(int paramInt1) {
    this.mIntValue = paramInt1;
  }
  
  public static j f(int paramInt) {
    StringBuilder stringBuilder;
    switch (paramInt) {
      default:
        stringBuilder = new StringBuilder();
        stringBuilder.append("Unknown enum value: ");
        stringBuilder.append(paramInt);
        throw new IllegalArgumentException(stringBuilder.toString());
      case 8:
        return k;
      case 7:
        return j;
      case 6:
        return i;
      case 5:
        return h;
      case 4:
        return g;
      case 3:
        return f;
      case 2:
        return e;
      case 1:
        return d;
      case 0:
        break;
    } 
    return c;
  }
  
  public int a() {
    return this.mIntValue;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/yoga/j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */