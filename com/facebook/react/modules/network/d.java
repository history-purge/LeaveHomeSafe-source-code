package com.facebook.react.modules.network;

public class d {
  public static String a(String paramString) {
    StringBuilder stringBuilder = new StringBuilder(paramString.length());
    int j = paramString.length();
    int i = 0;
    boolean bool = false;
    while (i < j) {
      char c = paramString.charAt(i);
      if (c > ' ' && c < '') {
        stringBuilder.append(c);
      } else {
        bool = true;
      } 
      i++;
    } 
    if (bool)
      paramString = stringBuilder.toString(); 
    return paramString;
  }
  
  public static String b(String paramString) {
    StringBuilder stringBuilder = new StringBuilder(paramString.length());
    int j = paramString.length();
    int i = 0;
    boolean bool = false;
    while (i < j) {
      char c = paramString.charAt(i);
      if ((c > '\037' && c < '') || c == '\t') {
        stringBuilder.append(c);
      } else {
        bool = true;
      } 
      i++;
    } 
    if (bool)
      paramString = stringBuilder.toString(); 
    return paramString;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/modules/network/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */