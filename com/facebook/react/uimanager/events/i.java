package com.facebook.react.uimanager.events;

public enum i {
  c, d, e, f;
  
  public static String a(i parami) {
    int j = a.a[parami.ordinal()];
    if (j != 1) {
      if (j != 2) {
        if (j != 3) {
          if (j == 4)
            return "topTouchCancel"; 
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append("Unexpected type ");
          stringBuilder.append(parami);
          throw new IllegalArgumentException(stringBuilder.toString());
        } 
        return "topTouchMove";
      } 
      return "topTouchEnd";
    } 
    return "topTouchStart";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/events/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */