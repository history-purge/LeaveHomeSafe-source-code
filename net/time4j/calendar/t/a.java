package net.time4j.calendar.t;

import java.util.Locale;
import net.time4j.d1.y;
import net.time4j.e1.b;
import net.time4j.e1.e;
import net.time4j.f1.e;

public final class a {
  public static String a(String paramString, y paramy, Locale paramLocale) {
    e e = e.f(paramy.a());
    if (paramString.equals("iso8601"))
      return b.a(e, paramLocale); 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("F(");
    stringBuilder.append(Character.toLowerCase(e.name().charAt(0)));
    stringBuilder.append(')');
    String str = stringBuilder.toString();
    e e2 = b.a(paramString, paramLocale);
    e e1 = e2;
    if (!e2.a(str))
      e1 = b.a("generic", paramLocale); 
    return e1.b(str);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/t/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */