package net.time4j.f1;

import java.util.Iterator;
import java.util.Locale;
import java.util.MissingResourceException;
import net.time4j.e1.n;
import net.time4j.e1.r;
import net.time4j.e1.w;
import net.time4j.w0;

public final class h implements r {
  private static String a(char paramChar, w paramw, n paramn) {
    StringBuilder stringBuilder = new StringBuilder(3);
    stringBuilder.append(paramChar);
    int i = a.a[paramw.ordinal()];
    if (i != 1) {
      if (i != 2 && i != 3) {
        if (i == 4) {
          paramChar = 'n';
        } else {
          throw new UnsupportedOperationException(paramw.name());
        } 
      } else {
        paramChar = 's';
      } 
    } else {
      paramChar = 'w';
    } 
    stringBuilder.append(paramChar);
    stringBuilder.append(paramn.ordinal());
    return stringBuilder.toString();
  }
  
  private static String a(char paramChar, boolean paramBoolean, n paramn) {
    StringBuilder stringBuilder = new StringBuilder(3);
    stringBuilder.append(paramChar);
    if (paramBoolean) {
      paramChar = '+';
    } else {
      paramChar = '-';
    } 
    stringBuilder.append(paramChar);
    stringBuilder.append(paramn.ordinal());
    return stringBuilder.toString();
  }
  
  private static String a(String paramString, char paramChar, int paramInt) {
    int j = paramString.length() - 2;
    for (int i = 0; i < j; i++) {
      if (paramString.charAt(i) == '{') {
        int k = i + 1;
        if (paramString.charAt(k) == paramChar) {
          int m = i + 2;
          if (paramString.charAt(m) == '}') {
            StringBuilder stringBuilder = new StringBuilder(j + 10);
            stringBuilder.append(paramString);
            stringBuilder.replace(k, m, String.valueOf(paramInt));
            return stringBuilder.toString();
          } 
        } 
      } 
    } 
    return paramString;
  }
  
  private String a(Locale paramLocale, char paramChar, w paramw, n paramn) {
    return a(paramLocale, "units/upattern", a(paramChar, paramw, paramn), a(paramChar, paramw, n.h), paramn);
  }
  
  private String a(Locale paramLocale, char paramChar, boolean paramBoolean, n paramn) {
    return a(paramLocale, "reltime/relpattern", a(paramChar, paramBoolean, paramn), a(paramChar, paramBoolean, n.h), paramn);
  }
  
  private String a(Locale paramLocale, String paramString) {
    Iterator<Locale> iterator = e.a(paramLocale).iterator();
    boolean bool = true;
    paramLocale = null;
    while (iterator.hasNext()) {
      e e;
      Locale locale = iterator.next();
      if (bool && paramLocale != null) {
        Locale locale1 = paramLocale;
      } else {
        e = e.a("i18n/reltime/relpattern", locale);
      } 
      boolean bool1 = bool;
      if (bool)
        if (locale.equals(e.b())) {
          bool1 = false;
        } else {
          e e1 = e;
          continue;
        }  
      bool = bool1;
      if (e.a().contains(paramString))
        return e.b(paramString); 
    } 
    return "";
  }
  
  private String a(Locale paramLocale, String paramString1, String paramString2, String paramString3, n paramn) {
    Iterator<Locale> iterator = e.a(paramLocale).iterator();
    boolean bool = true;
    paramLocale = null;
    while (iterator.hasNext()) {
      e e;
      Locale locale = iterator.next();
      if (bool && paramLocale != null) {
        Locale locale1 = paramLocale;
      } else {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("i18n/");
        stringBuilder.append(paramString1);
        e = e.a(stringBuilder.toString(), locale);
      } 
      boolean bool1 = bool;
      if (bool)
        if (locale.equals(e.b())) {
          bool1 = false;
        } else {
          e e1 = e;
          continue;
        }  
      if (e.a().contains(paramString2))
        return e.b(paramString2); 
      bool = bool1;
      if (paramn != n.h) {
        bool = bool1;
        if (e.a().contains(paramString3))
          return e.b(paramString3); 
      } 
    } 
    StringBuilder stringBuilder1 = new StringBuilder();
    stringBuilder1.append("Can't find resource for bundle ");
    stringBuilder1.append(paramString1);
    stringBuilder1.append(".properties, key ");
    stringBuilder1.append(paramString2);
    String str = stringBuilder1.toString();
    StringBuilder stringBuilder2 = new StringBuilder();
    stringBuilder2.append(paramString1);
    stringBuilder2.append(".properties");
    MissingResourceException missingResourceException = new MissingResourceException(str, stringBuilder2.toString(), paramString2);
    throw missingResourceException;
  }
  
  private static String a(w paramw, String paramString) {
    byte b;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append('L');
    int i = a.a[paramw.ordinal()];
    if (i != 1) {
      if (i != 2 && i != 3) {
        if (i == 4) {
          b = 110;
        } else {
          throw new UnsupportedOperationException(paramw.name());
        } 
      } else {
        b = 115;
      } 
    } else {
      b = 119;
    } 
    stringBuilder.append(b);
    stringBuilder.append('-');
    stringBuilder.append(paramString);
    return stringBuilder.toString();
  }
  
  public String a(Locale paramLocale) {
    return a(paramLocale, "reltime/relpattern", "yesterday", null, n.h);
  }
  
  public String a(Locale paramLocale, w paramw, int paramInt) {
    if (paramInt >= 2) {
      e e = e.a("i18n/units/upattern", paramLocale);
      String str3 = a(paramw, String.valueOf(paramInt));
      if (e.a(str3))
        return e.b(str3); 
      str3 = e.b(a(paramw, "end"));
      if (paramInt == 2)
        return str3; 
      String str4 = e.b(a(paramw, "start"));
      String str5 = e.b(a(paramw, "middle"));
      String str1 = a(a(str3, '1', paramInt - 1), '0', paramInt - 2);
      paramInt -= 3;
      String str2 = str1;
      while (paramInt >= 0) {
        if (paramInt == 0) {
          str3 = str4;
        } else {
          str3 = str5;
        } 
        int j = str3.length();
        int i = j - 1;
        while (true) {
          if (i >= 0) {
            if (i >= 2 && str3.charAt(i) == '}' && str3.charAt(i - 1) == '1') {
              int k = i - 2;
              if (str3.charAt(k) == '{') {
                i = k;
                break;
              } 
            } 
            i--;
            continue;
          } 
          i = -1;
          break;
        } 
        if (i > -1) {
          StringBuilder stringBuilder = new StringBuilder();
          stringBuilder.append(str3.substring(0, i));
          stringBuilder.append(str2);
          String str = stringBuilder.toString();
          str1 = str;
          if (i < j - 3) {
            StringBuilder stringBuilder1 = new StringBuilder();
            stringBuilder1.append(str);
            stringBuilder1.append(str3.substring(i + 3));
            str1 = stringBuilder1.toString();
          } 
        } 
        if (paramInt > 0)
          str2 = a(str1, '0', paramInt); 
        paramInt--;
      } 
      return str1;
    } 
    IllegalArgumentException illegalArgumentException = new IllegalArgumentException("Size must be greater than 1.");
    throw illegalArgumentException;
  }
  
  public String a(Locale paramLocale, w paramw, n paramn) {
    return a(paramLocale, 'S', paramw, paramn);
  }
  
  public String a(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'D', paramBoolean, paramn);
  }
  
  public String a(w0 paramw0, Locale paramLocale) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramw0.name().substring(0, 3).toLowerCase());
    stringBuilder.append("+");
    return a(paramLocale, stringBuilder.toString());
  }
  
  public String b(Locale paramLocale) {
    return a(paramLocale, "reltime/relpattern", "now", null, n.h);
  }
  
  public String b(Locale paramLocale, w paramw, n paramn) {
    return a(paramLocale, 'W', paramw, paramn);
  }
  
  public String b(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'h', paramBoolean, paramn);
  }
  
  public String b(w0 paramw0, Locale paramLocale) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(paramw0.name().substring(0, 3).toLowerCase());
    stringBuilder.append("-");
    return a(paramLocale, stringBuilder.toString());
  }
  
  public String c(Locale paramLocale) {
    return a(paramLocale, "reltime/relpattern", "today", null, n.h);
  }
  
  public String c(Locale paramLocale, w paramw, n paramn) {
    return a(paramLocale, 'M', paramw, paramn);
  }
  
  public String c(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'S', paramBoolean, paramn);
  }
  
  public String d(Locale paramLocale) {
    return a(paramLocale, "reltime/relpattern", "tomorrow", null, n.h);
  }
  
  public String d(Locale paramLocale, w paramw, n paramn) {
    return a(paramLocale, '9', paramw, paramn);
  }
  
  public String d(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'W', paramBoolean, paramn);
  }
  
  public String e(Locale paramLocale, w paramw, n paramn) {
    return a(paramLocale, 'N', paramw, paramn);
  }
  
  public String e(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'd', paramBoolean, paramn);
  }
  
  public String f(Locale paramLocale, w paramw, n paramn) {
    return a(paramLocale, 'H', paramw, paramn);
  }
  
  public String f(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'M', paramBoolean, paramn);
  }
  
  public String g(Locale paramLocale, w paramw, n paramn) {
    return a(paramLocale, '3', paramw, paramn);
  }
  
  public String g(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'w', paramBoolean, paramn);
  }
  
  public String h(Locale paramLocale, w paramw, n paramn) {
    return a(paramLocale, '6', paramw, paramn);
  }
  
  public String h(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 's', paramBoolean, paramn);
  }
  
  public String i(Locale paramLocale, w paramw, n paramn) {
    return a(paramLocale, 'Y', paramw, paramn);
  }
  
  public String i(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'Y', paramBoolean, paramn);
  }
  
  public String j(Locale paramLocale, w paramw, n paramn) {
    return a(paramLocale, 'D', paramw, paramn);
  }
  
  public String j(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'N', paramBoolean, paramn);
  }
  
  public String k(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'm', paramBoolean, paramn);
  }
  
  public String l(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'y', paramBoolean, paramn);
  }
  
  public String m(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'H', paramBoolean, paramn);
  }
  
  public String n(Locale paramLocale, boolean paramBoolean, n paramn) {
    return a(paramLocale, 'n', paramBoolean, paramn);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/f1/h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */