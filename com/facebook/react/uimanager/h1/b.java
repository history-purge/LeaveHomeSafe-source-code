package com.facebook.react.uimanager.h1;

enum b {
  c, d, e, f;
  
  public static b a(String paramString) {
    byte b1;
    switch (paramString.hashCode()) {
      default:
        b1 = -1;
        break;
      case 1910893003:
        if (paramString.equals("scaleXY")) {
          b1 = 3;
          break;
        } 
      case -908189617:
        if (paramString.equals("scaleY")) {
          b1 = 2;
          break;
        } 
      case -908189618:
        if (paramString.equals("scaleX")) {
          b1 = 1;
          break;
        } 
      case -1267206133:
        if (paramString.equals("opacity")) {
          b1 = 0;
          break;
        } 
    } 
    if (b1 != 0) {
      if (b1 != 1) {
        if (b1 != 2) {
          if (b1 == 3)
            return f; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unsupported animated property: ");
          stringBuilder.append(paramString);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        return e;
      } 
      return d;
    } 
    return c;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h1/b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */