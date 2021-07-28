package net.time4j.e1;

import java.text.DecimalFormatSymbols;
import java.util.Locale;

public interface i {
  public static final i a = new a();
  
  char a(Locale paramLocale);
  
  Locale[] a();
  
  String b(Locale paramLocale);
  
  j c(Locale paramLocale);
  
  String d(Locale paramLocale);
  
  char e(Locale paramLocale);
  
  static final class a implements i {
    private DecimalFormatSymbols f(Locale param1Locale) {
      return DecimalFormatSymbols.getInstance(param1Locale);
    }
    
    public char a(Locale param1Locale) {
      return f(param1Locale).getDecimalSeparator();
    }
    
    public Locale[] a() {
      return DecimalFormatSymbols.getAvailableLocales();
    }
    
    public String b(Locale param1Locale) {
      return param1Locale.getLanguage().equals("ar") ? "‏+" : String.valueOf('+');
    }
    
    public j c(Locale param1Locale) {
      return j.c;
    }
    
    public String d(Locale param1Locale) {
      return param1Locale.getLanguage().equals("ar") ? "‏-" : String.valueOf(f(param1Locale).getMinusSign());
    }
    
    public char e(Locale param1Locale) {
      return f(param1Locale).getZeroDigit();
    }
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/e1/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */