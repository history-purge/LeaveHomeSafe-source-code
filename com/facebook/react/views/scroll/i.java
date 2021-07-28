package com.facebook.react.views.scroll;

public enum i {
  c, d, e, f, g;
  
  public static String a(i parami) {
    int j = a.a[parami.ordinal()];
    if (j != 1) {
      if (j != 2) {
        if (j != 3) {
          if (j != 4) {
            if (j == 5)
              return "topMomentumScrollEnd"; 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported ScrollEventType: ");
            stringBuilder.append(parami);
            throw new IllegalArgumentException(stringBuilder.toString());
          } 
          return "topMomentumScrollBegin";
        } 
        return "topScroll";
      } 
      return "topScrollEndDrag";
    } 
    return "topScrollBeginDrag";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/scroll/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */