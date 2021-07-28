package com.facebook.react.uimanager.h1;

import java.util.Locale;

enum d {
  c, d, e, f, g;
  
  public static d a(String paramString) {
    byte b;
    String str = paramString.toLowerCase(Locale.US);
    switch (str.hashCode()) {
      default:
        b = -1;
        break;
      case 1164546989:
        if (str.equals("easeineaseout")) {
          b = 3;
          break;
        } 
      case -895679987:
        if (str.equals("spring")) {
          b = 4;
          break;
        } 
      case -1102672091:
        if (str.equals("linear")) {
          b = 0;
          break;
        } 
      case -1310315117:
        if (str.equals("easein")) {
          b = 1;
          break;
        } 
      case -1965056864:
        if (str.equals("easeout")) {
          b = 2;
          break;
        } 
    } 
    if (b != 0) {
      if (b != 1) {
        if (b != 2) {
          if (b != 3) {
            if (b == 4)
              return g; 
            StringBuilder stringBuilder = new StringBuilder();
            stringBuilder.append("Unsupported interpolation type : ");
            stringBuilder.append(paramString);
            throw new IllegalArgumentException(stringBuilder.toString());
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


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/uimanager/h1/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */