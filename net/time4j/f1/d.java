package net.time4j.f1;

import java.util.Locale;

public enum d {
  c("fil"),
  d("nb"),
  e("id"),
  f("he");
  
  static final d[] g;
  
  private final String alias;
  
  static {
    g = values();
  }
  
  d(String paramString1) {
    this.alias = paramString1;
  }
  
  public static String a(Locale paramLocale) {
    String str = paramLocale.getLanguage();
    if (str.equals("no") && paramLocale.getVariant().equals("NY") && paramLocale.getCountry().equals("NO"))
      return "nn"; 
    for (d d1 : g) {
      if (str.equals(d1.name()))
        return d1.alias; 
    } 
    return str;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/f1/d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */