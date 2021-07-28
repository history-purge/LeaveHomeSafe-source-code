package net.time4j;

import java.util.Locale;
import net.time4j.c1.g;
import net.time4j.d1.n;
import net.time4j.e1.b;
import net.time4j.e1.m;
import net.time4j.e1.w;

public enum z implements n<g> {
  c, d;
  
  public static z f(int paramInt) {
    if (paramInt >= 0 && paramInt <= 24)
      return (paramInt < 12 || paramInt == 24) ? c : d; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Hour of day out of range: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public String a(Locale paramLocale) {
    return a(paramLocale, w.c, m.c);
  }
  
  public String a(Locale paramLocale, w paramw, m paramm) {
    return b.a(paramLocale).b(paramw, paramm).a(this);
  }
  
  public boolean a(g paramg) {
    int i = paramg.getHour();
    z z1 = c;
    null = true;
    if (this == z1) {
      if (i >= 12) {
        if (i == 24)
          return true; 
      } else {
        return null;
      } 
    } else if (i >= 12 && i < 24) {
      return true;
    } 
    return false;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */