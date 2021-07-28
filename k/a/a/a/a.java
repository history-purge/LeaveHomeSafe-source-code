package k.a.a.a;

import java.util.Locale;
import java.util.concurrent.ConcurrentHashMap;

public class a {
  static {
    new ConcurrentHashMap<Object, Object>();
    new ConcurrentHashMap<Object, Object>();
  }
  
  private static boolean a(String paramString) {
    return (b.b(paramString) && paramString.length() == 2);
  }
  
  private static boolean b(String paramString) {
    return (b.a(paramString) && (paramString.length() == 2 || paramString.length() == 3));
  }
  
  private static boolean c(String paramString) {
    return (b.d(paramString) && paramString.length() == 3);
  }
  
  private static Locale d(String paramString) {
    if (b(paramString))
      return new Locale(paramString); 
    String[] arrayOfString = paramString.split("_", -1);
    String str = arrayOfString[0];
    if (arrayOfString.length == 2) {
      String str1 = arrayOfString[1];
      if ((b(str) && a(str1)) || c(str1))
        return new Locale(str, str1); 
    } else if (arrayOfString.length == 3) {
      String str1 = arrayOfString[1];
      String str2 = arrayOfString[2];
      if (b(str) && (str1.length() == 0 || a(str1) || c(str1)) && str2.length() > 0)
        return new Locale(str, str1, str2); 
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid locale format: ");
    stringBuilder.append(paramString);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
  
  public static Locale e(String paramString) {
    if (paramString == null)
      return null; 
    if (paramString.isEmpty())
      return new Locale("", ""); 
    if (!paramString.contains("#")) {
      int i = paramString.length();
      if (i >= 2) {
        if (paramString.charAt(0) == '_') {
          if (i >= 3) {
            char c1 = paramString.charAt(1);
            char c2 = paramString.charAt(2);
            if (Character.isUpperCase(c1) && Character.isUpperCase(c2)) {
              if (i == 3)
                return new Locale("", paramString.substring(1, 3)); 
              if (i >= 5) {
                if (paramString.charAt(3) == '_')
                  return new Locale("", paramString.substring(1, 3), paramString.substring(4)); 
                StringBuilder stringBuilder5 = new StringBuilder();
                stringBuilder5.append("Invalid locale format: ");
                stringBuilder5.append(paramString);
                throw new IllegalArgumentException(stringBuilder5.toString());
              } 
              StringBuilder stringBuilder4 = new StringBuilder();
              stringBuilder4.append("Invalid locale format: ");
              stringBuilder4.append(paramString);
              throw new IllegalArgumentException(stringBuilder4.toString());
            } 
            StringBuilder stringBuilder3 = new StringBuilder();
            stringBuilder3.append("Invalid locale format: ");
            stringBuilder3.append(paramString);
            throw new IllegalArgumentException(stringBuilder3.toString());
          } 
          StringBuilder stringBuilder2 = new StringBuilder();
          stringBuilder2.append("Invalid locale format: ");
          stringBuilder2.append(paramString);
          throw new IllegalArgumentException(stringBuilder2.toString());
        } 
        return d(paramString);
      } 
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("Invalid locale format: ");
      stringBuilder1.append(paramString);
      throw new IllegalArgumentException(stringBuilder1.toString());
    } 
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Invalid locale format: ");
    stringBuilder.append(paramString);
    throw new IllegalArgumentException(stringBuilder.toString());
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/k/a/a/a/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */