package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

enum j0 {
  c("baseline"),
  d("text-bottom"),
  e("alphabetic"),
  f("ideographic"),
  g("middle"),
  h("central"),
  i("mathematical"),
  j("text-top"),
  k("bottom"),
  l("center"),
  m("top"),
  n("text-before-edge"),
  o("text-after-edge"),
  p("before-edge"),
  q("after-edge"),
  r("hanging");
  
  private static final Map<String, j0> s;
  
  private final String alignment;
  
  static {
    s = new HashMap<String, j0>();
    j0[] arrayOfJ0 = values();
    int j = arrayOfJ0.length;
    while (i < j) {
      j0 j01 = arrayOfJ0[i];
      s.put(j01.alignment, j01);
      i++;
    } 
  }
  
  j0(String paramString1) {
    this.alignment = paramString1;
  }
  
  static j0 a(String paramString) {
    if (s.containsKey(paramString))
      return s.get(paramString); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Unknown String Value: ");
    stringBuilder.append(paramString);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public String toString() {
    return this.alignment;
  }
  
  static {
    int i = 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/j0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */