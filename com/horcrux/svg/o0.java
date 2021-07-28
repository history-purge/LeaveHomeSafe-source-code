package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

enum o0 {
  c("none"),
  d("underline"),
  e("overline"),
  f("line-through"),
  g("blink");
  
  private static final Map<String, o0> h;
  
  private final String decoration;
  
  static {
    h = new HashMap<String, o0>();
    o0[] arrayOfO0 = values();
    int j = arrayOfO0.length;
    while (i < j) {
      o0 o01 = arrayOfO0[i];
      h.put(o01.decoration, o01);
      i++;
    } 
  }
  
  o0(String paramString1) {
    this.decoration = paramString1;
  }
  
  static o0 a(String paramString) {
    if (h.containsKey(paramString))
      return h.get(paramString); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown String Value: ");
    stringBuilder.append(paramString);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public String toString() {
    return this.decoration;
  }
  
  static {
    int i = 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/o0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */