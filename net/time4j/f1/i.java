package net.time4j.f1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import net.time4j.c1.d;
import net.time4j.e1.z;
import net.time4j.w0;

public class i implements z {
  private final String a;
  
  private final Set<String> b;
  
  private final Map<String, w0> c;
  
  private final Map<String, w0> d;
  
  private final Map<String, w0> e;
  
  public i() {
    URI uRI = d.c().a("i18n", i.class, "data/week.data");
    InputStream inputStream1 = d.c().a(uRI, true);
    InputStream inputStream2 = inputStream1;
    if (inputStream1 == null)
      try {
        inputStream2 = d.c().a(i.class, "data/week.data", true);
      } catch (IOException iOException) {
        inputStream2 = inputStream1;
      }  
    if (inputStream2 != null) {
      StringBuilder stringBuilder1 = new StringBuilder();
      stringBuilder1.append("@");
      stringBuilder1.append(uRI);
      this.a = stringBuilder1.toString();
      HashSet<String> hashSet = new HashSet();
      HashMap<Object, Object> hashMap1 = new HashMap<Object, Object>();
      HashMap<Object, Object> hashMap2 = new HashMap<Object, Object>();
      HashMap<Object, Object> hashMap3 = new HashMap<Object, Object>();
      try {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream2, "US-ASCII"));
        while (true) {
          String str = bufferedReader.readLine();
          if (str != null) {
            w0 w0;
            HashMap<Object, Object> hashMap;
            String str2;
            if (str.startsWith("#"))
              continue; 
            int m = str.indexOf('=');
            int k = 0;
            int j = 0;
            String str1 = str.substring(0, m).trim();
            String[] arrayOfString = str.substring(m + 1).split(" ");
            if (str1.equals("minDays-4")) {
              k = arrayOfString.length;
              while (j < k) {
                str1 = arrayOfString[j].trim().toUpperCase(Locale.US);
                if (!str1.isEmpty())
                  hashSet.add(str1); 
                j++;
              } 
              continue;
            } 
            if (str1.startsWith("start-")) {
              str2 = str1.substring(6);
              w0 = w0.h;
              hashMap = hashMap2;
            } else if (w0.startsWith("end-")) {
              str2 = w0.substring(4);
              w0 = w0.i;
              hashMap = hashMap3;
            } else if (w0.startsWith("first-")) {
              str2 = w0.substring(6);
              w0 = w0.c;
              hashMap = hashMap1;
            } else {
              StringBuilder stringBuilder2 = new StringBuilder();
              stringBuilder2.append("Unexpected format: ");
              stringBuilder2.append(this.a);
              throw new IllegalStateException(stringBuilder2.toString());
            } 
            if (str2.equals("sun")) {
              w0 = w0.i;
            } else if (str2.equals("sat")) {
              w0 = w0.h;
            } else if (str2.equals("fri")) {
              w0 = w0.g;
            } else if (str2.equals("thu")) {
              w0 = w0.f;
            } else if (str2.equals("wed")) {
              w0 = w0.e;
            } else if (str2.equals("tue")) {
              w0 = w0.d;
            } else if (str2.equals("mon")) {
              w0 = w0.c;
            } 
            m = arrayOfString.length;
            for (j = k; j < m; j++) {
              str2 = arrayOfString[j].trim().toUpperCase(Locale.US);
              if (!str2.isEmpty())
                hashMap.put(str2, w0); 
            } 
            continue;
          } 
          this.b = Collections.unmodifiableSet(hashSet);
          this.c = Collections.unmodifiableMap(hashMap1);
          this.d = Collections.unmodifiableMap(hashMap2);
          this.e = Collections.unmodifiableMap(hashMap3);
          try {
            inputStream2.close();
            return;
          } catch (IOException iOException) {
            iOException.printStackTrace(System.err);
            return;
          } 
        } 
      } catch (UnsupportedEncodingException unsupportedEncodingException) {
        throw new AssertionError(unsupportedEncodingException);
      } catch (Exception exception) {
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append("Unexpected format: ");
        stringBuilder2.append(this.a);
        throw new IllegalStateException(stringBuilder2.toString(), exception);
      } finally {}
      try {
        inputStream2.close();
      } catch (IOException iOException) {
        iOException.printStackTrace(System.err);
      } 
      throw stringBuilder1;
    } 
    this.a = "@STATIC";
    this.b = Collections.emptySet();
    this.c = Collections.emptyMap();
    this.d = Collections.emptyMap();
    this.e = Collections.emptyMap();
    PrintStream printStream = System.err;
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append("Warning: File \"");
    stringBuilder.append("data/week.data");
    stringBuilder.append("\" not found.");
    printStream.println(stringBuilder.toString());
  }
  
  public int a(Locale paramLocale) {
    String str = paramLocale.getCountry();
    w0 w0 = w0.i;
    if (this.e.containsKey(str))
      w0 = this.e.get(str); 
    return w0.a();
  }
  
  public int b(Locale paramLocale) {
    String str = paramLocale.getCountry();
    w0 w0 = w0.h;
    if (this.d.containsKey(str))
      w0 = this.d.get(str); 
    return w0.a();
  }
  
  public int c(Locale paramLocale) {
    if (this.b.isEmpty())
      return (new GregorianCalendar(paramLocale)).getMinimalDaysInFirstWeek(); 
    String str = paramLocale.getCountry();
    return (str.isEmpty() && paramLocale.getLanguage().isEmpty()) ? 4 : (this.b.contains(str) ? 4 : 1);
  }
  
  public int d(Locale paramLocale) {
    if (this.c.isEmpty()) {
      int j = (new GregorianCalendar(paramLocale)).getFirstDayOfWeek();
      return (j == 1) ? 7 : (j - 1);
    } 
    String str = paramLocale.getCountry();
    w0 w0 = w0.c;
    if (this.c.containsKey(str))
      w0 = this.c.get(str); 
    return w0.a();
  }
  
  public String toString() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(i.class.getName());
    stringBuilder.append(this.a);
    return stringBuilder.toString();
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/f1/i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */