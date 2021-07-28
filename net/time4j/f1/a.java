package net.time4j.f1;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import net.time4j.e1.k;
import net.time4j.e1.o;
import net.time4j.e1.p;

public final class a implements o {
  private static final Map<String, p> a = new HashMap<String, p>(140);
  
  private static final p b = new b(0, null);
  
  private static final Map<String, p> c = new HashMap<String, p>(140);
  
  private static final p d = new c(0, null);
  
  static {
    hashMap = new HashMap<Object, Object>();
    b((Map)hashMap, "sv", 1);
    b((Map)hashMap, "fil fr ga hy lo mo ms ro tl vi", 2);
    b((Map)hashMap, "hu", 3);
    b((Map)hashMap, "ne", 4);
    b((Map)hashMap, "kk", 5);
    b((Map)hashMap, "it sc scn", 6);
    b((Map)hashMap, "ka", 7);
    b((Map)hashMap, "sq", 8);
    b((Map)hashMap, "en", 9);
    b((Map)hashMap, "mr", 10);
    b((Map)hashMap, "ca", 11);
    b((Map)hashMap, "mk", 12);
    b((Map)hashMap, "az", 13);
    b((Map)hashMap, "gu hi", 14);
    b((Map)hashMap, "as bn", 15);
    b((Map)hashMap, "cy", 16);
    b((Map)hashMap, "be", 17);
    b((Map)hashMap, "uk", 18);
    b((Map)hashMap, "tk", 19);
    b((Map)hashMap, "or", 20);
    b((Map)hashMap, "gd", 21);
    c.putAll(hashMap);
  }
  
  private static void a(Map<String, p> paramMap, String paramString, int paramInt) {
    String[] arrayOfString = paramString.split(" ");
    int j = arrayOfString.length;
    for (int i = 0; i < j; i++)
      paramMap.put(arrayOfString[i], new b(paramInt, null)); 
  }
  
  private static void b(Map<String, p> paramMap, String paramString, int paramInt) {
    String[] arrayOfString = paramString.split(" ");
    int j = arrayOfString.length;
    for (int i = 0; i < j; i++)
      paramMap.put(arrayOfString[i], new c(paramInt, null)); 
  }
  
  public p a(Locale paramLocale, k paramk) {
    p p1;
    p p2;
    Map<String, p> map;
    int i = a.a[paramk.ordinal()];
    if (i != 1) {
      if (i == 2) {
        map = c;
        p2 = d;
      } else {
        throw new UnsupportedOperationException(paramk.name());
      } 
    } else {
      map = a;
      p2 = b;
    } 
    paramk = null;
    String str = paramLocale.getCountry();
    if (!str.isEmpty()) {
      StringBuilder stringBuilder = new StringBuilder();
      stringBuilder.append(paramLocale.getLanguage());
      stringBuilder.append('_');
      stringBuilder.append(str);
      p1 = map.get(stringBuilder.toString());
    } 
    p p3 = p1;
    if (p1 == null)
      p3 = map.get(paramLocale.getLanguage()); 
    return (p3 == null) ? p2 : p3;
  }
  
  static {
    HashMap<Object, Object> hashMap = new HashMap<Object, Object>();
    a((Map)hashMap, "bm bo dz id ig ii in ja jbo jv jw kde kea km ko lkt", -1);
    a((Map)hashMap, "lo ms my nqo root sah ses sg th to vi wo yo zh", -1);
    a((Map)hashMap, "pt_PT", 0);
    a((Map)hashMap, "am as bn fa gu hi kn mr zu", 1);
    a((Map)hashMap, "ff fr hy kab pt", 1);
    a((Map)hashMap, "si", 1);
    a((Map)hashMap, "ak bh guw ln mg nso pa ti wa", 1);
    a((Map)hashMap, "tzm", 2);
    a((Map)hashMap, "is", 3);
    a((Map)hashMap, "mk", 4);
    a((Map)hashMap, "fil tl", 5);
    a((Map)hashMap, "lv prg", 6);
    a((Map)hashMap, "lag ksh", 7);
    a((Map)hashMap, "iu kw naq se sma smi smj smn sms", 8);
    a((Map)hashMap, "shi", 9);
    a((Map)hashMap, "mo ro", 10);
    a((Map)hashMap, "bs hr sh sr", 11);
    a((Map)hashMap, "gd", 12);
    a((Map)hashMap, "sl", 13);
    a((Map)hashMap, "he iw", 14);
    a((Map)hashMap, "cs sk", 15);
    a((Map)hashMap, "pl", 16);
    a((Map)hashMap, "be", 17);
    a((Map)hashMap, "lt", 18);
    a((Map)hashMap, "mt", 19);
    a((Map)hashMap, "ru uk", 17);
    a((Map)hashMap, "br", 20);
    a((Map)hashMap, "ga", 21);
    a((Map)hashMap, "gv", 22);
    a((Map)hashMap, "ar", 23);
    a((Map)hashMap, "cy", 24);
    a((Map)hashMap, "dsb hsb", 25);
    a.putAll(hashMap);
  }
  
  private static class b extends p {
    private b(int param1Int) {}
  }
  
  private static class c extends p {
    private c(int param1Int) {}
  }
}


/* Location:              /home/yc/Downloads/LeaveHomeSafe.jar!/net/time4j/f1/a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */