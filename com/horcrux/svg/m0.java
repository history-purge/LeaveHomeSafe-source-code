package com.horcrux.svg;

import java.util.HashMap;
import java.util.Map;

enum m0 {
  c("normal"),
  d("bold"),
  e("100"),
  f("200"),
  g("300"),
  h("400"),
  i("500"),
  j("600"),
  k("700"),
  l("800"),
  m("900"),
  n("bolder"),
  o("lighter");
  
  private static final Map<String, m0> p;
  
  private final String weight;
  
  static {
    p = new HashMap<String, m0>();
    m0[] arrayOfM0 = values();
    int j = arrayOfM0.length;
    while (i < j) {
      m0 m01 = arrayOfM0[i];
      p.put(m01.weight, m01);
      i++;
    } 
  }
  
  m0(String paramString1) {
    this.weight = paramString1;
  }
  
  static m0 a(String paramString) {
    return p.get(paramString);
  }
  
  static boolean b(String paramString) {
    return p.containsKey(paramString);
  }
  
  public String toString() {
    return this.weight;
  }
  
  static {
    int i = 0;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/horcrux/svg/m0.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */