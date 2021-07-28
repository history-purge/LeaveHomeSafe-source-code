package com.facebook.react.uimanager.h1;

enum g {
  c, d, e;
  
  public static String a(g paramg) {
    int i = a.a[paramg.ordinal()];
    if (i != 1) {
      if (i != 2) {
        if (i == 3)
          return "delete"; 
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Unsupported LayoutAnimationType: ");
        stringBuilder.append(paramg);
        throw new IllegalArgumentException(stringBuilder.toString());
      } 
      return "update";
    } 
    return "create";
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h1/g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */