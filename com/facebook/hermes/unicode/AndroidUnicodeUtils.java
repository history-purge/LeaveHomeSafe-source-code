package com.facebook.hermes.unicode;

import e.e.n.a.a;
import java.text.Collator;
import java.text.DateFormat;
import java.text.Normalizer;
import java.util.Locale;

@a
public class AndroidUnicodeUtils {
  @a
  public static String convertToCase(String paramString, int paramInt, boolean paramBoolean) {
    Locale locale;
    if (paramBoolean) {
      locale = Locale.getDefault();
    } else {
      locale = Locale.ENGLISH;
    } 
    if (paramInt != 0) {
      if (paramInt == 1)
        return paramString.toLowerCase(locale); 
      throw new RuntimeException("Invalid target case");
    } 
    return paramString.toUpperCase(locale);
  }
  
  @a
  public static String dateFormat(double paramDouble, boolean paramBoolean1, boolean paramBoolean2) {
    DateFormat dateFormat;
    if (paramBoolean1 && paramBoolean2) {
      dateFormat = DateFormat.getDateTimeInstance(2, 2);
    } else if (paramBoolean1) {
      dateFormat = DateFormat.getDateInstance(2);
    } else {
      if (paramBoolean2) {
        dateFormat = DateFormat.getTimeInstance(2);
        return dateFormat.format(Long.valueOf((long)paramDouble)).toString();
      } 
      throw new RuntimeException("Bad dateFormat configuration");
    } 
    return dateFormat.format(Long.valueOf((long)paramDouble)).toString();
  }
  
  @a
  public static int localeCompare(String paramString1, String paramString2) {
    return Collator.getInstance().compare(paramString1, paramString2);
  }
  
  @a
  public static String normalize(String paramString, int paramInt) {
    if (paramInt != 0) {
      if (paramInt != 1) {
        if (paramInt != 2) {
          if (paramInt == 3) {
            Normalizer.Form form3 = Normalizer.Form.NFKD;
            return Normalizer.normalize(paramString, form3);
          } 
          throw new RuntimeException("Invalid form");
        } 
        Normalizer.Form form2 = Normalizer.Form.NFKC;
        return Normalizer.normalize(paramString, form2);
      } 
      Normalizer.Form form1 = Normalizer.Form.NFD;
      return Normalizer.normalize(paramString, form1);
    } 
    Normalizer.Form form = Normalizer.Form.NFC;
    return Normalizer.normalize(paramString, form);
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/com/facebook/hermes/unicode/AndroidUnicodeUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */