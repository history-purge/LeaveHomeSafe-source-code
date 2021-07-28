package com.facebook.react.views.text;

import java.text.BreakIterator;

public enum c0 {
  c, d, e, f, g;
  
  private static String a(String paramString) {
    BreakIterator breakIterator = BreakIterator.getWordInstance();
    breakIterator.setText(paramString);
    StringBuilder stringBuilder = new StringBuilder(paramString.length());
    int i = breakIterator.first();
    while (true) {
      int j = breakIterator.next();
      if (j != -1) {
        String str2 = paramString.substring(i, j);
        String str1 = str2;
        if (Character.isLetterOrDigit(str2.charAt(0))) {
          stringBuilder.append(Character.toUpperCase(str2.charAt(0)));
          str1 = str2.substring(1).toLowerCase();
        } 
        stringBuilder.append(str1);
        i = j;
        continue;
      } 
      return stringBuilder.toString();
    } 
  }
  
  public static String a(String paramString, c0 paramc0) {
    if (paramString == null)
      return null; 
    int i = a.a[paramc0.ordinal()];
    return (i != 1) ? ((i != 2) ? ((i != 3) ? paramString : a(paramString)) : paramString.toLowerCase()) : paramString.toUpperCase();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/react/views/text/c0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */