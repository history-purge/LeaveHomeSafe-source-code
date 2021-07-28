package net.time4j.calendar;

import java.io.Serializable;
import java.io.StreamCorruptedException;
import java.util.Locale;
import java.util.Map;
import net.time4j.d1.c;
import net.time4j.d1.d;
import net.time4j.e1.a;
import net.time4j.e1.b;
import net.time4j.e1.j;

public final class h implements Comparable<h>, Serializable {
  public static final c<Character> c = a.a("LEAP_MONTH_INDICATOR", Character.class);
  
  public static final c<Boolean> d = a.a("LEAP_MONTH_IS_TRAILING", Boolean.class);
  
  private static final h[] e;
  
  private static final long serialVersionUID = 7544059597266533279L;
  
  private final int index;
  
  private final boolean leap;
  
  static {
    h[] arrayOfH = new h[24];
    for (int i = 0; i < 12; i++) {
      arrayOfH[i] = new h(i, false);
      arrayOfH[i + 12] = new h(i, true);
    } 
    e = arrayOfH;
  }
  
  private h(int paramInt, boolean paramBoolean) {
    this.index = paramInt;
    this.leap = paramBoolean;
  }
  
  static String a(j paramj, char paramChar, int paramInt) {
    String str;
    if (paramj.b()) {
      int i = paramChar - 48;
      str = Integer.toString(paramInt);
      if (i == 0)
        return str; 
      StringBuilder stringBuilder = new StringBuilder();
      paramChar = Character.MIN_VALUE;
      paramInt = str.length();
      while (paramChar < paramInt) {
        stringBuilder.append((char)(str.charAt(paramChar) + i));
        int k = paramChar + 1;
      } 
      return stringBuilder.toString();
    } 
    return str.f(paramInt);
  }
  
  public static h f(int paramInt) {
    if (paramInt >= 1 && paramInt <= 12)
      return e[paramInt - 1]; 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Out of range: ");
    stringBuilder.append(paramInt);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  private Object readResolve() {
    int i;
    try {
      h[] arrayOfH = e;
      i = this.index;
      if (this.leap) {
        byte b1 = 12;
        return arrayOfH[i + b1];
      } 
    } catch (ArrayIndexOutOfBoundsException null) {
      throw new StreamCorruptedException();
    } 
    byte b = 0;
    return null[i + b];
  }
  
  public int a() {
    return this.index + 1;
  }
  
  public int a(h paramh) {
    int i = this.index;
    int j = paramh.index;
    if (i < j)
      return -1; 
    if (i > j)
      return 1; 
    boolean bool1 = this.leap;
    boolean bool2 = paramh.leap;
    return bool1 ? (bool2 ^ true) : (bool2 ? -1 : 0);
  }
  
  String a(Locale paramLocale, j paramj, d paramd) {
    Map map = b.a("generic", paramLocale).a();
    String str2 = a(paramj, ((Character)paramd.a(a.m, Character.valueOf(paramj.a().charAt(0)))).charValue(), a());
    String str1 = str2;
    if (this.leap) {
      StringBuilder stringBuilder;
      boolean bool = ((Boolean)paramd.a(d, Boolean.valueOf("R".equals(map.get("leap-alignment"))))).booleanValue();
      char c1 = ((Character)paramd.a(c, Character.valueOf(((String)map.get("leap-indicator")).charAt(0)))).charValue();
      if (bool) {
        stringBuilder = new StringBuilder();
        stringBuilder.append(str2);
        stringBuilder.append(c1);
      } else {
        stringBuilder = new StringBuilder();
        stringBuilder.append(c1);
        stringBuilder.append(str2);
      } 
      str1 = stringBuilder.toString();
    } 
    return str1;
  }
  
  public boolean b() {
    return this.leap;
  }
  
  public h c() {
    return e[this.index + 12];
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject instanceof h) {
      paramObject = paramObject;
      return (this.index == ((h)paramObject).index && this.leap == ((h)paramObject).leap);
    } 
    return false;
  }
  
  public int hashCode() {
    byte b;
    int i = this.index;
    if (this.leap) {
      b = 12;
    } else {
      b = 0;
    } 
    return i + b;
  }
  
  public String toString() {
    String str2 = String.valueOf(this.index + 1);
    String str1 = str2;
    if (this.leap) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append("*");
      stringBuilder.append(str2);
      str1 = stringBuilder.toString();
    } 
    return str1;
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/calendar/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */